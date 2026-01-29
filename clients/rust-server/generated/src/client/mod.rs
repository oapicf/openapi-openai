use async_trait::async_trait;
use bytes::Bytes;
use futures::{Stream, future, future::BoxFuture, stream, future::TryFutureExt, future::FutureExt, stream::StreamExt};
use http_body_util::{combinators::BoxBody, Full};
use hyper::header::{HeaderName, HeaderValue, CONTENT_TYPE};
use hyper::{body::{Body, Incoming}, Request, Response, service::Service, Uri};
use percent_encoding::{utf8_percent_encode, AsciiSet};
use std::borrow::Cow;
use std::convert::{TryInto, Infallible};
use std::io::{ErrorKind, Read};
use std::error::Error;
use std::future::Future;
use std::fmt;
use std::marker::PhantomData;
use std::path::Path;
use std::sync::{Arc, Mutex};
use std::str;
use std::str::FromStr;
use std::string::ToString;
use std::task::{Context, Poll};
use swagger::{ApiError, AuthData, BodyExt, Connector, DropContextService, Has, XSpanIdString};
use url::form_urlencoded;
use tower_service::Service as _;

use mime::Mime;
use std::io::Cursor;
use multipart::client::lazy::Multipart;

use crate::models;
use crate::header;

/// https://url.spec.whatwg.org/#fragment-percent-encode-set
#[allow(dead_code)]
const FRAGMENT_ENCODE_SET: &AsciiSet = &percent_encoding::CONTROLS
    .add(b' ').add(b'"').add(b'<').add(b'>').add(b'`');

/// This encode set is used for object IDs
///
/// Aside from the special characters defined in the `PATH_SEGMENT_ENCODE_SET`,
/// the vertical bar (|) is encoded.
#[allow(dead_code)]
const ID_ENCODE_SET: &AsciiSet = &FRAGMENT_ENCODE_SET.add(b'|');

use crate::{Api,
     CreateAssistantResponse,
     CreateThreadResponse,
     CreateThreadAndRunResponse,
     ListAssistantsResponse,
     CreateAssistantFileResponse,
     CreateMessageResponse,
     CreateRunResponse,
     DeleteAssistantResponse,
     DeleteThreadResponse,
     GetAssistantResponse,
     GetThreadResponse,
     ListAssistantFilesResponse,
     ListMessagesResponse,
     ListRunsResponse,
     ModifyAssistantResponse,
     ModifyThreadResponse,
     CancelRunResponse,
     DeleteAssistantFileResponse,
     GetAssistantFileResponse,
     GetMessageResponse,
     GetRunResponse,
     ListMessageFilesResponse,
     ListRunStepsResponse,
     ModifyMessageResponse,
     ModifyRunResponse,
     SubmitToolOuputsToRunResponse,
     GetMessageFileResponse,
     GetRunStepResponse,
     CreateSpeechResponse,
     CreateTranscriptionResponse,
     CreateTranslationResponse,
     CreateChatCompletionResponse,
     CreateCompletionResponse,
     CreateEmbeddingResponse,
     CreateFileResponse,
     ListFilesResponse,
     DeleteFileResponse,
     DownloadFileResponse,
     RetrieveFileResponse,
     CreateFineTuningJobResponse,
     ListPaginatedFineTuningJobsResponse,
     CancelFineTuningJobResponse,
     ListFineTuningEventsResponse,
     ListFineTuningJobCheckpointsResponse,
     RetrieveFineTuningJobResponse,
     CreateImageResponse,
     CreateImageEditResponse,
     CreateImageVariationResponse,
     ListModelsResponse,
     DeleteModelResponse,
     RetrieveModelResponse,
     CreateModerationResponse
     };

/// Convert input into a base path, e.g. "http://example:123". Also checks the scheme as it goes.
fn into_base_path(input: impl TryInto<Uri, Error=hyper::http::uri::InvalidUri>, correct_scheme: Option<&'static str>) -> Result<String, ClientInitError> {
    // First convert to Uri, since a base path is a subset of Uri.
    let uri = input.try_into()?;

    let scheme = uri.scheme_str().ok_or(ClientInitError::InvalidScheme)?;

    // Check the scheme if necessary
    if let Some(correct_scheme) = correct_scheme {
        if scheme != correct_scheme {
            return Err(ClientInitError::InvalidScheme);
        }
    }

    let host = uri.host().ok_or(ClientInitError::MissingHost)?;
    let port = uri.port_u16().map(|x| format!(":{x}")).unwrap_or_default();
    Ok(format!("{scheme}://{host}{port}{}", uri.path().trim_end_matches('/')))
}

/// A client that implements the API by making HTTP calls out to a server.
pub struct Client<S, C> where
    S: Service<
           (Request<BoxBody<Bytes, Infallible>>, C)> + Clone + Sync + Send + 'static,
    S::Future: Send + 'static,
    S::Error: Into<crate::ServiceError> + fmt::Display,
    C: Clone + Send + Sync + 'static
{
    /// Inner service
    client_service: S,

    /// Base path of the API
    base_path: String,

    /// Marker
    marker: PhantomData<fn(C)>,
}

impl<S, C> fmt::Debug for Client<S, C> where
    S: Service<
           (Request<BoxBody<Bytes, Infallible>>, C)> + Clone + Sync + Send + 'static,
    S::Future: Send + 'static,
    S::Error: Into<crate::ServiceError> + fmt::Display,
    C: Clone + Send + Sync + 'static
{
    fn fmt(&self, f: &mut fmt::Formatter<'_>) -> fmt::Result {
        write!(f, "Client {{ base_path: {} }}", self.base_path)
    }
}

impl<S, C> Clone for Client<S, C> where
    S: Service<
           (Request<BoxBody<Bytes, Infallible>>, C)> + Clone + Sync + Send + 'static,
    S::Future: Send + 'static,
    S::Error: Into<crate::ServiceError> + fmt::Display,
    C: Clone + Send + Sync + 'static
{
    fn clone(&self) -> Self {
        Self {
            client_service: self.client_service.clone(),
            base_path: self.base_path.clone(),
            marker: PhantomData,
        }
    }
}

impl<Connector, C> Client<
    DropContextService<
        hyper_util::service::TowerToHyperService<
            hyper_util::client::legacy::Client<
                Connector,
                BoxBody<Bytes, Infallible>
            >
        >,
        C
    >,
    C
> where
    Connector: hyper_util::client::legacy::connect::Connect + Clone + Send + Sync + 'static,
    C: Clone + Send + Sync + 'static,
{
    /// Create a client with a custom implementation of hyper::client::Connect.
    ///
    /// Intended for use with custom implementations of connect for e.g. protocol logging
    /// or similar functionality which requires wrapping the transport layer. When wrapping a TCP connection,
    /// this function should be used in conjunction with `swagger::Connector::builder()`.
    ///
    /// For ordinary tcp connections, prefer the use of `try_new_http`, `try_new_https`
    /// and `try_new_https_mutual`, to avoid introducing a dependency on the underlying transport layer.
    ///
    /// # Arguments
    ///
    /// * `base_path` - base path of the client API, i.e. "<http://www.my-api-implementation.com>"
    /// * `protocol` - Which protocol to use when constructing the request url, e.g. `Some("http")`
    /// * `connector` - Implementation of `hyper::client::Connect` to use for the client
    pub fn try_new_with_connector(
        base_path: &str,
        protocol: Option<&'static str>,
        connector: Connector,
    ) -> Result<Self, ClientInitError>
    {
        let client_service = hyper_util::client::legacy::Client::builder(hyper_util::rt::TokioExecutor::new()).build(connector);
        let client_service = DropContextService::new(hyper_util::service::TowerToHyperService::new(client_service));

        Ok(Self {
            client_service,
            base_path: into_base_path(base_path, protocol)?,
            marker: PhantomData,
        })
    }
}

#[derive(Debug, Clone)]
pub enum HyperClient {
    Http(hyper_util::client::legacy::Client<hyper_util::client::legacy::connect::HttpConnector, BoxBody<Bytes, Infallible>>),
    Https(hyper_util::client::legacy::Client<HttpsConnector, BoxBody<Bytes, Infallible>>),
}

impl Service<Request<BoxBody<Bytes, Infallible>>> for HyperClient {
    type Response = Response<Incoming>;
    type Error = hyper_util::client::legacy::Error;
    type Future = hyper_util::client::legacy::ResponseFuture;

    fn call(&self, req: Request<BoxBody<Bytes, Infallible>>) -> Self::Future {
       match self {
          HyperClient::Http(client) => client.request(req),
          HyperClient::Https(client) => client.request(req)
       }
    }
}

impl<C> Client<DropContextService<HyperClient, C>, C> where
    C: Clone + Send + Sync + 'static,
{
    /// Create an HTTP client.
    ///
    /// # Arguments
    /// * `base_path` - base path of the client API, i.e. "<http://www.my-api-implementation.com>"
    pub fn try_new(
        base_path: &str,
    ) -> Result<Self, ClientInitError> {
        let uri = Uri::from_str(base_path)?;

        let scheme = uri.scheme_str().ok_or(ClientInitError::InvalidScheme)?;
        let scheme = scheme.to_ascii_lowercase();

        let connector = Connector::builder();

        let client_service = match scheme.as_str() {
            "http" => {
                HyperClient::Http(hyper_util::client::legacy::Client::builder(hyper_util::rt::TokioExecutor::new()).build(connector.build()))
            },
            "https" => {
                let connector = connector.https()
                   .build()
                   .map_err(ClientInitError::SslError)?;
                HyperClient::Https(hyper_util::client::legacy::Client::builder(hyper_util::rt::TokioExecutor::new()).build(connector))
            },
            _ => {
                return Err(ClientInitError::InvalidScheme);
            }
        };

        let client_service = DropContextService::new(client_service);

        Ok(Self {
            client_service,
            base_path: into_base_path(base_path, None)?,
            marker: PhantomData,
        })
    }
}

impl<C> Client<
    DropContextService<
        hyper_util::service::TowerToHyperService<
            hyper_util::client::legacy::Client<
                hyper_util::client::legacy::connect::HttpConnector,
                BoxBody<Bytes, Infallible>
            >
        >,
        C
    >,
    C
> where
    C: Clone + Send + Sync + 'static
{
    /// Create an HTTP client.
    ///
    /// # Arguments
    /// * `base_path` - base path of the client API, i.e. "<http://www.my-api-implementation.com>"
    pub fn try_new_http(
        base_path: &str,
    ) -> Result<Self, ClientInitError> {
        let http_connector = Connector::builder().build();

        Self::try_new_with_connector(base_path, Some("http"), http_connector)
    }
}

#[cfg(any(target_os = "macos", target_os = "windows", target_os = "ios"))]
type HttpsConnector = hyper_tls::HttpsConnector<hyper_util::client::legacy::connect::HttpConnector>;

#[cfg(not(any(target_os = "macos", target_os = "windows", target_os = "ios")))]
type HttpsConnector = hyper_openssl::client::legacy::HttpsConnector<hyper_util::client::legacy::connect::HttpConnector>;

impl<C> Client<
    DropContextService<
        hyper_util::service::TowerToHyperService<
            hyper_util::client::legacy::Client<
                HttpsConnector,
                BoxBody<Bytes, Infallible>
            >
        >,
        C
    >,
    C
> where
    C: Clone + Send + Sync + 'static
{
    /// Create a client with a TLS connection to the server
    ///
    /// # Arguments
    /// * `base_path` - base path of the client API, i.e. "<http://www.my-api-implementation.com>"
    pub fn try_new_https(base_path: &str) -> Result<Self, ClientInitError>
    {
        let https_connector = Connector::builder()
            .https()
            .build()
            .map_err(ClientInitError::SslError)?;
        Self::try_new_with_connector(base_path, Some("https"), https_connector)
    }

    /// Create a client with a TLS connection to the server using a pinned certificate
    ///
    /// # Arguments
    /// * `base_path` - base path of the client API, i.e. "<http://www.my-api-implementation.com>"
    /// * `ca_certificate` - Path to CA certificate used to authenticate the server
    #[cfg(not(any(target_os = "macos", target_os = "windows", target_os = "ios")))]
    pub fn try_new_https_pinned<CA>(
        base_path: &str,
        ca_certificate: CA,
    ) -> Result<Self, ClientInitError>
    where
        CA: AsRef<Path>,
    {
        let https_connector = Connector::builder()
            .https()
            .pin_server_certificate(ca_certificate)
            .build()
            .map_err(ClientInitError::SslError)?;
        Self::try_new_with_connector(base_path, Some("https"), https_connector)
    }

    /// Create a client with a mutually authenticated TLS connection to the server.
    ///
    /// # Arguments
    /// * `base_path` - base path of the client API, i.e. "<http://www.my-api-implementation.com>"
    /// * `ca_certificate` - Path to CA certificate used to authenticate the server
    /// * `client_key` - Path to the client private key
    /// * `client_certificate` - Path to the client's public certificate associated with the private key
    #[cfg(not(any(target_os = "macos", target_os = "windows", target_os = "ios")))]
    pub fn try_new_https_mutual<CA, K, D>(
        base_path: &str,
        ca_certificate: CA,
        client_key: K,
        client_certificate: D,
    ) -> Result<Self, ClientInitError>
    where
        CA: AsRef<Path>,
        K: AsRef<Path>,
        D: AsRef<Path>,
    {
        let https_connector = Connector::builder()
            .https()
            .pin_server_certificate(ca_certificate)
            .client_authentication(client_key, client_certificate)
            .build()
            .map_err(ClientInitError::SslError)?;
        Self::try_new_with_connector(base_path, Some("https"), https_connector)
    }
}

impl<S, C> Client<S, C> where
    S: Service<
           (Request<BoxBody<Bytes, Infallible>>, C)> + Clone + Sync + Send + 'static,
    S::Future: Send + 'static,
    S::Error: Into<crate::ServiceError> + fmt::Display,
    C: Clone + Send + Sync + 'static
{
    /// Constructor for creating a `Client` by passing in a pre-made `hyper::service::Service` /
    /// `tower::Service`
    ///
    /// This allows adding custom wrappers around the underlying transport, for example for logging.
    pub fn try_new_with_client_service(
        client_service: S,
        base_path: &str,
    ) -> Result<Self, ClientInitError>
    {
        Ok(Self {
            client_service,
            base_path: into_base_path(base_path, None)?,
            marker: PhantomData,
        })
    }
}

/// Error type failing to create a Client
#[derive(Debug)]
pub enum ClientInitError {
    /// Invalid URL Scheme
    InvalidScheme,

    /// Invalid URI
    InvalidUri(hyper::http::uri::InvalidUri),

    /// Missing Hostname
    MissingHost,

    /// SSL Connection Error
    #[cfg(any(target_os = "macos", target_os = "windows", target_os = "ios"))]
    SslError(native_tls::Error),

    /// SSL Connection Error
    #[cfg(not(any(target_os = "macos", target_os = "windows", target_os = "ios")))]
    SslError(openssl::error::ErrorStack),
}

impl From<hyper::http::uri::InvalidUri> for ClientInitError {
    fn from(err: hyper::http::uri::InvalidUri) -> ClientInitError {
        ClientInitError::InvalidUri(err)
    }
}

impl fmt::Display for ClientInitError {
    fn fmt(&self, f: &mut fmt::Formatter<'_>) -> fmt::Result {
        let s: &dyn fmt::Debug = self;
        s.fmt(f)
    }
}

impl Error for ClientInitError {
    fn description(&self) -> &str {
        "Failed to produce a hyper client."
    }
}

#[allow(dead_code)]
fn body_from_string(s: String) -> BoxBody<Bytes, Infallible> {
    BoxBody::new(Full::new(Bytes::from(s)))
}

