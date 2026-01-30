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
pub const API_VERSION: &str = "2.3.0";

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
pub enum DeleteMessageResponse {
    /// OK
    OK
    (models::DeleteMessageResponse)
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
pub enum ListAuditLogsResponse {
    /// Audit logs listed successfully.
    AuditLogsListedSuccessfully
    (models::ListAuditLogsResponse)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum CreateBatchResponse {
    /// Batch created successfully.
    BatchCreatedSuccessfully
    (models::Batch)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum ListBatchesResponse {
    /// Batch listed successfully.
    BatchListedSuccessfully
    (models::ListBatchesResponse)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum CancelBatchResponse {
    /// Batch is cancelling. Returns the cancelling batch's details.
    BatchIsCancelling
    (models::Batch)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum RetrieveBatchResponse {
    /// Batch retrieved successfully.
    BatchRetrievedSuccessfully
    (models::Batch)
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
pub enum AdminApiKeysCreateResponse {
    /// The newly created admin API key.
    TheNewlyCreatedAdminAPIKey
    (models::AdminApiKey)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum AdminApiKeysListResponse {
    /// A list of organization API keys.
    AListOfOrganizationAPIKeys
    (models::ApiKeyList)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum AdminApiKeysDeleteResponse {
    /// Confirmation that the API key was deleted.
    ConfirmationThatTheAPIKeyWasDeleted
    (models::AdminApiKeysDelete200Response)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum AdminApiKeysGetResponse {
    /// Details of the requested API key.
    DetailsOfTheRequestedAPIKey
    (models::AdminApiKey)
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
pub enum InviteUserResponse {
    /// User invited successfully.
    UserInvitedSuccessfully
    (models::Invite)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum ListInvitesResponse {
    /// Invites listed successfully.
    InvitesListedSuccessfully
    (models::InviteListResponse)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum DeleteInviteResponse {
    /// Invite deleted successfully.
    InviteDeletedSuccessfully
    (models::InviteDeleteResponse)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum RetrieveInviteResponse {
    /// Invite retrieved successfully.
    InviteRetrievedSuccessfully
    (models::Invite)
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

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum CreateProjectResponse {
    /// Project created successfully.
    ProjectCreatedSuccessfully
    (models::Project)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum ListProjectsResponse {
    /// Projects listed successfully.
    ProjectsListedSuccessfully
    (models::ProjectListResponse)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum ArchiveProjectResponse {
    /// Project archived successfully.
    ProjectArchivedSuccessfully
    (models::Project)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum CreateProjectServiceAccountResponse {
    /// Project service account created successfully.
    ProjectServiceAccountCreatedSuccessfully
    (models::ProjectServiceAccountCreateResponse)
    ,
    /// Error response when project is archived.
    ErrorResponseWhenProjectIsArchived
    (models::ErrorResponse)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum CreateProjectUserResponse {
    /// User added to project successfully.
    UserAddedToProjectSuccessfully
    (models::ProjectUser)
    ,
    /// Error response for various conditions.
    ErrorResponseForVariousConditions
    (models::ErrorResponse)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum ListProjectApiKeysResponse {
    /// Project API keys listed successfully.
    ProjectAPIKeysListedSuccessfully
    (models::ProjectApiKeyListResponse)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum ListProjectRateLimitsResponse {
    /// Project rate limits listed successfully.
    ProjectRateLimitsListedSuccessfully
    (models::ProjectRateLimitListResponse)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum ListProjectServiceAccountsResponse {
    /// Project service accounts listed successfully.
    ProjectServiceAccountsListedSuccessfully
    (models::ProjectServiceAccountListResponse)
    ,
    /// Error response when project is archived.
    ErrorResponseWhenProjectIsArchived
    (models::ErrorResponse)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum ListProjectUsersResponse {
    /// Project users listed successfully.
    ProjectUsersListedSuccessfully
    (models::ProjectUserListResponse)
    ,
    /// Error response when project is archived.
    ErrorResponseWhenProjectIsArchived
    (models::ErrorResponse)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum ModifyProjectResponse {
    /// Project updated successfully.
    ProjectUpdatedSuccessfully
    (models::Project)
    ,
    /// Error response when updating the default project.
    ErrorResponseWhenUpdatingTheDefaultProject
    (models::ErrorResponse)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum RetrieveProjectResponse {
    /// Project retrieved successfully.
    ProjectRetrievedSuccessfully
    (models::Project)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum DeleteProjectApiKeyResponse {
    /// Project API key deleted successfully.
    ProjectAPIKeyDeletedSuccessfully
    (models::ProjectApiKeyDeleteResponse)
    ,
    /// Error response for various conditions.
    ErrorResponseForVariousConditions
    (models::ErrorResponse)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum DeleteProjectServiceAccountResponse {
    /// Project service account deleted successfully.
    ProjectServiceAccountDeletedSuccessfully
    (models::ProjectServiceAccountDeleteResponse)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum DeleteProjectUserResponse {
    /// Project user deleted successfully.
    ProjectUserDeletedSuccessfully
    (models::ProjectUserDeleteResponse)
    ,
    /// Error response for various conditions.
    ErrorResponseForVariousConditions
    (models::ErrorResponse)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum ModifyProjectUserResponse {
    /// Project user's role updated successfully.
    ProjectUser
    (models::ProjectUser)
    ,
    /// Error response for various conditions.
    ErrorResponseForVariousConditions
    (models::ErrorResponse)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum RetrieveProjectApiKeyResponse {
    /// Project API key retrieved successfully.
    ProjectAPIKeyRetrievedSuccessfully
    (models::ProjectApiKey)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum RetrieveProjectServiceAccountResponse {
    /// Project service account retrieved successfully.
    ProjectServiceAccountRetrievedSuccessfully
    (models::ProjectServiceAccount)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum RetrieveProjectUserResponse {
    /// Project user retrieved successfully.
    ProjectUserRetrievedSuccessfully
    (models::ProjectUser)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
pub enum UpdateProjectRateLimitsResponse {
    /// Project rate limit updated successfully.
    ProjectRateLimitUpdatedSuccessfully
    (models::ProjectRateLimit)
    ,
    /// Error response for various conditions.
    ErrorResponseForVariousConditions
    (models::ErrorResponse)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum CreateRealtimeSessionResponse {
    /// Session created successfully.
    SessionCreatedSuccessfully
    (models::RealtimeSessionCreateResponse)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum CreateUploadResponse {
    /// OK
    OK
    (models::Upload)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum AddUploadPartResponse {
    /// OK
    OK
    (models::UploadPart)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum CancelUploadResponse {
    /// OK
    OK
    (models::Upload)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum CompleteUploadResponse {
    /// OK
    OK
    (models::Upload)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum UsageAudioSpeechesResponse {
    /// Usage data retrieved successfully.
    UsageDataRetrievedSuccessfully
    (models::UsageResponse)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum UsageAudioTranscriptionsResponse {
    /// Usage data retrieved successfully.
    UsageDataRetrievedSuccessfully
    (models::UsageResponse)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum UsageCodeInterpreterSessionsResponse {
    /// Usage data retrieved successfully.
    UsageDataRetrievedSuccessfully
    (models::UsageResponse)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum UsageCompletionsResponse {
    /// Usage data retrieved successfully.
    UsageDataRetrievedSuccessfully
    (models::UsageResponse)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum UsageCostsResponse {
    /// Costs data retrieved successfully.
    CostsDataRetrievedSuccessfully
    (models::UsageResponse)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum UsageEmbeddingsResponse {
    /// Usage data retrieved successfully.
    UsageDataRetrievedSuccessfully
    (models::UsageResponse)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum UsageImagesResponse {
    /// Usage data retrieved successfully.
    UsageDataRetrievedSuccessfully
    (models::UsageResponse)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum UsageModerationsResponse {
    /// Usage data retrieved successfully.
    UsageDataRetrievedSuccessfully
    (models::UsageResponse)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum UsageVectorStoresResponse {
    /// Usage data retrieved successfully.
    UsageDataRetrievedSuccessfully
    (models::UsageResponse)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum ListUsersResponse {
    /// Users listed successfully.
    UsersListedSuccessfully
    (models::UserListResponse)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum DeleteUserResponse {
    /// User deleted successfully.
    UserDeletedSuccessfully
    (models::UserDeleteResponse)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum ModifyUserResponse {
    /// User role updated successfully.
    UserRoleUpdatedSuccessfully
    (models::User)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum RetrieveUserResponse {
    /// User retrieved successfully.
    UserRetrievedSuccessfully
    (models::User)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum CreateVectorStoreResponse {
    /// OK
    OK
    (models::VectorStoreObject)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum ListVectorStoresResponse {
    /// OK
    OK
    (models::ListVectorStoresResponse)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum CreateVectorStoreFileResponse {
    /// OK
    OK
    (models::VectorStoreFileObject)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum CreateVectorStoreFileBatchResponse {
    /// OK
    OK
    (models::VectorStoreFileBatchObject)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum DeleteVectorStoreResponse {
    /// OK
    OK
    (models::DeleteVectorStoreResponse)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum GetVectorStoreResponse {
    /// OK
    OK
    (models::VectorStoreObject)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum ListVectorStoreFilesResponse {
    /// OK
    OK
    (models::ListVectorStoreFilesResponse)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum ModifyVectorStoreResponse {
    /// OK
    OK
    (models::VectorStoreObject)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum CancelVectorStoreFileBatchResponse {
    /// OK
    OK
    (models::VectorStoreFileBatchObject)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum DeleteVectorStoreFileResponse {
    /// OK
    OK
    (models::DeleteVectorStoreFileResponse)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum GetVectorStoreFileResponse {
    /// OK
    OK
    (models::VectorStoreFileObject)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum GetVectorStoreFileBatchResponse {
    /// OK
    OK
    (models::VectorStoreFileBatchObject)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum ListFilesInVectorStoreBatchResponse {
    /// OK
    OK
    (models::ListVectorStoreFilesResponse)
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

    /// Create a message.
    async fn create_message(
        &self,
        thread_id: String,
        create_message_request: models::CreateMessageRequest,
        context: &C) -> Result<CreateMessageResponse, ApiError>;

    /// Create a run.
    async fn create_run<'a>(
        &self,
        thread_id: String,
        create_run_request: models::CreateRunRequest,
        include_left_square_bracket_right_square_bracket: Option<&'a Vec<models::CreateRunIncludeParameterInner>>,
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

    /// Deletes a message.
    async fn delete_message(
        &self,
        thread_id: String,
        message_id: String,
        context: &C) -> Result<DeleteMessageResponse, ApiError>;

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

    /// Retrieves a run step.
    async fn get_run_step<'a>(
        &self,
        thread_id: String,
        run_id: String,
        step_id: String,
        include_left_square_bracket_right_square_bracket: Option<&'a Vec<models::CreateRunIncludeParameterInner>>,
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
        response_format: Option<models::AudioResponseFormat>,
        temperature: Option<f64>,
        timestamp_granularities_left_square_bracket_right_square_bracket: Option<&'a Vec<models::CreateTranscriptionRequestTimestampGranularitiesInner>>,
        context: &C) -> Result<CreateTranscriptionResponse, ApiError>;

    /// Translates audio into English.
    async fn create_translation(
        &self,
        file: swagger::ByteArray,
        model: models::CreateTranscriptionRequestModel,
        prompt: Option<String>,
        response_format: Option<models::AudioResponseFormat>,
        temperature: Option<f64>,
        context: &C) -> Result<CreateTranslationResponse, ApiError>;

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
        context: &C) -> Result<ListAuditLogsResponse, ApiError>;

    /// Creates and executes a batch from an uploaded file of requests
    async fn create_batch(
        &self,
        create_batch_request: models::CreateBatchRequest,
        context: &C) -> Result<CreateBatchResponse, ApiError>;

    /// List your organization's batches.
    async fn list_batches(
        &self,
        after: Option<String>,
        limit: Option<i32>,
        context: &C) -> Result<ListBatchesResponse, ApiError>;

    /// Cancels an in-progress batch. The batch will be in status `cancelling` for up to 10 minutes, before changing to `cancelled`, where it will have partial results (if any) available in the output file.
    async fn cancel_batch(
        &self,
        batch_id: String,
        context: &C) -> Result<CancelBatchResponse, ApiError>;

    /// Retrieves a batch.
    async fn retrieve_batch(
        &self,
        batch_id: String,
        context: &C) -> Result<RetrieveBatchResponse, ApiError>;

    /// Creates a model response for the given chat conversation. Learn more in the [text generation](/docs/guides/text-generation), [vision](/docs/guides/vision), and [audio](/docs/guides/audio) guides.  Parameter support can differ depending on the model used to generate the response, particularly for newer reasoning models. Parameters that are only supported for reasoning models are noted below. For the current state of  unsupported parameters in reasoning models,  [refer to the reasoning guide](/docs/guides/reasoning). 
    async fn create_chat_completion(
        &self,
        create_chat_completion_request: models::CreateChatCompletionRequest,
        context: &C) -> Result<CreateChatCompletionResponse, ApiError>;

    /// Creates a completion for the provided prompt and parameters.
    async fn create_completion(
        &self,
        create_completion_request: models::CreateCompletionRequest,
        context: &C) -> Result<CreateCompletionResponse, ApiError>;

    /// Create an organization admin API key
    async fn admin_api_keys_create(
        &self,
        admin_api_keys_create_request: models::AdminApiKeysCreateRequest,
        context: &C) -> Result<AdminApiKeysCreateResponse, ApiError>;

    /// List organization API keys
    async fn admin_api_keys_list(
        &self,
        after: Option<swagger::Nullable<String>>,
        order: Option<models::AdminApiKeysListOrderParameter>,
        limit: Option<i32>,
        context: &C) -> Result<AdminApiKeysListResponse, ApiError>;

    /// Delete an organization admin API key
    async fn admin_api_keys_delete(
        &self,
        key_id: String,
        context: &C) -> Result<AdminApiKeysDeleteResponse, ApiError>;

    /// Retrieve a single organization API key
    async fn admin_api_keys_get(
        &self,
        key_id: String,
        context: &C) -> Result<AdminApiKeysGetResponse, ApiError>;

    /// Creates an embedding vector representing the input text.
    async fn create_embedding(
        &self,
        create_embedding_request: models::CreateEmbeddingRequest,
        context: &C) -> Result<CreateEmbeddingResponse, ApiError>;

    /// Upload a file that can be used across various endpoints. Individual files can be up to 512 MB, and the size of all files uploaded by one organization can be up to 100 GB.  The Assistants API supports files up to 2 million tokens and of specific file types. See the [Assistants Tools guide](/docs/assistants/tools) for details.  The Fine-tuning API only supports `.jsonl` files. The input also has certain required formats for fine-tuning [chat](/docs/api-reference/fine-tuning/chat-input) or [completions](/docs/api-reference/fine-tuning/completions-input) models.  The Batch API only supports `.jsonl` files up to 200 MB in size. The input also has a specific required [format](/docs/api-reference/batch/request-input).  Please [contact us](https://help.openai.com/) if you need to increase these storage limits. 
    async fn create_file(
        &self,
        file: swagger::ByteArray,
        purpose: models::CreateFileRequestPurpose,
        context: &C) -> Result<CreateFileResponse, ApiError>;

    /// Returns a list of files.
    async fn list_files(
        &self,
        purpose: Option<String>,
        limit: Option<i32>,
        order: Option<models::ListAssistantsOrderParameter>,
        after: Option<String>,
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
        response_format: Option<swagger::Nullable<models::CreateImageEditRequestResponseFormat>>,
        user: Option<String>,
        context: &C) -> Result<CreateImageEditResponse, ApiError>;

    /// Creates a variation of a given image.
    async fn create_image_variation(
        &self,
        image: swagger::ByteArray,
        model: Option<swagger::Nullable<models::CreateImageEditRequestModel>>,
        n: Option<swagger::Nullable<i32>>,
        response_format: Option<swagger::Nullable<models::CreateImageEditRequestResponseFormat>>,
        size: Option<swagger::Nullable<models::CreateImageEditRequestSize>>,
        user: Option<String>,
        context: &C) -> Result<CreateImageVariationResponse, ApiError>;

    /// Create an invite for a user to the organization. The invite must be accepted by the user before they have access to the organization.
    async fn invite_user(
        &self,
        invite_request: models::InviteRequest,
        context: &C) -> Result<InviteUserResponse, ApiError>;

    /// Returns a list of invites in the organization.
    async fn list_invites(
        &self,
        limit: Option<i32>,
        after: Option<String>,
        context: &C) -> Result<ListInvitesResponse, ApiError>;

    /// Delete an invite. If the invite has already been accepted, it cannot be deleted.
    async fn delete_invite(
        &self,
        invite_id: String,
        context: &C) -> Result<DeleteInviteResponse, ApiError>;

    /// Retrieves an invite.
    async fn retrieve_invite(
        &self,
        invite_id: String,
        context: &C) -> Result<RetrieveInviteResponse, ApiError>;

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

    /// Classifies if text and/or image inputs are potentially harmful. Learn more in the [moderation guide](/docs/guides/moderation). 
    async fn create_moderation(
        &self,
        create_moderation_request: models::CreateModerationRequest,
        context: &C) -> Result<CreateModerationResponse, ApiError>;

    /// Create a new project in the organization. Projects can be created and archived, but cannot be deleted.
    async fn create_project(
        &self,
        project_create_request: models::ProjectCreateRequest,
        context: &C) -> Result<CreateProjectResponse, ApiError>;

    /// Returns a list of projects.
    async fn list_projects(
        &self,
        limit: Option<i32>,
        after: Option<String>,
        include_archived: Option<bool>,
        context: &C) -> Result<ListProjectsResponse, ApiError>;

    /// Archives a project in the organization. Archived projects cannot be used or updated.
    async fn archive_project(
        &self,
        project_id: String,
        context: &C) -> Result<ArchiveProjectResponse, ApiError>;

    /// Creates a new service account in the project. This also returns an unredacted API key for the service account.
    async fn create_project_service_account(
        &self,
        project_id: String,
        project_service_account_create_request: models::ProjectServiceAccountCreateRequest,
        context: &C) -> Result<CreateProjectServiceAccountResponse, ApiError>;

    /// Adds a user to the project. Users must already be members of the organization to be added to a project.
    async fn create_project_user(
        &self,
        project_id: String,
        project_user_create_request: models::ProjectUserCreateRequest,
        context: &C) -> Result<CreateProjectUserResponse, ApiError>;

    /// Returns a list of API keys in the project.
    async fn list_project_api_keys(
        &self,
        project_id: String,
        limit: Option<i32>,
        after: Option<String>,
        context: &C) -> Result<ListProjectApiKeysResponse, ApiError>;

    /// Returns the rate limits per model for a project.
    async fn list_project_rate_limits(
        &self,
        project_id: String,
        limit: Option<i32>,
        after: Option<String>,
        before: Option<String>,
        context: &C) -> Result<ListProjectRateLimitsResponse, ApiError>;

    /// Returns a list of service accounts in the project.
    async fn list_project_service_accounts(
        &self,
        project_id: String,
        limit: Option<i32>,
        after: Option<String>,
        context: &C) -> Result<ListProjectServiceAccountsResponse, ApiError>;

    /// Returns a list of users in the project.
    async fn list_project_users(
        &self,
        project_id: String,
        limit: Option<i32>,
        after: Option<String>,
        context: &C) -> Result<ListProjectUsersResponse, ApiError>;

    /// Modifies a project in the organization.
    async fn modify_project(
        &self,
        project_id: String,
        project_update_request: models::ProjectUpdateRequest,
        context: &C) -> Result<ModifyProjectResponse, ApiError>;

    /// Retrieves a project.
    async fn retrieve_project(
        &self,
        project_id: String,
        context: &C) -> Result<RetrieveProjectResponse, ApiError>;

    /// Deletes an API key from the project.
    async fn delete_project_api_key(
        &self,
        project_id: String,
        key_id: String,
        context: &C) -> Result<DeleteProjectApiKeyResponse, ApiError>;

    /// Deletes a service account from the project.
    async fn delete_project_service_account(
        &self,
        project_id: String,
        service_account_id: String,
        context: &C) -> Result<DeleteProjectServiceAccountResponse, ApiError>;

    /// Deletes a user from the project.
    async fn delete_project_user(
        &self,
        project_id: String,
        user_id: String,
        context: &C) -> Result<DeleteProjectUserResponse, ApiError>;

    /// Modifies a user's role in the project.
    async fn modify_project_user(
        &self,
        project_id: String,
        user_id: String,
        project_user_update_request: models::ProjectUserUpdateRequest,
        context: &C) -> Result<ModifyProjectUserResponse, ApiError>;

    /// Retrieves an API key in the project.
    async fn retrieve_project_api_key(
        &self,
        project_id: String,
        key_id: String,
        context: &C) -> Result<RetrieveProjectApiKeyResponse, ApiError>;

    /// Retrieves a service account in the project.
    async fn retrieve_project_service_account(
        &self,
        project_id: String,
        service_account_id: String,
        context: &C) -> Result<RetrieveProjectServiceAccountResponse, ApiError>;

    /// Retrieves a user in the project.
    async fn retrieve_project_user(
        &self,
        project_id: String,
        user_id: String,
        context: &C) -> Result<RetrieveProjectUserResponse, ApiError>;

    /// Updates a project rate limit.
    async fn update_project_rate_limits(
        &self,
        project_id: String,
        rate_limit_id: String,
        project_rate_limit_update_request: models::ProjectRateLimitUpdateRequest,
        context: &C) -> Result<UpdateProjectRateLimitsResponse, ApiError>;

    /// Create an ephemeral API token for use in client-side applications with the Realtime API. Can be configured with the same session parameters as the `session.update` client event.  It responds with a session object, plus a `client_secret` key which contains a usable ephemeral API token that can be used to authenticate browser clients for the Realtime API. 
    async fn create_realtime_session(
        &self,
        realtime_session_create_request: models::RealtimeSessionCreateRequest,
        context: &C) -> Result<CreateRealtimeSessionResponse, ApiError>;

    /// Creates an intermediate [Upload](/docs/api-reference/uploads/object) object that you can add [Parts](/docs/api-reference/uploads/part-object) to. Currently, an Upload can accept at most 8 GB in total and expires after an hour after you create it.  Once you complete the Upload, we will create a [File](/docs/api-reference/files/object) object that contains all the parts you uploaded. This File is usable in the rest of our platform as a regular File object.  For certain `purpose`s, the correct `mime_type` must be specified. Please refer to documentation for the supported MIME types for your use case: - [Assistants](/docs/assistants/tools/file-search#supported-files)  For guidance on the proper filename extensions for each purpose, please follow the documentation on [creating a File](/docs/api-reference/files/create). 
    async fn create_upload(
        &self,
        create_upload_request: models::CreateUploadRequest,
        context: &C) -> Result<CreateUploadResponse, ApiError>;

    /// Adds a [Part](/docs/api-reference/uploads/part-object) to an [Upload](/docs/api-reference/uploads/object) object. A Part represents a chunk of bytes from the file you are trying to upload.   Each Part can be at most 64 MB, and you can add Parts until you hit the Upload maximum of 8 GB.  It is possible to add multiple Parts in parallel. You can decide the intended order of the Parts when you [complete the Upload](/docs/api-reference/uploads/complete). 
    async fn add_upload_part(
        &self,
        upload_id: String,
        data: swagger::ByteArray,
        context: &C) -> Result<AddUploadPartResponse, ApiError>;

    /// Cancels the Upload. No Parts may be added after an Upload is cancelled. 
    async fn cancel_upload(
        &self,
        upload_id: String,
        context: &C) -> Result<CancelUploadResponse, ApiError>;

    /// Completes the [Upload](/docs/api-reference/uploads/object).   Within the returned Upload object, there is a nested [File](/docs/api-reference/files/object) object that is ready to use in the rest of the platform.  You can specify the order of the Parts by passing in an ordered list of the Part IDs.  The number of bytes uploaded upon completion must match the number of bytes initially specified when creating the Upload object. No Parts may be added after an Upload is completed. 
    async fn complete_upload(
        &self,
        upload_id: String,
        complete_upload_request: models::CompleteUploadRequest,
        context: &C) -> Result<CompleteUploadResponse, ApiError>;

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
        context: &C) -> Result<UsageAudioSpeechesResponse, ApiError>;

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
        context: &C) -> Result<UsageAudioTranscriptionsResponse, ApiError>;

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
        context: &C) -> Result<UsageCodeInterpreterSessionsResponse, ApiError>;

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
        context: &C) -> Result<UsageCompletionsResponse, ApiError>;

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
        context: &C) -> Result<UsageCostsResponse, ApiError>;

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
        context: &C) -> Result<UsageEmbeddingsResponse, ApiError>;

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
        context: &C) -> Result<UsageImagesResponse, ApiError>;

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
        context: &C) -> Result<UsageModerationsResponse, ApiError>;

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
        context: &C) -> Result<UsageVectorStoresResponse, ApiError>;

    /// Lists all of the users in the organization.
    async fn list_users(
        &self,
        limit: Option<i32>,
        after: Option<String>,
        context: &C) -> Result<ListUsersResponse, ApiError>;

    /// Deletes a user from the organization.
    async fn delete_user(
        &self,
        user_id: String,
        context: &C) -> Result<DeleteUserResponse, ApiError>;

    /// Modifies a user's role in the organization.
    async fn modify_user(
        &self,
        user_id: String,
        user_role_update_request: models::UserRoleUpdateRequest,
        context: &C) -> Result<ModifyUserResponse, ApiError>;

    /// Retrieves a user by their identifier.
    async fn retrieve_user(
        &self,
        user_id: String,
        context: &C) -> Result<RetrieveUserResponse, ApiError>;

    /// Create a vector store.
    async fn create_vector_store(
        &self,
        create_vector_store_request: models::CreateVectorStoreRequest,
        context: &C) -> Result<CreateVectorStoreResponse, ApiError>;

    /// Returns a list of vector stores.
    async fn list_vector_stores(
        &self,
        limit: Option<i32>,
        order: Option<models::ListAssistantsOrderParameter>,
        after: Option<String>,
        before: Option<String>,
        context: &C) -> Result<ListVectorStoresResponse, ApiError>;

    /// Create a vector store file by attaching a [File](/docs/api-reference/files) to a [vector store](/docs/api-reference/vector-stores/object).
    async fn create_vector_store_file(
        &self,
        vector_store_id: String,
        create_vector_store_file_request: models::CreateVectorStoreFileRequest,
        context: &C) -> Result<CreateVectorStoreFileResponse, ApiError>;

    /// Create a vector store file batch.
    async fn create_vector_store_file_batch(
        &self,
        vector_store_id: String,
        create_vector_store_file_batch_request: models::CreateVectorStoreFileBatchRequest,
        context: &C) -> Result<CreateVectorStoreFileBatchResponse, ApiError>;

    /// Delete a vector store.
    async fn delete_vector_store(
        &self,
        vector_store_id: String,
        context: &C) -> Result<DeleteVectorStoreResponse, ApiError>;

    /// Retrieves a vector store.
    async fn get_vector_store(
        &self,
        vector_store_id: String,
        context: &C) -> Result<GetVectorStoreResponse, ApiError>;

    /// Returns a list of vector store files.
    async fn list_vector_store_files(
        &self,
        vector_store_id: String,
        limit: Option<i32>,
        order: Option<models::ListAssistantsOrderParameter>,
        after: Option<String>,
        before: Option<String>,
        filter: Option<models::ListFilesInVectorStoreBatchFilterParameter>,
        context: &C) -> Result<ListVectorStoreFilesResponse, ApiError>;

    /// Modifies a vector store.
    async fn modify_vector_store(
        &self,
        vector_store_id: String,
        update_vector_store_request: models::UpdateVectorStoreRequest,
        context: &C) -> Result<ModifyVectorStoreResponse, ApiError>;

    /// Cancel a vector store file batch. This attempts to cancel the processing of files in this batch as soon as possible.
    async fn cancel_vector_store_file_batch(
        &self,
        vector_store_id: String,
        batch_id: String,
        context: &C) -> Result<CancelVectorStoreFileBatchResponse, ApiError>;

    /// Delete a vector store file. This will remove the file from the vector store but the file itself will not be deleted. To delete the file, use the [delete file](/docs/api-reference/files/delete) endpoint.
    async fn delete_vector_store_file(
        &self,
        vector_store_id: String,
        file_id: String,
        context: &C) -> Result<DeleteVectorStoreFileResponse, ApiError>;

    /// Retrieves a vector store file.
    async fn get_vector_store_file(
        &self,
        vector_store_id: String,
        file_id: String,
        context: &C) -> Result<GetVectorStoreFileResponse, ApiError>;

    /// Retrieves a vector store file batch.
    async fn get_vector_store_file_batch(
        &self,
        vector_store_id: String,
        batch_id: String,
        context: &C) -> Result<GetVectorStoreFileBatchResponse, ApiError>;

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
        context: &C) -> Result<ListFilesInVectorStoreBatchResponse, ApiError>;

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

    /// Create a message.
    async fn create_message(
        &self,
        thread_id: String,
        create_message_request: models::CreateMessageRequest,
        ) -> Result<CreateMessageResponse, ApiError>;

    /// Create a run.
    async fn create_run<'a>(
        &self,
        thread_id: String,
        create_run_request: models::CreateRunRequest,
        include_left_square_bracket_right_square_bracket: Option<&'a Vec<models::CreateRunIncludeParameterInner>>,
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

    /// Deletes a message.
    async fn delete_message(
        &self,
        thread_id: String,
        message_id: String,
        ) -> Result<DeleteMessageResponse, ApiError>;

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

    /// Retrieves a run step.
    async fn get_run_step<'a>(
        &self,
        thread_id: String,
        run_id: String,
        step_id: String,
        include_left_square_bracket_right_square_bracket: Option<&'a Vec<models::CreateRunIncludeParameterInner>>,
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
        response_format: Option<models::AudioResponseFormat>,
        temperature: Option<f64>,
        timestamp_granularities_left_square_bracket_right_square_bracket: Option<&'a Vec<models::CreateTranscriptionRequestTimestampGranularitiesInner>>,
        ) -> Result<CreateTranscriptionResponse, ApiError>;

    /// Translates audio into English.
    async fn create_translation(
        &self,
        file: swagger::ByteArray,
        model: models::CreateTranscriptionRequestModel,
        prompt: Option<String>,
        response_format: Option<models::AudioResponseFormat>,
        temperature: Option<f64>,
        ) -> Result<CreateTranslationResponse, ApiError>;

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
        ) -> Result<ListAuditLogsResponse, ApiError>;

    /// Creates and executes a batch from an uploaded file of requests
    async fn create_batch(
        &self,
        create_batch_request: models::CreateBatchRequest,
        ) -> Result<CreateBatchResponse, ApiError>;

    /// List your organization's batches.
    async fn list_batches(
        &self,
        after: Option<String>,
        limit: Option<i32>,
        ) -> Result<ListBatchesResponse, ApiError>;

    /// Cancels an in-progress batch. The batch will be in status `cancelling` for up to 10 minutes, before changing to `cancelled`, where it will have partial results (if any) available in the output file.
    async fn cancel_batch(
        &self,
        batch_id: String,
        ) -> Result<CancelBatchResponse, ApiError>;

    /// Retrieves a batch.
    async fn retrieve_batch(
        &self,
        batch_id: String,
        ) -> Result<RetrieveBatchResponse, ApiError>;

    /// Creates a model response for the given chat conversation. Learn more in the [text generation](/docs/guides/text-generation), [vision](/docs/guides/vision), and [audio](/docs/guides/audio) guides.  Parameter support can differ depending on the model used to generate the response, particularly for newer reasoning models. Parameters that are only supported for reasoning models are noted below. For the current state of  unsupported parameters in reasoning models,  [refer to the reasoning guide](/docs/guides/reasoning). 
    async fn create_chat_completion(
        &self,
        create_chat_completion_request: models::CreateChatCompletionRequest,
        ) -> Result<CreateChatCompletionResponse, ApiError>;

    /// Creates a completion for the provided prompt and parameters.
    async fn create_completion(
        &self,
        create_completion_request: models::CreateCompletionRequest,
        ) -> Result<CreateCompletionResponse, ApiError>;

    /// Create an organization admin API key
    async fn admin_api_keys_create(
        &self,
        admin_api_keys_create_request: models::AdminApiKeysCreateRequest,
        ) -> Result<AdminApiKeysCreateResponse, ApiError>;

    /// List organization API keys
    async fn admin_api_keys_list(
        &self,
        after: Option<swagger::Nullable<String>>,
        order: Option<models::AdminApiKeysListOrderParameter>,
        limit: Option<i32>,
        ) -> Result<AdminApiKeysListResponse, ApiError>;

    /// Delete an organization admin API key
    async fn admin_api_keys_delete(
        &self,
        key_id: String,
        ) -> Result<AdminApiKeysDeleteResponse, ApiError>;

    /// Retrieve a single organization API key
    async fn admin_api_keys_get(
        &self,
        key_id: String,
        ) -> Result<AdminApiKeysGetResponse, ApiError>;

    /// Creates an embedding vector representing the input text.
    async fn create_embedding(
        &self,
        create_embedding_request: models::CreateEmbeddingRequest,
        ) -> Result<CreateEmbeddingResponse, ApiError>;

    /// Upload a file that can be used across various endpoints. Individual files can be up to 512 MB, and the size of all files uploaded by one organization can be up to 100 GB.  The Assistants API supports files up to 2 million tokens and of specific file types. See the [Assistants Tools guide](/docs/assistants/tools) for details.  The Fine-tuning API only supports `.jsonl` files. The input also has certain required formats for fine-tuning [chat](/docs/api-reference/fine-tuning/chat-input) or [completions](/docs/api-reference/fine-tuning/completions-input) models.  The Batch API only supports `.jsonl` files up to 200 MB in size. The input also has a specific required [format](/docs/api-reference/batch/request-input).  Please [contact us](https://help.openai.com/) if you need to increase these storage limits. 
    async fn create_file(
        &self,
        file: swagger::ByteArray,
        purpose: models::CreateFileRequestPurpose,
        ) -> Result<CreateFileResponse, ApiError>;

    /// Returns a list of files.
    async fn list_files(
        &self,
        purpose: Option<String>,
        limit: Option<i32>,
        order: Option<models::ListAssistantsOrderParameter>,
        after: Option<String>,
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
        response_format: Option<swagger::Nullable<models::CreateImageEditRequestResponseFormat>>,
        user: Option<String>,
        ) -> Result<CreateImageEditResponse, ApiError>;

    /// Creates a variation of a given image.
    async fn create_image_variation(
        &self,
        image: swagger::ByteArray,
        model: Option<swagger::Nullable<models::CreateImageEditRequestModel>>,
        n: Option<swagger::Nullable<i32>>,
        response_format: Option<swagger::Nullable<models::CreateImageEditRequestResponseFormat>>,
        size: Option<swagger::Nullable<models::CreateImageEditRequestSize>>,
        user: Option<String>,
        ) -> Result<CreateImageVariationResponse, ApiError>;

    /// Create an invite for a user to the organization. The invite must be accepted by the user before they have access to the organization.
    async fn invite_user(
        &self,
        invite_request: models::InviteRequest,
        ) -> Result<InviteUserResponse, ApiError>;

    /// Returns a list of invites in the organization.
    async fn list_invites(
        &self,
        limit: Option<i32>,
        after: Option<String>,
        ) -> Result<ListInvitesResponse, ApiError>;

    /// Delete an invite. If the invite has already been accepted, it cannot be deleted.
    async fn delete_invite(
        &self,
        invite_id: String,
        ) -> Result<DeleteInviteResponse, ApiError>;

    /// Retrieves an invite.
    async fn retrieve_invite(
        &self,
        invite_id: String,
        ) -> Result<RetrieveInviteResponse, ApiError>;

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

    /// Classifies if text and/or image inputs are potentially harmful. Learn more in the [moderation guide](/docs/guides/moderation). 
    async fn create_moderation(
        &self,
        create_moderation_request: models::CreateModerationRequest,
        ) -> Result<CreateModerationResponse, ApiError>;

    /// Create a new project in the organization. Projects can be created and archived, but cannot be deleted.
    async fn create_project(
        &self,
        project_create_request: models::ProjectCreateRequest,
        ) -> Result<CreateProjectResponse, ApiError>;

    /// Returns a list of projects.
    async fn list_projects(
        &self,
        limit: Option<i32>,
        after: Option<String>,
        include_archived: Option<bool>,
        ) -> Result<ListProjectsResponse, ApiError>;

    /// Archives a project in the organization. Archived projects cannot be used or updated.
    async fn archive_project(
        &self,
        project_id: String,
        ) -> Result<ArchiveProjectResponse, ApiError>;

    /// Creates a new service account in the project. This also returns an unredacted API key for the service account.
    async fn create_project_service_account(
        &self,
        project_id: String,
        project_service_account_create_request: models::ProjectServiceAccountCreateRequest,
        ) -> Result<CreateProjectServiceAccountResponse, ApiError>;

    /// Adds a user to the project. Users must already be members of the organization to be added to a project.
    async fn create_project_user(
        &self,
        project_id: String,
        project_user_create_request: models::ProjectUserCreateRequest,
        ) -> Result<CreateProjectUserResponse, ApiError>;

    /// Returns a list of API keys in the project.
    async fn list_project_api_keys(
        &self,
        project_id: String,
        limit: Option<i32>,
        after: Option<String>,
        ) -> Result<ListProjectApiKeysResponse, ApiError>;

    /// Returns the rate limits per model for a project.
    async fn list_project_rate_limits(
        &self,
        project_id: String,
        limit: Option<i32>,
        after: Option<String>,
        before: Option<String>,
        ) -> Result<ListProjectRateLimitsResponse, ApiError>;

    /// Returns a list of service accounts in the project.
    async fn list_project_service_accounts(
        &self,
        project_id: String,
        limit: Option<i32>,
        after: Option<String>,
        ) -> Result<ListProjectServiceAccountsResponse, ApiError>;

    /// Returns a list of users in the project.
    async fn list_project_users(
        &self,
        project_id: String,
        limit: Option<i32>,
        after: Option<String>,
        ) -> Result<ListProjectUsersResponse, ApiError>;

    /// Modifies a project in the organization.
    async fn modify_project(
        &self,
        project_id: String,
        project_update_request: models::ProjectUpdateRequest,
        ) -> Result<ModifyProjectResponse, ApiError>;

    /// Retrieves a project.
    async fn retrieve_project(
        &self,
        project_id: String,
        ) -> Result<RetrieveProjectResponse, ApiError>;

    /// Deletes an API key from the project.
    async fn delete_project_api_key(
        &self,
        project_id: String,
        key_id: String,
        ) -> Result<DeleteProjectApiKeyResponse, ApiError>;

    /// Deletes a service account from the project.
    async fn delete_project_service_account(
        &self,
        project_id: String,
        service_account_id: String,
        ) -> Result<DeleteProjectServiceAccountResponse, ApiError>;

    /// Deletes a user from the project.
    async fn delete_project_user(
        &self,
        project_id: String,
        user_id: String,
        ) -> Result<DeleteProjectUserResponse, ApiError>;

    /// Modifies a user's role in the project.
    async fn modify_project_user(
        &self,
        project_id: String,
        user_id: String,
        project_user_update_request: models::ProjectUserUpdateRequest,
        ) -> Result<ModifyProjectUserResponse, ApiError>;

    /// Retrieves an API key in the project.
    async fn retrieve_project_api_key(
        &self,
        project_id: String,
        key_id: String,
        ) -> Result<RetrieveProjectApiKeyResponse, ApiError>;

    /// Retrieves a service account in the project.
    async fn retrieve_project_service_account(
        &self,
        project_id: String,
        service_account_id: String,
        ) -> Result<RetrieveProjectServiceAccountResponse, ApiError>;

    /// Retrieves a user in the project.
    async fn retrieve_project_user(
        &self,
        project_id: String,
        user_id: String,
        ) -> Result<RetrieveProjectUserResponse, ApiError>;

    /// Updates a project rate limit.
    async fn update_project_rate_limits(
        &self,
        project_id: String,
        rate_limit_id: String,
        project_rate_limit_update_request: models::ProjectRateLimitUpdateRequest,
        ) -> Result<UpdateProjectRateLimitsResponse, ApiError>;

    /// Create an ephemeral API token for use in client-side applications with the Realtime API. Can be configured with the same session parameters as the `session.update` client event.  It responds with a session object, plus a `client_secret` key which contains a usable ephemeral API token that can be used to authenticate browser clients for the Realtime API. 
    async fn create_realtime_session(
        &self,
        realtime_session_create_request: models::RealtimeSessionCreateRequest,
        ) -> Result<CreateRealtimeSessionResponse, ApiError>;

    /// Creates an intermediate [Upload](/docs/api-reference/uploads/object) object that you can add [Parts](/docs/api-reference/uploads/part-object) to. Currently, an Upload can accept at most 8 GB in total and expires after an hour after you create it.  Once you complete the Upload, we will create a [File](/docs/api-reference/files/object) object that contains all the parts you uploaded. This File is usable in the rest of our platform as a regular File object.  For certain `purpose`s, the correct `mime_type` must be specified. Please refer to documentation for the supported MIME types for your use case: - [Assistants](/docs/assistants/tools/file-search#supported-files)  For guidance on the proper filename extensions for each purpose, please follow the documentation on [creating a File](/docs/api-reference/files/create). 
    async fn create_upload(
        &self,
        create_upload_request: models::CreateUploadRequest,
        ) -> Result<CreateUploadResponse, ApiError>;

    /// Adds a [Part](/docs/api-reference/uploads/part-object) to an [Upload](/docs/api-reference/uploads/object) object. A Part represents a chunk of bytes from the file you are trying to upload.   Each Part can be at most 64 MB, and you can add Parts until you hit the Upload maximum of 8 GB.  It is possible to add multiple Parts in parallel. You can decide the intended order of the Parts when you [complete the Upload](/docs/api-reference/uploads/complete). 
    async fn add_upload_part(
        &self,
        upload_id: String,
        data: swagger::ByteArray,
        ) -> Result<AddUploadPartResponse, ApiError>;

    /// Cancels the Upload. No Parts may be added after an Upload is cancelled. 
    async fn cancel_upload(
        &self,
        upload_id: String,
        ) -> Result<CancelUploadResponse, ApiError>;

    /// Completes the [Upload](/docs/api-reference/uploads/object).   Within the returned Upload object, there is a nested [File](/docs/api-reference/files/object) object that is ready to use in the rest of the platform.  You can specify the order of the Parts by passing in an ordered list of the Part IDs.  The number of bytes uploaded upon completion must match the number of bytes initially specified when creating the Upload object. No Parts may be added after an Upload is completed. 
    async fn complete_upload(
        &self,
        upload_id: String,
        complete_upload_request: models::CompleteUploadRequest,
        ) -> Result<CompleteUploadResponse, ApiError>;

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
        ) -> Result<UsageAudioSpeechesResponse, ApiError>;

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
        ) -> Result<UsageAudioTranscriptionsResponse, ApiError>;

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
        ) -> Result<UsageCodeInterpreterSessionsResponse, ApiError>;

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
        ) -> Result<UsageCompletionsResponse, ApiError>;

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
        ) -> Result<UsageCostsResponse, ApiError>;

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
        ) -> Result<UsageEmbeddingsResponse, ApiError>;

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
        ) -> Result<UsageImagesResponse, ApiError>;

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
        ) -> Result<UsageModerationsResponse, ApiError>;

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
        ) -> Result<UsageVectorStoresResponse, ApiError>;

    /// Lists all of the users in the organization.
    async fn list_users(
        &self,
        limit: Option<i32>,
        after: Option<String>,
        ) -> Result<ListUsersResponse, ApiError>;

    /// Deletes a user from the organization.
    async fn delete_user(
        &self,
        user_id: String,
        ) -> Result<DeleteUserResponse, ApiError>;

    /// Modifies a user's role in the organization.
    async fn modify_user(
        &self,
        user_id: String,
        user_role_update_request: models::UserRoleUpdateRequest,
        ) -> Result<ModifyUserResponse, ApiError>;

    /// Retrieves a user by their identifier.
    async fn retrieve_user(
        &self,
        user_id: String,
        ) -> Result<RetrieveUserResponse, ApiError>;

    /// Create a vector store.
    async fn create_vector_store(
        &self,
        create_vector_store_request: models::CreateVectorStoreRequest,
        ) -> Result<CreateVectorStoreResponse, ApiError>;

    /// Returns a list of vector stores.
    async fn list_vector_stores(
        &self,
        limit: Option<i32>,
        order: Option<models::ListAssistantsOrderParameter>,
        after: Option<String>,
        before: Option<String>,
        ) -> Result<ListVectorStoresResponse, ApiError>;

    /// Create a vector store file by attaching a [File](/docs/api-reference/files) to a [vector store](/docs/api-reference/vector-stores/object).
    async fn create_vector_store_file(
        &self,
        vector_store_id: String,
        create_vector_store_file_request: models::CreateVectorStoreFileRequest,
        ) -> Result<CreateVectorStoreFileResponse, ApiError>;

    /// Create a vector store file batch.
    async fn create_vector_store_file_batch(
        &self,
        vector_store_id: String,
        create_vector_store_file_batch_request: models::CreateVectorStoreFileBatchRequest,
        ) -> Result<CreateVectorStoreFileBatchResponse, ApiError>;

    /// Delete a vector store.
    async fn delete_vector_store(
        &self,
        vector_store_id: String,
        ) -> Result<DeleteVectorStoreResponse, ApiError>;

    /// Retrieves a vector store.
    async fn get_vector_store(
        &self,
        vector_store_id: String,
        ) -> Result<GetVectorStoreResponse, ApiError>;

    /// Returns a list of vector store files.
    async fn list_vector_store_files(
        &self,
        vector_store_id: String,
        limit: Option<i32>,
        order: Option<models::ListAssistantsOrderParameter>,
        after: Option<String>,
        before: Option<String>,
        filter: Option<models::ListFilesInVectorStoreBatchFilterParameter>,
        ) -> Result<ListVectorStoreFilesResponse, ApiError>;

    /// Modifies a vector store.
    async fn modify_vector_store(
        &self,
        vector_store_id: String,
        update_vector_store_request: models::UpdateVectorStoreRequest,
        ) -> Result<ModifyVectorStoreResponse, ApiError>;

    /// Cancel a vector store file batch. This attempts to cancel the processing of files in this batch as soon as possible.
    async fn cancel_vector_store_file_batch(
        &self,
        vector_store_id: String,
        batch_id: String,
        ) -> Result<CancelVectorStoreFileBatchResponse, ApiError>;

    /// Delete a vector store file. This will remove the file from the vector store but the file itself will not be deleted. To delete the file, use the [delete file](/docs/api-reference/files/delete) endpoint.
    async fn delete_vector_store_file(
        &self,
        vector_store_id: String,
        file_id: String,
        ) -> Result<DeleteVectorStoreFileResponse, ApiError>;

    /// Retrieves a vector store file.
    async fn get_vector_store_file(
        &self,
        vector_store_id: String,
        file_id: String,
        ) -> Result<GetVectorStoreFileResponse, ApiError>;

    /// Retrieves a vector store file batch.
    async fn get_vector_store_file_batch(
        &self,
        vector_store_id: String,
        batch_id: String,
        ) -> Result<GetVectorStoreFileBatchResponse, ApiError>;

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
        ) -> Result<ListFilesInVectorStoreBatchResponse, ApiError>;

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
    async fn create_run<'a>(
        &self,
        thread_id: String,
        create_run_request: models::CreateRunRequest,
        include_left_square_bracket_right_square_bracket: Option<&'a Vec<models::CreateRunIncludeParameterInner>>,
        ) -> Result<CreateRunResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().create_run(thread_id, create_run_request, include_left_square_bracket_right_square_bracket, &context).await
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

    /// Deletes a message.
    async fn delete_message(
        &self,
        thread_id: String,
        message_id: String,
        ) -> Result<DeleteMessageResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().delete_message(thread_id, message_id, &context).await
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
        ) -> Result<ListRunStepsResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().list_run_steps(thread_id, run_id, limit, order, after, before, include_left_square_bracket_right_square_bracket, &context).await
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

    /// Retrieves a run step.
    async fn get_run_step<'a>(
        &self,
        thread_id: String,
        run_id: String,
        step_id: String,
        include_left_square_bracket_right_square_bracket: Option<&'a Vec<models::CreateRunIncludeParameterInner>>,
        ) -> Result<GetRunStepResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().get_run_step(thread_id, run_id, step_id, include_left_square_bracket_right_square_bracket, &context).await
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
        response_format: Option<models::AudioResponseFormat>,
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
        response_format: Option<models::AudioResponseFormat>,
        temperature: Option<f64>,
        ) -> Result<CreateTranslationResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().create_translation(file, model, prompt, response_format, temperature, &context).await
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
        ) -> Result<ListAuditLogsResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().list_audit_logs(effective_at, project_ids_left_square_bracket_right_square_bracket, event_types_left_square_bracket_right_square_bracket, actor_ids_left_square_bracket_right_square_bracket, actor_emails_left_square_bracket_right_square_bracket, resource_ids_left_square_bracket_right_square_bracket, limit, after, before, &context).await
    }

    /// Creates and executes a batch from an uploaded file of requests
    async fn create_batch(
        &self,
        create_batch_request: models::CreateBatchRequest,
        ) -> Result<CreateBatchResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().create_batch(create_batch_request, &context).await
    }

    /// List your organization's batches.
    async fn list_batches(
        &self,
        after: Option<String>,
        limit: Option<i32>,
        ) -> Result<ListBatchesResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().list_batches(after, limit, &context).await
    }

    /// Cancels an in-progress batch. The batch will be in status `cancelling` for up to 10 minutes, before changing to `cancelled`, where it will have partial results (if any) available in the output file.
    async fn cancel_batch(
        &self,
        batch_id: String,
        ) -> Result<CancelBatchResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().cancel_batch(batch_id, &context).await
    }

    /// Retrieves a batch.
    async fn retrieve_batch(
        &self,
        batch_id: String,
        ) -> Result<RetrieveBatchResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().retrieve_batch(batch_id, &context).await
    }

    /// Creates a model response for the given chat conversation. Learn more in the [text generation](/docs/guides/text-generation), [vision](/docs/guides/vision), and [audio](/docs/guides/audio) guides.  Parameter support can differ depending on the model used to generate the response, particularly for newer reasoning models. Parameters that are only supported for reasoning models are noted below. For the current state of  unsupported parameters in reasoning models,  [refer to the reasoning guide](/docs/guides/reasoning). 
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

    /// Create an organization admin API key
    async fn admin_api_keys_create(
        &self,
        admin_api_keys_create_request: models::AdminApiKeysCreateRequest,
        ) -> Result<AdminApiKeysCreateResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().admin_api_keys_create(admin_api_keys_create_request, &context).await
    }

    /// List organization API keys
    async fn admin_api_keys_list(
        &self,
        after: Option<swagger::Nullable<String>>,
        order: Option<models::AdminApiKeysListOrderParameter>,
        limit: Option<i32>,
        ) -> Result<AdminApiKeysListResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().admin_api_keys_list(after, order, limit, &context).await
    }

    /// Delete an organization admin API key
    async fn admin_api_keys_delete(
        &self,
        key_id: String,
        ) -> Result<AdminApiKeysDeleteResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().admin_api_keys_delete(key_id, &context).await
    }

    /// Retrieve a single organization API key
    async fn admin_api_keys_get(
        &self,
        key_id: String,
        ) -> Result<AdminApiKeysGetResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().admin_api_keys_get(key_id, &context).await
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

    /// Upload a file that can be used across various endpoints. Individual files can be up to 512 MB, and the size of all files uploaded by one organization can be up to 100 GB.  The Assistants API supports files up to 2 million tokens and of specific file types. See the [Assistants Tools guide](/docs/assistants/tools) for details.  The Fine-tuning API only supports `.jsonl` files. The input also has certain required formats for fine-tuning [chat](/docs/api-reference/fine-tuning/chat-input) or [completions](/docs/api-reference/fine-tuning/completions-input) models.  The Batch API only supports `.jsonl` files up to 200 MB in size. The input also has a specific required [format](/docs/api-reference/batch/request-input).  Please [contact us](https://help.openai.com/) if you need to increase these storage limits. 
    async fn create_file(
        &self,
        file: swagger::ByteArray,
        purpose: models::CreateFileRequestPurpose,
        ) -> Result<CreateFileResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().create_file(file, purpose, &context).await
    }

    /// Returns a list of files.
    async fn list_files(
        &self,
        purpose: Option<String>,
        limit: Option<i32>,
        order: Option<models::ListAssistantsOrderParameter>,
        after: Option<String>,
        ) -> Result<ListFilesResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().list_files(purpose, limit, order, after, &context).await
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
        response_format: Option<swagger::Nullable<models::CreateImageEditRequestResponseFormat>>,
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
        response_format: Option<swagger::Nullable<models::CreateImageEditRequestResponseFormat>>,
        size: Option<swagger::Nullable<models::CreateImageEditRequestSize>>,
        user: Option<String>,
        ) -> Result<CreateImageVariationResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().create_image_variation(image, model, n, response_format, size, user, &context).await
    }

    /// Create an invite for a user to the organization. The invite must be accepted by the user before they have access to the organization.
    async fn invite_user(
        &self,
        invite_request: models::InviteRequest,
        ) -> Result<InviteUserResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().invite_user(invite_request, &context).await
    }

    /// Returns a list of invites in the organization.
    async fn list_invites(
        &self,
        limit: Option<i32>,
        after: Option<String>,
        ) -> Result<ListInvitesResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().list_invites(limit, after, &context).await
    }

    /// Delete an invite. If the invite has already been accepted, it cannot be deleted.
    async fn delete_invite(
        &self,
        invite_id: String,
        ) -> Result<DeleteInviteResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().delete_invite(invite_id, &context).await
    }

    /// Retrieves an invite.
    async fn retrieve_invite(
        &self,
        invite_id: String,
        ) -> Result<RetrieveInviteResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().retrieve_invite(invite_id, &context).await
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

    /// Classifies if text and/or image inputs are potentially harmful. Learn more in the [moderation guide](/docs/guides/moderation). 
    async fn create_moderation(
        &self,
        create_moderation_request: models::CreateModerationRequest,
        ) -> Result<CreateModerationResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().create_moderation(create_moderation_request, &context).await
    }

    /// Create a new project in the organization. Projects can be created and archived, but cannot be deleted.
    async fn create_project(
        &self,
        project_create_request: models::ProjectCreateRequest,
        ) -> Result<CreateProjectResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().create_project(project_create_request, &context).await
    }

    /// Returns a list of projects.
    async fn list_projects(
        &self,
        limit: Option<i32>,
        after: Option<String>,
        include_archived: Option<bool>,
        ) -> Result<ListProjectsResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().list_projects(limit, after, include_archived, &context).await
    }

    /// Archives a project in the organization. Archived projects cannot be used or updated.
    async fn archive_project(
        &self,
        project_id: String,
        ) -> Result<ArchiveProjectResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().archive_project(project_id, &context).await
    }

    /// Creates a new service account in the project. This also returns an unredacted API key for the service account.
    async fn create_project_service_account(
        &self,
        project_id: String,
        project_service_account_create_request: models::ProjectServiceAccountCreateRequest,
        ) -> Result<CreateProjectServiceAccountResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().create_project_service_account(project_id, project_service_account_create_request, &context).await
    }

    /// Adds a user to the project. Users must already be members of the organization to be added to a project.
    async fn create_project_user(
        &self,
        project_id: String,
        project_user_create_request: models::ProjectUserCreateRequest,
        ) -> Result<CreateProjectUserResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().create_project_user(project_id, project_user_create_request, &context).await
    }

    /// Returns a list of API keys in the project.
    async fn list_project_api_keys(
        &self,
        project_id: String,
        limit: Option<i32>,
        after: Option<String>,
        ) -> Result<ListProjectApiKeysResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().list_project_api_keys(project_id, limit, after, &context).await
    }

    /// Returns the rate limits per model for a project.
    async fn list_project_rate_limits(
        &self,
        project_id: String,
        limit: Option<i32>,
        after: Option<String>,
        before: Option<String>,
        ) -> Result<ListProjectRateLimitsResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().list_project_rate_limits(project_id, limit, after, before, &context).await
    }

    /// Returns a list of service accounts in the project.
    async fn list_project_service_accounts(
        &self,
        project_id: String,
        limit: Option<i32>,
        after: Option<String>,
        ) -> Result<ListProjectServiceAccountsResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().list_project_service_accounts(project_id, limit, after, &context).await
    }

    /// Returns a list of users in the project.
    async fn list_project_users(
        &self,
        project_id: String,
        limit: Option<i32>,
        after: Option<String>,
        ) -> Result<ListProjectUsersResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().list_project_users(project_id, limit, after, &context).await
    }

    /// Modifies a project in the organization.
    async fn modify_project(
        &self,
        project_id: String,
        project_update_request: models::ProjectUpdateRequest,
        ) -> Result<ModifyProjectResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().modify_project(project_id, project_update_request, &context).await
    }

    /// Retrieves a project.
    async fn retrieve_project(
        &self,
        project_id: String,
        ) -> Result<RetrieveProjectResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().retrieve_project(project_id, &context).await
    }

    /// Deletes an API key from the project.
    async fn delete_project_api_key(
        &self,
        project_id: String,
        key_id: String,
        ) -> Result<DeleteProjectApiKeyResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().delete_project_api_key(project_id, key_id, &context).await
    }

    /// Deletes a service account from the project.
    async fn delete_project_service_account(
        &self,
        project_id: String,
        service_account_id: String,
        ) -> Result<DeleteProjectServiceAccountResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().delete_project_service_account(project_id, service_account_id, &context).await
    }

    /// Deletes a user from the project.
    async fn delete_project_user(
        &self,
        project_id: String,
        user_id: String,
        ) -> Result<DeleteProjectUserResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().delete_project_user(project_id, user_id, &context).await
    }

    /// Modifies a user's role in the project.
    async fn modify_project_user(
        &self,
        project_id: String,
        user_id: String,
        project_user_update_request: models::ProjectUserUpdateRequest,
        ) -> Result<ModifyProjectUserResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().modify_project_user(project_id, user_id, project_user_update_request, &context).await
    }

    /// Retrieves an API key in the project.
    async fn retrieve_project_api_key(
        &self,
        project_id: String,
        key_id: String,
        ) -> Result<RetrieveProjectApiKeyResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().retrieve_project_api_key(project_id, key_id, &context).await
    }

    /// Retrieves a service account in the project.
    async fn retrieve_project_service_account(
        &self,
        project_id: String,
        service_account_id: String,
        ) -> Result<RetrieveProjectServiceAccountResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().retrieve_project_service_account(project_id, service_account_id, &context).await
    }

    /// Retrieves a user in the project.
    async fn retrieve_project_user(
        &self,
        project_id: String,
        user_id: String,
        ) -> Result<RetrieveProjectUserResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().retrieve_project_user(project_id, user_id, &context).await
    }

