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
use multipart::server::save::{PartialReason, SaveResult};

#[allow(unused_imports)]
use crate::{models, header, AuthenticationApi};

pub use crate::context;

type ServiceFuture = BoxFuture<'static, Result<Response<Body>, crate::ServiceError>>;

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

mod server_auth;

mod paths {
    use lazy_static::lazy_static;

    lazy_static! {
        pub static ref GLOBAL_REGEX_SET: regex::RegexSet = regex::RegexSet::new(vec![
            r"^/v1/assistants$",
            r"^/v1/assistants/(?P<assistant_id>[^/?#]*)$",
            r"^/v1/assistants/(?P<assistant_id>[^/?#]*)/files$",
            r"^/v1/assistants/(?P<assistant_id>[^/?#]*)/files/(?P<file_id>[^/?#]*)$",
            r"^/v1/audio/speech$",
            r"^/v1/audio/transcriptions$",
            r"^/v1/audio/translations$",
            r"^/v1/chat/completions$",
            r"^/v1/completions$",
            r"^/v1/embeddings$",
            r"^/v1/files$",
            r"^/v1/files/(?P<file_id>[^/?#]*)$",
            r"^/v1/files/(?P<file_id>[^/?#]*)/content$",
            r"^/v1/fine_tuning/jobs$",
            r"^/v1/fine_tuning/jobs/(?P<fine_tuning_job_id>[^/?#]*)$",
            r"^/v1/fine_tuning/jobs/(?P<fine_tuning_job_id>[^/?#]*)/cancel$",
            r"^/v1/fine_tuning/jobs/(?P<fine_tuning_job_id>[^/?#]*)/checkpoints$",
            r"^/v1/fine_tuning/jobs/(?P<fine_tuning_job_id>[^/?#]*)/events$",
            r"^/v1/images/edits$",
            r"^/v1/images/generations$",
            r"^/v1/images/variations$",
            r"^/v1/models$",
            r"^/v1/models/(?P<model>[^/?#]*)$",
            r"^/v1/moderations$",
            r"^/v1/threads$",
            r"^/v1/threads/runs$",
            r"^/v1/threads/(?P<thread_id>[^/?#]*)$",
            r"^/v1/threads/(?P<thread_id>[^/?#]*)/messages$",
            r"^/v1/threads/(?P<thread_id>[^/?#]*)/messages/(?P<message_id>[^/?#]*)$",
            r"^/v1/threads/(?P<thread_id>[^/?#]*)/messages/(?P<message_id>[^/?#]*)/files$",
            r"^/v1/threads/(?P<thread_id>[^/?#]*)/messages/(?P<message_id>[^/?#]*)/files/(?P<file_id>[^/?#]*)$",
            r"^/v1/threads/(?P<thread_id>[^/?#]*)/runs$",
            r"^/v1/threads/(?P<thread_id>[^/?#]*)/runs/(?P<run_id>[^/?#]*)$",
            r"^/v1/threads/(?P<thread_id>[^/?#]*)/runs/(?P<run_id>[^/?#]*)/cancel$",
            r"^/v1/threads/(?P<thread_id>[^/?#]*)/runs/(?P<run_id>[^/?#]*)/steps$",
            r"^/v1/threads/(?P<thread_id>[^/?#]*)/runs/(?P<run_id>[^/?#]*)/steps/(?P<step_id>[^/?#]*)$",
            r"^/v1/threads/(?P<thread_id>[^/?#]*)/runs/(?P<run_id>[^/?#]*)/submit_tool_outputs$"
        ])
        .expect("Unable to create global regex set");
    }
    pub(crate) static ID_ASSISTANTS: usize = 0;
    pub(crate) static ID_ASSISTANTS_ASSISTANT_ID: usize = 1;
    lazy_static! {
        pub static ref REGEX_ASSISTANTS_ASSISTANT_ID: regex::Regex =
            #[allow(clippy::invalid_regex)]
            regex::Regex::new(r"^/v1/assistants/(?P<assistant_id>[^/?#]*)$")
                .expect("Unable to create regex for ASSISTANTS_ASSISTANT_ID");
    }
    pub(crate) static ID_ASSISTANTS_ASSISTANT_ID_FILES: usize = 2;
    lazy_static! {
        pub static ref REGEX_ASSISTANTS_ASSISTANT_ID_FILES: regex::Regex =
            #[allow(clippy::invalid_regex)]
            regex::Regex::new(r"^/v1/assistants/(?P<assistant_id>[^/?#]*)/files$")
                .expect("Unable to create regex for ASSISTANTS_ASSISTANT_ID_FILES");
    }
    pub(crate) static ID_ASSISTANTS_ASSISTANT_ID_FILES_FILE_ID: usize = 3;
    lazy_static! {
        pub static ref REGEX_ASSISTANTS_ASSISTANT_ID_FILES_FILE_ID: regex::Regex =
            #[allow(clippy::invalid_regex)]
            regex::Regex::new(r"^/v1/assistants/(?P<assistant_id>[^/?#]*)/files/(?P<file_id>[^/?#]*)$")
                .expect("Unable to create regex for ASSISTANTS_ASSISTANT_ID_FILES_FILE_ID");
    }
    pub(crate) static ID_AUDIO_SPEECH: usize = 4;
    pub(crate) static ID_AUDIO_TRANSCRIPTIONS: usize = 5;
    pub(crate) static ID_AUDIO_TRANSLATIONS: usize = 6;
    pub(crate) static ID_CHAT_COMPLETIONS: usize = 7;
    pub(crate) static ID_COMPLETIONS: usize = 8;
    pub(crate) static ID_EMBEDDINGS: usize = 9;
    pub(crate) static ID_FILES: usize = 10;
    pub(crate) static ID_FILES_FILE_ID: usize = 11;
    lazy_static! {
        pub static ref REGEX_FILES_FILE_ID: regex::Regex =
            #[allow(clippy::invalid_regex)]
            regex::Regex::new(r"^/v1/files/(?P<file_id>[^/?#]*)$")
                .expect("Unable to create regex for FILES_FILE_ID");
    }
    pub(crate) static ID_FILES_FILE_ID_CONTENT: usize = 12;
    lazy_static! {
        pub static ref REGEX_FILES_FILE_ID_CONTENT: regex::Regex =
            #[allow(clippy::invalid_regex)]
            regex::Regex::new(r"^/v1/files/(?P<file_id>[^/?#]*)/content$")
                .expect("Unable to create regex for FILES_FILE_ID_CONTENT");
    }
    pub(crate) static ID_FINE_TUNING_JOBS: usize = 13;
    pub(crate) static ID_FINE_TUNING_JOBS_FINE_TUNING_JOB_ID: usize = 14;
    lazy_static! {
        pub static ref REGEX_FINE_TUNING_JOBS_FINE_TUNING_JOB_ID: regex::Regex =
            #[allow(clippy::invalid_regex)]
            regex::Regex::new(r"^/v1/fine_tuning/jobs/(?P<fine_tuning_job_id>[^/?#]*)$")
                .expect("Unable to create regex for FINE_TUNING_JOBS_FINE_TUNING_JOB_ID");
    }
    pub(crate) static ID_FINE_TUNING_JOBS_FINE_TUNING_JOB_ID_CANCEL: usize = 15;
    lazy_static! {
        pub static ref REGEX_FINE_TUNING_JOBS_FINE_TUNING_JOB_ID_CANCEL: regex::Regex =
            #[allow(clippy::invalid_regex)]
            regex::Regex::new(r"^/v1/fine_tuning/jobs/(?P<fine_tuning_job_id>[^/?#]*)/cancel$")
                .expect("Unable to create regex for FINE_TUNING_JOBS_FINE_TUNING_JOB_ID_CANCEL");
    }
    pub(crate) static ID_FINE_TUNING_JOBS_FINE_TUNING_JOB_ID_CHECKPOINTS: usize = 16;
    lazy_static! {
        pub static ref REGEX_FINE_TUNING_JOBS_FINE_TUNING_JOB_ID_CHECKPOINTS: regex::Regex =
            #[allow(clippy::invalid_regex)]
            regex::Regex::new(r"^/v1/fine_tuning/jobs/(?P<fine_tuning_job_id>[^/?#]*)/checkpoints$")
                .expect("Unable to create regex for FINE_TUNING_JOBS_FINE_TUNING_JOB_ID_CHECKPOINTS");
    }
    pub(crate) static ID_FINE_TUNING_JOBS_FINE_TUNING_JOB_ID_EVENTS: usize = 17;
    lazy_static! {
        pub static ref REGEX_FINE_TUNING_JOBS_FINE_TUNING_JOB_ID_EVENTS: regex::Regex =
            #[allow(clippy::invalid_regex)]
            regex::Regex::new(r"^/v1/fine_tuning/jobs/(?P<fine_tuning_job_id>[^/?#]*)/events$")
                .expect("Unable to create regex for FINE_TUNING_JOBS_FINE_TUNING_JOB_ID_EVENTS");
    }
    pub(crate) static ID_IMAGES_EDITS: usize = 18;
    pub(crate) static ID_IMAGES_GENERATIONS: usize = 19;
    pub(crate) static ID_IMAGES_VARIATIONS: usize = 20;
    pub(crate) static ID_MODELS: usize = 21;
    pub(crate) static ID_MODELS_MODEL: usize = 22;
    lazy_static! {
        pub static ref REGEX_MODELS_MODEL: regex::Regex =
            #[allow(clippy::invalid_regex)]
            regex::Regex::new(r"^/v1/models/(?P<model>[^/?#]*)$")
                .expect("Unable to create regex for MODELS_MODEL");
    }
    pub(crate) static ID_MODERATIONS: usize = 23;
    pub(crate) static ID_THREADS: usize = 24;
    pub(crate) static ID_THREADS_RUNS: usize = 25;
    pub(crate) static ID_THREADS_THREAD_ID: usize = 26;
    lazy_static! {
        pub static ref REGEX_THREADS_THREAD_ID: regex::Regex =
            #[allow(clippy::invalid_regex)]
            regex::Regex::new(r"^/v1/threads/(?P<thread_id>[^/?#]*)$")
                .expect("Unable to create regex for THREADS_THREAD_ID");
    }
    pub(crate) static ID_THREADS_THREAD_ID_MESSAGES: usize = 27;
    lazy_static! {
        pub static ref REGEX_THREADS_THREAD_ID_MESSAGES: regex::Regex =
            #[allow(clippy::invalid_regex)]
            regex::Regex::new(r"^/v1/threads/(?P<thread_id>[^/?#]*)/messages$")
                .expect("Unable to create regex for THREADS_THREAD_ID_MESSAGES");
    }
    pub(crate) static ID_THREADS_THREAD_ID_MESSAGES_MESSAGE_ID: usize = 28;
    lazy_static! {
        pub static ref REGEX_THREADS_THREAD_ID_MESSAGES_MESSAGE_ID: regex::Regex =
            #[allow(clippy::invalid_regex)]
            regex::Regex::new(r"^/v1/threads/(?P<thread_id>[^/?#]*)/messages/(?P<message_id>[^/?#]*)$")
                .expect("Unable to create regex for THREADS_THREAD_ID_MESSAGES_MESSAGE_ID");
    }
    pub(crate) static ID_THREADS_THREAD_ID_MESSAGES_MESSAGE_ID_FILES: usize = 29;
    lazy_static! {
        pub static ref REGEX_THREADS_THREAD_ID_MESSAGES_MESSAGE_ID_FILES: regex::Regex =
            #[allow(clippy::invalid_regex)]
            regex::Regex::new(r"^/v1/threads/(?P<thread_id>[^/?#]*)/messages/(?P<message_id>[^/?#]*)/files$")
                .expect("Unable to create regex for THREADS_THREAD_ID_MESSAGES_MESSAGE_ID_FILES");
    }
    pub(crate) static ID_THREADS_THREAD_ID_MESSAGES_MESSAGE_ID_FILES_FILE_ID: usize = 30;
    lazy_static! {
        pub static ref REGEX_THREADS_THREAD_ID_MESSAGES_MESSAGE_ID_FILES_FILE_ID: regex::Regex =
            #[allow(clippy::invalid_regex)]
            regex::Regex::new(r"^/v1/threads/(?P<thread_id>[^/?#]*)/messages/(?P<message_id>[^/?#]*)/files/(?P<file_id>[^/?#]*)$")
                .expect("Unable to create regex for THREADS_THREAD_ID_MESSAGES_MESSAGE_ID_FILES_FILE_ID");
    }
    pub(crate) static ID_THREADS_THREAD_ID_RUNS: usize = 31;
    lazy_static! {
        pub static ref REGEX_THREADS_THREAD_ID_RUNS: regex::Regex =
            #[allow(clippy::invalid_regex)]
            regex::Regex::new(r"^/v1/threads/(?P<thread_id>[^/?#]*)/runs$")
                .expect("Unable to create regex for THREADS_THREAD_ID_RUNS");
    }
    pub(crate) static ID_THREADS_THREAD_ID_RUNS_RUN_ID: usize = 32;
    lazy_static! {
        pub static ref REGEX_THREADS_THREAD_ID_RUNS_RUN_ID: regex::Regex =
            #[allow(clippy::invalid_regex)]
            regex::Regex::new(r"^/v1/threads/(?P<thread_id>[^/?#]*)/runs/(?P<run_id>[^/?#]*)$")
                .expect("Unable to create regex for THREADS_THREAD_ID_RUNS_RUN_ID");
    }
    pub(crate) static ID_THREADS_THREAD_ID_RUNS_RUN_ID_CANCEL: usize = 33;
    lazy_static! {
        pub static ref REGEX_THREADS_THREAD_ID_RUNS_RUN_ID_CANCEL: regex::Regex =
            #[allow(clippy::invalid_regex)]
            regex::Regex::new(r"^/v1/threads/(?P<thread_id>[^/?#]*)/runs/(?P<run_id>[^/?#]*)/cancel$")
                .expect("Unable to create regex for THREADS_THREAD_ID_RUNS_RUN_ID_CANCEL");
    }
    pub(crate) static ID_THREADS_THREAD_ID_RUNS_RUN_ID_STEPS: usize = 34;
    lazy_static! {
        pub static ref REGEX_THREADS_THREAD_ID_RUNS_RUN_ID_STEPS: regex::Regex =
            #[allow(clippy::invalid_regex)]
            regex::Regex::new(r"^/v1/threads/(?P<thread_id>[^/?#]*)/runs/(?P<run_id>[^/?#]*)/steps$")
                .expect("Unable to create regex for THREADS_THREAD_ID_RUNS_RUN_ID_STEPS");
    }
    pub(crate) static ID_THREADS_THREAD_ID_RUNS_RUN_ID_STEPS_STEP_ID: usize = 35;
    lazy_static! {
        pub static ref REGEX_THREADS_THREAD_ID_RUNS_RUN_ID_STEPS_STEP_ID: regex::Regex =
            #[allow(clippy::invalid_regex)]
            regex::Regex::new(r"^/v1/threads/(?P<thread_id>[^/?#]*)/runs/(?P<run_id>[^/?#]*)/steps/(?P<step_id>[^/?#]*)$")
                .expect("Unable to create regex for THREADS_THREAD_ID_RUNS_RUN_ID_STEPS_STEP_ID");
    }
    pub(crate) static ID_THREADS_THREAD_ID_RUNS_RUN_ID_SUBMIT_TOOL_OUTPUTS: usize = 36;
    lazy_static! {
        pub static ref REGEX_THREADS_THREAD_ID_RUNS_RUN_ID_SUBMIT_TOOL_OUTPUTS: regex::Regex =
            #[allow(clippy::invalid_regex)]
            regex::Regex::new(r"^/v1/threads/(?P<thread_id>[^/?#]*)/runs/(?P<run_id>[^/?#]*)/submit_tool_outputs$")
                .expect("Unable to create regex for THREADS_THREAD_ID_RUNS_RUN_ID_SUBMIT_TOOL_OUTPUTS");
    }
}


