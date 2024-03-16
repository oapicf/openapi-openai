use futures::{future, future::BoxFuture, Stream, stream, future::FutureExt, stream::TryStreamExt};
use hyper::{Request, Response, StatusCode, Body, HeaderMap};
use hyper::header::{HeaderName, HeaderValue, CONTENT_TYPE};
use log::warn;
#[allow(unused_imports)]
use std::convert::{TryFrom, TryInto};
use std::error::Error;
use std::future::Future;
use std::marker::PhantomData;
use std::task::{Context, Poll};
use swagger::{ApiError, BodyExt, Has, RequestParser, XSpanIdString};
pub use swagger::auth::Authorization;
use swagger::auth::Scopes;
use url::form_urlencoded;
use multipart::server::Multipart;
use multipart::server::save::SaveResult;

#[allow(unused_imports)]
use crate::models;
use crate::header;

pub use crate::context;

type ServiceFuture = BoxFuture<'static, Result<Response<Body>, crate::ServiceError>>;

use crate::{Api,
     CancelFineTuneResponse,
     CreateChatCompletionResponse,
     CreateCompletionResponse,
     CreateEditResponse,
     CreateEmbeddingResponse,
     CreateFileResponse,
     CreateFineTuneResponse,
     CreateImageResponse,
     CreateImageEditResponse,
     CreateImageVariationResponse,
     CreateModerationResponse,
     CreateTranscriptionResponse,
     CreateTranslationResponse,
     DeleteFileResponse,
     DeleteModelResponse,
     DownloadFileResponse,
     ListFilesResponse,
     ListFineTuneEventsResponse,
     ListFineTunesResponse,
     ListModelsResponse,
     RetrieveFileResponse,
     RetrieveFineTuneResponse,
     RetrieveModelResponse
};

mod paths {
    use lazy_static::lazy_static;

    lazy_static! {
        pub static ref GLOBAL_REGEX_SET: regex::RegexSet = regex::RegexSet::new(vec![
            r"^/v1/audio/transcriptions$",
            r"^/v1/audio/translations$",
            r"^/v1/chat/completions$",
            r"^/v1/completions$",
            r"^/v1/edits$",
            r"^/v1/embeddings$",
            r"^/v1/files$",
            r"^/v1/files/(?P<file_id>[^/?#]*)$",
            r"^/v1/files/(?P<file_id>[^/?#]*)/content$",
            r"^/v1/fine-tunes$",
            r"^/v1/fine-tunes/(?P<fine_tune_id>[^/?#]*)$",
            r"^/v1/fine-tunes/(?P<fine_tune_id>[^/?#]*)/cancel$",
            r"^/v1/fine-tunes/(?P<fine_tune_id>[^/?#]*)/events$",
            r"^/v1/images/edits$",
            r"^/v1/images/generations$",
            r"^/v1/images/variations$",
            r"^/v1/models$",
            r"^/v1/models/(?P<model>[^/?#]*)$",
            r"^/v1/moderations$"
        ])
        .expect("Unable to create global regex set");
    }
    pub(crate) static ID_AUDIO_TRANSCRIPTIONS: usize = 0;
    pub(crate) static ID_AUDIO_TRANSLATIONS: usize = 1;
    pub(crate) static ID_CHAT_COMPLETIONS: usize = 2;
    pub(crate) static ID_COMPLETIONS: usize = 3;
    pub(crate) static ID_EDITS: usize = 4;
    pub(crate) static ID_EMBEDDINGS: usize = 5;
    pub(crate) static ID_FILES: usize = 6;
    pub(crate) static ID_FILES_FILE_ID: usize = 7;
    lazy_static! {
        pub static ref REGEX_FILES_FILE_ID: regex::Regex =
            #[allow(clippy::invalid_regex)]
            regex::Regex::new(r"^/v1/files/(?P<file_id>[^/?#]*)$")
                .expect("Unable to create regex for FILES_FILE_ID");
    }
    pub(crate) static ID_FILES_FILE_ID_CONTENT: usize = 8;
    lazy_static! {
        pub static ref REGEX_FILES_FILE_ID_CONTENT: regex::Regex =
            #[allow(clippy::invalid_regex)]
            regex::Regex::new(r"^/v1/files/(?P<file_id>[^/?#]*)/content$")
                .expect("Unable to create regex for FILES_FILE_ID_CONTENT");
    }
    pub(crate) static ID_FINE_TUNES: usize = 9;
    pub(crate) static ID_FINE_TUNES_FINE_TUNE_ID: usize = 10;
    lazy_static! {
        pub static ref REGEX_FINE_TUNES_FINE_TUNE_ID: regex::Regex =
            #[allow(clippy::invalid_regex)]
            regex::Regex::new(r"^/v1/fine-tunes/(?P<fine_tune_id>[^/?#]*)$")
                .expect("Unable to create regex for FINE_TUNES_FINE_TUNE_ID");
    }
    pub(crate) static ID_FINE_TUNES_FINE_TUNE_ID_CANCEL: usize = 11;
    lazy_static! {
        pub static ref REGEX_FINE_TUNES_FINE_TUNE_ID_CANCEL: regex::Regex =
            #[allow(clippy::invalid_regex)]
            regex::Regex::new(r"^/v1/fine-tunes/(?P<fine_tune_id>[^/?#]*)/cancel$")
                .expect("Unable to create regex for FINE_TUNES_FINE_TUNE_ID_CANCEL");
    }
    pub(crate) static ID_FINE_TUNES_FINE_TUNE_ID_EVENTS: usize = 12;
    lazy_static! {
        pub static ref REGEX_FINE_TUNES_FINE_TUNE_ID_EVENTS: regex::Regex =
            #[allow(clippy::invalid_regex)]
            regex::Regex::new(r"^/v1/fine-tunes/(?P<fine_tune_id>[^/?#]*)/events$")
                .expect("Unable to create regex for FINE_TUNES_FINE_TUNE_ID_EVENTS");
    }
    pub(crate) static ID_IMAGES_EDITS: usize = 13;
    pub(crate) static ID_IMAGES_GENERATIONS: usize = 14;
    pub(crate) static ID_IMAGES_VARIATIONS: usize = 15;
    pub(crate) static ID_MODELS: usize = 16;
    pub(crate) static ID_MODELS_MODEL: usize = 17;
    lazy_static! {
        pub static ref REGEX_MODELS_MODEL: regex::Regex =
            #[allow(clippy::invalid_regex)]
            regex::Regex::new(r"^/v1/models/(?P<model>[^/?#]*)$")
                .expect("Unable to create regex for MODELS_MODEL");
    }
    pub(crate) static ID_MODERATIONS: usize = 18;
}

pub struct MakeService<T, C> where
    T: Api<C> + Clone + Send + 'static,
    C: Has<XSpanIdString>  + Send + Sync + 'static
{
    api_impl: T,
    marker: PhantomData<C>,
}

impl<T, C> MakeService<T, C> where
    T: Api<C> + Clone + Send + 'static,
    C: Has<XSpanIdString>  + Send + Sync + 'static
{
    pub fn new(api_impl: T) -> Self {
        MakeService {
            api_impl,
            marker: PhantomData
        }
    }
}

impl<T, C, Target> hyper::service::Service<Target> for MakeService<T, C> where
    T: Api<C> + Clone + Send + 'static,
    C: Has<XSpanIdString>  + Send + Sync + 'static
{
    type Response = Service<T, C>;
    type Error = crate::ServiceError;
    type Future = future::Ready<Result<Self::Response, Self::Error>>;

    fn poll_ready(&mut self, cx: &mut Context<'_>) -> Poll<Result<(), Self::Error>> {
        Poll::Ready(Ok(()))
    }

    fn call(&mut self, target: Target) -> Self::Future {
        futures::future::ok(Service::new(
            self.api_impl.clone(),
        ))
    }
}

fn method_not_allowed() -> Result<Response<Body>, crate::ServiceError> {
    Ok(
        Response::builder().status(StatusCode::METHOD_NOT_ALLOWED)
            .body(Body::empty())
            .expect("Unable to create Method Not Allowed response")
    )
}

pub struct Service<T, C> where
    T: Api<C> + Clone + Send + 'static,
    C: Has<XSpanIdString>  + Send + Sync + 'static
{
    api_impl: T,
    marker: PhantomData<C>,
}

impl<T, C> Service<T, C> where
    T: Api<C> + Clone + Send + 'static,
    C: Has<XSpanIdString>  + Send + Sync + 'static
{
    pub fn new(api_impl: T) -> Self {
        Service {
            api_impl,
            marker: PhantomData
        }
    }
}

impl<T, C> Clone for Service<T, C> where
    T: Api<C> + Clone + Send + 'static,
    C: Has<XSpanIdString>  + Send + Sync + 'static
{
    fn clone(&self) -> Self {
        Service {
            api_impl: self.api_impl.clone(),
            marker: self.marker,
        }
    }
}

