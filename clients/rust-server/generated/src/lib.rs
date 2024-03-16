#![allow(missing_docs, trivial_casts, unused_variables, unused_mut, unused_imports, unused_extern_crates, non_camel_case_types)]
#![allow(unused_imports, unused_attributes)]
#![allow(clippy::derive_partial_eq_without_eq, clippy::disallowed_names)]

use async_trait::async_trait;
use futures::Stream;
use std::error::Error;
use std::task::{Poll, Context};
use swagger::{ApiError, ContextWrapper};
use serde::{Serialize, Deserialize};

type ServiceError = Box<dyn Error + Send + Sync + 'static>;

pub const BASE_PATH: &str = "/v1";
pub const API_VERSION: &str = "2.0.0";

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum CancelFineTuneResponse {
    /// OK
    OK
    (models::FineTune)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum CreateChatCompletionResponse {
    /// OK
    OK
    (models::CreateChatCompletionResponse)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum CreateCompletionResponse {
    /// OK
    OK
    (models::CreateCompletionResponse)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum CreateEditResponse {
    /// OK
    OK
    (models::CreateEditResponse)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum CreateEmbeddingResponse {
    /// OK
    OK
    (models::CreateEmbeddingResponse)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum CreateFileResponse {
    /// OK
    OK
    (models::OpenAiFile)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum CreateFineTuneResponse {
    /// OK
    OK
    (models::FineTune)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum CreateImageResponse {
    /// OK
    OK
    (models::ImagesResponse)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum CreateImageEditResponse {
    /// OK
    OK
    (models::ImagesResponse)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum CreateImageVariationResponse {
    /// OK
    OK
    (models::ImagesResponse)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum CreateModerationResponse {
    /// OK
    OK
    (models::CreateModerationResponse)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum CreateTranscriptionResponse {
    /// OK
    OK
    (models::CreateTranscriptionResponse)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum CreateTranslationResponse {
    /// OK
    OK
    (models::CreateTranslationResponse)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum DeleteFileResponse {
    /// OK
    OK
    (models::DeleteFileResponse)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum DeleteModelResponse {
    /// OK
    OK
    (models::DeleteModelResponse)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum DownloadFileResponse {
    /// OK
    OK
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum ListFilesResponse {
    /// OK
    OK
    (models::ListFilesResponse)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum ListFineTuneEventsResponse {
    /// OK
    OK
    (models::ListFineTuneEventsResponse)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum ListFineTunesResponse {
    /// OK
    OK
    (models::ListFineTunesResponse)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum ListModelsResponse {
    /// OK
    OK
    (models::ListModelsResponse)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum RetrieveFileResponse {
    /// OK
    OK
    (models::OpenAiFile)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum RetrieveFineTuneResponse {
    /// OK
    OK
    (models::FineTune)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum RetrieveModelResponse {
    /// OK
    OK
    (models::Model)
}

/// API
#[async_trait]
#[allow(clippy::too_many_arguments, clippy::ptr_arg)]
pub trait Api<C: Send + Sync> {
    fn poll_ready(&self, _cx: &mut Context) -> Poll<Result<(), Box<dyn Error + Send + Sync + 'static>>> {
        Poll::Ready(Ok(()))
    }

    /// Immediately cancel a fine-tune job. 
    async fn cancel_fine_tune(
        &self,
        fine_tune_id: String,
        context: &C) -> Result<CancelFineTuneResponse, ApiError>;

    /// Creates a model response for the given chat conversation.
    async fn create_chat_completion(
        &self,
        create_chat_completion_request: models::CreateChatCompletionRequest,
        context: &C) -> Result<CreateChatCompletionResponse, ApiError>;

    /// Creates a completion for the provided prompt and parameters.
    async fn create_completion(
        &self,
        create_completion_request: models::CreateCompletionRequest,
        context: &C) -> Result<CreateCompletionResponse, ApiError>;

    /// Creates a new edit for the provided input, instruction, and parameters.
    async fn create_edit(
        &self,
        create_edit_request: models::CreateEditRequest,
        context: &C) -> Result<CreateEditResponse, ApiError>;

    /// Creates an embedding vector representing the input text.
    async fn create_embedding(
        &self,
        create_embedding_request: models::CreateEmbeddingRequest,
        context: &C) -> Result<CreateEmbeddingResponse, ApiError>;

    /// Upload a file that contains document(s) to be used across various endpoints/features. Currently, the size of all the files uploaded by one organization can be up to 1 GB. Please contact us if you need to increase the storage limit. 
    async fn create_file(
        &self,
        file: swagger::ByteArray,
        purpose: String,
        context: &C) -> Result<CreateFileResponse, ApiError>;

    /// Creates a job that fine-tunes a specified model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 
    async fn create_fine_tune(
        &self,
        create_fine_tune_request: models::CreateFineTuneRequest,
        context: &C) -> Result<CreateFineTuneResponse, ApiError>;

    /// Creates an image given a prompt.
    async fn create_image(
        &self,
        create_image_request: models::CreateImageRequest,
        context: &C) -> Result<CreateImageResponse, ApiError>;

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
        context: &C) -> Result<CreateImageEditResponse, ApiError>;

    /// Creates a variation of a given image.
    async fn create_image_variation(
        &self,
        image: swagger::ByteArray,
        n: Option<i32>,
        size: Option<String>,
        response_format: Option<String>,
        user: Option<String>,
        context: &C) -> Result<CreateImageVariationResponse, ApiError>;

    /// Classifies if text violates OpenAI's Content Policy
    async fn create_moderation(
        &self,
        create_moderation_request: models::CreateModerationRequest,
        context: &C) -> Result<CreateModerationResponse, ApiError>;

    /// Transcribes audio into the input language.
    async fn create_transcription(
        &self,
        file: swagger::ByteArray,
        model: models::CreateTranscriptionRequestModel,
        prompt: Option<String>,
        response_format: Option<String>,
        temperature: Option<f64>,
        language: Option<String>,
        context: &C) -> Result<CreateTranscriptionResponse, ApiError>;

    /// Translates audio into English.
    async fn create_translation(
        &self,
        file: swagger::ByteArray,
        model: models::CreateTranscriptionRequestModel,
        prompt: Option<String>,
        response_format: Option<String>,
        temperature: Option<f64>,
        context: &C) -> Result<CreateTranslationResponse, ApiError>;

    /// Delete a file.
    async fn delete_file(
        &self,
        file_id: String,
        context: &C) -> Result<DeleteFileResponse, ApiError>;

    /// Delete a fine-tuned model. You must have the Owner role in your organization.
    async fn delete_model(
        &self,
        model: String,
        context: &C) -> Result<DeleteModelResponse, ApiError>;

    /// Returns the contents of the specified file
    async fn download_file(
        &self,
        file_id: String,
        context: &C) -> Result<DownloadFileResponse, ApiError>;

    /// Returns a list of files that belong to the user's organization.
    async fn list_files(
        &self,
        context: &C) -> Result<ListFilesResponse, ApiError>;

    /// Get fine-grained status updates for a fine-tune job. 
    async fn list_fine_tune_events(
        &self,
        fine_tune_id: String,
        stream: Option<bool>,
        context: &C) -> Result<ListFineTuneEventsResponse, ApiError>;

    /// List your organization's fine-tuning jobs 
    async fn list_fine_tunes(
        &self,
        context: &C) -> Result<ListFineTunesResponse, ApiError>;

    /// Lists the currently available models, and provides basic information about each one such as the owner and availability.
    async fn list_models(
        &self,
        context: &C) -> Result<ListModelsResponse, ApiError>;

    /// Returns information about a specific file.
    async fn retrieve_file(
        &self,
        file_id: String,
        context: &C) -> Result<RetrieveFileResponse, ApiError>;

    /// Gets info about the fine-tune job.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 
    async fn retrieve_fine_tune(
        &self,
        fine_tune_id: String,
        context: &C) -> Result<RetrieveFineTuneResponse, ApiError>;

    /// Retrieves a model instance, providing basic information about the model such as the owner and permissioning.
    async fn retrieve_model(
        &self,
        model: String,
        context: &C) -> Result<RetrieveModelResponse, ApiError>;

}

/// API where `Context` isn't passed on every API call
#[async_trait]
#[allow(clippy::too_many_arguments, clippy::ptr_arg)]
pub trait ApiNoContext<C: Send + Sync> {

    fn poll_ready(&self, _cx: &mut Context) -> Poll<Result<(), Box<dyn Error + Send + Sync + 'static>>>;

    fn context(&self) -> &C;

    /// Immediately cancel a fine-tune job. 
    async fn cancel_fine_tune(
        &self,
        fine_tune_id: String,
        ) -> Result<CancelFineTuneResponse, ApiError>;

    /// Creates a model response for the given chat conversation.
    async fn create_chat_completion(
        &self,
        create_chat_completion_request: models::CreateChatCompletionRequest,
        ) -> Result<CreateChatCompletionResponse, ApiError>;

    /// Creates a completion for the provided prompt and parameters.
    async fn create_completion(
        &self,
        create_completion_request: models::CreateCompletionRequest,
        ) -> Result<CreateCompletionResponse, ApiError>;

    /// Creates a new edit for the provided input, instruction, and parameters.
    async fn create_edit(
        &self,
        create_edit_request: models::CreateEditRequest,
        ) -> Result<CreateEditResponse, ApiError>;

    /// Creates an embedding vector representing the input text.
    async fn create_embedding(
        &self,
        create_embedding_request: models::CreateEmbeddingRequest,
        ) -> Result<CreateEmbeddingResponse, ApiError>;

    /// Upload a file that contains document(s) to be used across various endpoints/features. Currently, the size of all the files uploaded by one organization can be up to 1 GB. Please contact us if you need to increase the storage limit. 
    async fn create_file(
        &self,
        file: swagger::ByteArray,
        purpose: String,
        ) -> Result<CreateFileResponse, ApiError>;

    /// Creates a job that fine-tunes a specified model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 
    async fn create_fine_tune(
        &self,
        create_fine_tune_request: models::CreateFineTuneRequest,
        ) -> Result<CreateFineTuneResponse, ApiError>;

    /// Creates an image given a prompt.
    async fn create_image(
        &self,
        create_image_request: models::CreateImageRequest,
        ) -> Result<CreateImageResponse, ApiError>;

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
        ) -> Result<CreateImageEditResponse, ApiError>;

    /// Creates a variation of a given image.
    async fn create_image_variation(
        &self,
        image: swagger::ByteArray,
        n: Option<i32>,
        size: Option<String>,
        response_format: Option<String>,
        user: Option<String>,
        ) -> Result<CreateImageVariationResponse, ApiError>;

    /// Classifies if text violates OpenAI's Content Policy
    async fn create_moderation(
        &self,
        create_moderation_request: models::CreateModerationRequest,
        ) -> Result<CreateModerationResponse, ApiError>;

    /// Transcribes audio into the input language.
    async fn create_transcription(
        &self,
        file: swagger::ByteArray,
        model: models::CreateTranscriptionRequestModel,
        prompt: Option<String>,
        response_format: Option<String>,
        temperature: Option<f64>,
        language: Option<String>,
        ) -> Result<CreateTranscriptionResponse, ApiError>;

    /// Translates audio into English.
    async fn create_translation(
        &self,
        file: swagger::ByteArray,
        model: models::CreateTranscriptionRequestModel,
        prompt: Option<String>,
        response_format: Option<String>,
        temperature: Option<f64>,
        ) -> Result<CreateTranslationResponse, ApiError>;

    /// Delete a file.
    async fn delete_file(
        &self,
        file_id: String,
        ) -> Result<DeleteFileResponse, ApiError>;

    /// Delete a fine-tuned model. You must have the Owner role in your organization.
    async fn delete_model(
        &self,
        model: String,
        ) -> Result<DeleteModelResponse, ApiError>;

    /// Returns the contents of the specified file
    async fn download_file(
        &self,
        file_id: String,
        ) -> Result<DownloadFileResponse, ApiError>;

    /// Returns a list of files that belong to the user's organization.
    async fn list_files(
        &self,
        ) -> Result<ListFilesResponse, ApiError>;

    /// Get fine-grained status updates for a fine-tune job. 
    async fn list_fine_tune_events(
        &self,
        fine_tune_id: String,
        stream: Option<bool>,
        ) -> Result<ListFineTuneEventsResponse, ApiError>;

    /// List your organization's fine-tuning jobs 
    async fn list_fine_tunes(
        &self,
        ) -> Result<ListFineTunesResponse, ApiError>;

    /// Lists the currently available models, and provides basic information about each one such as the owner and availability.
    async fn list_models(
        &self,
        ) -> Result<ListModelsResponse, ApiError>;

    /// Returns information about a specific file.
    async fn retrieve_file(
        &self,
        file_id: String,
        ) -> Result<RetrieveFileResponse, ApiError>;

    /// Gets info about the fine-tune job.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 
    async fn retrieve_fine_tune(
        &self,
        fine_tune_id: String,
        ) -> Result<RetrieveFineTuneResponse, ApiError>;

    /// Retrieves a model instance, providing basic information about the model such as the owner and permissioning.
    async fn retrieve_model(
        &self,
        model: String,
        ) -> Result<RetrieveModelResponse, ApiError>;

}

/// Trait to extend an API to make it easy to bind it to a context.
pub trait ContextWrapperExt<C: Send + Sync> where Self: Sized
{
    /// Binds this API to a context.
    fn with_context(self, context: C) -> ContextWrapper<Self, C>;
}

impl<T: Api<C> + Send + Sync, C: Clone + Send + Sync> ContextWrapperExt<C> for T {
    fn with_context(self: T, context: C) -> ContextWrapper<T, C> {
         ContextWrapper::<T, C>::new(self, context)
    }
}

#[async_trait]
impl<T: Api<C> + Send + Sync, C: Clone + Send + Sync> ApiNoContext<C> for ContextWrapper<T, C> {
    fn poll_ready(&self, cx: &mut Context) -> Poll<Result<(), ServiceError>> {
        self.api().poll_ready(cx)
    }

    fn context(&self) -> &C {
        ContextWrapper::context(self)
    }

    /// Immediately cancel a fine-tune job. 
    async fn cancel_fine_tune(
        &self,
        fine_tune_id: String,
        ) -> Result<CancelFineTuneResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().cancel_fine_tune(fine_tune_id, &context).await
    }

    /// Creates a model response for the given chat conversation.
    async fn create_chat_completion(
        &self,
        create_chat_completion_request: models::CreateChatCompletionRequest,
        ) -> Result<CreateChatCompletionResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().create_chat_completion(create_chat_completion_request, &context).await
    }

    /// Creates a completion for the provided prompt and parameters.
    async fn create_completion(
        &self,
        create_completion_request: models::CreateCompletionRequest,
        ) -> Result<CreateCompletionResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().create_completion(create_completion_request, &context).await
    }

    /// Creates a new edit for the provided input, instruction, and parameters.
    async fn create_edit(
        &self,
        create_edit_request: models::CreateEditRequest,
        ) -> Result<CreateEditResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().create_edit(create_edit_request, &context).await
    }

    /// Creates an embedding vector representing the input text.
    async fn create_embedding(
        &self,
        create_embedding_request: models::CreateEmbeddingRequest,
        ) -> Result<CreateEmbeddingResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().create_embedding(create_embedding_request, &context).await
    }

    /// Upload a file that contains document(s) to be used across various endpoints/features. Currently, the size of all the files uploaded by one organization can be up to 1 GB. Please contact us if you need to increase the storage limit. 
    async fn create_file(
        &self,
        file: swagger::ByteArray,
        purpose: String,
        ) -> Result<CreateFileResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().create_file(file, purpose, &context).await
    }

    /// Creates a job that fine-tunes a specified model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 
    async fn create_fine_tune(
        &self,
        create_fine_tune_request: models::CreateFineTuneRequest,
        ) -> Result<CreateFineTuneResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().create_fine_tune(create_fine_tune_request, &context).await
    }

    /// Creates an image given a prompt.
    async fn create_image(
        &self,
        create_image_request: models::CreateImageRequest,
        ) -> Result<CreateImageResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().create_image(create_image_request, &context).await
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
        ) -> Result<CreateImageEditResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().create_image_edit(image, prompt, mask, n, size, response_format, user, &context).await
    }

    /// Creates a variation of a given image.
    async fn create_image_variation(
        &self,
        image: swagger::ByteArray,
        n: Option<i32>,
        size: Option<String>,
        response_format: Option<String>,
        user: Option<String>,
        ) -> Result<CreateImageVariationResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().create_image_variation(image, n, size, response_format, user, &context).await
    }

    /// Classifies if text violates OpenAI's Content Policy
    async fn create_moderation(
        &self,
        create_moderation_request: models::CreateModerationRequest,
        ) -> Result<CreateModerationResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().create_moderation(create_moderation_request, &context).await
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
        ) -> Result<CreateTranscriptionResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().create_transcription(file, model, prompt, response_format, temperature, language, &context).await
    }

    /// Translates audio into English.
    async fn create_translation(
        &self,
        file: swagger::ByteArray,
        model: models::CreateTranscriptionRequestModel,
        prompt: Option<String>,
        response_format: Option<String>,
        temperature: Option<f64>,
        ) -> Result<CreateTranslationResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().create_translation(file, model, prompt, response_format, temperature, &context).await
    }

    /// Delete a file.
    async fn delete_file(
        &self,
        file_id: String,
        ) -> Result<DeleteFileResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().delete_file(file_id, &context).await
    }

    /// Delete a fine-tuned model. You must have the Owner role in your organization.
    async fn delete_model(
        &self,
        model: String,
        ) -> Result<DeleteModelResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().delete_model(model, &context).await
    }

    /// Returns the contents of the specified file
    async fn download_file(
        &self,
        file_id: String,
        ) -> Result<DownloadFileResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().download_file(file_id, &context).await
    }

    /// Returns a list of files that belong to the user's organization.
    async fn list_files(
        &self,
        ) -> Result<ListFilesResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().list_files(&context).await
    }

    /// Get fine-grained status updates for a fine-tune job. 
    async fn list_fine_tune_events(
        &self,
        fine_tune_id: String,
        stream: Option<bool>,
        ) -> Result<ListFineTuneEventsResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().list_fine_tune_events(fine_tune_id, stream, &context).await
    }

    /// List your organization's fine-tuning jobs 
    async fn list_fine_tunes(
        &self,
        ) -> Result<ListFineTunesResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().list_fine_tunes(&context).await
    }

    /// Lists the currently available models, and provides basic information about each one such as the owner and availability.
    async fn list_models(
        &self,
        ) -> Result<ListModelsResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().list_models(&context).await
    }

    /// Returns information about a specific file.
    async fn retrieve_file(
        &self,
        file_id: String,
        ) -> Result<RetrieveFileResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().retrieve_file(file_id, &context).await
    }

    /// Gets info about the fine-tune job.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 
    async fn retrieve_fine_tune(
        &self,
        fine_tune_id: String,
        ) -> Result<RetrieveFineTuneResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().retrieve_fine_tune(fine_tune_id, &context).await
    }

    /// Retrieves a model instance, providing basic information about the model such as the owner and permissioning.
    async fn retrieve_model(
        &self,
        model: String,
        ) -> Result<RetrieveModelResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().retrieve_model(model, &context).await
    }

}


#[cfg(feature = "client")]
pub mod client;

// Re-export Client as a top-level name
#[cfg(feature = "client")]
pub use client::Client;

#[cfg(feature = "server")]
pub mod server;

// Re-export router() as a top-level name
#[cfg(feature = "server")]
pub use self::server::Service;

#[cfg(feature = "server")]
pub mod context;

pub mod models;

#[cfg(any(feature = "client", feature = "server"))]
pub(crate) mod header;
