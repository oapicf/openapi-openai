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
pub enum CancelRunResponse {
    /// OK
    Status200_OK
    (models::RunObject)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum CreateAssistantResponse {
    /// OK
    Status200_OK
    (models::AssistantObject)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum CreateAssistantFileResponse {
    /// OK
    Status200_OK
    (models::AssistantFileObject)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum CreateMessageResponse {
    /// OK
    Status200_OK
    (models::MessageObject)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum CreateRunResponse {
    /// OK
    Status200_OK
    (models::RunObject)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum CreateThreadResponse {
    /// OK
    Status200_OK
    (models::ThreadObject)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum CreateThreadAndRunResponse {
    /// OK
    Status200_OK
    (models::RunObject)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum DeleteAssistantResponse {
    /// OK
    Status200_OK
    (models::DeleteAssistantResponse)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum DeleteAssistantFileResponse {
    /// OK
    Status200_OK
    (models::DeleteAssistantFileResponse)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum DeleteThreadResponse {
    /// OK
    Status200_OK
    (models::DeleteThreadResponse)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum GetAssistantResponse {
    /// OK
    Status200_OK
    (models::AssistantObject)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum GetAssistantFileResponse {
    /// OK
    Status200_OK
    (models::AssistantFileObject)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum GetMessageResponse {
    /// OK
    Status200_OK
    (models::MessageObject)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum GetMessageFileResponse {
    /// OK
    Status200_OK
    (models::MessageFileObject)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum GetRunResponse {
    /// OK
    Status200_OK
    (models::RunObject)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum GetRunStepResponse {
    /// OK
    Status200_OK
    (models::RunStepObject)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum GetThreadResponse {
    /// OK
    Status200_OK
    (models::ThreadObject)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ListAssistantFilesResponse {
    /// OK
    Status200_OK
    (models::ListAssistantFilesResponse)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ListAssistantsResponse {
    /// OK
    Status200_OK
    (models::ListAssistantsResponse)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ListMessageFilesResponse {
    /// OK
    Status200_OK
    (models::ListMessageFilesResponse)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ListMessagesResponse {
    /// OK
    Status200_OK
    (models::ListMessagesResponse)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ListRunStepsResponse {
    /// OK
    Status200_OK
    (models::ListRunStepsResponse)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ListRunsResponse {
    /// OK
    Status200_OK
    (models::ListRunsResponse)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ModifyAssistantResponse {
    /// OK
    Status200_OK
    (models::AssistantObject)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ModifyMessageResponse {
    /// OK
    Status200_OK
    (models::MessageObject)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ModifyRunResponse {
    /// OK
    Status200_OK
    (models::RunObject)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ModifyThreadResponse {
    /// OK
    Status200_OK
    (models::ThreadObject)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum SubmitToolOuputsToRunResponse {
    /// OK
    Status200_OK
    (models::RunObject)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum CreateSpeechResponse {
    /// OK
    Status200_OK
    {
        body: ByteArray,
        transfer_encoding:
        Option<
        String
        >
    }
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum CreateTranscriptionResponse {
    /// OK
    Status200_OK
    (models::CreateTranscription200Response)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum CreateTranslationResponse {
    /// OK
    Status200_OK
    (models::CreateTranslation200Response)
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
pub enum DeleteFileResponse {
    /// OK
    Status200_OK
    (models::DeleteFileResponse)
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
pub enum RetrieveFileResponse {
    /// OK
    Status200_OK
    (models::OpenAiFile)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum CancelFineTuningJobResponse {
    /// OK
    Status200_OK
    (models::FineTuningJob)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum CreateFineTuningJobResponse {
    /// OK
    Status200_OK
    (models::FineTuningJob)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ListFineTuningEventsResponse {
    /// OK
    Status200_OK
    (models::ListFineTuningJobEventsResponse)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ListFineTuningJobCheckpointsResponse {
    /// OK
    Status200_OK
    (models::ListFineTuningJobCheckpointsResponse)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ListPaginatedFineTuningJobsResponse {
    /// OK
    Status200_OK
    (models::ListPaginatedFineTuningJobsResponse)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum RetrieveFineTuningJobResponse {
    /// OK
    Status200_OK
    (models::FineTuningJob)
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
pub enum DeleteModelResponse {
    /// OK
    Status200_OK
    (models::DeleteModelResponse)
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
pub enum RetrieveModelResponse {
    /// OK
    Status200_OK
    (models::Model)
}

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum CreateModerationResponse {
    /// OK
    Status200_OK
    (models::CreateModerationResponse)
}


/// API
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait Api {

                /// Cancels a run that is `in_progress`..
                ///
                /// CancelRun - POST /v1/threads/{thread_id}/runs/{run_id}/cancel
                async fn cancel_run(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::CancelRunPathParams,
                ) -> Result<CancelRunResponse, String>;


                /// Create an assistant with a model and instructions..
                ///
                /// CreateAssistant - POST /v1/assistants
                async fn create_assistant(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                        body: models::CreateAssistantRequest,
                ) -> Result<CreateAssistantResponse, String>;


                /// Create an assistant file by attaching a [File](/docs/api-reference/files) to an [assistant](/docs/api-reference/assistants)..
                ///
                /// CreateAssistantFile - POST /v1/assistants/{assistant_id}/files
                async fn create_assistant_file(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::CreateAssistantFilePathParams,
                        body: models::CreateAssistantFileRequest,
                ) -> Result<CreateAssistantFileResponse, String>;


                /// Create a message..
                ///
                /// CreateMessage - POST /v1/threads/{thread_id}/messages
                async fn create_message(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::CreateMessagePathParams,
                        body: models::CreateMessageRequest,
                ) -> Result<CreateMessageResponse, String>;


                /// Create a run..
                ///
                /// CreateRun - POST /v1/threads/{thread_id}/runs
                async fn create_run(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::CreateRunPathParams,
                        body: models::CreateRunRequest,
                ) -> Result<CreateRunResponse, String>;


                /// Create a thread..
                ///
                /// CreateThread - POST /v1/threads
                async fn create_thread(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                        body: Option<models::CreateThreadRequest>,
                ) -> Result<CreateThreadResponse, String>;


                /// Create a thread and run it in one request..
                ///
                /// CreateThreadAndRun - POST /v1/threads/runs
                async fn create_thread_and_run(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                        body: models::CreateThreadAndRunRequest,
                ) -> Result<CreateThreadAndRunResponse, String>;


                /// Delete an assistant..
                ///
                /// DeleteAssistant - DELETE /v1/assistants/{assistant_id}
                async fn delete_assistant(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::DeleteAssistantPathParams,
                ) -> Result<DeleteAssistantResponse, String>;


                /// Delete an assistant file..
                ///
                /// DeleteAssistantFile - DELETE /v1/assistants/{assistant_id}/files/{file_id}
                async fn delete_assistant_file(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::DeleteAssistantFilePathParams,
                ) -> Result<DeleteAssistantFileResponse, String>;


                /// Delete a thread..
                ///
                /// DeleteThread - DELETE /v1/threads/{thread_id}
                async fn delete_thread(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::DeleteThreadPathParams,
                ) -> Result<DeleteThreadResponse, String>;


                /// Retrieves an assistant..
                ///
                /// GetAssistant - GET /v1/assistants/{assistant_id}
                async fn get_assistant(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::GetAssistantPathParams,
                ) -> Result<GetAssistantResponse, String>;


                /// Retrieves an AssistantFile..
                ///
                /// GetAssistantFile - GET /v1/assistants/{assistant_id}/files/{file_id}
                async fn get_assistant_file(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::GetAssistantFilePathParams,
                ) -> Result<GetAssistantFileResponse, String>;


                /// Retrieve a message..
                ///
                /// GetMessage - GET /v1/threads/{thread_id}/messages/{message_id}
                async fn get_message(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::GetMessagePathParams,
                ) -> Result<GetMessageResponse, String>;


                /// Retrieves a message file..
                ///
                /// GetMessageFile - GET /v1/threads/{thread_id}/messages/{message_id}/files/{file_id}
                async fn get_message_file(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::GetMessageFilePathParams,
                ) -> Result<GetMessageFileResponse, String>;


                /// Retrieves a run..
                ///
                /// GetRun - GET /v1/threads/{thread_id}/runs/{run_id}
                async fn get_run(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::GetRunPathParams,
                ) -> Result<GetRunResponse, String>;


                /// Retrieves a run step..
                ///
                /// GetRunStep - GET /v1/threads/{thread_id}/runs/{run_id}/steps/{step_id}
                async fn get_run_step(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::GetRunStepPathParams,
                ) -> Result<GetRunStepResponse, String>;


                /// Retrieves a thread..
                ///
                /// GetThread - GET /v1/threads/{thread_id}
                async fn get_thread(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::GetThreadPathParams,
                ) -> Result<GetThreadResponse, String>;


                /// Returns a list of assistant files..
                ///
                /// ListAssistantFiles - GET /v1/assistants/{assistant_id}/files
                async fn list_assistant_files(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::ListAssistantFilesPathParams,
                  query_params: models::ListAssistantFilesQueryParams,
                ) -> Result<ListAssistantFilesResponse, String>;


                /// Returns a list of assistants..
                ///
                /// ListAssistants - GET /v1/assistants
                async fn list_assistants(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  query_params: models::ListAssistantsQueryParams,
                ) -> Result<ListAssistantsResponse, String>;


                /// Returns a list of message files..
                ///
                /// ListMessageFiles - GET /v1/threads/{thread_id}/messages/{message_id}/files
                async fn list_message_files(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::ListMessageFilesPathParams,
                  query_params: models::ListMessageFilesQueryParams,
                ) -> Result<ListMessageFilesResponse, String>;


                /// Returns a list of messages for a given thread..
                ///
                /// ListMessages - GET /v1/threads/{thread_id}/messages
                async fn list_messages(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::ListMessagesPathParams,
                  query_params: models::ListMessagesQueryParams,
                ) -> Result<ListMessagesResponse, String>;


                /// Returns a list of run steps belonging to a run..
                ///
                /// ListRunSteps - GET /v1/threads/{thread_id}/runs/{run_id}/steps
                async fn list_run_steps(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::ListRunStepsPathParams,
                  query_params: models::ListRunStepsQueryParams,
                ) -> Result<ListRunStepsResponse, String>;


                /// Returns a list of runs belonging to a thread..
                ///
                /// ListRuns - GET /v1/threads/{thread_id}/runs
                async fn list_runs(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::ListRunsPathParams,
                  query_params: models::ListRunsQueryParams,
                ) -> Result<ListRunsResponse, String>;


                /// Modifies an assistant..
                ///
                /// ModifyAssistant - POST /v1/assistants/{assistant_id}
                async fn modify_assistant(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::ModifyAssistantPathParams,
                        body: models::ModifyAssistantRequest,
                ) -> Result<ModifyAssistantResponse, String>;


                /// Modifies a message..
                ///
                /// ModifyMessage - POST /v1/threads/{thread_id}/messages/{message_id}
                async fn modify_message(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::ModifyMessagePathParams,
                        body: models::ModifyMessageRequest,
                ) -> Result<ModifyMessageResponse, String>;


                /// Modifies a run..
                ///
                /// ModifyRun - POST /v1/threads/{thread_id}/runs/{run_id}
                async fn modify_run(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::ModifyRunPathParams,
                        body: models::ModifyRunRequest,
                ) -> Result<ModifyRunResponse, String>;


                /// Modifies a thread..
                ///
                /// ModifyThread - POST /v1/threads/{thread_id}
                async fn modify_thread(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::ModifyThreadPathParams,
                        body: models::ModifyThreadRequest,
                ) -> Result<ModifyThreadResponse, String>;


                /// When a run has the `status: \"requires_action\"` and `required_action.type` is `submit_tool_outputs`, this endpoint can be used to submit the outputs from the tool calls once they're all completed. All outputs must be submitted in a single request. .
                ///
                /// SubmitToolOuputsToRun - POST /v1/threads/{thread_id}/runs/{run_id}/submit_tool_outputs
                async fn submit_tool_ouputs_to_run(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::SubmitToolOuputsToRunPathParams,
                        body: models::SubmitToolOutputsRunRequest,
                ) -> Result<SubmitToolOuputsToRunResponse, String>;


                /// Generates audio from the input text..
                ///
                /// CreateSpeech - POST /v1/audio/speech
                async fn create_speech(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                        body: models::CreateSpeechRequest,
                ) -> Result<CreateSpeechResponse, String>;


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


                /// Upload a file that can be used across various endpoints. The size of all the files uploaded by one organization can be up to 100 GB.  The size of individual files can be a maximum of 512 MB or 2 million tokens for Assistants. See the [Assistants Tools guide](/docs/assistants/tools) to learn more about the types of files supported. The Fine-tuning API only supports `.jsonl` files.  Please [contact us](https://help.openai.com/) if you need to increase these storage limits. .
                ///
                /// CreateFile - POST /v1/files
                async fn create_file(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                    body: Multipart,
                ) -> Result<CreateFileResponse, String>;


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


                /// Returns the contents of the specified file..
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
                  query_params: models::ListFilesQueryParams,
                ) -> Result<ListFilesResponse, String>;


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


                /// Immediately cancel a fine-tune job. .
                ///
                /// CancelFineTuningJob - POST /v1/fine_tuning/jobs/{fine_tuning_job_id}/cancel
                async fn cancel_fine_tuning_job(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::CancelFineTuningJobPathParams,
                ) -> Result<CancelFineTuningJobResponse, String>;


                /// Creates a fine-tuning job which begins the process of creating a new model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about fine-tuning](/docs/guides/fine-tuning) .
                ///
                /// CreateFineTuningJob - POST /v1/fine_tuning/jobs
                async fn create_fine_tuning_job(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                        body: models::CreateFineTuningJobRequest,
                ) -> Result<CreateFineTuningJobResponse, String>;


                /// Get status updates for a fine-tuning job. .
                ///
                /// ListFineTuningEvents - GET /v1/fine_tuning/jobs/{fine_tuning_job_id}/events
                async fn list_fine_tuning_events(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::ListFineTuningEventsPathParams,
                  query_params: models::ListFineTuningEventsQueryParams,
                ) -> Result<ListFineTuningEventsResponse, String>;


                /// List checkpoints for a fine-tuning job. .
                ///
                /// ListFineTuningJobCheckpoints - GET /v1/fine_tuning/jobs/{fine_tuning_job_id}/checkpoints
                async fn list_fine_tuning_job_checkpoints(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::ListFineTuningJobCheckpointsPathParams,
                  query_params: models::ListFineTuningJobCheckpointsQueryParams,
                ) -> Result<ListFineTuningJobCheckpointsResponse, String>;


                /// List your organization's fine-tuning jobs .
                ///
                /// ListPaginatedFineTuningJobs - GET /v1/fine_tuning/jobs
                async fn list_paginated_fine_tuning_jobs(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  query_params: models::ListPaginatedFineTuningJobsQueryParams,
                ) -> Result<ListPaginatedFineTuningJobsResponse, String>;


                /// Get info about a fine-tuning job.  [Learn more about fine-tuning](/docs/guides/fine-tuning) .
                ///
                /// RetrieveFineTuningJob - GET /v1/fine_tuning/jobs/{fine_tuning_job_id}
                async fn retrieve_fine_tuning_job(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::RetrieveFineTuningJobPathParams,
                ) -> Result<RetrieveFineTuningJobResponse, String>;


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


                /// Delete a fine-tuned model. You must have the Owner role in your organization to delete a model..
                ///
                /// DeleteModel - DELETE /v1/models/{model}
                async fn delete_model(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::DeleteModelPathParams,
                ) -> Result<DeleteModelResponse, String>;


                /// Lists the currently available models, and provides basic information about each one such as the owner and availability..
                ///
                /// ListModels - GET /v1/models
                async fn list_models(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                ) -> Result<ListModelsResponse, String>;


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


                /// Classifies if text is potentially harmful..
                ///
                /// CreateModeration - POST /v1/moderations
                async fn create_moderation(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                        body: models::CreateModerationRequest,
                ) -> Result<CreateModerationResponse, String>;

}

#[cfg(feature = "server")]
pub mod server;

pub mod models;
pub mod types;

#[cfg(feature = "server")]
pub(crate) mod header;
