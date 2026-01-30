# DefaultApi

All URIs are relative to *https://api.openai.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**adminApiKeysCreate**](DefaultApi.md#adminApiKeysCreate) | **POST** /organization/admin_api_keys | Create an organization admin API key |
| [**adminApiKeysDelete**](DefaultApi.md#adminApiKeysDelete) | **DELETE** /organization/admin_api_keys/{key_id} | Delete an organization admin API key |
| [**adminApiKeysGet**](DefaultApi.md#adminApiKeysGet) | **GET** /organization/admin_api_keys/{key_id} | Retrieve a single organization API key |
| [**adminApiKeysList**](DefaultApi.md#adminApiKeysList) | **GET** /organization/admin_api_keys | List organization API keys |


<a id="adminApiKeysCreate"></a>
# **adminApiKeysCreate**
> AdminApiKey adminApiKeysCreate(adminApiKeysCreateRequest)

Create an organization admin API key

Create a new admin-level API key for the organization.

### Example
```java
// Import classes:
import com.github.oapicf.openapiopenai.ApiClient;
import com.github.oapicf.openapiopenai.ApiException;
import com.github.oapicf.openapiopenai.Configuration;
import com.github.oapicf.openapiopenai.auth.*;
import com.github.oapicf.openapiopenai.models.*;
import com.github.oapicf.openapiopenai.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.openai.com/v1");
    
    // Configure HTTP bearer authorization: ApiKeyAuth
    HttpBearerAuth ApiKeyAuth = (HttpBearerAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setBearerToken("BEARER TOKEN");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    AdminApiKeysCreateRequest adminApiKeysCreateRequest = new AdminApiKeysCreateRequest(); // AdminApiKeysCreateRequest | 
    try {
      AdminApiKey result = apiInstance.adminApiKeysCreate(adminApiKeysCreateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#adminApiKeysCreate");
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
| **adminApiKeysCreateRequest** | [**AdminApiKeysCreateRequest**](AdminApiKeysCreateRequest.md)|  | |

### Return type

[**AdminApiKey**](AdminApiKey.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The newly created admin API key. |  -  |

<a id="adminApiKeysDelete"></a>
# **adminApiKeysDelete**
> AdminApiKeysDelete200Response adminApiKeysDelete(keyId)

Delete an organization admin API key

Delete the specified admin API key.

### Example
```java
// Import classes:
import com.github.oapicf.openapiopenai.ApiClient;
import com.github.oapicf.openapiopenai.ApiException;
import com.github.oapicf.openapiopenai.Configuration;
import com.github.oapicf.openapiopenai.auth.*;
import com.github.oapicf.openapiopenai.models.*;
import com.github.oapicf.openapiopenai.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.openai.com/v1");
    
    // Configure HTTP bearer authorization: ApiKeyAuth
    HttpBearerAuth ApiKeyAuth = (HttpBearerAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setBearerToken("BEARER TOKEN");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String keyId = "keyId_example"; // String | 
    try {
      AdminApiKeysDelete200Response result = apiInstance.adminApiKeysDelete(keyId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#adminApiKeysDelete");
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
| **keyId** | **String**|  | |

### Return type

[**AdminApiKeysDelete200Response**](AdminApiKeysDelete200Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Confirmation that the API key was deleted. |  -  |

<a id="adminApiKeysGet"></a>
# **adminApiKeysGet**
> AdminApiKey adminApiKeysGet(keyId)

Retrieve a single organization API key

Get details for a specific organization API key by its ID.

### Example
```java
// Import classes:
import com.github.oapicf.openapiopenai.ApiClient;
import com.github.oapicf.openapiopenai.ApiException;
import com.github.oapicf.openapiopenai.Configuration;
import com.github.oapicf.openapiopenai.auth.*;
import com.github.oapicf.openapiopenai.models.*;
import com.github.oapicf.openapiopenai.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.openai.com/v1");
    
    // Configure HTTP bearer authorization: ApiKeyAuth
    HttpBearerAuth ApiKeyAuth = (HttpBearerAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setBearerToken("BEARER TOKEN");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String keyId = "keyId_example"; // String | 
    try {
      AdminApiKey result = apiInstance.adminApiKeysGet(keyId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#adminApiKeysGet");
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
| **keyId** | **String**|  | |

### Return type

[**AdminApiKey**](AdminApiKey.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Details of the requested API key. |  -  |

<a id="adminApiKeysList"></a>
# **adminApiKeysList**
> ApiKeyList adminApiKeysList(after, order, limit)

List organization API keys

Retrieve a paginated list of organization admin API keys.

### Example
```java
// Import classes:
import com.github.oapicf.openapiopenai.ApiClient;
import com.github.oapicf.openapiopenai.ApiException;
import com.github.oapicf.openapiopenai.Configuration;
import com.github.oapicf.openapiopenai.auth.*;
import com.github.oapicf.openapiopenai.models.*;
import com.github.oapicf.openapiopenai.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.openai.com/v1");
    
    // Configure HTTP bearer authorization: ApiKeyAuth
    HttpBearerAuth ApiKeyAuth = (HttpBearerAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setBearerToken("BEARER TOKEN");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String after = "after_example"; // String | 
    String order = "asc"; // String | 
    Integer limit = 20; // Integer | 
    try {
      ApiKeyList result = apiInstance.adminApiKeysList(after, order, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#adminApiKeysList");
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
| **after** | **String**|  | [optional] |
| **order** | **String**|  | [optional] [default to asc] [enum: asc, desc] |
| **limit** | **Integer**|  | [optional] [default to 20] |

### Return type

[**ApiKeyList**](ApiKeyList.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A list of organization API keys. |  -  |

