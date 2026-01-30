//! Main library entry point for openapi_client implementation.

#![allow(unused_imports)]

use async_trait::async_trait;
use futures::{future, Stream, StreamExt, TryFutureExt, TryStreamExt};
use hyper::server::conn::http1;
use hyper_util::rt::TokioIo;
use hyper::service::{service_fn, Service};
use log::info;
use std::future::Future;
use std::marker::PhantomData;
use std::net::SocketAddr;
use std::sync::{Arc, Mutex};
use std::task::{Context, Poll};
use swagger::{Has, XSpanIdString};
use swagger::auth::MakeAllowAllAuthenticator;
use swagger::EmptyContext;
use tokio::net::TcpListener;

#[cfg(not(any(target_os = "macos", target_os = "windows", target_os = "ios")))]
use openssl::ssl::{Ssl, SslAcceptor, SslAcceptorBuilder, SslFiletype, SslMethod};

use openapi_client::models;

/// Builds an SSL implementation for Simple HTTPS from some hard-coded file names
pub async fn create(addr: &str, https: bool) {
    let addr: SocketAddr = addr.parse().expect("Failed to parse bind address");
    let listener = TcpListener::bind(&addr).await.unwrap();

    let server = Server::new();

    let service = MakeService::new(server);
    let service = MakeAllowAllAuthenticator::new(service, "cosmo");

    #[allow(unused_mut)]
    let mut service =
        openapi_client::server::context::MakeAddContext::<_, EmptyContext>::new(
            service
        );

    if https {
        #[cfg(any(target_os = "macos", target_os = "windows", target_os = "ios"))]
        {
            unimplemented!("SSL is not implemented for the examples on MacOS, Windows or iOS");
        }

        #[cfg(not(any(target_os = "macos", target_os = "windows", target_os = "ios")))]
        {
            let mut ssl = SslAcceptor::mozilla_intermediate_v5(SslMethod::tls()).expect("Failed to create SSL Acceptor");

            // Server authentication
            ssl.set_private_key_file("examples/server-key.pem", SslFiletype::PEM).expect("Failed to set private key");
            ssl.set_certificate_chain_file("examples/server-chain.pem").expect("Failed to set certificate chain");
            ssl.check_private_key().expect("Failed to check private key");

            let tls_acceptor = ssl.build();

            info!("Starting a server (with https)");
            loop {
                if let Ok((tcp, addr)) = listener.accept().await {
                    let ssl = Ssl::new(tls_acceptor.context()).unwrap();
                    let service = service.call(addr);

                    tokio::spawn(async move {
                        let tls = tokio_openssl::SslStream::new(ssl, tcp).map_err(|_| ())?;
                        let service = service.await.map_err(|_| ())?;

                        http1::Builder::new()
                            .serve_connection(TokioIo::new(tls), service)
                            .await
                            .map_err(|_| ())
                    });
                }
            }
        }
    } else {
        info!("Starting a server (over http, so no TLS)");
        println!("Listening on http://{}", addr);

        loop {
            // When an incoming TCP connection is received grab a TCP stream for
            // client<->server communication.
            //
            // Note, this is a .await point, this loop will loop forever but is not a busy loop. The
            // .await point allows the Tokio runtime to pull the task off of the thread until the task
            // has work to do. In this case, a connection arrives on the port we are listening on and
            // the task is woken up, at which point the task is then put back on a thread, and is
            // driven forward by the runtime, eventually yielding a TCP stream.
            let (tcp_stream, addr) = listener.accept().await.expect("Failed to accept connection");

            let service = service.call(addr).await.unwrap();
            let io = TokioIo::new(tcp_stream);
            // Spin up a new task in Tokio so we can continue to listen for new TCP connection on the
            // current task without waiting for the processing of the HTTP1 connection we just received
            // to finish
            tokio::task::spawn(async move {
                // Handle the connection from the client using HTTP1 and pass any
                // HTTP requests received on that connection to the `hello` function
                let result = http1::Builder::new()
                    .serve_connection(io, service)
                    .await;
                if let Err(err) = result
                {
                    println!("Error serving connection: {err:?}");
                }
            });
        }
    }
}

#[derive(Copy)]
pub struct Server<C> {
    marker: PhantomData<C>,
}

impl<C> Server<C> {
    pub fn new() -> Self {
        Server{marker: PhantomData}
    }
}

impl<C> Clone for Server<C> {
    fn clone(&self) -> Self {
        Self {
            marker: PhantomData,
        }
    }
}


use jsonwebtoken::{decode, encode, errors::Error as JwtError, Algorithm, DecodingKey, EncodingKey, Header, TokenData, Validation};
use serde::{Deserialize, Serialize};
use swagger::auth::Authorization;
use crate::server_auth;


use openapi_client::{
    Api,
    CreateAssistantResponse,
    CreateThreadResponse,
    CreateThreadAndRunResponse,
    ListAssistantsResponse,
    CreateMessageResponse,
    CreateRunResponse,
    DeleteAssistantResponse,
    DeleteThreadResponse,
    GetAssistantResponse,
    GetThreadResponse,
    ListMessagesResponse,
    ListRunsResponse,
    ModifyAssistantResponse,
    ModifyThreadResponse,
    CancelRunResponse,
    DeleteMessageResponse,
    GetMessageResponse,
    GetRunResponse,
    ListRunStepsResponse,
    ModifyMessageResponse,
    ModifyRunResponse,
    SubmitToolOuputsToRunResponse,
    GetRunStepResponse,
    CreateSpeechResponse,
    CreateTranscriptionResponse,
    CreateTranslationResponse,
    ListAuditLogsResponse,
    CreateBatchResponse,
    ListBatchesResponse,
    CancelBatchResponse,
    RetrieveBatchResponse,
    CreateChatCompletionResponse,
    CreateCompletionResponse,
    AdminApiKeysCreateResponse,
    AdminApiKeysListResponse,
    AdminApiKeysDeleteResponse,
    AdminApiKeysGetResponse,
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
    InviteUserResponse,
    ListInvitesResponse,
    DeleteInviteResponse,
    RetrieveInviteResponse,
    ListModelsResponse,
    DeleteModelResponse,
    RetrieveModelResponse,
    CreateModerationResponse,
    CreateProjectResponse,
    ListProjectsResponse,
    ArchiveProjectResponse,
    CreateProjectServiceAccountResponse,
    CreateProjectUserResponse,
    ListProjectApiKeysResponse,
    ListProjectRateLimitsResponse,
    ListProjectServiceAccountsResponse,
    ListProjectUsersResponse,
    ModifyProjectResponse,
    RetrieveProjectResponse,
    DeleteProjectApiKeyResponse,
    DeleteProjectServiceAccountResponse,
    DeleteProjectUserResponse,
    ModifyProjectUserResponse,
    RetrieveProjectApiKeyResponse,
    RetrieveProjectServiceAccountResponse,
    RetrieveProjectUserResponse,
    UpdateProjectRateLimitsResponse,
    CreateRealtimeSessionResponse,
    CreateUploadResponse,
    AddUploadPartResponse,
    CancelUploadResponse,
    CompleteUploadResponse,
    UsageAudioSpeechesResponse,
    UsageAudioTranscriptionsResponse,
    UsageCodeInterpreterSessionsResponse,
    UsageCompletionsResponse,
    UsageCostsResponse,
    UsageEmbeddingsResponse,
    UsageImagesResponse,
    UsageModerationsResponse,
    UsageVectorStoresResponse,
    ListUsersResponse,
    DeleteUserResponse,
    ModifyUserResponse,
    RetrieveUserResponse,
    CreateVectorStoreResponse,
    ListVectorStoresResponse,
    CreateVectorStoreFileResponse,
    CreateVectorStoreFileBatchResponse,
    DeleteVectorStoreResponse,
    GetVectorStoreResponse,
    ListVectorStoreFilesResponse,
    ModifyVectorStoreResponse,
    CancelVectorStoreFileBatchResponse,
    DeleteVectorStoreFileResponse,
    GetVectorStoreFileResponse,
    GetVectorStoreFileBatchResponse,
    ListFilesInVectorStoreBatchResponse,
};
use openapi_client::server::MakeService;
use std::error::Error;
use swagger::ApiError;

