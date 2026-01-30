# ProjectsApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**archiveProject**](ProjectsApi.md#archiveProject) | **POST** /organization/projects/{project_id}/archive | Archives a project in the organization. Archived projects cannot be used or updated.
[**archiveProjectWithHttpInfo**](ProjectsApi.md#archiveProjectWithHttpInfo) | **POST** /organization/projects/{project_id}/archive | Archives a project in the organization. Archived projects cannot be used or updated.
[**createProject**](ProjectsApi.md#createProject) | **POST** /organization/projects | Create a new project in the organization. Projects can be created and archived, but cannot be deleted.
[**createProjectWithHttpInfo**](ProjectsApi.md#createProjectWithHttpInfo) | **POST** /organization/projects | Create a new project in the organization. Projects can be created and archived, but cannot be deleted.
[**createProjectServiceAccount**](ProjectsApi.md#createProjectServiceAccount) | **POST** /organization/projects/{project_id}/service_accounts | Creates a new service account in the project. This also returns an unredacted API key for the service account.
[**createProjectServiceAccountWithHttpInfo**](ProjectsApi.md#createProjectServiceAccountWithHttpInfo) | **POST** /organization/projects/{project_id}/service_accounts | Creates a new service account in the project. This also returns an unredacted API key for the service account.
[**createProjectUser**](ProjectsApi.md#createProjectUser) | **POST** /organization/projects/{project_id}/users | Adds a user to the project. Users must already be members of the organization to be added to a project.
[**createProjectUserWithHttpInfo**](ProjectsApi.md#createProjectUserWithHttpInfo) | **POST** /organization/projects/{project_id}/users | Adds a user to the project. Users must already be members of the organization to be added to a project.
[**deleteProjectApiKey**](ProjectsApi.md#deleteProjectApiKey) | **DELETE** /organization/projects/{project_id}/api_keys/{key_id} | Deletes an API key from the project.
[**deleteProjectApiKeyWithHttpInfo**](ProjectsApi.md#deleteProjectApiKeyWithHttpInfo) | **DELETE** /organization/projects/{project_id}/api_keys/{key_id} | Deletes an API key from the project.
[**deleteProjectServiceAccount**](ProjectsApi.md#deleteProjectServiceAccount) | **DELETE** /organization/projects/{project_id}/service_accounts/{service_account_id} | Deletes a service account from the project.
[**deleteProjectServiceAccountWithHttpInfo**](ProjectsApi.md#deleteProjectServiceAccountWithHttpInfo) | **DELETE** /organization/projects/{project_id}/service_accounts/{service_account_id} | Deletes a service account from the project.
[**deleteProjectUser**](ProjectsApi.md#deleteProjectUser) | **DELETE** /organization/projects/{project_id}/users/{user_id} | Deletes a user from the project.
[**deleteProjectUserWithHttpInfo**](ProjectsApi.md#deleteProjectUserWithHttpInfo) | **DELETE** /organization/projects/{project_id}/users/{user_id} | Deletes a user from the project.
[**listProjectApiKeys**](ProjectsApi.md#listProjectApiKeys) | **GET** /organization/projects/{project_id}/api_keys | Returns a list of API keys in the project.
[**listProjectApiKeysWithHttpInfo**](ProjectsApi.md#listProjectApiKeysWithHttpInfo) | **GET** /organization/projects/{project_id}/api_keys | Returns a list of API keys in the project.
[**listProjectRateLimits**](ProjectsApi.md#listProjectRateLimits) | **GET** /organization/projects/{project_id}/rate_limits | Returns the rate limits per model for a project.
[**listProjectRateLimitsWithHttpInfo**](ProjectsApi.md#listProjectRateLimitsWithHttpInfo) | **GET** /organization/projects/{project_id}/rate_limits | Returns the rate limits per model for a project.
[**listProjectServiceAccounts**](ProjectsApi.md#listProjectServiceAccounts) | **GET** /organization/projects/{project_id}/service_accounts | Returns a list of service accounts in the project.
[**listProjectServiceAccountsWithHttpInfo**](ProjectsApi.md#listProjectServiceAccountsWithHttpInfo) | **GET** /organization/projects/{project_id}/service_accounts | Returns a list of service accounts in the project.
[**listProjectUsers**](ProjectsApi.md#listProjectUsers) | **GET** /organization/projects/{project_id}/users | Returns a list of users in the project.
[**listProjectUsersWithHttpInfo**](ProjectsApi.md#listProjectUsersWithHttpInfo) | **GET** /organization/projects/{project_id}/users | Returns a list of users in the project.
[**listProjects**](ProjectsApi.md#listProjects) | **GET** /organization/projects | Returns a list of projects.
[**listProjectsWithHttpInfo**](ProjectsApi.md#listProjectsWithHttpInfo) | **GET** /organization/projects | Returns a list of projects.
[**modifyProject**](ProjectsApi.md#modifyProject) | **POST** /organization/projects/{project_id} | Modifies a project in the organization.
[**modifyProjectWithHttpInfo**](ProjectsApi.md#modifyProjectWithHttpInfo) | **POST** /organization/projects/{project_id} | Modifies a project in the organization.
[**modifyProjectUser**](ProjectsApi.md#modifyProjectUser) | **POST** /organization/projects/{project_id}/users/{user_id} | Modifies a user&#39;s role in the project.
[**modifyProjectUserWithHttpInfo**](ProjectsApi.md#modifyProjectUserWithHttpInfo) | **POST** /organization/projects/{project_id}/users/{user_id} | Modifies a user&#39;s role in the project.
[**retrieveProject**](ProjectsApi.md#retrieveProject) | **GET** /organization/projects/{project_id} | Retrieves a project.
[**retrieveProjectWithHttpInfo**](ProjectsApi.md#retrieveProjectWithHttpInfo) | **GET** /organization/projects/{project_id} | Retrieves a project.
[**retrieveProjectApiKey**](ProjectsApi.md#retrieveProjectApiKey) | **GET** /organization/projects/{project_id}/api_keys/{key_id} | Retrieves an API key in the project.
[**retrieveProjectApiKeyWithHttpInfo**](ProjectsApi.md#retrieveProjectApiKeyWithHttpInfo) | **GET** /organization/projects/{project_id}/api_keys/{key_id} | Retrieves an API key in the project.
[**retrieveProjectServiceAccount**](ProjectsApi.md#retrieveProjectServiceAccount) | **GET** /organization/projects/{project_id}/service_accounts/{service_account_id} | Retrieves a service account in the project.
[**retrieveProjectServiceAccountWithHttpInfo**](ProjectsApi.md#retrieveProjectServiceAccountWithHttpInfo) | **GET** /organization/projects/{project_id}/service_accounts/{service_account_id} | Retrieves a service account in the project.
[**retrieveProjectUser**](ProjectsApi.md#retrieveProjectUser) | **GET** /organization/projects/{project_id}/users/{user_id} | Retrieves a user in the project.
[**retrieveProjectUserWithHttpInfo**](ProjectsApi.md#retrieveProjectUserWithHttpInfo) | **GET** /organization/projects/{project_id}/users/{user_id} | Retrieves a user in the project.
[**updateProjectRateLimits**](ProjectsApi.md#updateProjectRateLimits) | **POST** /organization/projects/{project_id}/rate_limits/{rate_limit_id} | Updates a project rate limit.
[**updateProjectRateLimitsWithHttpInfo**](ProjectsApi.md#updateProjectRateLimitsWithHttpInfo) | **POST** /organization/projects/{project_id}/rate_limits/{rate_limit_id} | Updates a project rate limit.



## archiveProject

> archiveProject(archiveProjectRequest): ApiRequest[Project]

Archives a project in the organization. Archived projects cannot be used or updated.

### Example

```scala
// Import classes:
import 
import org.openapitools.client.core._
import org.openapitools.client.core.CollectionFormats._
import org.openapitools.client.core.ApiKeyLocations._

import akka.actor.ActorSystem
import scala.concurrent.Future
import scala.util.{Failure, Success}

object Example extends App {
    
    implicit val system: ActorSystem = ActorSystem()
    import system.dispatcher
    
    // Configure HTTP bearer authorization: ApiKeyAuth
    implicit val ApiKeyAuth: BearerToken = BearerToken("BEARER TOKEN")

    val apiInvoker = ApiInvoker()
    val apiInstance = ProjectsApi("https://api.openai.com/v1")
    val projectId: String = projectId_example // String | The ID of the project.
    
    val request = apiInstance.archiveProject(projectId)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling ProjectsApi#archiveProject")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling ProjectsApi#archiveProject")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**| The ID of the project. |

### Return type

ApiRequest[[**Project**](Project.md)]


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Project archived successfully. |  -  |


## createProject

> createProject(createProjectRequest): ApiRequest[Project]

Create a new project in the organization. Projects can be created and archived, but cannot be deleted.

### Example

```scala
// Import classes:
import 
import 
import org.openapitools.client.core._
import org.openapitools.client.core.CollectionFormats._
import org.openapitools.client.core.ApiKeyLocations._

import akka.actor.ActorSystem
import scala.concurrent.Future
import scala.util.{Failure, Success}

object Example extends App {
    
    implicit val system: ActorSystem = ActorSystem()
    import system.dispatcher
    
    // Configure HTTP bearer authorization: ApiKeyAuth
    implicit val ApiKeyAuth: BearerToken = BearerToken("BEARER TOKEN")

    val apiInvoker = ApiInvoker()
    val apiInstance = ProjectsApi("https://api.openai.com/v1")
    val projectCreateRequest: ProjectCreateRequest =  // ProjectCreateRequest | The project create request payload.
    
    val request = apiInstance.createProject(projectCreateRequest)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling ProjectsApi#createProject")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling ProjectsApi#createProject")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectCreateRequest** | [**ProjectCreateRequest**](ProjectCreateRequest.md)| The project create request payload. |

### Return type

ApiRequest[[**Project**](Project.md)]


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Project created successfully. |  -  |


## createProjectServiceAccount

> createProjectServiceAccount(createProjectServiceAccountRequest): ApiRequest[ProjectServiceAccountCreateResponse]

Creates a new service account in the project. This also returns an unredacted API key for the service account.

### Example

```scala
// Import classes:
import 
import 
import 
import org.openapitools.client.core._
import org.openapitools.client.core.CollectionFormats._
import org.openapitools.client.core.ApiKeyLocations._

import akka.actor.ActorSystem
import scala.concurrent.Future
import scala.util.{Failure, Success}

object Example extends App {
    
    implicit val system: ActorSystem = ActorSystem()
    import system.dispatcher
    
    // Configure HTTP bearer authorization: ApiKeyAuth
    implicit val ApiKeyAuth: BearerToken = BearerToken("BEARER TOKEN")

    val apiInvoker = ApiInvoker()
    val apiInstance = ProjectsApi("https://api.openai.com/v1")
    val projectId: String = projectId_example // String | The ID of the project.

    val projectServiceAccountCreateRequest: ProjectServiceAccountCreateRequest =  // ProjectServiceAccountCreateRequest | The project service account create request payload.
    
    val request = apiInstance.createProjectServiceAccount(projectId, projectServiceAccountCreateRequest)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling ProjectsApi#createProjectServiceAccount")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling ProjectsApi#createProjectServiceAccount")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**| The ID of the project. |
 **projectServiceAccountCreateRequest** | [**ProjectServiceAccountCreateRequest**](ProjectServiceAccountCreateRequest.md)| The project service account create request payload. |

### Return type

ApiRequest[[**ProjectServiceAccountCreateResponse**](ProjectServiceAccountCreateResponse.md)]


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


## createProjectUser

> createProjectUser(createProjectUserRequest): ApiRequest[ProjectUser]

Adds a user to the project. Users must already be members of the organization to be added to a project.

### Example

```scala
// Import classes:
import 
import 
import 
import org.openapitools.client.core._
import org.openapitools.client.core.CollectionFormats._
import org.openapitools.client.core.ApiKeyLocations._

import akka.actor.ActorSystem
import scala.concurrent.Future
import scala.util.{Failure, Success}

object Example extends App {
    
    implicit val system: ActorSystem = ActorSystem()
    import system.dispatcher
    
    // Configure HTTP bearer authorization: ApiKeyAuth
    implicit val ApiKeyAuth: BearerToken = BearerToken("BEARER TOKEN")

    val apiInvoker = ApiInvoker()
    val apiInstance = ProjectsApi("https://api.openai.com/v1")
    val projectId: String = projectId_example // String | The ID of the project.

    val projectUserCreateRequest: ProjectUserCreateRequest =  // ProjectUserCreateRequest | The project user create request payload.
    
    val request = apiInstance.createProjectUser(projectId, projectUserCreateRequest)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling ProjectsApi#createProjectUser")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling ProjectsApi#createProjectUser")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**| The ID of the project. |
 **projectUserCreateRequest** | [**ProjectUserCreateRequest**](ProjectUserCreateRequest.md)| The project user create request payload. |

### Return type

ApiRequest[[**ProjectUser**](ProjectUser.md)]


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


## deleteProjectApiKey

> deleteProjectApiKey(deleteProjectApiKeyRequest): ApiRequest[ProjectApiKeyDeleteResponse]

Deletes an API key from the project.

### Example

```scala
// Import classes:
import 
import 
import org.openapitools.client.core._
import org.openapitools.client.core.CollectionFormats._
import org.openapitools.client.core.ApiKeyLocations._

import akka.actor.ActorSystem
import scala.concurrent.Future
import scala.util.{Failure, Success}

object Example extends App {
    
    implicit val system: ActorSystem = ActorSystem()
    import system.dispatcher
    
    // Configure HTTP bearer authorization: ApiKeyAuth
    implicit val ApiKeyAuth: BearerToken = BearerToken("BEARER TOKEN")

    val apiInvoker = ApiInvoker()
    val apiInstance = ProjectsApi("https://api.openai.com/v1")
    val projectId: String = projectId_example // String | The ID of the project.

    val keyId: String = keyId_example // String | The ID of the API key.
    
    val request = apiInstance.deleteProjectApiKey(projectId, keyId)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling ProjectsApi#deleteProjectApiKey")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling ProjectsApi#deleteProjectApiKey")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**| The ID of the project. |
 **keyId** | **String**| The ID of the API key. |

### Return type

ApiRequest[[**ProjectApiKeyDeleteResponse**](ProjectApiKeyDeleteResponse.md)]


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


## deleteProjectServiceAccount

> deleteProjectServiceAccount(deleteProjectServiceAccountRequest): ApiRequest[ProjectServiceAccountDeleteResponse]

Deletes a service account from the project.

### Example

```scala
// Import classes:
import 
import org.openapitools.client.core._
import org.openapitools.client.core.CollectionFormats._
import org.openapitools.client.core.ApiKeyLocations._

import akka.actor.ActorSystem
import scala.concurrent.Future
import scala.util.{Failure, Success}

object Example extends App {
    
    implicit val system: ActorSystem = ActorSystem()
    import system.dispatcher
    
    // Configure HTTP bearer authorization: ApiKeyAuth
    implicit val ApiKeyAuth: BearerToken = BearerToken("BEARER TOKEN")

    val apiInvoker = ApiInvoker()
    val apiInstance = ProjectsApi("https://api.openai.com/v1")
    val projectId: String = projectId_example // String | The ID of the project.

    val serviceAccountId: String = serviceAccountId_example // String | The ID of the service account.
    
    val request = apiInstance.deleteProjectServiceAccount(projectId, serviceAccountId)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling ProjectsApi#deleteProjectServiceAccount")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling ProjectsApi#deleteProjectServiceAccount")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**| The ID of the project. |
 **serviceAccountId** | **String**| The ID of the service account. |

### Return type

ApiRequest[[**ProjectServiceAccountDeleteResponse**](ProjectServiceAccountDeleteResponse.md)]


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Project service account deleted successfully. |  -  |


## deleteProjectUser

> deleteProjectUser(deleteProjectUserRequest): ApiRequest[ProjectUserDeleteResponse]

Deletes a user from the project.

### Example

```scala
// Import classes:
import 
import 
import org.openapitools.client.core._
import org.openapitools.client.core.CollectionFormats._
import org.openapitools.client.core.ApiKeyLocations._

import akka.actor.ActorSystem
import scala.concurrent.Future
import scala.util.{Failure, Success}

object Example extends App {
    
    implicit val system: ActorSystem = ActorSystem()
    import system.dispatcher
    
    // Configure HTTP bearer authorization: ApiKeyAuth
    implicit val ApiKeyAuth: BearerToken = BearerToken("BEARER TOKEN")

    val apiInvoker = ApiInvoker()
    val apiInstance = ProjectsApi("https://api.openai.com/v1")
    val projectId: String = projectId_example // String | The ID of the project.

    val userId: String = userId_example // String | The ID of the user.
    
    val request = apiInstance.deleteProjectUser(projectId, userId)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling ProjectsApi#deleteProjectUser")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling ProjectsApi#deleteProjectUser")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**| The ID of the project. |
 **userId** | **String**| The ID of the user. |

### Return type

ApiRequest[[**ProjectUserDeleteResponse**](ProjectUserDeleteResponse.md)]


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


## listProjectApiKeys

> listProjectApiKeys(listProjectApiKeysRequest): ApiRequest[ProjectApiKeyListResponse]

Returns a list of API keys in the project.

### Example

```scala
// Import classes:
import 
import org.openapitools.client.core._
import org.openapitools.client.core.CollectionFormats._
import org.openapitools.client.core.ApiKeyLocations._

import akka.actor.ActorSystem
import scala.concurrent.Future
import scala.util.{Failure, Success}

object Example extends App {
    
    implicit val system: ActorSystem = ActorSystem()
    import system.dispatcher
    
    // Configure HTTP bearer authorization: ApiKeyAuth
    implicit val ApiKeyAuth: BearerToken = BearerToken("BEARER TOKEN")

    val apiInvoker = ApiInvoker()
    val apiInstance = ProjectsApi("https://api.openai.com/v1")
    val projectId: String = projectId_example // String | The ID of the project.

    val limit: Int = 56 // Int | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 

    val after: String = after_example // String | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
    
    val request = apiInstance.listProjectApiKeys(projectId, limit, after)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling ProjectsApi#listProjectApiKeys")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling ProjectsApi#listProjectApiKeys")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**| The ID of the project. |
 **limit** | **Int**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional]
 **after** | **String**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional]

### Return type

ApiRequest[[**ProjectApiKeyListResponse**](ProjectApiKeyListResponse.md)]


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Project API keys listed successfully. |  -  |


## listProjectRateLimits

> listProjectRateLimits(listProjectRateLimitsRequest): ApiRequest[ProjectRateLimitListResponse]

Returns the rate limits per model for a project.

### Example

```scala
// Import classes:
import 
import org.openapitools.client.core._
import org.openapitools.client.core.CollectionFormats._
import org.openapitools.client.core.ApiKeyLocations._

import akka.actor.ActorSystem
import scala.concurrent.Future
import scala.util.{Failure, Success}

object Example extends App {
    
    implicit val system: ActorSystem = ActorSystem()
    import system.dispatcher
    
    // Configure HTTP bearer authorization: ApiKeyAuth
    implicit val ApiKeyAuth: BearerToken = BearerToken("BEARER TOKEN")

    val apiInvoker = ApiInvoker()
    val apiInstance = ProjectsApi("https://api.openai.com/v1")
    val projectId: String = projectId_example // String | The ID of the project.

    val limit: Int = 56 // Int | A limit on the number of objects to be returned. The default is 100. 

    val after: String = after_example // String | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 

    val before: String = before_example // String | A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, beginning with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. 
    
    val request = apiInstance.listProjectRateLimits(projectId, limit, after, before)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling ProjectsApi#listProjectRateLimits")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling ProjectsApi#listProjectRateLimits")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**| The ID of the project. |
 **limit** | **Int**| A limit on the number of objects to be returned. The default is 100.  | [optional]
 **after** | **String**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional]
 **before** | **String**| A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, beginning with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [optional]

### Return type

ApiRequest[[**ProjectRateLimitListResponse**](ProjectRateLimitListResponse.md)]


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Project rate limits listed successfully. |  -  |


## listProjectServiceAccounts

> listProjectServiceAccounts(listProjectServiceAccountsRequest): ApiRequest[ProjectServiceAccountListResponse]

Returns a list of service accounts in the project.

### Example

```scala
// Import classes:
import 
import 
import org.openapitools.client.core._
import org.openapitools.client.core.CollectionFormats._
import org.openapitools.client.core.ApiKeyLocations._

import akka.actor.ActorSystem
import scala.concurrent.Future
import scala.util.{Failure, Success}

object Example extends App {
    
    implicit val system: ActorSystem = ActorSystem()
    import system.dispatcher
    
    // Configure HTTP bearer authorization: ApiKeyAuth
    implicit val ApiKeyAuth: BearerToken = BearerToken("BEARER TOKEN")

    val apiInvoker = ApiInvoker()
    val apiInstance = ProjectsApi("https://api.openai.com/v1")
    val projectId: String = projectId_example // String | The ID of the project.

    val limit: Int = 56 // Int | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 

    val after: String = after_example // String | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
    
    val request = apiInstance.listProjectServiceAccounts(projectId, limit, after)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling ProjectsApi#listProjectServiceAccounts")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling ProjectsApi#listProjectServiceAccounts")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**| The ID of the project. |
 **limit** | **Int**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional]
 **after** | **String**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional]

### Return type

ApiRequest[[**ProjectServiceAccountListResponse**](ProjectServiceAccountListResponse.md)]


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


## listProjectUsers

> listProjectUsers(listProjectUsersRequest): ApiRequest[ProjectUserListResponse]

Returns a list of users in the project.

### Example

```scala
// Import classes:
import 
import 
import org.openapitools.client.core._
import org.openapitools.client.core.CollectionFormats._
import org.openapitools.client.core.ApiKeyLocations._

import akka.actor.ActorSystem
import scala.concurrent.Future
import scala.util.{Failure, Success}

object Example extends App {
    
    implicit val system: ActorSystem = ActorSystem()
    import system.dispatcher
    
    // Configure HTTP bearer authorization: ApiKeyAuth
    implicit val ApiKeyAuth: BearerToken = BearerToken("BEARER TOKEN")

    val apiInvoker = ApiInvoker()
    val apiInstance = ProjectsApi("https://api.openai.com/v1")
    val projectId: String = projectId_example // String | The ID of the project.

    val limit: Int = 56 // Int | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 

    val after: String = after_example // String | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
    
    val request = apiInstance.listProjectUsers(projectId, limit, after)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling ProjectsApi#listProjectUsers")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling ProjectsApi#listProjectUsers")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**| The ID of the project. |
 **limit** | **Int**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional]
 **after** | **String**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional]

### Return type

ApiRequest[[**ProjectUserListResponse**](ProjectUserListResponse.md)]


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


## listProjects

> listProjects(listProjectsRequest): ApiRequest[ProjectListResponse]

Returns a list of projects.

### Example

```scala
// Import classes:
import 
import org.openapitools.client.core._
import org.openapitools.client.core.CollectionFormats._
import org.openapitools.client.core.ApiKeyLocations._

import akka.actor.ActorSystem
import scala.concurrent.Future
import scala.util.{Failure, Success}

object Example extends App {
    
    implicit val system: ActorSystem = ActorSystem()
    import system.dispatcher
    
    // Configure HTTP bearer authorization: ApiKeyAuth
    implicit val ApiKeyAuth: BearerToken = BearerToken("BEARER TOKEN")

    val apiInvoker = ApiInvoker()
    val apiInstance = ProjectsApi("https://api.openai.com/v1")
    val limit: Int = 56 // Int | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 

    val after: String = after_example // String | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 

    val includeArchived: Boolean = true // Boolean | If `true` returns all projects including those that have been `archived`. Archived projects are not included by default.
    
    val request = apiInstance.listProjects(limit, after, includeArchived)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling ProjectsApi#listProjects")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling ProjectsApi#listProjects")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Int**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional]
 **after** | **String**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional]
 **includeArchived** | **Boolean**| If &#x60;true&#x60; returns all projects including those that have been &#x60;archived&#x60;. Archived projects are not included by default. | [optional]

### Return type

ApiRequest[[**ProjectListResponse**](ProjectListResponse.md)]


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Projects listed successfully. |  -  |


## modifyProject

> modifyProject(modifyProjectRequest): ApiRequest[Project]

Modifies a project in the organization.

### Example

```scala
// Import classes:
import 
import 
import 
import org.openapitools.client.core._
import org.openapitools.client.core.CollectionFormats._
import org.openapitools.client.core.ApiKeyLocations._

import akka.actor.ActorSystem
import scala.concurrent.Future
import scala.util.{Failure, Success}

object Example extends App {
    
    implicit val system: ActorSystem = ActorSystem()
    import system.dispatcher
    
    // Configure HTTP bearer authorization: ApiKeyAuth
    implicit val ApiKeyAuth: BearerToken = BearerToken("BEARER TOKEN")

    val apiInvoker = ApiInvoker()
    val apiInstance = ProjectsApi("https://api.openai.com/v1")
    val projectId: String = projectId_example // String | The ID of the project.

    val projectUpdateRequest: ProjectUpdateRequest =  // ProjectUpdateRequest | The project update request payload.
    
    val request = apiInstance.modifyProject(projectId, projectUpdateRequest)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling ProjectsApi#modifyProject")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling ProjectsApi#modifyProject")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**| The ID of the project. |
 **projectUpdateRequest** | [**ProjectUpdateRequest**](ProjectUpdateRequest.md)| The project update request payload. |

### Return type

ApiRequest[[**Project**](Project.md)]


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


## modifyProjectUser

> modifyProjectUser(modifyProjectUserRequest): ApiRequest[ProjectUser]

Modifies a user&#39;s role in the project.

### Example

```scala
// Import classes:
import 
import 
import 
import org.openapitools.client.core._
import org.openapitools.client.core.CollectionFormats._
import org.openapitools.client.core.ApiKeyLocations._

import akka.actor.ActorSystem
import scala.concurrent.Future
import scala.util.{Failure, Success}

object Example extends App {
    
    implicit val system: ActorSystem = ActorSystem()
    import system.dispatcher
    
    // Configure HTTP bearer authorization: ApiKeyAuth
    implicit val ApiKeyAuth: BearerToken = BearerToken("BEARER TOKEN")

    val apiInvoker = ApiInvoker()
    val apiInstance = ProjectsApi("https://api.openai.com/v1")
    val projectId: String = projectId_example // String | The ID of the project.

    val userId: String = userId_example // String | The ID of the user.

    val projectUserUpdateRequest: ProjectUserUpdateRequest =  // ProjectUserUpdateRequest | The project user update request payload.
    
    val request = apiInstance.modifyProjectUser(projectId, userId, projectUserUpdateRequest)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling ProjectsApi#modifyProjectUser")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling ProjectsApi#modifyProjectUser")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**| The ID of the project. |
 **userId** | **String**| The ID of the user. |
 **projectUserUpdateRequest** | [**ProjectUserUpdateRequest**](ProjectUserUpdateRequest.md)| The project user update request payload. |

### Return type

ApiRequest[[**ProjectUser**](ProjectUser.md)]


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


## retrieveProject

> retrieveProject(retrieveProjectRequest): ApiRequest[Project]

Retrieves a project.

### Example

```scala
// Import classes:
import 
import org.openapitools.client.core._
import org.openapitools.client.core.CollectionFormats._
import org.openapitools.client.core.ApiKeyLocations._

import akka.actor.ActorSystem
import scala.concurrent.Future
import scala.util.{Failure, Success}

object Example extends App {
    
    implicit val system: ActorSystem = ActorSystem()
    import system.dispatcher
    
    // Configure HTTP bearer authorization: ApiKeyAuth
    implicit val ApiKeyAuth: BearerToken = BearerToken("BEARER TOKEN")

    val apiInvoker = ApiInvoker()
    val apiInstance = ProjectsApi("https://api.openai.com/v1")
    val projectId: String = projectId_example // String | The ID of the project.
    
    val request = apiInstance.retrieveProject(projectId)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling ProjectsApi#retrieveProject")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling ProjectsApi#retrieveProject")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**| The ID of the project. |

### Return type

ApiRequest[[**Project**](Project.md)]


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Project retrieved successfully. |  -  |


## retrieveProjectApiKey

> retrieveProjectApiKey(retrieveProjectApiKeyRequest): ApiRequest[ProjectApiKey]

Retrieves an API key in the project.

### Example

```scala
// Import classes:
import 
import org.openapitools.client.core._
import org.openapitools.client.core.CollectionFormats._
import org.openapitools.client.core.ApiKeyLocations._

import akka.actor.ActorSystem
import scala.concurrent.Future
import scala.util.{Failure, Success}

object Example extends App {
    
    implicit val system: ActorSystem = ActorSystem()
    import system.dispatcher
    
    // Configure HTTP bearer authorization: ApiKeyAuth
    implicit val ApiKeyAuth: BearerToken = BearerToken("BEARER TOKEN")

    val apiInvoker = ApiInvoker()
    val apiInstance = ProjectsApi("https://api.openai.com/v1")
    val projectId: String = projectId_example // String | The ID of the project.

    val keyId: String = keyId_example // String | The ID of the API key.
    
    val request = apiInstance.retrieveProjectApiKey(projectId, keyId)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling ProjectsApi#retrieveProjectApiKey")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling ProjectsApi#retrieveProjectApiKey")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**| The ID of the project. |
 **keyId** | **String**| The ID of the API key. |

### Return type

ApiRequest[[**ProjectApiKey**](ProjectApiKey.md)]


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Project API key retrieved successfully. |  -  |


## retrieveProjectServiceAccount

> retrieveProjectServiceAccount(retrieveProjectServiceAccountRequest): ApiRequest[ProjectServiceAccount]

Retrieves a service account in the project.

### Example

```scala
// Import classes:
import 
import org.openapitools.client.core._
import org.openapitools.client.core.CollectionFormats._
import org.openapitools.client.core.ApiKeyLocations._

import akka.actor.ActorSystem
import scala.concurrent.Future
import scala.util.{Failure, Success}

object Example extends App {
    
    implicit val system: ActorSystem = ActorSystem()
    import system.dispatcher
    
    // Configure HTTP bearer authorization: ApiKeyAuth
    implicit val ApiKeyAuth: BearerToken = BearerToken("BEARER TOKEN")

    val apiInvoker = ApiInvoker()
    val apiInstance = ProjectsApi("https://api.openai.com/v1")
    val projectId: String = projectId_example // String | The ID of the project.

    val serviceAccountId: String = serviceAccountId_example // String | The ID of the service account.
    
    val request = apiInstance.retrieveProjectServiceAccount(projectId, serviceAccountId)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling ProjectsApi#retrieveProjectServiceAccount")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling ProjectsApi#retrieveProjectServiceAccount")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**| The ID of the project. |
 **serviceAccountId** | **String**| The ID of the service account. |

### Return type

ApiRequest[[**ProjectServiceAccount**](ProjectServiceAccount.md)]


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Project service account retrieved successfully. |  -  |


## retrieveProjectUser

> retrieveProjectUser(retrieveProjectUserRequest): ApiRequest[ProjectUser]

Retrieves a user in the project.

### Example

```scala
// Import classes:
import 
import org.openapitools.client.core._
import org.openapitools.client.core.CollectionFormats._
import org.openapitools.client.core.ApiKeyLocations._

import akka.actor.ActorSystem
import scala.concurrent.Future
import scala.util.{Failure, Success}

object Example extends App {
    
    implicit val system: ActorSystem = ActorSystem()
    import system.dispatcher
    
    // Configure HTTP bearer authorization: ApiKeyAuth
    implicit val ApiKeyAuth: BearerToken = BearerToken("BEARER TOKEN")

    val apiInvoker = ApiInvoker()
    val apiInstance = ProjectsApi("https://api.openai.com/v1")
    val projectId: String = projectId_example // String | The ID of the project.

    val userId: String = userId_example // String | The ID of the user.
    
    val request = apiInstance.retrieveProjectUser(projectId, userId)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling ProjectsApi#retrieveProjectUser")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling ProjectsApi#retrieveProjectUser")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**| The ID of the project. |
 **userId** | **String**| The ID of the user. |

### Return type

ApiRequest[[**ProjectUser**](ProjectUser.md)]


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Project user retrieved successfully. |  -  |


## updateProjectRateLimits

> updateProjectRateLimits(updateProjectRateLimitsRequest): ApiRequest[ProjectRateLimit]

Updates a project rate limit.

### Example

```scala
// Import classes:
import 
import 
import 
import org.openapitools.client.core._
import org.openapitools.client.core.CollectionFormats._
import org.openapitools.client.core.ApiKeyLocations._

import akka.actor.ActorSystem
import scala.concurrent.Future
import scala.util.{Failure, Success}

object Example extends App {
    
    implicit val system: ActorSystem = ActorSystem()
    import system.dispatcher
    
    // Configure HTTP bearer authorization: ApiKeyAuth
    implicit val ApiKeyAuth: BearerToken = BearerToken("BEARER TOKEN")

    val apiInvoker = ApiInvoker()
    val apiInstance = ProjectsApi("https://api.openai.com/v1")
    val projectId: String = projectId_example // String | The ID of the project.

    val rateLimitId: String = rateLimitId_example // String | The ID of the rate limit.

    val projectRateLimitUpdateRequest: ProjectRateLimitUpdateRequest =  // ProjectRateLimitUpdateRequest | The project rate limit update request payload.
    
    val request = apiInstance.updateProjectRateLimits(projectId, rateLimitId, projectRateLimitUpdateRequest)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling ProjectsApi#updateProjectRateLimits")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling ProjectsApi#updateProjectRateLimits")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**| The ID of the project. |
 **rateLimitId** | **String**| The ID of the rate limit. |
 **projectRateLimitUpdateRequest** | [**ProjectRateLimitUpdateRequest**](ProjectRateLimitUpdateRequest.md)| The project rate limit update request payload. |

### Return type

ApiRequest[[**ProjectRateLimit**](ProjectRateLimit.md)]


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