#[async_trait]
impl<S, C, B> Api<C> for Client<S, C> where
    S: Service<
       (Request<BoxBody<Bytes, Infallible>>, C),
       Response=Response<B>> + Clone + Sync + Send + 'static,
    S::Future: Send + 'static,
    S::Error: Into<crate::ServiceError> + fmt::Display,
    C: Has<XSpanIdString> + Has<Option<AuthData>> + Clone + Send + Sync + 'static,
    B: hyper::body::Body + Send + 'static + Unpin,
    B::Data: Send,
    B::Error: Into<Box<dyn Error + Send + Sync>>,
{

    #[allow(clippy::vec_init_then_push)]
    async fn create_assistant(
        &self,
        param_create_assistant_request: models::CreateAssistantRequest,
        context: &C) -> Result<CreateAssistantResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        #[allow(clippy::uninlined_format_args)]
        let mut uri = format!(
            "{}/v1/assistants",
            self.base_path
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {err}"))),
        };

        let mut request = match Request::builder()
            .method("POST")
            .uri(uri)
            .body(BoxBody::new(http_body_util::Empty::new())) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {e}")))
        };

        // Consumes basic body
        // Body parameter
        let body = serde_json::to_string(&param_create_assistant_request).expect("impossible to fail to serialize");
        *request.body_mut() = body_from_string(body);

        let header = "application/json";
        request.headers_mut().insert(CONTENT_TYPE, HeaderValue::from_static(header));

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {e}")))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            use headers::authorization::Credentials;
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(ref bearer_header) => {
                    let header = match headers::Authorization::bearer(&bearer_header.to_string()) {
                        Ok(h) => h,
                        Err(e) => return Err(ApiError(format!("Unable to create Authorization header: {e}")))
                    };
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        header.0.encode());
                },
                _ => {}
            }
        }

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {e}"))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = http_body_util::BodyExt::collect(body)
                        .await
                        .map(|f| f.to_bytes().to_vec())
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e.into())))?;

                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {e}")))?;
                let body = serde_json::from_str::<models::AssistantObject>(body)
                    .map_err(|e| ApiError(format!("Response body did not match the schema: {e}")))?;


                Ok(CreateAssistantResponse::OK
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = http_body_util::BodyExt::collect(response.into_body())
                        .await
                        .map(|f| f.to_bytes().to_vec());
                Err(ApiError(format!("Unexpected response code {code}:\n{headers:?}\n\n{}",
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {e:?}>"),
                        },
                        Err(e) => format!("<Failed to read body: {}>", Into::<crate::ServiceError>::into(e)),
                    }
                )))
            }
        }
    }

    #[allow(clippy::vec_init_then_push)]
    async fn create_thread(
        &self,
        param_create_thread_request: Option<models::CreateThreadRequest>,
        context: &C) -> Result<CreateThreadResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        #[allow(clippy::uninlined_format_args)]
        let mut uri = format!(
            "{}/v1/threads",
            self.base_path
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {err}"))),
        };

        let mut request = match Request::builder()
            .method("POST")
            .uri(uri)
            .body(BoxBody::new(http_body_util::Empty::new())) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {e}")))
        };

        // Consumes basic body
        // Body parameter
        if let Some(param_create_thread_request) = param_create_thread_request {
        let body = serde_json::to_string(&param_create_thread_request).expect("impossible to fail to serialize");
        *request.body_mut() = body_from_string(body);
        }

        let header = "application/json";
        request.headers_mut().insert(CONTENT_TYPE, HeaderValue::from_static(header));

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {e}")))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            use headers::authorization::Credentials;
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(ref bearer_header) => {
                    let header = match headers::Authorization::bearer(&bearer_header.to_string()) {
                        Ok(h) => h,
                        Err(e) => return Err(ApiError(format!("Unable to create Authorization header: {e}")))
                    };
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        header.0.encode());
                },
                _ => {}
            }
        }

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {e}"))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = http_body_util::BodyExt::collect(body)
                        .await
                        .map(|f| f.to_bytes().to_vec())
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e.into())))?;

                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {e}")))?;
                let body = serde_json::from_str::<models::ThreadObject>(body)
                    .map_err(|e| ApiError(format!("Response body did not match the schema: {e}")))?;


                Ok(CreateThreadResponse::OK
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = http_body_util::BodyExt::collect(response.into_body())
                        .await
                        .map(|f| f.to_bytes().to_vec());
                Err(ApiError(format!("Unexpected response code {code}:\n{headers:?}\n\n{}",
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {e:?}>"),
                        },
                        Err(e) => format!("<Failed to read body: {}>", Into::<crate::ServiceError>::into(e)),
                    }
                )))
            }
        }
    }

    #[allow(clippy::vec_init_then_push)]
    async fn create_thread_and_run(
        &self,
        param_create_thread_and_run_request: models::CreateThreadAndRunRequest,
        context: &C) -> Result<CreateThreadAndRunResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        #[allow(clippy::uninlined_format_args)]
        let mut uri = format!(
            "{}/v1/threads/runs",
            self.base_path
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {err}"))),
        };

        let mut request = match Request::builder()
            .method("POST")
            .uri(uri)
            .body(BoxBody::new(http_body_util::Empty::new())) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {e}")))
        };

        // Consumes basic body
        // Body parameter
        let body = serde_json::to_string(&param_create_thread_and_run_request).expect("impossible to fail to serialize");
        *request.body_mut() = body_from_string(body);

        let header = "application/json";
        request.headers_mut().insert(CONTENT_TYPE, HeaderValue::from_static(header));

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {e}")))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            use headers::authorization::Credentials;
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(ref bearer_header) => {
                    let header = match headers::Authorization::bearer(&bearer_header.to_string()) {
                        Ok(h) => h,
                        Err(e) => return Err(ApiError(format!("Unable to create Authorization header: {e}")))
                    };
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        header.0.encode());
                },
                _ => {}
            }
        }

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {e}"))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = http_body_util::BodyExt::collect(body)
                        .await
                        .map(|f| f.to_bytes().to_vec())
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e.into())))?;

                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {e}")))?;
                let body = serde_json::from_str::<models::RunObject>(body)
                    .map_err(|e| ApiError(format!("Response body did not match the schema: {e}")))?;


                Ok(CreateThreadAndRunResponse::OK
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = http_body_util::BodyExt::collect(response.into_body())
                        .await
                        .map(|f| f.to_bytes().to_vec());
                Err(ApiError(format!("Unexpected response code {code}:\n{headers:?}\n\n{}",
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {e:?}>"),
                        },
                        Err(e) => format!("<Failed to read body: {}>", Into::<crate::ServiceError>::into(e)),
                    }
                )))
            }
        }
    }

    #[allow(clippy::vec_init_then_push)]
    async fn list_assistants(
        &self,
        param_limit: Option<i32>,
        param_order: Option<models::ListAssistantsOrderParameter>,
        param_after: Option<String>,
        param_before: Option<String>,
        context: &C) -> Result<ListAssistantsResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        #[allow(clippy::uninlined_format_args)]
        let mut uri = format!(
            "{}/v1/assistants",
            self.base_path
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            if let Some(param_limit) = param_limit {
                query_string.append_pair("limit",
                    &param_limit.to_string());
            }
            if let Some(param_order) = param_order {
                query_string.append_pair("order",
                    &param_order.to_string());
            }
            if let Some(param_after) = param_after {
                query_string.append_pair("after",
                    &param_after);
            }
            if let Some(param_before) = param_before {
                query_string.append_pair("before",
                    &param_before);
            }
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {err}"))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(BoxBody::new(http_body_util::Empty::new())) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {e}")))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {e}")))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            use headers::authorization::Credentials;
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(ref bearer_header) => {
                    let header = match headers::Authorization::bearer(&bearer_header.to_string()) {
                        Ok(h) => h,
                        Err(e) => return Err(ApiError(format!("Unable to create Authorization header: {e}")))
                    };
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        header.0.encode());
                },
                _ => {}
            }
        }

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {e}"))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = http_body_util::BodyExt::collect(body)
                        .await
                        .map(|f| f.to_bytes().to_vec())
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e.into())))?;

                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {e}")))?;
                let body = serde_json::from_str::<models::ListAssistantsResponse>(body)
                    .map_err(|e| ApiError(format!("Response body did not match the schema: {e}")))?;


                Ok(ListAssistantsResponse::OK
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = http_body_util::BodyExt::collect(response.into_body())
                        .await
                        .map(|f| f.to_bytes().to_vec());
                Err(ApiError(format!("Unexpected response code {code}:\n{headers:?}\n\n{}",
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {e:?}>"),
                        },
                        Err(e) => format!("<Failed to read body: {}>", Into::<crate::ServiceError>::into(e)),
                    }
                )))
            }
        }
    }

    #[allow(clippy::vec_init_then_push)]
    async fn create_assistant_file(
        &self,
        param_assistant_id: String,
        param_create_assistant_file_request: models::CreateAssistantFileRequest,
        context: &C) -> Result<CreateAssistantFileResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        #[allow(clippy::uninlined_format_args)]
        let mut uri = format!(
            "{}/v1/assistants/{assistant_id}/files",
            self.base_path
            ,assistant_id=utf8_percent_encode(&param_assistant_id.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {err}"))),
        };

        let mut request = match Request::builder()
            .method("POST")
            .uri(uri)
            .body(BoxBody::new(http_body_util::Empty::new())) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {e}")))
        };

        // Consumes basic body
        // Body parameter
        let body = serde_json::to_string(&param_create_assistant_file_request).expect("impossible to fail to serialize");
        *request.body_mut() = body_from_string(body);

        let header = "application/json";
        request.headers_mut().insert(CONTENT_TYPE, HeaderValue::from_static(header));

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {e}")))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            use headers::authorization::Credentials;
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(ref bearer_header) => {
                    let header = match headers::Authorization::bearer(&bearer_header.to_string()) {
                        Ok(h) => h,
                        Err(e) => return Err(ApiError(format!("Unable to create Authorization header: {e}")))
                    };
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        header.0.encode());
                },
                _ => {}
            }
        }

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {e}"))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = http_body_util::BodyExt::collect(body)
                        .await
                        .map(|f| f.to_bytes().to_vec())
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e.into())))?;

                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {e}")))?;
                let body = serde_json::from_str::<models::AssistantFileObject>(body)
                    .map_err(|e| ApiError(format!("Response body did not match the schema: {e}")))?;


                Ok(CreateAssistantFileResponse::OK
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = http_body_util::BodyExt::collect(response.into_body())
                        .await
                        .map(|f| f.to_bytes().to_vec());
                Err(ApiError(format!("Unexpected response code {code}:\n{headers:?}\n\n{}",
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {e:?}>"),
                        },
                        Err(e) => format!("<Failed to read body: {}>", Into::<crate::ServiceError>::into(e)),
                    }
                )))
            }
        }
    }

    #[allow(clippy::vec_init_then_push)]
    async fn create_message(
        &self,
        param_thread_id: String,
        param_create_message_request: models::CreateMessageRequest,
        context: &C) -> Result<CreateMessageResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        #[allow(clippy::uninlined_format_args)]
        let mut uri = format!(
            "{}/v1/threads/{thread_id}/messages",
            self.base_path
            ,thread_id=utf8_percent_encode(&param_thread_id.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {err}"))),
        };

        let mut request = match Request::builder()
            .method("POST")
            .uri(uri)
            .body(BoxBody::new(http_body_util::Empty::new())) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {e}")))
        };

        // Consumes basic body
        // Body parameter
        let body = serde_json::to_string(&param_create_message_request).expect("impossible to fail to serialize");
        *request.body_mut() = body_from_string(body);

        let header = "application/json";
        request.headers_mut().insert(CONTENT_TYPE, HeaderValue::from_static(header));

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {e}")))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            use headers::authorization::Credentials;
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(ref bearer_header) => {
                    let header = match headers::Authorization::bearer(&bearer_header.to_string()) {
                        Ok(h) => h,
                        Err(e) => return Err(ApiError(format!("Unable to create Authorization header: {e}")))
                    };
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        header.0.encode());
                },
                _ => {}
            }
        }

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {e}"))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = http_body_util::BodyExt::collect(body)
                        .await
                        .map(|f| f.to_bytes().to_vec())
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e.into())))?;

                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {e}")))?;
                let body = serde_json::from_str::<models::MessageObject>(body)
                    .map_err(|e| ApiError(format!("Response body did not match the schema: {e}")))?;


                Ok(CreateMessageResponse::OK
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = http_body_util::BodyExt::collect(response.into_body())
                        .await
                        .map(|f| f.to_bytes().to_vec());
                Err(ApiError(format!("Unexpected response code {code}:\n{headers:?}\n\n{}",
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {e:?}>"),
                        },
                        Err(e) => format!("<Failed to read body: {}>", Into::<crate::ServiceError>::into(e)),
                    }
                )))
            }
        }
    }

    #[allow(clippy::vec_init_then_push)]
    async fn create_run(
        &self,
        param_thread_id: String,
        param_create_run_request: models::CreateRunRequest,
        context: &C) -> Result<CreateRunResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        #[allow(clippy::uninlined_format_args)]
        let mut uri = format!(
            "{}/v1/threads/{thread_id}/runs",
            self.base_path
            ,thread_id=utf8_percent_encode(&param_thread_id.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {err}"))),
        };

        let mut request = match Request::builder()
            .method("POST")
            .uri(uri)
            .body(BoxBody::new(http_body_util::Empty::new())) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {e}")))
        };

        // Consumes basic body
        // Body parameter
        let body = serde_json::to_string(&param_create_run_request).expect("impossible to fail to serialize");
        *request.body_mut() = body_from_string(body);

        let header = "application/json";
        request.headers_mut().insert(CONTENT_TYPE, HeaderValue::from_static(header));

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {e}")))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            use headers::authorization::Credentials;
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(ref bearer_header) => {
                    let header = match headers::Authorization::bearer(&bearer_header.to_string()) {
                        Ok(h) => h,
                        Err(e) => return Err(ApiError(format!("Unable to create Authorization header: {e}")))
                    };
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        header.0.encode());
                },
                _ => {}
            }
        }

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {e}"))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = http_body_util::BodyExt::collect(body)
                        .await
                        .map(|f| f.to_bytes().to_vec())
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e.into())))?;

                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {e}")))?;
                let body = serde_json::from_str::<models::RunObject>(body)
                    .map_err(|e| ApiError(format!("Response body did not match the schema: {e}")))?;


                Ok(CreateRunResponse::OK
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = http_body_util::BodyExt::collect(response.into_body())
                        .await
                        .map(|f| f.to_bytes().to_vec());
                Err(ApiError(format!("Unexpected response code {code}:\n{headers:?}\n\n{}",
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {e:?}>"),
                        },
                        Err(e) => format!("<Failed to read body: {}>", Into::<crate::ServiceError>::into(e)),
                    }
                )))
            }
        }
    }

    #[allow(clippy::vec_init_then_push)]
    async fn delete_assistant(
        &self,
        param_assistant_id: String,
        context: &C) -> Result<DeleteAssistantResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        #[allow(clippy::uninlined_format_args)]
        let mut uri = format!(
            "{}/v1/assistants/{assistant_id}",
            self.base_path
            ,assistant_id=utf8_percent_encode(&param_assistant_id.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {err}"))),
        };

        let mut request = match Request::builder()
            .method("DELETE")
            .uri(uri)
            .body(BoxBody::new(http_body_util::Empty::new())) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {e}")))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {e}")))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            use headers::authorization::Credentials;
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(ref bearer_header) => {
                    let header = match headers::Authorization::bearer(&bearer_header.to_string()) {
                        Ok(h) => h,
                        Err(e) => return Err(ApiError(format!("Unable to create Authorization header: {e}")))
                    };
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        header.0.encode());
                },
                _ => {}
            }
        }

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {e}"))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = http_body_util::BodyExt::collect(body)
                        .await
                        .map(|f| f.to_bytes().to_vec())
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e.into())))?;

                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {e}")))?;
                let body = serde_json::from_str::<models::DeleteAssistantResponse>(body)
                    .map_err(|e| ApiError(format!("Response body did not match the schema: {e}")))?;


                Ok(DeleteAssistantResponse::OK
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = http_body_util::BodyExt::collect(response.into_body())
                        .await
                        .map(|f| f.to_bytes().to_vec());
                Err(ApiError(format!("Unexpected response code {code}:\n{headers:?}\n\n{}",
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {e:?}>"),
                        },
                        Err(e) => format!("<Failed to read body: {}>", Into::<crate::ServiceError>::into(e)),
                    }
                )))
            }
        }
    }

    #[allow(clippy::vec_init_then_push)]
    async fn delete_thread(
        &self,
        param_thread_id: String,
        context: &C) -> Result<DeleteThreadResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        #[allow(clippy::uninlined_format_args)]
        let mut uri = format!(
            "{}/v1/threads/{thread_id}",
            self.base_path
            ,thread_id=utf8_percent_encode(&param_thread_id.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {err}"))),
        };

        let mut request = match Request::builder()
            .method("DELETE")
            .uri(uri)
            .body(BoxBody::new(http_body_util::Empty::new())) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {e}")))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {e}")))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            use headers::authorization::Credentials;
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(ref bearer_header) => {
                    let header = match headers::Authorization::bearer(&bearer_header.to_string()) {
                        Ok(h) => h,
                        Err(e) => return Err(ApiError(format!("Unable to create Authorization header: {e}")))
                    };
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        header.0.encode());
                },
                _ => {}
            }
        }

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {e}"))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = http_body_util::BodyExt::collect(body)
                        .await
                        .map(|f| f.to_bytes().to_vec())
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e.into())))?;

                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {e}")))?;
                let body = serde_json::from_str::<models::DeleteThreadResponse>(body)
                    .map_err(|e| ApiError(format!("Response body did not match the schema: {e}")))?;


                Ok(DeleteThreadResponse::OK
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = http_body_util::BodyExt::collect(response.into_body())
                        .await
                        .map(|f| f.to_bytes().to_vec());
                Err(ApiError(format!("Unexpected response code {code}:\n{headers:?}\n\n{}",
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {e:?}>"),
                        },
                        Err(e) => format!("<Failed to read body: {}>", Into::<crate::ServiceError>::into(e)),
                    }
                )))
            }
        }
    }

    #[allow(clippy::vec_init_then_push)]
    async fn get_assistant(
        &self,
        param_assistant_id: String,
        context: &C) -> Result<GetAssistantResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        #[allow(clippy::uninlined_format_args)]
        let mut uri = format!(
            "{}/v1/assistants/{assistant_id}",
            self.base_path
            ,assistant_id=utf8_percent_encode(&param_assistant_id.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {err}"))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(BoxBody::new(http_body_util::Empty::new())) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {e}")))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {e}")))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            use headers::authorization::Credentials;
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(ref bearer_header) => {
                    let header = match headers::Authorization::bearer(&bearer_header.to_string()) {
                        Ok(h) => h,
                        Err(e) => return Err(ApiError(format!("Unable to create Authorization header: {e}")))
                    };
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        header.0.encode());
                },
                _ => {}
            }
        }

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {e}"))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = http_body_util::BodyExt::collect(body)
                        .await
                        .map(|f| f.to_bytes().to_vec())
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e.into())))?;

                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {e}")))?;
                let body = serde_json::from_str::<models::AssistantObject>(body)
                    .map_err(|e| ApiError(format!("Response body did not match the schema: {e}")))?;


                Ok(GetAssistantResponse::OK
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = http_body_util::BodyExt::collect(response.into_body())
                        .await
                        .map(|f| f.to_bytes().to_vec());
                Err(ApiError(format!("Unexpected response code {code}:\n{headers:?}\n\n{}",
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {e:?}>"),
                        },
                        Err(e) => format!("<Failed to read body: {}>", Into::<crate::ServiceError>::into(e)),
                    }
                )))
            }
        }
    }

    #[allow(clippy::vec_init_then_push)]
    async fn get_thread(
        &self,
        param_thread_id: String,
        context: &C) -> Result<GetThreadResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        #[allow(clippy::uninlined_format_args)]
        let mut uri = format!(
            "{}/v1/threads/{thread_id}",
            self.base_path
            ,thread_id=utf8_percent_encode(&param_thread_id.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {err}"))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(BoxBody::new(http_body_util::Empty::new())) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {e}")))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {e}")))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            use headers::authorization::Credentials;
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(ref bearer_header) => {
                    let header = match headers::Authorization::bearer(&bearer_header.to_string()) {
                        Ok(h) => h,
                        Err(e) => return Err(ApiError(format!("Unable to create Authorization header: {e}")))
                    };
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        header.0.encode());
                },
                _ => {}
            }
        }

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {e}"))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = http_body_util::BodyExt::collect(body)
                        .await
                        .map(|f| f.to_bytes().to_vec())
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e.into())))?;

                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {e}")))?;
                let body = serde_json::from_str::<models::ThreadObject>(body)
                    .map_err(|e| ApiError(format!("Response body did not match the schema: {e}")))?;


                Ok(GetThreadResponse::OK
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = http_body_util::BodyExt::collect(response.into_body())
                        .await
                        .map(|f| f.to_bytes().to_vec());
                Err(ApiError(format!("Unexpected response code {code}:\n{headers:?}\n\n{}",
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {e:?}>"),
                        },
                        Err(e) => format!("<Failed to read body: {}>", Into::<crate::ServiceError>::into(e)),
                    }
                )))
            }
        }
    }

    #[allow(clippy::vec_init_then_push)]
    async fn list_assistant_files(
        &self,
        param_assistant_id: String,
        param_limit: Option<i32>,
        param_order: Option<models::ListAssistantsOrderParameter>,
        param_after: Option<String>,
        param_before: Option<String>,
        context: &C) -> Result<ListAssistantFilesResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        #[allow(clippy::uninlined_format_args)]
        let mut uri = format!(
            "{}/v1/assistants/{assistant_id}/files",
            self.base_path
            ,assistant_id=utf8_percent_encode(&param_assistant_id.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            if let Some(param_limit) = param_limit {
                query_string.append_pair("limit",
                    &param_limit.to_string());
            }
            if let Some(param_order) = param_order {
                query_string.append_pair("order",
                    &param_order.to_string());
            }
            if let Some(param_after) = param_after {
                query_string.append_pair("after",
                    &param_after);
            }
            if let Some(param_before) = param_before {
                query_string.append_pair("before",
                    &param_before);
            }
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {err}"))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(BoxBody::new(http_body_util::Empty::new())) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {e}")))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {e}")))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            use headers::authorization::Credentials;
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(ref bearer_header) => {
                    let header = match headers::Authorization::bearer(&bearer_header.to_string()) {
                        Ok(h) => h,
                        Err(e) => return Err(ApiError(format!("Unable to create Authorization header: {e}")))
                    };
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        header.0.encode());
                },
                _ => {}
            }
        }

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {e}"))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = http_body_util::BodyExt::collect(body)
                        .await
                        .map(|f| f.to_bytes().to_vec())
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e.into())))?;

                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {e}")))?;
                let body = serde_json::from_str::<models::ListAssistantFilesResponse>(body)
                    .map_err(|e| ApiError(format!("Response body did not match the schema: {e}")))?;


                Ok(ListAssistantFilesResponse::OK
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = http_body_util::BodyExt::collect(response.into_body())
                        .await
                        .map(|f| f.to_bytes().to_vec());
                Err(ApiError(format!("Unexpected response code {code}:\n{headers:?}\n\n{}",
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {e:?}>"),
                        },
                        Err(e) => format!("<Failed to read body: {}>", Into::<crate::ServiceError>::into(e)),
                    }
                )))
            }
        }
    }

    #[allow(clippy::vec_init_then_push)]
    async fn list_messages(
        &self,
        param_thread_id: String,
        param_limit: Option<i32>,
        param_order: Option<models::ListAssistantsOrderParameter>,
        param_after: Option<String>,
        param_before: Option<String>,
        param_run_id: Option<String>,
        context: &C) -> Result<ListMessagesResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        #[allow(clippy::uninlined_format_args)]
        let mut uri = format!(
            "{}/v1/threads/{thread_id}/messages",
            self.base_path
            ,thread_id=utf8_percent_encode(&param_thread_id.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            if let Some(param_limit) = param_limit {
                query_string.append_pair("limit",
                    &param_limit.to_string());
            }
            if let Some(param_order) = param_order {
                query_string.append_pair("order",
                    &param_order.to_string());
            }
            if let Some(param_after) = param_after {
                query_string.append_pair("after",
                    &param_after);
            }
            if let Some(param_before) = param_before {
                query_string.append_pair("before",
                    &param_before);
            }
            if let Some(param_run_id) = param_run_id {
                query_string.append_pair("run_id",
                    &param_run_id);
            }
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {err}"))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(BoxBody::new(http_body_util::Empty::new())) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {e}")))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {e}")))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            use headers::authorization::Credentials;
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(ref bearer_header) => {
                    let header = match headers::Authorization::bearer(&bearer_header.to_string()) {
                        Ok(h) => h,
                        Err(e) => return Err(ApiError(format!("Unable to create Authorization header: {e}")))
                    };
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        header.0.encode());
                },
                _ => {}
            }
        }

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {e}"))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = http_body_util::BodyExt::collect(body)
                        .await
                        .map(|f| f.to_bytes().to_vec())
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e.into())))?;

                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {e}")))?;
                let body = serde_json::from_str::<models::ListMessagesResponse>(body)
                    .map_err(|e| ApiError(format!("Response body did not match the schema: {e}")))?;


                Ok(ListMessagesResponse::OK
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = http_body_util::BodyExt::collect(response.into_body())
                        .await
                        .map(|f| f.to_bytes().to_vec());
                Err(ApiError(format!("Unexpected response code {code}:\n{headers:?}\n\n{}",
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {e:?}>"),
                        },
                        Err(e) => format!("<Failed to read body: {}>", Into::<crate::ServiceError>::into(e)),
                    }
                )))
            }
        }
    }

    #[allow(clippy::vec_init_then_push)]
    async fn list_runs(
        &self,
        param_thread_id: String,
        param_limit: Option<i32>,
        param_order: Option<models::ListAssistantsOrderParameter>,
        param_after: Option<String>,
        param_before: Option<String>,
        context: &C) -> Result<ListRunsResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        #[allow(clippy::uninlined_format_args)]
        let mut uri = format!(
            "{}/v1/threads/{thread_id}/runs",
            self.base_path
            ,thread_id=utf8_percent_encode(&param_thread_id.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            if let Some(param_limit) = param_limit {
                query_string.append_pair("limit",
                    &param_limit.to_string());
            }
            if let Some(param_order) = param_order {
                query_string.append_pair("order",
                    &param_order.to_string());
            }
            if let Some(param_after) = param_after {
                query_string.append_pair("after",
                    &param_after);
            }
            if let Some(param_before) = param_before {
                query_string.append_pair("before",
                    &param_before);
            }
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {err}"))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(BoxBody::new(http_body_util::Empty::new())) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {e}")))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {e}")))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            use headers::authorization::Credentials;
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(ref bearer_header) => {
                    let header = match headers::Authorization::bearer(&bearer_header.to_string()) {
                        Ok(h) => h,
                        Err(e) => return Err(ApiError(format!("Unable to create Authorization header: {e}")))
                    };
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        header.0.encode());
                },
                _ => {}
            }
        }

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {e}"))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = http_body_util::BodyExt::collect(body)
                        .await
                        .map(|f| f.to_bytes().to_vec())
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e.into())))?;

                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {e}")))?;
                let body = serde_json::from_str::<models::ListRunsResponse>(body)
                    .map_err(|e| ApiError(format!("Response body did not match the schema: {e}")))?;


                Ok(ListRunsResponse::OK
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = http_body_util::BodyExt::collect(response.into_body())
                        .await
                        .map(|f| f.to_bytes().to_vec());
                Err(ApiError(format!("Unexpected response code {code}:\n{headers:?}\n\n{}",
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {e:?}>"),
                        },
                        Err(e) => format!("<Failed to read body: {}>", Into::<crate::ServiceError>::into(e)),
                    }
                )))
            }
        }
    }

    #[allow(clippy::vec_init_then_push)]
    async fn modify_assistant(
        &self,
        param_assistant_id: String,
        param_modify_assistant_request: models::ModifyAssistantRequest,
        context: &C) -> Result<ModifyAssistantResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        #[allow(clippy::uninlined_format_args)]
        let mut uri = format!(
            "{}/v1/assistants/{assistant_id}",
            self.base_path
            ,assistant_id=utf8_percent_encode(&param_assistant_id.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {err}"))),
        };

        let mut request = match Request::builder()
            .method("POST")
            .uri(uri)
            .body(BoxBody::new(http_body_util::Empty::new())) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {e}")))
        };

        // Consumes basic body
        // Body parameter
        let body = serde_json::to_string(&param_modify_assistant_request).expect("impossible to fail to serialize");
        *request.body_mut() = body_from_string(body);

        let header = "application/json";
        request.headers_mut().insert(CONTENT_TYPE, HeaderValue::from_static(header));

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {e}")))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            use headers::authorization::Credentials;
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(ref bearer_header) => {
                    let header = match headers::Authorization::bearer(&bearer_header.to_string()) {
                        Ok(h) => h,
                        Err(e) => return Err(ApiError(format!("Unable to create Authorization header: {e}")))
                    };
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        header.0.encode());
                },
                _ => {}
            }
        }

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {e}"))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = http_body_util::BodyExt::collect(body)
                        .await
                        .map(|f| f.to_bytes().to_vec())
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e.into())))?;

                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {e}")))?;
                let body = serde_json::from_str::<models::AssistantObject>(body)
                    .map_err(|e| ApiError(format!("Response body did not match the schema: {e}")))?;


                Ok(ModifyAssistantResponse::OK
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = http_body_util::BodyExt::collect(response.into_body())
                        .await
                        .map(|f| f.to_bytes().to_vec());
                Err(ApiError(format!("Unexpected response code {code}:\n{headers:?}\n\n{}",
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {e:?}>"),
                        },
                        Err(e) => format!("<Failed to read body: {}>", Into::<crate::ServiceError>::into(e)),
                    }
                )))
            }
        }
    }

    #[allow(clippy::vec_init_then_push)]
    async fn modify_thread(
        &self,
        param_thread_id: String,
        param_modify_thread_request: models::ModifyThreadRequest,
        context: &C) -> Result<ModifyThreadResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        #[allow(clippy::uninlined_format_args)]
        let mut uri = format!(
            "{}/v1/threads/{thread_id}",
            self.base_path
            ,thread_id=utf8_percent_encode(&param_thread_id.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {err}"))),
        };

        let mut request = match Request::builder()
            .method("POST")
            .uri(uri)
            .body(BoxBody::new(http_body_util::Empty::new())) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {e}")))
        };

        // Consumes basic body
        // Body parameter
        let body = serde_json::to_string(&param_modify_thread_request).expect("impossible to fail to serialize");
        *request.body_mut() = body_from_string(body);

        let header = "application/json";
        request.headers_mut().insert(CONTENT_TYPE, HeaderValue::from_static(header));

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {e}")))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            use headers::authorization::Credentials;
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(ref bearer_header) => {
                    let header = match headers::Authorization::bearer(&bearer_header.to_string()) {
                        Ok(h) => h,
                        Err(e) => return Err(ApiError(format!("Unable to create Authorization header: {e}")))
                    };
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        header.0.encode());
                },
                _ => {}
            }
        }

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {e}"))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = http_body_util::BodyExt::collect(body)
                        .await
                        .map(|f| f.to_bytes().to_vec())
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e.into())))?;

                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {e}")))?;
                let body = serde_json::from_str::<models::ThreadObject>(body)
                    .map_err(|e| ApiError(format!("Response body did not match the schema: {e}")))?;


                Ok(ModifyThreadResponse::OK
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = http_body_util::BodyExt::collect(response.into_body())
                        .await
                        .map(|f| f.to_bytes().to_vec());
                Err(ApiError(format!("Unexpected response code {code}:\n{headers:?}\n\n{}",
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {e:?}>"),
                        },
                        Err(e) => format!("<Failed to read body: {}>", Into::<crate::ServiceError>::into(e)),
                    }
                )))
            }
        }
    }

    #[allow(clippy::vec_init_then_push)]
    async fn cancel_run(
        &self,
        param_thread_id: String,
        param_run_id: String,
        context: &C) -> Result<CancelRunResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        #[allow(clippy::uninlined_format_args)]
        let mut uri = format!(
            "{}/v1/threads/{thread_id}/runs/{run_id}/cancel",
            self.base_path
            ,thread_id=utf8_percent_encode(&param_thread_id.to_string(), ID_ENCODE_SET)
            ,run_id=utf8_percent_encode(&param_run_id.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {err}"))),
        };

        let mut request = match Request::builder()
            .method("POST")
            .uri(uri)
            .body(BoxBody::new(http_body_util::Empty::new())) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {e}")))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {e}")))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            use headers::authorization::Credentials;
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(ref bearer_header) => {
                    let header = match headers::Authorization::bearer(&bearer_header.to_string()) {
                        Ok(h) => h,
                        Err(e) => return Err(ApiError(format!("Unable to create Authorization header: {e}")))
                    };
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        header.0.encode());
                },
                _ => {}
            }
        }

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {e}"))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = http_body_util::BodyExt::collect(body)
                        .await
                        .map(|f| f.to_bytes().to_vec())
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e.into())))?;

                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {e}")))?;
                let body = serde_json::from_str::<models::RunObject>(body)
                    .map_err(|e| ApiError(format!("Response body did not match the schema: {e}")))?;


                Ok(CancelRunResponse::OK
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = http_body_util::BodyExt::collect(response.into_body())
                        .await
                        .map(|f| f.to_bytes().to_vec());
                Err(ApiError(format!("Unexpected response code {code}:\n{headers:?}\n\n{}",
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {e:?}>"),
                        },
                        Err(e) => format!("<Failed to read body: {}>", Into::<crate::ServiceError>::into(e)),
                    }
                )))
            }
        }
    }

    #[allow(clippy::vec_init_then_push)]
    async fn delete_assistant_file(
        &self,
        param_assistant_id: String,
        param_file_id: String,
        context: &C) -> Result<DeleteAssistantFileResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        #[allow(clippy::uninlined_format_args)]
        let mut uri = format!(
            "{}/v1/assistants/{assistant_id}/files/{file_id}",
            self.base_path
            ,assistant_id=utf8_percent_encode(&param_assistant_id.to_string(), ID_ENCODE_SET)
            ,file_id=utf8_percent_encode(&param_file_id.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {err}"))),
        };

        let mut request = match Request::builder()
            .method("DELETE")
            .uri(uri)
            .body(BoxBody::new(http_body_util::Empty::new())) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {e}")))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {e}")))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            use headers::authorization::Credentials;
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(ref bearer_header) => {
                    let header = match headers::Authorization::bearer(&bearer_header.to_string()) {
                        Ok(h) => h,
                        Err(e) => return Err(ApiError(format!("Unable to create Authorization header: {e}")))
                    };
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        header.0.encode());
                },
                _ => {}
            }
        }

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {e}"))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = http_body_util::BodyExt::collect(body)
                        .await
                        .map(|f| f.to_bytes().to_vec())
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e.into())))?;

                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {e}")))?;
                let body = serde_json::from_str::<models::DeleteAssistantFileResponse>(body)
                    .map_err(|e| ApiError(format!("Response body did not match the schema: {e}")))?;


                Ok(DeleteAssistantFileResponse::OK
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = http_body_util::BodyExt::collect(response.into_body())
                        .await
                        .map(|f| f.to_bytes().to_vec());
                Err(ApiError(format!("Unexpected response code {code}:\n{headers:?}\n\n{}",
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {e:?}>"),
                        },
                        Err(e) => format!("<Failed to read body: {}>", Into::<crate::ServiceError>::into(e)),
                    }
                )))
            }
        }
    }

    #[allow(clippy::vec_init_then_push)]
    async fn get_assistant_file(
        &self,
        param_assistant_id: String,
        param_file_id: String,
        context: &C) -> Result<GetAssistantFileResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        #[allow(clippy::uninlined_format_args)]
        let mut uri = format!(
            "{}/v1/assistants/{assistant_id}/files/{file_id}",
            self.base_path
            ,assistant_id=utf8_percent_encode(&param_assistant_id.to_string(), ID_ENCODE_SET)
            ,file_id=utf8_percent_encode(&param_file_id.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {err}"))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(BoxBody::new(http_body_util::Empty::new())) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {e}")))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {e}")))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            use headers::authorization::Credentials;
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(ref bearer_header) => {
                    let header = match headers::Authorization::bearer(&bearer_header.to_string()) {
                        Ok(h) => h,
                        Err(e) => return Err(ApiError(format!("Unable to create Authorization header: {e}")))
                    };
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        header.0.encode());
                },
                _ => {}
            }
        }

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {e}"))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = http_body_util::BodyExt::collect(body)
                        .await
                        .map(|f| f.to_bytes().to_vec())
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e.into())))?;

                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {e}")))?;
                let body = serde_json::from_str::<models::AssistantFileObject>(body)
                    .map_err(|e| ApiError(format!("Response body did not match the schema: {e}")))?;


                Ok(GetAssistantFileResponse::OK
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = http_body_util::BodyExt::collect(response.into_body())
                        .await
                        .map(|f| f.to_bytes().to_vec());
                Err(ApiError(format!("Unexpected response code {code}:\n{headers:?}\n\n{}",
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {e:?}>"),
                        },
                        Err(e) => format!("<Failed to read body: {}>", Into::<crate::ServiceError>::into(e)),
                    }
                )))
            }
        }
    }

    #[allow(clippy::vec_init_then_push)]
    async fn get_message(
        &self,
        param_thread_id: String,
        param_message_id: String,
        context: &C) -> Result<GetMessageResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        #[allow(clippy::uninlined_format_args)]
        let mut uri = format!(
            "{}/v1/threads/{thread_id}/messages/{message_id}",
            self.base_path
            ,thread_id=utf8_percent_encode(&param_thread_id.to_string(), ID_ENCODE_SET)
            ,message_id=utf8_percent_encode(&param_message_id.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {err}"))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(BoxBody::new(http_body_util::Empty::new())) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {e}")))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {e}")))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            use headers::authorization::Credentials;
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(ref bearer_header) => {
                    let header = match headers::Authorization::bearer(&bearer_header.to_string()) {
                        Ok(h) => h,
                        Err(e) => return Err(ApiError(format!("Unable to create Authorization header: {e}")))
                    };
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        header.0.encode());
                },
                _ => {}
            }
        }

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {e}"))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = http_body_util::BodyExt::collect(body)
                        .await
                        .map(|f| f.to_bytes().to_vec())
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e.into())))?;

                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {e}")))?;
                let body = serde_json::from_str::<models::MessageObject>(body)
                    .map_err(|e| ApiError(format!("Response body did not match the schema: {e}")))?;


                Ok(GetMessageResponse::OK
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = http_body_util::BodyExt::collect(response.into_body())
                        .await
                        .map(|f| f.to_bytes().to_vec());
                Err(ApiError(format!("Unexpected response code {code}:\n{headers:?}\n\n{}",
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {e:?}>"),
                        },
                        Err(e) => format!("<Failed to read body: {}>", Into::<crate::ServiceError>::into(e)),
                    }
                )))
            }
        }
    }

    #[allow(clippy::vec_init_then_push)]
    async fn get_run(
        &self,
        param_thread_id: String,
        param_run_id: String,
        context: &C) -> Result<GetRunResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        #[allow(clippy::uninlined_format_args)]
        let mut uri = format!(
            "{}/v1/threads/{thread_id}/runs/{run_id}",
            self.base_path
            ,thread_id=utf8_percent_encode(&param_thread_id.to_string(), ID_ENCODE_SET)
            ,run_id=utf8_percent_encode(&param_run_id.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {err}"))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(BoxBody::new(http_body_util::Empty::new())) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {e}")))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {e}")))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            use headers::authorization::Credentials;
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(ref bearer_header) => {
                    let header = match headers::Authorization::bearer(&bearer_header.to_string()) {
                        Ok(h) => h,
                        Err(e) => return Err(ApiError(format!("Unable to create Authorization header: {e}")))
                    };
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        header.0.encode());
                },
                _ => {}
            }
        }

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {e}"))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = http_body_util::BodyExt::collect(body)
                        .await
                        .map(|f| f.to_bytes().to_vec())
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e.into())))?;

                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {e}")))?;
                let body = serde_json::from_str::<models::RunObject>(body)
                    .map_err(|e| ApiError(format!("Response body did not match the schema: {e}")))?;


                Ok(GetRunResponse::OK
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = http_body_util::BodyExt::collect(response.into_body())
                        .await
                        .map(|f| f.to_bytes().to_vec());
                Err(ApiError(format!("Unexpected response code {code}:\n{headers:?}\n\n{}",
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {e:?}>"),
                        },
                        Err(e) => format!("<Failed to read body: {}>", Into::<crate::ServiceError>::into(e)),
                    }
                )))
            }
        }
    }

    #[allow(clippy::vec_init_then_push)]
    async fn list_message_files(
        &self,
        param_thread_id: String,
        param_message_id: String,
        param_limit: Option<i32>,
        param_order: Option<models::ListAssistantsOrderParameter>,
        param_after: Option<String>,
        param_before: Option<String>,
        context: &C) -> Result<ListMessageFilesResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        #[allow(clippy::uninlined_format_args)]
        let mut uri = format!(
            "{}/v1/threads/{thread_id}/messages/{message_id}/files",
            self.base_path
            ,thread_id=utf8_percent_encode(&param_thread_id.to_string(), ID_ENCODE_SET)
            ,message_id=utf8_percent_encode(&param_message_id.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            if let Some(param_limit) = param_limit {
                query_string.append_pair("limit",
                    &param_limit.to_string());
            }
            if let Some(param_order) = param_order {
                query_string.append_pair("order",
                    &param_order.to_string());
            }
            if let Some(param_after) = param_after {
                query_string.append_pair("after",
                    &param_after);
            }
            if let Some(param_before) = param_before {
                query_string.append_pair("before",
                    &param_before);
            }
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {err}"))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(BoxBody::new(http_body_util::Empty::new())) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {e}")))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {e}")))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            use headers::authorization::Credentials;
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(ref bearer_header) => {
                    let header = match headers::Authorization::bearer(&bearer_header.to_string()) {
                        Ok(h) => h,
                        Err(e) => return Err(ApiError(format!("Unable to create Authorization header: {e}")))
                    };
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        header.0.encode());
                },
                _ => {}
            }
        }

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {e}"))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = http_body_util::BodyExt::collect(body)
                        .await
                        .map(|f| f.to_bytes().to_vec())
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e.into())))?;

                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {e}")))?;
                let body = serde_json::from_str::<models::ListMessageFilesResponse>(body)
                    .map_err(|e| ApiError(format!("Response body did not match the schema: {e}")))?;


                Ok(ListMessageFilesResponse::OK
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = http_body_util::BodyExt::collect(response.into_body())
                        .await
                        .map(|f| f.to_bytes().to_vec());
                Err(ApiError(format!("Unexpected response code {code}:\n{headers:?}\n\n{}",
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {e:?}>"),
                        },
                        Err(e) => format!("<Failed to read body: {}>", Into::<crate::ServiceError>::into(e)),
                    }
                )))
            }
        }
    }

    #[allow(clippy::vec_init_then_push)]
    async fn list_run_steps(
        &self,
        param_thread_id: String,
        param_run_id: String,
        param_limit: Option<i32>,
        param_order: Option<models::ListAssistantsOrderParameter>,
        param_after: Option<String>,
        param_before: Option<String>,
        context: &C) -> Result<ListRunStepsResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        #[allow(clippy::uninlined_format_args)]
        let mut uri = format!(
            "{}/v1/threads/{thread_id}/runs/{run_id}/steps",
            self.base_path
            ,thread_id=utf8_percent_encode(&param_thread_id.to_string(), ID_ENCODE_SET)
            ,run_id=utf8_percent_encode(&param_run_id.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            if let Some(param_limit) = param_limit {
                query_string.append_pair("limit",
                    &param_limit.to_string());
            }
            if let Some(param_order) = param_order {
                query_string.append_pair("order",
                    &param_order.to_string());
            }
            if let Some(param_after) = param_after {
                query_string.append_pair("after",
                    &param_after);
            }
            if let Some(param_before) = param_before {
                query_string.append_pair("before",
                    &param_before);
            }
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {err}"))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(BoxBody::new(http_body_util::Empty::new())) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {e}")))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {e}")))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            use headers::authorization::Credentials;
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(ref bearer_header) => {
                    let header = match headers::Authorization::bearer(&bearer_header.to_string()) {
                        Ok(h) => h,
                        Err(e) => return Err(ApiError(format!("Unable to create Authorization header: {e}")))
                    };
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        header.0.encode());
                },
                _ => {}
            }
        }

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {e}"))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = http_body_util::BodyExt::collect(body)
                        .await
                        .map(|f| f.to_bytes().to_vec())
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e.into())))?;

                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {e}")))?;
                let body = serde_json::from_str::<models::ListRunStepsResponse>(body)
                    .map_err(|e| ApiError(format!("Response body did not match the schema: {e}")))?;


                Ok(ListRunStepsResponse::OK
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = http_body_util::BodyExt::collect(response.into_body())
                        .await
                        .map(|f| f.to_bytes().to_vec());
                Err(ApiError(format!("Unexpected response code {code}:\n{headers:?}\n\n{}",
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {e:?}>"),
                        },
                        Err(e) => format!("<Failed to read body: {}>", Into::<crate::ServiceError>::into(e)),
                    }
                )))
            }
        }
    }

    #[allow(clippy::vec_init_then_push)]
    async fn modify_message(
        &self,
        param_thread_id: String,
        param_message_id: String,
        param_modify_message_request: models::ModifyMessageRequest,
        context: &C) -> Result<ModifyMessageResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        #[allow(clippy::uninlined_format_args)]
        let mut uri = format!(
            "{}/v1/threads/{thread_id}/messages/{message_id}",
            self.base_path
            ,thread_id=utf8_percent_encode(&param_thread_id.to_string(), ID_ENCODE_SET)
            ,message_id=utf8_percent_encode(&param_message_id.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {err}"))),
        };

        let mut request = match Request::builder()
            .method("POST")
            .uri(uri)
            .body(BoxBody::new(http_body_util::Empty::new())) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {e}")))
        };

        // Consumes basic body
        // Body parameter
        let body = serde_json::to_string(&param_modify_message_request).expect("impossible to fail to serialize");
        *request.body_mut() = body_from_string(body);

        let header = "application/json";
        request.headers_mut().insert(CONTENT_TYPE, HeaderValue::from_static(header));

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {e}")))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            use headers::authorization::Credentials;
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(ref bearer_header) => {
                    let header = match headers::Authorization::bearer(&bearer_header.to_string()) {
                        Ok(h) => h,
                        Err(e) => return Err(ApiError(format!("Unable to create Authorization header: {e}")))
                    };
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        header.0.encode());
                },
                _ => {}
            }
        }

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {e}"))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = http_body_util::BodyExt::collect(body)
                        .await
                        .map(|f| f.to_bytes().to_vec())
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e.into())))?;

                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {e}")))?;
                let body = serde_json::from_str::<models::MessageObject>(body)
                    .map_err(|e| ApiError(format!("Response body did not match the schema: {e}")))?;


                Ok(ModifyMessageResponse::OK
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = http_body_util::BodyExt::collect(response.into_body())
                        .await
                        .map(|f| f.to_bytes().to_vec());
                Err(ApiError(format!("Unexpected response code {code}:\n{headers:?}\n\n{}",
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {e:?}>"),
                        },
                        Err(e) => format!("<Failed to read body: {}>", Into::<crate::ServiceError>::into(e)),
                    }
                )))
            }
        }
    }

    #[allow(clippy::vec_init_then_push)]
    async fn modify_run(
        &self,
        param_thread_id: String,
        param_run_id: String,
        param_modify_run_request: models::ModifyRunRequest,
        context: &C) -> Result<ModifyRunResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        #[allow(clippy::uninlined_format_args)]
        let mut uri = format!(
            "{}/v1/threads/{thread_id}/runs/{run_id}",
            self.base_path
            ,thread_id=utf8_percent_encode(&param_thread_id.to_string(), ID_ENCODE_SET)
            ,run_id=utf8_percent_encode(&param_run_id.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {err}"))),
        };

        let mut request = match Request::builder()
            .method("POST")
            .uri(uri)
            .body(BoxBody::new(http_body_util::Empty::new())) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {e}")))
        };

        // Consumes basic body
        // Body parameter
        let body = serde_json::to_string(&param_modify_run_request).expect("impossible to fail to serialize");
        *request.body_mut() = body_from_string(body);

        let header = "application/json";
        request.headers_mut().insert(CONTENT_TYPE, HeaderValue::from_static(header));

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {e}")))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            use headers::authorization::Credentials;
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(ref bearer_header) => {
                    let header = match headers::Authorization::bearer(&bearer_header.to_string()) {
                        Ok(h) => h,
                        Err(e) => return Err(ApiError(format!("Unable to create Authorization header: {e}")))
                    };
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        header.0.encode());
                },
                _ => {}
            }
        }

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {e}"))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = http_body_util::BodyExt::collect(body)
                        .await
                        .map(|f| f.to_bytes().to_vec())
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e.into())))?;

                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {e}")))?;
                let body = serde_json::from_str::<models::RunObject>(body)
                    .map_err(|e| ApiError(format!("Response body did not match the schema: {e}")))?;


                Ok(ModifyRunResponse::OK
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = http_body_util::BodyExt::collect(response.into_body())
                        .await
                        .map(|f| f.to_bytes().to_vec());
                Err(ApiError(format!("Unexpected response code {code}:\n{headers:?}\n\n{}",
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {e:?}>"),
                        },
                        Err(e) => format!("<Failed to read body: {}>", Into::<crate::ServiceError>::into(e)),
                    }
                )))
            }
        }
    }

    #[allow(clippy::vec_init_then_push)]
    async fn submit_tool_ouputs_to_run(
        &self,
        param_thread_id: String,
        param_run_id: String,
        param_submit_tool_outputs_run_request: models::SubmitToolOutputsRunRequest,
        context: &C) -> Result<SubmitToolOuputsToRunResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        #[allow(clippy::uninlined_format_args)]
        let mut uri = format!(
            "{}/v1/threads/{thread_id}/runs/{run_id}/submit_tool_outputs",
            self.base_path
            ,thread_id=utf8_percent_encode(&param_thread_id.to_string(), ID_ENCODE_SET)
            ,run_id=utf8_percent_encode(&param_run_id.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {err}"))),
        };

        let mut request = match Request::builder()
            .method("POST")
            .uri(uri)
            .body(BoxBody::new(http_body_util::Empty::new())) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {e}")))
        };

        // Consumes basic body
        // Body parameter
        let body = serde_json::to_string(&param_submit_tool_outputs_run_request).expect("impossible to fail to serialize");
        *request.body_mut() = body_from_string(body);

        let header = "application/json";
        request.headers_mut().insert(CONTENT_TYPE, HeaderValue::from_static(header));

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {e}")))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            use headers::authorization::Credentials;
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(ref bearer_header) => {
                    let header = match headers::Authorization::bearer(&bearer_header.to_string()) {
                        Ok(h) => h,
                        Err(e) => return Err(ApiError(format!("Unable to create Authorization header: {e}")))
                    };
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        header.0.encode());
                },
                _ => {}
            }
        }

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {e}"))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = http_body_util::BodyExt::collect(body)
                        .await
                        .map(|f| f.to_bytes().to_vec())
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e.into())))?;

                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {e}")))?;
                let body = serde_json::from_str::<models::RunObject>(body)
                    .map_err(|e| ApiError(format!("Response body did not match the schema: {e}")))?;


                Ok(SubmitToolOuputsToRunResponse::OK
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = http_body_util::BodyExt::collect(response.into_body())
                        .await
                        .map(|f| f.to_bytes().to_vec());
                Err(ApiError(format!("Unexpected response code {code}:\n{headers:?}\n\n{}",
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {e:?}>"),
                        },
                        Err(e) => format!("<Failed to read body: {}>", Into::<crate::ServiceError>::into(e)),
                    }
                )))
            }
        }
    }

    #[allow(clippy::vec_init_then_push)]
    async fn get_message_file(
        &self,
        param_thread_id: String,
        param_message_id: String,
        param_file_id: String,
        context: &C) -> Result<GetMessageFileResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        #[allow(clippy::uninlined_format_args)]
        let mut uri = format!(
            "{}/v1/threads/{thread_id}/messages/{message_id}/files/{file_id}",
            self.base_path
            ,thread_id=utf8_percent_encode(&param_thread_id.to_string(), ID_ENCODE_SET)
            ,message_id=utf8_percent_encode(&param_message_id.to_string(), ID_ENCODE_SET)
            ,file_id=utf8_percent_encode(&param_file_id.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {err}"))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(BoxBody::new(http_body_util::Empty::new())) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {e}")))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {e}")))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            use headers::authorization::Credentials;
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(ref bearer_header) => {
                    let header = match headers::Authorization::bearer(&bearer_header.to_string()) {
                        Ok(h) => h,
                        Err(e) => return Err(ApiError(format!("Unable to create Authorization header: {e}")))
                    };
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        header.0.encode());
                },
                _ => {}
            }
        }

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {e}"))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = http_body_util::BodyExt::collect(body)
                        .await
                        .map(|f| f.to_bytes().to_vec())
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e.into())))?;

                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {e}")))?;
                let body = serde_json::from_str::<models::MessageFileObject>(body)
                    .map_err(|e| ApiError(format!("Response body did not match the schema: {e}")))?;


                Ok(GetMessageFileResponse::OK
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = http_body_util::BodyExt::collect(response.into_body())
                        .await
                        .map(|f| f.to_bytes().to_vec());
                Err(ApiError(format!("Unexpected response code {code}:\n{headers:?}\n\n{}",
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {e:?}>"),
                        },
                        Err(e) => format!("<Failed to read body: {}>", Into::<crate::ServiceError>::into(e)),
                    }
                )))
            }
        }
    }

    #[allow(clippy::vec_init_then_push)]
    async fn get_run_step(
        &self,
        param_thread_id: String,
        param_run_id: String,
        param_step_id: String,
        context: &C) -> Result<GetRunStepResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        #[allow(clippy::uninlined_format_args)]
        let mut uri = format!(
            "{}/v1/threads/{thread_id}/runs/{run_id}/steps/{step_id}",
            self.base_path
            ,thread_id=utf8_percent_encode(&param_thread_id.to_string(), ID_ENCODE_SET)
            ,run_id=utf8_percent_encode(&param_run_id.to_string(), ID_ENCODE_SET)
            ,step_id=utf8_percent_encode(&param_step_id.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {err}"))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(BoxBody::new(http_body_util::Empty::new())) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {e}")))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {e}")))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            use headers::authorization::Credentials;
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(ref bearer_header) => {
                    let header = match headers::Authorization::bearer(&bearer_header.to_string()) {
                        Ok(h) => h,
                        Err(e) => return Err(ApiError(format!("Unable to create Authorization header: {e}")))
                    };
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        header.0.encode());
                },
                _ => {}
            }
        }

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {e}"))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = http_body_util::BodyExt::collect(body)
                        .await
                        .map(|f| f.to_bytes().to_vec())
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e.into())))?;

                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {e}")))?;
                let body = serde_json::from_str::<models::RunStepObject>(body)
                    .map_err(|e| ApiError(format!("Response body did not match the schema: {e}")))?;


                Ok(GetRunStepResponse::OK
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = http_body_util::BodyExt::collect(response.into_body())
                        .await
                        .map(|f| f.to_bytes().to_vec());
                Err(ApiError(format!("Unexpected response code {code}:\n{headers:?}\n\n{}",
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {e:?}>"),
                        },
                        Err(e) => format!("<Failed to read body: {}>", Into::<crate::ServiceError>::into(e)),
                    }
                )))
            }
        }
    }

    #[allow(clippy::vec_init_then_push)]
    async fn create_speech(
        &self,
        param_create_speech_request: models::CreateSpeechRequest,
        context: &C) -> Result<CreateSpeechResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        #[allow(clippy::uninlined_format_args)]
        let mut uri = format!(
            "{}/v1/audio/speech",
            self.base_path
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {err}"))),
        };

        let mut request = match Request::builder()
            .method("POST")
            .uri(uri)
            .body(BoxBody::new(http_body_util::Empty::new())) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {e}")))
        };

        // Consumes basic body
        // Body parameter
        let body = serde_json::to_string(&param_create_speech_request).expect("impossible to fail to serialize");
        *request.body_mut() = body_from_string(body);

        let header = "application/json";
        request.headers_mut().insert(CONTENT_TYPE, HeaderValue::from_static(header));

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {e}")))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            use headers::authorization::Credentials;
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(ref bearer_header) => {
                    let header = match headers::Authorization::bearer(&bearer_header.to_string()) {
                        Ok(h) => h,
                        Err(e) => return Err(ApiError(format!("Unable to create Authorization header: {e}")))
                    };
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        header.0.encode());
                },
                _ => {}
            }
        }

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {e}"))).await?;

        match response.status().as_u16() {
            200 => {
                let response_transfer_encoding = match response.headers().get(HeaderName::from_static("transfer-encoding")) {
                    Some(response_transfer_encoding) => {
                        let response_transfer_encoding = response_transfer_encoding.clone();
                        let response_transfer_encoding = match TryInto::<header::IntoHeaderValue<String>>::try_into(response_transfer_encoding) {
                            Ok(value) => value,
                            Err(e) => {
                                return Err(ApiError(format!("Invalid response header Transfer-Encoding for response 200 - {e}")));
                            },
                        };
                        Some(response_transfer_encoding.0)
                        },
                    None => None,
                };

                let body = response.into_body();
                let body = http_body_util::BodyExt::collect(body)
                        .await
                        .map(|f| f.to_bytes().to_vec())
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e.into())))?;

                let body = swagger::ByteArray(body.to_vec());


                Ok(CreateSpeechResponse::OK
                    {
                        body,
                        transfer_encoding: response_transfer_encoding,
                    }
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = http_body_util::BodyExt::collect(response.into_body())
                        .await
                        .map(|f| f.to_bytes().to_vec());
                Err(ApiError(format!("Unexpected response code {code}:\n{headers:?}\n\n{}",
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {e:?}>"),
                        },
                        Err(e) => format!("<Failed to read body: {}>", Into::<crate::ServiceError>::into(e)),
                    }
                )))
            }
        }
    }

    #[allow(clippy::vec_init_then_push)]
    async fn create_transcription<'a>(
        &self,
        param_file: swagger::ByteArray,
        param_model: models::CreateTranscriptionRequestModel,
        param_language: Option<String>,
        param_prompt: Option<String>,
        param_response_format: Option<models::CreateTranscriptionRequestResponseFormat>,
        param_temperature: Option<f64>,
        param_timestamp_granularities_left_square_bracket_right_square_bracket: Option<&'a Vec<models::CreateTranscriptionRequestTimestampGranularitiesInner>>,
        context: &C) -> Result<CreateTranscriptionResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        #[allow(clippy::uninlined_format_args)]
        let mut uri = format!(
            "{}/v1/audio/transcriptions",
            self.base_path
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {err}"))),
        };

        let mut request = match Request::builder()
            .method("POST")
            .uri(uri)
            .body(BoxBody::new(http_body_util::Empty::new())) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {e}")))
        };

        // Consumes multipart/form body
        let (body_bytes, multipart_header) = {
            let mut multipart = Multipart::new();

            // For each parameter, encode as appropriate and add to the multipart body as a stream.

            let file_str = match serde_json::to_string(&param_file) {
                Ok(str) => str,
                Err(e) => return Err(ApiError(format!("Unable to serialize file to string: {e}"))),
            };

            let file_vec = file_str.as_bytes().to_vec();
            let file_mime = mime::Mime::from_str("application/json").expect("impossible to fail to parse");
            let file_cursor = Cursor::new(file_vec);

            multipart.add_stream("file",  file_cursor,  None as Option<&str>, Some(file_mime));


            let model_str = match serde_json::to_string(&param_model) {
                Ok(str) => str,
                Err(e) => return Err(ApiError(format!("Unable to serialize model to string: {e}"))),
            };

            let model_vec = model_str.as_bytes().to_vec();
            let model_mime = mime::Mime::from_str("application/json").expect("impossible to fail to parse");
            let model_cursor = Cursor::new(model_vec);

            multipart.add_stream("model",  model_cursor,  None as Option<&str>, Some(model_mime));


            let language_str = match serde_json::to_string(&param_language) {
                Ok(str) => str,
                Err(e) => return Err(ApiError(format!("Unable to serialize language to string: {e}"))),
            };

            let language_vec = language_str.as_bytes().to_vec();
            let language_mime = mime::Mime::from_str("application/json").expect("impossible to fail to parse");
            let language_cursor = Cursor::new(language_vec);

            multipart.add_stream("language",  language_cursor,  None as Option<&str>, Some(language_mime));


            let prompt_str = match serde_json::to_string(&param_prompt) {
                Ok(str) => str,
                Err(e) => return Err(ApiError(format!("Unable to serialize prompt to string: {e}"))),
            };

            let prompt_vec = prompt_str.as_bytes().to_vec();
            let prompt_mime = mime::Mime::from_str("application/json").expect("impossible to fail to parse");
            let prompt_cursor = Cursor::new(prompt_vec);

            multipart.add_stream("prompt",  prompt_cursor,  None as Option<&str>, Some(prompt_mime));


            let response_format_str = match serde_json::to_string(&param_response_format) {
                Ok(str) => str,
                Err(e) => return Err(ApiError(format!("Unable to serialize response_format to string: {e}"))),
            };

            let response_format_vec = response_format_str.as_bytes().to_vec();
            let response_format_mime = mime::Mime::from_str("application/json").expect("impossible to fail to parse");
            let response_format_cursor = Cursor::new(response_format_vec);

            multipart.add_stream("response_format",  response_format_cursor,  None as Option<&str>, Some(response_format_mime));


            let temperature_str = match serde_json::to_string(&param_temperature) {
                Ok(str) => str,
                Err(e) => return Err(ApiError(format!("Unable to serialize temperature to string: {e}"))),
            };

            let temperature_vec = temperature_str.as_bytes().to_vec();
            let temperature_mime = mime::Mime::from_str("application/json").expect("impossible to fail to parse");
            let temperature_cursor = Cursor::new(temperature_vec);

            multipart.add_stream("temperature",  temperature_cursor,  None as Option<&str>, Some(temperature_mime));


            let timestamp_granularities_left_square_bracket_right_square_bracket_str = match serde_json::to_string(&param_timestamp_granularities_left_square_bracket_right_square_bracket) {
                Ok(str) => str,
                Err(e) => return Err(ApiError(format!("Unable to serialize timestamp_granularities_left_square_bracket_right_square_bracket to string: {e}"))),
            };

            let timestamp_granularities_left_square_bracket_right_square_bracket_vec = timestamp_granularities_left_square_bracket_right_square_bracket_str.as_bytes().to_vec();
            let timestamp_granularities_left_square_bracket_right_square_bracket_mime = mime::Mime::from_str("application/json").expect("impossible to fail to parse");
            let timestamp_granularities_left_square_bracket_right_square_bracket_cursor = Cursor::new(timestamp_granularities_left_square_bracket_right_square_bracket_vec);

            multipart.add_stream("timestamp_granularities_left_square_bracket_right_square_bracket",  timestamp_granularities_left_square_bracket_right_square_bracket_cursor,  None as Option<&str>, Some(timestamp_granularities_left_square_bracket_right_square_bracket_mime));


            let mut fields = match multipart.prepare() {
                Ok(fields) => fields,
                Err(err) => return Err(ApiError(format!("Unable to build request: {err}"))),
            };

            let mut body_bytes = Vec::new();

            match fields.read_to_end(&mut body_bytes) {
                Ok(_) => (),
                Err(err) => return Err(ApiError(format!("Unable to build body: {err}"))),
            }

            let boundary = fields.boundary();

            let multipart_header = format!("multipart/form-data;boundary={boundary}");

            (body_bytes, multipart_header)
          };

        *request.body_mut() = BoxBody::new(Full::new(Bytes::from(body_bytes)));

        request.headers_mut().insert(CONTENT_TYPE, match HeaderValue::from_str(&multipart_header) {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create header: {multipart_header} - {e}")))
        });


        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {e}")))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            use headers::authorization::Credentials;
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(ref bearer_header) => {
                    let header = match headers::Authorization::bearer(&bearer_header.to_string()) {
                        Ok(h) => h,
                        Err(e) => return Err(ApiError(format!("Unable to create Authorization header: {e}")))
                    };
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        header.0.encode());
                },
                _ => {}
            }
        }

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {e}"))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = http_body_util::BodyExt::collect(body)
                        .await
                        .map(|f| f.to_bytes().to_vec())
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e.into())))?;

                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {e}")))?;
                let body = serde_json::from_str::<models::CreateTranscription200Response>(body)
                    .map_err(|e| ApiError(format!("Response body did not match the schema: {e}")))?;


                Ok(CreateTranscriptionResponse::OK
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = http_body_util::BodyExt::collect(response.into_body())
                        .await
                        .map(|f| f.to_bytes().to_vec());
                Err(ApiError(format!("Unexpected response code {code}:\n{headers:?}\n\n{}",
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {e:?}>"),
                        },
                        Err(e) => format!("<Failed to read body: {}>", Into::<crate::ServiceError>::into(e)),
                    }
                )))
            }
        }
    }

    #[allow(clippy::vec_init_then_push)]
    async fn create_translation(
        &self,
        param_file: swagger::ByteArray,
        param_model: models::CreateTranscriptionRequestModel,
        param_prompt: Option<String>,
        param_response_format: Option<String>,
        param_temperature: Option<f64>,
        context: &C) -> Result<CreateTranslationResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        #[allow(clippy::uninlined_format_args)]
        let mut uri = format!(
            "{}/v1/audio/translations",
            self.base_path
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {err}"))),
        };

        let mut request = match Request::builder()
            .method("POST")
            .uri(uri)
            .body(BoxBody::new(http_body_util::Empty::new())) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {e}")))
        };

        // Consumes multipart/form body
        let (body_bytes, multipart_header) = {
            let mut multipart = Multipart::new();

            // For each parameter, encode as appropriate and add to the multipart body as a stream.

            let file_str = match serde_json::to_string(&param_file) {
                Ok(str) => str,
                Err(e) => return Err(ApiError(format!("Unable to serialize file to string: {e}"))),
            };

            let file_vec = file_str.as_bytes().to_vec();
            let file_mime = mime::Mime::from_str("application/json").expect("impossible to fail to parse");
            let file_cursor = Cursor::new(file_vec);

            multipart.add_stream("file",  file_cursor,  None as Option<&str>, Some(file_mime));


            let model_str = match serde_json::to_string(&param_model) {
                Ok(str) => str,
                Err(e) => return Err(ApiError(format!("Unable to serialize model to string: {e}"))),
            };

            let model_vec = model_str.as_bytes().to_vec();
            let model_mime = mime::Mime::from_str("application/json").expect("impossible to fail to parse");
            let model_cursor = Cursor::new(model_vec);

            multipart.add_stream("model",  model_cursor,  None as Option<&str>, Some(model_mime));


            let prompt_str = match serde_json::to_string(&param_prompt) {
                Ok(str) => str,
                Err(e) => return Err(ApiError(format!("Unable to serialize prompt to string: {e}"))),
            };

            let prompt_vec = prompt_str.as_bytes().to_vec();
            let prompt_mime = mime::Mime::from_str("application/json").expect("impossible to fail to parse");
            let prompt_cursor = Cursor::new(prompt_vec);

            multipart.add_stream("prompt",  prompt_cursor,  None as Option<&str>, Some(prompt_mime));


            let response_format_str = match serde_json::to_string(&param_response_format) {
                Ok(str) => str,
                Err(e) => return Err(ApiError(format!("Unable to serialize response_format to string: {e}"))),
            };

            let response_format_vec = response_format_str.as_bytes().to_vec();
            let response_format_mime = mime::Mime::from_str("application/json").expect("impossible to fail to parse");
            let response_format_cursor = Cursor::new(response_format_vec);

            multipart.add_stream("response_format",  response_format_cursor,  None as Option<&str>, Some(response_format_mime));


            let temperature_str = match serde_json::to_string(&param_temperature) {
                Ok(str) => str,
                Err(e) => return Err(ApiError(format!("Unable to serialize temperature to string: {e}"))),
            };

            let temperature_vec = temperature_str.as_bytes().to_vec();
            let temperature_mime = mime::Mime::from_str("application/json").expect("impossible to fail to parse");
            let temperature_cursor = Cursor::new(temperature_vec);

            multipart.add_stream("temperature",  temperature_cursor,  None as Option<&str>, Some(temperature_mime));


            let mut fields = match multipart.prepare() {
                Ok(fields) => fields,
                Err(err) => return Err(ApiError(format!("Unable to build request: {err}"))),
            };

            let mut body_bytes = Vec::new();

            match fields.read_to_end(&mut body_bytes) {
                Ok(_) => (),
                Err(err) => return Err(ApiError(format!("Unable to build body: {err}"))),
            }

            let boundary = fields.boundary();

            let multipart_header = format!("multipart/form-data;boundary={boundary}");

            (body_bytes, multipart_header)
          };

        *request.body_mut() = BoxBody::new(Full::new(Bytes::from(body_bytes)));

        request.headers_mut().insert(CONTENT_TYPE, match HeaderValue::from_str(&multipart_header) {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create header: {multipart_header} - {e}")))
        });


        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {e}")))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            use headers::authorization::Credentials;
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(ref bearer_header) => {
                    let header = match headers::Authorization::bearer(&bearer_header.to_string()) {
                        Ok(h) => h,
                        Err(e) => return Err(ApiError(format!("Unable to create Authorization header: {e}")))
                    };
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        header.0.encode());
                },
                _ => {}
            }
        }

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {e}"))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = http_body_util::BodyExt::collect(body)
                        .await
                        .map(|f| f.to_bytes().to_vec())
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e.into())))?;

                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {e}")))?;
                let body = serde_json::from_str::<models::CreateTranslation200Response>(body)
                    .map_err(|e| ApiError(format!("Response body did not match the schema: {e}")))?;


                Ok(CreateTranslationResponse::OK
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = http_body_util::BodyExt::collect(response.into_body())
                        .await
                        .map(|f| f.to_bytes().to_vec());
                Err(ApiError(format!("Unexpected response code {code}:\n{headers:?}\n\n{}",
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {e:?}>"),
                        },
                        Err(e) => format!("<Failed to read body: {}>", Into::<crate::ServiceError>::into(e)),
                    }
                )))
            }
        }
    }

    #[allow(clippy::vec_init_then_push)]
    async fn create_chat_completion(
        &self,
        param_create_chat_completion_request: models::CreateChatCompletionRequest,
        context: &C) -> Result<CreateChatCompletionResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        #[allow(clippy::uninlined_format_args)]
        let mut uri = format!(
            "{}/v1/chat/completions",
            self.base_path
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {err}"))),
        };

        let mut request = match Request::builder()
            .method("POST")
            .uri(uri)
            .body(BoxBody::new(http_body_util::Empty::new())) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {e}")))
        };

        // Consumes basic body
        // Body parameter
        let body = serde_json::to_string(&param_create_chat_completion_request).expect("impossible to fail to serialize");
        *request.body_mut() = body_from_string(body);

        let header = "application/json";
        request.headers_mut().insert(CONTENT_TYPE, HeaderValue::from_static(header));

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {e}")))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            use headers::authorization::Credentials;
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(ref bearer_header) => {
                    let header = match headers::Authorization::bearer(&bearer_header.to_string()) {
                        Ok(h) => h,
                        Err(e) => return Err(ApiError(format!("Unable to create Authorization header: {e}")))
                    };
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        header.0.encode());
                },
                _ => {}
            }
        }

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {e}"))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = http_body_util::BodyExt::collect(body)
                        .await
                        .map(|f| f.to_bytes().to_vec())
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e.into())))?;

                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {e}")))?;
                let body = serde_json::from_str::<models::CreateChatCompletionResponse>(body)
                    .map_err(|e| ApiError(format!("Response body did not match the schema: {e}")))?;


                Ok(CreateChatCompletionResponse::OK
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = http_body_util::BodyExt::collect(response.into_body())
                        .await
                        .map(|f| f.to_bytes().to_vec());
                Err(ApiError(format!("Unexpected response code {code}:\n{headers:?}\n\n{}",
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {e:?}>"),
                        },
                        Err(e) => format!("<Failed to read body: {}>", Into::<crate::ServiceError>::into(e)),
                    }
                )))
            }
        }
    }

    #[allow(clippy::vec_init_then_push)]
    async fn create_completion(
        &self,
        param_create_completion_request: models::CreateCompletionRequest,
        context: &C) -> Result<CreateCompletionResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        #[allow(clippy::uninlined_format_args)]
        let mut uri = format!(
            "{}/v1/completions",
            self.base_path
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {err}"))),
        };

        let mut request = match Request::builder()
            .method("POST")
            .uri(uri)
            .body(BoxBody::new(http_body_util::Empty::new())) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {e}")))
        };

        // Consumes basic body
        // Body parameter
        let body = serde_json::to_string(&param_create_completion_request).expect("impossible to fail to serialize");
        *request.body_mut() = body_from_string(body);

        let header = "application/json";
        request.headers_mut().insert(CONTENT_TYPE, HeaderValue::from_static(header));

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {e}")))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            use headers::authorization::Credentials;
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(ref bearer_header) => {
                    let header = match headers::Authorization::bearer(&bearer_header.to_string()) {
                        Ok(h) => h,
                        Err(e) => return Err(ApiError(format!("Unable to create Authorization header: {e}")))
                    };
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        header.0.encode());
                },
                _ => {}
            }
        }

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {e}"))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = http_body_util::BodyExt::collect(body)
                        .await
                        .map(|f| f.to_bytes().to_vec())
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e.into())))?;

                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {e}")))?;
                let body = serde_json::from_str::<models::CreateCompletionResponse>(body)
                    .map_err(|e| ApiError(format!("Response body did not match the schema: {e}")))?;


                Ok(CreateCompletionResponse::OK
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = http_body_util::BodyExt::collect(response.into_body())
                        .await
                        .map(|f| f.to_bytes().to_vec());
                Err(ApiError(format!("Unexpected response code {code}:\n{headers:?}\n\n{}",
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {e:?}>"),
                        },
                        Err(e) => format!("<Failed to read body: {}>", Into::<crate::ServiceError>::into(e)),
                    }
                )))
            }
        }
    }

    #[allow(clippy::vec_init_then_push)]
    async fn create_embedding(
        &self,
        param_create_embedding_request: models::CreateEmbeddingRequest,
        context: &C) -> Result<CreateEmbeddingResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        #[allow(clippy::uninlined_format_args)]
        let mut uri = format!(
            "{}/v1/embeddings",
            self.base_path
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {err}"))),
        };

        let mut request = match Request::builder()
            .method("POST")
            .uri(uri)
            .body(BoxBody::new(http_body_util::Empty::new())) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {e}")))
        };

        // Consumes basic body
        // Body parameter
        let body = serde_json::to_string(&param_create_embedding_request).expect("impossible to fail to serialize");
        *request.body_mut() = body_from_string(body);

        let header = "application/json";
        request.headers_mut().insert(CONTENT_TYPE, HeaderValue::from_static(header));

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {e}")))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            use headers::authorization::Credentials;
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(ref bearer_header) => {
                    let header = match headers::Authorization::bearer(&bearer_header.to_string()) {
                        Ok(h) => h,
                        Err(e) => return Err(ApiError(format!("Unable to create Authorization header: {e}")))
                    };
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        header.0.encode());
                },
                _ => {}
            }
        }

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {e}"))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = http_body_util::BodyExt::collect(body)
                        .await
                        .map(|f| f.to_bytes().to_vec())
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e.into())))?;

                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {e}")))?;
                let body = serde_json::from_str::<models::CreateEmbeddingResponse>(body)
                    .map_err(|e| ApiError(format!("Response body did not match the schema: {e}")))?;


                Ok(CreateEmbeddingResponse::OK
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = http_body_util::BodyExt::collect(response.into_body())
                        .await
                        .map(|f| f.to_bytes().to_vec());
                Err(ApiError(format!("Unexpected response code {code}:\n{headers:?}\n\n{}",
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {e:?}>"),
                        },
                        Err(e) => format!("<Failed to read body: {}>", Into::<crate::ServiceError>::into(e)),
                    }
                )))
            }
        }
    }

    #[allow(clippy::vec_init_then_push)]
    async fn create_file(
        &self,
        param_file: swagger::ByteArray,
        param_purpose: models::CreateFileRequestPurpose,
        context: &C) -> Result<CreateFileResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        #[allow(clippy::uninlined_format_args)]
        let mut uri = format!(
            "{}/v1/files",
            self.base_path
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {err}"))),
        };

        let mut request = match Request::builder()
            .method("POST")
            .uri(uri)
            .body(BoxBody::new(http_body_util::Empty::new())) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {e}")))
        };

        // Consumes multipart/form body
        let (body_bytes, multipart_header) = {
            let mut multipart = Multipart::new();

            // For each parameter, encode as appropriate and add to the multipart body as a stream.

            let file_str = match serde_json::to_string(&param_file) {
                Ok(str) => str,
                Err(e) => return Err(ApiError(format!("Unable to serialize file to string: {e}"))),
            };

            let file_vec = file_str.as_bytes().to_vec();
            let file_mime = mime::Mime::from_str("application/json").expect("impossible to fail to parse");
            let file_cursor = Cursor::new(file_vec);

            multipart.add_stream("file",  file_cursor,  None as Option<&str>, Some(file_mime));


            let purpose_str = match serde_json::to_string(&param_purpose) {
                Ok(str) => str,
                Err(e) => return Err(ApiError(format!("Unable to serialize purpose to string: {e}"))),
            };

            let purpose_vec = purpose_str.as_bytes().to_vec();
            let purpose_mime = mime::Mime::from_str("application/json").expect("impossible to fail to parse");
            let purpose_cursor = Cursor::new(purpose_vec);

            multipart.add_stream("purpose",  purpose_cursor,  None as Option<&str>, Some(purpose_mime));


            let mut fields = match multipart.prepare() {
                Ok(fields) => fields,
                Err(err) => return Err(ApiError(format!("Unable to build request: {err}"))),
            };

            let mut body_bytes = Vec::new();

            match fields.read_to_end(&mut body_bytes) {
                Ok(_) => (),
                Err(err) => return Err(ApiError(format!("Unable to build body: {err}"))),
            }

            let boundary = fields.boundary();

            let multipart_header = format!("multipart/form-data;boundary={boundary}");

            (body_bytes, multipart_header)
          };

        *request.body_mut() = BoxBody::new(Full::new(Bytes::from(body_bytes)));

        request.headers_mut().insert(CONTENT_TYPE, match HeaderValue::from_str(&multipart_header) {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create header: {multipart_header} - {e}")))
        });


        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {e}")))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            use headers::authorization::Credentials;
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(ref bearer_header) => {
                    let header = match headers::Authorization::bearer(&bearer_header.to_string()) {
                        Ok(h) => h,
                        Err(e) => return Err(ApiError(format!("Unable to create Authorization header: {e}")))
                    };
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        header.0.encode());
                },
                _ => {}
            }
        }

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {e}"))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = http_body_util::BodyExt::collect(body)
                        .await
                        .map(|f| f.to_bytes().to_vec())
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e.into())))?;

                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {e}")))?;
                let body = serde_json::from_str::<models::OpenAiFile>(body)
                    .map_err(|e| ApiError(format!("Response body did not match the schema: {e}")))?;


                Ok(CreateFileResponse::OK
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = http_body_util::BodyExt::collect(response.into_body())
                        .await
                        .map(|f| f.to_bytes().to_vec());
                Err(ApiError(format!("Unexpected response code {code}:\n{headers:?}\n\n{}",
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {e:?}>"),
                        },
                        Err(e) => format!("<Failed to read body: {}>", Into::<crate::ServiceError>::into(e)),
                    }
                )))
            }
        }
    }

    #[allow(clippy::vec_init_then_push)]
    async fn list_files(
        &self,
        param_purpose: Option<String>,
        context: &C) -> Result<ListFilesResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        #[allow(clippy::uninlined_format_args)]
        let mut uri = format!(
            "{}/v1/files",
            self.base_path
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            if let Some(param_purpose) = param_purpose {
                query_string.append_pair("purpose",
                    &param_purpose);
            }
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {err}"))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(BoxBody::new(http_body_util::Empty::new())) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {e}")))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {e}")))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            use headers::authorization::Credentials;
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(ref bearer_header) => {
                    let header = match headers::Authorization::bearer(&bearer_header.to_string()) {
                        Ok(h) => h,
                        Err(e) => return Err(ApiError(format!("Unable to create Authorization header: {e}")))
                    };
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        header.0.encode());
                },
                _ => {}
            }
        }

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {e}"))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = http_body_util::BodyExt::collect(body)
                        .await
                        .map(|f| f.to_bytes().to_vec())
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e.into())))?;

                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {e}")))?;
                let body = serde_json::from_str::<models::ListFilesResponse>(body)
                    .map_err(|e| ApiError(format!("Response body did not match the schema: {e}")))?;


                Ok(ListFilesResponse::OK
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = http_body_util::BodyExt::collect(response.into_body())
                        .await
                        .map(|f| f.to_bytes().to_vec());
                Err(ApiError(format!("Unexpected response code {code}:\n{headers:?}\n\n{}",
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {e:?}>"),
                        },
                        Err(e) => format!("<Failed to read body: {}>", Into::<crate::ServiceError>::into(e)),
                    }
                )))
            }
        }
    }

    #[allow(clippy::vec_init_then_push)]
    async fn delete_file(
        &self,
        param_file_id: String,
        context: &C) -> Result<DeleteFileResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        #[allow(clippy::uninlined_format_args)]
        let mut uri = format!(
            "{}/v1/files/{file_id}",
            self.base_path
            ,file_id=utf8_percent_encode(&param_file_id.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {err}"))),
        };

        let mut request = match Request::builder()
            .method("DELETE")
            .uri(uri)
            .body(BoxBody::new(http_body_util::Empty::new())) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {e}")))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {e}")))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            use headers::authorization::Credentials;
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(ref bearer_header) => {
                    let header = match headers::Authorization::bearer(&bearer_header.to_string()) {
                        Ok(h) => h,
                        Err(e) => return Err(ApiError(format!("Unable to create Authorization header: {e}")))
                    };
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        header.0.encode());
                },
                _ => {}
            }
        }

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {e}"))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = http_body_util::BodyExt::collect(body)
                        .await
                        .map(|f| f.to_bytes().to_vec())
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e.into())))?;

                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {e}")))?;
                let body = serde_json::from_str::<models::DeleteFileResponse>(body)
                    .map_err(|e| ApiError(format!("Response body did not match the schema: {e}")))?;


                Ok(DeleteFileResponse::OK
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = http_body_util::BodyExt::collect(response.into_body())
                        .await
                        .map(|f| f.to_bytes().to_vec());
                Err(ApiError(format!("Unexpected response code {code}:\n{headers:?}\n\n{}",
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {e:?}>"),
                        },
                        Err(e) => format!("<Failed to read body: {}>", Into::<crate::ServiceError>::into(e)),
                    }
                )))
            }
        }
    }

    #[allow(clippy::vec_init_then_push)]
    async fn download_file(
        &self,
        param_file_id: String,
        context: &C) -> Result<DownloadFileResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        #[allow(clippy::uninlined_format_args)]
        let mut uri = format!(
            "{}/v1/files/{file_id}/content",
            self.base_path
            ,file_id=utf8_percent_encode(&param_file_id.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {err}"))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(BoxBody::new(http_body_util::Empty::new())) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {e}")))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {e}")))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            use headers::authorization::Credentials;
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(ref bearer_header) => {
                    let header = match headers::Authorization::bearer(&bearer_header.to_string()) {
                        Ok(h) => h,
                        Err(e) => return Err(ApiError(format!("Unable to create Authorization header: {e}")))
                    };
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        header.0.encode());
                },
                _ => {}
            }
        }

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {e}"))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = http_body_util::BodyExt::collect(body)
                        .await
                        .map(|f| f.to_bytes().to_vec())
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e.into())))?;

                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {e}")))?;
                let body = serde_json::from_str::<String>(body)
                    .map_err(|e| ApiError(format!("Response body did not match the schema: {e}")))?;


                Ok(DownloadFileResponse::OK
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = http_body_util::BodyExt::collect(response.into_body())
                        .await
                        .map(|f| f.to_bytes().to_vec());
                Err(ApiError(format!("Unexpected response code {code}:\n{headers:?}\n\n{}",
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {e:?}>"),
                        },
                        Err(e) => format!("<Failed to read body: {}>", Into::<crate::ServiceError>::into(e)),
                    }
                )))
            }
        }
    }

    #[allow(clippy::vec_init_then_push)]
    async fn retrieve_file(
        &self,
        param_file_id: String,
        context: &C) -> Result<RetrieveFileResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        #[allow(clippy::uninlined_format_args)]
        let mut uri = format!(
            "{}/v1/files/{file_id}",
            self.base_path
            ,file_id=utf8_percent_encode(&param_file_id.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {err}"))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(BoxBody::new(http_body_util::Empty::new())) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {e}")))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {e}")))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            use headers::authorization::Credentials;
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(ref bearer_header) => {
                    let header = match headers::Authorization::bearer(&bearer_header.to_string()) {
                        Ok(h) => h,
                        Err(e) => return Err(ApiError(format!("Unable to create Authorization header: {e}")))
                    };
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        header.0.encode());
                },
                _ => {}
            }
        }

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {e}"))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = http_body_util::BodyExt::collect(body)
                        .await
                        .map(|f| f.to_bytes().to_vec())
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e.into())))?;

                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {e}")))?;
                let body = serde_json::from_str::<models::OpenAiFile>(body)
                    .map_err(|e| ApiError(format!("Response body did not match the schema: {e}")))?;


                Ok(RetrieveFileResponse::OK
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = http_body_util::BodyExt::collect(response.into_body())
                        .await
                        .map(|f| f.to_bytes().to_vec());
                Err(ApiError(format!("Unexpected response code {code}:\n{headers:?}\n\n{}",
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {e:?}>"),
                        },
                        Err(e) => format!("<Failed to read body: {}>", Into::<crate::ServiceError>::into(e)),
                    }
                )))
            }
        }
    }

    #[allow(clippy::vec_init_then_push)]
    async fn create_fine_tuning_job(
        &self,
        param_create_fine_tuning_job_request: models::CreateFineTuningJobRequest,
        context: &C) -> Result<CreateFineTuningJobResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        #[allow(clippy::uninlined_format_args)]
        let mut uri = format!(
            "{}/v1/fine_tuning/jobs",
            self.base_path
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {err}"))),
        };

        let mut request = match Request::builder()
            .method("POST")
            .uri(uri)
            .body(BoxBody::new(http_body_util::Empty::new())) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {e}")))
        };

        // Consumes basic body
        // Body parameter
        let body = serde_json::to_string(&param_create_fine_tuning_job_request).expect("impossible to fail to serialize");
        *request.body_mut() = body_from_string(body);

        let header = "application/json";
        request.headers_mut().insert(CONTENT_TYPE, HeaderValue::from_static(header));

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {e}")))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            use headers::authorization::Credentials;
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(ref bearer_header) => {
                    let header = match headers::Authorization::bearer(&bearer_header.to_string()) {
                        Ok(h) => h,
                        Err(e) => return Err(ApiError(format!("Unable to create Authorization header: {e}")))
                    };
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        header.0.encode());
                },
                _ => {}
            }
        }

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {e}"))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = http_body_util::BodyExt::collect(body)
                        .await
                        .map(|f| f.to_bytes().to_vec())
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e.into())))?;

                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {e}")))?;
                let body = serde_json::from_str::<models::FineTuningJob>(body)
                    .map_err(|e| ApiError(format!("Response body did not match the schema: {e}")))?;


                Ok(CreateFineTuningJobResponse::OK
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = http_body_util::BodyExt::collect(response.into_body())
                        .await
                        .map(|f| f.to_bytes().to_vec());
                Err(ApiError(format!("Unexpected response code {code}:\n{headers:?}\n\n{}",
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {e:?}>"),
                        },
                        Err(e) => format!("<Failed to read body: {}>", Into::<crate::ServiceError>::into(e)),
                    }
                )))
            }
        }
    }

    #[allow(clippy::vec_init_then_push)]
    async fn list_paginated_fine_tuning_jobs(
        &self,
        param_after: Option<String>,
        param_limit: Option<i32>,
        context: &C) -> Result<ListPaginatedFineTuningJobsResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        #[allow(clippy::uninlined_format_args)]
        let mut uri = format!(
            "{}/v1/fine_tuning/jobs",
            self.base_path
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            if let Some(param_after) = param_after {
                query_string.append_pair("after",
                    &param_after);
            }
            if let Some(param_limit) = param_limit {
                query_string.append_pair("limit",
                    &param_limit.to_string());
            }
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {err}"))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(BoxBody::new(http_body_util::Empty::new())) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {e}")))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {e}")))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            use headers::authorization::Credentials;
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(ref bearer_header) => {
                    let header = match headers::Authorization::bearer(&bearer_header.to_string()) {
                        Ok(h) => h,
                        Err(e) => return Err(ApiError(format!("Unable to create Authorization header: {e}")))
                    };
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        header.0.encode());
                },
                _ => {}
            }
        }

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {e}"))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = http_body_util::BodyExt::collect(body)
                        .await
                        .map(|f| f.to_bytes().to_vec())
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e.into())))?;

                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {e}")))?;
                let body = serde_json::from_str::<models::ListPaginatedFineTuningJobsResponse>(body)
                    .map_err(|e| ApiError(format!("Response body did not match the schema: {e}")))?;


                Ok(ListPaginatedFineTuningJobsResponse::OK
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = http_body_util::BodyExt::collect(response.into_body())
                        .await
                        .map(|f| f.to_bytes().to_vec());
                Err(ApiError(format!("Unexpected response code {code}:\n{headers:?}\n\n{}",
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {e:?}>"),
                        },
                        Err(e) => format!("<Failed to read body: {}>", Into::<crate::ServiceError>::into(e)),
                    }
                )))
            }
        }
    }

    #[allow(clippy::vec_init_then_push)]
    async fn cancel_fine_tuning_job(
        &self,
        param_fine_tuning_job_id: String,
        context: &C) -> Result<CancelFineTuningJobResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        #[allow(clippy::uninlined_format_args)]
        let mut uri = format!(
            "{}/v1/fine_tuning/jobs/{fine_tuning_job_id}/cancel",
            self.base_path
            ,fine_tuning_job_id=utf8_percent_encode(&param_fine_tuning_job_id.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {err}"))),
        };

        let mut request = match Request::builder()
            .method("POST")
            .uri(uri)
            .body(BoxBody::new(http_body_util::Empty::new())) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {e}")))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {e}")))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            use headers::authorization::Credentials;
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(ref bearer_header) => {
                    let header = match headers::Authorization::bearer(&bearer_header.to_string()) {
                        Ok(h) => h,
                        Err(e) => return Err(ApiError(format!("Unable to create Authorization header: {e}")))
                    };
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        header.0.encode());
                },
                _ => {}
            }
        }

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {e}"))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = http_body_util::BodyExt::collect(body)
                        .await
                        .map(|f| f.to_bytes().to_vec())
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e.into())))?;

                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {e}")))?;
                let body = serde_json::from_str::<models::FineTuningJob>(body)
                    .map_err(|e| ApiError(format!("Response body did not match the schema: {e}")))?;


                Ok(CancelFineTuningJobResponse::OK
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = http_body_util::BodyExt::collect(response.into_body())
                        .await
                        .map(|f| f.to_bytes().to_vec());
                Err(ApiError(format!("Unexpected response code {code}:\n{headers:?}\n\n{}",
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {e:?}>"),
                        },
                        Err(e) => format!("<Failed to read body: {}>", Into::<crate::ServiceError>::into(e)),
                    }
                )))
            }
        }
    }

    #[allow(clippy::vec_init_then_push)]
    async fn list_fine_tuning_events(
        &self,
        param_fine_tuning_job_id: String,
        param_after: Option<String>,
        param_limit: Option<i32>,
        context: &C) -> Result<ListFineTuningEventsResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        #[allow(clippy::uninlined_format_args)]
        let mut uri = format!(
            "{}/v1/fine_tuning/jobs/{fine_tuning_job_id}/events",
            self.base_path
            ,fine_tuning_job_id=utf8_percent_encode(&param_fine_tuning_job_id.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            if let Some(param_after) = param_after {
                query_string.append_pair("after",
                    &param_after);
            }
            if let Some(param_limit) = param_limit {
                query_string.append_pair("limit",
                    &param_limit.to_string());
            }
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {err}"))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(BoxBody::new(http_body_util::Empty::new())) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {e}")))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {e}")))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            use headers::authorization::Credentials;
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(ref bearer_header) => {
                    let header = match headers::Authorization::bearer(&bearer_header.to_string()) {
                        Ok(h) => h,
                        Err(e) => return Err(ApiError(format!("Unable to create Authorization header: {e}")))
                    };
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        header.0.encode());
                },
                _ => {}
            }
        }

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {e}"))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = http_body_util::BodyExt::collect(body)
                        .await
                        .map(|f| f.to_bytes().to_vec())
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e.into())))?;

                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {e}")))?;
                let body = serde_json::from_str::<models::ListFineTuningJobEventsResponse>(body)
                    .map_err(|e| ApiError(format!("Response body did not match the schema: {e}")))?;


                Ok(ListFineTuningEventsResponse::OK
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = http_body_util::BodyExt::collect(response.into_body())
                        .await
                        .map(|f| f.to_bytes().to_vec());
                Err(ApiError(format!("Unexpected response code {code}:\n{headers:?}\n\n{}",
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {e:?}>"),
                        },
                        Err(e) => format!("<Failed to read body: {}>", Into::<crate::ServiceError>::into(e)),
                    }
                )))
            }
        }
    }

    #[allow(clippy::vec_init_then_push)]
    async fn list_fine_tuning_job_checkpoints(
        &self,
        param_fine_tuning_job_id: String,
        param_after: Option<String>,
        param_limit: Option<i32>,
        context: &C) -> Result<ListFineTuningJobCheckpointsResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        #[allow(clippy::uninlined_format_args)]
        let mut uri = format!(
            "{}/v1/fine_tuning/jobs/{fine_tuning_job_id}/checkpoints",
            self.base_path
            ,fine_tuning_job_id=utf8_percent_encode(&param_fine_tuning_job_id.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            if let Some(param_after) = param_after {
                query_string.append_pair("after",
                    &param_after);
            }
            if let Some(param_limit) = param_limit {
                query_string.append_pair("limit",
                    &param_limit.to_string());
            }
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {err}"))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(BoxBody::new(http_body_util::Empty::new())) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {e}")))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {e}")))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            use headers::authorization::Credentials;
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(ref bearer_header) => {
                    let header = match headers::Authorization::bearer(&bearer_header.to_string()) {
                        Ok(h) => h,
                        Err(e) => return Err(ApiError(format!("Unable to create Authorization header: {e}")))
                    };
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        header.0.encode());
                },
                _ => {}
            }
        }

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {e}"))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = http_body_util::BodyExt::collect(body)
                        .await
                        .map(|f| f.to_bytes().to_vec())
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e.into())))?;

                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {e}")))?;
                let body = serde_json::from_str::<models::ListFineTuningJobCheckpointsResponse>(body)
                    .map_err(|e| ApiError(format!("Response body did not match the schema: {e}")))?;


                Ok(ListFineTuningJobCheckpointsResponse::OK
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = http_body_util::BodyExt::collect(response.into_body())
                        .await
                        .map(|f| f.to_bytes().to_vec());
                Err(ApiError(format!("Unexpected response code {code}:\n{headers:?}\n\n{}",
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {e:?}>"),
                        },
                        Err(e) => format!("<Failed to read body: {}>", Into::<crate::ServiceError>::into(e)),
                    }
                )))
            }
        }
    }

    #[allow(clippy::vec_init_then_push)]
    async fn retrieve_fine_tuning_job(
        &self,
        param_fine_tuning_job_id: String,
        context: &C) -> Result<RetrieveFineTuningJobResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        #[allow(clippy::uninlined_format_args)]
        let mut uri = format!(
            "{}/v1/fine_tuning/jobs/{fine_tuning_job_id}",
            self.base_path
            ,fine_tuning_job_id=utf8_percent_encode(&param_fine_tuning_job_id.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {err}"))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(BoxBody::new(http_body_util::Empty::new())) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {e}")))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {e}")))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            use headers::authorization::Credentials;
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(ref bearer_header) => {
                    let header = match headers::Authorization::bearer(&bearer_header.to_string()) {
                        Ok(h) => h,
                        Err(e) => return Err(ApiError(format!("Unable to create Authorization header: {e}")))
                    };
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        header.0.encode());
                },
                _ => {}
            }
        }

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {e}"))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = http_body_util::BodyExt::collect(body)
                        .await
                        .map(|f| f.to_bytes().to_vec())
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e.into())))?;

                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {e}")))?;
                let body = serde_json::from_str::<models::FineTuningJob>(body)
                    .map_err(|e| ApiError(format!("Response body did not match the schema: {e}")))?;


                Ok(RetrieveFineTuningJobResponse::OK
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = http_body_util::BodyExt::collect(response.into_body())
                        .await
                        .map(|f| f.to_bytes().to_vec());
                Err(ApiError(format!("Unexpected response code {code}:\n{headers:?}\n\n{}",
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {e:?}>"),
                        },
                        Err(e) => format!("<Failed to read body: {}>", Into::<crate::ServiceError>::into(e)),
                    }
                )))
            }
        }
    }

    #[allow(clippy::vec_init_then_push)]
    async fn create_image(
        &self,
        param_create_image_request: models::CreateImageRequest,
        context: &C) -> Result<CreateImageResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        #[allow(clippy::uninlined_format_args)]
        let mut uri = format!(
            "{}/v1/images/generations",
            self.base_path
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {err}"))),
        };

        let mut request = match Request::builder()
            .method("POST")
            .uri(uri)
            .body(BoxBody::new(http_body_util::Empty::new())) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {e}")))
        };

        // Consumes basic body
        // Body parameter
        let body = serde_json::to_string(&param_create_image_request).expect("impossible to fail to serialize");
        *request.body_mut() = body_from_string(body);

        let header = "application/json";
        request.headers_mut().insert(CONTENT_TYPE, HeaderValue::from_static(header));

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {e}")))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            use headers::authorization::Credentials;
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(ref bearer_header) => {
                    let header = match headers::Authorization::bearer(&bearer_header.to_string()) {
                        Ok(h) => h,
                        Err(e) => return Err(ApiError(format!("Unable to create Authorization header: {e}")))
                    };
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        header.0.encode());
                },
                _ => {}
            }
        }

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {e}"))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = http_body_util::BodyExt::collect(body)
                        .await
                        .map(|f| f.to_bytes().to_vec())
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e.into())))?;

                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {e}")))?;
                let body = serde_json::from_str::<models::ImagesResponse>(body)
                    .map_err(|e| ApiError(format!("Response body did not match the schema: {e}")))?;


                Ok(CreateImageResponse::OK
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = http_body_util::BodyExt::collect(response.into_body())
                        .await
                        .map(|f| f.to_bytes().to_vec());
                Err(ApiError(format!("Unexpected response code {code}:\n{headers:?}\n\n{}",
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {e:?}>"),
                        },
                        Err(e) => format!("<Failed to read body: {}>", Into::<crate::ServiceError>::into(e)),
                    }
                )))
            }
        }
    }

    #[allow(clippy::vec_init_then_push)]
    async fn create_image_edit(
        &self,
        param_image: swagger::ByteArray,
        param_prompt: String,
        param_mask: Option<swagger::ByteArray>,
        param_model: Option<swagger::Nullable<models::CreateImageEditRequestModel>>,
        param_n: Option<swagger::Nullable<i32>>,
        param_size: Option<swagger::Nullable<models::CreateImageEditRequestSize>>,
        param_response_format: Option<swagger::Nullable<models::CreateImageRequestResponseFormat>>,
        param_user: Option<String>,
        context: &C) -> Result<CreateImageEditResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        #[allow(clippy::uninlined_format_args)]
        let mut uri = format!(
            "{}/v1/images/edits",
            self.base_path
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {err}"))),
        };

        let mut request = match Request::builder()
            .method("POST")
            .uri(uri)
            .body(BoxBody::new(http_body_util::Empty::new())) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {e}")))
        };

        // Consumes multipart/form body
        let (body_bytes, multipart_header) = {
            let mut multipart = Multipart::new();

            // For each parameter, encode as appropriate and add to the multipart body as a stream.

            let image_str = match serde_json::to_string(&param_image) {
                Ok(str) => str,
                Err(e) => return Err(ApiError(format!("Unable to serialize image to string: {e}"))),
            };

            let image_vec = image_str.as_bytes().to_vec();
            let image_mime = mime::Mime::from_str("application/json").expect("impossible to fail to parse");
            let image_cursor = Cursor::new(image_vec);

            multipart.add_stream("image",  image_cursor,  None as Option<&str>, Some(image_mime));


            let prompt_str = match serde_json::to_string(&param_prompt) {
                Ok(str) => str,
                Err(e) => return Err(ApiError(format!("Unable to serialize prompt to string: {e}"))),
            };

            let prompt_vec = prompt_str.as_bytes().to_vec();
            let prompt_mime = mime::Mime::from_str("application/json").expect("impossible to fail to parse");
            let prompt_cursor = Cursor::new(prompt_vec);

            multipart.add_stream("prompt",  prompt_cursor,  None as Option<&str>, Some(prompt_mime));


            let mask_str = match serde_json::to_string(&param_mask) {
                Ok(str) => str,
                Err(e) => return Err(ApiError(format!("Unable to serialize mask to string: {e}"))),
            };

            let mask_vec = mask_str.as_bytes().to_vec();
            let mask_mime = mime::Mime::from_str("application/json").expect("impossible to fail to parse");
            let mask_cursor = Cursor::new(mask_vec);

            multipart.add_stream("mask",  mask_cursor,  None as Option<&str>, Some(mask_mime));


            let model_str = match serde_json::to_string(&param_model) {
                Ok(str) => str,
                Err(e) => return Err(ApiError(format!("Unable to serialize model to string: {e}"))),
            };

            let model_vec = model_str.as_bytes().to_vec();
            let model_mime = mime::Mime::from_str("application/json").expect("impossible to fail to parse");
            let model_cursor = Cursor::new(model_vec);

            multipart.add_stream("model",  model_cursor,  None as Option<&str>, Some(model_mime));


            let n_str = match serde_json::to_string(&param_n) {
                Ok(str) => str,
                Err(e) => return Err(ApiError(format!("Unable to serialize n to string: {e}"))),
            };

            let n_vec = n_str.as_bytes().to_vec();
            let n_mime = mime::Mime::from_str("application/json").expect("impossible to fail to parse");
            let n_cursor = Cursor::new(n_vec);

            multipart.add_stream("n",  n_cursor,  None as Option<&str>, Some(n_mime));


            let size_str = match serde_json::to_string(&param_size) {
                Ok(str) => str,
                Err(e) => return Err(ApiError(format!("Unable to serialize size to string: {e}"))),
            };

            let size_vec = size_str.as_bytes().to_vec();
            let size_mime = mime::Mime::from_str("application/json").expect("impossible to fail to parse");
            let size_cursor = Cursor::new(size_vec);

            multipart.add_stream("size",  size_cursor,  None as Option<&str>, Some(size_mime));


            let response_format_str = match serde_json::to_string(&param_response_format) {
                Ok(str) => str,
                Err(e) => return Err(ApiError(format!("Unable to serialize response_format to string: {e}"))),
            };

            let response_format_vec = response_format_str.as_bytes().to_vec();
            let response_format_mime = mime::Mime::from_str("application/json").expect("impossible to fail to parse");
            let response_format_cursor = Cursor::new(response_format_vec);

            multipart.add_stream("response_format",  response_format_cursor,  None as Option<&str>, Some(response_format_mime));


            let user_str = match serde_json::to_string(&param_user) {
                Ok(str) => str,
                Err(e) => return Err(ApiError(format!("Unable to serialize user to string: {e}"))),
            };

            let user_vec = user_str.as_bytes().to_vec();
            let user_mime = mime::Mime::from_str("application/json").expect("impossible to fail to parse");
            let user_cursor = Cursor::new(user_vec);

            multipart.add_stream("user",  user_cursor,  None as Option<&str>, Some(user_mime));


            let mut fields = match multipart.prepare() {
                Ok(fields) => fields,
                Err(err) => return Err(ApiError(format!("Unable to build request: {err}"))),
            };

            let mut body_bytes = Vec::new();

            match fields.read_to_end(&mut body_bytes) {
                Ok(_) => (),
                Err(err) => return Err(ApiError(format!("Unable to build body: {err}"))),
            }

            let boundary = fields.boundary();

            let multipart_header = format!("multipart/form-data;boundary={boundary}");

            (body_bytes, multipart_header)
          };

        *request.body_mut() = BoxBody::new(Full::new(Bytes::from(body_bytes)));

        request.headers_mut().insert(CONTENT_TYPE, match HeaderValue::from_str(&multipart_header) {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create header: {multipart_header} - {e}")))
        });


        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {e}")))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            use headers::authorization::Credentials;
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(ref bearer_header) => {
                    let header = match headers::Authorization::bearer(&bearer_header.to_string()) {
                        Ok(h) => h,
                        Err(e) => return Err(ApiError(format!("Unable to create Authorization header: {e}")))
                    };
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        header.0.encode());
                },
                _ => {}
            }
        }

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {e}"))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = http_body_util::BodyExt::collect(body)
                        .await
                        .map(|f| f.to_bytes().to_vec())
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e.into())))?;

                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {e}")))?;
                let body = serde_json::from_str::<models::ImagesResponse>(body)
                    .map_err(|e| ApiError(format!("Response body did not match the schema: {e}")))?;


                Ok(CreateImageEditResponse::OK
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = http_body_util::BodyExt::collect(response.into_body())
                        .await
                        .map(|f| f.to_bytes().to_vec());
                Err(ApiError(format!("Unexpected response code {code}:\n{headers:?}\n\n{}",
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {e:?}>"),
                        },
                        Err(e) => format!("<Failed to read body: {}>", Into::<crate::ServiceError>::into(e)),
                    }
                )))
            }
        }
    }

    #[allow(clippy::vec_init_then_push)]
    async fn create_image_variation(
        &self,
        param_image: swagger::ByteArray,
        param_model: Option<swagger::Nullable<models::CreateImageEditRequestModel>>,
        param_n: Option<swagger::Nullable<i32>>,
        param_response_format: Option<swagger::Nullable<models::CreateImageRequestResponseFormat>>,
        param_size: Option<swagger::Nullable<models::CreateImageEditRequestSize>>,
        param_user: Option<String>,
        context: &C) -> Result<CreateImageVariationResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        #[allow(clippy::uninlined_format_args)]
        let mut uri = format!(
            "{}/v1/images/variations",
            self.base_path
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {err}"))),
        };

        let mut request = match Request::builder()
            .method("POST")
            .uri(uri)
            .body(BoxBody::new(http_body_util::Empty::new())) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {e}")))
        };

        // Consumes multipart/form body
        let (body_bytes, multipart_header) = {
            let mut multipart = Multipart::new();

            // For each parameter, encode as appropriate and add to the multipart body as a stream.

            let image_str = match serde_json::to_string(&param_image) {
                Ok(str) => str,
                Err(e) => return Err(ApiError(format!("Unable to serialize image to string: {e}"))),
            };

            let image_vec = image_str.as_bytes().to_vec();
            let image_mime = mime::Mime::from_str("application/json").expect("impossible to fail to parse");
            let image_cursor = Cursor::new(image_vec);

            multipart.add_stream("image",  image_cursor,  None as Option<&str>, Some(image_mime));


            let model_str = match serde_json::to_string(&param_model) {
                Ok(str) => str,
                Err(e) => return Err(ApiError(format!("Unable to serialize model to string: {e}"))),
            };

            let model_vec = model_str.as_bytes().to_vec();
            let model_mime = mime::Mime::from_str("application/json").expect("impossible to fail to parse");
            let model_cursor = Cursor::new(model_vec);

            multipart.add_stream("model",  model_cursor,  None as Option<&str>, Some(model_mime));


            let n_str = match serde_json::to_string(&param_n) {
                Ok(str) => str,
                Err(e) => return Err(ApiError(format!("Unable to serialize n to string: {e}"))),
            };

            let n_vec = n_str.as_bytes().to_vec();
            let n_mime = mime::Mime::from_str("application/json").expect("impossible to fail to parse");
            let n_cursor = Cursor::new(n_vec);

            multipart.add_stream("n",  n_cursor,  None as Option<&str>, Some(n_mime));


            let response_format_str = match serde_json::to_string(&param_response_format) {
                Ok(str) => str,
                Err(e) => return Err(ApiError(format!("Unable to serialize response_format to string: {e}"))),
            };

            let response_format_vec = response_format_str.as_bytes().to_vec();
            let response_format_mime = mime::Mime::from_str("application/json").expect("impossible to fail to parse");
            let response_format_cursor = Cursor::new(response_format_vec);

            multipart.add_stream("response_format",  response_format_cursor,  None as Option<&str>, Some(response_format_mime));


            let size_str = match serde_json::to_string(&param_size) {
                Ok(str) => str,
                Err(e) => return Err(ApiError(format!("Unable to serialize size to string: {e}"))),
            };

            let size_vec = size_str.as_bytes().to_vec();
            let size_mime = mime::Mime::from_str("application/json").expect("impossible to fail to parse");
            let size_cursor = Cursor::new(size_vec);

            multipart.add_stream("size",  size_cursor,  None as Option<&str>, Some(size_mime));


            let user_str = match serde_json::to_string(&param_user) {
                Ok(str) => str,
                Err(e) => return Err(ApiError(format!("Unable to serialize user to string: {e}"))),
            };

            let user_vec = user_str.as_bytes().to_vec();
            let user_mime = mime::Mime::from_str("application/json").expect("impossible to fail to parse");
            let user_cursor = Cursor::new(user_vec);

            multipart.add_stream("user",  user_cursor,  None as Option<&str>, Some(user_mime));


            let mut fields = match multipart.prepare() {
                Ok(fields) => fields,
                Err(err) => return Err(ApiError(format!("Unable to build request: {err}"))),
            };

            let mut body_bytes = Vec::new();

            match fields.read_to_end(&mut body_bytes) {
                Ok(_) => (),
                Err(err) => return Err(ApiError(format!("Unable to build body: {err}"))),
            }

            let boundary = fields.boundary();

            let multipart_header = format!("multipart/form-data;boundary={boundary}");

            (body_bytes, multipart_header)
          };

        *request.body_mut() = BoxBody::new(Full::new(Bytes::from(body_bytes)));

        request.headers_mut().insert(CONTENT_TYPE, match HeaderValue::from_str(&multipart_header) {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create header: {multipart_header} - {e}")))
        });


        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {e}")))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            use headers::authorization::Credentials;
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(ref bearer_header) => {
                    let header = match headers::Authorization::bearer(&bearer_header.to_string()) {
                        Ok(h) => h,
                        Err(e) => return Err(ApiError(format!("Unable to create Authorization header: {e}")))
                    };
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        header.0.encode());
                },
                _ => {}
            }
        }

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {e}"))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = http_body_util::BodyExt::collect(body)
                        .await
                        .map(|f| f.to_bytes().to_vec())
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e.into())))?;

                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {e}")))?;
                let body = serde_json::from_str::<models::ImagesResponse>(body)
                    .map_err(|e| ApiError(format!("Response body did not match the schema: {e}")))?;


                Ok(CreateImageVariationResponse::OK
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = http_body_util::BodyExt::collect(response.into_body())
                        .await
                        .map(|f| f.to_bytes().to_vec());
                Err(ApiError(format!("Unexpected response code {code}:\n{headers:?}\n\n{}",
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {e:?}>"),
                        },
                        Err(e) => format!("<Failed to read body: {}>", Into::<crate::ServiceError>::into(e)),
                    }
                )))
            }
        }
    }

    #[allow(clippy::vec_init_then_push)]
    async fn list_models(
        &self,
        context: &C) -> Result<ListModelsResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        #[allow(clippy::uninlined_format_args)]
        let mut uri = format!(
            "{}/v1/models",
            self.base_path
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {err}"))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(BoxBody::new(http_body_util::Empty::new())) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {e}")))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {e}")))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            use headers::authorization::Credentials;
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(ref bearer_header) => {
                    let header = match headers::Authorization::bearer(&bearer_header.to_string()) {
                        Ok(h) => h,
                        Err(e) => return Err(ApiError(format!("Unable to create Authorization header: {e}")))
                    };
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        header.0.encode());
                },
                _ => {}
            }
        }

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {e}"))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = http_body_util::BodyExt::collect(body)
                        .await
                        .map(|f| f.to_bytes().to_vec())
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e.into())))?;

                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {e}")))?;
                let body = serde_json::from_str::<models::ListModelsResponse>(body)
                    .map_err(|e| ApiError(format!("Response body did not match the schema: {e}")))?;


                Ok(ListModelsResponse::OK
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = http_body_util::BodyExt::collect(response.into_body())
                        .await
                        .map(|f| f.to_bytes().to_vec());
                Err(ApiError(format!("Unexpected response code {code}:\n{headers:?}\n\n{}",
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {e:?}>"),
                        },
                        Err(e) => format!("<Failed to read body: {}>", Into::<crate::ServiceError>::into(e)),
                    }
                )))
            }
        }
    }

    #[allow(clippy::vec_init_then_push)]
    async fn delete_model(
        &self,
        param_model: String,
        context: &C) -> Result<DeleteModelResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        #[allow(clippy::uninlined_format_args)]
        let mut uri = format!(
            "{}/v1/models/{model}",
            self.base_path
            ,model=utf8_percent_encode(&param_model.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {err}"))),
        };

        let mut request = match Request::builder()
            .method("DELETE")
            .uri(uri)
            .body(BoxBody::new(http_body_util::Empty::new())) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {e}")))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {e}")))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            use headers::authorization::Credentials;
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(ref bearer_header) => {
                    let header = match headers::Authorization::bearer(&bearer_header.to_string()) {
                        Ok(h) => h,
                        Err(e) => return Err(ApiError(format!("Unable to create Authorization header: {e}")))
                    };
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        header.0.encode());
                },
                _ => {}
            }
        }

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {e}"))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = http_body_util::BodyExt::collect(body)
                        .await
                        .map(|f| f.to_bytes().to_vec())
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e.into())))?;

                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {e}")))?;
                let body = serde_json::from_str::<models::DeleteModelResponse>(body)
                    .map_err(|e| ApiError(format!("Response body did not match the schema: {e}")))?;


                Ok(DeleteModelResponse::OK
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = http_body_util::BodyExt::collect(response.into_body())
                        .await
                        .map(|f| f.to_bytes().to_vec());
                Err(ApiError(format!("Unexpected response code {code}:\n{headers:?}\n\n{}",
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {e:?}>"),
                        },
                        Err(e) => format!("<Failed to read body: {}>", Into::<crate::ServiceError>::into(e)),
                    }
                )))
            }
        }
    }

    #[allow(clippy::vec_init_then_push)]
    async fn retrieve_model(
        &self,
        param_model: String,
        context: &C) -> Result<RetrieveModelResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        #[allow(clippy::uninlined_format_args)]
        let mut uri = format!(
            "{}/v1/models/{model}",
            self.base_path
            ,model=utf8_percent_encode(&param_model.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {err}"))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(BoxBody::new(http_body_util::Empty::new())) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {e}")))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {e}")))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            use headers::authorization::Credentials;
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(ref bearer_header) => {
                    let header = match headers::Authorization::bearer(&bearer_header.to_string()) {
                        Ok(h) => h,
                        Err(e) => return Err(ApiError(format!("Unable to create Authorization header: {e}")))
                    };
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        header.0.encode());
                },
                _ => {}
            }
        }

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {e}"))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = http_body_util::BodyExt::collect(body)
                        .await
                        .map(|f| f.to_bytes().to_vec())
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e.into())))?;

                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {e}")))?;
                let body = serde_json::from_str::<models::Model>(body)
                    .map_err(|e| ApiError(format!("Response body did not match the schema: {e}")))?;


                Ok(RetrieveModelResponse::OK
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = http_body_util::BodyExt::collect(response.into_body())
                        .await
                        .map(|f| f.to_bytes().to_vec());
                Err(ApiError(format!("Unexpected response code {code}:\n{headers:?}\n\n{}",
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {e:?}>"),
                        },
                        Err(e) => format!("<Failed to read body: {}>", Into::<crate::ServiceError>::into(e)),
                    }
                )))
            }
        }
    }

    #[allow(clippy::vec_init_then_push)]
    async fn create_moderation(
        &self,
        param_create_moderation_request: models::CreateModerationRequest,
        context: &C) -> Result<CreateModerationResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        #[allow(clippy::uninlined_format_args)]
        let mut uri = format!(
            "{}/v1/moderations",
            self.base_path
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {err}"))),
        };

        let mut request = match Request::builder()
            .method("POST")
            .uri(uri)
            .body(BoxBody::new(http_body_util::Empty::new())) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {e}")))
        };

        // Consumes basic body
        // Body parameter
        let body = serde_json::to_string(&param_create_moderation_request).expect("impossible to fail to serialize");
        *request.body_mut() = body_from_string(body);

        let header = "application/json";
        request.headers_mut().insert(CONTENT_TYPE, HeaderValue::from_static(header));

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {e}")))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            use headers::authorization::Credentials;
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(ref bearer_header) => {
                    let header = match headers::Authorization::bearer(&bearer_header.to_string()) {
                        Ok(h) => h,
                        Err(e) => return Err(ApiError(format!("Unable to create Authorization header: {e}")))
                    };
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        header.0.encode());
                },
                _ => {}
            }
        }

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {e}"))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = http_body_util::BodyExt::collect(body)
                        .await
                        .map(|f| f.to_bytes().to_vec())
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e.into())))?;

                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {e}")))?;
                let body = serde_json::from_str::<models::CreateModerationResponse>(body)
                    .map_err(|e| ApiError(format!("Response body did not match the schema: {e}")))?;


                Ok(CreateModerationResponse::OK
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = http_body_util::BodyExt::collect(response.into_body())
                        .await
                        .map(|f| f.to_bytes().to_vec());
                Err(ApiError(format!("Unexpected response code {code}:\n{headers:?}\n\n{}",
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {e:?}>"),
                        },
                        Err(e) => format!("<Failed to read body: {}>", Into::<crate::ServiceError>::into(e)),
                    }
                )))
            }
        }
    }

}