#[async_trait]
impl<C> Api<C> for Server<C> where C: Has<XSpanIdString> + Send + Sync
{
    /// Create an assistant with a model and instructions.
    async fn create_assistant(
        &self,
        create_assistant_request: models::CreateAssistantRequest,
        context: &C) -> Result<CreateAssistantResponse, ApiError>
    {
        info!("create_assistant({:?}) - X-Span-ID: {:?}", create_assistant_request, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Create a thread.
    async fn create_thread(
        &self,
        create_thread_request: Option<models::CreateThreadRequest>,
        context: &C) -> Result<CreateThreadResponse, ApiError>
    {
        info!("create_thread({:?}) - X-Span-ID: {:?}", create_thread_request, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Create a thread and run it in one request.
    async fn create_thread_and_run(
        &self,
        create_thread_and_run_request: models::CreateThreadAndRunRequest,
        context: &C) -> Result<CreateThreadAndRunResponse, ApiError>
    {
        info!("create_thread_and_run({:?}) - X-Span-ID: {:?}", create_thread_and_run_request, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Returns a list of assistants.
    async fn list_assistants(
        &self,
        limit: Option<i32>,
        order: Option<models::ListAssistantsOrderParameter>,
        after: Option<String>,
        before: Option<String>,
        context: &C) -> Result<ListAssistantsResponse, ApiError>
    {
        info!("list_assistants({:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", limit, order, after, before, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Create a message.
    async fn create_message(
        &self,
        thread_id: String,
        create_message_request: models::CreateMessageRequest,
        context: &C) -> Result<CreateMessageResponse, ApiError>
    {
        info!("create_message(\"{}\", {:?}) - X-Span-ID: {:?}", thread_id, create_message_request, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Create a run.
    async fn create_run<'a>(
        &self,
        thread_id: String,
        create_run_request: models::CreateRunRequest,
        include_left_square_bracket_right_square_bracket: Option<&'a Vec<models::CreateRunIncludeParameterInner>>,
        context: &C) -> Result<CreateRunResponse, ApiError>
    {
        info!("create_run(\"{}\", {:?}, {:?}) - X-Span-ID: {:?}", thread_id, create_run_request, include_left_square_bracket_right_square_bracket, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Delete an assistant.
    async fn delete_assistant(
        &self,
        assistant_id: String,
        context: &C) -> Result<DeleteAssistantResponse, ApiError>
    {
        info!("delete_assistant(\"{}\") - X-Span-ID: {:?}", assistant_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Delete a thread.
    async fn delete_thread(
        &self,
        thread_id: String,
        context: &C) -> Result<DeleteThreadResponse, ApiError>
    {
        info!("delete_thread(\"{}\") - X-Span-ID: {:?}", thread_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Retrieves an assistant.
    async fn get_assistant(
        &self,
        assistant_id: String,
        context: &C) -> Result<GetAssistantResponse, ApiError>
    {
        info!("get_assistant(\"{}\") - X-Span-ID: {:?}", assistant_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Retrieves a thread.
    async fn get_thread(
        &self,
        thread_id: String,
        context: &C) -> Result<GetThreadResponse, ApiError>
    {
        info!("get_thread(\"{}\") - X-Span-ID: {:?}", thread_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Returns a list of messages for a given thread.
    async fn list_messages(
        &self,
        thread_id: String,
        limit: Option<i32>,
        order: Option<models::ListAssistantsOrderParameter>,
        after: Option<String>,
        before: Option<String>,
        run_id: Option<String>,
        context: &C) -> Result<ListMessagesResponse, ApiError>
    {
        info!("list_messages(\"{}\", {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", thread_id, limit, order, after, before, run_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Returns a list of runs belonging to a thread.
    async fn list_runs(
        &self,
        thread_id: String,
        limit: Option<i32>,
        order: Option<models::ListAssistantsOrderParameter>,
        after: Option<String>,
        before: Option<String>,
        context: &C) -> Result<ListRunsResponse, ApiError>
    {
        info!("list_runs(\"{}\", {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", thread_id, limit, order, after, before, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Modifies an assistant.
    async fn modify_assistant(
        &self,
        assistant_id: String,
        modify_assistant_request: models::ModifyAssistantRequest,
        context: &C) -> Result<ModifyAssistantResponse, ApiError>
    {
        info!("modify_assistant(\"{}\", {:?}) - X-Span-ID: {:?}", assistant_id, modify_assistant_request, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Modifies a thread.
    async fn modify_thread(
        &self,
        thread_id: String,
        modify_thread_request: models::ModifyThreadRequest,
        context: &C) -> Result<ModifyThreadResponse, ApiError>
    {
        info!("modify_thread(\"{}\", {:?}) - X-Span-ID: {:?}", thread_id, modify_thread_request, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Cancels a run that is `in_progress`.
    async fn cancel_run(
        &self,
        thread_id: String,
        run_id: String,
        context: &C) -> Result<CancelRunResponse, ApiError>
    {
        info!("cancel_run(\"{}\", \"{}\") - X-Span-ID: {:?}", thread_id, run_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Deletes a message.
    async fn delete_message(
        &self,
        thread_id: String,
        message_id: String,
        context: &C) -> Result<DeleteMessageResponse, ApiError>
    {
        info!("delete_message(\"{}\", \"{}\") - X-Span-ID: {:?}", thread_id, message_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Retrieve a message.
    async fn get_message(
        &self,
        thread_id: String,
        message_id: String,
        context: &C) -> Result<GetMessageResponse, ApiError>
    {
        info!("get_message(\"{}\", \"{}\") - X-Span-ID: {:?}", thread_id, message_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Retrieves a run.
    async fn get_run(
        &self,
        thread_id: String,
        run_id: String,
        context: &C) -> Result<GetRunResponse, ApiError>
    {
        info!("get_run(\"{}\", \"{}\") - X-Span-ID: {:?}", thread_id, run_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Returns a list of run steps belonging to a run.
    async fn list_run_steps<'a>(
        &self,
        thread_id: String,
        run_id: String,
        limit: Option<i32>,
        order: Option<models::ListAssistantsOrderParameter>,
        after: Option<String>,
        before: Option<String>,
        include_left_square_bracket_right_square_bracket: Option<&'a Vec<models::CreateRunIncludeParameterInner>>,
        context: &C) -> Result<ListRunStepsResponse, ApiError>
    {
        info!("list_run_steps(\"{}\", \"{}\", {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", thread_id, run_id, limit, order, after, before, include_left_square_bracket_right_square_bracket, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Modifies a message.
    async fn modify_message(
        &self,
        thread_id: String,
        message_id: String,
        modify_message_request: models::ModifyMessageRequest,
        context: &C) -> Result<ModifyMessageResponse, ApiError>
    {
        info!("modify_message(\"{}\", \"{}\", {:?}) - X-Span-ID: {:?}", thread_id, message_id, modify_message_request, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Modifies a run.
    async fn modify_run(
        &self,
        thread_id: String,
        run_id: String,
        modify_run_request: models::ModifyRunRequest,
        context: &C) -> Result<ModifyRunResponse, ApiError>
    {
        info!("modify_run(\"{}\", \"{}\", {:?}) - X-Span-ID: {:?}", thread_id, run_id, modify_run_request, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// When a run has the `status: \"requires_action\"` and `required_action.type` is `submit_tool_outputs`, this endpoint can be used to submit the outputs from the tool calls once they're all completed. All outputs must be submitted in a single request. 
    async fn submit_tool_ouputs_to_run(
        &self,
        thread_id: String,
        run_id: String,
        submit_tool_outputs_run_request: models::SubmitToolOutputsRunRequest,
        context: &C) -> Result<SubmitToolOuputsToRunResponse, ApiError>
    {
        info!("submit_tool_ouputs_to_run(\"{}\", \"{}\", {:?}) - X-Span-ID: {:?}", thread_id, run_id, submit_tool_outputs_run_request, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Retrieves a run step.
    async fn get_run_step<'a>(
        &self,
        thread_id: String,
        run_id: String,
        step_id: String,
        include_left_square_bracket_right_square_bracket: Option<&'a Vec<models::CreateRunIncludeParameterInner>>,
        context: &C) -> Result<GetRunStepResponse, ApiError>
    {
        info!("get_run_step(\"{}\", \"{}\", \"{}\", {:?}) - X-Span-ID: {:?}", thread_id, run_id, step_id, include_left_square_bracket_right_square_bracket, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Generates audio from the input text.
    async fn create_speech(
        &self,
        create_speech_request: models::CreateSpeechRequest,
        context: &C) -> Result<CreateSpeechResponse, ApiError>
    {
        info!("create_speech({:?}) - X-Span-ID: {:?}", create_speech_request, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Transcribes audio into the input language.
    async fn create_transcription<'a>(
        &self,
        file: swagger::ByteArray,
        model: models::CreateTranscriptionRequestModel,
        language: Option<String>,
        prompt: Option<String>,
        response_format: Option<models::AudioResponseFormat>,
        temperature: Option<f64>,
        timestamp_granularities_left_square_bracket_right_square_bracket: Option<&'a Vec<models::CreateTranscriptionRequestTimestampGranularitiesInner>>,
        context: &C) -> Result<CreateTranscriptionResponse, ApiError>
    {
        info!("create_transcription({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", file, model, language, prompt, response_format, temperature, timestamp_granularities_left_square_bracket_right_square_bracket, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Translates audio into English.
    async fn create_translation(
        &self,
        file: swagger::ByteArray,
        model: models::CreateTranscriptionRequestModel,
        prompt: Option<String>,
        response_format: Option<models::AudioResponseFormat>,
        temperature: Option<f64>,
        context: &C) -> Result<CreateTranslationResponse, ApiError>
    {
        info!("create_translation({:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", file, model, prompt, response_format, temperature, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// List user actions and configuration changes within this organization.
    async fn list_audit_logs<'a>(
        &self,
        effective_at: Option<models::ListAuditLogsEffectiveAtParameter>,
        project_ids_left_square_bracket_right_square_bracket: Option<&'a Vec<String>>,
        event_types_left_square_bracket_right_square_bracket: Option<&'a Vec<models::AuditLogEventType>>,
        actor_ids_left_square_bracket_right_square_bracket: Option<&'a Vec<String>>,
        actor_emails_left_square_bracket_right_square_bracket: Option<&'a Vec<String>>,
        resource_ids_left_square_bracket_right_square_bracket: Option<&'a Vec<String>>,
        limit: Option<i32>,
        after: Option<String>,
        before: Option<String>,
        context: &C) -> Result<ListAuditLogsResponse, ApiError>
    {
        info!("list_audit_logs({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", effective_at, project_ids_left_square_bracket_right_square_bracket, event_types_left_square_bracket_right_square_bracket, actor_ids_left_square_bracket_right_square_bracket, actor_emails_left_square_bracket_right_square_bracket, resource_ids_left_square_bracket_right_square_bracket, limit, after, before, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Creates and executes a batch from an uploaded file of requests
    async fn create_batch(
        &self,
        create_batch_request: models::CreateBatchRequest,
        context: &C) -> Result<CreateBatchResponse, ApiError>
    {
        info!("create_batch({:?}) - X-Span-ID: {:?}", create_batch_request, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// List your organization's batches.
    async fn list_batches(
        &self,
        after: Option<String>,
        limit: Option<i32>,
        context: &C) -> Result<ListBatchesResponse, ApiError>
    {
        info!("list_batches({:?}, {:?}) - X-Span-ID: {:?}", after, limit, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Cancels an in-progress batch. The batch will be in status `cancelling` for up to 10 minutes, before changing to `cancelled`, where it will have partial results (if any) available in the output file.
    async fn cancel_batch(
        &self,
        batch_id: String,
        context: &C) -> Result<CancelBatchResponse, ApiError>
    {
        info!("cancel_batch(\"{}\") - X-Span-ID: {:?}", batch_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Retrieves a batch.
    async fn retrieve_batch(
        &self,
        batch_id: String,
        context: &C) -> Result<RetrieveBatchResponse, ApiError>
    {
        info!("retrieve_batch(\"{}\") - X-Span-ID: {:?}", batch_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Creates a model response for the given chat conversation. Learn more in the [text generation](/docs/guides/text-generation), [vision](/docs/guides/vision), and [audio](/docs/guides/audio) guides.  Parameter support can differ depending on the model used to generate the response, particularly for newer reasoning models. Parameters that are only supported for reasoning models are noted below. For the current state of  unsupported parameters in reasoning models,  [refer to the reasoning guide](/docs/guides/reasoning). 
    async fn create_chat_completion(
        &self,
        create_chat_completion_request: models::CreateChatCompletionRequest,
        context: &C) -> Result<CreateChatCompletionResponse, ApiError>
    {
        info!("create_chat_completion({:?}) - X-Span-ID: {:?}", create_chat_completion_request, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Creates a completion for the provided prompt and parameters.
    async fn create_completion(
        &self,
        create_completion_request: models::CreateCompletionRequest,
        context: &C) -> Result<CreateCompletionResponse, ApiError>
    {
        info!("create_completion({:?}) - X-Span-ID: {:?}", create_completion_request, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Create an organization admin API key
    async fn admin_api_keys_create(
        &self,
        admin_api_keys_create_request: models::AdminApiKeysCreateRequest,
        context: &C) -> Result<AdminApiKeysCreateResponse, ApiError>
    {
        info!("admin_api_keys_create({:?}) - X-Span-ID: {:?}", admin_api_keys_create_request, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// List organization API keys
    async fn admin_api_keys_list(
        &self,
        after: Option<swagger::Nullable<String>>,
        order: Option<models::AdminApiKeysListOrderParameter>,
        limit: Option<i32>,
        context: &C) -> Result<AdminApiKeysListResponse, ApiError>
    {
        info!("admin_api_keys_list({:?}, {:?}, {:?}) - X-Span-ID: {:?}", after, order, limit, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Delete an organization admin API key
    async fn admin_api_keys_delete(
        &self,
        key_id: String,
        context: &C) -> Result<AdminApiKeysDeleteResponse, ApiError>
    {
        info!("admin_api_keys_delete(\"{}\") - X-Span-ID: {:?}", key_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Retrieve a single organization API key
    async fn admin_api_keys_get(
        &self,
        key_id: String,
        context: &C) -> Result<AdminApiKeysGetResponse, ApiError>
    {
        info!("admin_api_keys_get(\"{}\") - X-Span-ID: {:?}", key_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Creates an embedding vector representing the input text.
    async fn create_embedding(
        &self,
        create_embedding_request: models::CreateEmbeddingRequest,
        context: &C) -> Result<CreateEmbeddingResponse, ApiError>
    {
        info!("create_embedding({:?}) - X-Span-ID: {:?}", create_embedding_request, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Upload a file that can be used across various endpoints. Individual files can be up to 512 MB, and the size of all files uploaded by one organization can be up to 100 GB.  The Assistants API supports files up to 2 million tokens and of specific file types. See the [Assistants Tools guide](/docs/assistants/tools) for details.  The Fine-tuning API only supports `.jsonl` files. The input also has certain required formats for fine-tuning [chat](/docs/api-reference/fine-tuning/chat-input) or [completions](/docs/api-reference/fine-tuning/completions-input) models.  The Batch API only supports `.jsonl` files up to 200 MB in size. The input also has a specific required [format](/docs/api-reference/batch/request-input).  Please [contact us](https://help.openai.com/) if you need to increase these storage limits. 
    async fn create_file(
        &self,
        file: swagger::ByteArray,
        purpose: models::CreateFileRequestPurpose,
        context: &C) -> Result<CreateFileResponse, ApiError>
    {
        info!("create_file({:?}, {:?}) - X-Span-ID: {:?}", file, purpose, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Returns a list of files.
    async fn list_files(
        &self,
        purpose: Option<String>,
        limit: Option<i32>,
        order: Option<models::ListAssistantsOrderParameter>,
        after: Option<String>,
        context: &C) -> Result<ListFilesResponse, ApiError>
    {
        info!("list_files({:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", purpose, limit, order, after, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Delete a file.
    async fn delete_file(
        &self,
        file_id: String,
        context: &C) -> Result<DeleteFileResponse, ApiError>
    {
        info!("delete_file(\"{}\") - X-Span-ID: {:?}", file_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Returns the contents of the specified file.
    async fn download_file(
        &self,
        file_id: String,
        context: &C) -> Result<DownloadFileResponse, ApiError>
    {
        info!("download_file(\"{}\") - X-Span-ID: {:?}", file_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Returns information about a specific file.
    async fn retrieve_file(
        &self,
        file_id: String,
        context: &C) -> Result<RetrieveFileResponse, ApiError>
    {
        info!("retrieve_file(\"{}\") - X-Span-ID: {:?}", file_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Creates a fine-tuning job which begins the process of creating a new model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 
    async fn create_fine_tuning_job(
        &self,
        create_fine_tuning_job_request: models::CreateFineTuningJobRequest,
        context: &C) -> Result<CreateFineTuningJobResponse, ApiError>
    {
        info!("create_fine_tuning_job({:?}) - X-Span-ID: {:?}", create_fine_tuning_job_request, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// List your organization's fine-tuning jobs 
    async fn list_paginated_fine_tuning_jobs(
        &self,
        after: Option<String>,
        limit: Option<i32>,
        context: &C) -> Result<ListPaginatedFineTuningJobsResponse, ApiError>
    {
        info!("list_paginated_fine_tuning_jobs({:?}, {:?}) - X-Span-ID: {:?}", after, limit, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Immediately cancel a fine-tune job. 
    async fn cancel_fine_tuning_job(
        &self,
        fine_tuning_job_id: String,
        context: &C) -> Result<CancelFineTuningJobResponse, ApiError>
    {
        info!("cancel_fine_tuning_job(\"{}\") - X-Span-ID: {:?}", fine_tuning_job_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get status updates for a fine-tuning job. 
    async fn list_fine_tuning_events(
        &self,
        fine_tuning_job_id: String,
        after: Option<String>,
        limit: Option<i32>,
        context: &C) -> Result<ListFineTuningEventsResponse, ApiError>
    {
        info!("list_fine_tuning_events(\"{}\", {:?}, {:?}) - X-Span-ID: {:?}", fine_tuning_job_id, after, limit, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// List checkpoints for a fine-tuning job. 
    async fn list_fine_tuning_job_checkpoints(
        &self,
        fine_tuning_job_id: String,
        after: Option<String>,
        limit: Option<i32>,
        context: &C) -> Result<ListFineTuningJobCheckpointsResponse, ApiError>
    {
        info!("list_fine_tuning_job_checkpoints(\"{}\", {:?}, {:?}) - X-Span-ID: {:?}", fine_tuning_job_id, after, limit, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get info about a fine-tuning job.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 
    async fn retrieve_fine_tuning_job(
        &self,
        fine_tuning_job_id: String,
        context: &C) -> Result<RetrieveFineTuningJobResponse, ApiError>
    {
        info!("retrieve_fine_tuning_job(\"{}\") - X-Span-ID: {:?}", fine_tuning_job_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Creates an image given a prompt.
    async fn create_image(
        &self,
        create_image_request: models::CreateImageRequest,
        context: &C) -> Result<CreateImageResponse, ApiError>
    {
        info!("create_image({:?}) - X-Span-ID: {:?}", create_image_request, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Creates an edited or extended image given an original image and a prompt.
    async fn create_image_edit(
        &self,
        image: swagger::ByteArray,
        prompt: String,
        mask: Option<swagger::ByteArray>,
        model: Option<swagger::Nullable<models::CreateImageEditRequestModel>>,
        n: Option<swagger::Nullable<i32>>,
        size: Option<swagger::Nullable<models::CreateImageEditRequestSize>>,
        response_format: Option<swagger::Nullable<models::CreateImageEditRequestResponseFormat>>,
        user: Option<String>,
        context: &C) -> Result<CreateImageEditResponse, ApiError>
    {
        info!("create_image_edit({:?}, \"{}\", {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", image, prompt, mask, model, n, size, response_format, user, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Creates a variation of a given image.
    async fn create_image_variation(
        &self,
        image: swagger::ByteArray,
        model: Option<swagger::Nullable<models::CreateImageEditRequestModel>>,
        n: Option<swagger::Nullable<i32>>,
        response_format: Option<swagger::Nullable<models::CreateImageEditRequestResponseFormat>>,
        size: Option<swagger::Nullable<models::CreateImageEditRequestSize>>,
        user: Option<String>,
        context: &C) -> Result<CreateImageVariationResponse, ApiError>
    {
        info!("create_image_variation({:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", image, model, n, response_format, size, user, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Create an invite for a user to the organization. The invite must be accepted by the user before they have access to the organization.
    async fn invite_user(
        &self,
        invite_request: models::InviteRequest,
        context: &C) -> Result<InviteUserResponse, ApiError>
    {
        info!("invite_user({:?}) - X-Span-ID: {:?}", invite_request, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Returns a list of invites in the organization.
    async fn list_invites(
        &self,
        limit: Option<i32>,
        after: Option<String>,
        context: &C) -> Result<ListInvitesResponse, ApiError>
    {
        info!("list_invites({:?}, {:?}) - X-Span-ID: {:?}", limit, after, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Delete an invite. If the invite has already been accepted, it cannot be deleted.
    async fn delete_invite(
        &self,
        invite_id: String,
        context: &C) -> Result<DeleteInviteResponse, ApiError>
    {
        info!("delete_invite(\"{}\") - X-Span-ID: {:?}", invite_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Retrieves an invite.
    async fn retrieve_invite(
        &self,
        invite_id: String,
        context: &C) -> Result<RetrieveInviteResponse, ApiError>
    {
        info!("retrieve_invite(\"{}\") - X-Span-ID: {:?}", invite_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Lists the currently available models, and provides basic information about each one such as the owner and availability.
    async fn list_models(
        &self,
        context: &C) -> Result<ListModelsResponse, ApiError>
    {
        info!("list_models() - X-Span-ID: {:?}", context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Delete a fine-tuned model. You must have the Owner role in your organization to delete a model.
    async fn delete_model(
        &self,
        model: String,
        context: &C) -> Result<DeleteModelResponse, ApiError>
    {
        info!("delete_model(\"{}\") - X-Span-ID: {:?}", model, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Retrieves a model instance, providing basic information about the model such as the owner and permissioning.
    async fn retrieve_model(
        &self,
        model: String,
        context: &C) -> Result<RetrieveModelResponse, ApiError>
    {
        info!("retrieve_model(\"{}\") - X-Span-ID: {:?}", model, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Classifies if text and/or image inputs are potentially harmful. Learn more in the [moderation guide](/docs/guides/moderation). 
    async fn create_moderation(
        &self,
        create_moderation_request: models::CreateModerationRequest,
        context: &C) -> Result<CreateModerationResponse, ApiError>
    {
        info!("create_moderation({:?}) - X-Span-ID: {:?}", create_moderation_request, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Create a new project in the organization. Projects can be created and archived, but cannot be deleted.
    async fn create_project(
        &self,
        project_create_request: models::ProjectCreateRequest,
        context: &C) -> Result<CreateProjectResponse, ApiError>
    {
        info!("create_project({:?}) - X-Span-ID: {:?}", project_create_request, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Returns a list of projects.
    async fn list_projects(
        &self,
        limit: Option<i32>,
        after: Option<String>,
        include_archived: Option<bool>,
        context: &C) -> Result<ListProjectsResponse, ApiError>
    {
        info!("list_projects({:?}, {:?}, {:?}) - X-Span-ID: {:?}", limit, after, include_archived, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Archives a project in the organization. Archived projects cannot be used or updated.
    async fn archive_project(
        &self,
        project_id: String,
        context: &C) -> Result<ArchiveProjectResponse, ApiError>
    {
        info!("archive_project(\"{}\") - X-Span-ID: {:?}", project_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Creates a new service account in the project. This also returns an unredacted API key for the service account.
    async fn create_project_service_account(
        &self,
        project_id: String,
        project_service_account_create_request: models::ProjectServiceAccountCreateRequest,
        context: &C) -> Result<CreateProjectServiceAccountResponse, ApiError>
    {
        info!("create_project_service_account(\"{}\", {:?}) - X-Span-ID: {:?}", project_id, project_service_account_create_request, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Adds a user to the project. Users must already be members of the organization to be added to a project.
    async fn create_project_user(
        &self,
        project_id: String,
        project_user_create_request: models::ProjectUserCreateRequest,
        context: &C) -> Result<CreateProjectUserResponse, ApiError>
    {
        info!("create_project_user(\"{}\", {:?}) - X-Span-ID: {:?}", project_id, project_user_create_request, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Returns a list of API keys in the project.
    async fn list_project_api_keys(
        &self,
        project_id: String,
        limit: Option<i32>,
        after: Option<String>,
        context: &C) -> Result<ListProjectApiKeysResponse, ApiError>
    {
        info!("list_project_api_keys(\"{}\", {:?}, {:?}) - X-Span-ID: {:?}", project_id, limit, after, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Returns the rate limits per model for a project.
    async fn list_project_rate_limits(
        &self,
        project_id: String,
        limit: Option<i32>,
        after: Option<String>,
        before: Option<String>,
        context: &C) -> Result<ListProjectRateLimitsResponse, ApiError>
    {
        info!("list_project_rate_limits(\"{}\", {:?}, {:?}, {:?}) - X-Span-ID: {:?}", project_id, limit, after, before, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Returns a list of service accounts in the project.
    async fn list_project_service_accounts(
        &self,
        project_id: String,
        limit: Option<i32>,
        after: Option<String>,
        context: &C) -> Result<ListProjectServiceAccountsResponse, ApiError>
    {
        info!("list_project_service_accounts(\"{}\", {:?}, {:?}) - X-Span-ID: {:?}", project_id, limit, after, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Returns a list of users in the project.
    async fn list_project_users(
        &self,
        project_id: String,
        limit: Option<i32>,
        after: Option<String>,
        context: &C) -> Result<ListProjectUsersResponse, ApiError>
    {
        info!("list_project_users(\"{}\", {:?}, {:?}) - X-Span-ID: {:?}", project_id, limit, after, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Modifies a project in the organization.
    async fn modify_project(
        &self,
        project_id: String,
        project_update_request: models::ProjectUpdateRequest,
        context: &C) -> Result<ModifyProjectResponse, ApiError>
    {
        info!("modify_project(\"{}\", {:?}) - X-Span-ID: {:?}", project_id, project_update_request, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Retrieves a project.
    async fn retrieve_project(
        &self,
        project_id: String,
        context: &C) -> Result<RetrieveProjectResponse, ApiError>
    {
        info!("retrieve_project(\"{}\") - X-Span-ID: {:?}", project_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Deletes an API key from the project.
    async fn delete_project_api_key(
        &self,
        project_id: String,
        key_id: String,
        context: &C) -> Result<DeleteProjectApiKeyResponse, ApiError>
    {
        info!("delete_project_api_key(\"{}\", \"{}\") - X-Span-ID: {:?}", project_id, key_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Deletes a service account from the project.
    async fn delete_project_service_account(
        &self,
        project_id: String,
        service_account_id: String,
        context: &C) -> Result<DeleteProjectServiceAccountResponse, ApiError>
    {
        info!("delete_project_service_account(\"{}\", \"{}\") - X-Span-ID: {:?}", project_id, service_account_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Deletes a user from the project.
    async fn delete_project_user(
        &self,
        project_id: String,
        user_id: String,
        context: &C) -> Result<DeleteProjectUserResponse, ApiError>
    {
        info!("delete_project_user(\"{}\", \"{}\") - X-Span-ID: {:?}", project_id, user_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Modifies a user's role in the project.
    async fn modify_project_user(
        &self,
        project_id: String,
        user_id: String,
        project_user_update_request: models::ProjectUserUpdateRequest,
        context: &C) -> Result<ModifyProjectUserResponse, ApiError>
    {
        info!("modify_project_user(\"{}\", \"{}\", {:?}) - X-Span-ID: {:?}", project_id, user_id, project_user_update_request, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Retrieves an API key in the project.
    async fn retrieve_project_api_key(
        &self,
        project_id: String,
        key_id: String,
        context: &C) -> Result<RetrieveProjectApiKeyResponse, ApiError>
    {
        info!("retrieve_project_api_key(\"{}\", \"{}\") - X-Span-ID: {:?}", project_id, key_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Retrieves a service account in the project.
    async fn retrieve_project_service_account(
        &self,
        project_id: String,
        service_account_id: String,
        context: &C) -> Result<RetrieveProjectServiceAccountResponse, ApiError>
    {
        info!("retrieve_project_service_account(\"{}\", \"{}\") - X-Span-ID: {:?}", project_id, service_account_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Retrieves a user in the project.
    async fn retrieve_project_user(
        &self,
        project_id: String,
        user_id: String,
        context: &C) -> Result<RetrieveProjectUserResponse, ApiError>
    {
        info!("retrieve_project_user(\"{}\", \"{}\") - X-Span-ID: {:?}", project_id, user_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Updates a project rate limit.
    async fn update_project_rate_limits(
        &self,
        project_id: String,
        rate_limit_id: String,
        project_rate_limit_update_request: models::ProjectRateLimitUpdateRequest,
        context: &C) -> Result<UpdateProjectRateLimitsResponse, ApiError>
    {
        info!("update_project_rate_limits(\"{}\", \"{}\", {:?}) - X-Span-ID: {:?}", project_id, rate_limit_id, project_rate_limit_update_request, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Create an ephemeral API token for use in client-side applications with the Realtime API. Can be configured with the same session parameters as the `session.update` client event.  It responds with a session object, plus a `client_secret` key which contains a usable ephemeral API token that can be used to authenticate browser clients for the Realtime API. 
    async fn create_realtime_session(
        &self,
        realtime_session_create_request: models::RealtimeSessionCreateRequest,
        context: &C) -> Result<CreateRealtimeSessionResponse, ApiError>
    {
        info!("create_realtime_session({:?}) - X-Span-ID: {:?}", realtime_session_create_request, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Creates an intermediate [Upload](/docs/api-reference/uploads/object) object that you can add [Parts](/docs/api-reference/uploads/part-object) to. Currently, an Upload can accept at most 8 GB in total and expires after an hour after you create it.  Once you complete the Upload, we will create a [File](/docs/api-reference/files/object) object that contains all the parts you uploaded. This File is usable in the rest of our platform as a regular File object.  For certain `purpose`s, the correct `mime_type` must be specified. Please refer to documentation for the supported MIME types for your use case: - [Assistants](/docs/assistants/tools/file-search#supported-files)  For guidance on the proper filename extensions for each purpose, please follow the documentation on [creating a File](/docs/api-reference/files/create). 
    async fn create_upload(
        &self,
        create_upload_request: models::CreateUploadRequest,
        context: &C) -> Result<CreateUploadResponse, ApiError>
    {
        info!("create_upload({:?}) - X-Span-ID: {:?}", create_upload_request, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Adds a [Part](/docs/api-reference/uploads/part-object) to an [Upload](/docs/api-reference/uploads/object) object. A Part represents a chunk of bytes from the file you are trying to upload.   Each Part can be at most 64 MB, and you can add Parts until you hit the Upload maximum of 8 GB.  It is possible to add multiple Parts in parallel. You can decide the intended order of the Parts when you [complete the Upload](/docs/api-reference/uploads/complete). 
    async fn add_upload_part(
        &self,
        upload_id: String,
        data: swagger::ByteArray,
        context: &C) -> Result<AddUploadPartResponse, ApiError>
    {
        info!("add_upload_part(\"{}\", {:?}) - X-Span-ID: {:?}", upload_id, data, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Cancels the Upload. No Parts may be added after an Upload is cancelled. 
    async fn cancel_upload(
        &self,
        upload_id: String,
        context: &C) -> Result<CancelUploadResponse, ApiError>
    {
        info!("cancel_upload(\"{}\") - X-Span-ID: {:?}", upload_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Completes the [Upload](/docs/api-reference/uploads/object).   Within the returned Upload object, there is a nested [File](/docs/api-reference/files/object) object that is ready to use in the rest of the platform.  You can specify the order of the Parts by passing in an ordered list of the Part IDs.  The number of bytes uploaded upon completion must match the number of bytes initially specified when creating the Upload object. No Parts may be added after an Upload is completed. 
    async fn complete_upload(
        &self,
        upload_id: String,
        complete_upload_request: models::CompleteUploadRequest,
        context: &C) -> Result<CompleteUploadResponse, ApiError>
    {
        info!("complete_upload(\"{}\", {:?}) - X-Span-ID: {:?}", upload_id, complete_upload_request, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get audio speeches usage details for the organization.
    async fn usage_audio_speeches<'a>(
        &self,
        start_time: i32,
        end_time: Option<i32>,
        bucket_width: Option<models::UsageAudioSpeechesBucketWidthParameter>,
        project_ids: Option<&'a Vec<String>>,
        user_ids: Option<&'a Vec<String>>,
        api_key_ids: Option<&'a Vec<String>>,
        models: Option<&'a Vec<String>>,
        group_by: Option<&'a Vec<models::UsageAudioSpeechesGroupByParameterInner>>,
        limit: Option<i32>,
        page: Option<String>,
        context: &C) -> Result<UsageAudioSpeechesResponse, ApiError>
    {
        info!("usage_audio_speeches({}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", start_time, end_time, bucket_width, project_ids, user_ids, api_key_ids, models, group_by, limit, page, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get audio transcriptions usage details for the organization.
    async fn usage_audio_transcriptions<'a>(
        &self,
        start_time: i32,
        end_time: Option<i32>,
        bucket_width: Option<models::UsageAudioSpeechesBucketWidthParameter>,
        project_ids: Option<&'a Vec<String>>,
        user_ids: Option<&'a Vec<String>>,
        api_key_ids: Option<&'a Vec<String>>,
        models: Option<&'a Vec<String>>,
        group_by: Option<&'a Vec<models::UsageAudioSpeechesGroupByParameterInner>>,
        limit: Option<i32>,
        page: Option<String>,
        context: &C) -> Result<UsageAudioTranscriptionsResponse, ApiError>
    {
        info!("usage_audio_transcriptions({}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", start_time, end_time, bucket_width, project_ids, user_ids, api_key_ids, models, group_by, limit, page, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get code interpreter sessions usage details for the organization.
    async fn usage_code_interpreter_sessions<'a>(
        &self,
        start_time: i32,
        end_time: Option<i32>,
        bucket_width: Option<models::UsageAudioSpeechesBucketWidthParameter>,
        project_ids: Option<&'a Vec<String>>,
        group_by: Option<&'a Vec<models::UsageCodeInterpreterSessionsGroupByParameterInner>>,
        limit: Option<i32>,
        page: Option<String>,
        context: &C) -> Result<UsageCodeInterpreterSessionsResponse, ApiError>
    {
        info!("usage_code_interpreter_sessions({}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", start_time, end_time, bucket_width, project_ids, group_by, limit, page, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get completions usage details for the organization.
    async fn usage_completions<'a>(
        &self,
        start_time: i32,
        end_time: Option<i32>,
        bucket_width: Option<models::UsageAudioSpeechesBucketWidthParameter>,
        project_ids: Option<&'a Vec<String>>,
        user_ids: Option<&'a Vec<String>>,
        api_key_ids: Option<&'a Vec<String>>,
        models: Option<&'a Vec<String>>,
        batch: Option<bool>,
        group_by: Option<&'a Vec<models::UsageCompletionsGroupByParameterInner>>,
        limit: Option<i32>,
        page: Option<String>,
        context: &C) -> Result<UsageCompletionsResponse, ApiError>
    {
        info!("usage_completions({}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", start_time, end_time, bucket_width, project_ids, user_ids, api_key_ids, models, batch, group_by, limit, page, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get costs details for the organization.
    async fn usage_costs<'a>(
        &self,
        start_time: i32,
        end_time: Option<i32>,
        bucket_width: Option<models::UsageCostsBucketWidthParameter>,
        project_ids: Option<&'a Vec<String>>,
        group_by: Option<&'a Vec<models::UsageCostsGroupByParameterInner>>,
        limit: Option<i32>,
        page: Option<String>,
        context: &C) -> Result<UsageCostsResponse, ApiError>
    {
        info!("usage_costs({}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", start_time, end_time, bucket_width, project_ids, group_by, limit, page, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get embeddings usage details for the organization.
    async fn usage_embeddings<'a>(
        &self,
        start_time: i32,
        end_time: Option<i32>,
        bucket_width: Option<models::UsageAudioSpeechesBucketWidthParameter>,
        project_ids: Option<&'a Vec<String>>,
        user_ids: Option<&'a Vec<String>>,
        api_key_ids: Option<&'a Vec<String>>,
        models: Option<&'a Vec<String>>,
        group_by: Option<&'a Vec<models::UsageAudioSpeechesGroupByParameterInner>>,
        limit: Option<i32>,
        page: Option<String>,
        context: &C) -> Result<UsageEmbeddingsResponse, ApiError>
    {
        info!("usage_embeddings({}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", start_time, end_time, bucket_width, project_ids, user_ids, api_key_ids, models, group_by, limit, page, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get images usage details for the organization.
    async fn usage_images<'a>(
        &self,
        start_time: i32,
        end_time: Option<i32>,
        bucket_width: Option<models::UsageAudioSpeechesBucketWidthParameter>,
        sources: Option<&'a Vec<models::UsageImagesSourcesParameterInner>>,
        sizes: Option<&'a Vec<models::UsageImagesSizesParameterInner>>,
        project_ids: Option<&'a Vec<String>>,
        user_ids: Option<&'a Vec<String>>,
        api_key_ids: Option<&'a Vec<String>>,
        models: Option<&'a Vec<String>>,
        group_by: Option<&'a Vec<models::UsageImagesGroupByParameterInner>>,
        limit: Option<i32>,
        page: Option<String>,
        context: &C) -> Result<UsageImagesResponse, ApiError>
    {
        info!("usage_images({}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", start_time, end_time, bucket_width, sources, sizes, project_ids, user_ids, api_key_ids, models, group_by, limit, page, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get moderations usage details for the organization.
    async fn usage_moderations<'a>(
        &self,
        start_time: i32,
        end_time: Option<i32>,
        bucket_width: Option<models::UsageAudioSpeechesBucketWidthParameter>,
        project_ids: Option<&'a Vec<String>>,
        user_ids: Option<&'a Vec<String>>,
        api_key_ids: Option<&'a Vec<String>>,
        models: Option<&'a Vec<String>>,
        group_by: Option<&'a Vec<models::UsageAudioSpeechesGroupByParameterInner>>,
        limit: Option<i32>,
        page: Option<String>,
        context: &C) -> Result<UsageModerationsResponse, ApiError>
    {
        info!("usage_moderations({}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", start_time, end_time, bucket_width, project_ids, user_ids, api_key_ids, models, group_by, limit, page, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get vector stores usage details for the organization.
    async fn usage_vector_stores<'a>(
        &self,
        start_time: i32,
        end_time: Option<i32>,
        bucket_width: Option<models::UsageAudioSpeechesBucketWidthParameter>,
        project_ids: Option<&'a Vec<String>>,
        group_by: Option<&'a Vec<models::UsageCodeInterpreterSessionsGroupByParameterInner>>,
        limit: Option<i32>,
        page: Option<String>,
        context: &C) -> Result<UsageVectorStoresResponse, ApiError>
    {
        info!("usage_vector_stores({}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", start_time, end_time, bucket_width, project_ids, group_by, limit, page, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Lists all of the users in the organization.
    async fn list_users(
        &self,
        limit: Option<i32>,
        after: Option<String>,
        context: &C) -> Result<ListUsersResponse, ApiError>
    {
        info!("list_users({:?}, {:?}) - X-Span-ID: {:?}", limit, after, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Deletes a user from the organization.
    async fn delete_user(
        &self,
        user_id: String,
        context: &C) -> Result<DeleteUserResponse, ApiError>
    {
        info!("delete_user(\"{}\") - X-Span-ID: {:?}", user_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Modifies a user's role in the organization.
    async fn modify_user(
        &self,
        user_id: String,
        user_role_update_request: models::UserRoleUpdateRequest,
        context: &C) -> Result<ModifyUserResponse, ApiError>
    {
        info!("modify_user(\"{}\", {:?}) - X-Span-ID: {:?}", user_id, user_role_update_request, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Retrieves a user by their identifier.
    async fn retrieve_user(
        &self,
        user_id: String,
        context: &C) -> Result<RetrieveUserResponse, ApiError>
    {
        info!("retrieve_user(\"{}\") - X-Span-ID: {:?}", user_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Create a vector store.
    async fn create_vector_store(
        &self,
        create_vector_store_request: models::CreateVectorStoreRequest,
        context: &C) -> Result<CreateVectorStoreResponse, ApiError>
    {
        info!("create_vector_store({:?}) - X-Span-ID: {:?}", create_vector_store_request, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Returns a list of vector stores.
    async fn list_vector_stores(
        &self,
        limit: Option<i32>,
        order: Option<models::ListAssistantsOrderParameter>,
        after: Option<String>,
        before: Option<String>,
        context: &C) -> Result<ListVectorStoresResponse, ApiError>
    {
        info!("list_vector_stores({:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", limit, order, after, before, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Create a vector store file by attaching a [File](/docs/api-reference/files) to a [vector store](/docs/api-reference/vector-stores/object).
    async fn create_vector_store_file(
        &self,
        vector_store_id: String,
        create_vector_store_file_request: models::CreateVectorStoreFileRequest,
        context: &C) -> Result<CreateVectorStoreFileResponse, ApiError>
    {
        info!("create_vector_store_file(\"{}\", {:?}) - X-Span-ID: {:?}", vector_store_id, create_vector_store_file_request, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Create a vector store file batch.
    async fn create_vector_store_file_batch(
        &self,
        vector_store_id: String,
        create_vector_store_file_batch_request: models::CreateVectorStoreFileBatchRequest,
        context: &C) -> Result<CreateVectorStoreFileBatchResponse, ApiError>
    {
        info!("create_vector_store_file_batch(\"{}\", {:?}) - X-Span-ID: {:?}", vector_store_id, create_vector_store_file_batch_request, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Delete a vector store.
    async fn delete_vector_store(
        &self,
        vector_store_id: String,
        context: &C) -> Result<DeleteVectorStoreResponse, ApiError>
    {
        info!("delete_vector_store(\"{}\") - X-Span-ID: {:?}", vector_store_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Retrieves a vector store.
    async fn get_vector_store(
        &self,
        vector_store_id: String,
        context: &C) -> Result<GetVectorStoreResponse, ApiError>
    {
        info!("get_vector_store(\"{}\") - X-Span-ID: {:?}", vector_store_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Returns a list of vector store files.
    async fn list_vector_store_files(
        &self,
        vector_store_id: String,
        limit: Option<i32>,
        order: Option<models::ListAssistantsOrderParameter>,
        after: Option<String>,
        before: Option<String>,
        filter: Option<models::ListFilesInVectorStoreBatchFilterParameter>,
        context: &C) -> Result<ListVectorStoreFilesResponse, ApiError>
    {
        info!("list_vector_store_files(\"{}\", {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", vector_store_id, limit, order, after, before, filter, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Modifies a vector store.
    async fn modify_vector_store(
        &self,
        vector_store_id: String,
        update_vector_store_request: models::UpdateVectorStoreRequest,
        context: &C) -> Result<ModifyVectorStoreResponse, ApiError>
    {
        info!("modify_vector_store(\"{}\", {:?}) - X-Span-ID: {:?}", vector_store_id, update_vector_store_request, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Cancel a vector store file batch. This attempts to cancel the processing of files in this batch as soon as possible.
    async fn cancel_vector_store_file_batch(
        &self,
        vector_store_id: String,
        batch_id: String,
        context: &C) -> Result<CancelVectorStoreFileBatchResponse, ApiError>
    {
        info!("cancel_vector_store_file_batch(\"{}\", \"{}\") - X-Span-ID: {:?}", vector_store_id, batch_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Delete a vector store file. This will remove the file from the vector store but the file itself will not be deleted. To delete the file, use the [delete file](/docs/api-reference/files/delete) endpoint.
    async fn delete_vector_store_file(
        &self,
        vector_store_id: String,
        file_id: String,
        context: &C) -> Result<DeleteVectorStoreFileResponse, ApiError>
    {
        info!("delete_vector_store_file(\"{}\", \"{}\") - X-Span-ID: {:?}", vector_store_id, file_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Retrieves a vector store file.
    async fn get_vector_store_file(
        &self,
        vector_store_id: String,
        file_id: String,
        context: &C) -> Result<GetVectorStoreFileResponse, ApiError>
    {
        info!("get_vector_store_file(\"{}\", \"{}\") - X-Span-ID: {:?}", vector_store_id, file_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Retrieves a vector store file batch.
    async fn get_vector_store_file_batch(
        &self,
        vector_store_id: String,
        batch_id: String,
        context: &C) -> Result<GetVectorStoreFileBatchResponse, ApiError>
    {
        info!("get_vector_store_file_batch(\"{}\", \"{}\") - X-Span-ID: {:?}", vector_store_id, batch_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Returns a list of vector store files in a batch.
    async fn list_files_in_vector_store_batch(
        &self,
        vector_store_id: String,
        batch_id: String,
        limit: Option<i32>,
        order: Option<models::ListAssistantsOrderParameter>,
        after: Option<String>,
        before: Option<String>,
        filter: Option<models::ListFilesInVectorStoreBatchFilterParameter>,
        context: &C) -> Result<ListFilesInVectorStoreBatchResponse, ApiError>
    {
        info!("list_files_in_vector_store_batch(\"{}\", \"{}\", {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", vector_store_id, batch_id, limit, order, after, before, filter, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

}
