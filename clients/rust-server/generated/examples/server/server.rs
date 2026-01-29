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
    CreateModerationResponse,
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

    /// Create an assistant file by attaching a [File](/docs/api-reference/files) to an [assistant](/docs/api-reference/assistants).
    async fn create_assistant_file(
        &self,
        assistant_id: String,
        create_assistant_file_request: models::CreateAssistantFileRequest,
        context: &C) -> Result<CreateAssistantFileResponse, ApiError>
    {
        info!("create_assistant_file(\"{}\", {:?}) - X-Span-ID: {:?}", assistant_id, create_assistant_file_request, context.get().0.clone());
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
    async fn create_run(
        &self,
        thread_id: String,
        create_run_request: models::CreateRunRequest,
        context: &C) -> Result<CreateRunResponse, ApiError>
    {
        info!("create_run(\"{}\", {:?}) - X-Span-ID: {:?}", thread_id, create_run_request, context.get().0.clone());
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

    /// Returns a list of assistant files.
    async fn list_assistant_files(
        &self,
        assistant_id: String,
        limit: Option<i32>,
        order: Option<models::ListAssistantsOrderParameter>,
        after: Option<String>,
        before: Option<String>,
        context: &C) -> Result<ListAssistantFilesResponse, ApiError>
    {
        info!("list_assistant_files(\"{}\", {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", assistant_id, limit, order, after, before, context.get().0.clone());
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

    /// Delete an assistant file.
    async fn delete_assistant_file(
        &self,
        assistant_id: String,
        file_id: String,
        context: &C) -> Result<DeleteAssistantFileResponse, ApiError>
    {
        info!("delete_assistant_file(\"{}\", \"{}\") - X-Span-ID: {:?}", assistant_id, file_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Retrieves an AssistantFile.
    async fn get_assistant_file(
        &self,
        assistant_id: String,
        file_id: String,
        context: &C) -> Result<GetAssistantFileResponse, ApiError>
    {
        info!("get_assistant_file(\"{}\", \"{}\") - X-Span-ID: {:?}", assistant_id, file_id, context.get().0.clone());
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

    /// Returns a list of message files.
    async fn list_message_files(
        &self,
        thread_id: String,
        message_id: String,
        limit: Option<i32>,
        order: Option<models::ListAssistantsOrderParameter>,
        after: Option<String>,
        before: Option<String>,
        context: &C) -> Result<ListMessageFilesResponse, ApiError>
    {
        info!("list_message_files(\"{}\", \"{}\", {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", thread_id, message_id, limit, order, after, before, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Returns a list of run steps belonging to a run.
    async fn list_run_steps(
        &self,
        thread_id: String,
        run_id: String,
        limit: Option<i32>,
        order: Option<models::ListAssistantsOrderParameter>,
        after: Option<String>,
        before: Option<String>,
        context: &C) -> Result<ListRunStepsResponse, ApiError>
    {
        info!("list_run_steps(\"{}\", \"{}\", {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", thread_id, run_id, limit, order, after, before, context.get().0.clone());
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

    /// Retrieves a message file.
    async fn get_message_file(
        &self,
        thread_id: String,
        message_id: String,
        file_id: String,
        context: &C) -> Result<GetMessageFileResponse, ApiError>
    {
        info!("get_message_file(\"{}\", \"{}\", \"{}\") - X-Span-ID: {:?}", thread_id, message_id, file_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Retrieves a run step.
    async fn get_run_step(
        &self,
        thread_id: String,
        run_id: String,
        step_id: String,
        context: &C) -> Result<GetRunStepResponse, ApiError>
    {
        info!("get_run_step(\"{}\", \"{}\", \"{}\") - X-Span-ID: {:?}", thread_id, run_id, step_id, context.get().0.clone());
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
        response_format: Option<models::CreateTranscriptionRequestResponseFormat>,
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
        response_format: Option<String>,
        temperature: Option<f64>,
        context: &C) -> Result<CreateTranslationResponse, ApiError>
    {
        info!("create_translation({:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", file, model, prompt, response_format, temperature, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Creates a model response for the given chat conversation.
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

    /// Creates an embedding vector representing the input text.
    async fn create_embedding(
        &self,
        create_embedding_request: models::CreateEmbeddingRequest,
        context: &C) -> Result<CreateEmbeddingResponse, ApiError>
    {
        info!("create_embedding({:?}) - X-Span-ID: {:?}", create_embedding_request, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Upload a file that can be used across various endpoints. The size of all the files uploaded by one organization can be up to 100 GB.  The size of individual files can be a maximum of 512 MB or 2 million tokens for Assistants. See the [Assistants Tools guide](/docs/assistants/tools) to learn more about the types of files supported. The Fine-tuning API only supports `.jsonl` files.  Please [contact us](https://help.openai.com/) if you need to increase these storage limits. 
    async fn create_file(
        &self,
        file: swagger::ByteArray,
        purpose: models::CreateFileRequestPurpose,
        context: &C) -> Result<CreateFileResponse, ApiError>
    {
        info!("create_file({:?}, {:?}) - X-Span-ID: {:?}", file, purpose, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Returns a list of files that belong to the user's organization.
    async fn list_files(
        &self,
        purpose: Option<String>,
        context: &C) -> Result<ListFilesResponse, ApiError>
    {
        info!("list_files({:?}) - X-Span-ID: {:?}", purpose, context.get().0.clone());
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
        response_format: Option<swagger::Nullable<models::CreateImageRequestResponseFormat>>,
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
        response_format: Option<swagger::Nullable<models::CreateImageRequestResponseFormat>>,
        size: Option<swagger::Nullable<models::CreateImageEditRequestSize>>,
        user: Option<String>,
        context: &C) -> Result<CreateImageVariationResponse, ApiError>
    {
        info!("create_image_variation({:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", image, model, n, response_format, size, user, context.get().0.clone());
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

    /// Classifies if text is potentially harmful.
    async fn create_moderation(
        &self,
        create_moderation_request: models::CreateModerationRequest,
        context: &C) -> Result<CreateModerationResponse, ApiError>
    {
        info!("create_moderation({:?}) - X-Span-ID: {:?}", create_moderation_request, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

}
