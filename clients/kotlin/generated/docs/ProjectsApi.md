# ProjectsApi

All URIs are relative to *https://api.openai.com/v1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
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


<a id="archiveProject"></a>
# **archiveProject**
> Project archiveProject(projectId)

Archives a project in the organization. Archived projects cannot be used or updated.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectsApi()
val projectId : kotlin.String = projectId_example // kotlin.String | The ID of the project.
try {
    val result : Project = apiInstance.archiveProject(projectId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectsApi#archiveProject")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectsApi#archiveProject")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **projectId** | **kotlin.String**| The ID of the project. | |

### Return type

[**Project**](Project.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="createProject"></a>
# **createProject**
> Project createProject(projectCreateRequest)

Create a new project in the organization. Projects can be created and archived, but cannot be deleted.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectsApi()
val projectCreateRequest : ProjectCreateRequest =  // ProjectCreateRequest | The project create request payload.
try {
    val result : Project = apiInstance.createProject(projectCreateRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectsApi#createProject")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectsApi#createProject")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **projectCreateRequest** | [**ProjectCreateRequest**](ProjectCreateRequest.md)| The project create request payload. | |

### Return type

[**Project**](Project.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="createProjectServiceAccount"></a>
# **createProjectServiceAccount**
> ProjectServiceAccountCreateResponse createProjectServiceAccount(projectId, projectServiceAccountCreateRequest)

Creates a new service account in the project. This also returns an unredacted API key for the service account.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectsApi()
val projectId : kotlin.String = projectId_example // kotlin.String | The ID of the project.
val projectServiceAccountCreateRequest : ProjectServiceAccountCreateRequest =  // ProjectServiceAccountCreateRequest | The project service account create request payload.
try {
    val result : ProjectServiceAccountCreateResponse = apiInstance.createProjectServiceAccount(projectId, projectServiceAccountCreateRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectsApi#createProjectServiceAccount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectsApi#createProjectServiceAccount")
    e.printStackTrace()
}
```

### Parameters
| **projectId** | **kotlin.String**| The ID of the project. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **projectServiceAccountCreateRequest** | [**ProjectServiceAccountCreateRequest**](ProjectServiceAccountCreateRequest.md)| The project service account create request payload. | |

### Return type

[**ProjectServiceAccountCreateResponse**](ProjectServiceAccountCreateResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="createProjectUser"></a>
# **createProjectUser**
> ProjectUser createProjectUser(projectId, projectUserCreateRequest)

Adds a user to the project. Users must already be members of the organization to be added to a project.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectsApi()
val projectId : kotlin.String = projectId_example // kotlin.String | The ID of the project.
val projectUserCreateRequest : ProjectUserCreateRequest =  // ProjectUserCreateRequest | The project user create request payload.
try {
    val result : ProjectUser = apiInstance.createProjectUser(projectId, projectUserCreateRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectsApi#createProjectUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectsApi#createProjectUser")
    e.printStackTrace()
}
```

### Parameters
| **projectId** | **kotlin.String**| The ID of the project. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **projectUserCreateRequest** | [**ProjectUserCreateRequest**](ProjectUserCreateRequest.md)| The project user create request payload. | |

### Return type

[**ProjectUser**](ProjectUser.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteProjectApiKey"></a>
# **deleteProjectApiKey**
> ProjectApiKeyDeleteResponse deleteProjectApiKey(projectId, keyId)

Deletes an API key from the project.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectsApi()
val projectId : kotlin.String = projectId_example // kotlin.String | The ID of the project.
val keyId : kotlin.String = keyId_example // kotlin.String | The ID of the API key.
try {
    val result : ProjectApiKeyDeleteResponse = apiInstance.deleteProjectApiKey(projectId, keyId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectsApi#deleteProjectApiKey")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectsApi#deleteProjectApiKey")
    e.printStackTrace()
}
```

### Parameters
| **projectId** | **kotlin.String**| The ID of the project. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **keyId** | **kotlin.String**| The ID of the API key. | |

### Return type

[**ProjectApiKeyDeleteResponse**](ProjectApiKeyDeleteResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="deleteProjectServiceAccount"></a>
# **deleteProjectServiceAccount**
> ProjectServiceAccountDeleteResponse deleteProjectServiceAccount(projectId, serviceAccountId)

Deletes a service account from the project.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectsApi()
val projectId : kotlin.String = projectId_example // kotlin.String | The ID of the project.
val serviceAccountId : kotlin.String = serviceAccountId_example // kotlin.String | The ID of the service account.
try {
    val result : ProjectServiceAccountDeleteResponse = apiInstance.deleteProjectServiceAccount(projectId, serviceAccountId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectsApi#deleteProjectServiceAccount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectsApi#deleteProjectServiceAccount")
    e.printStackTrace()
}
```

### Parameters
| **projectId** | **kotlin.String**| The ID of the project. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **serviceAccountId** | **kotlin.String**| The ID of the service account. | |

### Return type

[**ProjectServiceAccountDeleteResponse**](ProjectServiceAccountDeleteResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="deleteProjectUser"></a>
# **deleteProjectUser**
> ProjectUserDeleteResponse deleteProjectUser(projectId, userId)

Deletes a user from the project.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectsApi()
val projectId : kotlin.String = projectId_example // kotlin.String | The ID of the project.
val userId : kotlin.String = userId_example // kotlin.String | The ID of the user.
try {
    val result : ProjectUserDeleteResponse = apiInstance.deleteProjectUser(projectId, userId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectsApi#deleteProjectUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectsApi#deleteProjectUser")
    e.printStackTrace()
}
```

### Parameters
| **projectId** | **kotlin.String**| The ID of the project. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **kotlin.String**| The ID of the user. | |

### Return type

[**ProjectUserDeleteResponse**](ProjectUserDeleteResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="listProjectApiKeys"></a>
# **listProjectApiKeys**
> ProjectApiKeyListResponse listProjectApiKeys(projectId, limit, after)

Returns a list of API keys in the project.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectsApi()
val projectId : kotlin.String = projectId_example // kotlin.String | The ID of the project.
val limit : kotlin.Int = 56 // kotlin.Int | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
val after : kotlin.String = after_example // kotlin.String | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
try {
    val result : ProjectApiKeyListResponse = apiInstance.listProjectApiKeys(projectId, limit, after)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectsApi#listProjectApiKeys")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectsApi#listProjectApiKeys")
    e.printStackTrace()
}
```

### Parameters
| **projectId** | **kotlin.String**| The ID of the project. | |
| **limit** | **kotlin.Int**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **after** | **kotlin.String**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] |

### Return type

[**ProjectApiKeyListResponse**](ProjectApiKeyListResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="listProjectRateLimits"></a>
# **listProjectRateLimits**
> ProjectRateLimitListResponse listProjectRateLimits(projectId, limit, after, before)

Returns the rate limits per model for a project.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectsApi()
val projectId : kotlin.String = projectId_example // kotlin.String | The ID of the project.
val limit : kotlin.Int = 56 // kotlin.Int | A limit on the number of objects to be returned. The default is 100. 
val after : kotlin.String = after_example // kotlin.String | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
val before : kotlin.String = before_example // kotlin.String | A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, beginning with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. 
try {
    val result : ProjectRateLimitListResponse = apiInstance.listProjectRateLimits(projectId, limit, after, before)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectsApi#listProjectRateLimits")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectsApi#listProjectRateLimits")
    e.printStackTrace()
}
```

### Parameters
| **projectId** | **kotlin.String**| The ID of the project. | |
| **limit** | **kotlin.Int**| A limit on the number of objects to be returned. The default is 100.  | [optional] [default to 100] |
| **after** | **kotlin.String**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **before** | **kotlin.String**| A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, beginning with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [optional] |

### Return type

[**ProjectRateLimitListResponse**](ProjectRateLimitListResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="listProjectServiceAccounts"></a>
# **listProjectServiceAccounts**
> ProjectServiceAccountListResponse listProjectServiceAccounts(projectId, limit, after)

Returns a list of service accounts in the project.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectsApi()
val projectId : kotlin.String = projectId_example // kotlin.String | The ID of the project.
val limit : kotlin.Int = 56 // kotlin.Int | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
val after : kotlin.String = after_example // kotlin.String | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
try {
    val result : ProjectServiceAccountListResponse = apiInstance.listProjectServiceAccounts(projectId, limit, after)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectsApi#listProjectServiceAccounts")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectsApi#listProjectServiceAccounts")
    e.printStackTrace()
}
```

### Parameters
| **projectId** | **kotlin.String**| The ID of the project. | |
| **limit** | **kotlin.Int**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **after** | **kotlin.String**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] |

### Return type

[**ProjectServiceAccountListResponse**](ProjectServiceAccountListResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="listProjectUsers"></a>
# **listProjectUsers**
> ProjectUserListResponse listProjectUsers(projectId, limit, after)

Returns a list of users in the project.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectsApi()
val projectId : kotlin.String = projectId_example // kotlin.String | The ID of the project.
val limit : kotlin.Int = 56 // kotlin.Int | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
val after : kotlin.String = after_example // kotlin.String | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
try {
    val result : ProjectUserListResponse = apiInstance.listProjectUsers(projectId, limit, after)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectsApi#listProjectUsers")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectsApi#listProjectUsers")
    e.printStackTrace()
}
```

### Parameters
| **projectId** | **kotlin.String**| The ID of the project. | |
| **limit** | **kotlin.Int**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **after** | **kotlin.String**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] |

### Return type

[**ProjectUserListResponse**](ProjectUserListResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="listProjects"></a>
# **listProjects**
> ProjectListResponse listProjects(limit, after, includeArchived)

Returns a list of projects.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectsApi()
val limit : kotlin.Int = 56 // kotlin.Int | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
val after : kotlin.String = after_example // kotlin.String | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
val includeArchived : kotlin.Boolean = true // kotlin.Boolean | If `true` returns all projects including those that have been `archived`. Archived projects are not included by default.
try {
    val result : ProjectListResponse = apiInstance.listProjects(limit, after, includeArchived)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectsApi#listProjects")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectsApi#listProjects")
    e.printStackTrace()
}
```

### Parameters
| **limit** | **kotlin.Int**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20] |
| **after** | **kotlin.String**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **includeArchived** | **kotlin.Boolean**| If &#x60;true&#x60; returns all projects including those that have been &#x60;archived&#x60;. Archived projects are not included by default. | [optional] [default to false] |

### Return type

[**ProjectListResponse**](ProjectListResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="modifyProject"></a>
# **modifyProject**
> Project modifyProject(projectId, projectUpdateRequest)

Modifies a project in the organization.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectsApi()
val projectId : kotlin.String = projectId_example // kotlin.String | The ID of the project.
val projectUpdateRequest : ProjectUpdateRequest =  // ProjectUpdateRequest | The project update request payload.
try {
    val result : Project = apiInstance.modifyProject(projectId, projectUpdateRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectsApi#modifyProject")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectsApi#modifyProject")
    e.printStackTrace()
}
```

### Parameters
| **projectId** | **kotlin.String**| The ID of the project. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **projectUpdateRequest** | [**ProjectUpdateRequest**](ProjectUpdateRequest.md)| The project update request payload. | |

### Return type

[**Project**](Project.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="modifyProjectUser"></a>
# **modifyProjectUser**
> ProjectUser modifyProjectUser(projectId, userId, projectUserUpdateRequest)

Modifies a user&#39;s role in the project.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectsApi()
val projectId : kotlin.String = projectId_example // kotlin.String | The ID of the project.
val userId : kotlin.String = userId_example // kotlin.String | The ID of the user.
val projectUserUpdateRequest : ProjectUserUpdateRequest =  // ProjectUserUpdateRequest | The project user update request payload.
try {
    val result : ProjectUser = apiInstance.modifyProjectUser(projectId, userId, projectUserUpdateRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectsApi#modifyProjectUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectsApi#modifyProjectUser")
    e.printStackTrace()
}
```

### Parameters
| **projectId** | **kotlin.String**| The ID of the project. | |
| **userId** | **kotlin.String**| The ID of the user. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **projectUserUpdateRequest** | [**ProjectUserUpdateRequest**](ProjectUserUpdateRequest.md)| The project user update request payload. | |

### Return type

[**ProjectUser**](ProjectUser.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="retrieveProject"></a>
# **retrieveProject**
> Project retrieveProject(projectId)

Retrieves a project.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectsApi()
val projectId : kotlin.String = projectId_example // kotlin.String | The ID of the project.
try {
    val result : Project = apiInstance.retrieveProject(projectId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectsApi#retrieveProject")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectsApi#retrieveProject")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **projectId** | **kotlin.String**| The ID of the project. | |

### Return type

[**Project**](Project.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="retrieveProjectApiKey"></a>
# **retrieveProjectApiKey**
> ProjectApiKey retrieveProjectApiKey(projectId, keyId)

Retrieves an API key in the project.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectsApi()
val projectId : kotlin.String = projectId_example // kotlin.String | The ID of the project.
val keyId : kotlin.String = keyId_example // kotlin.String | The ID of the API key.
try {
    val result : ProjectApiKey = apiInstance.retrieveProjectApiKey(projectId, keyId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectsApi#retrieveProjectApiKey")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectsApi#retrieveProjectApiKey")
    e.printStackTrace()
}
```

### Parameters
| **projectId** | **kotlin.String**| The ID of the project. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **keyId** | **kotlin.String**| The ID of the API key. | |

### Return type

[**ProjectApiKey**](ProjectApiKey.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="retrieveProjectServiceAccount"></a>
# **retrieveProjectServiceAccount**
> ProjectServiceAccount retrieveProjectServiceAccount(projectId, serviceAccountId)

Retrieves a service account in the project.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectsApi()
val projectId : kotlin.String = projectId_example // kotlin.String | The ID of the project.
val serviceAccountId : kotlin.String = serviceAccountId_example // kotlin.String | The ID of the service account.
try {
    val result : ProjectServiceAccount = apiInstance.retrieveProjectServiceAccount(projectId, serviceAccountId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectsApi#retrieveProjectServiceAccount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectsApi#retrieveProjectServiceAccount")
    e.printStackTrace()
}
```

### Parameters
| **projectId** | **kotlin.String**| The ID of the project. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **serviceAccountId** | **kotlin.String**| The ID of the service account. | |

### Return type

[**ProjectServiceAccount**](ProjectServiceAccount.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="retrieveProjectUser"></a>
# **retrieveProjectUser**
> ProjectUser retrieveProjectUser(projectId, userId)

Retrieves a user in the project.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectsApi()
val projectId : kotlin.String = projectId_example // kotlin.String | The ID of the project.
val userId : kotlin.String = userId_example // kotlin.String | The ID of the user.
try {
    val result : ProjectUser = apiInstance.retrieveProjectUser(projectId, userId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectsApi#retrieveProjectUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectsApi#retrieveProjectUser")
    e.printStackTrace()
}
```

### Parameters
| **projectId** | **kotlin.String**| The ID of the project. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **kotlin.String**| The ID of the user. | |

### Return type

[**ProjectUser**](ProjectUser.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="updateProjectRateLimits"></a>
# **updateProjectRateLimits**
> ProjectRateLimit updateProjectRateLimits(projectId, rateLimitId, projectRateLimitUpdateRequest)

Updates a project rate limit.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectsApi()
val projectId : kotlin.String = projectId_example // kotlin.String | The ID of the project.
val rateLimitId : kotlin.String = rateLimitId_example // kotlin.String | The ID of the rate limit.
val projectRateLimitUpdateRequest : ProjectRateLimitUpdateRequest =  // ProjectRateLimitUpdateRequest | The project rate limit update request payload.
try {
    val result : ProjectRateLimit = apiInstance.updateProjectRateLimits(projectId, rateLimitId, projectRateLimitUpdateRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectsApi#updateProjectRateLimits")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectsApi#updateProjectRateLimits")
    e.printStackTrace()
}
```

### Parameters
| **projectId** | **kotlin.String**| The ID of the project. | |
| **rateLimitId** | **kotlin.String**| The ID of the rate limit. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **projectRateLimitUpdateRequest** | [**ProjectRateLimitUpdateRequest**](ProjectRateLimitUpdateRequest.md)| The project rate limit update request payload. | |

### Return type

[**ProjectRateLimit**](ProjectRateLimit.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

