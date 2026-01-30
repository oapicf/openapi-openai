# projects_api

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ArchiveProject**](projects_api.md#ArchiveProject) | **POST** /organization/projects/{project_id}/archive | Archives a project in the organization. Archived projects cannot be used or updated.
[**CreateProject**](projects_api.md#CreateProject) | **POST** /organization/projects | Create a new project in the organization. Projects can be created and archived, but cannot be deleted.
[**CreateProjectServiceAccount**](projects_api.md#CreateProjectServiceAccount) | **POST** /organization/projects/{project_id}/service_accounts | Creates a new service account in the project. This also returns an unredacted API key for the service account.
[**CreateProjectUser**](projects_api.md#CreateProjectUser) | **POST** /organization/projects/{project_id}/users | Adds a user to the project. Users must already be members of the organization to be added to a project.
[**DeleteProjectApiKey**](projects_api.md#DeleteProjectApiKey) | **DELETE** /organization/projects/{project_id}/api_keys/{key_id} | Deletes an API key from the project.
[**DeleteProjectServiceAccount**](projects_api.md#DeleteProjectServiceAccount) | **DELETE** /organization/projects/{project_id}/service_accounts/{service_account_id} | Deletes a service account from the project.
[**DeleteProjectUser**](projects_api.md#DeleteProjectUser) | **DELETE** /organization/projects/{project_id}/users/{user_id} | Deletes a user from the project.
[**ListProjectApiKeys**](projects_api.md#ListProjectApiKeys) | **GET** /organization/projects/{project_id}/api_keys | Returns a list of API keys in the project.
[**ListProjectRateLimits**](projects_api.md#ListProjectRateLimits) | **GET** /organization/projects/{project_id}/rate_limits | Returns the rate limits per model for a project.
[**ListProjectServiceAccounts**](projects_api.md#ListProjectServiceAccounts) | **GET** /organization/projects/{project_id}/service_accounts | Returns a list of service accounts in the project.
[**ListProjectUsers**](projects_api.md#ListProjectUsers) | **GET** /organization/projects/{project_id}/users | Returns a list of users in the project.
[**ListProjects**](projects_api.md#ListProjects) | **GET** /organization/projects | Returns a list of projects.
[**ModifyProject**](projects_api.md#ModifyProject) | **POST** /organization/projects/{project_id} | Modifies a project in the organization.
[**ModifyProjectUser**](projects_api.md#ModifyProjectUser) | **POST** /organization/projects/{project_id}/users/{user_id} | Modifies a user&#39;s role in the project.
[**RetrieveProject**](projects_api.md#RetrieveProject) | **GET** /organization/projects/{project_id} | Retrieves a project.
[**RetrieveProjectApiKey**](projects_api.md#RetrieveProjectApiKey) | **GET** /organization/projects/{project_id}/api_keys/{key_id} | Retrieves an API key in the project.
[**RetrieveProjectServiceAccount**](projects_api.md#RetrieveProjectServiceAccount) | **GET** /organization/projects/{project_id}/service_accounts/{service_account_id} | Retrieves a service account in the project.
[**RetrieveProjectUser**](projects_api.md#RetrieveProjectUser) | **GET** /organization/projects/{project_id}/users/{user_id} | Retrieves a user in the project.
[**UpdateProjectRateLimits**](projects_api.md#UpdateProjectRateLimits) | **POST** /organization/projects/{project_id}/rate_limits/{rate_limit_id} | Updates a project rate limit.


<a name="ArchiveProject"></a>
# **ArchiveProject**
> Project ArchiveProject(projectId)

Archives a project in the organization. Archived projects cannot be used or updated.
<a name="CreateProject"></a>
# **CreateProject**
> Project CreateProject(projectCreateRequest)

Create a new project in the organization. Projects can be created and archived, but cannot be deleted.
<a name="CreateProjectServiceAccount"></a>
# **CreateProjectServiceAccount**
> ProjectServiceAccountCreateResponse CreateProjectServiceAccount(projectId, projectServiceAccountCreateRequest)

Creates a new service account in the project. This also returns an unredacted API key for the service account.
<a name="CreateProjectUser"></a>
# **CreateProjectUser**
> ProjectUser CreateProjectUser(projectId, projectUserCreateRequest)

Adds a user to the project. Users must already be members of the organization to be added to a project.
<a name="DeleteProjectApiKey"></a>
# **DeleteProjectApiKey**
> ProjectApiKeyDeleteResponse DeleteProjectApiKey(projectId, keyId)

Deletes an API key from the project.
<a name="DeleteProjectServiceAccount"></a>
# **DeleteProjectServiceAccount**
> ProjectServiceAccountDeleteResponse DeleteProjectServiceAccount(projectId, serviceAccountId)

Deletes a service account from the project.
<a name="DeleteProjectUser"></a>
# **DeleteProjectUser**
> ProjectUserDeleteResponse DeleteProjectUser(projectId, userId)

Deletes a user from the project.
<a name="ListProjectApiKeys"></a>
# **ListProjectApiKeys**
> ProjectApiKeyListResponse ListProjectApiKeys(projectId, limit, after)

Returns a list of API keys in the project.
<a name="ListProjectRateLimits"></a>
# **ListProjectRateLimits**
> ProjectRateLimitListResponse ListProjectRateLimits(projectId, limit, after, before)

Returns the rate limits per model for a project.
<a name="ListProjectServiceAccounts"></a>
# **ListProjectServiceAccounts**
> ProjectServiceAccountListResponse ListProjectServiceAccounts(projectId, limit, after)

Returns a list of service accounts in the project.
<a name="ListProjectUsers"></a>
# **ListProjectUsers**
> ProjectUserListResponse ListProjectUsers(projectId, limit, after)

Returns a list of users in the project.
<a name="ListProjects"></a>
# **ListProjects**
> ProjectListResponse ListProjects(limit, after, includeArchived)

Returns a list of projects.
<a name="ModifyProject"></a>
# **ModifyProject**
> Project ModifyProject(projectId, projectUpdateRequest)

Modifies a project in the organization.
<a name="ModifyProjectUser"></a>
# **ModifyProjectUser**
> ProjectUser ModifyProjectUser(projectId, userId, projectUserUpdateRequest)

Modifies a user&#39;s role in the project.
<a name="RetrieveProject"></a>
# **RetrieveProject**
> Project RetrieveProject(projectId)

Retrieves a project.
<a name="RetrieveProjectApiKey"></a>
# **RetrieveProjectApiKey**
> ProjectApiKey RetrieveProjectApiKey(projectId, keyId)

Retrieves an API key in the project.
<a name="RetrieveProjectServiceAccount"></a>
# **RetrieveProjectServiceAccount**
> ProjectServiceAccount RetrieveProjectServiceAccount(projectId, serviceAccountId)

Retrieves a service account in the project.
<a name="RetrieveProjectUser"></a>
# **RetrieveProjectUser**
> ProjectUser RetrieveProjectUser(projectId, userId)

Retrieves a user in the project.
<a name="UpdateProjectRateLimits"></a>
# **UpdateProjectRateLimits**
> ProjectRateLimit UpdateProjectRateLimits(projectId, rateLimitId, projectRateLimitUpdateRequest)

Updates a project rate limit.
