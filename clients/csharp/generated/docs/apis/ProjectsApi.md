# Org.OpenAPITools.Api.ProjectsApi

All URIs are relative to *https://api.openai.com/v1*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**ArchiveProject**](ProjectsApi.md#archiveproject) | **POST** /organization/projects/{project_id}/archive | Archives a project in the organization. Archived projects cannot be used or updated. |
| [**CreateProject**](ProjectsApi.md#createproject) | **POST** /organization/projects | Create a new project in the organization. Projects can be created and archived, but cannot be deleted. |
| [**CreateProjectServiceAccount**](ProjectsApi.md#createprojectserviceaccount) | **POST** /organization/projects/{project_id}/service_accounts | Creates a new service account in the project. This also returns an unredacted API key for the service account. |
| [**CreateProjectUser**](ProjectsApi.md#createprojectuser) | **POST** /organization/projects/{project_id}/users | Adds a user to the project. Users must already be members of the organization to be added to a project. |
| [**DeleteProjectApiKey**](ProjectsApi.md#deleteprojectapikey) | **DELETE** /organization/projects/{project_id}/api_keys/{key_id} | Deletes an API key from the project. |
| [**DeleteProjectServiceAccount**](ProjectsApi.md#deleteprojectserviceaccount) | **DELETE** /organization/projects/{project_id}/service_accounts/{service_account_id} | Deletes a service account from the project. |
| [**DeleteProjectUser**](ProjectsApi.md#deleteprojectuser) | **DELETE** /organization/projects/{project_id}/users/{user_id} | Deletes a user from the project. |
| [**ListProjectApiKeys**](ProjectsApi.md#listprojectapikeys) | **GET** /organization/projects/{project_id}/api_keys | Returns a list of API keys in the project. |
| [**ListProjectRateLimits**](ProjectsApi.md#listprojectratelimits) | **GET** /organization/projects/{project_id}/rate_limits | Returns the rate limits per model for a project. |
| [**ListProjectServiceAccounts**](ProjectsApi.md#listprojectserviceaccounts) | **GET** /organization/projects/{project_id}/service_accounts | Returns a list of service accounts in the project. |
| [**ListProjectUsers**](ProjectsApi.md#listprojectusers) | **GET** /organization/projects/{project_id}/users | Returns a list of users in the project. |
| [**ListProjects**](ProjectsApi.md#listprojects) | **GET** /organization/projects | Returns a list of projects. |
| [**ModifyProject**](ProjectsApi.md#modifyproject) | **POST** /organization/projects/{project_id} | Modifies a project in the organization. |
| [**ModifyProjectUser**](ProjectsApi.md#modifyprojectuser) | **POST** /organization/projects/{project_id}/users/{user_id} | Modifies a user&#39;s role in the project. |
| [**RetrieveProject**](ProjectsApi.md#retrieveproject) | **GET** /organization/projects/{project_id} | Retrieves a project. |
| [**RetrieveProjectApiKey**](ProjectsApi.md#retrieveprojectapikey) | **GET** /organization/projects/{project_id}/api_keys/{key_id} | Retrieves an API key in the project. |
| [**RetrieveProjectServiceAccount**](ProjectsApi.md#retrieveprojectserviceaccount) | **GET** /organization/projects/{project_id}/service_accounts/{service_account_id} | Retrieves a service account in the project. |
| [**RetrieveProjectUser**](ProjectsApi.md#retrieveprojectuser) | **GET** /organization/projects/{project_id}/users/{user_id} | Retrieves a user in the project. |
| [**UpdateProjectRateLimits**](ProjectsApi.md#updateprojectratelimits) | **POST** /organization/projects/{project_id}/rate_limits/{rate_limit_id} | Updates a project rate limit. |

<a id="archiveproject"></a>
# **ArchiveProject**
> Project ArchiveProject (string projectId)

Archives a project in the organization. Archived projects cannot be used or updated.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **projectId** | **string** | The ID of the project. |  |

### Return type

[**Project**](Project.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Project archived successfully. |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="createproject"></a>
# **CreateProject**
> Project CreateProject (ProjectCreateRequest projectCreateRequest)

Create a new project in the organization. Projects can be created and archived, but cannot be deleted.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **projectCreateRequest** | [**ProjectCreateRequest**](ProjectCreateRequest.md) | The project create request payload. |  |

### Return type

[**Project**](Project.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Project created successfully. |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="createprojectserviceaccount"></a>
# **CreateProjectServiceAccount**
> ProjectServiceAccountCreateResponse CreateProjectServiceAccount (string projectId, ProjectServiceAccountCreateRequest projectServiceAccountCreateRequest)

Creates a new service account in the project. This also returns an unredacted API key for the service account.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **projectId** | **string** | The ID of the project. |  |
| **projectServiceAccountCreateRequest** | [**ProjectServiceAccountCreateRequest**](ProjectServiceAccountCreateRequest.md) | The project service account create request payload. |  |

### Return type

[**ProjectServiceAccountCreateResponse**](ProjectServiceAccountCreateResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Project service account created successfully. |  -  |
| **400** | Error response when project is archived. |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="createprojectuser"></a>
# **CreateProjectUser**
> ProjectUser CreateProjectUser (string projectId, ProjectUserCreateRequest projectUserCreateRequest)

Adds a user to the project. Users must already be members of the organization to be added to a project.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **projectId** | **string** | The ID of the project. |  |
| **projectUserCreateRequest** | [**ProjectUserCreateRequest**](ProjectUserCreateRequest.md) | The project user create request payload. |  |

### Return type

[**ProjectUser**](ProjectUser.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | User added to project successfully. |  -  |
| **400** | Error response for various conditions. |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="deleteprojectapikey"></a>
# **DeleteProjectApiKey**
> ProjectApiKeyDeleteResponse DeleteProjectApiKey (string projectId, string keyId)

Deletes an API key from the project.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **projectId** | **string** | The ID of the project. |  |
| **keyId** | **string** | The ID of the API key. |  |

### Return type

[**ProjectApiKeyDeleteResponse**](ProjectApiKeyDeleteResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Project API key deleted successfully. |  -  |
| **400** | Error response for various conditions. |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="deleteprojectserviceaccount"></a>
# **DeleteProjectServiceAccount**
> ProjectServiceAccountDeleteResponse DeleteProjectServiceAccount (string projectId, string serviceAccountId)

Deletes a service account from the project.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **projectId** | **string** | The ID of the project. |  |
| **serviceAccountId** | **string** | The ID of the service account. |  |

### Return type

[**ProjectServiceAccountDeleteResponse**](ProjectServiceAccountDeleteResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Project service account deleted successfully. |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="deleteprojectuser"></a>
# **DeleteProjectUser**
> ProjectUserDeleteResponse DeleteProjectUser (string projectId, string userId)

Deletes a user from the project.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **projectId** | **string** | The ID of the project. |  |
| **userId** | **string** | The ID of the user. |  |

### Return type

[**ProjectUserDeleteResponse**](ProjectUserDeleteResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Project user deleted successfully. |  -  |
| **400** | Error response for various conditions. |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="listprojectapikeys"></a>
# **ListProjectApiKeys**
> ProjectApiKeyListResponse ListProjectApiKeys (string projectId, int limit = null, string after = null)

Returns a list of API keys in the project.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **projectId** | **string** | The ID of the project. |  |
| **limit** | **int** | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20] |
| **after** | **string** | A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional]  |

### Return type

[**ProjectApiKeyListResponse**](ProjectApiKeyListResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Project API keys listed successfully. |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="listprojectratelimits"></a>
# **ListProjectRateLimits**
> ProjectRateLimitListResponse ListProjectRateLimits (string projectId, int limit = null, string after = null, string before = null)

Returns the rate limits per model for a project.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **projectId** | **string** | The ID of the project. |  |
| **limit** | **int** | A limit on the number of objects to be returned. The default is 100.  | [optional] [default to 100] |
| **after** | **string** | A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional]  |
| **before** | **string** | A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, beginning with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [optional]  |

### Return type

[**ProjectRateLimitListResponse**](ProjectRateLimitListResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Project rate limits listed successfully. |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="listprojectserviceaccounts"></a>
# **ListProjectServiceAccounts**
> ProjectServiceAccountListResponse ListProjectServiceAccounts (string projectId, int limit = null, string after = null)

Returns a list of service accounts in the project.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **projectId** | **string** | The ID of the project. |  |
| **limit** | **int** | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20] |
| **after** | **string** | A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional]  |

### Return type

[**ProjectServiceAccountListResponse**](ProjectServiceAccountListResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Project service accounts listed successfully. |  -  |
| **400** | Error response when project is archived. |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="listprojectusers"></a>
# **ListProjectUsers**
> ProjectUserListResponse ListProjectUsers (string projectId, int limit = null, string after = null)

Returns a list of users in the project.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **projectId** | **string** | The ID of the project. |  |
| **limit** | **int** | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20] |
| **after** | **string** | A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional]  |

### Return type

[**ProjectUserListResponse**](ProjectUserListResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Project users listed successfully. |  -  |
| **400** | Error response when project is archived. |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="listprojects"></a>
# **ListProjects**
> ProjectListResponse ListProjects (int limit = null, string after = null, bool includeArchived = null)

Returns a list of projects.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **limit** | **int** | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20] |
| **after** | **string** | A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional]  |
| **includeArchived** | **bool** | If &#x60;true&#x60; returns all projects including those that have been &#x60;archived&#x60;. Archived projects are not included by default. | [optional] [default to false] |

### Return type

[**ProjectListResponse**](ProjectListResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Projects listed successfully. |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="modifyproject"></a>
# **ModifyProject**
> Project ModifyProject (string projectId, ProjectUpdateRequest projectUpdateRequest)

Modifies a project in the organization.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **projectId** | **string** | The ID of the project. |  |
| **projectUpdateRequest** | [**ProjectUpdateRequest**](ProjectUpdateRequest.md) | The project update request payload. |  |

### Return type

[**Project**](Project.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Project updated successfully. |  -  |
| **400** | Error response when updating the default project. |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="modifyprojectuser"></a>
# **ModifyProjectUser**
> ProjectUser ModifyProjectUser (string projectId, string userId, ProjectUserUpdateRequest projectUserUpdateRequest)

Modifies a user's role in the project.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **projectId** | **string** | The ID of the project. |  |
| **userId** | **string** | The ID of the user. |  |
| **projectUserUpdateRequest** | [**ProjectUserUpdateRequest**](ProjectUserUpdateRequest.md) | The project user update request payload. |  |

### Return type

[**ProjectUser**](ProjectUser.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Project user&#39;s role updated successfully. |  -  |
| **400** | Error response for various conditions. |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="retrieveproject"></a>
# **RetrieveProject**
> Project RetrieveProject (string projectId)

Retrieves a project.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **projectId** | **string** | The ID of the project. |  |

### Return type

[**Project**](Project.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Project retrieved successfully. |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="retrieveprojectapikey"></a>
# **RetrieveProjectApiKey**
> ProjectApiKey RetrieveProjectApiKey (string projectId, string keyId)

Retrieves an API key in the project.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **projectId** | **string** | The ID of the project. |  |
| **keyId** | **string** | The ID of the API key. |  |

### Return type

[**ProjectApiKey**](ProjectApiKey.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Project API key retrieved successfully. |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="retrieveprojectserviceaccount"></a>
# **RetrieveProjectServiceAccount**
> ProjectServiceAccount RetrieveProjectServiceAccount (string projectId, string serviceAccountId)

Retrieves a service account in the project.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **projectId** | **string** | The ID of the project. |  |
| **serviceAccountId** | **string** | The ID of the service account. |  |

### Return type

[**ProjectServiceAccount**](ProjectServiceAccount.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Project service account retrieved successfully. |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="retrieveprojectuser"></a>
# **RetrieveProjectUser**
> ProjectUser RetrieveProjectUser (string projectId, string userId)

Retrieves a user in the project.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **projectId** | **string** | The ID of the project. |  |
| **userId** | **string** | The ID of the user. |  |

### Return type

[**ProjectUser**](ProjectUser.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Project user retrieved successfully. |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="updateprojectratelimits"></a>
# **UpdateProjectRateLimits**
> ProjectRateLimit UpdateProjectRateLimits (string projectId, string rateLimitId, ProjectRateLimitUpdateRequest projectRateLimitUpdateRequest)

Updates a project rate limit.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **projectId** | **string** | The ID of the project. |  |
| **rateLimitId** | **string** | The ID of the rate limit. |  |
| **projectRateLimitUpdateRequest** | [**ProjectRateLimitUpdateRequest**](ProjectRateLimitUpdateRequest.md) | The project rate limit update request payload. |  |

### Return type

[**ProjectRateLimit**](ProjectRateLimit.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Project rate limit updated successfully. |  -  |
| **400** | Error response for various conditions. |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

