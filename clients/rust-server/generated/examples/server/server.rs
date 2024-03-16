//! Main library entry point for openapi_client implementation.

#![allow(unused_imports)]

use async_trait::async_trait;
use futures::{future, Stream, StreamExt, TryFutureExt, TryStreamExt};
use hyper::server::conn::Http;
use hyper::service::Service;
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
    let addr = addr.parse().expect("Failed to parse bind address");

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
            let tcp_listener = TcpListener::bind(&addr).await.unwrap();

            loop {
                if let Ok((tcp, _)) = tcp_listener.accept().await {
                    let ssl = Ssl::new(tls_acceptor.context()).unwrap();
                    let addr = tcp.peer_addr().expect("Unable to get remote address");
                    let service = service.call(addr);

                    tokio::spawn(async move {
                        let tls = tokio_openssl::SslStream::new(ssl, tcp).map_err(|_| ())?;
                        let service = service.await.map_err(|_| ())?;

                        Http::new()
                            .serve_connection(tls, service)
                            .await
                            .map_err(|_| ())
                    });
                }
            }
        }
    } else {
        // Using HTTP
        hyper::server::Server::bind(&addr).serve(service).await.unwrap()
    }
}

#[derive(Copy, Clone)]
pub struct Server<C> {
    marker: PhantomData<C>,
}

impl<C> Server<C> {
    pub fn new() -> Self {
        Server{marker: PhantomData}
    }
}


use openapi_client::{
    Api,
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
    RetrieveModelResponse,
};
use openapi_client::server::MakeService;
use std::error::Error;
use swagger::ApiError;

