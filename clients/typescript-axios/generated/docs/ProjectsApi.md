# ProjectsApi

All URIs are relative to *https://api.openai.com/v1*

|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|[**archiveProject**](#archiveproject) | **POST** /organization/projects/{project_id}/archive | Archives a project in the organization. Archived projects cannot be used or updated.|
|[**createProject**](#createproject) | **POST** /organization/projects | Create a new project in the organization. Projects can be created and archived, but cannot be deleted.|
|[**createProjectServiceAccount**](#createprojectserviceaccount) | **POST** /organization/projects/{project_id}/service_accounts | Creates a new service account in the project. This also returns an unredacted API key for the service account.|
|[**createProjectUser**](#createprojectuser) | **POST** /organization/projects/{project_id}/users | Adds a user to the project. Users must already be members of the organization to be added to a project.|
|[**deleteProjectApiKey**](#deleteprojectapikey) | **DELETE** /organization/projects/{project_id}/api_keys/{key_id} | Deletes an API key from the project.|
|[**deleteProjectServiceAccount**](#deleteprojectserviceaccount) | **DELETE** /organization/projects/{project_id}/service_accounts/{service_account_id} | Deletes a service account from the project.|
|[**deleteProjectUser**](#deleteprojectuser) | **DELETE** /organization/projects/{project_id}/users/{user_id} | Deletes a user from the project.|
|[**listProjectApiKeys**](#listprojectapikeys) | **GET** /organization/projects/{project_id}/api_keys | Returns a list of API keys in the project.|
|[**listProjectRateLimits**](#listprojectratelimits) | **GET** /organization/projects/{project_id}/rate_limits | Returns the rate limits per model for a project.|
|[**listProjectServiceAccounts**](#listprojectserviceaccounts) | **GET** /organization/projects/{project_id}/service_accounts | Returns a list of service accounts in the project.|
|[**listProjectUsers**](#listprojectusers) | **GET** /organization/projects/{project_id}/users | Returns a list of users in the project.|
|[**listProjects**](#listprojects) | **GET** /organization/projects | Returns a list of projects.|
|[**modifyProject**](#modifyproject) | **POST** /organization/projects/{project_id} | Modifies a project in the organization.|
|[**modifyProjectUser**](#modifyprojectuser) | **POST** /organization/projects/{project_id}/users/{user_id} | Modifies a user\&#39;s role in the project.|
|[**retrieveProject**](#retrieveproject) | **GET** /organization/projects/{project_id} | Retrieves a project.|
|[**retrieveProjectApiKey**](#retrieveprojectapikey) | **GET** /organization/projects/{project_id}/api_keys/{key_id} | Retrieves an API key in the project.|
|[**retrieveProjectServiceAccount**](#retrieveprojectserviceaccount) | **GET** /organization/projects/{project_id}/service_accounts/{service_account_id} | Retrieves a service account in the project.|
|[**retrieveProjectUser**](#retrieveprojectuser) | **GET** /organization/projects/{project_id}/users/{user_id} | Retrieves a user in the project.|
|[**updateProjectRateLimits**](#updateprojectratelimits) | **POST** /organization/projects/{project_id}/rate_limits/{rate_limit_id} | Updates a project rate limit.|

# **archiveProject**
> Project archiveProject()


### Example

```typescript
import {
    ProjectsApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new ProjectsApi(configuration);

let projectId: string; //The ID of the project. (default to undefined)

const { status, data } = await apiInstance.archiveProject(
    projectId
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **projectId** | [**string**] | The ID of the project. | defaults to undefined|


### Return type

**Project**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | Project archived successfully. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **createProject**
> Project createProject(projectCreateRequest)


### Example

```typescript
import {
    ProjectsApi,
    Configuration,
    ProjectCreateRequest
} from './api';

const configuration = new Configuration();
const apiInstance = new ProjectsApi(configuration);

let projectCreateRequest: ProjectCreateRequest; //The project create request payload.

const { status, data } = await apiInstance.createProject(
    projectCreateRequest
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **projectCreateRequest** | **ProjectCreateRequest**| The project create request payload. | |


### Return type

**Project**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | Project created successfully. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **createProjectServiceAccount**
> ProjectServiceAccountCreateResponse createProjectServiceAccount(projectServiceAccountCreateRequest)


### Example

```typescript
import {
    ProjectsApi,
    Configuration,
    ProjectServiceAccountCreateRequest
} from './api';

const configuration = new Configuration();
const apiInstance = new ProjectsApi(configuration);

let projectId: string; //The ID of the project. (default to undefined)
let projectServiceAccountCreateRequest: ProjectServiceAccountCreateRequest; //The project service account create request payload.

const { status, data } = await apiInstance.createProjectServiceAccount(
    projectId,
    projectServiceAccountCreateRequest
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **projectServiceAccountCreateRequest** | **ProjectServiceAccountCreateRequest**| The project service account create request payload. | |
| **projectId** | [**string**] | The ID of the project. | defaults to undefined|


### Return type

**ProjectServiceAccountCreateResponse**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | Project service account created successfully. |  -  |
|**400** | Error response when project is archived. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **createProjectUser**
> ProjectUser createProjectUser(projectUserCreateRequest)


### Example

```typescript
import {
    ProjectsApi,
    Configuration,
    ProjectUserCreateRequest
} from './api';

const configuration = new Configuration();
const apiInstance = new ProjectsApi(configuration);

let projectId: string; //The ID of the project. (default to undefined)
let projectUserCreateRequest: ProjectUserCreateRequest; //The project user create request payload.

const { status, data } = await apiInstance.createProjectUser(
    projectId,
    projectUserCreateRequest
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **projectUserCreateRequest** | **ProjectUserCreateRequest**| The project user create request payload. | |
| **projectId** | [**string**] | The ID of the project. | defaults to undefined|


### Return type

**ProjectUser**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | User added to project successfully. |  -  |
|**400** | Error response for various conditions. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **deleteProjectApiKey**
> ProjectApiKeyDeleteResponse deleteProjectApiKey()


### Example

```typescript
import {
    ProjectsApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new ProjectsApi(configuration);

let projectId: string; //The ID of the project. (default to undefined)
let keyId: string; //The ID of the API key. (default to undefined)

const { status, data } = await apiInstance.deleteProjectApiKey(
    projectId,
    keyId
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **projectId** | [**string**] | The ID of the project. | defaults to undefined|
| **keyId** | [**string**] | The ID of the API key. | defaults to undefined|


### Return type

**ProjectApiKeyDeleteResponse**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | Project API key deleted successfully. |  -  |
|**400** | Error response for various conditions. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **deleteProjectServiceAccount**
> ProjectServiceAccountDeleteResponse deleteProjectServiceAccount()


### Example

```typescript
import {
    ProjectsApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new ProjectsApi(configuration);

let projectId: string; //The ID of the project. (default to undefined)
let serviceAccountId: string; //The ID of the service account. (default to undefined)

const { status, data } = await apiInstance.deleteProjectServiceAccount(
    projectId,
    serviceAccountId
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **projectId** | [**string**] | The ID of the project. | defaults to undefined|
| **serviceAccountId** | [**string**] | The ID of the service account. | defaults to undefined|


### Return type

**ProjectServiceAccountDeleteResponse**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | Project service account deleted successfully. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **deleteProjectUser**
> ProjectUserDeleteResponse deleteProjectUser()


### Example

```typescript
import {
    ProjectsApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new ProjectsApi(configuration);

let projectId: string; //The ID of the project. (default to undefined)
let userId: string; //The ID of the user. (default to undefined)

const { status, data } = await apiInstance.deleteProjectUser(
    projectId,
    userId
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **projectId** | [**string**] | The ID of the project. | defaults to undefined|
| **userId** | [**string**] | The ID of the user. | defaults to undefined|


### Return type

**ProjectUserDeleteResponse**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | Project user deleted successfully. |  -  |
|**400** | Error response for various conditions. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **listProjectApiKeys**
> ProjectApiKeyListResponse listProjectApiKeys()


### Example

```typescript
import {
    ProjectsApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new ProjectsApi(configuration);

let projectId: string; //The ID of the project. (default to undefined)
let limit: number; //A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional) (default to 20)
let after: string; //A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (optional) (default to undefined)

const { status, data } = await apiInstance.listProjectApiKeys(
    projectId,
    limit,
    after
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **projectId** | [**string**] | The ID of the project. | defaults to undefined|
| **limit** | [**number**] | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | (optional) defaults to 20|
| **after** | [**string**] | A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | (optional) defaults to undefined|


### Return type

**ProjectApiKeyListResponse**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | Project API keys listed successfully. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **listProjectRateLimits**
> ProjectRateLimitListResponse listProjectRateLimits()


### Example

```typescript
import {
    ProjectsApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new ProjectsApi(configuration);

let projectId: string; //The ID of the project. (default to undefined)
let limit: number; //A limit on the number of objects to be returned. The default is 100.  (optional) (default to 100)
let after: string; //A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (optional) (default to undefined)
let before: string; //A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, beginning with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list.  (optional) (default to undefined)

const { status, data } = await apiInstance.listProjectRateLimits(
    projectId,
    limit,
    after,
    before
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **projectId** | [**string**] | The ID of the project. | defaults to undefined|
| **limit** | [**number**] | A limit on the number of objects to be returned. The default is 100.  | (optional) defaults to 100|
| **after** | [**string**] | A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | (optional) defaults to undefined|
| **before** | [**string**] | A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, beginning with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | (optional) defaults to undefined|


### Return type

**ProjectRateLimitListResponse**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | Project rate limits listed successfully. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **listProjectServiceAccounts**
> ProjectServiceAccountListResponse listProjectServiceAccounts()


### Example

```typescript
import {
    ProjectsApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new ProjectsApi(configuration);

let projectId: string; //The ID of the project. (default to undefined)
let limit: number; //A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional) (default to 20)
let after: string; //A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (optional) (default to undefined)

const { status, data } = await apiInstance.listProjectServiceAccounts(
    projectId,
    limit,
    after
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **projectId** | [**string**] | The ID of the project. | defaults to undefined|
| **limit** | [**number**] | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | (optional) defaults to 20|
| **after** | [**string**] | A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | (optional) defaults to undefined|


### Return type

**ProjectServiceAccountListResponse**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | Project service accounts listed successfully. |  -  |
|**400** | Error response when project is archived. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **listProjectUsers**
> ProjectUserListResponse listProjectUsers()


### Example

```typescript
import {
    ProjectsApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new ProjectsApi(configuration);

let projectId: string; //The ID of the project. (default to undefined)
let limit: number; //A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional) (default to 20)
let after: string; //A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (optional) (default to undefined)

const { status, data } = await apiInstance.listProjectUsers(
    projectId,
    limit,
    after
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **projectId** | [**string**] | The ID of the project. | defaults to undefined|
| **limit** | [**number**] | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | (optional) defaults to 20|
| **after** | [**string**] | A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | (optional) defaults to undefined|


### Return type

**ProjectUserListResponse**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | Project users listed successfully. |  -  |
|**400** | Error response when project is archived. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **listProjects**
> ProjectListResponse listProjects()


### Example

```typescript
import {
    ProjectsApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new ProjectsApi(configuration);

let limit: number; //A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional) (default to 20)
let after: string; //A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (optional) (default to undefined)
let includeArchived: boolean; //If `true` returns all projects including those that have been `archived`. Archived projects are not included by default. (optional) (default to false)

const { status, data } = await apiInstance.listProjects(
    limit,
    after,
    includeArchived
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **limit** | [**number**] | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | (optional) defaults to 20|
| **after** | [**string**] | A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | (optional) defaults to undefined|
| **includeArchived** | [**boolean**] | If &#x60;true&#x60; returns all projects including those that have been &#x60;archived&#x60;. Archived projects are not included by default. | (optional) defaults to false|


### Return type

**ProjectListResponse**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | Projects listed successfully. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **modifyProject**
> Project modifyProject(projectUpdateRequest)


### Example

```typescript
import {
    ProjectsApi,
    Configuration,
    ProjectUpdateRequest
} from './api';

const configuration = new Configuration();
const apiInstance = new ProjectsApi(configuration);

let projectId: string; //The ID of the project. (default to undefined)
let projectUpdateRequest: ProjectUpdateRequest; //The project update request payload.

const { status, data } = await apiInstance.modifyProject(
    projectId,
    projectUpdateRequest
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **projectUpdateRequest** | **ProjectUpdateRequest**| The project update request payload. | |
| **projectId** | [**string**] | The ID of the project. | defaults to undefined|


### Return type

**Project**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | Project updated successfully. |  -  |
|**400** | Error response when updating the default project. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **modifyProjectUser**
> ProjectUser modifyProjectUser(projectUserUpdateRequest)


### Example

```typescript
import {
    ProjectsApi,
    Configuration,
    ProjectUserUpdateRequest
} from './api';

const configuration = new Configuration();
const apiInstance = new ProjectsApi(configuration);

let projectId: string; //The ID of the project. (default to undefined)
let userId: string; //The ID of the user. (default to undefined)
let projectUserUpdateRequest: ProjectUserUpdateRequest; //The project user update request payload.

const { status, data } = await apiInstance.modifyProjectUser(
    projectId,
    userId,
    projectUserUpdateRequest
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **projectUserUpdateRequest** | **ProjectUserUpdateRequest**| The project user update request payload. | |
| **projectId** | [**string**] | The ID of the project. | defaults to undefined|
| **userId** | [**string**] | The ID of the user. | defaults to undefined|


### Return type

**ProjectUser**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | Project user\&#39;s role updated successfully. |  -  |
|**400** | Error response for various conditions. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **retrieveProject**
> Project retrieveProject()


### Example

```typescript
import {
    ProjectsApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new ProjectsApi(configuration);

let projectId: string; //The ID of the project. (default to undefined)

const { status, data } = await apiInstance.retrieveProject(
    projectId
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **projectId** | [**string**] | The ID of the project. | defaults to undefined|


### Return type

**Project**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | Project retrieved successfully. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **retrieveProjectApiKey**
> ProjectApiKey retrieveProjectApiKey()


### Example

```typescript
import {
    ProjectsApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new ProjectsApi(configuration);

let projectId: string; //The ID of the project. (default to undefined)
let keyId: string; //The ID of the API key. (default to undefined)

const { status, data } = await apiInstance.retrieveProjectApiKey(
    projectId,
    keyId
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **projectId** | [**string**] | The ID of the project. | defaults to undefined|
| **keyId** | [**string**] | The ID of the API key. | defaults to undefined|


### Return type

**ProjectApiKey**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | Project API key retrieved successfully. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **retrieveProjectServiceAccount**
> ProjectServiceAccount retrieveProjectServiceAccount()


### Example

```typescript
import {
    ProjectsApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new ProjectsApi(configuration);

let projectId: string; //The ID of the project. (default to undefined)
let serviceAccountId: string; //The ID of the service account. (default to undefined)

const { status, data } = await apiInstance.retrieveProjectServiceAccount(
    projectId,
    serviceAccountId
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **projectId** | [**string**] | The ID of the project. | defaults to undefined|
| **serviceAccountId** | [**string**] | The ID of the service account. | defaults to undefined|


### Return type

**ProjectServiceAccount**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | Project service account retrieved successfully. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **retrieveProjectUser**
> ProjectUser retrieveProjectUser()


### Example

```typescript
import {
    ProjectsApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new ProjectsApi(configuration);

let projectId: string; //The ID of the project. (default to undefined)
let userId: string; //The ID of the user. (default to undefined)

const { status, data } = await apiInstance.retrieveProjectUser(
    projectId,
    userId
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **projectId** | [**string**] | The ID of the project. | defaults to undefined|
| **userId** | [**string**] | The ID of the user. | defaults to undefined|


### Return type

**ProjectUser**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | Project user retrieved successfully. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **updateProjectRateLimits**
> ProjectRateLimit updateProjectRateLimits(projectRateLimitUpdateRequest)


### Example

```typescript
import {
    ProjectsApi,
    Configuration,
    ProjectRateLimitUpdateRequest
} from './api';

const configuration = new Configuration();
const apiInstance = new ProjectsApi(configuration);

let projectId: string; //The ID of the project. (default to undefined)
let rateLimitId: string; //The ID of the rate limit. (default to undefined)
let projectRateLimitUpdateRequest: ProjectRateLimitUpdateRequest; //The project rate limit update request payload.

const { status, data } = await apiInstance.updateProjectRateLimits(
    projectId,
    rateLimitId,
    projectRateLimitUpdateRequest
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **projectRateLimitUpdateRequest** | **ProjectRateLimitUpdateRequest**| The project rate limit update request payload. | |
| **projectId** | [**string**] | The ID of the project. | defaults to undefined|
| **rateLimitId** | [**string**] | The ID of the rate limit. | defaults to undefined|


### Return type

**ProjectRateLimit**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | Project rate limit updated successfully. |  -  |
|**400** | Error response for various conditions. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