impl<T, C> hyper::service::Service<(Request<Body>, C)> for Service<T, C> where
    T: Api<C> + Clone + Send + Sync + 'static,
    C: Has<XSpanIdString>  + Send + Sync + 'static
{
    type Response = Response<Body>;
    type Error = crate::ServiceError;
    type Future = ServiceFuture;

    fn poll_ready(&mut self, cx: &mut Context) -> Poll<Result<(), Self::Error>> {
        self.api_impl.poll_ready(cx)
    }

    fn call(&mut self, req: (Request<Body>, C)) -> Self::Future { async fn run<T, C>(mut api_impl: T, req: (Request<Body>, C)) -> Result<Response<Body>, crate::ServiceError> where
        T: Api<C> + Clone + Send + 'static,
        C: Has<XSpanIdString>  + Send + Sync + 'static
    {
        let (request, context) = req;
        let (parts, body) = request.into_parts();
        let (method, uri, headers) = (parts.method, parts.uri, parts.headers);
        let path = paths::GLOBAL_REGEX_SET.matches(uri.path());

        match method {

            // CancelFineTune - POST /fine-tunes/{fine_tune_id}/cancel
            hyper::Method::POST if path.matched(paths::ID_FINE_TUNES_FINE_TUNE_ID_CANCEL) => {
                // Path parameters
                let path: &str = uri.path();
                let path_params =
                    paths::REGEX_FINE_TUNES_FINE_TUNE_ID_CANCEL
                    .captures(path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE FINE_TUNES_FINE_TUNE_ID_CANCEL in set but failed match against \"{}\"", path, paths::REGEX_FINE_TUNES_FINE_TUNE_ID_CANCEL.as_str())
                    );

                let param_fine_tune_id = match percent_encoding::percent_decode(path_params["fine_tune_id"].as_bytes()).decode_utf8() {
                    Ok(param_fine_tune_id) => match param_fine_tune_id.parse::<String>() {
                        Ok(param_fine_tune_id) => param_fine_tune_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter fine_tune_id: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["fine_tune_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                                let result = api_impl.cancel_fine_tune(
                                            param_fine_tune_id,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                CancelFineTuneResponse::OK
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for CANCEL_FINE_TUNE_OK"));
                                                    let body_content = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body_content);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // CreateChatCompletion - POST /chat/completions
            hyper::Method::POST if path.matched(paths::ID_CHAT_COMPLETIONS) => {
                // Body parameters (note that non-required body parameters will ignore garbage
                // values, rather than causing a 400 response). Produce warning header and logs for
                // any unused fields.
                let result = body.into_raw().await;
                match result {
                            Ok(body) => {
                                let mut unused_elements = Vec::new();
                                let param_create_chat_completion_request: Option<models::CreateChatCompletionRequest> = if !body.is_empty() {
                                    let deserializer = &mut serde_json::Deserializer::from_slice(&body);
                                    match serde_ignored::deserialize(deserializer, |path| {
                                            warn!("Ignoring unknown field in body: {}", path);
                                            unused_elements.push(path.to_string());
                                    }) {
                                        Ok(param_create_chat_completion_request) => param_create_chat_completion_request,
                                        Err(e) => return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(Body::from(format!("Couldn't parse body parameter CreateChatCompletionRequest - doesn't match schema: {}", e)))
                                                        .expect("Unable to create Bad Request response for invalid body parameter CreateChatCompletionRequest due to schema")),
                                    }
                                } else {
                                    None
                                };
                                let param_create_chat_completion_request = match param_create_chat_completion_request {
                                    Some(param_create_chat_completion_request) => param_create_chat_completion_request,
                                    None => return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(Body::from("Missing required body parameter CreateChatCompletionRequest"))
                                                        .expect("Unable to create Bad Request response for missing body parameter CreateChatCompletionRequest")),
                                };

                                let result = api_impl.create_chat_completion(
                                            param_create_chat_completion_request,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        if !unused_elements.is_empty() {
                                            response.headers_mut().insert(
                                                HeaderName::from_static("warning"),
                                                HeaderValue::from_str(format!("Ignoring unknown fields in body: {:?}", unused_elements).as_str())
                                                    .expect("Unable to create Warning header value"));
                                        }

                                        match result {
                                            Ok(rsp) => match rsp {
                                                CreateChatCompletionResponse::OK
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for CREATE_CHAT_COMPLETION_OK"));
                                                    let body_content = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body_content);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
                            },
                            Err(e) => Ok(Response::builder()
                                                .status(StatusCode::BAD_REQUEST)
                                                .body(Body::from(format!("Couldn't read body parameter CreateChatCompletionRequest: {}", e)))
                                                .expect("Unable to create Bad Request response due to unable to read body parameter CreateChatCompletionRequest")),
                        }
            },

            // CreateCompletion - POST /completions
            hyper::Method::POST if path.matched(paths::ID_COMPLETIONS) => {
                // Body parameters (note that non-required body parameters will ignore garbage
                // values, rather than causing a 400 response). Produce warning header and logs for
                // any unused fields.
                let result = body.into_raw().await;
                match result {
                            Ok(body) => {
                                let mut unused_elements = Vec::new();
                                let param_create_completion_request: Option<models::CreateCompletionRequest> = if !body.is_empty() {
                                    let deserializer = &mut serde_json::Deserializer::from_slice(&body);
                                    match serde_ignored::deserialize(deserializer, |path| {
                                            warn!("Ignoring unknown field in body: {}", path);
                                            unused_elements.push(path.to_string());
                                    }) {
                                        Ok(param_create_completion_request) => param_create_completion_request,
                                        Err(e) => return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(Body::from(format!("Couldn't parse body parameter CreateCompletionRequest - doesn't match schema: {}", e)))
                                                        .expect("Unable to create Bad Request response for invalid body parameter CreateCompletionRequest due to schema")),
                                    }
                                } else {
                                    None
                                };
                                let param_create_completion_request = match param_create_completion_request {
                                    Some(param_create_completion_request) => param_create_completion_request,
                                    None => return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(Body::from("Missing required body parameter CreateCompletionRequest"))
                                                        .expect("Unable to create Bad Request response for missing body parameter CreateCompletionRequest")),
                                };

                                let result = api_impl.create_completion(
                                            param_create_completion_request,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        if !unused_elements.is_empty() {
                                            response.headers_mut().insert(
                                                HeaderName::from_static("warning"),
                                                HeaderValue::from_str(format!("Ignoring unknown fields in body: {:?}", unused_elements).as_str())
                                                    .expect("Unable to create Warning header value"));
                                        }

                                        match result {
                                            Ok(rsp) => match rsp {
                                                CreateCompletionResponse::OK
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for CREATE_COMPLETION_OK"));
                                                    let body_content = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body_content);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
                            },
                            Err(e) => Ok(Response::builder()
                                                .status(StatusCode::BAD_REQUEST)
                                                .body(Body::from(format!("Couldn't read body parameter CreateCompletionRequest: {}", e)))
                                                .expect("Unable to create Bad Request response due to unable to read body parameter CreateCompletionRequest")),
                        }
            },

            // CreateEdit - POST /edits
            hyper::Method::POST if path.matched(paths::ID_EDITS) => {
                // Body parameters (note that non-required body parameters will ignore garbage
                // values, rather than causing a 400 response). Produce warning header and logs for
                // any unused fields.
                let result = body.into_raw().await;
                match result {
                            Ok(body) => {
                                let mut unused_elements = Vec::new();
                                let param_create_edit_request: Option<models::CreateEditRequest> = if !body.is_empty() {
                                    let deserializer = &mut serde_json::Deserializer::from_slice(&body);
                                    match serde_ignored::deserialize(deserializer, |path| {
                                            warn!("Ignoring unknown field in body: {}", path);
                                            unused_elements.push(path.to_string());
                                    }) {
                                        Ok(param_create_edit_request) => param_create_edit_request,
                                        Err(e) => return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(Body::from(format!("Couldn't parse body parameter CreateEditRequest - doesn't match schema: {}", e)))
                                                        .expect("Unable to create Bad Request response for invalid body parameter CreateEditRequest due to schema")),
                                    }
                                } else {
                                    None
                                };
                                let param_create_edit_request = match param_create_edit_request {
                                    Some(param_create_edit_request) => param_create_edit_request,
                                    None => return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(Body::from("Missing required body parameter CreateEditRequest"))
                                                        .expect("Unable to create Bad Request response for missing body parameter CreateEditRequest")),
                                };

                                let result = api_impl.create_edit(
                                            param_create_edit_request,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        if !unused_elements.is_empty() {
                                            response.headers_mut().insert(
                                                HeaderName::from_static("warning"),
                                                HeaderValue::from_str(format!("Ignoring unknown fields in body: {:?}", unused_elements).as_str())
                                                    .expect("Unable to create Warning header value"));
                                        }

                                        match result {
                                            Ok(rsp) => match rsp {
                                                CreateEditResponse::OK
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for CREATE_EDIT_OK"));
                                                    let body_content = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body_content);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
                            },
                            Err(e) => Ok(Response::builder()
                                                .status(StatusCode::BAD_REQUEST)
                                                .body(Body::from(format!("Couldn't read body parameter CreateEditRequest: {}", e)))
                                                .expect("Unable to create Bad Request response due to unable to read body parameter CreateEditRequest")),
                        }
            },

            // CreateEmbedding - POST /embeddings
            hyper::Method::POST if path.matched(paths::ID_EMBEDDINGS) => {
                // Body parameters (note that non-required body parameters will ignore garbage
                // values, rather than causing a 400 response). Produce warning header and logs for
                // any unused fields.
                let result = body.into_raw().await;
                match result {
                            Ok(body) => {
                                let mut unused_elements = Vec::new();
                                let param_create_embedding_request: Option<models::CreateEmbeddingRequest> = if !body.is_empty() {
                                    let deserializer = &mut serde_json::Deserializer::from_slice(&body);
                                    match serde_ignored::deserialize(deserializer, |path| {
                                            warn!("Ignoring unknown field in body: {}", path);
                                            unused_elements.push(path.to_string());
                                    }) {
                                        Ok(param_create_embedding_request) => param_create_embedding_request,
                                        Err(e) => return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(Body::from(format!("Couldn't parse body parameter CreateEmbeddingRequest - doesn't match schema: {}", e)))
                                                        .expect("Unable to create Bad Request response for invalid body parameter CreateEmbeddingRequest due to schema")),
                                    }
                                } else {
                                    None
                                };
                                let param_create_embedding_request = match param_create_embedding_request {
                                    Some(param_create_embedding_request) => param_create_embedding_request,
                                    None => return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(Body::from("Missing required body parameter CreateEmbeddingRequest"))
                                                        .expect("Unable to create Bad Request response for missing body parameter CreateEmbeddingRequest")),
                                };

                                let result = api_impl.create_embedding(
                                            param_create_embedding_request,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        if !unused_elements.is_empty() {
                                            response.headers_mut().insert(
                                                HeaderName::from_static("warning"),
                                                HeaderValue::from_str(format!("Ignoring unknown fields in body: {:?}", unused_elements).as_str())
                                                    .expect("Unable to create Warning header value"));
                                        }

                                        match result {
                                            Ok(rsp) => match rsp {
                                                CreateEmbeddingResponse::OK
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for CREATE_EMBEDDING_OK"));
                                                    let body_content = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body_content);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
                            },
                            Err(e) => Ok(Response::builder()
                                                .status(StatusCode::BAD_REQUEST)
                                                .body(Body::from(format!("Couldn't read body parameter CreateEmbeddingRequest: {}", e)))
                                                .expect("Unable to create Bad Request response due to unable to read body parameter CreateEmbeddingRequest")),
                        }
            },

            // CreateFile - POST /files
            hyper::Method::POST if path.matched(paths::ID_FILES) => {
                let boundary = match swagger::multipart::form::boundary(&headers) {
                    Some(boundary) => boundary.to_string(),
                    None => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from("Couldn't find valid multipart body".to_string()))
                                .expect("Unable to create Bad Request response for incorrect boundary")),
                };

                // Form Body parameters (note that non-required body parameters will ignore garbage
                // values, rather than causing a 400 response). Produce warning header and logs for
                // any unused fields.
                let result = body.into_raw();
                match result.await {
                            Ok(body) => {
                                use std::io::Read;

                                // Read Form Parameters from body
                                let mut entries = match Multipart::with_body(&body.to_vec()[..], boundary).save().temp() {
                                    SaveResult::Full(entries) => {
                                        entries
                                    },
                                    _ => {
                                        return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(Body::from("Unable to process all message parts".to_string()))
                                                        .expect("Unable to create Bad Request response due to failure to process all message"))
                                    },
                                };
                                let field_file = entries.fields.remove("file");
                                let param_file = match field_file {
                                    Some(field) => {
                                        let mut reader = field[0].data.readable().expect("Unable to read field for file");
                                        let mut data = String::new();
                                        reader.read_to_string(&mut data).expect("Reading saved String should never fail");
                                        let file_model: swagger::ByteArray = match serde_json::from_str(&data) {
                                            Ok(model) => model,
                                            Err(e) => {
                                                return Ok(
                                                    Response::builder()
                                                    .status(StatusCode::BAD_REQUEST)
                                                    .body(Body::from(format!("file data does not match API definition : {}", e)))
                                                    .expect("Unable to create Bad Request due to missing required form parameter file"))
                                            }
                                        };
                                        file_model
                                    },
                                    None => {
                                        return Ok(
                                            Response::builder()
                                            .status(StatusCode::BAD_REQUEST)
                                            .body(Body::from("Missing required form parameter file".to_string()))
                                            .expect("Unable to create Bad Request due to missing required form parameter file"))
                                    }
                                };
                                let field_purpose = entries.fields.remove("purpose");
                                let param_purpose = match field_purpose {
                                    Some(field) => {
                                        let mut reader = field[0].data.readable().expect("Unable to read field for purpose");
                                        let mut data = String::new();
                                        reader.read_to_string(&mut data).expect("Reading saved String should never fail");
                                        let purpose_model: String = match serde_json::from_str(&data) {
                                            Ok(model) => model,
                                            Err(e) => {
                                                return Ok(
                                                    Response::builder()
                                                    .status(StatusCode::BAD_REQUEST)
                                                    .body(Body::from(format!("purpose data does not match API definition : {}", e)))
                                                    .expect("Unable to create Bad Request due to missing required form parameter purpose"))
                                            }
                                        };
                                        purpose_model
                                    },
                                    None => {
                                        return Ok(
                                            Response::builder()
                                            .status(StatusCode::BAD_REQUEST)
                                            .body(Body::from("Missing required form parameter purpose".to_string()))
                                            .expect("Unable to create Bad Request due to missing required form parameter purpose"))
                                    }
                                };
                                let result = api_impl.create_file(
                                            param_file,
                                            param_purpose,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                CreateFileResponse::OK
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for CREATE_FILE_OK"));
                                                    let body_content = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body_content);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
                            },
                            Err(e) => Ok(Response::builder()
                                                .status(StatusCode::BAD_REQUEST)
                                                .body(Body::from("Couldn't read multipart body".to_string()))
                                                .expect("Unable to create Bad Request response due to unable read multipart body")),
                        }
            },

            // CreateFineTune - POST /fine-tunes
            hyper::Method::POST if path.matched(paths::ID_FINE_TUNES) => {
                // Body parameters (note that non-required body parameters will ignore garbage
                // values, rather than causing a 400 response). Produce warning header and logs for
                // any unused fields.
                let result = body.into_raw().await;
                match result {
                            Ok(body) => {
                                let mut unused_elements = Vec::new();
                                let param_create_fine_tune_request: Option<models::CreateFineTuneRequest> = if !body.is_empty() {
                                    let deserializer = &mut serde_json::Deserializer::from_slice(&body);
                                    match serde_ignored::deserialize(deserializer, |path| {
                                            warn!("Ignoring unknown field in body: {}", path);
                                            unused_elements.push(path.to_string());
                                    }) {
                                        Ok(param_create_fine_tune_request) => param_create_fine_tune_request,
                                        Err(e) => return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(Body::from(format!("Couldn't parse body parameter CreateFineTuneRequest - doesn't match schema: {}", e)))
                                                        .expect("Unable to create Bad Request response for invalid body parameter CreateFineTuneRequest due to schema")),
                                    }
                                } else {
                                    None
                                };
                                let param_create_fine_tune_request = match param_create_fine_tune_request {
                                    Some(param_create_fine_tune_request) => param_create_fine_tune_request,
                                    None => return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(Body::from("Missing required body parameter CreateFineTuneRequest"))
                                                        .expect("Unable to create Bad Request response for missing body parameter CreateFineTuneRequest")),
                                };

                                let result = api_impl.create_fine_tune(
                                            param_create_fine_tune_request,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        if !unused_elements.is_empty() {
                                            response.headers_mut().insert(
                                                HeaderName::from_static("warning"),
                                                HeaderValue::from_str(format!("Ignoring unknown fields in body: {:?}", unused_elements).as_str())
                                                    .expect("Unable to create Warning header value"));
                                        }

                                        match result {
                                            Ok(rsp) => match rsp {
                                                CreateFineTuneResponse::OK
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for CREATE_FINE_TUNE_OK"));
                                                    let body_content = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body_content);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
                            },
                            Err(e) => Ok(Response::builder()
                                                .status(StatusCode::BAD_REQUEST)
                                                .body(Body::from(format!("Couldn't read body parameter CreateFineTuneRequest: {}", e)))
                                                .expect("Unable to create Bad Request response due to unable to read body parameter CreateFineTuneRequest")),
                        }
            },

            // CreateImage - POST /images/generations
            hyper::Method::POST if path.matched(paths::ID_IMAGES_GENERATIONS) => {
                // Body parameters (note that non-required body parameters will ignore garbage
                // values, rather than causing a 400 response). Produce warning header and logs for
                // any unused fields.
                let result = body.into_raw().await;
                match result {
                            Ok(body) => {
                                let mut unused_elements = Vec::new();
                                let param_create_image_request: Option<models::CreateImageRequest> = if !body.is_empty() {
                                    let deserializer = &mut serde_json::Deserializer::from_slice(&body);
                                    match serde_ignored::deserialize(deserializer, |path| {
                                            warn!("Ignoring unknown field in body: {}", path);
                                            unused_elements.push(path.to_string());
                                    }) {
                                        Ok(param_create_image_request) => param_create_image_request,
                                        Err(e) => return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(Body::from(format!("Couldn't parse body parameter CreateImageRequest - doesn't match schema: {}", e)))
                                                        .expect("Unable to create Bad Request response for invalid body parameter CreateImageRequest due to schema")),
                                    }
                                } else {
                                    None
                                };
                                let param_create_image_request = match param_create_image_request {
                                    Some(param_create_image_request) => param_create_image_request,
                                    None => return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(Body::from("Missing required body parameter CreateImageRequest"))
                                                        .expect("Unable to create Bad Request response for missing body parameter CreateImageRequest")),
                                };

                                let result = api_impl.create_image(
                                            param_create_image_request,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        if !unused_elements.is_empty() {
                                            response.headers_mut().insert(
                                                HeaderName::from_static("warning"),
                                                HeaderValue::from_str(format!("Ignoring unknown fields in body: {:?}", unused_elements).as_str())
                                                    .expect("Unable to create Warning header value"));
                                        }

                                        match result {
                                            Ok(rsp) => match rsp {
                                                CreateImageResponse::OK
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for CREATE_IMAGE_OK"));
                                                    let body_content = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body_content);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
                            },
                            Err(e) => Ok(Response::builder()
                                                .status(StatusCode::BAD_REQUEST)
                                                .body(Body::from(format!("Couldn't read body parameter CreateImageRequest: {}", e)))
                                                .expect("Unable to create Bad Request response due to unable to read body parameter CreateImageRequest")),
                        }
            },

            // CreateImageEdit - POST /images/edits
            hyper::Method::POST if path.matched(paths::ID_IMAGES_EDITS) => {
                let boundary = match swagger::multipart::form::boundary(&headers) {
                    Some(boundary) => boundary.to_string(),
                    None => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from("Couldn't find valid multipart body".to_string()))
                                .expect("Unable to create Bad Request response for incorrect boundary")),
                };

                // Form Body parameters (note that non-required body parameters will ignore garbage
                // values, rather than causing a 400 response). Produce warning header and logs for
                // any unused fields.
                let result = body.into_raw();
                match result.await {
                            Ok(body) => {
                                use std::io::Read;

                                // Read Form Parameters from body
                                let mut entries = match Multipart::with_body(&body.to_vec()[..], boundary).save().temp() {
                                    SaveResult::Full(entries) => {
                                        entries
                                    },
                                    _ => {
                                        return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(Body::from("Unable to process all message parts".to_string()))
                                                        .expect("Unable to create Bad Request response due to failure to process all message"))
                                    },
                                };
                                let field_image = entries.fields.remove("image");
                                let param_image = match field_image {
                                    Some(field) => {
                                        let mut reader = field[0].data.readable().expect("Unable to read field for image");
                                        let mut data = String::new();
                                        reader.read_to_string(&mut data).expect("Reading saved String should never fail");
                                        let image_model: swagger::ByteArray = match serde_json::from_str(&data) {
                                            Ok(model) => model,
                                            Err(e) => {
                                                return Ok(
                                                    Response::builder()
                                                    .status(StatusCode::BAD_REQUEST)
                                                    .body(Body::from(format!("image data does not match API definition : {}", e)))
                                                    .expect("Unable to create Bad Request due to missing required form parameter image"))
                                            }
                                        };
                                        image_model
                                    },
                                    None => {
                                        return Ok(
                                            Response::builder()
                                            .status(StatusCode::BAD_REQUEST)
                                            .body(Body::from("Missing required form parameter image".to_string()))
                                            .expect("Unable to create Bad Request due to missing required form parameter image"))
                                    }
                                };
                                let field_mask = entries.fields.remove("mask");
                                let param_mask = match field_mask {
                                    Some(field) => {
                                        let mut reader = field[0].data.readable().expect("Unable to read field for mask");
                                    Some({
                                        let mut data = String::new();
                                        reader.read_to_string(&mut data).expect("Reading saved String should never fail");
                                        let mask_model: swagger::ByteArray = match serde_json::from_str(&data) {
                                            Ok(model) => model,
                                            Err(e) => {
                                                return Ok(
                                                    Response::builder()
                                                    .status(StatusCode::BAD_REQUEST)
                                                    .body(Body::from(format!("mask data does not match API definition : {}", e)))
                                                    .expect("Unable to create Bad Request due to missing required form parameter mask"))
                                            }
                                        };
                                        mask_model
                                    })
                                    },
                                    None => {
                                            None
                                    }
                                };
                                let field_prompt = entries.fields.remove("prompt");
                                let param_prompt = match field_prompt {
                                    Some(field) => {
                                        let mut reader = field[0].data.readable().expect("Unable to read field for prompt");
                                        let mut data = String::new();
                                        reader.read_to_string(&mut data).expect("Reading saved String should never fail");
                                        let prompt_model: String = match serde_json::from_str(&data) {
                                            Ok(model) => model,
                                            Err(e) => {
                                                return Ok(
                                                    Response::builder()
                                                    .status(StatusCode::BAD_REQUEST)
                                                    .body(Body::from(format!("prompt data does not match API definition : {}", e)))
                                                    .expect("Unable to create Bad Request due to missing required form parameter prompt"))
                                            }
                                        };
                                        prompt_model
                                    },
                                    None => {
                                        return Ok(
                                            Response::builder()
                                            .status(StatusCode::BAD_REQUEST)
                                            .body(Body::from("Missing required form parameter prompt".to_string()))
                                            .expect("Unable to create Bad Request due to missing required form parameter prompt"))
                                    }
                                };
                                let field_n = entries.fields.remove("n");
                                let param_n = match field_n {
                                    Some(field) => {
                                        let mut reader = field[0].data.readable().expect("Unable to read field for n");
                                    Some({
                                        let mut data = String::new();
                                        reader.read_to_string(&mut data).expect("Reading saved String should never fail");
                                        let n_model: i32 = match serde_json::from_str(&data) {
                                            Ok(model) => model,
                                            Err(e) => {
                                                return Ok(
                                                    Response::builder()
                                                    .status(StatusCode::BAD_REQUEST)
                                                    .body(Body::from(format!("n data does not match API definition : {}", e)))
                                                    .expect("Unable to create Bad Request due to missing required form parameter n"))
                                            }
                                        };
                                        n_model
                                    })
                                    },
                                    None => {
                                            None
                                    }
                                };
                                let field_size = entries.fields.remove("size");
                                let param_size = match field_size {
                                    Some(field) => {
                                        let mut reader = field[0].data.readable().expect("Unable to read field for size");
                                    Some({
                                        let mut data = String::new();
                                        reader.read_to_string(&mut data).expect("Reading saved String should never fail");
                                        let size_model: String = match serde_json::from_str(&data) {
                                            Ok(model) => model,
                                            Err(e) => {
                                                return Ok(
                                                    Response::builder()
                                                    .status(StatusCode::BAD_REQUEST)
                                                    .body(Body::from(format!("size data does not match API definition : {}", e)))
                                                    .expect("Unable to create Bad Request due to missing required form parameter size"))
                                            }
                                        };
                                        size_model
                                    })
                                    },
                                    None => {
                                            None
                                    }
                                };
                                let field_response_format = entries.fields.remove("response_format");
                                let param_response_format = match field_response_format {
                                    Some(field) => {
                                        let mut reader = field[0].data.readable().expect("Unable to read field for response_format");
                                    Some({
                                        let mut data = String::new();
                                        reader.read_to_string(&mut data).expect("Reading saved String should never fail");
                                        let response_format_model: String = match serde_json::from_str(&data) {
                                            Ok(model) => model,
                                            Err(e) => {
                                                return Ok(
                                                    Response::builder()
                                                    .status(StatusCode::BAD_REQUEST)
                                                    .body(Body::from(format!("response_format data does not match API definition : {}", e)))
                                                    .expect("Unable to create Bad Request due to missing required form parameter response_format"))
                                            }
                                        };
                                        response_format_model
                                    })
                                    },
                                    None => {
                                            None
                                    }
                                };
                                let field_user = entries.fields.remove("user");
                                let param_user = match field_user {
                                    Some(field) => {
                                        let mut reader = field[0].data.readable().expect("Unable to read field for user");
                                    Some({
                                        let mut data = String::new();
                                        reader.read_to_string(&mut data).expect("Reading saved String should never fail");
                                        let user_model: String = match serde_json::from_str(&data) {
                                            Ok(model) => model,
                                            Err(e) => {
                                                return Ok(
                                                    Response::builder()
                                                    .status(StatusCode::BAD_REQUEST)
                                                    .body(Body::from(format!("user data does not match API definition : {}", e)))
                                                    .expect("Unable to create Bad Request due to missing required form parameter user"))
                                            }
                                        };
                                        user_model
                                    })
                                    },
                                    None => {
                                            None
                                    }
                                };
                                let result = api_impl.create_image_edit(
                                            param_image,
                                            param_prompt,
                                            param_mask,
                                            param_n,
                                            param_size,
                                            param_response_format,
                                            param_user,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                CreateImageEditResponse::OK
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for CREATE_IMAGE_EDIT_OK"));
                                                    let body_content = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body_content);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
                            },
                            Err(e) => Ok(Response::builder()
                                                .status(StatusCode::BAD_REQUEST)
                                                .body(Body::from("Couldn't read multipart body".to_string()))
                                                .expect("Unable to create Bad Request response due to unable read multipart body")),
                        }
            },

            // CreateImageVariation - POST /images/variations
            hyper::Method::POST if path.matched(paths::ID_IMAGES_VARIATIONS) => {
                let boundary = match swagger::multipart::form::boundary(&headers) {
                    Some(boundary) => boundary.to_string(),
                    None => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from("Couldn't find valid multipart body".to_string()))
                                .expect("Unable to create Bad Request response for incorrect boundary")),
                };

                // Form Body parameters (note that non-required body parameters will ignore garbage
                // values, rather than causing a 400 response). Produce warning header and logs for
                // any unused fields.
                let result = body.into_raw();
                match result.await {
                            Ok(body) => {
                                use std::io::Read;

                                // Read Form Parameters from body
                                let mut entries = match Multipart::with_body(&body.to_vec()[..], boundary).save().temp() {
                                    SaveResult::Full(entries) => {
                                        entries
                                    },
                                    _ => {
                                        return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(Body::from("Unable to process all message parts".to_string()))
                                                        .expect("Unable to create Bad Request response due to failure to process all message"))
                                    },
                                };
                                let field_image = entries.fields.remove("image");
                                let param_image = match field_image {
                                    Some(field) => {
                                        let mut reader = field[0].data.readable().expect("Unable to read field for image");
                                        let mut data = String::new();
                                        reader.read_to_string(&mut data).expect("Reading saved String should never fail");
                                        let image_model: swagger::ByteArray = match serde_json::from_str(&data) {
                                            Ok(model) => model,
                                            Err(e) => {
                                                return Ok(
                                                    Response::builder()
                                                    .status(StatusCode::BAD_REQUEST)
                                                    .body(Body::from(format!("image data does not match API definition : {}", e)))
                                                    .expect("Unable to create Bad Request due to missing required form parameter image"))
                                            }
                                        };
                                        image_model
                                    },
                                    None => {
                                        return Ok(
                                            Response::builder()
                                            .status(StatusCode::BAD_REQUEST)
                                            .body(Body::from("Missing required form parameter image".to_string()))
                                            .expect("Unable to create Bad Request due to missing required form parameter image"))
                                    }
                                };
                                let field_n = entries.fields.remove("n");
                                let param_n = match field_n {
                                    Some(field) => {
                                        let mut reader = field[0].data.readable().expect("Unable to read field for n");
                                    Some({
                                        let mut data = String::new();
                                        reader.read_to_string(&mut data).expect("Reading saved String should never fail");
                                        let n_model: i32 = match serde_json::from_str(&data) {
                                            Ok(model) => model,
                                            Err(e) => {
                                                return Ok(
                                                    Response::builder()
                                                    .status(StatusCode::BAD_REQUEST)
                                                    .body(Body::from(format!("n data does not match API definition : {}", e)))
                                                    .expect("Unable to create Bad Request due to missing required form parameter n"))
                                            }
                                        };
                                        n_model
                                    })
                                    },
                                    None => {
                                            None
                                    }
                                };
                                let field_size = entries.fields.remove("size");
                                let param_size = match field_size {
                                    Some(field) => {
                                        let mut reader = field[0].data.readable().expect("Unable to read field for size");
                                    Some({
                                        let mut data = String::new();
                                        reader.read_to_string(&mut data).expect("Reading saved String should never fail");
                                        let size_model: String = match serde_json::from_str(&data) {
                                            Ok(model) => model,
                                            Err(e) => {
                                                return Ok(
                                                    Response::builder()
                                                    .status(StatusCode::BAD_REQUEST)
                                                    .body(Body::from(format!("size data does not match API definition : {}", e)))
                                                    .expect("Unable to create Bad Request due to missing required form parameter size"))
                                            }
                                        };
                                        size_model
                                    })
                                    },
                                    None => {
                                            None
                                    }
                                };
                                let field_response_format = entries.fields.remove("response_format");
                                let param_response_format = match field_response_format {
                                    Some(field) => {
                                        let mut reader = field[0].data.readable().expect("Unable to read field for response_format");
                                    Some({
                                        let mut data = String::new();
                                        reader.read_to_string(&mut data).expect("Reading saved String should never fail");
                                        let response_format_model: String = match serde_json::from_str(&data) {
                                            Ok(model) => model,
                                            Err(e) => {
                                                return Ok(
                                                    Response::builder()
                                                    .status(StatusCode::BAD_REQUEST)
                                                    .body(Body::from(format!("response_format data does not match API definition : {}", e)))
                                                    .expect("Unable to create Bad Request due to missing required form parameter response_format"))
                                            }
                                        };
                                        response_format_model
                                    })
                                    },
                                    None => {
                                            None
                                    }
                                };
                                let field_user = entries.fields.remove("user");
                                let param_user = match field_user {
                                    Some(field) => {
                                        let mut reader = field[0].data.readable().expect("Unable to read field for user");
                                    Some({
                                        let mut data = String::new();
                                        reader.read_to_string(&mut data).expect("Reading saved String should never fail");
                                        let user_model: String = match serde_json::from_str(&data) {
                                            Ok(model) => model,
                                            Err(e) => {
                                                return Ok(
                                                    Response::builder()
                                                    .status(StatusCode::BAD_REQUEST)
                                                    .body(Body::from(format!("user data does not match API definition : {}", e)))
                                                    .expect("Unable to create Bad Request due to missing required form parameter user"))
                                            }
                                        };
                                        user_model
                                    })
                                    },
                                    None => {
                                            None
                                    }
                                };
                                let result = api_impl.create_image_variation(
                                            param_image,
                                            param_n,
                                            param_size,
                                            param_response_format,
                                            param_user,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                CreateImageVariationResponse::OK
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for CREATE_IMAGE_VARIATION_OK"));
                                                    let body_content = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body_content);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
                            },
                            Err(e) => Ok(Response::builder()
                                                .status(StatusCode::BAD_REQUEST)
                                                .body(Body::from("Couldn't read multipart body".to_string()))
                                                .expect("Unable to create Bad Request response due to unable read multipart body")),
                        }
            },

            // CreateModeration - POST /moderations
            hyper::Method::POST if path.matched(paths::ID_MODERATIONS) => {
                // Body parameters (note that non-required body parameters will ignore garbage
                // values, rather than causing a 400 response). Produce warning header and logs for
                // any unused fields.
                let result = body.into_raw().await;
                match result {
                            Ok(body) => {
                                let mut unused_elements = Vec::new();
                                let param_create_moderation_request: Option<models::CreateModerationRequest> = if !body.is_empty() {
                                    let deserializer = &mut serde_json::Deserializer::from_slice(&body);
                                    match serde_ignored::deserialize(deserializer, |path| {
                                            warn!("Ignoring unknown field in body: {}", path);
                                            unused_elements.push(path.to_string());
                                    }) {
                                        Ok(param_create_moderation_request) => param_create_moderation_request,
                                        Err(e) => return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(Body::from(format!("Couldn't parse body parameter CreateModerationRequest - doesn't match schema: {}", e)))
                                                        .expect("Unable to create Bad Request response for invalid body parameter CreateModerationRequest due to schema")),
                                    }
                                } else {
                                    None
                                };
                                let param_create_moderation_request = match param_create_moderation_request {
                                    Some(param_create_moderation_request) => param_create_moderation_request,
                                    None => return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(Body::from("Missing required body parameter CreateModerationRequest"))
                                                        .expect("Unable to create Bad Request response for missing body parameter CreateModerationRequest")),
                                };

                                let result = api_impl.create_moderation(
                                            param_create_moderation_request,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        if !unused_elements.is_empty() {
                                            response.headers_mut().insert(
                                                HeaderName::from_static("warning"),
                                                HeaderValue::from_str(format!("Ignoring unknown fields in body: {:?}", unused_elements).as_str())
                                                    .expect("Unable to create Warning header value"));
                                        }

                                        match result {
                                            Ok(rsp) => match rsp {
                                                CreateModerationResponse::OK
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for CREATE_MODERATION_OK"));
                                                    let body_content = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body_content);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
                            },
                            Err(e) => Ok(Response::builder()
                                                .status(StatusCode::BAD_REQUEST)
                                                .body(Body::from(format!("Couldn't read body parameter CreateModerationRequest: {}", e)))
                                                .expect("Unable to create Bad Request response due to unable to read body parameter CreateModerationRequest")),
                        }
            },

            // CreateTranscription - POST /audio/transcriptions
            hyper::Method::POST if path.matched(paths::ID_AUDIO_TRANSCRIPTIONS) => {
                let boundary = match swagger::multipart::form::boundary(&headers) {
                    Some(boundary) => boundary.to_string(),
                    None => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from("Couldn't find valid multipart body".to_string()))
                                .expect("Unable to create Bad Request response for incorrect boundary")),
                };

                // Form Body parameters (note that non-required body parameters will ignore garbage
                // values, rather than causing a 400 response). Produce warning header and logs for
                // any unused fields.
                let result = body.into_raw();
                match result.await {
                            Ok(body) => {
                                use std::io::Read;

                                // Read Form Parameters from body
                                let mut entries = match Multipart::with_body(&body.to_vec()[..], boundary).save().temp() {
                                    SaveResult::Full(entries) => {
                                        entries
                                    },
                                    _ => {
                                        return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(Body::from("Unable to process all message parts".to_string()))
                                                        .expect("Unable to create Bad Request response due to failure to process all message"))
                                    },
                                };
                                let field_file = entries.fields.remove("file");
                                let param_file = match field_file {
                                    Some(field) => {
                                        let mut reader = field[0].data.readable().expect("Unable to read field for file");
                                        let mut data = String::new();
                                        reader.read_to_string(&mut data).expect("Reading saved String should never fail");
                                        let file_model: swagger::ByteArray = match serde_json::from_str(&data) {
                                            Ok(model) => model,
                                            Err(e) => {
                                                return Ok(
                                                    Response::builder()
                                                    .status(StatusCode::BAD_REQUEST)
                                                    .body(Body::from(format!("file data does not match API definition : {}", e)))
                                                    .expect("Unable to create Bad Request due to missing required form parameter file"))
                                            }
                                        };
                                        file_model
                                    },
                                    None => {
                                        return Ok(
                                            Response::builder()
                                            .status(StatusCode::BAD_REQUEST)
                                            .body(Body::from("Missing required form parameter file".to_string()))
                                            .expect("Unable to create Bad Request due to missing required form parameter file"))
                                    }
                                };
                                let field_model = entries.fields.remove("model");
                                let param_model = match field_model {
                                    Some(field) => {
                                        let mut reader = field[0].data.readable().expect("Unable to read field for model");
                                        let mut data = String::new();
                                        reader.read_to_string(&mut data).expect("Reading saved String should never fail");
                                        let model_model: models::CreateTranscriptionRequestModel = match serde_json::from_str(&data) {
                                            Ok(model) => model,
                                            Err(e) => {
                                                return Ok(
                                                    Response::builder()
                                                    .status(StatusCode::BAD_REQUEST)
                                                    .body(Body::from(format!("model data does not match API definition : {}", e)))
                                                    .expect("Unable to create Bad Request due to missing required form parameter model"))
                                            }
                                        };
                                        model_model
                                    },
                                    None => {
                                        return Ok(
                                            Response::builder()
                                            .status(StatusCode::BAD_REQUEST)
                                            .body(Body::from("Missing required form parameter model".to_string()))
                                            .expect("Unable to create Bad Request due to missing required form parameter model"))
                                    }
                                };
                                let field_prompt = entries.fields.remove("prompt");
                                let param_prompt = match field_prompt {
                                    Some(field) => {
                                        let mut reader = field[0].data.readable().expect("Unable to read field for prompt");
                                    Some({
                                        let mut data = String::new();
                                        reader.read_to_string(&mut data).expect("Reading saved String should never fail");
                                        let prompt_model: String = match serde_json::from_str(&data) {
                                            Ok(model) => model,
                                            Err(e) => {
                                                return Ok(
                                                    Response::builder()
                                                    .status(StatusCode::BAD_REQUEST)
                                                    .body(Body::from(format!("prompt data does not match API definition : {}", e)))
                                                    .expect("Unable to create Bad Request due to missing required form parameter prompt"))
                                            }
                                        };
                                        prompt_model
                                    })
                                    },
                                    None => {
                                            None
                                    }
                                };
                                let field_response_format = entries.fields.remove("response_format");
                                let param_response_format = match field_response_format {
                                    Some(field) => {
                                        let mut reader = field[0].data.readable().expect("Unable to read field for response_format");
                                    Some({
                                        let mut data = String::new();
                                        reader.read_to_string(&mut data).expect("Reading saved String should never fail");
                                        let response_format_model: String = match serde_json::from_str(&data) {
                                            Ok(model) => model,
                                            Err(e) => {
                                                return Ok(
                                                    Response::builder()
                                                    .status(StatusCode::BAD_REQUEST)
                                                    .body(Body::from(format!("response_format data does not match API definition : {}", e)))
                                                    .expect("Unable to create Bad Request due to missing required form parameter response_format"))
                                            }
                                        };
                                        response_format_model
                                    })
                                    },
                                    None => {
                                            None
                                    }
                                };
                                let field_temperature = entries.fields.remove("temperature");
                                let param_temperature = match field_temperature {
                                    Some(field) => {
                                        let mut reader = field[0].data.readable().expect("Unable to read field for temperature");
                                    Some({
                                        let mut data = String::new();
                                        reader.read_to_string(&mut data).expect("Reading saved String should never fail");
                                        let temperature_model: f64 = match serde_json::from_str(&data) {
                                            Ok(model) => model,
                                            Err(e) => {
                                                return Ok(
                                                    Response::builder()
                                                    .status(StatusCode::BAD_REQUEST)
                                                    .body(Body::from(format!("temperature data does not match API definition : {}", e)))
                                                    .expect("Unable to create Bad Request due to missing required form parameter temperature"))
                                            }
                                        };
                                        temperature_model
                                    })
                                    },
                                    None => {
                                            None
                                    }
                                };
                                let field_language = entries.fields.remove("language");
                                let param_language = match field_language {
                                    Some(field) => {
                                        let mut reader = field[0].data.readable().expect("Unable to read field for language");
                                    Some({
                                        let mut data = String::new();
                                        reader.read_to_string(&mut data).expect("Reading saved String should never fail");
                                        let language_model: String = match serde_json::from_str(&data) {
                                            Ok(model) => model,
                                            Err(e) => {
                                                return Ok(
                                                    Response::builder()
                                                    .status(StatusCode::BAD_REQUEST)
                                                    .body(Body::from(format!("language data does not match API definition : {}", e)))
                                                    .expect("Unable to create Bad Request due to missing required form parameter language"))
                                            }
                                        };
                                        language_model
                                    })
                                    },
                                    None => {
                                            None
                                    }
                                };
                                let result = api_impl.create_transcription(
                                            param_file,
                                            param_model,
                                            param_prompt,
                                            param_response_format,
                                            param_temperature,
                                            param_language,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                CreateTranscriptionResponse::OK
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for CREATE_TRANSCRIPTION_OK"));
                                                    let body_content = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body_content);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
                            },
                            Err(e) => Ok(Response::builder()
                                                .status(StatusCode::BAD_REQUEST)
                                                .body(Body::from("Couldn't read multipart body".to_string()))
                                                .expect("Unable to create Bad Request response due to unable read multipart body")),
                        }
            },

            // CreateTranslation - POST /audio/translations
            hyper::Method::POST if path.matched(paths::ID_AUDIO_TRANSLATIONS) => {
                let boundary = match swagger::multipart::form::boundary(&headers) {
                    Some(boundary) => boundary.to_string(),
                    None => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from("Couldn't find valid multipart body".to_string()))
                                .expect("Unable to create Bad Request response for incorrect boundary")),
                };

                // Form Body parameters (note that non-required body parameters will ignore garbage
                // values, rather than causing a 400 response). Produce warning header and logs for
                // any unused fields.
                let result = body.into_raw();
                match result.await {
                            Ok(body) => {
                                use std::io::Read;

                                // Read Form Parameters from body
                                let mut entries = match Multipart::with_body(&body.to_vec()[..], boundary).save().temp() {
                                    SaveResult::Full(entries) => {
                                        entries
                                    },
                                    _ => {
                                        return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(Body::from("Unable to process all message parts".to_string()))
                                                        .expect("Unable to create Bad Request response due to failure to process all message"))
                                    },
                                };
                                let field_file = entries.fields.remove("file");
                                let param_file = match field_file {
                                    Some(field) => {
                                        let mut reader = field[0].data.readable().expect("Unable to read field for file");
                                        let mut data = String::new();
                                        reader.read_to_string(&mut data).expect("Reading saved String should never fail");
                                        let file_model: swagger::ByteArray = match serde_json::from_str(&data) {
                                            Ok(model) => model,
                                            Err(e) => {
                                                return Ok(
                                                    Response::builder()
                                                    .status(StatusCode::BAD_REQUEST)
                                                    .body(Body::from(format!("file data does not match API definition : {}", e)))
                                                    .expect("Unable to create Bad Request due to missing required form parameter file"))
                                            }
                                        };
                                        file_model
                                    },
                                    None => {
                                        return Ok(
                                            Response::builder()
                                            .status(StatusCode::BAD_REQUEST)
                                            .body(Body::from("Missing required form parameter file".to_string()))
                                            .expect("Unable to create Bad Request due to missing required form parameter file"))
                                    }
                                };
                                let field_model = entries.fields.remove("model");
                                let param_model = match field_model {
                                    Some(field) => {
                                        let mut reader = field[0].data.readable().expect("Unable to read field for model");
                                        let mut data = String::new();
                                        reader.read_to_string(&mut data).expect("Reading saved String should never fail");
                                        let model_model: models::CreateTranscriptionRequestModel = match serde_json::from_str(&data) {
                                            Ok(model) => model,
                                            Err(e) => {
                                                return Ok(
                                                    Response::builder()
                                                    .status(StatusCode::BAD_REQUEST)
                                                    .body(Body::from(format!("model data does not match API definition : {}", e)))
                                                    .expect("Unable to create Bad Request due to missing required form parameter model"))
                                            }
                                        };
                                        model_model
                                    },
                                    None => {
                                        return Ok(
                                            Response::builder()
                                            .status(StatusCode::BAD_REQUEST)
                                            .body(Body::from("Missing required form parameter model".to_string()))
                                            .expect("Unable to create Bad Request due to missing required form parameter model"))
                                    }
                                };
                                let field_prompt = entries.fields.remove("prompt");
                                let param_prompt = match field_prompt {
                                    Some(field) => {
                                        let mut reader = field[0].data.readable().expect("Unable to read field for prompt");
                                    Some({
                                        let mut data = String::new();
                                        reader.read_to_string(&mut data).expect("Reading saved String should never fail");
                                        let prompt_model: String = match serde_json::from_str(&data) {
                                            Ok(model) => model,
                                            Err(e) => {
                                                return Ok(
                                                    Response::builder()
                                                    .status(StatusCode::BAD_REQUEST)
                                                    .body(Body::from(format!("prompt data does not match API definition : {}", e)))
                                                    .expect("Unable to create Bad Request due to missing required form parameter prompt"))
                                            }
                                        };
                                        prompt_model
                                    })
                                    },
                                    None => {
                                            None
                                    }
                                };
                                let field_response_format = entries.fields.remove("response_format");
                                let param_response_format = match field_response_format {
                                    Some(field) => {
                                        let mut reader = field[0].data.readable().expect("Unable to read field for response_format");
                                    Some({
                                        let mut data = String::new();
                                        reader.read_to_string(&mut data).expect("Reading saved String should never fail");
                                        let response_format_model: String = match serde_json::from_str(&data) {
                                            Ok(model) => model,
                                            Err(e) => {
                                                return Ok(
                                                    Response::builder()
                                                    .status(StatusCode::BAD_REQUEST)
                                                    .body(Body::from(format!("response_format data does not match API definition : {}", e)))
                                                    .expect("Unable to create Bad Request due to missing required form parameter response_format"))
                                            }
                                        };
                                        response_format_model
                                    })
                                    },
                                    None => {
                                            None
                                    }
                                };
                                let field_temperature = entries.fields.remove("temperature");
                                let param_temperature = match field_temperature {
                                    Some(field) => {
                                        let mut reader = field[0].data.readable().expect("Unable to read field for temperature");
                                    Some({
                                        let mut data = String::new();
                                        reader.read_to_string(&mut data).expect("Reading saved String should never fail");
                                        let temperature_model: f64 = match serde_json::from_str(&data) {
                                            Ok(model) => model,
                                            Err(e) => {
                                                return Ok(
                                                    Response::builder()
                                                    .status(StatusCode::BAD_REQUEST)
                                                    .body(Body::from(format!("temperature data does not match API definition : {}", e)))
                                                    .expect("Unable to create Bad Request due to missing required form parameter temperature"))
                                            }
                                        };
                                        temperature_model
                                    })
                                    },
                                    None => {
                                            None
                                    }
                                };
                                let result = api_impl.create_translation(
                                            param_file,
                                            param_model,
                                            param_prompt,
                                            param_response_format,
                                            param_temperature,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                CreateTranslationResponse::OK
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for CREATE_TRANSLATION_OK"));
                                                    let body_content = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body_content);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
                            },
                            Err(e) => Ok(Response::builder()
                                                .status(StatusCode::BAD_REQUEST)
                                                .body(Body::from("Couldn't read multipart body".to_string()))
                                                .expect("Unable to create Bad Request response due to unable read multipart body")),
                        }
            },

            // DeleteFile - DELETE /files/{file_id}
            hyper::Method::DELETE if path.matched(paths::ID_FILES_FILE_ID) => {
                // Path parameters
                let path: &str = uri.path();
                let path_params =
                    paths::REGEX_FILES_FILE_ID
                    .captures(path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE FILES_FILE_ID in set but failed match against \"{}\"", path, paths::REGEX_FILES_FILE_ID.as_str())
                    );

                let param_file_id = match percent_encoding::percent_decode(path_params["file_id"].as_bytes()).decode_utf8() {
                    Ok(param_file_id) => match param_file_id.parse::<String>() {
                        Ok(param_file_id) => param_file_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter file_id: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["file_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                                let result = api_impl.delete_file(
                                            param_file_id,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                DeleteFileResponse::OK
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for DELETE_FILE_OK"));
                                                    let body_content = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body_content);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // DeleteModel - DELETE /models/{model}
            hyper::Method::DELETE if path.matched(paths::ID_MODELS_MODEL) => {
                // Path parameters
                let path: &str = uri.path();
                let path_params =
                    paths::REGEX_MODELS_MODEL
                    .captures(path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE MODELS_MODEL in set but failed match against \"{}\"", path, paths::REGEX_MODELS_MODEL.as_str())
                    );

                let param_model = match percent_encoding::percent_decode(path_params["model"].as_bytes()).decode_utf8() {
                    Ok(param_model) => match param_model.parse::<String>() {
                        Ok(param_model) => param_model,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter model: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["model"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                                let result = api_impl.delete_model(
                                            param_model,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                DeleteModelResponse::OK
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for DELETE_MODEL_OK"));
                                                    let body_content = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body_content);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // DownloadFile - GET /files/{file_id}/content
            hyper::Method::GET if path.matched(paths::ID_FILES_FILE_ID_CONTENT) => {
                // Path parameters
                let path: &str = uri.path();
                let path_params =
                    paths::REGEX_FILES_FILE_ID_CONTENT
                    .captures(path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE FILES_FILE_ID_CONTENT in set but failed match against \"{}\"", path, paths::REGEX_FILES_FILE_ID_CONTENT.as_str())
                    );

                let param_file_id = match percent_encoding::percent_decode(path_params["file_id"].as_bytes()).decode_utf8() {
                    Ok(param_file_id) => match param_file_id.parse::<String>() {
                        Ok(param_file_id) => param_file_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter file_id: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["file_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                                let result = api_impl.download_file(
                                            param_file_id,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                DownloadFileResponse::OK
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for DOWNLOAD_FILE_OK"));
                                                    let body_content = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body_content);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // ListFiles - GET /files
            hyper::Method::GET if path.matched(paths::ID_FILES) => {
                                let result = api_impl.list_files(
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                ListFilesResponse::OK
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for LIST_FILES_OK"));
                                                    let body_content = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body_content);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // ListFineTuneEvents - GET /fine-tunes/{fine_tune_id}/events
            hyper::Method::GET if path.matched(paths::ID_FINE_TUNES_FINE_TUNE_ID_EVENTS) => {
                // Path parameters
                let path: &str = uri.path();
                let path_params =
                    paths::REGEX_FINE_TUNES_FINE_TUNE_ID_EVENTS
                    .captures(path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE FINE_TUNES_FINE_TUNE_ID_EVENTS in set but failed match against \"{}\"", path, paths::REGEX_FINE_TUNES_FINE_TUNE_ID_EVENTS.as_str())
                    );

                let param_fine_tune_id = match percent_encoding::percent_decode(path_params["fine_tune_id"].as_bytes()).decode_utf8() {
                    Ok(param_fine_tune_id) => match param_fine_tune_id.parse::<String>() {
                        Ok(param_fine_tune_id) => param_fine_tune_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter fine_tune_id: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["fine_tune_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_stream = query_params.iter().filter(|e| e.0 == "stream").map(|e| e.1.clone())
                    .next();
                let param_stream = match param_stream {
                    Some(param_stream) => {
                        let param_stream =
                            <bool as std::str::FromStr>::from_str
                                (&param_stream);
                        match param_stream {
                            Ok(param_stream) => Some(param_stream),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter stream - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter stream")),
                        }
                    },
                    None => None,
                };

                                let result = api_impl.list_fine_tune_events(
                                            param_fine_tune_id,
                                            param_stream,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                ListFineTuneEventsResponse::OK
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for LIST_FINE_TUNE_EVENTS_OK"));
                                                    let body_content = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body_content);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // ListFineTunes - GET /fine-tunes
            hyper::Method::GET if path.matched(paths::ID_FINE_TUNES) => {
                                let result = api_impl.list_fine_tunes(
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                ListFineTunesResponse::OK
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for LIST_FINE_TUNES_OK"));
                                                    let body_content = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body_content);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // ListModels - GET /models
            hyper::Method::GET if path.matched(paths::ID_MODELS) => {
                                let result = api_impl.list_models(
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                ListModelsResponse::OK
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for LIST_MODELS_OK"));
                                                    let body_content = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body_content);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // RetrieveFile - GET /files/{file_id}
            hyper::Method::GET if path.matched(paths::ID_FILES_FILE_ID) => {
                // Path parameters
                let path: &str = uri.path();
                let path_params =
                    paths::REGEX_FILES_FILE_ID
                    .captures(path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE FILES_FILE_ID in set but failed match against \"{}\"", path, paths::REGEX_FILES_FILE_ID.as_str())
                    );

                let param_file_id = match percent_encoding::percent_decode(path_params["file_id"].as_bytes()).decode_utf8() {
                    Ok(param_file_id) => match param_file_id.parse::<String>() {
                        Ok(param_file_id) => param_file_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter file_id: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["file_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                                let result = api_impl.retrieve_file(
                                            param_file_id,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                RetrieveFileResponse::OK
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for RETRIEVE_FILE_OK"));
                                                    let body_content = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body_content);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // RetrieveFineTune - GET /fine-tunes/{fine_tune_id}
            hyper::Method::GET if path.matched(paths::ID_FINE_TUNES_FINE_TUNE_ID) => {
                // Path parameters
                let path: &str = uri.path();
                let path_params =
                    paths::REGEX_FINE_TUNES_FINE_TUNE_ID
                    .captures(path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE FINE_TUNES_FINE_TUNE_ID in set but failed match against \"{}\"", path, paths::REGEX_FINE_TUNES_FINE_TUNE_ID.as_str())
                    );

                let param_fine_tune_id = match percent_encoding::percent_decode(path_params["fine_tune_id"].as_bytes()).decode_utf8() {
                    Ok(param_fine_tune_id) => match param_fine_tune_id.parse::<String>() {
                        Ok(param_fine_tune_id) => param_fine_tune_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter fine_tune_id: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["fine_tune_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                                let result = api_impl.retrieve_fine_tune(
                                            param_fine_tune_id,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                RetrieveFineTuneResponse::OK
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for RETRIEVE_FINE_TUNE_OK"));
                                                    let body_content = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body_content);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // RetrieveModel - GET /models/{model}
            hyper::Method::GET if path.matched(paths::ID_MODELS_MODEL) => {
                // Path parameters
                let path: &str = uri.path();
                let path_params =
                    paths::REGEX_MODELS_MODEL
                    .captures(path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE MODELS_MODEL in set but failed match against \"{}\"", path, paths::REGEX_MODELS_MODEL.as_str())
                    );

                let param_model = match percent_encoding::percent_decode(path_params["model"].as_bytes()).decode_utf8() {
                    Ok(param_model) => match param_model.parse::<String>() {
                        Ok(param_model) => param_model,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter model: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["model"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                                let result = api_impl.retrieve_model(
                                            param_model,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                RetrieveModelResponse::OK
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for RETRIEVE_MODEL_OK"));
                                                    let body_content = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body_content);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            _ if path.matched(paths::ID_AUDIO_TRANSCRIPTIONS) => method_not_allowed(),
            _ if path.matched(paths::ID_AUDIO_TRANSLATIONS) => method_not_allowed(),
            _ if path.matched(paths::ID_CHAT_COMPLETIONS) => method_not_allowed(),
            _ if path.matched(paths::ID_COMPLETIONS) => method_not_allowed(),
            _ if path.matched(paths::ID_EDITS) => method_not_allowed(),
            _ if path.matched(paths::ID_EMBEDDINGS) => method_not_allowed(),
            _ if path.matched(paths::ID_FILES) => method_not_allowed(),
            _ if path.matched(paths::ID_FILES_FILE_ID) => method_not_allowed(),
            _ if path.matched(paths::ID_FILES_FILE_ID_CONTENT) => method_not_allowed(),
            _ if path.matched(paths::ID_FINE_TUNES) => method_not_allowed(),
            _ if path.matched(paths::ID_FINE_TUNES_FINE_TUNE_ID) => method_not_allowed(),
            _ if path.matched(paths::ID_FINE_TUNES_FINE_TUNE_ID_CANCEL) => method_not_allowed(),
            _ if path.matched(paths::ID_FINE_TUNES_FINE_TUNE_ID_EVENTS) => method_not_allowed(),
            _ if path.matched(paths::ID_IMAGES_EDITS) => method_not_allowed(),
            _ if path.matched(paths::ID_IMAGES_GENERATIONS) => method_not_allowed(),
            _ if path.matched(paths::ID_IMAGES_VARIATIONS) => method_not_allowed(),
            _ if path.matched(paths::ID_MODELS) => method_not_allowed(),
            _ if path.matched(paths::ID_MODELS_MODEL) => method_not_allowed(),
            _ if path.matched(paths::ID_MODERATIONS) => method_not_allowed(),
            _ => Ok(Response::builder().status(StatusCode::NOT_FOUND)
                    .body(Body::empty())
                    .expect("Unable to create Not Found response"))
        }
    } Box::pin(run(self.api_impl.clone(), req)) }
}

/// Request parser for `Api`.
pub struct ApiRequestParser;
impl<T> RequestParser<T> for ApiRequestParser {
    fn parse_operation_id(request: &Request<T>) -> Option<&'static str> {
        let path = paths::GLOBAL_REGEX_SET.matches(request.uri().path());
        match *request.method() {
            // CancelFineTune - POST /fine-tunes/{fine_tune_id}/cancel
            hyper::Method::POST if path.matched(paths::ID_FINE_TUNES_FINE_TUNE_ID_CANCEL) => Some("CancelFineTune"),
            // CreateChatCompletion - POST /chat/completions
            hyper::Method::POST if path.matched(paths::ID_CHAT_COMPLETIONS) => Some("CreateChatCompletion"),
            // CreateCompletion - POST /completions
            hyper::Method::POST if path.matched(paths::ID_COMPLETIONS) => Some("CreateCompletion"),
            // CreateEdit - POST /edits
            hyper::Method::POST if path.matched(paths::ID_EDITS) => Some("CreateEdit"),
            // CreateEmbedding - POST /embeddings
            hyper::Method::POST if path.matched(paths::ID_EMBEDDINGS) => Some("CreateEmbedding"),
            // CreateFile - POST /files
            hyper::Method::POST if path.matched(paths::ID_FILES) => Some("CreateFile"),
            // CreateFineTune - POST /fine-tunes
            hyper::Method::POST if path.matched(paths::ID_FINE_TUNES) => Some("CreateFineTune"),
            // CreateImage - POST /images/generations
            hyper::Method::POST if path.matched(paths::ID_IMAGES_GENERATIONS) => Some("CreateImage"),
            // CreateImageEdit - POST /images/edits
            hyper::Method::POST if path.matched(paths::ID_IMAGES_EDITS) => Some("CreateImageEdit"),
            // CreateImageVariation - POST /images/variations
            hyper::Method::POST if path.matched(paths::ID_IMAGES_VARIATIONS) => Some("CreateImageVariation"),
            // CreateModeration - POST /moderations
            hyper::Method::POST if path.matched(paths::ID_MODERATIONS) => Some("CreateModeration"),
            // CreateTranscription - POST /audio/transcriptions
            hyper::Method::POST if path.matched(paths::ID_AUDIO_TRANSCRIPTIONS) => Some("CreateTranscription"),
            // CreateTranslation - POST /audio/translations
            hyper::Method::POST if path.matched(paths::ID_AUDIO_TRANSLATIONS) => Some("CreateTranslation"),
            // DeleteFile - DELETE /files/{file_id}
            hyper::Method::DELETE if path.matched(paths::ID_FILES_FILE_ID) => Some("DeleteFile"),
            // DeleteModel - DELETE /models/{model}
            hyper::Method::DELETE if path.matched(paths::ID_MODELS_MODEL) => Some("DeleteModel"),
            // DownloadFile - GET /files/{file_id}/content
            hyper::Method::GET if path.matched(paths::ID_FILES_FILE_ID_CONTENT) => Some("DownloadFile"),
            // ListFiles - GET /files
            hyper::Method::GET if path.matched(paths::ID_FILES) => Some("ListFiles"),
            // ListFineTuneEvents - GET /fine-tunes/{fine_tune_id}/events
            hyper::Method::GET if path.matched(paths::ID_FINE_TUNES_FINE_TUNE_ID_EVENTS) => Some("ListFineTuneEvents"),
            // ListFineTunes - GET /fine-tunes
            hyper::Method::GET if path.matched(paths::ID_FINE_TUNES) => Some("ListFineTunes"),
            // ListModels - GET /models
            hyper::Method::GET if path.matched(paths::ID_MODELS) => Some("ListModels"),
            // RetrieveFile - GET /files/{file_id}
            hyper::Method::GET if path.matched(paths::ID_FILES_FILE_ID) => Some("RetrieveFile"),
            // RetrieveFineTune - GET /fine-tunes/{fine_tune_id}
            hyper::Method::GET if path.matched(paths::ID_FINE_TUNES_FINE_TUNE_ID) => Some("RetrieveFineTune"),
            // RetrieveModel - GET /models/{model}
            hyper::Method::GET if path.matched(paths::ID_MODELS_MODEL) => Some("RetrieveModel"),
            _ => None,
        }
    }
}