pub struct MakeService<T, C> where
    T: Api<C> + Clone + Send + 'static,
    C: Has<XSpanIdString> + Has<Option<Authorization>> + Send + Sync + 'static
{
    api_impl: T,
    multipart_form_size_limit: Option<u64>,
    marker: PhantomData<C>,
}

impl<T, C> MakeService<T, C> where
    T: Api<C> + Clone + Send + 'static,
    C: Has<XSpanIdString> + Has<Option<Authorization>> + Send + Sync + 'static
{
    pub fn new(api_impl: T) -> Self {
        MakeService {
            api_impl,
            multipart_form_size_limit: Some(8 * 1024 * 1024),
            marker: PhantomData
        }
    }

    /// Configure size limit when inspecting a multipart/form body.
    ///
    /// Default is 8 MiB.
    ///
    /// Set to None for no size limit, which presents a Denial of Service attack risk.
    pub fn multipart_form_size_limit(mut self, multipart_form_size_limit: Option<u64>) -> Self {
        self.multipart_form_size_limit = multipart_form_size_limit;
        self
    }
}

impl<T, C, Target> hyper::service::Service<Target> for MakeService<T, C> where
    T: Api<C> + Clone + Send + 'static,
    C: Has<XSpanIdString> + Has<Option<Authorization>> + Send + Sync + 'static
{
    type Response = Service<T, C>;
    type Error = crate::ServiceError;
    type Future = future::Ready<Result<Self::Response, Self::Error>>;

    fn poll_ready(&mut self, cx: &mut Context<'_>) -> Poll<Result<(), Self::Error>> {
        Poll::Ready(Ok(()))
    }

    fn call(&mut self, target: Target) -> Self::Future {
        let service = Service::new(self.api_impl.clone())
            .multipart_form_size_limit(self.multipart_form_size_limit);

        future::ok(service)
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
    C: Has<XSpanIdString> + Has<Option<Authorization>> + Send + Sync + 'static
{
    api_impl: T,
    multipart_form_size_limit: Option<u64>,
    marker: PhantomData<C>,
}

impl<T, C> Service<T, C> where
    T: Api<C> + Clone + Send + 'static,
    C: Has<XSpanIdString> + Has<Option<Authorization>> + Send + Sync + 'static
{
    pub fn new(api_impl: T) -> Self {
        Service {
            api_impl,
            multipart_form_size_limit: Some(8 * 1024 * 1024),
            marker: PhantomData
        }
    }

    /// Configure size limit when extracting a multipart/form body.
    ///
    /// Default is 8 MiB.
    ///
    /// Set to None for no size limit, which presents a Denial of Service attack risk.
    pub fn multipart_form_size_limit(mut self, multipart_form_size_limit: Option<u64>) -> Self {
        self.multipart_form_size_limit = multipart_form_size_limit;
        self
    }
}

impl<T, C> Clone for Service<T, C> where
    T: Api<C> + Clone + Send + 'static,
    C: Has<XSpanIdString> + Has<Option<Authorization>> + Send + Sync + 'static
{
    fn clone(&self) -> Self {
        Service {
            api_impl: self.api_impl.clone(),
            multipart_form_size_limit: Some(8 * 1024 * 1024),
            marker: self.marker,
        }
    }
}

impl<T, C> hyper::service::Service<(Request<Body>, C)> for Service<T, C> where
    T: Api<C> + Clone + Send + Sync + 'static,
    C: Has<XSpanIdString> + Has<Option<Authorization>> + Send + Sync + 'static
{
    type Response = Response<Body>;
    type Error = crate::ServiceError;
    type Future = ServiceFuture;

    fn poll_ready(&mut self, cx: &mut Context) -> Poll<Result<(), Self::Error>> {
        self.api_impl.poll_ready(cx)
    }

    fn call(&mut self, req: (Request<Body>, C)) -> Self::Future {
        async fn run<T, C>(
            mut api_impl: T,
            req: (Request<Body>, C),
            multipart_form_size_limit: Option<u64>,
        ) -> Result<Response<Body>, crate::ServiceError> where
            T: Api<C> + Clone + Send + 'static,
            C: Has<XSpanIdString> + Has<Option<Authorization>> + Send + Sync + 'static
        {
            let (request, context) = req;
            let (parts, body) = request.into_parts();
            let (method, uri, headers) = (parts.method, parts.uri, parts.headers);
            let path = paths::GLOBAL_REGEX_SET.matches(uri.path());

            match method {

            // CreateAssistant - POST /assistants
            hyper::Method::POST if path.matched(paths::ID_ASSISTANTS) => {
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(Body::from("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Handle body parameters (note that non-required body parameters will ignore garbage
                // values, rather than causing a 400 response). Produce warning header and logs for
                // any unused fields.
                let result = body.into_raw().await;
                match result {
                     Ok(body) => {
                                let mut unused_elements : Vec<String> = vec![];
                                let param_create_assistant_request: Option<models::CreateAssistantRequest> = if !body.is_empty() {
                                    let deserializer = &mut serde_json::Deserializer::from_slice(&*body);
                                    match serde_ignored::deserialize(deserializer, |path| {
                                            warn!("Ignoring unknown field in body: {}", path);
                                            unused_elements.push(path.to_string());
                                    }) {
                                        Ok(param_create_assistant_request) => param_create_assistant_request,
                                        Err(e) => return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(Body::from(format!("Couldn't parse body parameter CreateAssistantRequest - doesn't match schema: {}", e)))
                                                        .expect("Unable to create Bad Request response for invalid body parameter CreateAssistantRequest due to schema")),
                                    }
                                } else {
                                    None
                                };
                                let param_create_assistant_request = match param_create_assistant_request {
                                    Some(param_create_assistant_request) => param_create_assistant_request,
                                    None => return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(Body::from("Missing required body parameter CreateAssistantRequest"))
                                                        .expect("Unable to create Bad Request response for missing body parameter CreateAssistantRequest")),
                                };


                                let result = api_impl.create_assistant(
                                            param_create_assistant_request,
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
                                                CreateAssistantResponse::OK
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);

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
                                                .body(Body::from(format!("Unable to read body: {}", e)))
                                                .expect("Unable to create Bad Request response due to unable to read body")),
                        }
            },

            // CreateThread - POST /threads
            hyper::Method::POST if path.matched(paths::ID_THREADS) => {
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(Body::from("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Handle body parameters (note that non-required body parameters will ignore garbage
                // values, rather than causing a 400 response). Produce warning header and logs for
                // any unused fields.
                let result = body.into_raw().await;
                match result {
                     Ok(body) => {
                                let mut unused_elements : Vec<String> = vec![];
                                let param_create_thread_request: Option<models::CreateThreadRequest> = if !body.is_empty() {
                                    let deserializer = &mut serde_json::Deserializer::from_slice(&*body);
                                    match serde_ignored::deserialize(deserializer, |path| {
                                            warn!("Ignoring unknown field in body: {}", path);
                                            unused_elements.push(path.to_string());
                                    }) {
                                        Ok(param_create_thread_request) => param_create_thread_request,
                                        Err(_) => None,
                                    }
                                } else {
                                    None
                                };


                                let result = api_impl.create_thread(
                                            param_create_thread_request,
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
                                                CreateThreadResponse::OK
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);

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
                                                .body(Body::from(format!("Unable to read body: {}", e)))
                                                .expect("Unable to create Bad Request response due to unable to read body")),
                        }
            },

            // CreateThreadAndRun - POST /threads/runs
            hyper::Method::POST if path.matched(paths::ID_THREADS_RUNS) => {
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(Body::from("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Handle body parameters (note that non-required body parameters will ignore garbage
                // values, rather than causing a 400 response). Produce warning header and logs for
                // any unused fields.
                let result = body.into_raw().await;
                match result {
                     Ok(body) => {
                                let mut unused_elements : Vec<String> = vec![];
                                let param_create_thread_and_run_request: Option<models::CreateThreadAndRunRequest> = if !body.is_empty() {
                                    let deserializer = &mut serde_json::Deserializer::from_slice(&*body);
                                    match serde_ignored::deserialize(deserializer, |path| {
                                            warn!("Ignoring unknown field in body: {}", path);
                                            unused_elements.push(path.to_string());
                                    }) {
                                        Ok(param_create_thread_and_run_request) => param_create_thread_and_run_request,
                                        Err(e) => return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(Body::from(format!("Couldn't parse body parameter CreateThreadAndRunRequest - doesn't match schema: {}", e)))
                                                        .expect("Unable to create Bad Request response for invalid body parameter CreateThreadAndRunRequest due to schema")),
                                    }
                                } else {
                                    None
                                };
                                let param_create_thread_and_run_request = match param_create_thread_and_run_request {
                                    Some(param_create_thread_and_run_request) => param_create_thread_and_run_request,
                                    None => return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(Body::from("Missing required body parameter CreateThreadAndRunRequest"))
                                                        .expect("Unable to create Bad Request response for missing body parameter CreateThreadAndRunRequest")),
                                };


                                let result = api_impl.create_thread_and_run(
                                            param_create_thread_and_run_request,
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
                                                CreateThreadAndRunResponse::OK
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);

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
                                                .body(Body::from(format!("Unable to read body: {}", e)))
                                                .expect("Unable to create Bad Request response due to unable to read body")),
                        }
            },

            // ListAssistants - GET /assistants
            hyper::Method::GET if path.matched(paths::ID_ASSISTANTS) => {
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(Body::from("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_limit = query_params.iter().filter(|e| e.0 == "limit").map(|e| e.1.clone())
                    .next();
                let param_limit = match param_limit {
                    Some(param_limit) => {
                        let param_limit =
                            <i32 as std::str::FromStr>::from_str
                                (&param_limit);
                        match param_limit {
                            Ok(param_limit) => Some(param_limit),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter limit - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter limit")),
                        }
                    },
                    None => None,
                };
                let param_order = query_params.iter().filter(|e| e.0 == "order").map(|e| e.1.clone())
                    .next();
                let param_order = match param_order {
                    Some(param_order) => {
                        let param_order =
                            <models::ListAssistantsOrderParameter as std::str::FromStr>::from_str
                                (&param_order);
                        match param_order {
                            Ok(param_order) => Some(param_order),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter order - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter order")),
                        }
                    },
                    None => None,
                };
                let param_after = query_params.iter().filter(|e| e.0 == "after").map(|e| e.1.clone())
                    .next();
                let param_after = match param_after {
                    Some(param_after) => {
                        let param_after =
                            <String as std::str::FromStr>::from_str
                                (&param_after);
                        match param_after {
                            Ok(param_after) => Some(param_after),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter after - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter after")),
                        }
                    },
                    None => None,
                };
                let param_before = query_params.iter().filter(|e| e.0 == "before").map(|e| e.1.clone())
                    .next();
                let param_before = match param_before {
                    Some(param_before) => {
                        let param_before =
                            <String as std::str::FromStr>::from_str
                                (&param_before);
                        match param_before {
                            Ok(param_before) => Some(param_before),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter before - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter before")),
                        }
                    },
                    None => None,
                };

                                let result = api_impl.list_assistants(
                                            param_limit,
                                            param_order,
                                            param_after,
                                            param_before,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                ListAssistantsResponse::OK
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);

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

            // CreateAssistantFile - POST /assistants/{assistant_id}/files
            hyper::Method::POST if path.matched(paths::ID_ASSISTANTS_ASSISTANT_ID_FILES) => {
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(Body::from("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Path parameters
                let path: &str = uri.path();
                let path_params =
                    paths::REGEX_ASSISTANTS_ASSISTANT_ID_FILES
                    .captures(path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE ASSISTANTS_ASSISTANT_ID_FILES in set but failed match against \"{}\"", path, paths::REGEX_ASSISTANTS_ASSISTANT_ID_FILES.as_str())
                    );

                let param_assistant_id = match percent_encoding::percent_decode(path_params["assistant_id"].as_bytes()).decode_utf8() {
                    Ok(param_assistant_id) => match param_assistant_id.parse::<String>() {
                        Ok(param_assistant_id) => param_assistant_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter assistant_id: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["assistant_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                // Handle body parameters (note that non-required body parameters will ignore garbage
                // values, rather than causing a 400 response). Produce warning header and logs for
                // any unused fields.
                let result = body.into_raw().await;
                match result {
                     Ok(body) => {
                                let mut unused_elements : Vec<String> = vec![];
                                let param_create_assistant_file_request: Option<models::CreateAssistantFileRequest> = if !body.is_empty() {
                                    let deserializer = &mut serde_json::Deserializer::from_slice(&*body);
                                    match serde_ignored::deserialize(deserializer, |path| {
                                            warn!("Ignoring unknown field in body: {}", path);
                                            unused_elements.push(path.to_string());
                                    }) {
                                        Ok(param_create_assistant_file_request) => param_create_assistant_file_request,
                                        Err(e) => return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(Body::from(format!("Couldn't parse body parameter CreateAssistantFileRequest - doesn't match schema: {}", e)))
                                                        .expect("Unable to create Bad Request response for invalid body parameter CreateAssistantFileRequest due to schema")),
                                    }
                                } else {
                                    None
                                };
                                let param_create_assistant_file_request = match param_create_assistant_file_request {
                                    Some(param_create_assistant_file_request) => param_create_assistant_file_request,
                                    None => return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(Body::from("Missing required body parameter CreateAssistantFileRequest"))
                                                        .expect("Unable to create Bad Request response for missing body parameter CreateAssistantFileRequest")),
                                };


                                let result = api_impl.create_assistant_file(
                                            param_assistant_id,
                                            param_create_assistant_file_request,
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
                                                CreateAssistantFileResponse::OK
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);

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
                                                .body(Body::from(format!("Unable to read body: {}", e)))
                                                .expect("Unable to create Bad Request response due to unable to read body")),
                        }
            },

            // CreateMessage - POST /threads/{thread_id}/messages
            hyper::Method::POST if path.matched(paths::ID_THREADS_THREAD_ID_MESSAGES) => {
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(Body::from("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Path parameters
                let path: &str = uri.path();
                let path_params =
                    paths::REGEX_THREADS_THREAD_ID_MESSAGES
                    .captures(path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE THREADS_THREAD_ID_MESSAGES in set but failed match against \"{}\"", path, paths::REGEX_THREADS_THREAD_ID_MESSAGES.as_str())
                    );

                let param_thread_id = match percent_encoding::percent_decode(path_params["thread_id"].as_bytes()).decode_utf8() {
                    Ok(param_thread_id) => match param_thread_id.parse::<String>() {
                        Ok(param_thread_id) => param_thread_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter thread_id: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["thread_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                // Handle body parameters (note that non-required body parameters will ignore garbage
                // values, rather than causing a 400 response). Produce warning header and logs for
                // any unused fields.
                let result = body.into_raw().await;
                match result {
                     Ok(body) => {
                                let mut unused_elements : Vec<String> = vec![];
                                let param_create_message_request: Option<models::CreateMessageRequest> = if !body.is_empty() {
                                    let deserializer = &mut serde_json::Deserializer::from_slice(&*body);
                                    match serde_ignored::deserialize(deserializer, |path| {
                                            warn!("Ignoring unknown field in body: {}", path);
                                            unused_elements.push(path.to_string());
                                    }) {
                                        Ok(param_create_message_request) => param_create_message_request,
                                        Err(e) => return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(Body::from(format!("Couldn't parse body parameter CreateMessageRequest - doesn't match schema: {}", e)))
                                                        .expect("Unable to create Bad Request response for invalid body parameter CreateMessageRequest due to schema")),
                                    }
                                } else {
                                    None
                                };
                                let param_create_message_request = match param_create_message_request {
                                    Some(param_create_message_request) => param_create_message_request,
                                    None => return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(Body::from("Missing required body parameter CreateMessageRequest"))
                                                        .expect("Unable to create Bad Request response for missing body parameter CreateMessageRequest")),
                                };


                                let result = api_impl.create_message(
                                            param_thread_id,
                                            param_create_message_request,
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
                                                CreateMessageResponse::OK
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);

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
                                                .body(Body::from(format!("Unable to read body: {}", e)))
                                                .expect("Unable to create Bad Request response due to unable to read body")),
                        }
            },

            // CreateRun - POST /threads/{thread_id}/runs
            hyper::Method::POST if path.matched(paths::ID_THREADS_THREAD_ID_RUNS) => {
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(Body::from("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Path parameters
                let path: &str = uri.path();
                let path_params =
                    paths::REGEX_THREADS_THREAD_ID_RUNS
                    .captures(path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE THREADS_THREAD_ID_RUNS in set but failed match against \"{}\"", path, paths::REGEX_THREADS_THREAD_ID_RUNS.as_str())
                    );

                let param_thread_id = match percent_encoding::percent_decode(path_params["thread_id"].as_bytes()).decode_utf8() {
                    Ok(param_thread_id) => match param_thread_id.parse::<String>() {
                        Ok(param_thread_id) => param_thread_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter thread_id: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["thread_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                // Handle body parameters (note that non-required body parameters will ignore garbage
                // values, rather than causing a 400 response). Produce warning header and logs for
                // any unused fields.
                let result = body.into_raw().await;
                match result {
                     Ok(body) => {
                                let mut unused_elements : Vec<String> = vec![];
                                let param_create_run_request: Option<models::CreateRunRequest> = if !body.is_empty() {
                                    let deserializer = &mut serde_json::Deserializer::from_slice(&*body);
                                    match serde_ignored::deserialize(deserializer, |path| {
                                            warn!("Ignoring unknown field in body: {}", path);
                                            unused_elements.push(path.to_string());
                                    }) {
                                        Ok(param_create_run_request) => param_create_run_request,
                                        Err(e) => return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(Body::from(format!("Couldn't parse body parameter CreateRunRequest - doesn't match schema: {}", e)))
                                                        .expect("Unable to create Bad Request response for invalid body parameter CreateRunRequest due to schema")),
                                    }
                                } else {
                                    None
                                };
                                let param_create_run_request = match param_create_run_request {
                                    Some(param_create_run_request) => param_create_run_request,
                                    None => return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(Body::from("Missing required body parameter CreateRunRequest"))
                                                        .expect("Unable to create Bad Request response for missing body parameter CreateRunRequest")),
                                };


                                let result = api_impl.create_run(
                                            param_thread_id,
                                            param_create_run_request,
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
                                                CreateRunResponse::OK
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);

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
                                                .body(Body::from(format!("Unable to read body: {}", e)))
                                                .expect("Unable to create Bad Request response due to unable to read body")),
                        }
            },

            // DeleteAssistant - DELETE /assistants/{assistant_id}
            hyper::Method::DELETE if path.matched(paths::ID_ASSISTANTS_ASSISTANT_ID) => {
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(Body::from("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Path parameters
                let path: &str = uri.path();
                let path_params =
                    paths::REGEX_ASSISTANTS_ASSISTANT_ID
                    .captures(path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE ASSISTANTS_ASSISTANT_ID in set but failed match against \"{}\"", path, paths::REGEX_ASSISTANTS_ASSISTANT_ID.as_str())
                    );

                let param_assistant_id = match percent_encoding::percent_decode(path_params["assistant_id"].as_bytes()).decode_utf8() {
                    Ok(param_assistant_id) => match param_assistant_id.parse::<String>() {
                        Ok(param_assistant_id) => param_assistant_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter assistant_id: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["assistant_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                                let result = api_impl.delete_assistant(
                                            param_assistant_id,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                DeleteAssistantResponse::OK
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);

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

            // DeleteThread - DELETE /threads/{thread_id}
            hyper::Method::DELETE if path.matched(paths::ID_THREADS_THREAD_ID) => {
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(Body::from("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Path parameters
                let path: &str = uri.path();
                let path_params =
                    paths::REGEX_THREADS_THREAD_ID
                    .captures(path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE THREADS_THREAD_ID in set but failed match against \"{}\"", path, paths::REGEX_THREADS_THREAD_ID.as_str())
                    );

                let param_thread_id = match percent_encoding::percent_decode(path_params["thread_id"].as_bytes()).decode_utf8() {
                    Ok(param_thread_id) => match param_thread_id.parse::<String>() {
                        Ok(param_thread_id) => param_thread_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter thread_id: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["thread_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                                let result = api_impl.delete_thread(
                                            param_thread_id,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                DeleteThreadResponse::OK
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);

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

            // GetAssistant - GET /assistants/{assistant_id}
            hyper::Method::GET if path.matched(paths::ID_ASSISTANTS_ASSISTANT_ID) => {
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(Body::from("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Path parameters
                let path: &str = uri.path();
                let path_params =
                    paths::REGEX_ASSISTANTS_ASSISTANT_ID
                    .captures(path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE ASSISTANTS_ASSISTANT_ID in set but failed match against \"{}\"", path, paths::REGEX_ASSISTANTS_ASSISTANT_ID.as_str())
                    );

                let param_assistant_id = match percent_encoding::percent_decode(path_params["assistant_id"].as_bytes()).decode_utf8() {
                    Ok(param_assistant_id) => match param_assistant_id.parse::<String>() {
                        Ok(param_assistant_id) => param_assistant_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter assistant_id: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["assistant_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                                let result = api_impl.get_assistant(
                                            param_assistant_id,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GetAssistantResponse::OK
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);

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

            // GetThread - GET /threads/{thread_id}
            hyper::Method::GET if path.matched(paths::ID_THREADS_THREAD_ID) => {
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(Body::from("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Path parameters
                let path: &str = uri.path();
                let path_params =
                    paths::REGEX_THREADS_THREAD_ID
                    .captures(path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE THREADS_THREAD_ID in set but failed match against \"{}\"", path, paths::REGEX_THREADS_THREAD_ID.as_str())
                    );

                let param_thread_id = match percent_encoding::percent_decode(path_params["thread_id"].as_bytes()).decode_utf8() {
                    Ok(param_thread_id) => match param_thread_id.parse::<String>() {
                        Ok(param_thread_id) => param_thread_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter thread_id: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["thread_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                                let result = api_impl.get_thread(
                                            param_thread_id,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GetThreadResponse::OK
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);

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

            // ListAssistantFiles - GET /assistants/{assistant_id}/files
            hyper::Method::GET if path.matched(paths::ID_ASSISTANTS_ASSISTANT_ID_FILES) => {
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(Body::from("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Path parameters
                let path: &str = uri.path();
                let path_params =
                    paths::REGEX_ASSISTANTS_ASSISTANT_ID_FILES
                    .captures(path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE ASSISTANTS_ASSISTANT_ID_FILES in set but failed match against \"{}\"", path, paths::REGEX_ASSISTANTS_ASSISTANT_ID_FILES.as_str())
                    );

                let param_assistant_id = match percent_encoding::percent_decode(path_params["assistant_id"].as_bytes()).decode_utf8() {
                    Ok(param_assistant_id) => match param_assistant_id.parse::<String>() {
                        Ok(param_assistant_id) => param_assistant_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter assistant_id: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["assistant_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_limit = query_params.iter().filter(|e| e.0 == "limit").map(|e| e.1.clone())
                    .next();
                let param_limit = match param_limit {
                    Some(param_limit) => {
                        let param_limit =
                            <i32 as std::str::FromStr>::from_str
                                (&param_limit);
                        match param_limit {
                            Ok(param_limit) => Some(param_limit),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter limit - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter limit")),
                        }
                    },
                    None => None,
                };
                let param_order = query_params.iter().filter(|e| e.0 == "order").map(|e| e.1.clone())
                    .next();
                let param_order = match param_order {
                    Some(param_order) => {
                        let param_order =
                            <models::ListAssistantsOrderParameter as std::str::FromStr>::from_str
                                (&param_order);
                        match param_order {
                            Ok(param_order) => Some(param_order),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter order - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter order")),
                        }
                    },
                    None => None,
                };
                let param_after = query_params.iter().filter(|e| e.0 == "after").map(|e| e.1.clone())
                    .next();
                let param_after = match param_after {
                    Some(param_after) => {
                        let param_after =
                            <String as std::str::FromStr>::from_str
                                (&param_after);
                        match param_after {
                            Ok(param_after) => Some(param_after),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter after - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter after")),
                        }
                    },
                    None => None,
                };
                let param_before = query_params.iter().filter(|e| e.0 == "before").map(|e| e.1.clone())
                    .next();
                let param_before = match param_before {
                    Some(param_before) => {
                        let param_before =
                            <String as std::str::FromStr>::from_str
                                (&param_before);
                        match param_before {
                            Ok(param_before) => Some(param_before),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter before - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter before")),
                        }
                    },
                    None => None,
                };

                                let result = api_impl.list_assistant_files(
                                            param_assistant_id,
                                            param_limit,
                                            param_order,
                                            param_after,
                                            param_before,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                ListAssistantFilesResponse::OK
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);

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

            // ListMessages - GET /threads/{thread_id}/messages
            hyper::Method::GET if path.matched(paths::ID_THREADS_THREAD_ID_MESSAGES) => {
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(Body::from("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Path parameters
                let path: &str = uri.path();
                let path_params =
                    paths::REGEX_THREADS_THREAD_ID_MESSAGES
                    .captures(path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE THREADS_THREAD_ID_MESSAGES in set but failed match against \"{}\"", path, paths::REGEX_THREADS_THREAD_ID_MESSAGES.as_str())
                    );

                let param_thread_id = match percent_encoding::percent_decode(path_params["thread_id"].as_bytes()).decode_utf8() {
                    Ok(param_thread_id) => match param_thread_id.parse::<String>() {
                        Ok(param_thread_id) => param_thread_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter thread_id: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["thread_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_limit = query_params.iter().filter(|e| e.0 == "limit").map(|e| e.1.clone())
                    .next();
                let param_limit = match param_limit {
                    Some(param_limit) => {
                        let param_limit =
                            <i32 as std::str::FromStr>::from_str
                                (&param_limit);
                        match param_limit {
                            Ok(param_limit) => Some(param_limit),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter limit - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter limit")),
                        }
                    },
                    None => None,
                };
                let param_order = query_params.iter().filter(|e| e.0 == "order").map(|e| e.1.clone())
                    .next();
                let param_order = match param_order {
                    Some(param_order) => {
                        let param_order =
                            <models::ListAssistantsOrderParameter as std::str::FromStr>::from_str
                                (&param_order);
                        match param_order {
                            Ok(param_order) => Some(param_order),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter order - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter order")),
                        }
                    },
                    None => None,
                };
                let param_after = query_params.iter().filter(|e| e.0 == "after").map(|e| e.1.clone())
                    .next();
                let param_after = match param_after {
                    Some(param_after) => {
                        let param_after =
                            <String as std::str::FromStr>::from_str
                                (&param_after);
                        match param_after {
                            Ok(param_after) => Some(param_after),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter after - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter after")),
                        }
                    },
                    None => None,
                };
                let param_before = query_params.iter().filter(|e| e.0 == "before").map(|e| e.1.clone())
                    .next();
                let param_before = match param_before {
                    Some(param_before) => {
                        let param_before =
                            <String as std::str::FromStr>::from_str
                                (&param_before);
                        match param_before {
                            Ok(param_before) => Some(param_before),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter before - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter before")),
                        }
                    },
                    None => None,
                };
                let param_run_id = query_params.iter().filter(|e| e.0 == "run_id").map(|e| e.1.clone())
                    .next();
                let param_run_id = match param_run_id {
                    Some(param_run_id) => {
                        let param_run_id =
                            <String as std::str::FromStr>::from_str
                                (&param_run_id);
                        match param_run_id {
                            Ok(param_run_id) => Some(param_run_id),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter run_id - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter run_id")),
                        }
                    },
                    None => None,
                };

                                let result = api_impl.list_messages(
                                            param_thread_id,
                                            param_limit,
                                            param_order,
                                            param_after,
                                            param_before,
                                            param_run_id,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                ListMessagesResponse::OK
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);

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

            // ListRuns - GET /threads/{thread_id}/runs
            hyper::Method::GET if path.matched(paths::ID_THREADS_THREAD_ID_RUNS) => {
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(Body::from("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Path parameters
                let path: &str = uri.path();
                let path_params =
                    paths::REGEX_THREADS_THREAD_ID_RUNS
                    .captures(path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE THREADS_THREAD_ID_RUNS in set but failed match against \"{}\"", path, paths::REGEX_THREADS_THREAD_ID_RUNS.as_str())
                    );

                let param_thread_id = match percent_encoding::percent_decode(path_params["thread_id"].as_bytes()).decode_utf8() {
                    Ok(param_thread_id) => match param_thread_id.parse::<String>() {
                        Ok(param_thread_id) => param_thread_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter thread_id: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["thread_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_limit = query_params.iter().filter(|e| e.0 == "limit").map(|e| e.1.clone())
                    .next();
                let param_limit = match param_limit {
                    Some(param_limit) => {
                        let param_limit =
                            <i32 as std::str::FromStr>::from_str
                                (&param_limit);
                        match param_limit {
                            Ok(param_limit) => Some(param_limit),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter limit - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter limit")),
                        }
                    },
                    None => None,
                };
                let param_order = query_params.iter().filter(|e| e.0 == "order").map(|e| e.1.clone())
                    .next();
                let param_order = match param_order {
                    Some(param_order) => {
                        let param_order =
                            <models::ListAssistantsOrderParameter as std::str::FromStr>::from_str
                                (&param_order);
                        match param_order {
                            Ok(param_order) => Some(param_order),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter order - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter order")),
                        }
                    },
                    None => None,
                };
                let param_after = query_params.iter().filter(|e| e.0 == "after").map(|e| e.1.clone())
                    .next();
                let param_after = match param_after {
                    Some(param_after) => {
                        let param_after =
                            <String as std::str::FromStr>::from_str
                                (&param_after);
                        match param_after {
                            Ok(param_after) => Some(param_after),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter after - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter after")),
                        }
                    },
                    None => None,
                };
                let param_before = query_params.iter().filter(|e| e.0 == "before").map(|e| e.1.clone())
                    .next();
                let param_before = match param_before {
                    Some(param_before) => {
                        let param_before =
                            <String as std::str::FromStr>::from_str
                                (&param_before);
                        match param_before {
                            Ok(param_before) => Some(param_before),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter before - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter before")),
                        }
                    },
                    None => None,
                };

                                let result = api_impl.list_runs(
                                            param_thread_id,
                                            param_limit,
                                            param_order,
                                            param_after,
                                            param_before,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                ListRunsResponse::OK
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);

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

            // ModifyAssistant - POST /assistants/{assistant_id}
            hyper::Method::POST if path.matched(paths::ID_ASSISTANTS_ASSISTANT_ID) => {
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(Body::from("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Path parameters
                let path: &str = uri.path();
                let path_params =
                    paths::REGEX_ASSISTANTS_ASSISTANT_ID
                    .captures(path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE ASSISTANTS_ASSISTANT_ID in set but failed match against \"{}\"", path, paths::REGEX_ASSISTANTS_ASSISTANT_ID.as_str())
                    );

                let param_assistant_id = match percent_encoding::percent_decode(path_params["assistant_id"].as_bytes()).decode_utf8() {
                    Ok(param_assistant_id) => match param_assistant_id.parse::<String>() {
                        Ok(param_assistant_id) => param_assistant_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter assistant_id: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["assistant_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                // Handle body parameters (note that non-required body parameters will ignore garbage
                // values, rather than causing a 400 response). Produce warning header and logs for
                // any unused fields.
                let result = body.into_raw().await;
                match result {
                     Ok(body) => {
                                let mut unused_elements : Vec<String> = vec![];
                                let param_modify_assistant_request: Option<models::ModifyAssistantRequest> = if !body.is_empty() {
                                    let deserializer = &mut serde_json::Deserializer::from_slice(&*body);
                                    match serde_ignored::deserialize(deserializer, |path| {
                                            warn!("Ignoring unknown field in body: {}", path);
                                            unused_elements.push(path.to_string());
                                    }) {
                                        Ok(param_modify_assistant_request) => param_modify_assistant_request,
                                        Err(e) => return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(Body::from(format!("Couldn't parse body parameter ModifyAssistantRequest - doesn't match schema: {}", e)))
                                                        .expect("Unable to create Bad Request response for invalid body parameter ModifyAssistantRequest due to schema")),
                                    }
                                } else {
                                    None
                                };
                                let param_modify_assistant_request = match param_modify_assistant_request {
                                    Some(param_modify_assistant_request) => param_modify_assistant_request,
                                    None => return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(Body::from("Missing required body parameter ModifyAssistantRequest"))
                                                        .expect("Unable to create Bad Request response for missing body parameter ModifyAssistantRequest")),
                                };


                                let result = api_impl.modify_assistant(
                                            param_assistant_id,
                                            param_modify_assistant_request,
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
                                                ModifyAssistantResponse::OK
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);

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
                                                .body(Body::from(format!("Unable to read body: {}", e)))
                                                .expect("Unable to create Bad Request response due to unable to read body")),
                        }
            },

            // ModifyThread - POST /threads/{thread_id}
            hyper::Method::POST if path.matched(paths::ID_THREADS_THREAD_ID) => {
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(Body::from("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Path parameters
                let path: &str = uri.path();
                let path_params =
                    paths::REGEX_THREADS_THREAD_ID
                    .captures(path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE THREADS_THREAD_ID in set but failed match against \"{}\"", path, paths::REGEX_THREADS_THREAD_ID.as_str())
                    );

                let param_thread_id = match percent_encoding::percent_decode(path_params["thread_id"].as_bytes()).decode_utf8() {
                    Ok(param_thread_id) => match param_thread_id.parse::<String>() {
                        Ok(param_thread_id) => param_thread_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter thread_id: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["thread_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                // Handle body parameters (note that non-required body parameters will ignore garbage
                // values, rather than causing a 400 response). Produce warning header and logs for
                // any unused fields.
                let result = body.into_raw().await;
                match result {
                     Ok(body) => {
                                let mut unused_elements : Vec<String> = vec![];
                                let param_modify_thread_request: Option<models::ModifyThreadRequest> = if !body.is_empty() {
                                    let deserializer = &mut serde_json::Deserializer::from_slice(&*body);
                                    match serde_ignored::deserialize(deserializer, |path| {
                                            warn!("Ignoring unknown field in body: {}", path);
                                            unused_elements.push(path.to_string());
                                    }) {
                                        Ok(param_modify_thread_request) => param_modify_thread_request,
                                        Err(e) => return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(Body::from(format!("Couldn't parse body parameter ModifyThreadRequest - doesn't match schema: {}", e)))
                                                        .expect("Unable to create Bad Request response for invalid body parameter ModifyThreadRequest due to schema")),
                                    }
                                } else {
                                    None
                                };
                                let param_modify_thread_request = match param_modify_thread_request {
                                    Some(param_modify_thread_request) => param_modify_thread_request,
                                    None => return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(Body::from("Missing required body parameter ModifyThreadRequest"))
                                                        .expect("Unable to create Bad Request response for missing body parameter ModifyThreadRequest")),
                                };


                                let result = api_impl.modify_thread(
                                            param_thread_id,
                                            param_modify_thread_request,
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
                                                ModifyThreadResponse::OK
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);

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
                                                .body(Body::from(format!("Unable to read body: {}", e)))
                                                .expect("Unable to create Bad Request response due to unable to read body")),
                        }
            },

            // CancelRun - POST /threads/{thread_id}/runs/{run_id}/cancel
            hyper::Method::POST if path.matched(paths::ID_THREADS_THREAD_ID_RUNS_RUN_ID_CANCEL) => {
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(Body::from("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Path parameters
                let path: &str = uri.path();
                let path_params =
                    paths::REGEX_THREADS_THREAD_ID_RUNS_RUN_ID_CANCEL
                    .captures(path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE THREADS_THREAD_ID_RUNS_RUN_ID_CANCEL in set but failed match against \"{}\"", path, paths::REGEX_THREADS_THREAD_ID_RUNS_RUN_ID_CANCEL.as_str())
                    );

                let param_thread_id = match percent_encoding::percent_decode(path_params["thread_id"].as_bytes()).decode_utf8() {
                    Ok(param_thread_id) => match param_thread_id.parse::<String>() {
                        Ok(param_thread_id) => param_thread_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter thread_id: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["thread_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                let param_run_id = match percent_encoding::percent_decode(path_params["run_id"].as_bytes()).decode_utf8() {
                    Ok(param_run_id) => match param_run_id.parse::<String>() {
                        Ok(param_run_id) => param_run_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter run_id: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["run_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                                let result = api_impl.cancel_run(
                                            param_thread_id,
                                            param_run_id,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                CancelRunResponse::OK
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);

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

            // DeleteAssistantFile - DELETE /assistants/{assistant_id}/files/{file_id}
            hyper::Method::DELETE if path.matched(paths::ID_ASSISTANTS_ASSISTANT_ID_FILES_FILE_ID) => {
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(Body::from("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Path parameters
                let path: &str = uri.path();
                let path_params =
                    paths::REGEX_ASSISTANTS_ASSISTANT_ID_FILES_FILE_ID
                    .captures(path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE ASSISTANTS_ASSISTANT_ID_FILES_FILE_ID in set but failed match against \"{}\"", path, paths::REGEX_ASSISTANTS_ASSISTANT_ID_FILES_FILE_ID.as_str())
                    );

                let param_assistant_id = match percent_encoding::percent_decode(path_params["assistant_id"].as_bytes()).decode_utf8() {
                    Ok(param_assistant_id) => match param_assistant_id.parse::<String>() {
                        Ok(param_assistant_id) => param_assistant_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter assistant_id: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["assistant_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

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

                                let result = api_impl.delete_assistant_file(
                                            param_assistant_id,
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
                                                DeleteAssistantFileResponse::OK
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);

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

            // GetAssistantFile - GET /assistants/{assistant_id}/files/{file_id}
            hyper::Method::GET if path.matched(paths::ID_ASSISTANTS_ASSISTANT_ID_FILES_FILE_ID) => {
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(Body::from("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Path parameters
                let path: &str = uri.path();
                let path_params =
                    paths::REGEX_ASSISTANTS_ASSISTANT_ID_FILES_FILE_ID
                    .captures(path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE ASSISTANTS_ASSISTANT_ID_FILES_FILE_ID in set but failed match against \"{}\"", path, paths::REGEX_ASSISTANTS_ASSISTANT_ID_FILES_FILE_ID.as_str())
                    );

                let param_assistant_id = match percent_encoding::percent_decode(path_params["assistant_id"].as_bytes()).decode_utf8() {
                    Ok(param_assistant_id) => match param_assistant_id.parse::<String>() {
                        Ok(param_assistant_id) => param_assistant_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter assistant_id: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["assistant_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

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

                                let result = api_impl.get_assistant_file(
                                            param_assistant_id,
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
                                                GetAssistantFileResponse::OK
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);

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

            // GetMessage - GET /threads/{thread_id}/messages/{message_id}
            hyper::Method::GET if path.matched(paths::ID_THREADS_THREAD_ID_MESSAGES_MESSAGE_ID) => {
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(Body::from("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Path parameters
                let path: &str = uri.path();
                let path_params =
                    paths::REGEX_THREADS_THREAD_ID_MESSAGES_MESSAGE_ID
                    .captures(path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE THREADS_THREAD_ID_MESSAGES_MESSAGE_ID in set but failed match against \"{}\"", path, paths::REGEX_THREADS_THREAD_ID_MESSAGES_MESSAGE_ID.as_str())
                    );

                let param_thread_id = match percent_encoding::percent_decode(path_params["thread_id"].as_bytes()).decode_utf8() {
                    Ok(param_thread_id) => match param_thread_id.parse::<String>() {
                        Ok(param_thread_id) => param_thread_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter thread_id: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["thread_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                let param_message_id = match percent_encoding::percent_decode(path_params["message_id"].as_bytes()).decode_utf8() {
                    Ok(param_message_id) => match param_message_id.parse::<String>() {
                        Ok(param_message_id) => param_message_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter message_id: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["message_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                                let result = api_impl.get_message(
                                            param_thread_id,
                                            param_message_id,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GetMessageResponse::OK
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);

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

            // GetRun - GET /threads/{thread_id}/runs/{run_id}
            hyper::Method::GET if path.matched(paths::ID_THREADS_THREAD_ID_RUNS_RUN_ID) => {
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(Body::from("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Path parameters
                let path: &str = uri.path();
                let path_params =
                    paths::REGEX_THREADS_THREAD_ID_RUNS_RUN_ID
                    .captures(path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE THREADS_THREAD_ID_RUNS_RUN_ID in set but failed match against \"{}\"", path, paths::REGEX_THREADS_THREAD_ID_RUNS_RUN_ID.as_str())
                    );

                let param_thread_id = match percent_encoding::percent_decode(path_params["thread_id"].as_bytes()).decode_utf8() {
                    Ok(param_thread_id) => match param_thread_id.parse::<String>() {
                        Ok(param_thread_id) => param_thread_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter thread_id: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["thread_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                let param_run_id = match percent_encoding::percent_decode(path_params["run_id"].as_bytes()).decode_utf8() {
                    Ok(param_run_id) => match param_run_id.parse::<String>() {
                        Ok(param_run_id) => param_run_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter run_id: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["run_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                                let result = api_impl.get_run(
                                            param_thread_id,
                                            param_run_id,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GetRunResponse::OK
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);

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

            // ListMessageFiles - GET /threads/{thread_id}/messages/{message_id}/files
            hyper::Method::GET if path.matched(paths::ID_THREADS_THREAD_ID_MESSAGES_MESSAGE_ID_FILES) => {
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(Body::from("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Path parameters
                let path: &str = uri.path();
                let path_params =
                    paths::REGEX_THREADS_THREAD_ID_MESSAGES_MESSAGE_ID_FILES
                    .captures(path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE THREADS_THREAD_ID_MESSAGES_MESSAGE_ID_FILES in set but failed match against \"{}\"", path, paths::REGEX_THREADS_THREAD_ID_MESSAGES_MESSAGE_ID_FILES.as_str())
                    );

                let param_thread_id = match percent_encoding::percent_decode(path_params["thread_id"].as_bytes()).decode_utf8() {
                    Ok(param_thread_id) => match param_thread_id.parse::<String>() {
                        Ok(param_thread_id) => param_thread_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter thread_id: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["thread_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                let param_message_id = match percent_encoding::percent_decode(path_params["message_id"].as_bytes()).decode_utf8() {
                    Ok(param_message_id) => match param_message_id.parse::<String>() {
                        Ok(param_message_id) => param_message_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter message_id: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["message_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_limit = query_params.iter().filter(|e| e.0 == "limit").map(|e| e.1.clone())
                    .next();
                let param_limit = match param_limit {
                    Some(param_limit) => {
                        let param_limit =
                            <i32 as std::str::FromStr>::from_str
                                (&param_limit);
                        match param_limit {
                            Ok(param_limit) => Some(param_limit),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter limit - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter limit")),
                        }
                    },
                    None => None,
                };
                let param_order = query_params.iter().filter(|e| e.0 == "order").map(|e| e.1.clone())
                    .next();
                let param_order = match param_order {
                    Some(param_order) => {
                        let param_order =
                            <models::ListAssistantsOrderParameter as std::str::FromStr>::from_str
                                (&param_order);
                        match param_order {
                            Ok(param_order) => Some(param_order),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter order - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter order")),
                        }
                    },
                    None => None,
                };
                let param_after = query_params.iter().filter(|e| e.0 == "after").map(|e| e.1.clone())
                    .next();
                let param_after = match param_after {
                    Some(param_after) => {
                        let param_after =
                            <String as std::str::FromStr>::from_str
                                (&param_after);
                        match param_after {
                            Ok(param_after) => Some(param_after),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter after - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter after")),
                        }
                    },
                    None => None,
                };
                let param_before = query_params.iter().filter(|e| e.0 == "before").map(|e| e.1.clone())
                    .next();
                let param_before = match param_before {
                    Some(param_before) => {
                        let param_before =
                            <String as std::str::FromStr>::from_str
                                (&param_before);
                        match param_before {
                            Ok(param_before) => Some(param_before),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter before - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter before")),
                        }
                    },
                    None => None,
                };

                                let result = api_impl.list_message_files(
                                            param_thread_id,
                                            param_message_id,
                                            param_limit,
                                            param_order,
                                            param_after,
                                            param_before,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                ListMessageFilesResponse::OK
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);

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

            // ListRunSteps - GET /threads/{thread_id}/runs/{run_id}/steps
            hyper::Method::GET if path.matched(paths::ID_THREADS_THREAD_ID_RUNS_RUN_ID_STEPS) => {
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(Body::from("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Path parameters
                let path: &str = uri.path();
                let path_params =
                    paths::REGEX_THREADS_THREAD_ID_RUNS_RUN_ID_STEPS
                    .captures(path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE THREADS_THREAD_ID_RUNS_RUN_ID_STEPS in set but failed match against \"{}\"", path, paths::REGEX_THREADS_THREAD_ID_RUNS_RUN_ID_STEPS.as_str())
                    );

                let param_thread_id = match percent_encoding::percent_decode(path_params["thread_id"].as_bytes()).decode_utf8() {
                    Ok(param_thread_id) => match param_thread_id.parse::<String>() {
                        Ok(param_thread_id) => param_thread_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter thread_id: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["thread_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                let param_run_id = match percent_encoding::percent_decode(path_params["run_id"].as_bytes()).decode_utf8() {
                    Ok(param_run_id) => match param_run_id.parse::<String>() {
                        Ok(param_run_id) => param_run_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter run_id: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["run_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_limit = query_params.iter().filter(|e| e.0 == "limit").map(|e| e.1.clone())
                    .next();
                let param_limit = match param_limit {
                    Some(param_limit) => {
                        let param_limit =
                            <i32 as std::str::FromStr>::from_str
                                (&param_limit);
                        match param_limit {
                            Ok(param_limit) => Some(param_limit),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter limit - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter limit")),
                        }
                    },
                    None => None,
                };
                let param_order = query_params.iter().filter(|e| e.0 == "order").map(|e| e.1.clone())
                    .next();
                let param_order = match param_order {
                    Some(param_order) => {
                        let param_order =
                            <models::ListAssistantsOrderParameter as std::str::FromStr>::from_str
                                (&param_order);
                        match param_order {
                            Ok(param_order) => Some(param_order),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter order - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter order")),
                        }
                    },
                    None => None,
                };
                let param_after = query_params.iter().filter(|e| e.0 == "after").map(|e| e.1.clone())
                    .next();
                let param_after = match param_after {
                    Some(param_after) => {
                        let param_after =
                            <String as std::str::FromStr>::from_str
                                (&param_after);
                        match param_after {
                            Ok(param_after) => Some(param_after),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter after - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter after")),
                        }
                    },
                    None => None,
                };
                let param_before = query_params.iter().filter(|e| e.0 == "before").map(|e| e.1.clone())
                    .next();
                let param_before = match param_before {
                    Some(param_before) => {
                        let param_before =
                            <String as std::str::FromStr>::from_str
                                (&param_before);
                        match param_before {
                            Ok(param_before) => Some(param_before),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter before - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter before")),
                        }
                    },
                    None => None,
                };

                                let result = api_impl.list_run_steps(
                                            param_thread_id,
                                            param_run_id,
                                            param_limit,
                                            param_order,
                                            param_after,
                                            param_before,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                ListRunStepsResponse::OK
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);

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

            // ModifyMessage - POST /threads/{thread_id}/messages/{message_id}
            hyper::Method::POST if path.matched(paths::ID_THREADS_THREAD_ID_MESSAGES_MESSAGE_ID) => {
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(Body::from("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Path parameters
                let path: &str = uri.path();
                let path_params =
                    paths::REGEX_THREADS_THREAD_ID_MESSAGES_MESSAGE_ID
                    .captures(path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE THREADS_THREAD_ID_MESSAGES_MESSAGE_ID in set but failed match against \"{}\"", path, paths::REGEX_THREADS_THREAD_ID_MESSAGES_MESSAGE_ID.as_str())
                    );

                let param_thread_id = match percent_encoding::percent_decode(path_params["thread_id"].as_bytes()).decode_utf8() {
                    Ok(param_thread_id) => match param_thread_id.parse::<String>() {
                        Ok(param_thread_id) => param_thread_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter thread_id: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["thread_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                let param_message_id = match percent_encoding::percent_decode(path_params["message_id"].as_bytes()).decode_utf8() {
                    Ok(param_message_id) => match param_message_id.parse::<String>() {
                        Ok(param_message_id) => param_message_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter message_id: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["message_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                // Handle body parameters (note that non-required body parameters will ignore garbage
                // values, rather than causing a 400 response). Produce warning header and logs for
                // any unused fields.
                let result = body.into_raw().await;
                match result {
                     Ok(body) => {
                                let mut unused_elements : Vec<String> = vec![];
                                let param_modify_message_request: Option<models::ModifyMessageRequest> = if !body.is_empty() {
                                    let deserializer = &mut serde_json::Deserializer::from_slice(&*body);
                                    match serde_ignored::deserialize(deserializer, |path| {
                                            warn!("Ignoring unknown field in body: {}", path);
                                            unused_elements.push(path.to_string());
                                    }) {
                                        Ok(param_modify_message_request) => param_modify_message_request,
                                        Err(e) => return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(Body::from(format!("Couldn't parse body parameter ModifyMessageRequest - doesn't match schema: {}", e)))
                                                        .expect("Unable to create Bad Request response for invalid body parameter ModifyMessageRequest due to schema")),
                                    }
                                } else {
                                    None
                                };
                                let param_modify_message_request = match param_modify_message_request {
                                    Some(param_modify_message_request) => param_modify_message_request,
                                    None => return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(Body::from("Missing required body parameter ModifyMessageRequest"))
                                                        .expect("Unable to create Bad Request response for missing body parameter ModifyMessageRequest")),
                                };


                                let result = api_impl.modify_message(
                                            param_thread_id,
                                            param_message_id,
                                            param_modify_message_request,
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
                                                ModifyMessageResponse::OK
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);

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
                                                .body(Body::from(format!("Unable to read body: {}", e)))
                                                .expect("Unable to create Bad Request response due to unable to read body")),
                        }
            },

            // ModifyRun - POST /threads/{thread_id}/runs/{run_id}
            hyper::Method::POST if path.matched(paths::ID_THREADS_THREAD_ID_RUNS_RUN_ID) => {
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(Body::from("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Path parameters
                let path: &str = uri.path();
                let path_params =
                    paths::REGEX_THREADS_THREAD_ID_RUNS_RUN_ID
                    .captures(path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE THREADS_THREAD_ID_RUNS_RUN_ID in set but failed match against \"{}\"", path, paths::REGEX_THREADS_THREAD_ID_RUNS_RUN_ID.as_str())
                    );

                let param_thread_id = match percent_encoding::percent_decode(path_params["thread_id"].as_bytes()).decode_utf8() {
                    Ok(param_thread_id) => match param_thread_id.parse::<String>() {
                        Ok(param_thread_id) => param_thread_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter thread_id: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["thread_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                let param_run_id = match percent_encoding::percent_decode(path_params["run_id"].as_bytes()).decode_utf8() {
                    Ok(param_run_id) => match param_run_id.parse::<String>() {
                        Ok(param_run_id) => param_run_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter run_id: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["run_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                // Handle body parameters (note that non-required body parameters will ignore garbage
                // values, rather than causing a 400 response). Produce warning header and logs for
                // any unused fields.
                let result = body.into_raw().await;
                match result {
                     Ok(body) => {
                                let mut unused_elements : Vec<String> = vec![];
                                let param_modify_run_request: Option<models::ModifyRunRequest> = if !body.is_empty() {
                                    let deserializer = &mut serde_json::Deserializer::from_slice(&*body);
                                    match serde_ignored::deserialize(deserializer, |path| {
                                            warn!("Ignoring unknown field in body: {}", path);
                                            unused_elements.push(path.to_string());
                                    }) {
                                        Ok(param_modify_run_request) => param_modify_run_request,
                                        Err(e) => return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(Body::from(format!("Couldn't parse body parameter ModifyRunRequest - doesn't match schema: {}", e)))
                                                        .expect("Unable to create Bad Request response for invalid body parameter ModifyRunRequest due to schema")),
                                    }
                                } else {
                                    None
                                };
                                let param_modify_run_request = match param_modify_run_request {
                                    Some(param_modify_run_request) => param_modify_run_request,
                                    None => return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(Body::from("Missing required body parameter ModifyRunRequest"))
                                                        .expect("Unable to create Bad Request response for missing body parameter ModifyRunRequest")),
                                };


                                let result = api_impl.modify_run(
                                            param_thread_id,
                                            param_run_id,
                                            param_modify_run_request,
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
                                                ModifyRunResponse::OK
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);

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
                                                .body(Body::from(format!("Unable to read body: {}", e)))
                                                .expect("Unable to create Bad Request response due to unable to read body")),
                        }
            },

            // SubmitToolOuputsToRun - POST /threads/{thread_id}/runs/{run_id}/submit_tool_outputs
            hyper::Method::POST if path.matched(paths::ID_THREADS_THREAD_ID_RUNS_RUN_ID_SUBMIT_TOOL_OUTPUTS) => {
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(Body::from("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Path parameters
                let path: &str = uri.path();
                let path_params =
                    paths::REGEX_THREADS_THREAD_ID_RUNS_RUN_ID_SUBMIT_TOOL_OUTPUTS
                    .captures(path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE THREADS_THREAD_ID_RUNS_RUN_ID_SUBMIT_TOOL_OUTPUTS in set but failed match against \"{}\"", path, paths::REGEX_THREADS_THREAD_ID_RUNS_RUN_ID_SUBMIT_TOOL_OUTPUTS.as_str())
                    );

                let param_thread_id = match percent_encoding::percent_decode(path_params["thread_id"].as_bytes()).decode_utf8() {
                    Ok(param_thread_id) => match param_thread_id.parse::<String>() {
                        Ok(param_thread_id) => param_thread_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter thread_id: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["thread_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                let param_run_id = match percent_encoding::percent_decode(path_params["run_id"].as_bytes()).decode_utf8() {
                    Ok(param_run_id) => match param_run_id.parse::<String>() {
                        Ok(param_run_id) => param_run_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter run_id: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["run_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                // Handle body parameters (note that non-required body parameters will ignore garbage
                // values, rather than causing a 400 response). Produce warning header and logs for
                // any unused fields.
                let result = body.into_raw().await;
                match result {
                     Ok(body) => {
                                let mut unused_elements : Vec<String> = vec![];
                                let param_submit_tool_outputs_run_request: Option<models::SubmitToolOutputsRunRequest> = if !body.is_empty() {
                                    let deserializer = &mut serde_json::Deserializer::from_slice(&*body);
                                    match serde_ignored::deserialize(deserializer, |path| {
                                            warn!("Ignoring unknown field in body: {}", path);
                                            unused_elements.push(path.to_string());
                                    }) {
                                        Ok(param_submit_tool_outputs_run_request) => param_submit_tool_outputs_run_request,
                                        Err(e) => return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(Body::from(format!("Couldn't parse body parameter SubmitToolOutputsRunRequest - doesn't match schema: {}", e)))
                                                        .expect("Unable to create Bad Request response for invalid body parameter SubmitToolOutputsRunRequest due to schema")),
                                    }
                                } else {
                                    None
                                };
                                let param_submit_tool_outputs_run_request = match param_submit_tool_outputs_run_request {
                                    Some(param_submit_tool_outputs_run_request) => param_submit_tool_outputs_run_request,
                                    None => return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(Body::from("Missing required body parameter SubmitToolOutputsRunRequest"))
                                                        .expect("Unable to create Bad Request response for missing body parameter SubmitToolOutputsRunRequest")),
                                };


                                let result = api_impl.submit_tool_ouputs_to_run(
                                            param_thread_id,
                                            param_run_id,
                                            param_submit_tool_outputs_run_request,
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
                                                SubmitToolOuputsToRunResponse::OK
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);

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
                                                .body(Body::from(format!("Unable to read body: {}", e)))
                                                .expect("Unable to create Bad Request response due to unable to read body")),
                        }
            },

            // GetMessageFile - GET /threads/{thread_id}/messages/{message_id}/files/{file_id}
            hyper::Method::GET if path.matched(paths::ID_THREADS_THREAD_ID_MESSAGES_MESSAGE_ID_FILES_FILE_ID) => {
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(Body::from("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Path parameters
                let path: &str = uri.path();
                let path_params =
                    paths::REGEX_THREADS_THREAD_ID_MESSAGES_MESSAGE_ID_FILES_FILE_ID
                    .captures(path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE THREADS_THREAD_ID_MESSAGES_MESSAGE_ID_FILES_FILE_ID in set but failed match against \"{}\"", path, paths::REGEX_THREADS_THREAD_ID_MESSAGES_MESSAGE_ID_FILES_FILE_ID.as_str())
                    );

                let param_thread_id = match percent_encoding::percent_decode(path_params["thread_id"].as_bytes()).decode_utf8() {
                    Ok(param_thread_id) => match param_thread_id.parse::<String>() {
                        Ok(param_thread_id) => param_thread_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter thread_id: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["thread_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                let param_message_id = match percent_encoding::percent_decode(path_params["message_id"].as_bytes()).decode_utf8() {
                    Ok(param_message_id) => match param_message_id.parse::<String>() {
                        Ok(param_message_id) => param_message_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter message_id: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["message_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

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

                                let result = api_impl.get_message_file(
                                            param_thread_id,
                                            param_message_id,
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
                                                GetMessageFileResponse::OK
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);

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

            // GetRunStep - GET /threads/{thread_id}/runs/{run_id}/steps/{step_id}
            hyper::Method::GET if path.matched(paths::ID_THREADS_THREAD_ID_RUNS_RUN_ID_STEPS_STEP_ID) => {
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(Body::from("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Path parameters
                let path: &str = uri.path();
                let path_params =
                    paths::REGEX_THREADS_THREAD_ID_RUNS_RUN_ID_STEPS_STEP_ID
                    .captures(path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE THREADS_THREAD_ID_RUNS_RUN_ID_STEPS_STEP_ID in set but failed match against \"{}\"", path, paths::REGEX_THREADS_THREAD_ID_RUNS_RUN_ID_STEPS_STEP_ID.as_str())
                    );

                let param_thread_id = match percent_encoding::percent_decode(path_params["thread_id"].as_bytes()).decode_utf8() {
                    Ok(param_thread_id) => match param_thread_id.parse::<String>() {
                        Ok(param_thread_id) => param_thread_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter thread_id: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["thread_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                let param_run_id = match percent_encoding::percent_decode(path_params["run_id"].as_bytes()).decode_utf8() {
                    Ok(param_run_id) => match param_run_id.parse::<String>() {
                        Ok(param_run_id) => param_run_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter run_id: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["run_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                let param_step_id = match percent_encoding::percent_decode(path_params["step_id"].as_bytes()).decode_utf8() {
                    Ok(param_step_id) => match param_step_id.parse::<String>() {
                        Ok(param_step_id) => param_step_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter step_id: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["step_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                                let result = api_impl.get_run_step(
                                            param_thread_id,
                                            param_run_id,
                                            param_step_id,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GetRunStepResponse::OK
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);

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

            // CreateSpeech - POST /audio/speech
            hyper::Method::POST if path.matched(paths::ID_AUDIO_SPEECH) => {
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(Body::from("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Handle body parameters (note that non-required body parameters will ignore garbage
                // values, rather than causing a 400 response). Produce warning header and logs for
                // any unused fields.
                let result = body.into_raw().await;
                match result {
                     Ok(body) => {
                                let mut unused_elements : Vec<String> = vec![];
                                let param_create_speech_request: Option<models::CreateSpeechRequest> = if !body.is_empty() {
                                    let deserializer = &mut serde_json::Deserializer::from_slice(&*body);
                                    match serde_ignored::deserialize(deserializer, |path| {
                                            warn!("Ignoring unknown field in body: {}", path);
                                            unused_elements.push(path.to_string());
                                    }) {
                                        Ok(param_create_speech_request) => param_create_speech_request,
                                        Err(e) => return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(Body::from(format!("Couldn't parse body parameter CreateSpeechRequest - doesn't match schema: {}", e)))
                                                        .expect("Unable to create Bad Request response for invalid body parameter CreateSpeechRequest due to schema")),
                                    }
                                } else {
                                    None
                                };
                                let param_create_speech_request = match param_create_speech_request {
                                    Some(param_create_speech_request) => param_create_speech_request,
                                    None => return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(Body::from("Missing required body parameter CreateSpeechRequest"))
                                                        .expect("Unable to create Bad Request response for missing body parameter CreateSpeechRequest")),
                                };


                                let result = api_impl.create_speech(
                                            param_create_speech_request,
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
                                                CreateSpeechResponse::OK
                                                    {
                                                        body,
                                                        transfer_encoding
                                                    }
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");

                                                    if let Some(transfer_encoding) = transfer_encoding {
                                                    let transfer_encoding = match header::IntoHeaderValue(transfer_encoding).try_into() {
                                                        Ok(val) => val,
                                                        Err(e) => {
                                                            return Ok(Response::builder()
                                                                    .status(StatusCode::INTERNAL_SERVER_ERROR)
                                                                    .body(Body::from(format!("An internal server error occurred handling transfer_encoding header - {}", e)))
                                                                    .expect("Unable to create Internal Server Error for invalid response header"))
                                                        }
                                                    };

                                                    response.headers_mut().insert(
                                                        HeaderName::from_static("transfer-encoding"),
                                                        transfer_encoding
                                                    );
                                                    }
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/octet-stream")
                                                            .expect("Unable to create Content-Type header for application/octet-stream"));
                                                    // Binary Body
                                                    let body = body.0;
                                                    *response.body_mut() = Body::from(body);

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
                                                .body(Body::from(format!("Unable to read body: {}", e)))
                                                .expect("Unable to create Bad Request response due to unable to read body")),
                        }
            },

            // CreateTranscription - POST /audio/transcriptions
            hyper::Method::POST if path.matched(paths::ID_AUDIO_TRANSCRIPTIONS) => {
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(Body::from("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Handle body parameters (note that non-required body parameters will ignore garbage
                // values, rather than causing a 400 response). Produce warning header and logs for
                // any unused fields.
                let result = body.into_raw().await;
                match result {
                     Ok(body) => {
                                let boundary = match swagger::multipart::form::boundary(&headers) {
                                    Some(boundary) => boundary.to_string(),
                                    None => return Ok(Response::builder()
                                                .status(StatusCode::BAD_REQUEST)
                                                .body(Body::from("Couldn't find valid multipart body".to_string()))
                                                .expect("Unable to create Bad Request response for incorrect boundary")),
                                };

                                use std::io::Read;

                                // Read Form Parameters from body
                                let mut entries = match Multipart::with_body(&body.to_vec()[..], boundary)
                                    .save()
                                    .size_limit(multipart_form_size_limit)
                                    .temp()
                                {
                                    SaveResult::Full(entries) => {
                                        entries
                                    },
                                    SaveResult::Partial(_, PartialReason::CountLimit) => {
                                        return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(Body::from("Unable to process message part due to excessive parts".to_string()))
                                                        .expect("Unable to create Bad Request response due to excessive parts"))
                                    },
                                    SaveResult::Partial(_, PartialReason::SizeLimit) => {
                                        return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(Body::from("Unable to process message part due to excessive data".to_string()))
                                                        .expect("Unable to create Bad Request response due to excessive data"))
                                    },
                                    SaveResult::Partial(_, PartialReason::Utf8Error(_)) => {
                                        return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(Body::from("Unable to process message part due to invalid data".to_string()))
                                                        .expect("Unable to create Bad Request response due to invalid data"))
                                    },
                                    SaveResult::Partial(_, PartialReason::IoError(_)) => {
                                        return Ok(Response::builder()
                                                        .status(StatusCode::INTERNAL_SERVER_ERROR)
                                                        .body(Body::from("Failed to process message part due an internal error".to_string()))
                                                        .expect("Unable to create Internal Server Error response due to an internal errror"))
                                    },
                                    SaveResult::Error(e) => {
                                        return Ok(Response::builder()
                                                        .status(StatusCode::INTERNAL_SERVER_ERROR)
                                                        .body(Body::from("Failed to process all message parts due to an internal error".to_string()))
                                                        .expect("Unable to create Internal Server Error response due to an internal error"))
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
                                        let response_format_model: models::CreateTranscriptionRequestResponseFormat = match serde_json::from_str(&data) {
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
                                let field_timestamp_granularities_left_square_bracket_right_square_bracket = entries.fields.remove("timestamp_granularities_left_square_bracket_right_square_bracket");
                                let param_timestamp_granularities_left_square_bracket_right_square_bracket = match field_timestamp_granularities_left_square_bracket_right_square_bracket {
                                    Some(field) => {
                                        let mut reader = field[0].data.readable().expect("Unable to read field for timestamp_granularities_left_square_bracket_right_square_bracket");
                                    Some({
                                        let mut data = String::new();
                                        reader.read_to_string(&mut data).expect("Reading saved String should never fail");
                                        let timestamp_granularities_left_square_bracket_right_square_bracket_model: Vec<models::CreateTranscriptionRequestTimestampGranularitiesInner> = match serde_json::from_str(&data) {
                                            Ok(model) => model,
                                            Err(e) => {
                                                return Ok(
                                                    Response::builder()
                                                    .status(StatusCode::BAD_REQUEST)
                                                    .body(Body::from(format!("timestamp_granularities_left_square_bracket_right_square_bracket data does not match API definition : {}", e)))
                                                    .expect("Unable to create Bad Request due to missing required form parameter timestamp_granularities_left_square_bracket_right_square_bracket"))
                                            }
                                        };
                                        timestamp_granularities_left_square_bracket_right_square_bracket_model
                                    })
                                    },
                                    None => {
                                            None
                                    }
                                };


                                let result = api_impl.create_transcription(
                                            param_file,
                                            param_model,
                                            param_language,
                                            param_prompt,
                                            param_response_format,
                                            param_temperature,
                                            param_timestamp_granularities_left_square_bracket_right_square_bracket.as_ref(),
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
                                                            .expect("Unable to create Content-Type header for application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);

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
                                                .body(Body::from(format!("Unable to read body: {}", e)))
                                                .expect("Unable to create Bad Request response due to unable to read body")),
                        }
            },

            // CreateTranslation - POST /audio/translations
            hyper::Method::POST if path.matched(paths::ID_AUDIO_TRANSLATIONS) => {
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(Body::from("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Handle body parameters (note that non-required body parameters will ignore garbage
                // values, rather than causing a 400 response). Produce warning header and logs for
                // any unused fields.
                let result = body.into_raw().await;
                match result {
                     Ok(body) => {
                                let boundary = match swagger::multipart::form::boundary(&headers) {
                                    Some(boundary) => boundary.to_string(),
                                    None => return Ok(Response::builder()
                                                .status(StatusCode::BAD_REQUEST)
                                                .body(Body::from("Couldn't find valid multipart body".to_string()))
                                                .expect("Unable to create Bad Request response for incorrect boundary")),
                                };

                                use std::io::Read;

                                // Read Form Parameters from body
                                let mut entries = match Multipart::with_body(&body.to_vec()[..], boundary)
                                    .save()
                                    .size_limit(multipart_form_size_limit)
                                    .temp()
                                {
                                    SaveResult::Full(entries) => {
                                        entries
                                    },
                                    SaveResult::Partial(_, PartialReason::CountLimit) => {
                                        return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(Body::from("Unable to process message part due to excessive parts".to_string()))
                                                        .expect("Unable to create Bad Request response due to excessive parts"))
                                    },
                                    SaveResult::Partial(_, PartialReason::SizeLimit) => {
                                        return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(Body::from("Unable to process message part due to excessive data".to_string()))
                                                        .expect("Unable to create Bad Request response due to excessive data"))
                                    },
                                    SaveResult::Partial(_, PartialReason::Utf8Error(_)) => {
                                        return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(Body::from("Unable to process message part due to invalid data".to_string()))
                                                        .expect("Unable to create Bad Request response due to invalid data"))
                                    },
                                    SaveResult::Partial(_, PartialReason::IoError(_)) => {
                                        return Ok(Response::builder()
                                                        .status(StatusCode::INTERNAL_SERVER_ERROR)
                                                        .body(Body::from("Failed to process message part due an internal error".to_string()))
                                                        .expect("Unable to create Internal Server Error response due to an internal errror"))
                                    },
                                    SaveResult::Error(e) => {
                                        return Ok(Response::builder()
                                                        .status(StatusCode::INTERNAL_SERVER_ERROR)
                                                        .body(Body::from("Failed to process all message parts due to an internal error".to_string()))
                                                        .expect("Unable to create Internal Server Error response due to an internal error"))
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
                                                            .expect("Unable to create Content-Type header for application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);

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
                                                .body(Body::from(format!("Unable to read body: {}", e)))
                                                .expect("Unable to create Bad Request response due to unable to read body")),
                        }
            },

            // CreateChatCompletion - POST /chat/completions
            hyper::Method::POST if path.matched(paths::ID_CHAT_COMPLETIONS) => {
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(Body::from("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Handle body parameters (note that non-required body parameters will ignore garbage
                // values, rather than causing a 400 response). Produce warning header and logs for
                // any unused fields.
                let result = body.into_raw().await;
                match result {
                     Ok(body) => {
                                let mut unused_elements : Vec<String> = vec![];
                                let param_create_chat_completion_request: Option<models::CreateChatCompletionRequest> = if !body.is_empty() {
                                    let deserializer = &mut serde_json::Deserializer::from_slice(&*body);
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
                                                            .expect("Unable to create Content-Type header for application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);

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
                                                .body(Body::from(format!("Unable to read body: {}", e)))
                                                .expect("Unable to create Bad Request response due to unable to read body")),
                        }
            },

            // CreateCompletion - POST /completions
            hyper::Method::POST if path.matched(paths::ID_COMPLETIONS) => {
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(Body::from("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Handle body parameters (note that non-required body parameters will ignore garbage
                // values, rather than causing a 400 response). Produce warning header and logs for
                // any unused fields.
                let result = body.into_raw().await;
                match result {
                     Ok(body) => {
                                let mut unused_elements : Vec<String> = vec![];
                                let param_create_completion_request: Option<models::CreateCompletionRequest> = if !body.is_empty() {
                                    let deserializer = &mut serde_json::Deserializer::from_slice(&*body);
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
                                                            .expect("Unable to create Content-Type header for application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);

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
                                                .body(Body::from(format!("Unable to read body: {}", e)))
                                                .expect("Unable to create Bad Request response due to unable to read body")),
                        }
            },

            // CreateEmbedding - POST /embeddings
            hyper::Method::POST if path.matched(paths::ID_EMBEDDINGS) => {
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(Body::from("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Handle body parameters (note that non-required body parameters will ignore garbage
                // values, rather than causing a 400 response). Produce warning header and logs for
                // any unused fields.
                let result = body.into_raw().await;
                match result {
                     Ok(body) => {
                                let mut unused_elements : Vec<String> = vec![];
                                let param_create_embedding_request: Option<models::CreateEmbeddingRequest> = if !body.is_empty() {
                                    let deserializer = &mut serde_json::Deserializer::from_slice(&*body);
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
                                                            .expect("Unable to create Content-Type header for application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);

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
                                                .body(Body::from(format!("Unable to read body: {}", e)))
                                                .expect("Unable to create Bad Request response due to unable to read body")),
                        }
            },

            // CreateFile - POST /files
            hyper::Method::POST if path.matched(paths::ID_FILES) => {
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(Body::from("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Handle body parameters (note that non-required body parameters will ignore garbage
                // values, rather than causing a 400 response). Produce warning header and logs for
                // any unused fields.
                let result = body.into_raw().await;
                match result {
                     Ok(body) => {
                                let boundary = match swagger::multipart::form::boundary(&headers) {
                                    Some(boundary) => boundary.to_string(),
                                    None => return Ok(Response::builder()
                                                .status(StatusCode::BAD_REQUEST)
                                                .body(Body::from("Couldn't find valid multipart body".to_string()))
                                                .expect("Unable to create Bad Request response for incorrect boundary")),
                                };

                                use std::io::Read;

                                // Read Form Parameters from body
                                let mut entries = match Multipart::with_body(&body.to_vec()[..], boundary)
                                    .save()
                                    .size_limit(multipart_form_size_limit)
                                    .temp()
                                {
                                    SaveResult::Full(entries) => {
                                        entries
                                    },
                                    SaveResult::Partial(_, PartialReason::CountLimit) => {
                                        return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(Body::from("Unable to process message part due to excessive parts".to_string()))
                                                        .expect("Unable to create Bad Request response due to excessive parts"))
                                    },
                                    SaveResult::Partial(_, PartialReason::SizeLimit) => {
                                        return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(Body::from("Unable to process message part due to excessive data".to_string()))
                                                        .expect("Unable to create Bad Request response due to excessive data"))
                                    },
                                    SaveResult::Partial(_, PartialReason::Utf8Error(_)) => {
                                        return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(Body::from("Unable to process message part due to invalid data".to_string()))
                                                        .expect("Unable to create Bad Request response due to invalid data"))
                                    },
                                    SaveResult::Partial(_, PartialReason::IoError(_)) => {
                                        return Ok(Response::builder()
                                                        .status(StatusCode::INTERNAL_SERVER_ERROR)
                                                        .body(Body::from("Failed to process message part due an internal error".to_string()))
                                                        .expect("Unable to create Internal Server Error response due to an internal errror"))
                                    },
                                    SaveResult::Error(e) => {
                                        return Ok(Response::builder()
                                                        .status(StatusCode::INTERNAL_SERVER_ERROR)
                                                        .body(Body::from("Failed to process all message parts due to an internal error".to_string()))
                                                        .expect("Unable to create Internal Server Error response due to an internal error"))
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
                                        let purpose_model: models::CreateFileRequestPurpose = match serde_json::from_str(&data) {
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
                                                            .expect("Unable to create Content-Type header for application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);

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
                                                .body(Body::from(format!("Unable to read body: {}", e)))
                                                .expect("Unable to create Bad Request response due to unable to read body")),
                        }
            },

            // ListFiles - GET /files
            hyper::Method::GET if path.matched(paths::ID_FILES) => {
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(Body::from("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_purpose = query_params.iter().filter(|e| e.0 == "purpose").map(|e| e.1.clone())
                    .next();
                let param_purpose = match param_purpose {
                    Some(param_purpose) => {
                        let param_purpose =
                            <String as std::str::FromStr>::from_str
                                (&param_purpose);
                        match param_purpose {
                            Ok(param_purpose) => Some(param_purpose),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter purpose - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter purpose")),
                        }
                    },
                    None => None,
                };

                                let result = api_impl.list_files(
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
                                                ListFilesResponse::OK
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);

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

            // DeleteFile - DELETE /files/{file_id}
            hyper::Method::DELETE if path.matched(paths::ID_FILES_FILE_ID) => {
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(Body::from("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

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
                                                            .expect("Unable to create Content-Type header for application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);

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
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(Body::from("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

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
                                                            .expect("Unable to create Content-Type header for application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);

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
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(Body::from("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

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
                                                            .expect("Unable to create Content-Type header for application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);

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

            // CreateFineTuningJob - POST /fine_tuning/jobs
            hyper::Method::POST if path.matched(paths::ID_FINE_TUNING_JOBS) => {
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(Body::from("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Handle body parameters (note that non-required body parameters will ignore garbage
                // values, rather than causing a 400 response). Produce warning header and logs for
                // any unused fields.
                let result = body.into_raw().await;
                match result {
                     Ok(body) => {
                                let mut unused_elements : Vec<String> = vec![];
                                let param_create_fine_tuning_job_request: Option<models::CreateFineTuningJobRequest> = if !body.is_empty() {
                                    let deserializer = &mut serde_json::Deserializer::from_slice(&*body);
                                    match serde_ignored::deserialize(deserializer, |path| {
                                            warn!("Ignoring unknown field in body: {}", path);
                                            unused_elements.push(path.to_string());
                                    }) {
                                        Ok(param_create_fine_tuning_job_request) => param_create_fine_tuning_job_request,
                                        Err(e) => return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(Body::from(format!("Couldn't parse body parameter CreateFineTuningJobRequest - doesn't match schema: {}", e)))
                                                        .expect("Unable to create Bad Request response for invalid body parameter CreateFineTuningJobRequest due to schema")),
                                    }
                                } else {
                                    None
                                };
                                let param_create_fine_tuning_job_request = match param_create_fine_tuning_job_request {
                                    Some(param_create_fine_tuning_job_request) => param_create_fine_tuning_job_request,
                                    None => return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(Body::from("Missing required body parameter CreateFineTuningJobRequest"))
                                                        .expect("Unable to create Bad Request response for missing body parameter CreateFineTuningJobRequest")),
                                };


                                let result = api_impl.create_fine_tuning_job(
                                            param_create_fine_tuning_job_request,
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
                                                CreateFineTuningJobResponse::OK
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);

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
                                                .body(Body::from(format!("Unable to read body: {}", e)))
                                                .expect("Unable to create Bad Request response due to unable to read body")),
                        }
            },

            // ListPaginatedFineTuningJobs - GET /fine_tuning/jobs
            hyper::Method::GET if path.matched(paths::ID_FINE_TUNING_JOBS) => {
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(Body::from("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_after = query_params.iter().filter(|e| e.0 == "after").map(|e| e.1.clone())
                    .next();
                let param_after = match param_after {
                    Some(param_after) => {
                        let param_after =
                            <String as std::str::FromStr>::from_str
                                (&param_after);
                        match param_after {
                            Ok(param_after) => Some(param_after),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter after - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter after")),
                        }
                    },
                    None => None,
                };
                let param_limit = query_params.iter().filter(|e| e.0 == "limit").map(|e| e.1.clone())
                    .next();
                let param_limit = match param_limit {
                    Some(param_limit) => {
                        let param_limit =
                            <i32 as std::str::FromStr>::from_str
                                (&param_limit);
                        match param_limit {
                            Ok(param_limit) => Some(param_limit),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter limit - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter limit")),
                        }
                    },
                    None => None,
                };

                                let result = api_impl.list_paginated_fine_tuning_jobs(
                                            param_after,
                                            param_limit,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                ListPaginatedFineTuningJobsResponse::OK
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);

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

            // CancelFineTuningJob - POST /fine_tuning/jobs/{fine_tuning_job_id}/cancel
            hyper::Method::POST if path.matched(paths::ID_FINE_TUNING_JOBS_FINE_TUNING_JOB_ID_CANCEL) => {
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(Body::from("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Path parameters
                let path: &str = uri.path();
                let path_params =
                    paths::REGEX_FINE_TUNING_JOBS_FINE_TUNING_JOB_ID_CANCEL
                    .captures(path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE FINE_TUNING_JOBS_FINE_TUNING_JOB_ID_CANCEL in set but failed match against \"{}\"", path, paths::REGEX_FINE_TUNING_JOBS_FINE_TUNING_JOB_ID_CANCEL.as_str())
                    );

                let param_fine_tuning_job_id = match percent_encoding::percent_decode(path_params["fine_tuning_job_id"].as_bytes()).decode_utf8() {
                    Ok(param_fine_tuning_job_id) => match param_fine_tuning_job_id.parse::<String>() {
                        Ok(param_fine_tuning_job_id) => param_fine_tuning_job_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter fine_tuning_job_id: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["fine_tuning_job_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                                let result = api_impl.cancel_fine_tuning_job(
                                            param_fine_tuning_job_id,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                CancelFineTuningJobResponse::OK
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);

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

            // ListFineTuningEvents - GET /fine_tuning/jobs/{fine_tuning_job_id}/events
            hyper::Method::GET if path.matched(paths::ID_FINE_TUNING_JOBS_FINE_TUNING_JOB_ID_EVENTS) => {
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(Body::from("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Path parameters
                let path: &str = uri.path();
                let path_params =
                    paths::REGEX_FINE_TUNING_JOBS_FINE_TUNING_JOB_ID_EVENTS
                    .captures(path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE FINE_TUNING_JOBS_FINE_TUNING_JOB_ID_EVENTS in set but failed match against \"{}\"", path, paths::REGEX_FINE_TUNING_JOBS_FINE_TUNING_JOB_ID_EVENTS.as_str())
                    );

                let param_fine_tuning_job_id = match percent_encoding::percent_decode(path_params["fine_tuning_job_id"].as_bytes()).decode_utf8() {
                    Ok(param_fine_tuning_job_id) => match param_fine_tuning_job_id.parse::<String>() {
                        Ok(param_fine_tuning_job_id) => param_fine_tuning_job_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter fine_tuning_job_id: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["fine_tuning_job_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_after = query_params.iter().filter(|e| e.0 == "after").map(|e| e.1.clone())
                    .next();
                let param_after = match param_after {
                    Some(param_after) => {
                        let param_after =
                            <String as std::str::FromStr>::from_str
                                (&param_after);
                        match param_after {
                            Ok(param_after) => Some(param_after),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter after - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter after")),
                        }
                    },
                    None => None,
                };
                let param_limit = query_params.iter().filter(|e| e.0 == "limit").map(|e| e.1.clone())
                    .next();
                let param_limit = match param_limit {
                    Some(param_limit) => {
                        let param_limit =
                            <i32 as std::str::FromStr>::from_str
                                (&param_limit);
                        match param_limit {
                            Ok(param_limit) => Some(param_limit),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter limit - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter limit")),
                        }
                    },
                    None => None,
                };

                                let result = api_impl.list_fine_tuning_events(
                                            param_fine_tuning_job_id,
                                            param_after,
                                            param_limit,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                ListFineTuningEventsResponse::OK
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);

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

            // ListFineTuningJobCheckpoints - GET /fine_tuning/jobs/{fine_tuning_job_id}/checkpoints
            hyper::Method::GET if path.matched(paths::ID_FINE_TUNING_JOBS_FINE_TUNING_JOB_ID_CHECKPOINTS) => {
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(Body::from("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Path parameters
                let path: &str = uri.path();
                let path_params =
                    paths::REGEX_FINE_TUNING_JOBS_FINE_TUNING_JOB_ID_CHECKPOINTS
                    .captures(path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE FINE_TUNING_JOBS_FINE_TUNING_JOB_ID_CHECKPOINTS in set but failed match against \"{}\"", path, paths::REGEX_FINE_TUNING_JOBS_FINE_TUNING_JOB_ID_CHECKPOINTS.as_str())
                    );

                let param_fine_tuning_job_id = match percent_encoding::percent_decode(path_params["fine_tuning_job_id"].as_bytes()).decode_utf8() {
                    Ok(param_fine_tuning_job_id) => match param_fine_tuning_job_id.parse::<String>() {
                        Ok(param_fine_tuning_job_id) => param_fine_tuning_job_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter fine_tuning_job_id: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["fine_tuning_job_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_after = query_params.iter().filter(|e| e.0 == "after").map(|e| e.1.clone())
                    .next();
                let param_after = match param_after {
                    Some(param_after) => {
                        let param_after =
                            <String as std::str::FromStr>::from_str
                                (&param_after);
                        match param_after {
                            Ok(param_after) => Some(param_after),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter after - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter after")),
                        }
                    },
                    None => None,
                };
                let param_limit = query_params.iter().filter(|e| e.0 == "limit").map(|e| e.1.clone())
                    .next();
                let param_limit = match param_limit {
                    Some(param_limit) => {
                        let param_limit =
                            <i32 as std::str::FromStr>::from_str
                                (&param_limit);
                        match param_limit {
                            Ok(param_limit) => Some(param_limit),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter limit - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter limit")),
                        }
                    },
                    None => None,
                };

                                let result = api_impl.list_fine_tuning_job_checkpoints(
                                            param_fine_tuning_job_id,
                                            param_after,
                                            param_limit,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                ListFineTuningJobCheckpointsResponse::OK
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);

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

            // RetrieveFineTuningJob - GET /fine_tuning/jobs/{fine_tuning_job_id}
            hyper::Method::GET if path.matched(paths::ID_FINE_TUNING_JOBS_FINE_TUNING_JOB_ID) => {
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(Body::from("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Path parameters
                let path: &str = uri.path();
                let path_params =
                    paths::REGEX_FINE_TUNING_JOBS_FINE_TUNING_JOB_ID
                    .captures(path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE FINE_TUNING_JOBS_FINE_TUNING_JOB_ID in set but failed match against \"{}\"", path, paths::REGEX_FINE_TUNING_JOBS_FINE_TUNING_JOB_ID.as_str())
                    );

                let param_fine_tuning_job_id = match percent_encoding::percent_decode(path_params["fine_tuning_job_id"].as_bytes()).decode_utf8() {
                    Ok(param_fine_tuning_job_id) => match param_fine_tuning_job_id.parse::<String>() {
                        Ok(param_fine_tuning_job_id) => param_fine_tuning_job_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter fine_tuning_job_id: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["fine_tuning_job_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                                let result = api_impl.retrieve_fine_tuning_job(
                                            param_fine_tuning_job_id,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                RetrieveFineTuningJobResponse::OK
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);

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

            // CreateImage - POST /images/generations
            hyper::Method::POST if path.matched(paths::ID_IMAGES_GENERATIONS) => {
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(Body::from("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Handle body parameters (note that non-required body parameters will ignore garbage
                // values, rather than causing a 400 response). Produce warning header and logs for
                // any unused fields.
                let result = body.into_raw().await;
                match result {
                     Ok(body) => {
                                let mut unused_elements : Vec<String> = vec![];
                                let param_create_image_request: Option<models::CreateImageRequest> = if !body.is_empty() {
                                    let deserializer = &mut serde_json::Deserializer::from_slice(&*body);
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
                                                            .expect("Unable to create Content-Type header for application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);

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
                                                .body(Body::from(format!("Unable to read body: {}", e)))
                                                .expect("Unable to create Bad Request response due to unable to read body")),
                        }
            },

            // CreateImageEdit - POST /images/edits
            hyper::Method::POST if path.matched(paths::ID_IMAGES_EDITS) => {
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(Body::from("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Handle body parameters (note that non-required body parameters will ignore garbage
                // values, rather than causing a 400 response). Produce warning header and logs for
                // any unused fields.
                let result = body.into_raw().await;
                match result {
                     Ok(body) => {
                                let boundary = match swagger::multipart::form::boundary(&headers) {
                                    Some(boundary) => boundary.to_string(),
                                    None => return Ok(Response::builder()
                                                .status(StatusCode::BAD_REQUEST)
                                                .body(Body::from("Couldn't find valid multipart body".to_string()))
                                                .expect("Unable to create Bad Request response for incorrect boundary")),
                                };

                                use std::io::Read;

                                // Read Form Parameters from body
                                let mut entries = match Multipart::with_body(&body.to_vec()[..], boundary)
                                    .save()
                                    .size_limit(multipart_form_size_limit)
                                    .temp()
                                {
                                    SaveResult::Full(entries) => {
                                        entries
                                    },
                                    SaveResult::Partial(_, PartialReason::CountLimit) => {
                                        return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(Body::from("Unable to process message part due to excessive parts".to_string()))
                                                        .expect("Unable to create Bad Request response due to excessive parts"))
                                    },
                                    SaveResult::Partial(_, PartialReason::SizeLimit) => {
                                        return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(Body::from("Unable to process message part due to excessive data".to_string()))
                                                        .expect("Unable to create Bad Request response due to excessive data"))
                                    },
                                    SaveResult::Partial(_, PartialReason::Utf8Error(_)) => {
                                        return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(Body::from("Unable to process message part due to invalid data".to_string()))
                                                        .expect("Unable to create Bad Request response due to invalid data"))
                                    },
                                    SaveResult::Partial(_, PartialReason::IoError(_)) => {
                                        return Ok(Response::builder()
                                                        .status(StatusCode::INTERNAL_SERVER_ERROR)
                                                        .body(Body::from("Failed to process message part due an internal error".to_string()))
                                                        .expect("Unable to create Internal Server Error response due to an internal errror"))
                                    },
                                    SaveResult::Error(e) => {
                                        return Ok(Response::builder()
                                                        .status(StatusCode::INTERNAL_SERVER_ERROR)
                                                        .body(Body::from("Failed to process all message parts due to an internal error".to_string()))
                                                        .expect("Unable to create Internal Server Error response due to an internal error"))
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
                                let field_model = entries.fields.remove("model");
                                let param_model = match field_model {
                                    Some(field) => {
                                        let mut reader = field[0].data.readable().expect("Unable to read field for model");
                                    Some({
                                        let mut data = String::new();
                                        reader.read_to_string(&mut data).expect("Reading saved String should never fail");
                                        let model_model: swagger::Nullable<models::CreateImageEditRequestModel> = match serde_json::from_str(&data) {
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
                                    })
                                    },
                                    None => {
                                            None
                                    }
                                };
                                let field_n = entries.fields.remove("n");
                                let param_n = match field_n {
                                    Some(field) => {
                                        let mut reader = field[0].data.readable().expect("Unable to read field for n");
                                    Some({
                                        let mut data = String::new();
                                        reader.read_to_string(&mut data).expect("Reading saved String should never fail");
                                        let n_model: swagger::Nullable<i32> = match serde_json::from_str(&data) {
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
                                        let size_model: swagger::Nullable<models::CreateImageEditRequestSize> = match serde_json::from_str(&data) {
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
                                        let response_format_model: swagger::Nullable<models::CreateImageRequestResponseFormat> = match serde_json::from_str(&data) {
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
                                            param_model,
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
                                                            .expect("Unable to create Content-Type header for application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);

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
                                                .body(Body::from(format!("Unable to read body: {}", e)))
                                                .expect("Unable to create Bad Request response due to unable to read body")),
                        }
            },

            // CreateImageVariation - POST /images/variations
            hyper::Method::POST if path.matched(paths::ID_IMAGES_VARIATIONS) => {
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(Body::from("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Handle body parameters (note that non-required body parameters will ignore garbage
                // values, rather than causing a 400 response). Produce warning header and logs for
                // any unused fields.
                let result = body.into_raw().await;
                match result {
                     Ok(body) => {
                                let boundary = match swagger::multipart::form::boundary(&headers) {
                                    Some(boundary) => boundary.to_string(),
                                    None => return Ok(Response::builder()
                                                .status(StatusCode::BAD_REQUEST)
                                                .body(Body::from("Couldn't find valid multipart body".to_string()))
                                                .expect("Unable to create Bad Request response for incorrect boundary")),
                                };

                                use std::io::Read;

                                // Read Form Parameters from body
                                let mut entries = match Multipart::with_body(&body.to_vec()[..], boundary)
                                    .save()
                                    .size_limit(multipart_form_size_limit)
                                    .temp()
                                {
                                    SaveResult::Full(entries) => {
                                        entries
                                    },
                                    SaveResult::Partial(_, PartialReason::CountLimit) => {
                                        return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(Body::from("Unable to process message part due to excessive parts".to_string()))
                                                        .expect("Unable to create Bad Request response due to excessive parts"))
                                    },
                                    SaveResult::Partial(_, PartialReason::SizeLimit) => {
                                        return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(Body::from("Unable to process message part due to excessive data".to_string()))
                                                        .expect("Unable to create Bad Request response due to excessive data"))
                                    },
                                    SaveResult::Partial(_, PartialReason::Utf8Error(_)) => {
                                        return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(Body::from("Unable to process message part due to invalid data".to_string()))
                                                        .expect("Unable to create Bad Request response due to invalid data"))
                                    },
                                    SaveResult::Partial(_, PartialReason::IoError(_)) => {
                                        return Ok(Response::builder()
                                                        .status(StatusCode::INTERNAL_SERVER_ERROR)
                                                        .body(Body::from("Failed to process message part due an internal error".to_string()))
                                                        .expect("Unable to create Internal Server Error response due to an internal errror"))
                                    },
                                    SaveResult::Error(e) => {
                                        return Ok(Response::builder()
                                                        .status(StatusCode::INTERNAL_SERVER_ERROR)
                                                        .body(Body::from("Failed to process all message parts due to an internal error".to_string()))
                                                        .expect("Unable to create Internal Server Error response due to an internal error"))
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
                                let field_model = entries.fields.remove("model");
                                let param_model = match field_model {
                                    Some(field) => {
                                        let mut reader = field[0].data.readable().expect("Unable to read field for model");
                                    Some({
                                        let mut data = String::new();
                                        reader.read_to_string(&mut data).expect("Reading saved String should never fail");
                                        let model_model: swagger::Nullable<models::CreateImageEditRequestModel> = match serde_json::from_str(&data) {
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
                                    })
                                    },
                                    None => {
                                            None
                                    }
                                };
                                let field_n = entries.fields.remove("n");
                                let param_n = match field_n {
                                    Some(field) => {
                                        let mut reader = field[0].data.readable().expect("Unable to read field for n");
                                    Some({
                                        let mut data = String::new();
                                        reader.read_to_string(&mut data).expect("Reading saved String should never fail");
                                        let n_model: swagger::Nullable<i32> = match serde_json::from_str(&data) {
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
                                let field_response_format = entries.fields.remove("response_format");
                                let param_response_format = match field_response_format {
                                    Some(field) => {
                                        let mut reader = field[0].data.readable().expect("Unable to read field for response_format");
                                    Some({
                                        let mut data = String::new();
                                        reader.read_to_string(&mut data).expect("Reading saved String should never fail");
                                        let response_format_model: swagger::Nullable<models::CreateImageRequestResponseFormat> = match serde_json::from_str(&data) {
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
                                let field_size = entries.fields.remove("size");
                                let param_size = match field_size {
                                    Some(field) => {
                                        let mut reader = field[0].data.readable().expect("Unable to read field for size");
                                    Some({
                                        let mut data = String::new();
                                        reader.read_to_string(&mut data).expect("Reading saved String should never fail");
                                        let size_model: swagger::Nullable<models::CreateImageEditRequestSize> = match serde_json::from_str(&data) {
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
                                            param_model,
                                            param_n,
                                            param_response_format,
                                            param_size,
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
                                                            .expect("Unable to create Content-Type header for application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);

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
                                                .body(Body::from(format!("Unable to read body: {}", e)))
                                                .expect("Unable to create Bad Request response due to unable to read body")),
                        }
            },

            // ListModels - GET /models
            hyper::Method::GET if path.matched(paths::ID_MODELS) => {
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(Body::from("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

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
                                                            .expect("Unable to create Content-Type header for application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);

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
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(Body::from("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

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
                                                            .expect("Unable to create Content-Type header for application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);

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
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(Body::from("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

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
                                                            .expect("Unable to create Content-Type header for application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);

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

            // CreateModeration - POST /moderations
            hyper::Method::POST if path.matched(paths::ID_MODERATIONS) => {
                {
                    let authorization = match *(&context as &dyn Has<Option<Authorization>>).get() {
                        Some(ref authorization) => authorization,
                        None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(Body::from("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };
                }

                // Handle body parameters (note that non-required body parameters will ignore garbage
                // values, rather than causing a 400 response). Produce warning header and logs for
                // any unused fields.
                let result = body.into_raw().await;
                match result {
                     Ok(body) => {
                                let mut unused_elements : Vec<String> = vec![];
                                let param_create_moderation_request: Option<models::CreateModerationRequest> = if !body.is_empty() {
                                    let deserializer = &mut serde_json::Deserializer::from_slice(&*body);
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
                                                            .expect("Unable to create Content-Type header for application/json"));
                                                    // JSON Body
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);

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
                                                .body(Body::from(format!("Unable to read body: {}", e)))
                                                .expect("Unable to create Bad Request response due to unable to read body")),
                        }
            },

            _ if path.matched(paths::ID_ASSISTANTS) => method_not_allowed(),
            _ if path.matched(paths::ID_ASSISTANTS_ASSISTANT_ID) => method_not_allowed(),
            _ if path.matched(paths::ID_ASSISTANTS_ASSISTANT_ID_FILES) => method_not_allowed(),
            _ if path.matched(paths::ID_ASSISTANTS_ASSISTANT_ID_FILES_FILE_ID) => method_not_allowed(),
            _ if path.matched(paths::ID_AUDIO_SPEECH) => method_not_allowed(),
            _ if path.matched(paths::ID_AUDIO_TRANSCRIPTIONS) => method_not_allowed(),
            _ if path.matched(paths::ID_AUDIO_TRANSLATIONS) => method_not_allowed(),
            _ if path.matched(paths::ID_CHAT_COMPLETIONS) => method_not_allowed(),
            _ if path.matched(paths::ID_COMPLETIONS) => method_not_allowed(),
            _ if path.matched(paths::ID_EMBEDDINGS) => method_not_allowed(),
            _ if path.matched(paths::ID_FILES) => method_not_allowed(),
            _ if path.matched(paths::ID_FILES_FILE_ID) => method_not_allowed(),
            _ if path.matched(paths::ID_FILES_FILE_ID_CONTENT) => method_not_allowed(),
            _ if path.matched(paths::ID_FINE_TUNING_JOBS) => method_not_allowed(),
            _ if path.matched(paths::ID_FINE_TUNING_JOBS_FINE_TUNING_JOB_ID) => method_not_allowed(),
            _ if path.matched(paths::ID_FINE_TUNING_JOBS_FINE_TUNING_JOB_ID_CANCEL) => method_not_allowed(),
            _ if path.matched(paths::ID_FINE_TUNING_JOBS_FINE_TUNING_JOB_ID_CHECKPOINTS) => method_not_allowed(),
            _ if path.matched(paths::ID_FINE_TUNING_JOBS_FINE_TUNING_JOB_ID_EVENTS) => method_not_allowed(),
            _ if path.matched(paths::ID_IMAGES_EDITS) => method_not_allowed(),
            _ if path.matched(paths::ID_IMAGES_GENERATIONS) => method_not_allowed(),
            _ if path.matched(paths::ID_IMAGES_VARIATIONS) => method_not_allowed(),
            _ if path.matched(paths::ID_MODELS) => method_not_allowed(),
            _ if path.matched(paths::ID_MODELS_MODEL) => method_not_allowed(),
            _ if path.matched(paths::ID_MODERATIONS) => method_not_allowed(),
            _ if path.matched(paths::ID_THREADS) => method_not_allowed(),
            _ if path.matched(paths::ID_THREADS_RUNS) => method_not_allowed(),
            _ if path.matched(paths::ID_THREADS_THREAD_ID) => method_not_allowed(),
            _ if path.matched(paths::ID_THREADS_THREAD_ID_MESSAGES) => method_not_allowed(),
            _ if path.matched(paths::ID_THREADS_THREAD_ID_MESSAGES_MESSAGE_ID) => method_not_allowed(),
            _ if path.matched(paths::ID_THREADS_THREAD_ID_MESSAGES_MESSAGE_ID_FILES) => method_not_allowed(),
            _ if path.matched(paths::ID_THREADS_THREAD_ID_MESSAGES_MESSAGE_ID_FILES_FILE_ID) => method_not_allowed(),
            _ if path.matched(paths::ID_THREADS_THREAD_ID_RUNS) => method_not_allowed(),
            _ if path.matched(paths::ID_THREADS_THREAD_ID_RUNS_RUN_ID) => method_not_allowed(),
            _ if path.matched(paths::ID_THREADS_THREAD_ID_RUNS_RUN_ID_CANCEL) => method_not_allowed(),
            _ if path.matched(paths::ID_THREADS_THREAD_ID_RUNS_RUN_ID_STEPS) => method_not_allowed(),
            _ if path.matched(paths::ID_THREADS_THREAD_ID_RUNS_RUN_ID_STEPS_STEP_ID) => method_not_allowed(),
            _ if path.matched(paths::ID_THREADS_THREAD_ID_RUNS_RUN_ID_SUBMIT_TOOL_OUTPUTS) => method_not_allowed(),
                _ => Ok(Response::builder().status(StatusCode::NOT_FOUND)
                        .body(Body::empty())
                        .expect("Unable to create Not Found response"))
            }
        }
        Box::pin(run(
            self.api_impl.clone(),
            req,
            self.multipart_form_size_limit,
        ))
    }
}

/// Request parser for `Api`.
pub struct ApiRequestParser;
impl<T> RequestParser<T> for ApiRequestParser {
    fn parse_operation_id(request: &Request<T>) -> Option<&'static str> {
        let path = paths::GLOBAL_REGEX_SET.matches(request.uri().path());
        match *request.method() {
            // CreateAssistant - POST /assistants
            hyper::Method::POST if path.matched(paths::ID_ASSISTANTS) => Some("CreateAssistant"),
            // CreateThread - POST /threads
            hyper::Method::POST if path.matched(paths::ID_THREADS) => Some("CreateThread"),
            // CreateThreadAndRun - POST /threads/runs
            hyper::Method::POST if path.matched(paths::ID_THREADS_RUNS) => Some("CreateThreadAndRun"),
            // ListAssistants - GET /assistants
            hyper::Method::GET if path.matched(paths::ID_ASSISTANTS) => Some("ListAssistants"),
            // CreateAssistantFile - POST /assistants/{assistant_id}/files
            hyper::Method::POST if path.matched(paths::ID_ASSISTANTS_ASSISTANT_ID_FILES) => Some("CreateAssistantFile"),
            // CreateMessage - POST /threads/{thread_id}/messages
            hyper::Method::POST if path.matched(paths::ID_THREADS_THREAD_ID_MESSAGES) => Some("CreateMessage"),
            // CreateRun - POST /threads/{thread_id}/runs
            hyper::Method::POST if path.matched(paths::ID_THREADS_THREAD_ID_RUNS) => Some("CreateRun"),
            // DeleteAssistant - DELETE /assistants/{assistant_id}
            hyper::Method::DELETE if path.matched(paths::ID_ASSISTANTS_ASSISTANT_ID) => Some("DeleteAssistant"),
            // DeleteThread - DELETE /threads/{thread_id}
            hyper::Method::DELETE if path.matched(paths::ID_THREADS_THREAD_ID) => Some("DeleteThread"),
            // GetAssistant - GET /assistants/{assistant_id}
            hyper::Method::GET if path.matched(paths::ID_ASSISTANTS_ASSISTANT_ID) => Some("GetAssistant"),
            // GetThread - GET /threads/{thread_id}
            hyper::Method::GET if path.matched(paths::ID_THREADS_THREAD_ID) => Some("GetThread"),
            // ListAssistantFiles - GET /assistants/{assistant_id}/files
            hyper::Method::GET if path.matched(paths::ID_ASSISTANTS_ASSISTANT_ID_FILES) => Some("ListAssistantFiles"),
            // ListMessages - GET /threads/{thread_id}/messages
            hyper::Method::GET if path.matched(paths::ID_THREADS_THREAD_ID_MESSAGES) => Some("ListMessages"),
            // ListRuns - GET /threads/{thread_id}/runs
            hyper::Method::GET if path.matched(paths::ID_THREADS_THREAD_ID_RUNS) => Some("ListRuns"),
            // ModifyAssistant - POST /assistants/{assistant_id}
            hyper::Method::POST if path.matched(paths::ID_ASSISTANTS_ASSISTANT_ID) => Some("ModifyAssistant"),
            // ModifyThread - POST /threads/{thread_id}
            hyper::Method::POST if path.matched(paths::ID_THREADS_THREAD_ID) => Some("ModifyThread"),
            // CancelRun - POST /threads/{thread_id}/runs/{run_id}/cancel
            hyper::Method::POST if path.matched(paths::ID_THREADS_THREAD_ID_RUNS_RUN_ID_CANCEL) => Some("CancelRun"),
            // DeleteAssistantFile - DELETE /assistants/{assistant_id}/files/{file_id}
            hyper::Method::DELETE if path.matched(paths::ID_ASSISTANTS_ASSISTANT_ID_FILES_FILE_ID) => Some("DeleteAssistantFile"),
            // GetAssistantFile - GET /assistants/{assistant_id}/files/{file_id}
            hyper::Method::GET if path.matched(paths::ID_ASSISTANTS_ASSISTANT_ID_FILES_FILE_ID) => Some("GetAssistantFile"),
            // GetMessage - GET /threads/{thread_id}/messages/{message_id}
            hyper::Method::GET if path.matched(paths::ID_THREADS_THREAD_ID_MESSAGES_MESSAGE_ID) => Some("GetMessage"),
            // GetRun - GET /threads/{thread_id}/runs/{run_id}
            hyper::Method::GET if path.matched(paths::ID_THREADS_THREAD_ID_RUNS_RUN_ID) => Some("GetRun"),
            // ListMessageFiles - GET /threads/{thread_id}/messages/{message_id}/files
            hyper::Method::GET if path.matched(paths::ID_THREADS_THREAD_ID_MESSAGES_MESSAGE_ID_FILES) => Some("ListMessageFiles"),
            // ListRunSteps - GET /threads/{thread_id}/runs/{run_id}/steps
            hyper::Method::GET if path.matched(paths::ID_THREADS_THREAD_ID_RUNS_RUN_ID_STEPS) => Some("ListRunSteps"),
            // ModifyMessage - POST /threads/{thread_id}/messages/{message_id}
            hyper::Method::POST if path.matched(paths::ID_THREADS_THREAD_ID_MESSAGES_MESSAGE_ID) => Some("ModifyMessage"),
            // ModifyRun - POST /threads/{thread_id}/runs/{run_id}
            hyper::Method::POST if path.matched(paths::ID_THREADS_THREAD_ID_RUNS_RUN_ID) => Some("ModifyRun"),
            // SubmitToolOuputsToRun - POST /threads/{thread_id}/runs/{run_id}/submit_tool_outputs
            hyper::Method::POST if path.matched(paths::ID_THREADS_THREAD_ID_RUNS_RUN_ID_SUBMIT_TOOL_OUTPUTS) => Some("SubmitToolOuputsToRun"),
            // GetMessageFile - GET /threads/{thread_id}/messages/{message_id}/files/{file_id}
            hyper::Method::GET if path.matched(paths::ID_THREADS_THREAD_ID_MESSAGES_MESSAGE_ID_FILES_FILE_ID) => Some("GetMessageFile"),
            // GetRunStep - GET /threads/{thread_id}/runs/{run_id}/steps/{step_id}
            hyper::Method::GET if path.matched(paths::ID_THREADS_THREAD_ID_RUNS_RUN_ID_STEPS_STEP_ID) => Some("GetRunStep"),
            // CreateSpeech - POST /audio/speech
            hyper::Method::POST if path.matched(paths::ID_AUDIO_SPEECH) => Some("CreateSpeech"),
            // CreateTranscription - POST /audio/transcriptions
            hyper::Method::POST if path.matched(paths::ID_AUDIO_TRANSCRIPTIONS) => Some("CreateTranscription"),
            // CreateTranslation - POST /audio/translations
            hyper::Method::POST if path.matched(paths::ID_AUDIO_TRANSLATIONS) => Some("CreateTranslation"),
            // CreateChatCompletion - POST /chat/completions
            hyper::Method::POST if path.matched(paths::ID_CHAT_COMPLETIONS) => Some("CreateChatCompletion"),
            // CreateCompletion - POST /completions
            hyper::Method::POST if path.matched(paths::ID_COMPLETIONS) => Some("CreateCompletion"),
            // CreateEmbedding - POST /embeddings
            hyper::Method::POST if path.matched(paths::ID_EMBEDDINGS) => Some("CreateEmbedding"),
            // CreateFile - POST /files
            hyper::Method::POST if path.matched(paths::ID_FILES) => Some("CreateFile"),
            // ListFiles - GET /files
            hyper::Method::GET if path.matched(paths::ID_FILES) => Some("ListFiles"),
            // DeleteFile - DELETE /files/{file_id}
            hyper::Method::DELETE if path.matched(paths::ID_FILES_FILE_ID) => Some("DeleteFile"),
            // DownloadFile - GET /files/{file_id}/content
            hyper::Method::GET if path.matched(paths::ID_FILES_FILE_ID_CONTENT) => Some("DownloadFile"),
            // RetrieveFile - GET /files/{file_id}
            hyper::Method::GET if path.matched(paths::ID_FILES_FILE_ID) => Some("RetrieveFile"),
            // CreateFineTuningJob - POST /fine_tuning/jobs
            hyper::Method::POST if path.matched(paths::ID_FINE_TUNING_JOBS) => Some("CreateFineTuningJob"),
            // ListPaginatedFineTuningJobs - GET /fine_tuning/jobs
            hyper::Method::GET if path.matched(paths::ID_FINE_TUNING_JOBS) => Some("ListPaginatedFineTuningJobs"),
            // CancelFineTuningJob - POST /fine_tuning/jobs/{fine_tuning_job_id}/cancel
            hyper::Method::POST if path.matched(paths::ID_FINE_TUNING_JOBS_FINE_TUNING_JOB_ID_CANCEL) => Some("CancelFineTuningJob"),
            // ListFineTuningEvents - GET /fine_tuning/jobs/{fine_tuning_job_id}/events
            hyper::Method::GET if path.matched(paths::ID_FINE_TUNING_JOBS_FINE_TUNING_JOB_ID_EVENTS) => Some("ListFineTuningEvents"),
            // ListFineTuningJobCheckpoints - GET /fine_tuning/jobs/{fine_tuning_job_id}/checkpoints
            hyper::Method::GET if path.matched(paths::ID_FINE_TUNING_JOBS_FINE_TUNING_JOB_ID_CHECKPOINTS) => Some("ListFineTuningJobCheckpoints"),
            // RetrieveFineTuningJob - GET /fine_tuning/jobs/{fine_tuning_job_id}
            hyper::Method::GET if path.matched(paths::ID_FINE_TUNING_JOBS_FINE_TUNING_JOB_ID) => Some("RetrieveFineTuningJob"),
            // CreateImage - POST /images/generations
            hyper::Method::POST if path.matched(paths::ID_IMAGES_GENERATIONS) => Some("CreateImage"),
            // CreateImageEdit - POST /images/edits
            hyper::Method::POST if path.matched(paths::ID_IMAGES_EDITS) => Some("CreateImageEdit"),
            // CreateImageVariation - POST /images/variations
            hyper::Method::POST if path.matched(paths::ID_IMAGES_VARIATIONS) => Some("CreateImageVariation"),
            // ListModels - GET /models
            hyper::Method::GET if path.matched(paths::ID_MODELS) => Some("ListModels"),
            // DeleteModel - DELETE /models/{model}
            hyper::Method::DELETE if path.matched(paths::ID_MODELS_MODEL) => Some("DeleteModel"),
            // RetrieveModel - GET /models/{model}
            hyper::Method::GET if path.matched(paths::ID_MODELS_MODEL) => Some("RetrieveModel"),
            // CreateModeration - POST /moderations
            hyper::Method::POST if path.matched(paths::ID_MODERATIONS) => Some("CreateModeration"),
            _ => None,
        }
    }
}
