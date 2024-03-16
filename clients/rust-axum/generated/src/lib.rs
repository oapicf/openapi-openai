#![allow(missing_docs, trivial_casts, unused_variables, unused_mut, unused_imports, unused_extern_crates, non_camel_case_types)]
#![allow(unused_imports, unused_attributes)]
#![allow(clippy::derive_partial_eq_without_eq, clippy::disallowed_names)]

use async_trait::async_trait;
use axum::extract::*;
use axum_extra::extract::{CookieJar, Multipart};
use bytes::Bytes;
use http::Method;
use serde::{Deserialize, Serialize};

use types::*;

pub const BASE_PATH: &str = "/v1";
pub const API_VERSION: &str = "2.0.0";

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum CancelFineTuneResponse {
    /// OK
    Status200_OK
    (models::FineTune)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum CreateChatCompletionResponse {
    /// OK
    Status200_OK
    (models::CreateChatCompletionResponse)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum CreateCompletionResponse {
    /// OK
    Status200_OK
    (models::CreateCompletionResponse)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum CreateEditResponse {
    /// OK
    Status200_OK
    (models::CreateEditResponse)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum CreateEmbeddingResponse {
    /// OK
    Status200_OK
    (models::CreateEmbeddingResponse)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum CreateFileResponse {
    /// OK
    Status200_OK
    (models::OpenAiFile)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum CreateFineTuneResponse {
    /// OK
    Status200_OK
    (models::FineTune)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum CreateImageResponse {
    /// OK
    Status200_OK
    (models::ImagesResponse)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum CreateImageEditResponse {
    /// OK
    Status200_OK
    (models::ImagesResponse)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum CreateImageVariationResponse {
    /// OK
    Status200_OK
    (models::ImagesResponse)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum CreateModerationResponse {
    /// OK
    Status200_OK
    (models::CreateModerationResponse)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum CreateTranscriptionResponse {
    /// OK
    Status200_OK
    (models::CreateTranscriptionResponse)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum CreateTranslationResponse {
    /// OK
    Status200_OK
    (models::CreateTranslationResponse)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum DeleteFileResponse {
    /// OK
    Status200_OK
    (models::DeleteFileResponse)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum DeleteModelResponse {
    /// OK
    Status200_OK
    (models::DeleteModelResponse)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum DownloadFileResponse {
    /// OK
    Status200_OK
    (String)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ListFilesResponse {
    /// OK
    Status200_OK
    (models::ListFilesResponse)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ListFineTuneEventsResponse {
    /// OK
    Status200_OK
    (models::ListFineTuneEventsResponse)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ListFineTunesResponse {
    /// OK
    Status200_OK
    (models::ListFineTunesResponse)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ListModelsResponse {
    /// OK
    Status200_OK
    (models::ListModelsResponse)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum RetrieveFileResponse {
    /// OK
    Status200_OK
    (models::OpenAiFile)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum RetrieveFineTuneResponse {
    /// OK
    Status200_OK
    (models::FineTune)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum RetrieveModelResponse {
    /// OK
    Status200_OK
    (models::Model)
}


/// API
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait Api {

                /// Immediately cancel a fine-tune job. .
                ///
                /// CancelFineTune - POST /v1/fine-tunes/{fine_tune_id}/cancel
                async fn cancel_fine_tune(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::CancelFineTunePathParams,
                ) -> Result<CancelFineTuneResponse, String>;


                /// Creates a model response for the given chat conversation..
                ///
                /// CreateChatCompletion - POST /v1/chat/completions
                async fn create_chat_completion(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                        body: models::CreateChatCompletionRequest,
                ) -> Result<CreateChatCompletionResponse, String>;


                /// Creates a completion for the provided prompt and parameters..
                ///
                /// CreateCompletion - POST /v1/completions
                async fn create_completion(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                        body: models::CreateCompletionRequest,
                ) -> Result<CreateCompletionResponse, String>;


                /// Creates a new edit for the provided input, instruction, and parameters..
                ///
                /// CreateEdit - POST /v1/edits
                async fn create_edit(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                        body: models::CreateEditRequest,
                ) -> Result<CreateEditResponse, String>;


                /// Creates an embedding vector representing the input text..
                ///
                /// CreateEmbedding - POST /v1/embeddings
                async fn create_embedding(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                        body: models::CreateEmbeddingRequest,
                ) -> Result<CreateEmbeddingResponse, String>;


                /// Upload a file that contains document(s) to be used across various endpoints/features. Currently, the size of all the files uploaded by one organization can be up to 1 GB. Please contact us if you need to increase the storage limit. .
                ///
                /// CreateFile - POST /v1/files
                async fn create_file(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                    body: Multipart,
                ) -> Result<CreateFileResponse, String>;


                /// Creates a job that fine-tunes a specified model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) .
                ///
                /// CreateFineTune - POST /v1/fine-tunes
                async fn create_fine_tune(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                        body: models::CreateFineTuneRequest,
                ) -> Result<CreateFineTuneResponse, String>;


                /// Creates an image given a prompt..
                ///
                /// CreateImage - POST /v1/images/generations
                async fn create_image(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                        body: models::CreateImageRequest,
                ) -> Result<CreateImageResponse, String>;


                /// Creates an edited or extended image given an original image and a prompt..
                ///
                /// CreateImageEdit - POST /v1/images/edits
                async fn create_image_edit(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                    body: Multipart,
                ) -> Result<CreateImageEditResponse, String>;


                /// Creates a variation of a given image..
                ///
                /// CreateImageVariation - POST /v1/images/variations
                async fn create_image_variation(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                    body: Multipart,
                ) -> Result<CreateImageVariationResponse, String>;


                /// Classifies if text violates OpenAI's Content Policy.
                ///
                /// CreateModeration - POST /v1/moderations
                async fn create_moderation(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                        body: models::CreateModerationRequest,
                ) -> Result<CreateModerationResponse, String>;


                /// Transcribes audio into the input language..
                ///
                /// CreateTranscription - POST /v1/audio/transcriptions
                async fn create_transcription(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                    body: Multipart,
                ) -> Result<CreateTranscriptionResponse, String>;


                /// Translates audio into English..
                ///
                /// CreateTranslation - POST /v1/audio/translations
                async fn create_translation(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                    body: Multipart,
                ) -> Result<CreateTranslationResponse, String>;


                /// Delete a file..
                ///
                /// DeleteFile - DELETE /v1/files/{file_id}
                async fn delete_file(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::DeleteFilePathParams,
                ) -> Result<DeleteFileResponse, String>;


                /// Delete a fine-tuned model. You must have the Owner role in your organization..
                ///
                /// DeleteModel - DELETE /v1/models/{model}
                async fn delete_model(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::DeleteModelPathParams,
                ) -> Result<DeleteModelResponse, String>;


                /// Returns the contents of the specified file.
                ///
                /// DownloadFile - GET /v1/files/{file_id}/content
                async fn download_file(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::DownloadFilePathParams,
                ) -> Result<DownloadFileResponse, String>;


                /// Returns a list of files that belong to the user's organization..
                ///
                /// ListFiles - GET /v1/files
                async fn list_files(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                ) -> Result<ListFilesResponse, String>;


                /// Get fine-grained status updates for a fine-tune job. .
                ///
                /// ListFineTuneEvents - GET /v1/fine-tunes/{fine_tune_id}/events
                async fn list_fine_tune_events(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::ListFineTuneEventsPathParams,
                  query_params: models::ListFineTuneEventsQueryParams,
                ) -> Result<ListFineTuneEventsResponse, String>;


                /// List your organization's fine-tuning jobs .
                ///
                /// ListFineTunes - GET /v1/fine-tunes
                async fn list_fine_tunes(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                ) -> Result<ListFineTunesResponse, String>;


                /// Lists the currently available models, and provides basic information about each one such as the owner and availability..
                ///
                /// ListModels - GET /v1/models
                async fn list_models(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                ) -> Result<ListModelsResponse, String>;


                /// Returns information about a specific file..
                ///
                /// RetrieveFile - GET /v1/files/{file_id}
                async fn retrieve_file(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::RetrieveFilePathParams,
                ) -> Result<RetrieveFileResponse, String>;


                /// Gets info about the fine-tune job.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) .
                ///
                /// RetrieveFineTune - GET /v1/fine-tunes/{fine_tune_id}
                async fn retrieve_fine_tune(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::RetrieveFineTunePathParams,
                ) -> Result<RetrieveFineTuneResponse, String>;


                /// Retrieves a model instance, providing basic information about the model such as the owner and permissioning..
                ///
                /// RetrieveModel - GET /v1/models/{model}
                async fn retrieve_model(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::RetrieveModelPathParams,
                ) -> Result<RetrieveModelResponse, String>;

}

#[cfg(feature = "server")]
pub mod server;

pub mod models;
pub mod types;

#[cfg(feature = "server")]
pub(crate) mod header;
