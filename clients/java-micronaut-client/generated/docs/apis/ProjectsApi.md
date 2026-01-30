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


## Creating ProjectsApi

To initiate an instance of `ProjectsApi`, you can use micronaut's `ApplicationContext`:
```java
/* imports
import io.micronaut.runtime.Micronaut;
import io.micronaut.context.ApplicationContext;
import org.openapitools.api.ProjectsApi;
*/

ApplicationContext context = Micronaut.run(/* ... */);
PetApi apiInstance = context.getBean(ProjectsApi.class);
```

Or the `@Inject` annotation:
```java
@Singleton
class MyClass {
    @Inject
    ProjectsApi projectsApi;

    /* ... use the injected variable */
}
```
Note that the class needs to be annotated with one of Micronaut's [scope annotations](https://docs.micronaut.io/latest/guide/#scopes) like `Singleton` in order to be processed.

More information can be found inside [Inversion of Control guide section](https://docs.micronaut.io/latest/guide/#ioc).

<a id="archiveProject"></a>
# **archiveProject**
```java
Mono<Project> ProjectsApi.archiveProject(projectId)
```

Archives a project in the organization. Archived projects cannot be used or updated.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **projectId** | `String`| The ID of the project. | |


### Return type
[**Project**](Project.md)

### Authorization
* **[ApiKeyAuth](auth.md#ApiKeyAuth)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="createProject"></a>
# **createProject**
```java
Mono<Project> ProjectsApi.createProject(projectCreateRequest)
```

Create a new project in the organization. Projects can be created and archived, but cannot be deleted.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **projectCreateRequest** | [**ProjectCreateRequest**](ProjectCreateRequest.md)| The project create request payload. | |


### Return type
[**Project**](Project.md)

### Authorization
* **[ApiKeyAuth](auth.md#ApiKeyAuth)**

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

<a id="createProjectServiceAccount"></a>
# **createProjectServiceAccount**
```java
Mono<ProjectServiceAccountCreateResponse> ProjectsApi.createProjectServiceAccount(projectIdprojectServiceAccountCreateRequest)
```

Creates a new service account in the project. This also returns an unredacted API key for the service account.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **projectId** | `String`| The ID of the project. | |
| **projectServiceAccountCreateRequest** | [**ProjectServiceAccountCreateRequest**](ProjectServiceAccountCreateRequest.md)| The project service account create request payload. | |


### Return type
[**ProjectServiceAccountCreateResponse**](ProjectServiceAccountCreateResponse.md)

### Authorization
* **[ApiKeyAuth](auth.md#ApiKeyAuth)**

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

<a id="createProjectUser"></a>
# **createProjectUser**
```java
Mono<ProjectUser> ProjectsApi.createProjectUser(projectIdprojectUserCreateRequest)
```

Adds a user to the project. Users must already be members of the organization to be added to a project.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **projectId** | `String`| The ID of the project. | |
| **projectUserCreateRequest** | [**ProjectUserCreateRequest**](ProjectUserCreateRequest.md)| The project user create request payload. | |


### Return type
[**ProjectUser**](ProjectUser.md)

### Authorization
* **[ApiKeyAuth](auth.md#ApiKeyAuth)**

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

<a id="deleteProjectApiKey"></a>
# **deleteProjectApiKey**
```java
Mono<ProjectApiKeyDeleteResponse> ProjectsApi.deleteProjectApiKey(projectIdkeyId)
```

Deletes an API key from the project.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **projectId** | `String`| The ID of the project. | |
| **keyId** | `String`| The ID of the API key. | |


### Return type
[**ProjectApiKeyDeleteResponse**](ProjectApiKeyDeleteResponse.md)

### Authorization
* **[ApiKeyAuth](auth.md#ApiKeyAuth)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="deleteProjectServiceAccount"></a>
# **deleteProjectServiceAccount**
```java
Mono<ProjectServiceAccountDeleteResponse> ProjectsApi.deleteProjectServiceAccount(projectIdserviceAccountId)
```

Deletes a service account from the project.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **projectId** | `String`| The ID of the project. | |
| **serviceAccountId** | `String`| The ID of the service account. | |


### Return type
[**ProjectServiceAccountDeleteResponse**](ProjectServiceAccountDeleteResponse.md)

### Authorization
* **[ApiKeyAuth](auth.md#ApiKeyAuth)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="deleteProjectUser"></a>
# **deleteProjectUser**
```java
Mono<ProjectUserDeleteResponse> ProjectsApi.deleteProjectUser(projectIduserId)
```

Deletes a user from the project.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **projectId** | `String`| The ID of the project. | |
| **userId** | `String`| The ID of the user. | |


### Return type
[**ProjectUserDeleteResponse**](ProjectUserDeleteResponse.md)

### Authorization
* **[ApiKeyAuth](auth.md#ApiKeyAuth)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="listProjectApiKeys"></a>
# **listProjectApiKeys**
```java
Mono<ProjectApiKeyListResponse> ProjectsApi.listProjectApiKeys(projectIdlimitafter)
```

Returns a list of API keys in the project.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **projectId** | `String`| The ID of the project. | |
| **limit** | `Integer`| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional parameter] [default to `20`] |
| **after** | `String`| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional parameter] |


### Return type
[**ProjectApiKeyListResponse**](ProjectApiKeyListResponse.md)

### Authorization
* **[ApiKeyAuth](auth.md#ApiKeyAuth)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="listProjectRateLimits"></a>
# **listProjectRateLimits**
```java
Mono<ProjectRateLimitListResponse> ProjectsApi.listProjectRateLimits(projectIdlimitafterbefore)
```

Returns the rate limits per model for a project.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **projectId** | `String`| The ID of the project. | |
| **limit** | `Integer`| A limit on the number of objects to be returned. The default is 100.  | [optional parameter] [default to `100`] |
| **after** | `String`| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional parameter] |
| **before** | `String`| A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, beginning with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [optional parameter] |


### Return type
[**ProjectRateLimitListResponse**](ProjectRateLimitListResponse.md)

### Authorization
* **[ApiKeyAuth](auth.md#ApiKeyAuth)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="listProjectServiceAccounts"></a>
# **listProjectServiceAccounts**
```java
Mono<ProjectServiceAccountListResponse> ProjectsApi.listProjectServiceAccounts(projectIdlimitafter)
```

Returns a list of service accounts in the project.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **projectId** | `String`| The ID of the project. | |
| **limit** | `Integer`| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional parameter] [default to `20`] |
| **after** | `String`| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional parameter] |


### Return type
[**ProjectServiceAccountListResponse**](ProjectServiceAccountListResponse.md)

### Authorization
* **[ApiKeyAuth](auth.md#ApiKeyAuth)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="listProjectUsers"></a>
# **listProjectUsers**
```java
Mono<ProjectUserListResponse> ProjectsApi.listProjectUsers(projectIdlimitafter)
```

Returns a list of users in the project.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **projectId** | `String`| The ID of the project. | |
| **limit** | `Integer`| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional parameter] [default to `20`] |
| **after** | `String`| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional parameter] |


### Return type
[**ProjectUserListResponse**](ProjectUserListResponse.md)

### Authorization
* **[ApiKeyAuth](auth.md#ApiKeyAuth)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="listProjects"></a>
# **listProjects**
```java
Mono<ProjectListResponse> ProjectsApi.listProjects(limitafterincludeArchived)
```

Returns a list of projects.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **limit** | `Integer`| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional parameter] [default to `20`] |
| **after** | `String`| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional parameter] |
| **includeArchived** | `Boolean`| If &#x60;true&#x60; returns all projects including those that have been &#x60;archived&#x60;. Archived projects are not included by default. | [optional parameter] [default to `false`] |


### Return type
[**ProjectListResponse**](ProjectListResponse.md)

### Authorization
* **[ApiKeyAuth](auth.md#ApiKeyAuth)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="modifyProject"></a>
# **modifyProject**
```java
Mono<Project> ProjectsApi.modifyProject(projectIdprojectUpdateRequest)
```

Modifies a project in the organization.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **projectId** | `String`| The ID of the project. | |
| **projectUpdateRequest** | [**ProjectUpdateRequest**](ProjectUpdateRequest.md)| The project update request payload. | |


### Return type
[**Project**](Project.md)

### Authorization
* **[ApiKeyAuth](auth.md#ApiKeyAuth)**

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

<a id="modifyProjectUser"></a>
# **modifyProjectUser**
```java
Mono<ProjectUser> ProjectsApi.modifyProjectUser(projectIduserIdprojectUserUpdateRequest)
```

Modifies a user&#39;s role in the project.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **projectId** | `String`| The ID of the project. | |
| **userId** | `String`| The ID of the user. | |
| **projectUserUpdateRequest** | [**ProjectUserUpdateRequest**](ProjectUserUpdateRequest.md)| The project user update request payload. | |


### Return type
[**ProjectUser**](ProjectUser.md)

### Authorization
* **[ApiKeyAuth](auth.md#ApiKeyAuth)**

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

<a id="retrieveProject"></a>
# **retrieveProject**
```java
Mono<Project> ProjectsApi.retrieveProject(projectId)
```

Retrieves a project.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **projectId** | `String`| The ID of the project. | |


### Return type
[**Project**](Project.md)

### Authorization
* **[ApiKeyAuth](auth.md#ApiKeyAuth)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="retrieveProjectApiKey"></a>
# **retrieveProjectApiKey**
```java
Mono<ProjectApiKey> ProjectsApi.retrieveProjectApiKey(projectIdkeyId)
```

Retrieves an API key in the project.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **projectId** | `String`| The ID of the project. | |
| **keyId** | `String`| The ID of the API key. | |


### Return type
[**ProjectApiKey**](ProjectApiKey.md)

### Authorization
* **[ApiKeyAuth](auth.md#ApiKeyAuth)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="retrieveProjectServiceAccount"></a>
# **retrieveProjectServiceAccount**
```java
Mono<ProjectServiceAccount> ProjectsApi.retrieveProjectServiceAccount(projectIdserviceAccountId)
```

Retrieves a service account in the project.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **projectId** | `String`| The ID of the project. | |
| **serviceAccountId** | `String`| The ID of the service account. | |


### Return type
[**ProjectServiceAccount**](ProjectServiceAccount.md)

### Authorization
* **[ApiKeyAuth](auth.md#ApiKeyAuth)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="retrieveProjectUser"></a>
# **retrieveProjectUser**
```java
Mono<ProjectUser> ProjectsApi.retrieveProjectUser(projectIduserId)
```

Retrieves a user in the project.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **projectId** | `String`| The ID of the project. | |
| **userId** | `String`| The ID of the user. | |


### Return type
[**ProjectUser**](ProjectUser.md)

### Authorization
* **[ApiKeyAuth](auth.md#ApiKeyAuth)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="updateProjectRateLimits"></a>
# **updateProjectRateLimits**
```java
Mono<ProjectRateLimit> ProjectsApi.updateProjectRateLimits(projectIdrateLimitIdprojectRateLimitUpdateRequest)
```

Updates a project rate limit.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **projectId** | `String`| The ID of the project. | |
| **rateLimitId** | `String`| The ID of the rate limit. | |
| **projectRateLimitUpdateRequest** | [**ProjectRateLimitUpdateRequest**](ProjectRateLimitUpdateRequest.md)| The project rate limit update request payload. | |


### Return type
[**ProjectRateLimit**](ProjectRateLimit.md)

### Authorization
* **[ApiKeyAuth](auth.md#ApiKeyAuth)**

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