#[async_trait]
impl<C> Api<C> for Server<C> where C: Has<XSpanIdString> + Send + Sync
{
    /// Immediately cancel a fine-tune job. 
    async fn cancel_fine_tune(
        &self,
        fine_tune_id: String,
        context: &C) -> Result<CancelFineTuneResponse, ApiError>
    {
        info!("cancel_fine_tune(\"{}\") - X-Span-ID: {:?}", fine_tune_id, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// Creates a model response for the given chat conversation.
    async fn create_chat_completion(
        &self,
        create_chat_completion_request: models::CreateChatCompletionRequest,
        context: &C) -> Result<CreateChatCompletionResponse, ApiError>
    {
        info!("create_chat_completion({:?}) - X-Span-ID: {:?}", create_chat_completion_request, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// Creates a completion for the provided prompt and parameters.
    async fn create_completion(
        &self,
        create_completion_request: models::CreateCompletionRequest,
        context: &C) -> Result<CreateCompletionResponse, ApiError>
    {
        info!("create_completion({:?}) - X-Span-ID: {:?}", create_completion_request, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// Creates a new edit for the provided input, instruction, and parameters.
    async fn create_edit(
        &self,
        create_edit_request: models::CreateEditRequest,
        context: &C) -> Result<CreateEditResponse, ApiError>
    {
        info!("create_edit({:?}) - X-Span-ID: {:?}", create_edit_request, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// Creates an embedding vector representing the input text.
    async fn create_embedding(
        &self,
        create_embedding_request: models::CreateEmbeddingRequest,
        context: &C) -> Result<CreateEmbeddingResponse, ApiError>
    {
        info!("create_embedding({:?}) - X-Span-ID: {:?}", create_embedding_request, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// Upload a file that contains document(s) to be used across various endpoints/features. Currently, the size of all the files uploaded by one organization can be up to 1 GB. Please contact us if you need to increase the storage limit. 
    async fn create_file(
        &self,
        file: swagger::ByteArray,
        purpose: String,
        context: &C) -> Result<CreateFileResponse, ApiError>
    {
        info!("create_file({:?}, \"{}\") - X-Span-ID: {:?}", file, purpose, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// Creates a job that fine-tunes a specified model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 
    async fn create_fine_tune(
        &self,
        create_fine_tune_request: models::CreateFineTuneRequest,
        context: &C) -> Result<CreateFineTuneResponse, ApiError>
    {
        info!("create_fine_tune({:?}) - X-Span-ID: {:?}", create_fine_tune_request, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// Creates an image given a prompt.
    async fn create_image(
        &self,
        create_image_request: models::CreateImageRequest,
        context: &C) -> Result<CreateImageResponse, ApiError>
    {
        info!("create_image({:?}) - X-Span-ID: {:?}", create_image_request, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// Creates an edited or extended image given an original image and a prompt.
    async fn create_image_edit(
        &self,
        image: swagger::ByteArray,
        prompt: String,
        mask: Option<swagger::ByteArray>,
        n: Option<i32>,
        size: Option<String>,
        response_format: Option<String>,
        user: Option<String>,
        context: &C) -> Result<CreateImageEditResponse, ApiError>
    {
        info!("create_image_edit({:?}, \"{}\", {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", image, prompt, mask, n, size, response_format, user, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// Creates a variation of a given image.
    async fn create_image_variation(
        &self,
        image: swagger::ByteArray,
        n: Option<i32>,
        size: Option<String>,
        response_format: Option<String>,
        user: Option<String>,
        context: &C) -> Result<CreateImageVariationResponse, ApiError>
    {
        info!("create_image_variation({:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", image, n, size, response_format, user, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// Classifies if text violates OpenAI's Content Policy
    async fn create_moderation(
        &self,
        create_moderation_request: models::CreateModerationRequest,
        context: &C) -> Result<CreateModerationResponse, ApiError>
    {
        info!("create_moderation({:?}) - X-Span-ID: {:?}", create_moderation_request, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// Transcribes audio into the input language.
    async fn create_transcription(
        &self,
        file: swagger::ByteArray,
        model: models::CreateTranscriptionRequestModel,
        prompt: Option<String>,
        response_format: Option<String>,
        temperature: Option<f64>,
        language: Option<String>,
        context: &C) -> Result<CreateTranscriptionResponse, ApiError>
    {
        info!("create_transcription({:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", file, model, prompt, response_format, temperature, language, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
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
        Err(ApiError("Generic failure".into()))
    }

    /// Delete a file.
    async fn delete_file(
        &self,
        file_id: String,
        context: &C) -> Result<DeleteFileResponse, ApiError>
    {
        info!("delete_file(\"{}\") - X-Span-ID: {:?}", file_id, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// Delete a fine-tuned model. You must have the Owner role in your organization.
    async fn delete_model(
        &self,
        model: String,
        context: &C) -> Result<DeleteModelResponse, ApiError>
    {
        info!("delete_model(\"{}\") - X-Span-ID: {:?}", model, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// Returns the contents of the specified file
    async fn download_file(
        &self,
        file_id: String,
        context: &C) -> Result<DownloadFileResponse, ApiError>
    {
        info!("download_file(\"{}\") - X-Span-ID: {:?}", file_id, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// Returns a list of files that belong to the user's organization.
    async fn list_files(
        &self,
        context: &C) -> Result<ListFilesResponse, ApiError>
    {
        info!("list_files() - X-Span-ID: {:?}", context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// Get fine-grained status updates for a fine-tune job. 
    async fn list_fine_tune_events(
        &self,
        fine_tune_id: String,
        stream: Option<bool>,
        context: &C) -> Result<ListFineTuneEventsResponse, ApiError>
    {
        info!("list_fine_tune_events(\"{}\", {:?}) - X-Span-ID: {:?}", fine_tune_id, stream, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// List your organization's fine-tuning jobs 
    async fn list_fine_tunes(
        &self,
        context: &C) -> Result<ListFineTunesResponse, ApiError>
    {
        info!("list_fine_tunes() - X-Span-ID: {:?}", context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// Lists the currently available models, and provides basic information about each one such as the owner and availability.
    async fn list_models(
        &self,
        context: &C) -> Result<ListModelsResponse, ApiError>
    {
        info!("list_models() - X-Span-ID: {:?}", context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// Returns information about a specific file.
    async fn retrieve_file(
        &self,
        file_id: String,
        context: &C) -> Result<RetrieveFileResponse, ApiError>
    {
        info!("retrieve_file(\"{}\") - X-Span-ID: {:?}", file_id, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// Gets info about the fine-tune job.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 
    async fn retrieve_fine_tune(
        &self,
        fine_tune_id: String,
        context: &C) -> Result<RetrieveFineTuneResponse, ApiError>
    {
        info!("retrieve_fine_tune(\"{}\") - X-Span-ID: {:?}", fine_tune_id, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// Retrieves a model instance, providing basic information about the model such as the owner and permissioning.
    async fn retrieve_model(
        &self,
        model: String,
        context: &C) -> Result<RetrieveModelResponse, ApiError>
    {
        info!("retrieve_model(\"{}\") - X-Span-ID: {:?}", model, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

}
