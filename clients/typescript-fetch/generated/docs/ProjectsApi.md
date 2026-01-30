# ProjectsApi

All URIs are relative to *https://api.openai.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**archiveProject**](ProjectsApi.md#archiveproject) | **POST** /organization/projects/{project_id}/archive | Archives a project in the organization. Archived projects cannot be used or updated. |
| [**createProject**](ProjectsApi.md#createproject) | **POST** /organization/projects | Create a new project in the organization. Projects can be created and archived, but cannot be deleted. |
| [**createProjectServiceAccount**](ProjectsApi.md#createprojectserviceaccount) | **POST** /organization/projects/{project_id}/service_accounts | Creates a new service account in the project. This also returns an unredacted API key for the service account. |
| [**createProjectUser**](ProjectsApi.md#createprojectuser) | **POST** /organization/projects/{project_id}/users | Adds a user to the project. Users must already be members of the organization to be added to a project. |
| [**deleteProjectApiKey**](ProjectsApi.md#deleteprojectapikey) | **DELETE** /organization/projects/{project_id}/api_keys/{key_id} | Deletes an API key from the project. |
| [**deleteProjectServiceAccount**](ProjectsApi.md#deleteprojectserviceaccount) | **DELETE** /organization/projects/{project_id}/service_accounts/{service_account_id} | Deletes a service account from the project. |
| [**deleteProjectUser**](ProjectsApi.md#deleteprojectuser) | **DELETE** /organization/projects/{project_id}/users/{user_id} | Deletes a user from the project. |
| [**listProjectApiKeys**](ProjectsApi.md#listprojectapikeys) | **GET** /organization/projects/{project_id}/api_keys | Returns a list of API keys in the project. |
| [**listProjectRateLimits**](ProjectsApi.md#listprojectratelimits) | **GET** /organization/projects/{project_id}/rate_limits | Returns the rate limits per model for a project. |
| [**listProjectServiceAccounts**](ProjectsApi.md#listprojectserviceaccounts) | **GET** /organization/projects/{project_id}/service_accounts | Returns a list of service accounts in the project. |
| [**listProjectUsers**](ProjectsApi.md#listprojectusers) | **GET** /organization/projects/{project_id}/users | Returns a list of users in the project. |
| [**listProjects**](ProjectsApi.md#listprojects) | **GET** /organization/projects | Returns a list of projects. |
| [**modifyProject**](ProjectsApi.md#modifyproject) | **POST** /organization/projects/{project_id} | Modifies a project in the organization. |
| [**modifyProjectUser**](ProjectsApi.md#modifyprojectuser) | **POST** /organization/projects/{project_id}/users/{user_id} | Modifies a user\&#39;s role in the project. |
| [**retrieveProject**](ProjectsApi.md#retrieveproject) | **GET** /organization/projects/{project_id} | Retrieves a project. |
| [**retrieveProjectApiKey**](ProjectsApi.md#retrieveprojectapikey) | **GET** /organization/projects/{project_id}/api_keys/{key_id} | Retrieves an API key in the project. |
| [**retrieveProjectServiceAccount**](ProjectsApi.md#retrieveprojectserviceaccount) | **GET** /organization/projects/{project_id}/service_accounts/{service_account_id} | Retrieves a service account in the project. |
| [**retrieveProjectUser**](ProjectsApi.md#retrieveprojectuser) | **GET** /organization/projects/{project_id}/users/{user_id} | Retrieves a user in the project. |
| [**updateProjectRateLimits**](ProjectsApi.md#updateprojectratelimits) | **POST** /organization/projects/{project_id}/rate_limits/{rate_limit_id} | Updates a project rate limit. |



## archiveProject

> Project archiveProject(projectId)

Archives a project in the organization. Archived projects cannot be used or updated.

### Example

```ts
import {
  Configuration,
  ProjectsApi,
} from '';
import type { ArchiveProjectRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // Configure HTTP bearer authorization: ApiKeyAuth
    accessToken: "YOUR BEARER TOKEN",
  });
  const api = new ProjectsApi(config);

  const body = {
    // string | The ID of the project.
    projectId: projectId_example,
  } satisfies ArchiveProjectRequest;

  try {
    const data = await api.archiveProject(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **projectId** | `string` | The ID of the project. | [Defaults to `undefined`] |

### Return type

[**Project**](Project.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Project archived successfully. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## createProject

> Project createProject(projectCreateRequest)

Create a new project in the organization. Projects can be created and archived, but cannot be deleted.

### Example

```ts
import {
  Configuration,
  ProjectsApi,
} from '';
import type { CreateProjectRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // Configure HTTP bearer authorization: ApiKeyAuth
    accessToken: "YOUR BEARER TOKEN",
  });
  const api = new ProjectsApi(config);

  const body = {
    // ProjectCreateRequest | The project create request payload.
    projectCreateRequest: ...,
  } satisfies CreateProjectRequest;

  try {
    const data = await api.createProject(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **projectCreateRequest** | [ProjectCreateRequest](ProjectCreateRequest.md) | The project create request payload. | |

### Return type

[**Project**](Project.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Project created successfully. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## createProjectServiceAccount

> ProjectServiceAccountCreateResponse createProjectServiceAccount(projectId, projectServiceAccountCreateRequest)

Creates a new service account in the project. This also returns an unredacted API key for the service account.

### Example

```ts
import {
  Configuration,
  ProjectsApi,
} from '';
import type { CreateProjectServiceAccountRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // Configure HTTP bearer authorization: ApiKeyAuth
    accessToken: "YOUR BEARER TOKEN",
  });
  const api = new ProjectsApi(config);

  const body = {
    // string | The ID of the project.
    projectId: projectId_example,
    // ProjectServiceAccountCreateRequest | The project service account create request payload.
    projectServiceAccountCreateRequest: ...,
  } satisfies CreateProjectServiceAccountRequest;

  try {
    const data = await api.createProjectServiceAccount(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **projectId** | `string` | The ID of the project. | [Defaults to `undefined`] |
| **projectServiceAccountCreateRequest** | [ProjectServiceAccountCreateRequest](ProjectServiceAccountCreateRequest.md) | The project service account create request payload. | |

### Return type

[**ProjectServiceAccountCreateResponse**](ProjectServiceAccountCreateResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Project service account created successfully. |  -  |
| **400** | Error response when project is archived. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## createProjectUser

> ProjectUser createProjectUser(projectId, projectUserCreateRequest)

Adds a user to the project. Users must already be members of the organization to be added to a project.

### Example

```ts
import {
  Configuration,
  ProjectsApi,
} from '';
import type { CreateProjectUserRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // Configure HTTP bearer authorization: ApiKeyAuth
    accessToken: "YOUR BEARER TOKEN",
  });
  const api = new ProjectsApi(config);

  const body = {
    // string | The ID of the project.
    projectId: projectId_example,
    // ProjectUserCreateRequest | The project user create request payload.
    projectUserCreateRequest: ...,
  } satisfies CreateProjectUserRequest;

  try {
    const data = await api.createProjectUser(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **projectId** | `string` | The ID of the project. | [Defaults to `undefined`] |
| **projectUserCreateRequest** | [ProjectUserCreateRequest](ProjectUserCreateRequest.md) | The project user create request payload. | |

### Return type

[**ProjectUser**](ProjectUser.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | User added to project successfully. |  -  |
| **400** | Error response for various conditions. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## deleteProjectApiKey

> ProjectApiKeyDeleteResponse deleteProjectApiKey(projectId, keyId)

Deletes an API key from the project.

### Example

```ts
import {
  Configuration,
  ProjectsApi,
} from '';
import type { DeleteProjectApiKeyRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // Configure HTTP bearer authorization: ApiKeyAuth
    accessToken: "YOUR BEARER TOKEN",
  });
  const api = new ProjectsApi(config);

  const body = {
    // string | The ID of the project.
    projectId: projectId_example,
    // string | The ID of the API key.
    keyId: keyId_example,
  } satisfies DeleteProjectApiKeyRequest;

  try {
    const data = await api.deleteProjectApiKey(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **projectId** | `string` | The ID of the project. | [Defaults to `undefined`] |
| **keyId** | `string` | The ID of the API key. | [Defaults to `undefined`] |

### Return type

[**ProjectApiKeyDeleteResponse**](ProjectApiKeyDeleteResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Project API key deleted successfully. |  -  |
| **400** | Error response for various conditions. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## deleteProjectServiceAccount

> ProjectServiceAccountDeleteResponse deleteProjectServiceAccount(projectId, serviceAccountId)

Deletes a service account from the project.

### Example

```ts
import {
  Configuration,
  ProjectsApi,
} from '';
import type { DeleteProjectServiceAccountRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // Configure HTTP bearer authorization: ApiKeyAuth
    accessToken: "YOUR BEARER TOKEN",
  });
  const api = new ProjectsApi(config);

  const body = {
    // string | The ID of the project.
    projectId: projectId_example,
    // string | The ID of the service account.
    serviceAccountId: serviceAccountId_example,
  } satisfies DeleteProjectServiceAccountRequest;

  try {
    const data = await api.deleteProjectServiceAccount(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **projectId** | `string` | The ID of the project. | [Defaults to `undefined`] |
| **serviceAccountId** | `string` | The ID of the service account. | [Defaults to `undefined`] |

### Return type

[**ProjectServiceAccountDeleteResponse**](ProjectServiceAccountDeleteResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Project service account deleted successfully. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## deleteProjectUser

> ProjectUserDeleteResponse deleteProjectUser(projectId, userId)

Deletes a user from the project.

### Example

```ts
import {
  Configuration,
  ProjectsApi,
} from '';
import type { DeleteProjectUserRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // Configure HTTP bearer authorization: ApiKeyAuth
    accessToken: "YOUR BEARER TOKEN",
  });
  const api = new ProjectsApi(config);

  const body = {
    // string | The ID of the project.
    projectId: projectId_example,
    // string | The ID of the user.
    userId: userId_example,
  } satisfies DeleteProjectUserRequest;

  try {
    const data = await api.deleteProjectUser(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **projectId** | `string` | The ID of the project. | [Defaults to `undefined`] |
| **userId** | `string` | The ID of the user. | [Defaults to `undefined`] |

### Return type

[**ProjectUserDeleteResponse**](ProjectUserDeleteResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Project user deleted successfully. |  -  |
| **400** | Error response for various conditions. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## listProjectApiKeys

> ProjectApiKeyListResponse listProjectApiKeys(projectId, limit, after)

Returns a list of API keys in the project.

### Example

```ts
import {
  Configuration,
  ProjectsApi,
} from '';
import type { ListProjectApiKeysRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // Configure HTTP bearer authorization: ApiKeyAuth
    accessToken: "YOUR BEARER TOKEN",
  });
  const api = new ProjectsApi(config);

  const body = {
    // string | The ID of the project.
    projectId: projectId_example,
    // number | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional)
    limit: 56,
    // string | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (optional)
    after: after_example,
  } satisfies ListProjectApiKeysRequest;

  try {
    const data = await api.listProjectApiKeys(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **projectId** | `string` | The ID of the project. | [Defaults to `undefined`] |
| **limit** | `number` | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [Optional] [Defaults to `20`] |
| **after** | `string` | A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [Optional] [Defaults to `undefined`] |

### Return type

[**ProjectApiKeyListResponse**](ProjectApiKeyListResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Project API keys listed successfully. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## listProjectRateLimits

> ProjectRateLimitListResponse listProjectRateLimits(projectId, limit, after, before)

Returns the rate limits per model for a project.

### Example

```ts
import {
  Configuration,
  ProjectsApi,
} from '';
import type { ListProjectRateLimitsRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // Configure HTTP bearer authorization: ApiKeyAuth
    accessToken: "YOUR BEARER TOKEN",
  });
  const api = new ProjectsApi(config);

  const body = {
    // string | The ID of the project.
    projectId: projectId_example,
    // number | A limit on the number of objects to be returned. The default is 100.  (optional)
    limit: 56,
    // string | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (optional)
    after: after_example,
    // string | A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, beginning with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list.  (optional)
    before: before_example,
  } satisfies ListProjectRateLimitsRequest;

  try {
    const data = await api.listProjectRateLimits(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **projectId** | `string` | The ID of the project. | [Defaults to `undefined`] |
| **limit** | `number` | A limit on the number of objects to be returned. The default is 100.  | [Optional] [Defaults to `100`] |
| **after** | `string` | A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [Optional] [Defaults to `undefined`] |
| **before** | `string` | A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, beginning with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [Optional] [Defaults to `undefined`] |

### Return type

[**ProjectRateLimitListResponse**](ProjectRateLimitListResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Project rate limits listed successfully. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## listProjectServiceAccounts

> ProjectServiceAccountListResponse listProjectServiceAccounts(projectId, limit, after)

Returns a list of service accounts in the project.

### Example

```ts
import {
  Configuration,
  ProjectsApi,
} from '';
import type { ListProjectServiceAccountsRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // Configure HTTP bearer authorization: ApiKeyAuth
    accessToken: "YOUR BEARER TOKEN",
  });
  const api = new ProjectsApi(config);

  const body = {
    // string | The ID of the project.
    projectId: projectId_example,
    // number | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional)
    limit: 56,
    // string | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (optional)
    after: after_example,
  } satisfies ListProjectServiceAccountsRequest;

  try {
    const data = await api.listProjectServiceAccounts(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **projectId** | `string` | The ID of the project. | [Defaults to `undefined`] |
| **limit** | `number` | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [Optional] [Defaults to `20`] |
| **after** | `string` | A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [Optional] [Defaults to `undefined`] |

### Return type

[**ProjectServiceAccountListResponse**](ProjectServiceAccountListResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Project service accounts listed successfully. |  -  |
| **400** | Error response when project is archived. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## listProjectUsers

> ProjectUserListResponse listProjectUsers(projectId, limit, after)

Returns a list of users in the project.

### Example

```ts
import {
  Configuration,
  ProjectsApi,
} from '';
import type { ListProjectUsersRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // Configure HTTP bearer authorization: ApiKeyAuth
    accessToken: "YOUR BEARER TOKEN",
  });
  const api = new ProjectsApi(config);

  const body = {
    // string | The ID of the project.
    projectId: projectId_example,
    // number | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional)
    limit: 56,
    // string | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (optional)
    after: after_example,
  } satisfies ListProjectUsersRequest;

  try {
    const data = await api.listProjectUsers(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **projectId** | `string` | The ID of the project. | [Defaults to `undefined`] |
| **limit** | `number` | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [Optional] [Defaults to `20`] |
| **after** | `string` | A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [Optional] [Defaults to `undefined`] |

### Return type

[**ProjectUserListResponse**](ProjectUserListResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Project users listed successfully. |  -  |
| **400** | Error response when project is archived. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## listProjects

> ProjectListResponse listProjects(limit, after, includeArchived)

Returns a list of projects.

### Example

```ts
import {
  Configuration,
  ProjectsApi,
} from '';
import type { ListProjectsRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // Configure HTTP bearer authorization: ApiKeyAuth
    accessToken: "YOUR BEARER TOKEN",
  });
  const api = new ProjectsApi(config);

  const body = {
    // number | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional)
    limit: 56,
    // string | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (optional)
    after: after_example,
    // boolean | If `true` returns all projects including those that have been `archived`. Archived projects are not included by default. (optional)
    includeArchived: true,
  } satisfies ListProjectsRequest;

  try {
    const data = await api.listProjects(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **limit** | `number` | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [Optional] [Defaults to `20`] |
| **after** | `string` | A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [Optional] [Defaults to `undefined`] |
| **includeArchived** | `boolean` | If &#x60;true&#x60; returns all projects including those that have been &#x60;archived&#x60;. Archived projects are not included by default. | [Optional] [Defaults to `false`] |

### Return type

[**ProjectListResponse**](ProjectListResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Projects listed successfully. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## modifyProject

> Project modifyProject(projectId, projectUpdateRequest)

Modifies a project in the organization.

### Example

```ts
import {
  Configuration,
  ProjectsApi,
} from '';
import type { ModifyProjectRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // Configure HTTP bearer authorization: ApiKeyAuth
    accessToken: "YOUR BEARER TOKEN",
  });
  const api = new ProjectsApi(config);

  const body = {
    // string | The ID of the project.
    projectId: projectId_example,
    // ProjectUpdateRequest | The project update request payload.
    projectUpdateRequest: ...,
  } satisfies ModifyProjectRequest;

  try {
    const data = await api.modifyProject(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **projectId** | `string` | The ID of the project. | [Defaults to `undefined`] |
| **projectUpdateRequest** | [ProjectUpdateRequest](ProjectUpdateRequest.md) | The project update request payload. | |

### Return type

[**Project**](Project.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Project updated successfully. |  -  |
| **400** | Error response when updating the default project. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## modifyProjectUser

> ProjectUser modifyProjectUser(projectId, userId, projectUserUpdateRequest)

Modifies a user\&#39;s role in the project.

### Example

```ts
import {
  Configuration,
  ProjectsApi,
} from '';
import type { ModifyProjectUserRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // Configure HTTP bearer authorization: ApiKeyAuth
    accessToken: "YOUR BEARER TOKEN",
  });
  const api = new ProjectsApi(config);

  const body = {
    // string | The ID of the project.
    projectId: projectId_example,
    // string | The ID of the user.
    userId: userId_example,
    // ProjectUserUpdateRequest | The project user update request payload.
    projectUserUpdateRequest: ...,
  } satisfies ModifyProjectUserRequest;

  try {
    const data = await api.modifyProjectUser(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **projectId** | `string` | The ID of the project. | [Defaults to `undefined`] |
| **userId** | `string` | The ID of the user. | [Defaults to `undefined`] |
| **projectUserUpdateRequest** | [ProjectUserUpdateRequest](ProjectUserUpdateRequest.md) | The project user update request payload. | |

### Return type

[**ProjectUser**](ProjectUser.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Project user\&#39;s role updated successfully. |  -  |
| **400** | Error response for various conditions. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## retrieveProject

> Project retrieveProject(projectId)

Retrieves a project.

### Example

```ts
import {
  Configuration,
  ProjectsApi,
} from '';
import type { RetrieveProjectRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // Configure HTTP bearer authorization: ApiKeyAuth
    accessToken: "YOUR BEARER TOKEN",
  });
  const api = new ProjectsApi(config);

  const body = {
    // string | The ID of the project.
    projectId: projectId_example,
  } satisfies RetrieveProjectRequest;

  try {
    const data = await api.retrieveProject(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **projectId** | `string` | The ID of the project. | [Defaults to `undefined`] |

### Return type

[**Project**](Project.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Project retrieved successfully. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## retrieveProjectApiKey

> ProjectApiKey retrieveProjectApiKey(projectId, keyId)

Retrieves an API key in the project.

### Example

```ts
import {
  Configuration,
  ProjectsApi,
} from '';
import type { RetrieveProjectApiKeyRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // Configure HTTP bearer authorization: ApiKeyAuth
    accessToken: "YOUR BEARER TOKEN",
  });
  const api = new ProjectsApi(config);

  const body = {
    // string | The ID of the project.
    projectId: projectId_example,
    // string | The ID of the API key.
    keyId: keyId_example,
  } satisfies RetrieveProjectApiKeyRequest;

  try {
    const data = await api.retrieveProjectApiKey(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **projectId** | `string` | The ID of the project. | [Defaults to `undefined`] |
| **keyId** | `string` | The ID of the API key. | [Defaults to `undefined`] |

### Return type

[**ProjectApiKey**](ProjectApiKey.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Project API key retrieved successfully. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## retrieveProjectServiceAccount

> ProjectServiceAccount retrieveProjectServiceAccount(projectId, serviceAccountId)

Retrieves a service account in the project.

### Example

```ts
import {
  Configuration,
  ProjectsApi,
} from '';
import type { RetrieveProjectServiceAccountRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // Configure HTTP bearer authorization: ApiKeyAuth
    accessToken: "YOUR BEARER TOKEN",
  });
  const api = new ProjectsApi(config);

  const body = {
    // string | The ID of the project.
    projectId: projectId_example,
    // string | The ID of the service account.
    serviceAccountId: serviceAccountId_example,
  } satisfies RetrieveProjectServiceAccountRequest;

  try {
    const data = await api.retrieveProjectServiceAccount(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **projectId** | `string` | The ID of the project. | [Defaults to `undefined`] |
| **serviceAccountId** | `string` | The ID of the service account. | [Defaults to `undefined`] |

### Return type

[**ProjectServiceAccount**](ProjectServiceAccount.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Project service account retrieved successfully. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## retrieveProjectUser

> ProjectUser retrieveProjectUser(projectId, userId)

Retrieves a user in the project.

### Example

```ts
import {
  Configuration,
  ProjectsApi,
} from '';
import type { RetrieveProjectUserRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // Configure HTTP bearer authorization: ApiKeyAuth
    accessToken: "YOUR BEARER TOKEN",
  });
  const api = new ProjectsApi(config);

  const body = {
    // string | The ID of the project.
    projectId: projectId_example,
    // string | The ID of the user.
    userId: userId_example,
  } satisfies RetrieveProjectUserRequest;

  try {
    const data = await api.retrieveProjectUser(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **projectId** | `string` | The ID of the project. | [Defaults to `undefined`] |
| **userId** | `string` | The ID of the user. | [Defaults to `undefined`] |

### Return type

[**ProjectUser**](ProjectUser.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Project user retrieved successfully. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## updateProjectRateLimits

> ProjectRateLimit updateProjectRateLimits(projectId, rateLimitId, projectRateLimitUpdateRequest)

Updates a project rate limit.

### Example

```ts
import {
  Configuration,
  ProjectsApi,
} from '';
import type { UpdateProjectRateLimitsRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // Configure HTTP bearer authorization: ApiKeyAuth
    accessToken: "YOUR BEARER TOKEN",
  });
  const api = new ProjectsApi(config);

  const body = {
    // string | The ID of the project.
    projectId: projectId_example,
    // string | The ID of the rate limit.
    rateLimitId: rateLimitId_example,
    // ProjectRateLimitUpdateRequest | The project rate limit update request payload.
    projectRateLimitUpdateRequest: ...,
  } satisfies UpdateProjectRateLimitsRequest;

  try {
    const data = await api.updateProjectRateLimits(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **projectId** | `string` | The ID of the project. | [Defaults to `undefined`] |
| **rateLimitId** | `string` | The ID of the rate limit. | [Defaults to `undefined`] |
| **projectRateLimitUpdateRequest** | [ProjectRateLimitUpdateRequest](ProjectRateLimitUpdateRequest.md) | The project rate limit update request payload. | |

### Return type

[**ProjectRateLimit**](ProjectRateLimit.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Project rate limit updated successfully. |  -  |
| **400** | Error response for various conditions. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

