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


<a id="archiveProject"></a>
# **archiveProject**
> Project archiveProject(projectId)

Archives a project in the organization. Archived projects cannot be used or updated.

### Example
```java
// Import classes:
import com.github.oapicf.openapiopenai.ApiClient;
import com.github.oapicf.openapiopenai.ApiException;
import com.github.oapicf.openapiopenai.Configuration;
import com.github.oapicf.openapiopenai.auth.*;
import com.github.oapicf.openapiopenai.models.*;
import com.github.oapicf.openapiopenai.api.ProjectsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.openai.com/v1");
    
    // Configure HTTP bearer authorization: ApiKeyAuth
    HttpBearerAuth ApiKeyAuth = (HttpBearerAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setBearerToken("BEARER TOKEN");

    ProjectsApi apiInstance = new ProjectsApi(defaultClient);
    String projectId = "projectId_example"; // String | The ID of the project.
    try {
      Project result = apiInstance.archiveProject(projectId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#archiveProject");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **projectId** | **String**| The ID of the project. | |

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

<a id="createProject"></a>
# **createProject**
> Project createProject(projectCreateRequest)

Create a new project in the organization. Projects can be created and archived, but cannot be deleted.

### Example
```java
// Import classes:
import com.github.oapicf.openapiopenai.ApiClient;
import com.github.oapicf.openapiopenai.ApiException;
import com.github.oapicf.openapiopenai.Configuration;
import com.github.oapicf.openapiopenai.auth.*;
import com.github.oapicf.openapiopenai.models.*;
import com.github.oapicf.openapiopenai.api.ProjectsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.openai.com/v1");
    
    // Configure HTTP bearer authorization: ApiKeyAuth
    HttpBearerAuth ApiKeyAuth = (HttpBearerAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setBearerToken("BEARER TOKEN");

    ProjectsApi apiInstance = new ProjectsApi(defaultClient);
    ProjectCreateRequest projectCreateRequest = new ProjectCreateRequest(); // ProjectCreateRequest | The project create request payload.
    try {
      Project result = apiInstance.createProject(projectCreateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#createProject");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **projectCreateRequest** | [**ProjectCreateRequest**](ProjectCreateRequest.md)| The project create request payload. | |

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

<a id="createProjectServiceAccount"></a>
# **createProjectServiceAccount**
> ProjectServiceAccountCreateResponse createProjectServiceAccount(projectId, projectServiceAccountCreateRequest)

Creates a new service account in the project. This also returns an unredacted API key for the service account.

### Example
```java
// Import classes:
import com.github.oapicf.openapiopenai.ApiClient;
import com.github.oapicf.openapiopenai.ApiException;
import com.github.oapicf.openapiopenai.Configuration;
import com.github.oapicf.openapiopenai.auth.*;
import com.github.oapicf.openapiopenai.models.*;
import com.github.oapicf.openapiopenai.api.ProjectsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.openai.com/v1");
    
    // Configure HTTP bearer authorization: ApiKeyAuth
    HttpBearerAuth ApiKeyAuth = (HttpBearerAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setBearerToken("BEARER TOKEN");

    ProjectsApi apiInstance = new ProjectsApi(defaultClient);
    String projectId = "projectId_example"; // String | The ID of the project.
    ProjectServiceAccountCreateRequest projectServiceAccountCreateRequest = new ProjectServiceAccountCreateRequest(); // ProjectServiceAccountCreateRequest | The project service account create request payload.
    try {
      ProjectServiceAccountCreateResponse result = apiInstance.createProjectServiceAccount(projectId, projectServiceAccountCreateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#createProjectServiceAccount");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **projectId** | **String**| The ID of the project. | |
| **projectServiceAccountCreateRequest** | [**ProjectServiceAccountCreateRequest**](ProjectServiceAccountCreateRequest.md)| The project service account create request payload. | |

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

<a id="createProjectUser"></a>
# **createProjectUser**
> ProjectUser createProjectUser(projectId, projectUserCreateRequest)

Adds a user to the project. Users must already be members of the organization to be added to a project.

### Example
```java
// Import classes:
import com.github.oapicf.openapiopenai.ApiClient;
import com.github.oapicf.openapiopenai.ApiException;
import com.github.oapicf.openapiopenai.Configuration;
import com.github.oapicf.openapiopenai.auth.*;
import com.github.oapicf.openapiopenai.models.*;
import com.github.oapicf.openapiopenai.api.ProjectsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.openai.com/v1");
    
    // Configure HTTP bearer authorization: ApiKeyAuth
    HttpBearerAuth ApiKeyAuth = (HttpBearerAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setBearerToken("BEARER TOKEN");

    ProjectsApi apiInstance = new ProjectsApi(defaultClient);
    String projectId = "projectId_example"; // String | The ID of the project.
    ProjectUserCreateRequest projectUserCreateRequest = new ProjectUserCreateRequest(); // ProjectUserCreateRequest | The project user create request payload.
    try {
      ProjectUser result = apiInstance.createProjectUser(projectId, projectUserCreateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#createProjectUser");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **projectId** | **String**| The ID of the project. | |
| **projectUserCreateRequest** | [**ProjectUserCreateRequest**](ProjectUserCreateRequest.md)| The project user create request payload. | |

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

<a id="deleteProjectApiKey"></a>
# **deleteProjectApiKey**
> ProjectApiKeyDeleteResponse deleteProjectApiKey(projectId, keyId)

Deletes an API key from the project.

### Example
```java
// Import classes:
import com.github.oapicf.openapiopenai.ApiClient;
import com.github.oapicf.openapiopenai.ApiException;
import com.github.oapicf.openapiopenai.Configuration;
import com.github.oapicf.openapiopenai.auth.*;
import com.github.oapicf.openapiopenai.models.*;
import com.github.oapicf.openapiopenai.api.ProjectsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.openai.com/v1");
    
    // Configure HTTP bearer authorization: ApiKeyAuth
    HttpBearerAuth ApiKeyAuth = (HttpBearerAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setBearerToken("BEARER TOKEN");

    ProjectsApi apiInstance = new ProjectsApi(defaultClient);
    String projectId = "projectId_example"; // String | The ID of the project.
    String keyId = "keyId_example"; // String | The ID of the API key.
    try {
      ProjectApiKeyDeleteResponse result = apiInstance.deleteProjectApiKey(projectId, keyId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#deleteProjectApiKey");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **projectId** | **String**| The ID of the project. | |
| **keyId** | **String**| The ID of the API key. | |

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

<a id="deleteProjectServiceAccount"></a>
# **deleteProjectServiceAccount**
> ProjectServiceAccountDeleteResponse deleteProjectServiceAccount(projectId, serviceAccountId)

Deletes a service account from the project.

### Example
```java
// Import classes:
import com.github.oapicf.openapiopenai.ApiClient;
import com.github.oapicf.openapiopenai.ApiException;
import com.github.oapicf.openapiopenai.Configuration;
import com.github.oapicf.openapiopenai.auth.*;
import com.github.oapicf.openapiopenai.models.*;
import com.github.oapicf.openapiopenai.api.ProjectsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.openai.com/v1");
    
    // Configure HTTP bearer authorization: ApiKeyAuth
    HttpBearerAuth ApiKeyAuth = (HttpBearerAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setBearerToken("BEARER TOKEN");

    ProjectsApi apiInstance = new ProjectsApi(defaultClient);
    String projectId = "projectId_example"; // String | The ID of the project.
    String serviceAccountId = "serviceAccountId_example"; // String | The ID of the service account.
    try {
      ProjectServiceAccountDeleteResponse result = apiInstance.deleteProjectServiceAccount(projectId, serviceAccountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#deleteProjectServiceAccount");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **projectId** | **String**| The ID of the project. | |
| **serviceAccountId** | **String**| The ID of the service account. | |

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

<a id="deleteProjectUser"></a>
# **deleteProjectUser**
> ProjectUserDeleteResponse deleteProjectUser(projectId, userId)

Deletes a user from the project.

### Example
```java
// Import classes:
import com.github.oapicf.openapiopenai.ApiClient;
import com.github.oapicf.openapiopenai.ApiException;
import com.github.oapicf.openapiopenai.Configuration;
import com.github.oapicf.openapiopenai.auth.*;
import com.github.oapicf.openapiopenai.models.*;
import com.github.oapicf.openapiopenai.api.ProjectsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.openai.com/v1");
    
    // Configure HTTP bearer authorization: ApiKeyAuth
    HttpBearerAuth ApiKeyAuth = (HttpBearerAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setBearerToken("BEARER TOKEN");

    ProjectsApi apiInstance = new ProjectsApi(defaultClient);
    String projectId = "projectId_example"; // String | The ID of the project.
    String userId = "userId_example"; // String | The ID of the user.
    try {
      ProjectUserDeleteResponse result = apiInstance.deleteProjectUser(projectId, userId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#deleteProjectUser");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **projectId** | **String**| The ID of the project. | |
| **userId** | **String**| The ID of the user. | |

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

<a id="listProjectApiKeys"></a>
# **listProjectApiKeys**
> ProjectApiKeyListResponse listProjectApiKeys(projectId, limit, after)

Returns a list of API keys in the project.

### Example
```java
// Import classes:
import com.github.oapicf.openapiopenai.ApiClient;
import com.github.oapicf.openapiopenai.ApiException;
import com.github.oapicf.openapiopenai.Configuration;
import com.github.oapicf.openapiopenai.auth.*;
import com.github.oapicf.openapiopenai.models.*;
import com.github.oapicf.openapiopenai.api.ProjectsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.openai.com/v1");
    
    // Configure HTTP bearer authorization: ApiKeyAuth
    HttpBearerAuth ApiKeyAuth = (HttpBearerAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setBearerToken("BEARER TOKEN");

    ProjectsApi apiInstance = new ProjectsApi(defaultClient);
    String projectId = "projectId_example"; // String | The ID of the project.
    Integer limit = 20; // Integer | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
    String after = "after_example"; // String | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
    try {
      ProjectApiKeyListResponse result = apiInstance.listProjectApiKeys(projectId, limit, after);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#listProjectApiKeys");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **projectId** | **String**| The ID of the project. | |
| **limit** | **Integer**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20] |
| **after** | **String**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] |

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

<a id="listProjectRateLimits"></a>
# **listProjectRateLimits**
> ProjectRateLimitListResponse listProjectRateLimits(projectId, limit, after, before)

Returns the rate limits per model for a project.

### Example
```java
// Import classes:
import com.github.oapicf.openapiopenai.ApiClient;
import com.github.oapicf.openapiopenai.ApiException;
import com.github.oapicf.openapiopenai.Configuration;
import com.github.oapicf.openapiopenai.auth.*;
import com.github.oapicf.openapiopenai.models.*;
import com.github.oapicf.openapiopenai.api.ProjectsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.openai.com/v1");
    
    // Configure HTTP bearer authorization: ApiKeyAuth
    HttpBearerAuth ApiKeyAuth = (HttpBearerAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setBearerToken("BEARER TOKEN");

    ProjectsApi apiInstance = new ProjectsApi(defaultClient);
    String projectId = "projectId_example"; // String | The ID of the project.
    Integer limit = 100; // Integer | A limit on the number of objects to be returned. The default is 100. 
    String after = "after_example"; // String | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
    String before = "before_example"; // String | A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, beginning with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. 
    try {
      ProjectRateLimitListResponse result = apiInstance.listProjectRateLimits(projectId, limit, after, before);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#listProjectRateLimits");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **projectId** | **String**| The ID of the project. | |
| **limit** | **Integer**| A limit on the number of objects to be returned. The default is 100.  | [optional] [default to 100] |
| **after** | **String**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] |
| **before** | **String**| A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, beginning with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [optional] |

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

<a id="listProjectServiceAccounts"></a>
# **listProjectServiceAccounts**
> ProjectServiceAccountListResponse listProjectServiceAccounts(projectId, limit, after)

Returns a list of service accounts in the project.

### Example
```java
// Import classes:
import com.github.oapicf.openapiopenai.ApiClient;
import com.github.oapicf.openapiopenai.ApiException;
import com.github.oapicf.openapiopenai.Configuration;
import com.github.oapicf.openapiopenai.auth.*;
import com.github.oapicf.openapiopenai.models.*;
import com.github.oapicf.openapiopenai.api.ProjectsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.openai.com/v1");
    
    // Configure HTTP bearer authorization: ApiKeyAuth
    HttpBearerAuth ApiKeyAuth = (HttpBearerAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setBearerToken("BEARER TOKEN");

    ProjectsApi apiInstance = new ProjectsApi(defaultClient);
    String projectId = "projectId_example"; // String | The ID of the project.
    Integer limit = 20; // Integer | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
    String after = "after_example"; // String | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
    try {
      ProjectServiceAccountListResponse result = apiInstance.listProjectServiceAccounts(projectId, limit, after);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#listProjectServiceAccounts");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **projectId** | **String**| The ID of the project. | |
| **limit** | **Integer**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20] |
| **after** | **String**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] |

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

<a id="listProjectUsers"></a>
# **listProjectUsers**
> ProjectUserListResponse listProjectUsers(projectId, limit, after)

Returns a list of users in the project.

### Example
```java
// Import classes:
import com.github.oapicf.openapiopenai.ApiClient;
import com.github.oapicf.openapiopenai.ApiException;
import com.github.oapicf.openapiopenai.Configuration;
import com.github.oapicf.openapiopenai.auth.*;
import com.github.oapicf.openapiopenai.models.*;
import com.github.oapicf.openapiopenai.api.ProjectsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.openai.com/v1");
    
    // Configure HTTP bearer authorization: ApiKeyAuth
    HttpBearerAuth ApiKeyAuth = (HttpBearerAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setBearerToken("BEARER TOKEN");

    ProjectsApi apiInstance = new ProjectsApi(defaultClient);
    String projectId = "projectId_example"; // String | The ID of the project.
    Integer limit = 20; // Integer | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
    String after = "after_example"; // String | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
    try {
      ProjectUserListResponse result = apiInstance.listProjectUsers(projectId, limit, after);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#listProjectUsers");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **projectId** | **String**| The ID of the project. | |
| **limit** | **Integer**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20] |
| **after** | **String**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] |

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

<a id="listProjects"></a>
# **listProjects**
> ProjectListResponse listProjects(limit, after, includeArchived)

Returns a list of projects.

### Example
```java
// Import classes:
import com.github.oapicf.openapiopenai.ApiClient;
import com.github.oapicf.openapiopenai.ApiException;
import com.github.oapicf.openapiopenai.Configuration;
import com.github.oapicf.openapiopenai.auth.*;
import com.github.oapicf.openapiopenai.models.*;
import com.github.oapicf.openapiopenai.api.ProjectsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.openai.com/v1");
    
    // Configure HTTP bearer authorization: ApiKeyAuth
    HttpBearerAuth ApiKeyAuth = (HttpBearerAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setBearerToken("BEARER TOKEN");

    ProjectsApi apiInstance = new ProjectsApi(defaultClient);
    Integer limit = 20; // Integer | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
    String after = "after_example"; // String | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
    Boolean includeArchived = false; // Boolean | If `true` returns all projects including those that have been `archived`. Archived projects are not included by default.
    try {
      ProjectListResponse result = apiInstance.listProjects(limit, after, includeArchived);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#listProjects");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **limit** | **Integer**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20] |
| **after** | **String**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] |
| **includeArchived** | **Boolean**| If &#x60;true&#x60; returns all projects including those that have been &#x60;archived&#x60;. Archived projects are not included by default. | [optional] [default to false] |

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

<a id="modifyProject"></a>
# **modifyProject**
> Project modifyProject(projectId, projectUpdateRequest)

Modifies a project in the organization.

### Example
```java
// Import classes:
import com.github.oapicf.openapiopenai.ApiClient;
import com.github.oapicf.openapiopenai.ApiException;
import com.github.oapicf.openapiopenai.Configuration;
import com.github.oapicf.openapiopenai.auth.*;
import com.github.oapicf.openapiopenai.models.*;
import com.github.oapicf.openapiopenai.api.ProjectsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.openai.com/v1");
    
    // Configure HTTP bearer authorization: ApiKeyAuth
    HttpBearerAuth ApiKeyAuth = (HttpBearerAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setBearerToken("BEARER TOKEN");

    ProjectsApi apiInstance = new ProjectsApi(defaultClient);
    String projectId = "projectId_example"; // String | The ID of the project.
    ProjectUpdateRequest projectUpdateRequest = new ProjectUpdateRequest(); // ProjectUpdateRequest | The project update request payload.
    try {
      Project result = apiInstance.modifyProject(projectId, projectUpdateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#modifyProject");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **projectId** | **String**| The ID of the project. | |
| **projectUpdateRequest** | [**ProjectUpdateRequest**](ProjectUpdateRequest.md)| The project update request payload. | |

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

<a id="modifyProjectUser"></a>
# **modifyProjectUser**
> ProjectUser modifyProjectUser(projectId, userId, projectUserUpdateRequest)

Modifies a user&#39;s role in the project.

### Example
```java
// Import classes:
import com.github.oapicf.openapiopenai.ApiClient;
import com.github.oapicf.openapiopenai.ApiException;
import com.github.oapicf.openapiopenai.Configuration;
import com.github.oapicf.openapiopenai.auth.*;
import com.github.oapicf.openapiopenai.models.*;
import com.github.oapicf.openapiopenai.api.ProjectsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.openai.com/v1");
    
    // Configure HTTP bearer authorization: ApiKeyAuth
    HttpBearerAuth ApiKeyAuth = (HttpBearerAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setBearerToken("BEARER TOKEN");

    ProjectsApi apiInstance = new ProjectsApi(defaultClient);
    String projectId = "projectId_example"; // String | The ID of the project.
    String userId = "userId_example"; // String | The ID of the user.
    ProjectUserUpdateRequest projectUserUpdateRequest = new ProjectUserUpdateRequest(); // ProjectUserUpdateRequest | The project user update request payload.
    try {
      ProjectUser result = apiInstance.modifyProjectUser(projectId, userId, projectUserUpdateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#modifyProjectUser");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **projectId** | **String**| The ID of the project. | |
| **userId** | **String**| The ID of the user. | |
| **projectUserUpdateRequest** | [**ProjectUserUpdateRequest**](ProjectUserUpdateRequest.md)| The project user update request payload. | |

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

<a id="retrieveProject"></a>
# **retrieveProject**
> Project retrieveProject(projectId)

Retrieves a project.

### Example
```java
// Import classes:
import com.github.oapicf.openapiopenai.ApiClient;
import com.github.oapicf.openapiopenai.ApiException;
import com.github.oapicf.openapiopenai.Configuration;
import com.github.oapicf.openapiopenai.auth.*;
import com.github.oapicf.openapiopenai.models.*;
import com.github.oapicf.openapiopenai.api.ProjectsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.openai.com/v1");
    
    // Configure HTTP bearer authorization: ApiKeyAuth
    HttpBearerAuth ApiKeyAuth = (HttpBearerAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setBearerToken("BEARER TOKEN");

    ProjectsApi apiInstance = new ProjectsApi(defaultClient);
    String projectId = "projectId_example"; // String | The ID of the project.
    try {
      Project result = apiInstance.retrieveProject(projectId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#retrieveProject");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **projectId** | **String**| The ID of the project. | |

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

<a id="retrieveProjectApiKey"></a>
# **retrieveProjectApiKey**
> ProjectApiKey retrieveProjectApiKey(projectId, keyId)

Retrieves an API key in the project.

### Example
```java
// Import classes:
import com.github.oapicf.openapiopenai.ApiClient;
import com.github.oapicf.openapiopenai.ApiException;
import com.github.oapicf.openapiopenai.Configuration;
import com.github.oapicf.openapiopenai.auth.*;
import com.github.oapicf.openapiopenai.models.*;
import com.github.oapicf.openapiopenai.api.ProjectsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.openai.com/v1");
    
    // Configure HTTP bearer authorization: ApiKeyAuth
    HttpBearerAuth ApiKeyAuth = (HttpBearerAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setBearerToken("BEARER TOKEN");

    ProjectsApi apiInstance = new ProjectsApi(defaultClient);
    String projectId = "projectId_example"; // String | The ID of the project.
    String keyId = "keyId_example"; // String | The ID of the API key.
    try {
      ProjectApiKey result = apiInstance.retrieveProjectApiKey(projectId, keyId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#retrieveProjectApiKey");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **projectId** | **String**| The ID of the project. | |
| **keyId** | **String**| The ID of the API key. | |

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

<a id="retrieveProjectServiceAccount"></a>
# **retrieveProjectServiceAccount**
> ProjectServiceAccount retrieveProjectServiceAccount(projectId, serviceAccountId)

Retrieves a service account in the project.

### Example
```java
// Import classes:
import com.github.oapicf.openapiopenai.ApiClient;
import com.github.oapicf.openapiopenai.ApiException;
import com.github.oapicf.openapiopenai.Configuration;
import com.github.oapicf.openapiopenai.auth.*;
import com.github.oapicf.openapiopenai.models.*;
import com.github.oapicf.openapiopenai.api.ProjectsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.openai.com/v1");
    
    // Configure HTTP bearer authorization: ApiKeyAuth
    HttpBearerAuth ApiKeyAuth = (HttpBearerAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setBearerToken("BEARER TOKEN");

    ProjectsApi apiInstance = new ProjectsApi(defaultClient);
    String projectId = "projectId_example"; // String | The ID of the project.
    String serviceAccountId = "serviceAccountId_example"; // String | The ID of the service account.
    try {
      ProjectServiceAccount result = apiInstance.retrieveProjectServiceAccount(projectId, serviceAccountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#retrieveProjectServiceAccount");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **projectId** | **String**| The ID of the project. | |
| **serviceAccountId** | **String**| The ID of the service account. | |

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

<a id="retrieveProjectUser"></a>
# **retrieveProjectUser**
> ProjectUser retrieveProjectUser(projectId, userId)

Retrieves a user in the project.

### Example
```java
// Import classes:
import com.github.oapicf.openapiopenai.ApiClient;
import com.github.oapicf.openapiopenai.ApiException;
import com.github.oapicf.openapiopenai.Configuration;
import com.github.oapicf.openapiopenai.auth.*;
import com.github.oapicf.openapiopenai.models.*;
import com.github.oapicf.openapiopenai.api.ProjectsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.openai.com/v1");
    
    // Configure HTTP bearer authorization: ApiKeyAuth
    HttpBearerAuth ApiKeyAuth = (HttpBearerAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setBearerToken("BEARER TOKEN");

    ProjectsApi apiInstance = new ProjectsApi(defaultClient);
    String projectId = "projectId_example"; // String | The ID of the project.
    String userId = "userId_example"; // String | The ID of the user.
    try {
      ProjectUser result = apiInstance.retrieveProjectUser(projectId, userId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#retrieveProjectUser");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **projectId** | **String**| The ID of the project. | |
| **userId** | **String**| The ID of the user. | |

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

<a id="updateProjectRateLimits"></a>
# **updateProjectRateLimits**
> ProjectRateLimit updateProjectRateLimits(projectId, rateLimitId, projectRateLimitUpdateRequest)

Updates a project rate limit.

### Example
```java
// Import classes:
import com.github.oapicf.openapiopenai.ApiClient;
import com.github.oapicf.openapiopenai.ApiException;
import com.github.oapicf.openapiopenai.Configuration;
import com.github.oapicf.openapiopenai.auth.*;
import com.github.oapicf.openapiopenai.models.*;
import com.github.oapicf.openapiopenai.api.ProjectsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.openai.com/v1");
    
    // Configure HTTP bearer authorization: ApiKeyAuth
    HttpBearerAuth ApiKeyAuth = (HttpBearerAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setBearerToken("BEARER TOKEN");

    ProjectsApi apiInstance = new ProjectsApi(defaultClient);
    String projectId = "projectId_example"; // String | The ID of the project.
    String rateLimitId = "rateLimitId_example"; // String | The ID of the rate limit.
    ProjectRateLimitUpdateRequest projectRateLimitUpdateRequest = new ProjectRateLimitUpdateRequest(); // ProjectRateLimitUpdateRequest | The project rate limit update request payload.
    try {
      ProjectRateLimit result = apiInstance.updateProjectRateLimits(projectId, rateLimitId, projectRateLimitUpdateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#updateProjectRateLimits");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **projectId** | **String**| The ID of the project. | |
| **rateLimitId** | **String**| The ID of the rate limit. | |
| **projectRateLimitUpdateRequest** | [**ProjectRateLimitUpdateRequest**](ProjectRateLimitUpdateRequest.md)| The project rate limit update request payload. | |

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

