# ProjectsApi

All URIs are relative to *https://api.openai.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**archiveProject**](ProjectsApi.md#archiveProject) | **POST** /organization/projects/{project_id}/archive | Archives a project in the organization. Archived projects cannot be used or updated. |
| [**createProject**](ProjectsApi.md#createProject) | **POST** /organization/projects | Create a new project in the organization. Projects can be created and archived, but cannot be deleted. |
| [**createProjectServiceAccount**](ProjectsApi.md#createProjectServiceAccount) | **POST** /organization/projects/{project_id}/service_accounts | Creates a new service account in the project. This also returns an unredacted API key for the service account. |
| [**createProjectUser**](ProjectsApi.md#createProjectUser) | **POST** /organization/projects/{project_id}/users | Adds a user to the project. Users must already be members of the organization to be added to a project. |
| [**deleteProjectApiKey**](ProjectsApi.md#deleteProjectApiKey) | **DELETE** /organization/projects/{project_id}/api_keys/{key_id} | Deletes an API key from the project. |
| [**deleteProjectServiceAccount**](ProjectsApi.md#deleteProjectServiceAccount) | **DELETE** /organization/projects/{project_id}/service_accounts/{service_account_id} | Deletes a service account from the project. |
| [**deleteProjectUser**](ProjectsApi.md#deleteProjectUser) | **DELETE** /organization/projects/{project_id}/users/{user_id} | Deletes a user from the project. |
| [**listProjectApiKeys**](ProjectsApi.md#listProjectApiKeys) | **GET** /organization/projects/{project_id}/api_keys | Returns a list of API keys in the project. |
| [**listProjectRateLimits**](ProjectsApi.md#listProjectRateLimits) | **GET** /organization/projects/{project_id}/rate_limits | Returns the rate limits per model for a project. |
| [**listProjectServiceAccounts**](ProjectsApi.md#listProjectServiceAccounts) | **GET** /organization/projects/{project_id}/service_accounts | Returns a list of service accounts in the project. |
| [**listProjectUsers**](ProjectsApi.md#listProjectUsers) | **GET** /organization/projects/{project_id}/users | Returns a list of users in the project. |
| [**listProjects**](ProjectsApi.md#listProjects) | **GET** /organization/projects | Returns a list of projects. |
| [**modifyProject**](ProjectsApi.md#modifyProject) | **POST** /organization/projects/{project_id} | Modifies a project in the organization. |
| [**modifyProjectUser**](ProjectsApi.md#modifyProjectUser) | **POST** /organization/projects/{project_id}/users/{user_id} | Modifies a user&#39;s role in the project. |
| [**retrieveProject**](ProjectsApi.md#retrieveProject) | **GET** /organization/projects/{project_id} | Retrieves a project. |
| [**retrieveProjectApiKey**](ProjectsApi.md#retrieveProjectApiKey) | **GET** /organization/projects/{project_id}/api_keys/{key_id} | Retrieves an API key in the project. |
| [**retrieveProjectServiceAccount**](ProjectsApi.md#retrieveProjectServiceAccount) | **GET** /organization/projects/{project_id}/service_accounts/{service_account_id} | Retrieves a service account in the project. |
| [**retrieveProjectUser**](ProjectsApi.md#retrieveProjectUser) | **GET** /organization/projects/{project_id}/users/{user_id} | Retrieves a user in the project. |
| [**updateProjectRateLimits**](ProjectsApi.md#updateProjectRateLimits) | **POST** /organization/projects/{project_id}/rate_limits/{rate_limit_id} | Updates a project rate limit. |


<a name="archiveProject"></a>
# **archiveProject**
> Project archiveProject(project\_id)

Archives a project in the organization. Archived projects cannot be used or updated.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **project\_id** | **String**| The ID of the project. | [default to null] |

### Return type

[**Project**](../Models/Project.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="createProject"></a>
# **createProject**
> Project createProject(ProjectCreateRequest)

Create a new project in the organization. Projects can be created and archived, but cannot be deleted.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ProjectCreateRequest** | [**ProjectCreateRequest**](../Models/ProjectCreateRequest.md)| The project create request payload. | |

### Return type

[**Project**](../Models/Project.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="createProjectServiceAccount"></a>
# **createProjectServiceAccount**
> ProjectServiceAccountCreateResponse createProjectServiceAccount(project\_id, ProjectServiceAccountCreateRequest)

Creates a new service account in the project. This also returns an unredacted API key for the service account.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **project\_id** | **String**| The ID of the project. | [default to null] |
| **ProjectServiceAccountCreateRequest** | [**ProjectServiceAccountCreateRequest**](../Models/ProjectServiceAccountCreateRequest.md)| The project service account create request payload. | |

### Return type

[**ProjectServiceAccountCreateResponse**](../Models/ProjectServiceAccountCreateResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="createProjectUser"></a>
# **createProjectUser**
> ProjectUser createProjectUser(project\_id, ProjectUserCreateRequest)

Adds a user to the project. Users must already be members of the organization to be added to a project.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **project\_id** | **String**| The ID of the project. | [default to null] |
| **ProjectUserCreateRequest** | [**ProjectUserCreateRequest**](../Models/ProjectUserCreateRequest.md)| The project user create request payload. | |

### Return type

[**ProjectUser**](../Models/ProjectUser.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="deleteProjectApiKey"></a>
# **deleteProjectApiKey**
> ProjectApiKeyDeleteResponse deleteProjectApiKey(project\_id, key\_id)

Deletes an API key from the project.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **project\_id** | **String**| The ID of the project. | [default to null] |
| **key\_id** | **String**| The ID of the API key. | [default to null] |

### Return type

[**ProjectApiKeyDeleteResponse**](../Models/ProjectApiKeyDeleteResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="deleteProjectServiceAccount"></a>
# **deleteProjectServiceAccount**
> ProjectServiceAccountDeleteResponse deleteProjectServiceAccount(project\_id, service\_account\_id)

Deletes a service account from the project.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **project\_id** | **String**| The ID of the project. | [default to null] |
| **service\_account\_id** | **String**| The ID of the service account. | [default to null] |

### Return type

[**ProjectServiceAccountDeleteResponse**](../Models/ProjectServiceAccountDeleteResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="deleteProjectUser"></a>
# **deleteProjectUser**
> ProjectUserDeleteResponse deleteProjectUser(project\_id, user\_id)

Deletes a user from the project.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **project\_id** | **String**| The ID of the project. | [default to null] |
| **user\_id** | **String**| The ID of the user. | [default to null] |

### Return type

[**ProjectUserDeleteResponse**](../Models/ProjectUserDeleteResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="listProjectApiKeys"></a>
# **listProjectApiKeys**
> ProjectApiKeyListResponse listProjectApiKeys(project\_id, limit, after)

Returns a list of API keys in the project.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **project\_id** | **String**| The ID of the project. | [default to null] |
| **limit** | **Integer**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20] |
| **after** | **String**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] [default to null] |

### Return type

[**ProjectApiKeyListResponse**](../Models/ProjectApiKeyListResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="listProjectRateLimits"></a>
# **listProjectRateLimits**
> ProjectRateLimitListResponse listProjectRateLimits(project\_id, limit, after, before)

Returns the rate limits per model for a project.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **project\_id** | **String**| The ID of the project. | [default to null] |
| **limit** | **Integer**| A limit on the number of objects to be returned. The default is 100.  | [optional] [default to 100] |
| **after** | **String**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] [default to null] |
| **before** | **String**| A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, beginning with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [optional] [default to null] |

### Return type

[**ProjectRateLimitListResponse**](../Models/ProjectRateLimitListResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="listProjectServiceAccounts"></a>
# **listProjectServiceAccounts**
> ProjectServiceAccountListResponse listProjectServiceAccounts(project\_id, limit, after)

Returns a list of service accounts in the project.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **project\_id** | **String**| The ID of the project. | [default to null] |
| **limit** | **Integer**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20] |
| **after** | **String**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] [default to null] |

### Return type

[**ProjectServiceAccountListResponse**](../Models/ProjectServiceAccountListResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="listProjectUsers"></a>
# **listProjectUsers**
> ProjectUserListResponse listProjectUsers(project\_id, limit, after)

Returns a list of users in the project.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **project\_id** | **String**| The ID of the project. | [default to null] |
| **limit** | **Integer**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20] |
| **after** | **String**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] [default to null] |

### Return type

[**ProjectUserListResponse**](../Models/ProjectUserListResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="listProjects"></a>
# **listProjects**
> ProjectListResponse listProjects(limit, after, include\_archived)

Returns a list of projects.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **limit** | **Integer**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20] |
| **after** | **String**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] [default to null] |
| **include\_archived** | **Boolean**| If &#x60;true&#x60; returns all projects including those that have been &#x60;archived&#x60;. Archived projects are not included by default. | [optional] [default to false] |

### Return type

[**ProjectListResponse**](../Models/ProjectListResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="modifyProject"></a>
# **modifyProject**
> Project modifyProject(project\_id, ProjectUpdateRequest)

Modifies a project in the organization.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **project\_id** | **String**| The ID of the project. | [default to null] |
| **ProjectUpdateRequest** | [**ProjectUpdateRequest**](../Models/ProjectUpdateRequest.md)| The project update request payload. | |

### Return type

[**Project**](../Models/Project.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="modifyProjectUser"></a>
# **modifyProjectUser**
> ProjectUser modifyProjectUser(project\_id, user\_id, ProjectUserUpdateRequest)

Modifies a user&#39;s role in the project.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **project\_id** | **String**| The ID of the project. | [default to null] |
| **user\_id** | **String**| The ID of the user. | [default to null] |
| **ProjectUserUpdateRequest** | [**ProjectUserUpdateRequest**](../Models/ProjectUserUpdateRequest.md)| The project user update request payload. | |

### Return type

[**ProjectUser**](../Models/ProjectUser.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="retrieveProject"></a>
# **retrieveProject**
> Project retrieveProject(project\_id)

Retrieves a project.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **project\_id** | **String**| The ID of the project. | [default to null] |

### Return type

[**Project**](../Models/Project.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="retrieveProjectApiKey"></a>
# **retrieveProjectApiKey**
> ProjectApiKey retrieveProjectApiKey(project\_id, key\_id)

Retrieves an API key in the project.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **project\_id** | **String**| The ID of the project. | [default to null] |
| **key\_id** | **String**| The ID of the API key. | [default to null] |

### Return type

[**ProjectApiKey**](../Models/ProjectApiKey.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="retrieveProjectServiceAccount"></a>
# **retrieveProjectServiceAccount**
> ProjectServiceAccount retrieveProjectServiceAccount(project\_id, service\_account\_id)

Retrieves a service account in the project.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **project\_id** | **String**| The ID of the project. | [default to null] |
| **service\_account\_id** | **String**| The ID of the service account. | [default to null] |

### Return type

[**ProjectServiceAccount**](../Models/ProjectServiceAccount.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="retrieveProjectUser"></a>
# **retrieveProjectUser**
> ProjectUser retrieveProjectUser(project\_id, user\_id)

Retrieves a user in the project.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **project\_id** | **String**| The ID of the project. | [default to null] |
| **user\_id** | **String**| The ID of the user. | [default to null] |

### Return type

[**ProjectUser**](../Models/ProjectUser.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="updateProjectRateLimits"></a>
# **updateProjectRateLimits**
> ProjectRateLimit updateProjectRateLimits(project\_id, rate\_limit\_id, ProjectRateLimitUpdateRequest)

Updates a project rate limit.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **project\_id** | **String**| The ID of the project. | [default to null] |
| **rate\_limit\_id** | **String**| The ID of the rate limit. | [default to null] |
| **ProjectRateLimitUpdateRequest** | [**ProjectRateLimitUpdateRequest**](../Models/ProjectRateLimitUpdateRequest.md)| The project rate limit update request payload. | |

### Return type

[**ProjectRateLimit**](../Models/ProjectRateLimit.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

