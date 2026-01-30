# .ProjectsApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**archiveProject**](ProjectsApi.md#archiveProject) | **POST** /organization/projects/{project_id}/archive | Archives a project in the organization. Archived projects cannot be used or updated.
[**createProject**](ProjectsApi.md#createProject) | **POST** /organization/projects | Create a new project in the organization. Projects can be created and archived, but cannot be deleted.
[**createProjectServiceAccount**](ProjectsApi.md#createProjectServiceAccount) | **POST** /organization/projects/{project_id}/service_accounts | Creates a new service account in the project. This also returns an unredacted API key for the service account.
[**createProjectUser**](ProjectsApi.md#createProjectUser) | **POST** /organization/projects/{project_id}/users | Adds a user to the project. Users must already be members of the organization to be added to a project.
[**deleteProjectApiKey**](ProjectsApi.md#deleteProjectApiKey) | **DELETE** /organization/projects/{project_id}/api_keys/{key_id} | Deletes an API key from the project.
[**deleteProjectServiceAccount**](ProjectsApi.md#deleteProjectServiceAccount) | **DELETE** /organization/projects/{project_id}/service_accounts/{service_account_id} | Deletes a service account from the project.
[**deleteProjectUser**](ProjectsApi.md#deleteProjectUser) | **DELETE** /organization/projects/{project_id}/users/{user_id} | Deletes a user from the project.
[**listProjectApiKeys**](ProjectsApi.md#listProjectApiKeys) | **GET** /organization/projects/{project_id}/api_keys | Returns a list of API keys in the project.
[**listProjectRateLimits**](ProjectsApi.md#listProjectRateLimits) | **GET** /organization/projects/{project_id}/rate_limits | Returns the rate limits per model for a project.
[**listProjectServiceAccounts**](ProjectsApi.md#listProjectServiceAccounts) | **GET** /organization/projects/{project_id}/service_accounts | Returns a list of service accounts in the project.
[**listProjectUsers**](ProjectsApi.md#listProjectUsers) | **GET** /organization/projects/{project_id}/users | Returns a list of users in the project.
[**listProjects**](ProjectsApi.md#listProjects) | **GET** /organization/projects | Returns a list of projects.
[**modifyProject**](ProjectsApi.md#modifyProject) | **POST** /organization/projects/{project_id} | Modifies a project in the organization.
[**modifyProjectUser**](ProjectsApi.md#modifyProjectUser) | **POST** /organization/projects/{project_id}/users/{user_id} | Modifies a user\&#39;s role in the project.
[**retrieveProject**](ProjectsApi.md#retrieveProject) | **GET** /organization/projects/{project_id} | Retrieves a project.
[**retrieveProjectApiKey**](ProjectsApi.md#retrieveProjectApiKey) | **GET** /organization/projects/{project_id}/api_keys/{key_id} | Retrieves an API key in the project.
[**retrieveProjectServiceAccount**](ProjectsApi.md#retrieveProjectServiceAccount) | **GET** /organization/projects/{project_id}/service_accounts/{service_account_id} | Retrieves a service account in the project.
[**retrieveProjectUser**](ProjectsApi.md#retrieveProjectUser) | **GET** /organization/projects/{project_id}/users/{user_id} | Retrieves a user in the project.
[**updateProjectRateLimits**](ProjectsApi.md#updateProjectRateLimits) | **POST** /organization/projects/{project_id}/rate_limits/{rate_limit_id} | Updates a project rate limit.


# **archiveProject**
> Project archiveProject()


### Example


```typescript
import { createConfiguration, ProjectsApi } from '';
import type { ProjectsApiArchiveProjectRequest } from '';

const configuration = createConfiguration();
const apiInstance = new ProjectsApi(configuration);

const request: ProjectsApiArchiveProjectRequest = {
    // The ID of the project.
  projectId: "project_id_example",
};

const data = await apiInstance.archiveProject(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | [**string**] | The ID of the project. | defaults to undefined


### Return type

**Project**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Project archived successfully. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **createProject**
> Project createProject(projectCreateRequest)


### Example


```typescript
import { createConfiguration, ProjectsApi } from '';
import type { ProjectsApiCreateProjectRequest } from '';

const configuration = createConfiguration();
const apiInstance = new ProjectsApi(configuration);

const request: ProjectsApiCreateProjectRequest = {
    // The project create request payload.
  projectCreateRequest: {
    name: "name_example",
  },
};

const data = await apiInstance.createProject(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectCreateRequest** | **ProjectCreateRequest**| The project create request payload. |


### Return type

**Project**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Project created successfully. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **createProjectServiceAccount**
> ProjectServiceAccountCreateResponse createProjectServiceAccount(projectServiceAccountCreateRequest)


### Example


```typescript
import { createConfiguration, ProjectsApi } from '';
import type { ProjectsApiCreateProjectServiceAccountRequest } from '';

const configuration = createConfiguration();
const apiInstance = new ProjectsApi(configuration);

const request: ProjectsApiCreateProjectServiceAccountRequest = {
    // The ID of the project.
  projectId: "project_id_example",
    // The project service account create request payload.
  projectServiceAccountCreateRequest: {
    name: "name_example",
  },
};

const data = await apiInstance.createProjectServiceAccount(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectServiceAccountCreateRequest** | **ProjectServiceAccountCreateRequest**| The project service account create request payload. |
 **projectId** | [**string**] | The ID of the project. | defaults to undefined


### Return type

**ProjectServiceAccountCreateResponse**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Project service account created successfully. |  -  |
**400** | Error response when project is archived. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **createProjectUser**
> ProjectUser createProjectUser(projectUserCreateRequest)


### Example


```typescript
import { createConfiguration, ProjectsApi } from '';
import type { ProjectsApiCreateProjectUserRequest } from '';

const configuration = createConfiguration();
const apiInstance = new ProjectsApi(configuration);

const request: ProjectsApiCreateProjectUserRequest = {
    // The ID of the project.
  projectId: "project_id_example",
    // The project user create request payload.
  projectUserCreateRequest: {
    userId: "userId_example",
    role: "owner",
  },
};

const data = await apiInstance.createProjectUser(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectUserCreateRequest** | **ProjectUserCreateRequest**| The project user create request payload. |
 **projectId** | [**string**] | The ID of the project. | defaults to undefined


### Return type

**ProjectUser**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | User added to project successfully. |  -  |
**400** | Error response for various conditions. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **deleteProjectApiKey**
> ProjectApiKeyDeleteResponse deleteProjectApiKey()


### Example


```typescript
import { createConfiguration, ProjectsApi } from '';
import type { ProjectsApiDeleteProjectApiKeyRequest } from '';

const configuration = createConfiguration();
const apiInstance = new ProjectsApi(configuration);

const request: ProjectsApiDeleteProjectApiKeyRequest = {
    // The ID of the project.
  projectId: "project_id_example",
    // The ID of the API key.
  keyId: "key_id_example",
};

const data = await apiInstance.deleteProjectApiKey(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | [**string**] | The ID of the project. | defaults to undefined
 **keyId** | [**string**] | The ID of the API key. | defaults to undefined


### Return type

**ProjectApiKeyDeleteResponse**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Project API key deleted successfully. |  -  |
**400** | Error response for various conditions. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **deleteProjectServiceAccount**
> ProjectServiceAccountDeleteResponse deleteProjectServiceAccount()


### Example


```typescript
import { createConfiguration, ProjectsApi } from '';
import type { ProjectsApiDeleteProjectServiceAccountRequest } from '';

const configuration = createConfiguration();
const apiInstance = new ProjectsApi(configuration);

const request: ProjectsApiDeleteProjectServiceAccountRequest = {
    // The ID of the project.
  projectId: "project_id_example",
    // The ID of the service account.
  serviceAccountId: "service_account_id_example",
};

const data = await apiInstance.deleteProjectServiceAccount(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | [**string**] | The ID of the project. | defaults to undefined
 **serviceAccountId** | [**string**] | The ID of the service account. | defaults to undefined


### Return type

**ProjectServiceAccountDeleteResponse**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Project service account deleted successfully. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **deleteProjectUser**
> ProjectUserDeleteResponse deleteProjectUser()


### Example


```typescript
import { createConfiguration, ProjectsApi } from '';
import type { ProjectsApiDeleteProjectUserRequest } from '';

const configuration = createConfiguration();
const apiInstance = new ProjectsApi(configuration);

const request: ProjectsApiDeleteProjectUserRequest = {
    // The ID of the project.
  projectId: "project_id_example",
    // The ID of the user.
  userId: "user_id_example",
};

const data = await apiInstance.deleteProjectUser(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | [**string**] | The ID of the project. | defaults to undefined
 **userId** | [**string**] | The ID of the user. | defaults to undefined


### Return type

**ProjectUserDeleteResponse**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Project user deleted successfully. |  -  |
**400** | Error response for various conditions. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **listProjectApiKeys**
> ProjectApiKeyListResponse listProjectApiKeys()


### Example


```typescript
import { createConfiguration, ProjectsApi } from '';
import type { ProjectsApiListProjectApiKeysRequest } from '';

const configuration = createConfiguration();
const apiInstance = new ProjectsApi(configuration);

const request: ProjectsApiListProjectApiKeysRequest = {
    // The ID of the project.
  projectId: "project_id_example",
    // A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional)
  limit: 20,
    // A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (optional)
  after: "after_example",
};

const data = await apiInstance.listProjectApiKeys(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | [**string**] | The ID of the project. | defaults to undefined
 **limit** | [**number**] | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | (optional) defaults to 20
 **after** | [**string**] | A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | (optional) defaults to undefined


### Return type

**ProjectApiKeyListResponse**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Project API keys listed successfully. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **listProjectRateLimits**
> ProjectRateLimitListResponse listProjectRateLimits()


### Example


```typescript
import { createConfiguration, ProjectsApi } from '';
import type { ProjectsApiListProjectRateLimitsRequest } from '';

const configuration = createConfiguration();
const apiInstance = new ProjectsApi(configuration);

const request: ProjectsApiListProjectRateLimitsRequest = {
    // The ID of the project.
  projectId: "project_id_example",
    // A limit on the number of objects to be returned. The default is 100.  (optional)
  limit: 100,
    // A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (optional)
  after: "after_example",
    // A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, beginning with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list.  (optional)
  before: "before_example",
};

const data = await apiInstance.listProjectRateLimits(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | [**string**] | The ID of the project. | defaults to undefined
 **limit** | [**number**] | A limit on the number of objects to be returned. The default is 100.  | (optional) defaults to 100
 **after** | [**string**] | A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | (optional) defaults to undefined
 **before** | [**string**] | A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, beginning with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | (optional) defaults to undefined


### Return type

**ProjectRateLimitListResponse**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Project rate limits listed successfully. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **listProjectServiceAccounts**
> ProjectServiceAccountListResponse listProjectServiceAccounts()


### Example


```typescript
import { createConfiguration, ProjectsApi } from '';
import type { ProjectsApiListProjectServiceAccountsRequest } from '';

const configuration = createConfiguration();
const apiInstance = new ProjectsApi(configuration);

const request: ProjectsApiListProjectServiceAccountsRequest = {
    // The ID of the project.
  projectId: "project_id_example",
    // A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional)
  limit: 20,
    // A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (optional)
  after: "after_example",
};

const data = await apiInstance.listProjectServiceAccounts(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | [**string**] | The ID of the project. | defaults to undefined
 **limit** | [**number**] | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | (optional) defaults to 20
 **after** | [**string**] | A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | (optional) defaults to undefined


### Return type

**ProjectServiceAccountListResponse**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Project service accounts listed successfully. |  -  |
**400** | Error response when project is archived. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **listProjectUsers**
> ProjectUserListResponse listProjectUsers()


### Example


```typescript
import { createConfiguration, ProjectsApi } from '';
import type { ProjectsApiListProjectUsersRequest } from '';

const configuration = createConfiguration();
const apiInstance = new ProjectsApi(configuration);

const request: ProjectsApiListProjectUsersRequest = {
    // The ID of the project.
  projectId: "project_id_example",
    // A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional)
  limit: 20,
    // A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (optional)
  after: "after_example",
};

const data = await apiInstance.listProjectUsers(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | [**string**] | The ID of the project. | defaults to undefined
 **limit** | [**number**] | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | (optional) defaults to 20
 **after** | [**string**] | A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | (optional) defaults to undefined


### Return type

**ProjectUserListResponse**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Project users listed successfully. |  -  |
**400** | Error response when project is archived. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **listProjects**
> ProjectListResponse listProjects()


### Example


```typescript
import { createConfiguration, ProjectsApi } from '';
import type { ProjectsApiListProjectsRequest } from '';

const configuration = createConfiguration();
const apiInstance = new ProjectsApi(configuration);

const request: ProjectsApiListProjectsRequest = {
    // A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional)
  limit: 20,
    // A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (optional)
  after: "after_example",
    // If `true` returns all projects including those that have been `archived`. Archived projects are not included by default. (optional)
  includeArchived: false,
};

const data = await apiInstance.listProjects(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | [**number**] | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | (optional) defaults to 20
 **after** | [**string**] | A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | (optional) defaults to undefined
 **includeArchived** | [**boolean**] | If &#x60;true&#x60; returns all projects including those that have been &#x60;archived&#x60;. Archived projects are not included by default. | (optional) defaults to false


### Return type

**ProjectListResponse**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Projects listed successfully. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **modifyProject**
> Project modifyProject(projectUpdateRequest)


### Example


```typescript
import { createConfiguration, ProjectsApi } from '';
import type { ProjectsApiModifyProjectRequest } from '';

const configuration = createConfiguration();
const apiInstance = new ProjectsApi(configuration);

const request: ProjectsApiModifyProjectRequest = {
    // The ID of the project.
  projectId: "project_id_example",
    // The project update request payload.
  projectUpdateRequest: {
    name: "name_example",
  },
};

const data = await apiInstance.modifyProject(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectUpdateRequest** | **ProjectUpdateRequest**| The project update request payload. |
 **projectId** | [**string**] | The ID of the project. | defaults to undefined


### Return type

**Project**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Project updated successfully. |  -  |
**400** | Error response when updating the default project. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **modifyProjectUser**
> ProjectUser modifyProjectUser(projectUserUpdateRequest)


### Example


```typescript
import { createConfiguration, ProjectsApi } from '';
import type { ProjectsApiModifyProjectUserRequest } from '';

const configuration = createConfiguration();
const apiInstance = new ProjectsApi(configuration);

const request: ProjectsApiModifyProjectUserRequest = {
    // The ID of the project.
  projectId: "project_id_example",
    // The ID of the user.
  userId: "user_id_example",
    // The project user update request payload.
  projectUserUpdateRequest: {
    role: "owner",
  },
};

const data = await apiInstance.modifyProjectUser(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectUserUpdateRequest** | **ProjectUserUpdateRequest**| The project user update request payload. |
 **projectId** | [**string**] | The ID of the project. | defaults to undefined
 **userId** | [**string**] | The ID of the user. | defaults to undefined


### Return type

**ProjectUser**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Project user\&#39;s role updated successfully. |  -  |
**400** | Error response for various conditions. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **retrieveProject**
> Project retrieveProject()


### Example


```typescript
import { createConfiguration, ProjectsApi } from '';
import type { ProjectsApiRetrieveProjectRequest } from '';

const configuration = createConfiguration();
const apiInstance = new ProjectsApi(configuration);

const request: ProjectsApiRetrieveProjectRequest = {
    // The ID of the project.
  projectId: "project_id_example",
};

const data = await apiInstance.retrieveProject(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | [**string**] | The ID of the project. | defaults to undefined


### Return type

**Project**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Project retrieved successfully. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **retrieveProjectApiKey**
> ProjectApiKey retrieveProjectApiKey()


### Example


```typescript
import { createConfiguration, ProjectsApi } from '';
import type { ProjectsApiRetrieveProjectApiKeyRequest } from '';

const configuration = createConfiguration();
const apiInstance = new ProjectsApi(configuration);

const request: ProjectsApiRetrieveProjectApiKeyRequest = {
    // The ID of the project.
  projectId: "project_id_example",
    // The ID of the API key.
  keyId: "key_id_example",
};

const data = await apiInstance.retrieveProjectApiKey(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | [**string**] | The ID of the project. | defaults to undefined
 **keyId** | [**string**] | The ID of the API key. | defaults to undefined


### Return type

**ProjectApiKey**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Project API key retrieved successfully. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **retrieveProjectServiceAccount**
> ProjectServiceAccount retrieveProjectServiceAccount()


### Example


```typescript
import { createConfiguration, ProjectsApi } from '';
import type { ProjectsApiRetrieveProjectServiceAccountRequest } from '';

const configuration = createConfiguration();
const apiInstance = new ProjectsApi(configuration);

const request: ProjectsApiRetrieveProjectServiceAccountRequest = {
    // The ID of the project.
  projectId: "project_id_example",
    // The ID of the service account.
  serviceAccountId: "service_account_id_example",
};

const data = await apiInstance.retrieveProjectServiceAccount(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | [**string**] | The ID of the project. | defaults to undefined
 **serviceAccountId** | [**string**] | The ID of the service account. | defaults to undefined


### Return type

**ProjectServiceAccount**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Project service account retrieved successfully. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **retrieveProjectUser**
> ProjectUser retrieveProjectUser()


### Example


```typescript
import { createConfiguration, ProjectsApi } from '';
import type { ProjectsApiRetrieveProjectUserRequest } from '';

const configuration = createConfiguration();
const apiInstance = new ProjectsApi(configuration);

const request: ProjectsApiRetrieveProjectUserRequest = {
    // The ID of the project.
  projectId: "project_id_example",
    // The ID of the user.
  userId: "user_id_example",
};

const data = await apiInstance.retrieveProjectUser(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | [**string**] | The ID of the project. | defaults to undefined
 **userId** | [**string**] | The ID of the user. | defaults to undefined


### Return type

**ProjectUser**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Project user retrieved successfully. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **updateProjectRateLimits**
> ProjectRateLimit updateProjectRateLimits(projectRateLimitUpdateRequest)


### Example


```typescript
import { createConfiguration, ProjectsApi } from '';
import type { ProjectsApiUpdateProjectRateLimitsRequest } from '';

const configuration = createConfiguration();
const apiInstance = new ProjectsApi(configuration);

const request: ProjectsApiUpdateProjectRateLimitsRequest = {
    // The ID of the project.
  projectId: "project_id_example",
    // The ID of the rate limit.
  rateLimitId: "rate_limit_id_example",
    // The project rate limit update request payload.
  projectRateLimitUpdateRequest: {
    maxRequestsPer1Minute: 1,
    maxTokensPer1Minute: 1,
    maxImagesPer1Minute: 1,
    maxAudioMegabytesPer1Minute: 1,
    maxRequestsPer1Day: 1,
    batch1DayMaxInputTokens: 1,
  },
};

const data = await apiInstance.updateProjectRateLimits(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectRateLimitUpdateRequest** | **ProjectRateLimitUpdateRequest**| The project rate limit update request payload. |
 **projectId** | [**string**] | The ID of the project. | defaults to undefined
 **rateLimitId** | [**string**] | The ID of the rate limit. | defaults to undefined


### Return type

**ProjectRateLimit**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Project rate limit updated successfully. |  -  |
**400** | Error response for various conditions. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)


