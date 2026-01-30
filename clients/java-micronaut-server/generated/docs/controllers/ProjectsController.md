# ProjectsController

All URIs are relative to `"/v1"`

The controller class is defined in **[ProjectsController.java](../../src/main/java/org/openapitools/controller/ProjectsController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**archiveProject**](#archiveProject) | **POST** /organization/projects/{project_id}/archive | Archives a project in the organization. Archived projects cannot be used or updated.
[**createProject**](#createProject) | **POST** /organization/projects | Create a new project in the organization. Projects can be created and archived, but cannot be deleted.
[**createProjectServiceAccount**](#createProjectServiceAccount) | **POST** /organization/projects/{project_id}/service_accounts | Creates a new service account in the project. This also returns an unredacted API key for the service account.
[**createProjectUser**](#createProjectUser) | **POST** /organization/projects/{project_id}/users | Adds a user to the project. Users must already be members of the organization to be added to a project.
[**deleteProjectApiKey**](#deleteProjectApiKey) | **DELETE** /organization/projects/{project_id}/api_keys/{key_id} | Deletes an API key from the project.
[**deleteProjectServiceAccount**](#deleteProjectServiceAccount) | **DELETE** /organization/projects/{project_id}/service_accounts/{service_account_id} | Deletes a service account from the project.
[**deleteProjectUser**](#deleteProjectUser) | **DELETE** /organization/projects/{project_id}/users/{user_id} | Deletes a user from the project.
[**listProjectApiKeys**](#listProjectApiKeys) | **GET** /organization/projects/{project_id}/api_keys | Returns a list of API keys in the project.
[**listProjectRateLimits**](#listProjectRateLimits) | **GET** /organization/projects/{project_id}/rate_limits | Returns the rate limits per model for a project.
[**listProjectServiceAccounts**](#listProjectServiceAccounts) | **GET** /organization/projects/{project_id}/service_accounts | Returns a list of service accounts in the project.
[**listProjectUsers**](#listProjectUsers) | **GET** /organization/projects/{project_id}/users | Returns a list of users in the project.
[**listProjects**](#listProjects) | **GET** /organization/projects | Returns a list of projects.
[**modifyProject**](#modifyProject) | **POST** /organization/projects/{project_id} | Modifies a project in the organization.
[**modifyProjectUser**](#modifyProjectUser) | **POST** /organization/projects/{project_id}/users/{user_id} | Modifies a user&#39;s role in the project.
[**retrieveProject**](#retrieveProject) | **GET** /organization/projects/{project_id} | Retrieves a project.
[**retrieveProjectApiKey**](#retrieveProjectApiKey) | **GET** /organization/projects/{project_id}/api_keys/{key_id} | Retrieves an API key in the project.
[**retrieveProjectServiceAccount**](#retrieveProjectServiceAccount) | **GET** /organization/projects/{project_id}/service_accounts/{service_account_id} | Retrieves a service account in the project.
[**retrieveProjectUser**](#retrieveProjectUser) | **GET** /organization/projects/{project_id}/users/{user_id} | Retrieves a user in the project.
[**updateProjectRateLimits**](#updateProjectRateLimits) | **POST** /organization/projects/{project_id}/rate_limits/{rate_limit_id} | Updates a project rate limit.

<a id="archiveProject"></a>
# **archiveProject**
```java
Mono<Project> ProjectsController.archiveProject(projectId)
```

Archives a project in the organization. Archived projects cannot be used or updated.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**projectId** | `String` | The ID of the project. |

### Return type
[**Project**](../../docs/models/Project.md)

### Authorization
* **ApiKeyAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="createProject"></a>
# **createProject**
```java
Mono<Project> ProjectsController.createProject(projectCreateRequest)
```

Create a new project in the organization. Projects can be created and archived, but cannot be deleted.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**projectCreateRequest** | [**ProjectCreateRequest**](../../docs/models/ProjectCreateRequest.md) | The project create request payload. |

### Return type
[**Project**](../../docs/models/Project.md)

### Authorization
* **ApiKeyAuth**

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

<a id="createProjectServiceAccount"></a>
# **createProjectServiceAccount**
```java
Mono<ProjectServiceAccountCreateResponse> ProjectsController.createProjectServiceAccount(projectIdprojectServiceAccountCreateRequest)
```

Creates a new service account in the project. This also returns an unredacted API key for the service account.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**projectId** | `String` | The ID of the project. |
**projectServiceAccountCreateRequest** | [**ProjectServiceAccountCreateRequest**](../../docs/models/ProjectServiceAccountCreateRequest.md) | The project service account create request payload. |

### Return type
[**ProjectServiceAccountCreateResponse**](../../docs/models/ProjectServiceAccountCreateResponse.md)

### Authorization
* **ApiKeyAuth**

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

<a id="createProjectUser"></a>
# **createProjectUser**
```java
Mono<ProjectUser> ProjectsController.createProjectUser(projectIdprojectUserCreateRequest)
```

Adds a user to the project. Users must already be members of the organization to be added to a project.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**projectId** | `String` | The ID of the project. |
**projectUserCreateRequest** | [**ProjectUserCreateRequest**](../../docs/models/ProjectUserCreateRequest.md) | The project user create request payload. |

### Return type
[**ProjectUser**](../../docs/models/ProjectUser.md)

### Authorization
* **ApiKeyAuth**

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

<a id="deleteProjectApiKey"></a>
# **deleteProjectApiKey**
```java
Mono<ProjectApiKeyDeleteResponse> ProjectsController.deleteProjectApiKey(projectIdkeyId)
```

Deletes an API key from the project.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**projectId** | `String` | The ID of the project. |
**keyId** | `String` | The ID of the API key. |

### Return type
[**ProjectApiKeyDeleteResponse**](../../docs/models/ProjectApiKeyDeleteResponse.md)

### Authorization
* **ApiKeyAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="deleteProjectServiceAccount"></a>
# **deleteProjectServiceAccount**
```java
Mono<ProjectServiceAccountDeleteResponse> ProjectsController.deleteProjectServiceAccount(projectIdserviceAccountId)
```

Deletes a service account from the project.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**projectId** | `String` | The ID of the project. |
**serviceAccountId** | `String` | The ID of the service account. |

### Return type
[**ProjectServiceAccountDeleteResponse**](../../docs/models/ProjectServiceAccountDeleteResponse.md)

### Authorization
* **ApiKeyAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="deleteProjectUser"></a>
# **deleteProjectUser**
```java
Mono<ProjectUserDeleteResponse> ProjectsController.deleteProjectUser(projectIduserId)
```

Deletes a user from the project.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**projectId** | `String` | The ID of the project. |
**userId** | `String` | The ID of the user. |

### Return type
[**ProjectUserDeleteResponse**](../../docs/models/ProjectUserDeleteResponse.md)

### Authorization
* **ApiKeyAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="listProjectApiKeys"></a>
# **listProjectApiKeys**
```java
Mono<ProjectApiKeyListResponse> ProjectsController.listProjectApiKeys(projectIdlimitafter)
```

Returns a list of API keys in the project.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**projectId** | `String` | The ID of the project. |
**limit** | `Integer` | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional parameter] [default to `20`]
**after** | `String` | A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional parameter]

### Return type
[**ProjectApiKeyListResponse**](../../docs/models/ProjectApiKeyListResponse.md)

### Authorization
* **ApiKeyAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="listProjectRateLimits"></a>
# **listProjectRateLimits**
```java
Mono<ProjectRateLimitListResponse> ProjectsController.listProjectRateLimits(projectIdlimitafterbefore)
```

Returns the rate limits per model for a project.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**projectId** | `String` | The ID of the project. |
**limit** | `Integer` | A limit on the number of objects to be returned. The default is 100.  | [optional parameter] [default to `100`]
**after** | `String` | A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional parameter]
**before** | `String` | A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, beginning with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [optional parameter]

### Return type
[**ProjectRateLimitListResponse**](../../docs/models/ProjectRateLimitListResponse.md)

### Authorization
* **ApiKeyAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="listProjectServiceAccounts"></a>
# **listProjectServiceAccounts**
```java
Mono<ProjectServiceAccountListResponse> ProjectsController.listProjectServiceAccounts(projectIdlimitafter)
```

Returns a list of service accounts in the project.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**projectId** | `String` | The ID of the project. |
**limit** | `Integer` | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional parameter] [default to `20`]
**after** | `String` | A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional parameter]

### Return type
[**ProjectServiceAccountListResponse**](../../docs/models/ProjectServiceAccountListResponse.md)

### Authorization
* **ApiKeyAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="listProjectUsers"></a>
# **listProjectUsers**
```java
Mono<ProjectUserListResponse> ProjectsController.listProjectUsers(projectIdlimitafter)
```

Returns a list of users in the project.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**projectId** | `String` | The ID of the project. |
**limit** | `Integer` | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional parameter] [default to `20`]
**after** | `String` | A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional parameter]

### Return type
[**ProjectUserListResponse**](../../docs/models/ProjectUserListResponse.md)

### Authorization
* **ApiKeyAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="listProjects"></a>
# **listProjects**
```java
Mono<ProjectListResponse> ProjectsController.listProjects(limitafterincludeArchived)
```

Returns a list of projects.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**limit** | `Integer` | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional parameter] [default to `20`]
**after** | `String` | A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional parameter]
**includeArchived** | `Boolean` | If &#x60;true&#x60; returns all projects including those that have been &#x60;archived&#x60;. Archived projects are not included by default. | [optional parameter] [default to `false`]

### Return type
[**ProjectListResponse**](../../docs/models/ProjectListResponse.md)

### Authorization
* **ApiKeyAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="modifyProject"></a>
# **modifyProject**
```java
Mono<Project> ProjectsController.modifyProject(projectIdprojectUpdateRequest)
```

Modifies a project in the organization.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**projectId** | `String` | The ID of the project. |
**projectUpdateRequest** | [**ProjectUpdateRequest**](../../docs/models/ProjectUpdateRequest.md) | The project update request payload. |

### Return type
[**Project**](../../docs/models/Project.md)

### Authorization
* **ApiKeyAuth**

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

<a id="modifyProjectUser"></a>
# **modifyProjectUser**
```java
Mono<ProjectUser> ProjectsController.modifyProjectUser(projectIduserIdprojectUserUpdateRequest)
```

Modifies a user&#39;s role in the project.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**projectId** | `String` | The ID of the project. |
**userId** | `String` | The ID of the user. |
**projectUserUpdateRequest** | [**ProjectUserUpdateRequest**](../../docs/models/ProjectUserUpdateRequest.md) | The project user update request payload. |

### Return type
[**ProjectUser**](../../docs/models/ProjectUser.md)

### Authorization
* **ApiKeyAuth**

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

<a id="retrieveProject"></a>
# **retrieveProject**
```java
Mono<Project> ProjectsController.retrieveProject(projectId)
```

Retrieves a project.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**projectId** | `String` | The ID of the project. |

### Return type
[**Project**](../../docs/models/Project.md)

### Authorization
* **ApiKeyAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="retrieveProjectApiKey"></a>
# **retrieveProjectApiKey**
```java
Mono<ProjectApiKey> ProjectsController.retrieveProjectApiKey(projectIdkeyId)
```

Retrieves an API key in the project.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**projectId** | `String` | The ID of the project. |
**keyId** | `String` | The ID of the API key. |

### Return type
[**ProjectApiKey**](../../docs/models/ProjectApiKey.md)

### Authorization
* **ApiKeyAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="retrieveProjectServiceAccount"></a>
# **retrieveProjectServiceAccount**
```java
Mono<ProjectServiceAccount> ProjectsController.retrieveProjectServiceAccount(projectIdserviceAccountId)
```

Retrieves a service account in the project.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**projectId** | `String` | The ID of the project. |
**serviceAccountId** | `String` | The ID of the service account. |

### Return type
[**ProjectServiceAccount**](../../docs/models/ProjectServiceAccount.md)

### Authorization
* **ApiKeyAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="retrieveProjectUser"></a>
# **retrieveProjectUser**
```java
Mono<ProjectUser> ProjectsController.retrieveProjectUser(projectIduserId)
```

Retrieves a user in the project.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**projectId** | `String` | The ID of the project. |
**userId** | `String` | The ID of the user. |

### Return type
[**ProjectUser**](../../docs/models/ProjectUser.md)

### Authorization
* **ApiKeyAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="updateProjectRateLimits"></a>
# **updateProjectRateLimits**
```java
Mono<ProjectRateLimit> ProjectsController.updateProjectRateLimits(projectIdrateLimitIdprojectRateLimitUpdateRequest)
```

Updates a project rate limit.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**projectId** | `String` | The ID of the project. |
**rateLimitId** | `String` | The ID of the rate limit. |
**projectRateLimitUpdateRequest** | [**ProjectRateLimitUpdateRequest**](../../docs/models/ProjectRateLimitUpdateRequest.md) | The project rate limit update request payload. |

### Return type
[**ProjectRateLimit**](../../docs/models/ProjectRateLimit.md)

### Authorization
* **ApiKeyAuth**

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

