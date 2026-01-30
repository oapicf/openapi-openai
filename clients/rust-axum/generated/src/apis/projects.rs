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
pub enum ArchiveProjectResponse {
    /// Project archived successfully.
    Status200_ProjectArchivedSuccessfully
    (models::Project)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum CreateProjectResponse {
    /// Project created successfully.
    Status200_ProjectCreatedSuccessfully
    (models::Project)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum CreateProjectServiceAccountResponse {
    /// Project service account created successfully.
    Status200_ProjectServiceAccountCreatedSuccessfully
    (models::ProjectServiceAccountCreateResponse)
    ,
    /// Error response when project is archived.
    Status400_ErrorResponseWhenProjectIsArchived
    (models::ErrorResponse)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum CreateProjectUserResponse {
    /// User added to project successfully.
    Status200_UserAddedToProjectSuccessfully
    (models::ProjectUser)
    ,
    /// Error response for various conditions.
    Status400_ErrorResponseForVariousConditions
    (models::ErrorResponse)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum DeleteProjectApiKeyResponse {
    /// Project API key deleted successfully.
    Status200_ProjectAPIKeyDeletedSuccessfully
    (models::ProjectApiKeyDeleteResponse)
    ,
    /// Error response for various conditions.
    Status400_ErrorResponseForVariousConditions
    (models::ErrorResponse)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum DeleteProjectServiceAccountResponse {
    /// Project service account deleted successfully.
    Status200_ProjectServiceAccountDeletedSuccessfully
    (models::ProjectServiceAccountDeleteResponse)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum DeleteProjectUserResponse {
    /// Project user deleted successfully.
    Status200_ProjectUserDeletedSuccessfully
    (models::ProjectUserDeleteResponse)
    ,
    /// Error response for various conditions.
    Status400_ErrorResponseForVariousConditions
    (models::ErrorResponse)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ListProjectApiKeysResponse {
    /// Project API keys listed successfully.
    Status200_ProjectAPIKeysListedSuccessfully
    (models::ProjectApiKeyListResponse)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ListProjectRateLimitsResponse {
    /// Project rate limits listed successfully.
    Status200_ProjectRateLimitsListedSuccessfully
    (models::ProjectRateLimitListResponse)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ListProjectServiceAccountsResponse {
    /// Project service accounts listed successfully.
    Status200_ProjectServiceAccountsListedSuccessfully
    (models::ProjectServiceAccountListResponse)
    ,
    /// Error response when project is archived.
    Status400_ErrorResponseWhenProjectIsArchived
    (models::ErrorResponse)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ListProjectUsersResponse {
    /// Project users listed successfully.
    Status200_ProjectUsersListedSuccessfully
    (models::ProjectUserListResponse)
    ,
    /// Error response when project is archived.
    Status400_ErrorResponseWhenProjectIsArchived
    (models::ErrorResponse)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ListProjectsResponse {
    /// Projects listed successfully.
    Status200_ProjectsListedSuccessfully
    (models::ProjectListResponse)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ModifyProjectResponse {
    /// Project updated successfully.
    Status200_ProjectUpdatedSuccessfully
    (models::Project)
    ,
    /// Error response when updating the default project.
    Status400_ErrorResponseWhenUpdatingTheDefaultProject
    (models::ErrorResponse)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ModifyProjectUserResponse {
    /// Project user's role updated successfully.
    Status200_ProjectUser
    (models::ProjectUser)
    ,
    /// Error response for various conditions.
    Status400_ErrorResponseForVariousConditions
    (models::ErrorResponse)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum RetrieveProjectResponse {
    /// Project retrieved successfully.
    Status200_ProjectRetrievedSuccessfully
    (models::Project)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum RetrieveProjectApiKeyResponse {
    /// Project API key retrieved successfully.
    Status200_ProjectAPIKeyRetrievedSuccessfully
    (models::ProjectApiKey)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum RetrieveProjectServiceAccountResponse {
    /// Project service account retrieved successfully.
    Status200_ProjectServiceAccountRetrievedSuccessfully
    (models::ProjectServiceAccount)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum RetrieveProjectUserResponse {
    /// Project user retrieved successfully.
    Status200_ProjectUserRetrievedSuccessfully
    (models::ProjectUser)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum UpdateProjectRateLimitsResponse {
    /// Project rate limit updated successfully.
    Status200_ProjectRateLimitUpdatedSuccessfully
    (models::ProjectRateLimit)
    ,
    /// Error response for various conditions.
    Status400_ErrorResponseForVariousConditions
    (models::ErrorResponse)
}




/// Projects
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait Projects<E: std::fmt::Debug + Send + Sync + 'static = ()>: super::ErrorHandler<E> {
    type Claims;

    /// Archives a project in the organization. Archived projects cannot be used or updated..
    ///
    /// ArchiveProject - POST /v1/organization/projects/{project_id}/archive
    async fn archive_project(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      path_params: &models::ArchiveProjectPathParams,
    ) -> Result<ArchiveProjectResponse, E>;

    /// Create a new project in the organization. Projects can be created and archived, but cannot be deleted..
    ///
    /// CreateProject - POST /v1/organization/projects
    async fn create_project(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
            body: &models::ProjectCreateRequest,
    ) -> Result<CreateProjectResponse, E>;

    /// Creates a new service account in the project. This also returns an unredacted API key for the service account..
    ///
    /// CreateProjectServiceAccount - POST /v1/organization/projects/{project_id}/service_accounts
    async fn create_project_service_account(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      path_params: &models::CreateProjectServiceAccountPathParams,
            body: &models::ProjectServiceAccountCreateRequest,
    ) -> Result<CreateProjectServiceAccountResponse, E>;

    /// Adds a user to the project. Users must already be members of the organization to be added to a project..
    ///
    /// CreateProjectUser - POST /v1/organization/projects/{project_id}/users
    async fn create_project_user(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      path_params: &models::CreateProjectUserPathParams,
            body: &models::ProjectUserCreateRequest,
    ) -> Result<CreateProjectUserResponse, E>;

    /// Deletes an API key from the project..
    ///
    /// DeleteProjectApiKey - DELETE /v1/organization/projects/{project_id}/api_keys/{key_id}
    async fn delete_project_api_key(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      path_params: &models::DeleteProjectApiKeyPathParams,
    ) -> Result<DeleteProjectApiKeyResponse, E>;

    /// Deletes a service account from the project..
    ///
    /// DeleteProjectServiceAccount - DELETE /v1/organization/projects/{project_id}/service_accounts/{service_account_id}
    async fn delete_project_service_account(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      path_params: &models::DeleteProjectServiceAccountPathParams,
    ) -> Result<DeleteProjectServiceAccountResponse, E>;

    /// Deletes a user from the project..
    ///
    /// DeleteProjectUser - DELETE /v1/organization/projects/{project_id}/users/{user_id}
    async fn delete_project_user(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      path_params: &models::DeleteProjectUserPathParams,
    ) -> Result<DeleteProjectUserResponse, E>;

    /// Returns a list of API keys in the project..
    ///
    /// ListProjectApiKeys - GET /v1/organization/projects/{project_id}/api_keys
    async fn list_project_api_keys(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      path_params: &models::ListProjectApiKeysPathParams,
      query_params: &models::ListProjectApiKeysQueryParams,
    ) -> Result<ListProjectApiKeysResponse, E>;

    /// Returns the rate limits per model for a project..
    ///
    /// ListProjectRateLimits - GET /v1/organization/projects/{project_id}/rate_limits
    async fn list_project_rate_limits(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      path_params: &models::ListProjectRateLimitsPathParams,
      query_params: &models::ListProjectRateLimitsQueryParams,
    ) -> Result<ListProjectRateLimitsResponse, E>;

    /// Returns a list of service accounts in the project..
    ///
    /// ListProjectServiceAccounts - GET /v1/organization/projects/{project_id}/service_accounts
    async fn list_project_service_accounts(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      path_params: &models::ListProjectServiceAccountsPathParams,
      query_params: &models::ListProjectServiceAccountsQueryParams,
    ) -> Result<ListProjectServiceAccountsResponse, E>;

    /// Returns a list of users in the project..
    ///
    /// ListProjectUsers - GET /v1/organization/projects/{project_id}/users
    async fn list_project_users(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      path_params: &models::ListProjectUsersPathParams,
      query_params: &models::ListProjectUsersQueryParams,
    ) -> Result<ListProjectUsersResponse, E>;

    /// Returns a list of projects..
    ///
    /// ListProjects - GET /v1/organization/projects
    async fn list_projects(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ListProjectsQueryParams,
    ) -> Result<ListProjectsResponse, E>;

    /// Modifies a project in the organization..
    ///
    /// ModifyProject - POST /v1/organization/projects/{project_id}
    async fn modify_project(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      path_params: &models::ModifyProjectPathParams,
            body: &models::ProjectUpdateRequest,
    ) -> Result<ModifyProjectResponse, E>;

    /// Modifies a user's role in the project..
    ///
    /// ModifyProjectUser - POST /v1/organization/projects/{project_id}/users/{user_id}
    async fn modify_project_user(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      path_params: &models::ModifyProjectUserPathParams,
            body: &models::ProjectUserUpdateRequest,
    ) -> Result<ModifyProjectUserResponse, E>;

    /// Retrieves a project..
    ///
    /// RetrieveProject - GET /v1/organization/projects/{project_id}
    async fn retrieve_project(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      path_params: &models::RetrieveProjectPathParams,
    ) -> Result<RetrieveProjectResponse, E>;

    /// Retrieves an API key in the project..
    ///
    /// RetrieveProjectApiKey - GET /v1/organization/projects/{project_id}/api_keys/{key_id}
    async fn retrieve_project_api_key(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      path_params: &models::RetrieveProjectApiKeyPathParams,
    ) -> Result<RetrieveProjectApiKeyResponse, E>;

    /// Retrieves a service account in the project..
    ///
    /// RetrieveProjectServiceAccount - GET /v1/organization/projects/{project_id}/service_accounts/{service_account_id}
    async fn retrieve_project_service_account(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      path_params: &models::RetrieveProjectServiceAccountPathParams,
    ) -> Result<RetrieveProjectServiceAccountResponse, E>;

    /// Retrieves a user in the project..
    ///
    /// RetrieveProjectUser - GET /v1/organization/projects/{project_id}/users/{user_id}
    async fn retrieve_project_user(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      path_params: &models::RetrieveProjectUserPathParams,
    ) -> Result<RetrieveProjectUserResponse, E>;

    /// Updates a project rate limit..
    ///
    /// UpdateProjectRateLimits - POST /v1/organization/projects/{project_id}/rate_limits/{rate_limit_id}
    async fn update_project_rate_limits(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      path_params: &models::UpdateProjectRateLimitsPathParams,
            body: &models::ProjectRateLimitUpdateRequest,
    ) -> Result<UpdateProjectRateLimitsResponse, E>;
}
