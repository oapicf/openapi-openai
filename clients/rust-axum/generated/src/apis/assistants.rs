use async_trait::async_trait;
use axum::extract::*;
use axum_extra::extract::{CookieJar, Host};
use bytes::Bytes;
use http::Method;
use serde::{Deserialize, Serialize};

use crate::{models, types::*};

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
pub enum DeleteMessageResponse {
    /// OK
    Status200_OK
    (models::DeleteMessageResponse)
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
pub enum GetMessageResponse {
    /// OK
    Status200_OK
    (models::MessageObject)
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
pub enum ListAssistantsResponse {
    /// OK
    Status200_OK
    (models::ListAssistantsResponse)
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




/// Assistants
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait Assistants<E: std::fmt::Debug + Send + Sync + 'static = ()>: super::ErrorHandler<E> {
    type Claims;

    /// Cancels a run that is `in_progress`..
    ///
    /// CancelRun - POST /v1/threads/{thread_id}/runs/{run_id}/cancel
    async fn cancel_run(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      path_params: &models::CancelRunPathParams,
    ) -> Result<CancelRunResponse, E>;

    /// Create an assistant with a model and instructions..
    ///
    /// CreateAssistant - POST /v1/assistants
    async fn create_assistant(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
            body: &models::CreateAssistantRequest,
    ) -> Result<CreateAssistantResponse, E>;

    /// Create a message..
    ///
    /// CreateMessage - POST /v1/threads/{thread_id}/messages
    async fn create_message(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      path_params: &models::CreateMessagePathParams,
            body: &models::CreateMessageRequest,
    ) -> Result<CreateMessageResponse, E>;

    /// Create a run..
    ///
    /// CreateRun - POST /v1/threads/{thread_id}/runs
    async fn create_run(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      path_params: &models::CreateRunPathParams,
      query_params: &models::CreateRunQueryParams,
            body: &models::CreateRunRequest,
    ) -> Result<CreateRunResponse, E>;

    /// Create a thread..
    ///
    /// CreateThread - POST /v1/threads
    async fn create_thread(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
            body: &Option<models::CreateThreadRequest>,
    ) -> Result<CreateThreadResponse, E>;

    /// Create a thread and run it in one request..
    ///
    /// CreateThreadAndRun - POST /v1/threads/runs
    async fn create_thread_and_run(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
            body: &models::CreateThreadAndRunRequest,
    ) -> Result<CreateThreadAndRunResponse, E>;

    /// Delete an assistant..
    ///
    /// DeleteAssistant - DELETE /v1/assistants/{assistant_id}
    async fn delete_assistant(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      path_params: &models::DeleteAssistantPathParams,
    ) -> Result<DeleteAssistantResponse, E>;

    /// Deletes a message..
    ///
    /// DeleteMessage - DELETE /v1/threads/{thread_id}/messages/{message_id}
    async fn delete_message(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      path_params: &models::DeleteMessagePathParams,
    ) -> Result<DeleteMessageResponse, E>;

    /// Delete a thread..
    ///
    /// DeleteThread - DELETE /v1/threads/{thread_id}
    async fn delete_thread(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      path_params: &models::DeleteThreadPathParams,
    ) -> Result<DeleteThreadResponse, E>;

    /// Retrieves an assistant..
    ///
    /// GetAssistant - GET /v1/assistants/{assistant_id}
    async fn get_assistant(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      path_params: &models::GetAssistantPathParams,
    ) -> Result<GetAssistantResponse, E>;

    /// Retrieve a message..
    ///
    /// GetMessage - GET /v1/threads/{thread_id}/messages/{message_id}
    async fn get_message(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      path_params: &models::GetMessagePathParams,
    ) -> Result<GetMessageResponse, E>;

    /// Retrieves a run..
    ///
    /// GetRun - GET /v1/threads/{thread_id}/runs/{run_id}
    async fn get_run(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      path_params: &models::GetRunPathParams,
    ) -> Result<GetRunResponse, E>;

    /// Retrieves a run step..
    ///
    /// GetRunStep - GET /v1/threads/{thread_id}/runs/{run_id}/steps/{step_id}
    async fn get_run_step(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      path_params: &models::GetRunStepPathParams,
      query_params: &models::GetRunStepQueryParams,
    ) -> Result<GetRunStepResponse, E>;

    /// Retrieves a thread..
    ///
    /// GetThread - GET /v1/threads/{thread_id}
    async fn get_thread(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      path_params: &models::GetThreadPathParams,
    ) -> Result<GetThreadResponse, E>;

    /// Returns a list of assistants..
    ///
    /// ListAssistants - GET /v1/assistants
    async fn list_assistants(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ListAssistantsQueryParams,
    ) -> Result<ListAssistantsResponse, E>;

    /// Returns a list of messages for a given thread..
    ///
    /// ListMessages - GET /v1/threads/{thread_id}/messages
    async fn list_messages(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      path_params: &models::ListMessagesPathParams,
      query_params: &models::ListMessagesQueryParams,
    ) -> Result<ListMessagesResponse, E>;

    /// Returns a list of run steps belonging to a run..
    ///
    /// ListRunSteps - GET /v1/threads/{thread_id}/runs/{run_id}/steps
    async fn list_run_steps(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      path_params: &models::ListRunStepsPathParams,
      query_params: &models::ListRunStepsQueryParams,
    ) -> Result<ListRunStepsResponse, E>;

    /// Returns a list of runs belonging to a thread..
    ///
    /// ListRuns - GET /v1/threads/{thread_id}/runs
    async fn list_runs(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      path_params: &models::ListRunsPathParams,
      query_params: &models::ListRunsQueryParams,
    ) -> Result<ListRunsResponse, E>;

    /// Modifies an assistant..
    ///
    /// ModifyAssistant - POST /v1/assistants/{assistant_id}
    async fn modify_assistant(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      path_params: &models::ModifyAssistantPathParams,
            body: &models::ModifyAssistantRequest,
    ) -> Result<ModifyAssistantResponse, E>;

    /// Modifies a message..
    ///
    /// ModifyMessage - POST /v1/threads/{thread_id}/messages/{message_id}
    async fn modify_message(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      path_params: &models::ModifyMessagePathParams,
            body: &models::ModifyMessageRequest,
    ) -> Result<ModifyMessageResponse, E>;

    /// Modifies a run..
    ///
    /// ModifyRun - POST /v1/threads/{thread_id}/runs/{run_id}
    async fn modify_run(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      path_params: &models::ModifyRunPathParams,
            body: &models::ModifyRunRequest,
    ) -> Result<ModifyRunResponse, E>;

    /// Modifies a thread..
    ///
    /// ModifyThread - POST /v1/threads/{thread_id}
    async fn modify_thread(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      path_params: &models::ModifyThreadPathParams,
            body: &models::ModifyThreadRequest,
    ) -> Result<ModifyThreadResponse, E>;

    /// When a run has the `status: \"requires_action\"` and `required_action.type` is `submit_tool_outputs`, this endpoint can be used to submit the outputs from the tool calls once they're all completed. All outputs must be submitted in a single request. .
    ///
    /// SubmitToolOuputsToRun - POST /v1/threads/{thread_id}/runs/{run_id}/submit_tool_outputs
    async fn submit_tool_ouputs_to_run(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      path_params: &models::SubmitToolOuputsToRunPathParams,
            body: &models::SubmitToolOutputsRunRequest,
    ) -> Result<SubmitToolOuputsToRunResponse, E>;
}