    /// Updates a project rate limit.
    async fn update_project_rate_limits(
        &self,
        project_id: String,
        rate_limit_id: String,
        project_rate_limit_update_request: models::ProjectRateLimitUpdateRequest,
        ) -> Result<UpdateProjectRateLimitsResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().update_project_rate_limits(project_id, rate_limit_id, project_rate_limit_update_request, &context).await
    }

    /// Create an ephemeral API token for use in client-side applications with the Realtime API. Can be configured with the same session parameters as the `session.update` client event.  It responds with a session object, plus a `client_secret` key which contains a usable ephemeral API token that can be used to authenticate browser clients for the Realtime API. 
    async fn create_realtime_session(
        &self,
        realtime_session_create_request: models::RealtimeSessionCreateRequest,
        ) -> Result<CreateRealtimeSessionResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().create_realtime_session(realtime_session_create_request, &context).await
    }

    /// Creates an intermediate [Upload](/docs/api-reference/uploads/object) object that you can add [Parts](/docs/api-reference/uploads/part-object) to. Currently, an Upload can accept at most 8 GB in total and expires after an hour after you create it.  Once you complete the Upload, we will create a [File](/docs/api-reference/files/object) object that contains all the parts you uploaded. This File is usable in the rest of our platform as a regular File object.  For certain `purpose`s, the correct `mime_type` must be specified. Please refer to documentation for the supported MIME types for your use case: - [Assistants](/docs/assistants/tools/file-search#supported-files)  For guidance on the proper filename extensions for each purpose, please follow the documentation on [creating a File](/docs/api-reference/files/create). 
    async fn create_upload(
        &self,
        create_upload_request: models::CreateUploadRequest,
        ) -> Result<CreateUploadResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().create_upload(create_upload_request, &context).await
    }

    /// Adds a [Part](/docs/api-reference/uploads/part-object) to an [Upload](/docs/api-reference/uploads/object) object. A Part represents a chunk of bytes from the file you are trying to upload.   Each Part can be at most 64 MB, and you can add Parts until you hit the Upload maximum of 8 GB.  It is possible to add multiple Parts in parallel. You can decide the intended order of the Parts when you [complete the Upload](/docs/api-reference/uploads/complete). 
    async fn add_upload_part(
        &self,
        upload_id: String,
        data: swagger::ByteArray,
        ) -> Result<AddUploadPartResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().add_upload_part(upload_id, data, &context).await
    }

    /// Cancels the Upload. No Parts may be added after an Upload is cancelled. 
    async fn cancel_upload(
        &self,
        upload_id: String,
        ) -> Result<CancelUploadResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().cancel_upload(upload_id, &context).await
    }

    /// Completes the [Upload](/docs/api-reference/uploads/object).   Within the returned Upload object, there is a nested [File](/docs/api-reference/files/object) object that is ready to use in the rest of the platform.  You can specify the order of the Parts by passing in an ordered list of the Part IDs.  The number of bytes uploaded upon completion must match the number of bytes initially specified when creating the Upload object. No Parts may be added after an Upload is completed. 
    async fn complete_upload(
        &self,
        upload_id: String,
        complete_upload_request: models::CompleteUploadRequest,
        ) -> Result<CompleteUploadResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().complete_upload(upload_id, complete_upload_request, &context).await
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
        ) -> Result<UsageAudioSpeechesResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().usage_audio_speeches(start_time, end_time, bucket_width, project_ids, user_ids, api_key_ids, models, group_by, limit, page, &context).await
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
        ) -> Result<UsageAudioTranscriptionsResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().usage_audio_transcriptions(start_time, end_time, bucket_width, project_ids, user_ids, api_key_ids, models, group_by, limit, page, &context).await
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
        ) -> Result<UsageCodeInterpreterSessionsResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().usage_code_interpreter_sessions(start_time, end_time, bucket_width, project_ids, group_by, limit, page, &context).await
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
        ) -> Result<UsageCompletionsResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().usage_completions(start_time, end_time, bucket_width, project_ids, user_ids, api_key_ids, models, batch, group_by, limit, page, &context).await
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
        ) -> Result<UsageCostsResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().usage_costs(start_time, end_time, bucket_width, project_ids, group_by, limit, page, &context).await
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
        ) -> Result<UsageEmbeddingsResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().usage_embeddings(start_time, end_time, bucket_width, project_ids, user_ids, api_key_ids, models, group_by, limit, page, &context).await
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
        ) -> Result<UsageImagesResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().usage_images(start_time, end_time, bucket_width, sources, sizes, project_ids, user_ids, api_key_ids, models, group_by, limit, page, &context).await
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
        ) -> Result<UsageModerationsResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().usage_moderations(start_time, end_time, bucket_width, project_ids, user_ids, api_key_ids, models, group_by, limit, page, &context).await
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
        ) -> Result<UsageVectorStoresResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().usage_vector_stores(start_time, end_time, bucket_width, project_ids, group_by, limit, page, &context).await
    }

    /// Lists all of the users in the organization.
    async fn list_users(
        &self,
        limit: Option<i32>,
        after: Option<String>,
        ) -> Result<ListUsersResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().list_users(limit, after, &context).await
    }

    /// Deletes a user from the organization.
    async fn delete_user(
        &self,
        user_id: String,
        ) -> Result<DeleteUserResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().delete_user(user_id, &context).await
    }

    /// Modifies a user's role in the organization.
    async fn modify_user(
        &self,
        user_id: String,
        user_role_update_request: models::UserRoleUpdateRequest,
        ) -> Result<ModifyUserResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().modify_user(user_id, user_role_update_request, &context).await
    }

    /// Retrieves a user by their identifier.
    async fn retrieve_user(
        &self,
        user_id: String,
        ) -> Result<RetrieveUserResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().retrieve_user(user_id, &context).await
    }

    /// Create a vector store.
    async fn create_vector_store(
        &self,
        create_vector_store_request: models::CreateVectorStoreRequest,
        ) -> Result<CreateVectorStoreResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().create_vector_store(create_vector_store_request, &context).await
    }

    /// Returns a list of vector stores.
    async fn list_vector_stores(
        &self,
        limit: Option<i32>,
        order: Option<models::ListAssistantsOrderParameter>,
        after: Option<String>,
        before: Option<String>,
        ) -> Result<ListVectorStoresResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().list_vector_stores(limit, order, after, before, &context).await
    }

    /// Create a vector store file by attaching a [File](/docs/api-reference/files) to a [vector store](/docs/api-reference/vector-stores/object).
    async fn create_vector_store_file(
        &self,
        vector_store_id: String,
        create_vector_store_file_request: models::CreateVectorStoreFileRequest,
        ) -> Result<CreateVectorStoreFileResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().create_vector_store_file(vector_store_id, create_vector_store_file_request, &context).await
    }

    /// Create a vector store file batch.
    async fn create_vector_store_file_batch(
        &self,
        vector_store_id: String,
        create_vector_store_file_batch_request: models::CreateVectorStoreFileBatchRequest,
        ) -> Result<CreateVectorStoreFileBatchResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().create_vector_store_file_batch(vector_store_id, create_vector_store_file_batch_request, &context).await
    }

    /// Delete a vector store.
    async fn delete_vector_store(
        &self,
        vector_store_id: String,
        ) -> Result<DeleteVectorStoreResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().delete_vector_store(vector_store_id, &context).await
    }

    /// Retrieves a vector store.
    async fn get_vector_store(
        &self,
        vector_store_id: String,
        ) -> Result<GetVectorStoreResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().get_vector_store(vector_store_id, &context).await
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
        ) -> Result<ListVectorStoreFilesResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().list_vector_store_files(vector_store_id, limit, order, after, before, filter, &context).await
    }

    /// Modifies a vector store.
    async fn modify_vector_store(
        &self,
        vector_store_id: String,
        update_vector_store_request: models::UpdateVectorStoreRequest,
        ) -> Result<ModifyVectorStoreResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().modify_vector_store(vector_store_id, update_vector_store_request, &context).await
    }

    /// Cancel a vector store file batch. This attempts to cancel the processing of files in this batch as soon as possible.
    async fn cancel_vector_store_file_batch(
        &self,
        vector_store_id: String,
        batch_id: String,
        ) -> Result<CancelVectorStoreFileBatchResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().cancel_vector_store_file_batch(vector_store_id, batch_id, &context).await
    }

    /// Delete a vector store file. This will remove the file from the vector store but the file itself will not be deleted. To delete the file, use the [delete file](/docs/api-reference/files/delete) endpoint.
    async fn delete_vector_store_file(
        &self,
        vector_store_id: String,
        file_id: String,
        ) -> Result<DeleteVectorStoreFileResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().delete_vector_store_file(vector_store_id, file_id, &context).await
    }

    /// Retrieves a vector store file.
    async fn get_vector_store_file(
        &self,
        vector_store_id: String,
        file_id: String,
        ) -> Result<GetVectorStoreFileResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().get_vector_store_file(vector_store_id, file_id, &context).await
    }

    /// Retrieves a vector store file batch.
    async fn get_vector_store_file_batch(
        &self,
        vector_store_id: String,
        batch_id: String,
        ) -> Result<GetVectorStoreFileBatchResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().get_vector_store_file_batch(vector_store_id, batch_id, &context).await
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
        ) -> Result<ListFilesInVectorStoreBatchResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().list_files_in_vector_store_batch(vector_store_id, batch_id, limit, order, after, before, filter, &context).await
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
