#![allow(missing_docs, trivial_casts, unused_variables, unused_mut, unused_imports, unused_extern_crates, unused_attributes, non_camel_case_types)]
#![allow(clippy::derive_partial_eq_without_eq, clippy::disallowed_names)]

use async_trait::async_trait;
use futures::Stream;
#[cfg(feature = "mock")]
use mockall::automock;
use std::error::Error;
use std::collections::BTreeSet;
use std::task::{Poll, Context};
use swagger::{ApiError, ContextWrapper, auth::Authorization};
use serde::{Serialize, Deserialize};

#[cfg(any(feature = "client", feature = "server"))]
type ServiceError = Box<dyn Error + Send + Sync + 'static>;

pub const BASE_PATH: &str = "/v1";
pub const API_VERSION: &str = "2.0.0";

mod auth;
pub use auth::{AuthenticationApi, Claims};


#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum CreateAssistantResponse {
    /// OK
    OK
    (models::AssistantObject)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum CreateThreadResponse {
    /// OK
    OK
    (models::ThreadObject)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum CreateThreadAndRunResponse {
    /// OK
    OK
    (models::RunObject)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum ListAssistantsResponse {
    /// OK
    OK
    (models::ListAssistantsResponse)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum CreateAssistantFileResponse {
    /// OK
    OK
    (models::AssistantFileObject)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum CreateMessageResponse {
    /// OK
    OK
    (models::MessageObject)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum CreateRunResponse {
    /// OK
    OK
    (models::RunObject)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum DeleteAssistantResponse {
    /// OK
    OK
    (models::DeleteAssistantResponse)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum DeleteThreadResponse {
    /// OK
    OK
    (models::DeleteThreadResponse)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum GetAssistantResponse {
    /// OK
    OK
    (models::AssistantObject)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum GetThreadResponse {
    /// OK
    OK
    (models::ThreadObject)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum ListAssistantFilesResponse {
    /// OK
    OK
    (models::ListAssistantFilesResponse)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum ListMessagesResponse {
    /// OK
    OK
    (models::ListMessagesResponse)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum ListRunsResponse {
    /// OK
    OK
    (models::ListRunsResponse)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum ModifyAssistantResponse {
    /// OK
    OK
    (models::AssistantObject)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum ModifyThreadResponse {
    /// OK
    OK
    (models::ThreadObject)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum CancelRunResponse {
    /// OK
    OK
    (models::RunObject)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum DeleteAssistantFileResponse {
    /// OK
    OK
    (models::DeleteAssistantFileResponse)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum GetAssistantFileResponse {
    /// OK
    OK
    (models::AssistantFileObject)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum GetMessageResponse {
    /// OK
    OK
    (models::MessageObject)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum GetRunResponse {
    /// OK
    OK
    (models::RunObject)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum ListMessageFilesResponse {
    /// OK
    OK
    (models::ListMessageFilesResponse)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum ListRunStepsResponse {
    /// OK
    OK
    (models::ListRunStepsResponse)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum ModifyMessageResponse {
    /// OK
    OK
    (models::MessageObject)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum ModifyRunResponse {
    /// OK
    OK
    (models::RunObject)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum SubmitToolOuputsToRunResponse {
    /// OK
    OK
    (models::RunObject)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum GetMessageFileResponse {
    /// OK
    OK
    (models::MessageFileObject)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum GetRunStepResponse {
    /// OK
    OK
    (models::RunStepObject)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum CreateSpeechResponse {
    /// OK
    OK
    {
        body: swagger::ByteArray,
        transfer_encoding:
        Option<
        String
        >
    }
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum CreateTranscriptionResponse {
    /// OK
    OK
    (models::CreateTranscription200Response)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum CreateTranslationResponse {
    /// OK
    OK
    (models::CreateTranslation200Response)
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
pub enum ListFilesResponse {
    /// OK
    OK
    (models::ListFilesResponse)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum DeleteFileResponse {
    /// OK
    OK
    (models::DeleteFileResponse)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum DownloadFileResponse {
    /// OK
    OK
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum RetrieveFileResponse {
    /// OK
    OK
    (models::OpenAiFile)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum CreateFineTuningJobResponse {
    /// OK
    OK
    (models::FineTuningJob)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum ListPaginatedFineTuningJobsResponse {
    /// OK
    OK
    (models::ListPaginatedFineTuningJobsResponse)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum CancelFineTuningJobResponse {
    /// OK
    OK
    (models::FineTuningJob)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum ListFineTuningEventsResponse {
    /// OK
    OK
    (models::ListFineTuningJobEventsResponse)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum ListFineTuningJobCheckpointsResponse {
    /// OK
    OK
    (models::ListFineTuningJobCheckpointsResponse)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum RetrieveFineTuningJobResponse {
    /// OK
    OK
    (models::FineTuningJob)
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
pub enum ListModelsResponse {
    /// OK
    OK
    (models::ListModelsResponse)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum DeleteModelResponse {
    /// OK
    OK
    (models::DeleteModelResponse)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum RetrieveModelResponse {
    /// OK
    OK
    (models::Model)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum CreateModerationResponse {
    /// OK
    OK
    (models::CreateModerationResponse)
}

/// API
#[cfg_attr(feature = "mock", automock)]
#[async_trait]
#[allow(clippy::too_many_arguments, clippy::ptr_arg)]
pub trait Api<C: Send + Sync> {
    /// Create an assistant with a model and instructions.
    async fn create_assistant(
        &self,
        create_assistant_request: models::CreateAssistantRequest,
        context: &C) -> Result<CreateAssistantResponse, ApiError>;

    /// Create a thread.
    async fn create_thread(
        &self,
        create_thread_request: Option<models::CreateThreadRequest>,
        context: &C) -> Result<CreateThreadResponse, ApiError>;

    /// Create a thread and run it in one request.
    async fn create_thread_and_run(
        &self,
        create_thread_and_run_request: models::CreateThreadAndRunRequest,
        context: &C) -> Result<CreateThreadAndRunResponse, ApiError>;

    /// Returns a list of assistants.
    async fn list_assistants(
        &self,
        limit: Option<i32>,
        order: Option<models::ListAssistantsOrderParameter>,
        after: Option<String>,
        before: Option<String>,
        context: &C) -> Result<ListAssistantsResponse, ApiError>;

    /// Create an assistant file by attaching a [File](/docs/api-reference/files) to an [assistant](/docs/api-reference/assistants).
    async fn create_assistant_file(
        &self,
        assistant_id: String,
        create_assistant_file_request: models::CreateAssistantFileRequest,
        context: &C) -> Result<CreateAssistantFileResponse, ApiError>;

    /// Create a message.
    async fn create_message(
        &self,
        thread_id: String,
        create_message_request: models::CreateMessageRequest,
        context: &C) -> Result<CreateMessageResponse, ApiError>;

    /// Create a run.
    async fn create_run(
        &self,
        thread_id: String,
        create_run_request: models::CreateRunRequest,
        context: &C) -> Result<CreateRunResponse, ApiError>;

    /// Delete an assistant.
    async fn delete_assistant(
        &self,
        assistant_id: String,
        context: &C) -> Result<DeleteAssistantResponse, ApiError>;

    /// Delete a thread.
    async fn delete_thread(
        &self,
        thread_id: String,
        context: &C) -> Result<DeleteThreadResponse, ApiError>;

    /// Retrieves an assistant.
    async fn get_assistant(
        &self,
        assistant_id: String,
        context: &C) -> Result<GetAssistantResponse, ApiError>;

    /// Retrieves a thread.
    async fn get_thread(
        &self,
        thread_id: String,
        context: &C) -> Result<GetThreadResponse, ApiError>;

    /// Returns a list of assistant files.
    async fn list_assistant_files(
        &self,
        assistant_id: String,
        limit: Option<i32>,
        order: Option<models::ListAssistantsOrderParameter>,
        after: Option<String>,
        before: Option<String>,
        context: &C) -> Result<ListAssistantFilesResponse, ApiError>;

    /// Returns a list of messages for a given thread.
    async fn list_messages(
        &self,
        thread_id: String,
        limit: Option<i32>,
        order: Option<models::ListAssistantsOrderParameter>,
        after: Option<String>,
        before: Option<String>,
        run_id: Option<String>,
        context: &C) -> Result<ListMessagesResponse, ApiError>;

    /// Returns a list of runs belonging to a thread.
    async fn list_runs(
        &self,
        thread_id: String,
        limit: Option<i32>,
        order: Option<models::ListAssistantsOrderParameter>,
        after: Option<String>,
        before: Option<String>,
        context: &C) -> Result<ListRunsResponse, ApiError>;

    /// Modifies an assistant.
    async fn modify_assistant(
        &self,
        assistant_id: String,
        modify_assistant_request: models::ModifyAssistantRequest,
        context: &C) -> Result<ModifyAssistantResponse, ApiError>;

    /// Modifies a thread.
    async fn modify_thread(
        &self,
        thread_id: String,
        modify_thread_request: models::ModifyThreadRequest,
        context: &C) -> Result<ModifyThreadResponse, ApiError>;

    /// Cancels a run that is `in_progress`.
    async fn cancel_run(
        &self,
        thread_id: String,
        run_id: String,
        context: &C) -> Result<CancelRunResponse, ApiError>;

    /// Delete an assistant file.
    async fn delete_assistant_file(
        &self,
        assistant_id: String,
        file_id: String,
        context: &C) -> Result<DeleteAssistantFileResponse, ApiError>;

    /// Retrieves an AssistantFile.
    async fn get_assistant_file(
        &self,
        assistant_id: String,
        file_id: String,
        context: &C) -> Result<GetAssistantFileResponse, ApiError>;

    /// Retrieve a message.
    async fn get_message(
        &self,
        thread_id: String,
        message_id: String,
        context: &C) -> Result<GetMessageResponse, ApiError>;

    /// Retrieves a run.
    async fn get_run(
        &self,
        thread_id: String,
        run_id: String,
        context: &C) -> Result<GetRunResponse, ApiError>;

    /// Returns a list of message files.
    async fn list_message_files(
        &self,
        thread_id: String,
        message_id: String,
        limit: Option<i32>,
        order: Option<models::ListAssistantsOrderParameter>,
        after: Option<String>,
        before: Option<String>,
        context: &C) -> Result<ListMessageFilesResponse, ApiError>;

    /// Returns a list of run steps belonging to a run.
    async fn list_run_steps(
        &self,
        thread_id: String,
        run_id: String,
        limit: Option<i32>,
        order: Option<models::ListAssistantsOrderParameter>,
        after: Option<String>,
        before: Option<String>,
        context: &C) -> Result<ListRunStepsResponse, ApiError>;

    /// Modifies a message.
    async fn modify_message(
        &self,
        thread_id: String,
        message_id: String,
        modify_message_request: models::ModifyMessageRequest,
        context: &C) -> Result<ModifyMessageResponse, ApiError>;

    /// Modifies a run.
    async fn modify_run(
        &self,
        thread_id: String,
        run_id: String,
        modify_run_request: models::ModifyRunRequest,
        context: &C) -> Result<ModifyRunResponse, ApiError>;

    /// When a run has the `status: \"requires_action\"` and `required_action.type` is `submit_tool_outputs`, this endpoint can be used to submit the outputs from the tool calls once they're all completed. All outputs must be submitted in a single request. 
    async fn submit_tool_ouputs_to_run(
        &self,
        thread_id: String,
        run_id: String,
        submit_tool_outputs_run_request: models::SubmitToolOutputsRunRequest,
        context: &C) -> Result<SubmitToolOuputsToRunResponse, ApiError>;

    /// Retrieves a message file.
    async fn get_message_file(
        &self,
        thread_id: String,
        message_id: String,
        file_id: String,
        context: &C) -> Result<GetMessageFileResponse, ApiError>;

    /// Retrieves a run step.
    async fn get_run_step(
        &self,
        thread_id: String,
        run_id: String,
        step_id: String,
        context: &C) -> Result<GetRunStepResponse, ApiError>;

    /// Generates audio from the input text.
    async fn create_speech(
        &self,
        create_speech_request: models::CreateSpeechRequest,
        context: &C) -> Result<CreateSpeechResponse, ApiError>;

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

    /// Creates an embedding vector representing the input text.
    async fn create_embedding(
        &self,
        create_embedding_request: models::CreateEmbeddingRequest,
        context: &C) -> Result<CreateEmbeddingResponse, ApiError>;

    /// Upload a file that can be used across various endpoints. The size of all the files uploaded by one organization can be up to 100 GB.  The size of individual files can be a maximum of 512 MB or 2 million tokens for Assistants. See the [Assistants Tools guide](/docs/assistants/tools) to learn more about the types of files supported. The Fine-tuning API only supports `.jsonl` files.  Please [contact us](https://help.openai.com/) if you need to increase these storage limits. 
    async fn create_file(
        &self,
        file: swagger::ByteArray,
        purpose: models::CreateFileRequestPurpose,
        context: &C) -> Result<CreateFileResponse, ApiError>;

    /// Returns a list of files that belong to the user's organization.
    async fn list_files(
        &self,
        purpose: Option<String>,
        context: &C) -> Result<ListFilesResponse, ApiError>;

    /// Delete a file.
    async fn delete_file(
        &self,
        file_id: String,
        context: &C) -> Result<DeleteFileResponse, ApiError>;

    /// Returns the contents of the specified file.
    async fn download_file(
        &self,
        file_id: String,
        context: &C) -> Result<DownloadFileResponse, ApiError>;

    /// Returns information about a specific file.
    async fn retrieve_file(
        &self,
        file_id: String,
        context: &C) -> Result<RetrieveFileResponse, ApiError>;

    /// Creates a fine-tuning job which begins the process of creating a new model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 
    async fn create_fine_tuning_job(
        &self,
        create_fine_tuning_job_request: models::CreateFineTuningJobRequest,
        context: &C) -> Result<CreateFineTuningJobResponse, ApiError>;

    /// List your organization's fine-tuning jobs 
    async fn list_paginated_fine_tuning_jobs(
        &self,
        after: Option<String>,
        limit: Option<i32>,
        context: &C) -> Result<ListPaginatedFineTuningJobsResponse, ApiError>;

    /// Immediately cancel a fine-tune job. 
    async fn cancel_fine_tuning_job(
        &self,
        fine_tuning_job_id: String,
        context: &C) -> Result<CancelFineTuningJobResponse, ApiError>;

    /// Get status updates for a fine-tuning job. 
    async fn list_fine_tuning_events(
        &self,
        fine_tuning_job_id: String,
        after: Option<String>,
        limit: Option<i32>,
        context: &C) -> Result<ListFineTuningEventsResponse, ApiError>;

    /// List checkpoints for a fine-tuning job. 
    async fn list_fine_tuning_job_checkpoints(
        &self,
        fine_tuning_job_id: String,
        after: Option<String>,
        limit: Option<i32>,
        context: &C) -> Result<ListFineTuningJobCheckpointsResponse, ApiError>;

    /// Get info about a fine-tuning job.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 
    async fn retrieve_fine_tuning_job(
        &self,
        fine_tuning_job_id: String,
        context: &C) -> Result<RetrieveFineTuningJobResponse, ApiError>;

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
        model: Option<swagger::Nullable<models::CreateImageEditRequestModel>>,
        n: Option<swagger::Nullable<i32>>,
        size: Option<swagger::Nullable<models::CreateImageEditRequestSize>>,
        response_format: Option<swagger::Nullable<models::CreateImageRequestResponseFormat>>,
        user: Option<String>,
        context: &C) -> Result<CreateImageEditResponse, ApiError>;

    /// Creates a variation of a given image.
    async fn create_image_variation(
        &self,
        image: swagger::ByteArray,
        model: Option<swagger::Nullable<models::CreateImageEditRequestModel>>,
        n: Option<swagger::Nullable<i32>>,
        response_format: Option<swagger::Nullable<models::CreateImageRequestResponseFormat>>,
        size: Option<swagger::Nullable<models::CreateImageEditRequestSize>>,
        user: Option<String>,
        context: &C) -> Result<CreateImageVariationResponse, ApiError>;

    /// Lists the currently available models, and provides basic information about each one such as the owner and availability.
    async fn list_models(
        &self,
        context: &C) -> Result<ListModelsResponse, ApiError>;

    /// Delete a fine-tuned model. You must have the Owner role in your organization to delete a model.
    async fn delete_model(
        &self,
        model: String,
        context: &C) -> Result<DeleteModelResponse, ApiError>;

    /// Retrieves a model instance, providing basic information about the model such as the owner and permissioning.
    async fn retrieve_model(
        &self,
        model: String,
        context: &C) -> Result<RetrieveModelResponse, ApiError>;

    /// Classifies if text is potentially harmful.
    async fn create_moderation(
        &self,
        create_moderation_request: models::CreateModerationRequest,
        context: &C) -> Result<CreateModerationResponse, ApiError>;

}

/// API where `Context` isn't passed on every API call
#[cfg_attr(feature = "mock", automock)]
#[async_trait]
#[allow(clippy::too_many_arguments, clippy::ptr_arg)]
pub trait ApiNoContext<C: Send + Sync> {
    // The std::task::Context struct houses a reference to std::task::Waker with the lifetime <'a>.
    // Adding an anonymous lifetime `'a` to allow mockall to create a mock object with the right lifetimes.
    // This is needed because the compiler is unable to determine the lifetimes on F's trait bound
    // where F is the closure created by mockall. We use higher-rank trait bounds here to get around this.

    fn context(&self) -> &C;

    /// Create an assistant with a model and instructions.
    async fn create_assistant(
        &self,
        create_assistant_request: models::CreateAssistantRequest,
        ) -> Result<CreateAssistantResponse, ApiError>;

    /// Create a thread.
    async fn create_thread(
        &self,
        create_thread_request: Option<models::CreateThreadRequest>,
        ) -> Result<CreateThreadResponse, ApiError>;

    /// Create a thread and run it in one request.
    async fn create_thread_and_run(
        &self,
        create_thread_and_run_request: models::CreateThreadAndRunRequest,
        ) -> Result<CreateThreadAndRunResponse, ApiError>;

    /// Returns a list of assistants.
    async fn list_assistants(
        &self,
        limit: Option<i32>,
        order: Option<models::ListAssistantsOrderParameter>,
        after: Option<String>,
        before: Option<String>,
        ) -> Result<ListAssistantsResponse, ApiError>;

    /// Create an assistant file by attaching a [File](/docs/api-reference/files) to an [assistant](/docs/api-reference/assistants).
    async fn create_assistant_file(
        &self,
        assistant_id: String,
        create_assistant_file_request: models::CreateAssistantFileRequest,
        ) -> Result<CreateAssistantFileResponse, ApiError>;

    /// Create a message.
    async fn create_message(
        &self,
        thread_id: String,
        create_message_request: models::CreateMessageRequest,
        ) -> Result<CreateMessageResponse, ApiError>;

    /// Create a run.
    async fn create_run(
        &self,
        thread_id: String,
        create_run_request: models::CreateRunRequest,
        ) -> Result<CreateRunResponse, ApiError>;

    /// Delete an assistant.
    async fn delete_assistant(
        &self,
        assistant_id: String,
        ) -> Result<DeleteAssistantResponse, ApiError>;

    /// Delete a thread.
    async fn delete_thread(
        &self,
        thread_id: String,
        ) -> Result<DeleteThreadResponse, ApiError>;

    /// Retrieves an assistant.
    async fn get_assistant(
        &self,
        assistant_id: String,
        ) -> Result<GetAssistantResponse, ApiError>;

    /// Retrieves a thread.
    async fn get_thread(
        &self,
        thread_id: String,
        ) -> Result<GetThreadResponse, ApiError>;

    /// Returns a list of assistant files.
    async fn list_assistant_files(
        &self,
        assistant_id: String,
        limit: Option<i32>,
        order: Option<models::ListAssistantsOrderParameter>,
        after: Option<String>,
        before: Option<String>,
        ) -> Result<ListAssistantFilesResponse, ApiError>;

    /// Returns a list of messages for a given thread.
    async fn list_messages(
        &self,
        thread_id: String,
        limit: Option<i32>,
        order: Option<models::ListAssistantsOrderParameter>,
        after: Option<String>,
        before: Option<String>,
        run_id: Option<String>,
        ) -> Result<ListMessagesResponse, ApiError>;

    /// Returns a list of runs belonging to a thread.
    async fn list_runs(
        &self,
        thread_id: String,
        limit: Option<i32>,
        order: Option<models::ListAssistantsOrderParameter>,
        after: Option<String>,
        before: Option<String>,
        ) -> Result<ListRunsResponse, ApiError>;

    /// Modifies an assistant.
    async fn modify_assistant(
        &self,
        assistant_id: String,
        modify_assistant_request: models::ModifyAssistantRequest,
        ) -> Result<ModifyAssistantResponse, ApiError>;

    /// Modifies a thread.
    async fn modify_thread(
        &self,
        thread_id: String,
        modify_thread_request: models::ModifyThreadRequest,
        ) -> Result<ModifyThreadResponse, ApiError>;

    /// Cancels a run that is `in_progress`.
    async fn cancel_run(
        &self,
        thread_id: String,
        run_id: String,
        ) -> Result<CancelRunResponse, ApiError>;

    /// Delete an assistant file.
    async fn delete_assistant_file(
        &self,
        assistant_id: String,
        file_id: String,
        ) -> Result<DeleteAssistantFileResponse, ApiError>;

    /// Retrieves an AssistantFile.
    async fn get_assistant_file(
        &self,
        assistant_id: String,
        file_id: String,
        ) -> Result<GetAssistantFileResponse, ApiError>;

    /// Retrieve a message.
    async fn get_message(
        &self,
        thread_id: String,
        message_id: String,
        ) -> Result<GetMessageResponse, ApiError>;

    /// Retrieves a run.
    async fn get_run(
        &self,
        thread_id: String,
        run_id: String,
        ) -> Result<GetRunResponse, ApiError>;

    /// Returns a list of message files.
    async fn list_message_files(
        &self,
        thread_id: String,
        message_id: String,
        limit: Option<i32>,
        order: Option<models::ListAssistantsOrderParameter>,
        after: Option<String>,
        before: Option<String>,
        ) -> Result<ListMessageFilesResponse, ApiError>;

    /// Returns a list of run steps belonging to a run.
    async fn list_run_steps(
        &self,
        thread_id: String,
        run_id: String,
        limit: Option<i32>,
        order: Option<models::ListAssistantsOrderParameter>,
        after: Option<String>,
        before: Option<String>,
        ) -> Result<ListRunStepsResponse, ApiError>;

    /// Modifies a message.
    async fn modify_message(
        &self,
        thread_id: String,
        message_id: String,
        modify_message_request: models::ModifyMessageRequest,
        ) -> Result<ModifyMessageResponse, ApiError>;

    /// Modifies a run.
    async fn modify_run(
        &self,
        thread_id: String,
        run_id: String,
        modify_run_request: models::ModifyRunRequest,
        ) -> Result<ModifyRunResponse, ApiError>;

    /// When a run has the `status: \"requires_action\"` and `required_action.type` is `submit_tool_outputs`, this endpoint can be used to submit the outputs from the tool calls once they're all completed. All outputs must be submitted in a single request. 
    async fn submit_tool_ouputs_to_run(
        &self,
        thread_id: String,
        run_id: String,
        submit_tool_outputs_run_request: models::SubmitToolOutputsRunRequest,
        ) -> Result<SubmitToolOuputsToRunResponse, ApiError>;

    /// Retrieves a message file.
    async fn get_message_file(
        &self,
        thread_id: String,
        message_id: String,
        file_id: String,
        ) -> Result<GetMessageFileResponse, ApiError>;

    /// Retrieves a run step.
    async fn get_run_step(
        &self,
        thread_id: String,
        run_id: String,
        step_id: String,
        ) -> Result<GetRunStepResponse, ApiError>;

    /// Generates audio from the input text.
    async fn create_speech(
        &self,
        create_speech_request: models::CreateSpeechRequest,
        ) -> Result<CreateSpeechResponse, ApiError>;

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

    /// Creates an embedding vector representing the input text.
    async fn create_embedding(
        &self,
        create_embedding_request: models::CreateEmbeddingRequest,
        ) -> Result<CreateEmbeddingResponse, ApiError>;

    /// Upload a file that can be used across various endpoints. The size of all the files uploaded by one organization can be up to 100 GB.  The size of individual files can be a maximum of 512 MB or 2 million tokens for Assistants. See the [Assistants Tools guide](/docs/assistants/tools) to learn more about the types of files supported. The Fine-tuning API only supports `.jsonl` files.  Please [contact us](https://help.openai.com/) if you need to increase these storage limits. 
    async fn create_file(
        &self,
        file: swagger::ByteArray,
        purpose: models::CreateFileRequestPurpose,
        ) -> Result<CreateFileResponse, ApiError>;

    /// Returns a list of files that belong to the user's organization.
    async fn list_files(
        &self,
        purpose: Option<String>,
        ) -> Result<ListFilesResponse, ApiError>;

    /// Delete a file.
    async fn delete_file(
        &self,
        file_id: String,
        ) -> Result<DeleteFileResponse, ApiError>;

    /// Returns the contents of the specified file.
    async fn download_file(
        &self,
        file_id: String,
        ) -> Result<DownloadFileResponse, ApiError>;

    /// Returns information about a specific file.
    async fn retrieve_file(
        &self,
        file_id: String,
        ) -> Result<RetrieveFileResponse, ApiError>;

    /// Creates a fine-tuning job which begins the process of creating a new model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 
    async fn create_fine_tuning_job(
        &self,
        create_fine_tuning_job_request: models::CreateFineTuningJobRequest,
        ) -> Result<CreateFineTuningJobResponse, ApiError>;

    /// List your organization's fine-tuning jobs 
    async fn list_paginated_fine_tuning_jobs(
        &self,
        after: Option<String>,
        limit: Option<i32>,
        ) -> Result<ListPaginatedFineTuningJobsResponse, ApiError>;

    /// Immediately cancel a fine-tune job. 
    async fn cancel_fine_tuning_job(
        &self,
        fine_tuning_job_id: String,
        ) -> Result<CancelFineTuningJobResponse, ApiError>;

    /// Get status updates for a fine-tuning job. 
    async fn list_fine_tuning_events(
        &self,
        fine_tuning_job_id: String,
        after: Option<String>,
        limit: Option<i32>,
        ) -> Result<ListFineTuningEventsResponse, ApiError>;

    /// List checkpoints for a fine-tuning job. 
    async fn list_fine_tuning_job_checkpoints(
        &self,
        fine_tuning_job_id: String,
        after: Option<String>,
        limit: Option<i32>,
        ) -> Result<ListFineTuningJobCheckpointsResponse, ApiError>;

    /// Get info about a fine-tuning job.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 
    async fn retrieve_fine_tuning_job(
        &self,
        fine_tuning_job_id: String,
        ) -> Result<RetrieveFineTuningJobResponse, ApiError>;

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
        model: Option<swagger::Nullable<models::CreateImageEditRequestModel>>,
        n: Option<swagger::Nullable<i32>>,
        size: Option<swagger::Nullable<models::CreateImageEditRequestSize>>,
        response_format: Option<swagger::Nullable<models::CreateImageRequestResponseFormat>>,
        user: Option<String>,
        ) -> Result<CreateImageEditResponse, ApiError>;

    /// Creates a variation of a given image.
    async fn create_image_variation(
        &self,
        image: swagger::ByteArray,
        model: Option<swagger::Nullable<models::CreateImageEditRequestModel>>,
        n: Option<swagger::Nullable<i32>>,
        response_format: Option<swagger::Nullable<models::CreateImageRequestResponseFormat>>,
        size: Option<swagger::Nullable<models::CreateImageEditRequestSize>>,
        user: Option<String>,
        ) -> Result<CreateImageVariationResponse, ApiError>;

    /// Lists the currently available models, and provides basic information about each one such as the owner and availability.
    async fn list_models(
        &self,
        ) -> Result<ListModelsResponse, ApiError>;

    /// Delete a fine-tuned model. You must have the Owner role in your organization to delete a model.
    async fn delete_model(
        &self,
        model: String,
        ) -> Result<DeleteModelResponse, ApiError>;

    /// Retrieves a model instance, providing basic information about the model such as the owner and permissioning.
    async fn retrieve_model(
        &self,
        model: String,
        ) -> Result<RetrieveModelResponse, ApiError>;

    /// Classifies if text is potentially harmful.
    async fn create_moderation(
        &self,
        create_moderation_request: models::CreateModerationRequest,
        ) -> Result<CreateModerationResponse, ApiError>;

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
    fn context(&self) -> &C {
        ContextWrapper::context(self)
    }

    /// Create an assistant with a model and instructions.
    async fn create_assistant(
        &self,
        create_assistant_request: models::CreateAssistantRequest,
        ) -> Result<CreateAssistantResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().create_assistant(create_assistant_request, &context).await
    }

    /// Create a thread.
    async fn create_thread(
        &self,
        create_thread_request: Option<models::CreateThreadRequest>,
        ) -> Result<CreateThreadResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().create_thread(create_thread_request, &context).await
    }

    /// Create a thread and run it in one request.
    async fn create_thread_and_run(
        &self,
        create_thread_and_run_request: models::CreateThreadAndRunRequest,
        ) -> Result<CreateThreadAndRunResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().create_thread_and_run(create_thread_and_run_request, &context).await
    }

    /// Returns a list of assistants.
    async fn list_assistants(
        &self,
        limit: Option<i32>,
        order: Option<models::ListAssistantsOrderParameter>,
        after: Option<String>,
        before: Option<String>,
        ) -> Result<ListAssistantsResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().list_assistants(limit, order, after, before, &context).await
    }

    /// Create an assistant file by attaching a [File](/docs/api-reference/files) to an [assistant](/docs/api-reference/assistants).
    async fn create_assistant_file(
        &self,
        assistant_id: String,
        create_assistant_file_request: models::CreateAssistantFileRequest,
        ) -> Result<CreateAssistantFileResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().create_assistant_file(assistant_id, create_assistant_file_request, &context).await
    }

    /// Create a message.
    async fn create_message(
        &self,
        thread_id: String,
        create_message_request: models::CreateMessageRequest,
        ) -> Result<CreateMessageResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().create_message(thread_id, create_message_request, &context).await
    }

    /// Create a run.
    async fn create_run(
        &self,
        thread_id: String,
        create_run_request: models::CreateRunRequest,
        ) -> Result<CreateRunResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().create_run(thread_id, create_run_request, &context).await
    }

    /// Delete an assistant.
    async fn delete_assistant(
        &self,
        assistant_id: String,
        ) -> Result<DeleteAssistantResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().delete_assistant(assistant_id, &context).await
    }

    /// Delete a thread.
    async fn delete_thread(
        &self,
        thread_id: String,
        ) -> Result<DeleteThreadResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().delete_thread(thread_id, &context).await
    }

    /// Retrieves an assistant.
    async fn get_assistant(
        &self,
        assistant_id: String,
        ) -> Result<GetAssistantResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().get_assistant(assistant_id, &context).await
    }

    /// Retrieves a thread.
    async fn get_thread(
        &self,
        thread_id: String,
        ) -> Result<GetThreadResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().get_thread(thread_id, &context).await
    }

    /// Returns a list of assistant files.
    async fn list_assistant_files(
        &self,
        assistant_id: String,
        limit: Option<i32>,
        order: Option<models::ListAssistantsOrderParameter>,
        after: Option<String>,
        before: Option<String>,
        ) -> Result<ListAssistantFilesResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().list_assistant_files(assistant_id, limit, order, after, before, &context).await
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
        ) -> Result<ListMessagesResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().list_messages(thread_id, limit, order, after, before, run_id, &context).await
    }

    /// Returns a list of runs belonging to a thread.
    async fn list_runs(
        &self,
        thread_id: String,
        limit: Option<i32>,
        order: Option<models::ListAssistantsOrderParameter>,
        after: Option<String>,
        before: Option<String>,
        ) -> Result<ListRunsResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().list_runs(thread_id, limit, order, after, before, &context).await
    }

    /// Modifies an assistant.
    async fn modify_assistant(
        &self,
        assistant_id: String,
        modify_assistant_request: models::ModifyAssistantRequest,
        ) -> Result<ModifyAssistantResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().modify_assistant(assistant_id, modify_assistant_request, &context).await
    }

    /// Modifies a thread.
    async fn modify_thread(
        &self,
        thread_id: String,
        modify_thread_request: models::ModifyThreadRequest,
        ) -> Result<ModifyThreadResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().modify_thread(thread_id, modify_thread_request, &context).await
    }

    /// Cancels a run that is `in_progress`.
    async fn cancel_run(
        &self,
        thread_id: String,
        run_id: String,
        ) -> Result<CancelRunResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().cancel_run(thread_id, run_id, &context).await
    }

    /// Delete an assistant file.
    async fn delete_assistant_file(
        &self,
        assistant_id: String,
        file_id: String,
        ) -> Result<DeleteAssistantFileResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().delete_assistant_file(assistant_id, file_id, &context).await
    }

    /// Retrieves an AssistantFile.
    async fn get_assistant_file(
        &self,
        assistant_id: String,
        file_id: String,
        ) -> Result<GetAssistantFileResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().get_assistant_file(assistant_id, file_id, &context).await
    }

    /// Retrieve a message.
    async fn get_message(
        &self,
        thread_id: String,
        message_id: String,
        ) -> Result<GetMessageResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().get_message(thread_id, message_id, &context).await
    }

    /// Retrieves a run.
    async fn get_run(
        &self,
        thread_id: String,
        run_id: String,
        ) -> Result<GetRunResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().get_run(thread_id, run_id, &context).await
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
        ) -> Result<ListMessageFilesResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().list_message_files(thread_id, message_id, limit, order, after, before, &context).await
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
        ) -> Result<ListRunStepsResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().list_run_steps(thread_id, run_id, limit, order, after, before, &context).await
    }

    /// Modifies a message.
    async fn modify_message(
        &self,
        thread_id: String,
        message_id: String,
        modify_message_request: models::ModifyMessageRequest,
        ) -> Result<ModifyMessageResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().modify_message(thread_id, message_id, modify_message_request, &context).await
    }

    /// Modifies a run.
    async fn modify_run(
        &self,
        thread_id: String,
        run_id: String,
        modify_run_request: models::ModifyRunRequest,
        ) -> Result<ModifyRunResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().modify_run(thread_id, run_id, modify_run_request, &context).await
    }

    /// When a run has the `status: \"requires_action\"` and `required_action.type` is `submit_tool_outputs`, this endpoint can be used to submit the outputs from the tool calls once they're all completed. All outputs must be submitted in a single request. 
    async fn submit_tool_ouputs_to_run(
        &self,
        thread_id: String,
        run_id: String,
        submit_tool_outputs_run_request: models::SubmitToolOutputsRunRequest,
        ) -> Result<SubmitToolOuputsToRunResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().submit_tool_ouputs_to_run(thread_id, run_id, submit_tool_outputs_run_request, &context).await
    }

    /// Retrieves a message file.
    async fn get_message_file(
        &self,
        thread_id: String,
        message_id: String,
        file_id: String,
        ) -> Result<GetMessageFileResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().get_message_file(thread_id, message_id, file_id, &context).await
    }

    /// Retrieves a run step.
    async fn get_run_step(
        &self,
        thread_id: String,
        run_id: String,
        step_id: String,
        ) -> Result<GetRunStepResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().get_run_step(thread_id, run_id, step_id, &context).await
    }

    /// Generates audio from the input text.
    async fn create_speech(
        &self,
        create_speech_request: models::CreateSpeechRequest,
        ) -> Result<CreateSpeechResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().create_speech(create_speech_request, &context).await
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
        ) -> Result<CreateTranscriptionResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().create_transcription(file, model, language, prompt, response_format, temperature, timestamp_granularities_left_square_bracket_right_square_bracket, &context).await
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

    /// Creates an embedding vector representing the input text.
    async fn create_embedding(
        &self,
        create_embedding_request: models::CreateEmbeddingRequest,
        ) -> Result<CreateEmbeddingResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().create_embedding(create_embedding_request, &context).await
    }

    /// Upload a file that can be used across various endpoints. The size of all the files uploaded by one organization can be up to 100 GB.  The size of individual files can be a maximum of 512 MB or 2 million tokens for Assistants. See the [Assistants Tools guide](/docs/assistants/tools) to learn more about the types of files supported. The Fine-tuning API only supports `.jsonl` files.  Please [contact us](https://help.openai.com/) if you need to increase these storage limits. 
    async fn create_file(
        &self,
        file: swagger::ByteArray,
        purpose: models::CreateFileRequestPurpose,
        ) -> Result<CreateFileResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().create_file(file, purpose, &context).await
    }

    /// Returns a list of files that belong to the user's organization.
    async fn list_files(
        &self,
        purpose: Option<String>,
        ) -> Result<ListFilesResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().list_files(purpose, &context).await
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

    /// Returns the contents of the specified file.
    async fn download_file(
        &self,
        file_id: String,
        ) -> Result<DownloadFileResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().download_file(file_id, &context).await
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

    /// Creates a fine-tuning job which begins the process of creating a new model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 
    async fn create_fine_tuning_job(
        &self,
        create_fine_tuning_job_request: models::CreateFineTuningJobRequest,
        ) -> Result<CreateFineTuningJobResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().create_fine_tuning_job(create_fine_tuning_job_request, &context).await
    }

    /// List your organization's fine-tuning jobs 
    async fn list_paginated_fine_tuning_jobs(
        &self,
        after: Option<String>,
        limit: Option<i32>,
        ) -> Result<ListPaginatedFineTuningJobsResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().list_paginated_fine_tuning_jobs(after, limit, &context).await
    }

    /// Immediately cancel a fine-tune job. 
    async fn cancel_fine_tuning_job(
        &self,
        fine_tuning_job_id: String,
        ) -> Result<CancelFineTuningJobResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().cancel_fine_tuning_job(fine_tuning_job_id, &context).await
    }

    /// Get status updates for a fine-tuning job. 
    async fn list_fine_tuning_events(
        &self,
        fine_tuning_job_id: String,
        after: Option<String>,
        limit: Option<i32>,
        ) -> Result<ListFineTuningEventsResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().list_fine_tuning_events(fine_tuning_job_id, after, limit, &context).await
    }

    /// List checkpoints for a fine-tuning job. 
    async fn list_fine_tuning_job_checkpoints(
        &self,
        fine_tuning_job_id: String,
        after: Option<String>,
        limit: Option<i32>,
        ) -> Result<ListFineTuningJobCheckpointsResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().list_fine_tuning_job_checkpoints(fine_tuning_job_id, after, limit, &context).await
    }

    /// Get info about a fine-tuning job.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 
    async fn retrieve_fine_tuning_job(
        &self,
        fine_tuning_job_id: String,
        ) -> Result<RetrieveFineTuningJobResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().retrieve_fine_tuning_job(fine_tuning_job_id, &context).await
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
        model: Option<swagger::Nullable<models::CreateImageEditRequestModel>>,
        n: Option<swagger::Nullable<i32>>,
        size: Option<swagger::Nullable<models::CreateImageEditRequestSize>>,
        response_format: Option<swagger::Nullable<models::CreateImageRequestResponseFormat>>,
        user: Option<String>,
        ) -> Result<CreateImageEditResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().create_image_edit(image, prompt, mask, model, n, size, response_format, user, &context).await
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
        ) -> Result<CreateImageVariationResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().create_image_variation(image, model, n, response_format, size, user, &context).await
    }

    /// Lists the currently available models, and provides basic information about each one such as the owner and availability.
    async fn list_models(
        &self,
        ) -> Result<ListModelsResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().list_models(&context).await
    }

    /// Delete a fine-tuned model. You must have the Owner role in your organization to delete a model.
    async fn delete_model(
        &self,
        model: String,
        ) -> Result<DeleteModelResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().delete_model(model, &context).await
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

    /// Classifies if text is potentially harmful.
    async fn create_moderation(
        &self,
        create_moderation_request: models::CreateModerationRequest,
        ) -> Result<CreateModerationResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().create_moderation(create_moderation_request, &context).await
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
