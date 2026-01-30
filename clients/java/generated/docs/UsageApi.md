# UsageApi

All URIs are relative to *https://api.openai.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**usageAudioSpeeches**](UsageApi.md#usageAudioSpeeches) | **GET** /organization/usage/audio_speeches | Get audio speeches usage details for the organization. |
| [**usageAudioTranscriptions**](UsageApi.md#usageAudioTranscriptions) | **GET** /organization/usage/audio_transcriptions | Get audio transcriptions usage details for the organization. |
| [**usageCodeInterpreterSessions**](UsageApi.md#usageCodeInterpreterSessions) | **GET** /organization/usage/code_interpreter_sessions | Get code interpreter sessions usage details for the organization. |
| [**usageCompletions**](UsageApi.md#usageCompletions) | **GET** /organization/usage/completions | Get completions usage details for the organization. |
| [**usageCosts**](UsageApi.md#usageCosts) | **GET** /organization/costs | Get costs details for the organization. |
| [**usageEmbeddings**](UsageApi.md#usageEmbeddings) | **GET** /organization/usage/embeddings | Get embeddings usage details for the organization. |
| [**usageImages**](UsageApi.md#usageImages) | **GET** /organization/usage/images | Get images usage details for the organization. |
| [**usageModerations**](UsageApi.md#usageModerations) | **GET** /organization/usage/moderations | Get moderations usage details for the organization. |
| [**usageVectorStores**](UsageApi.md#usageVectorStores) | **GET** /organization/usage/vector_stores | Get vector stores usage details for the organization. |


<a id="usageAudioSpeeches"></a>
# **usageAudioSpeeches**
> UsageResponse usageAudioSpeeches(startTime, endTime, bucketWidth, projectIds, userIds, apiKeyIds, models, groupBy, limit, page)

Get audio speeches usage details for the organization.

### Example
```java
// Import classes:
import com.github.oapicf.openapiopenai.ApiClient;
import com.github.oapicf.openapiopenai.ApiException;
import com.github.oapicf.openapiopenai.Configuration;
import com.github.oapicf.openapiopenai.auth.*;
import com.github.oapicf.openapiopenai.models.*;
import com.github.oapicf.openapiopenai.api.UsageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.openai.com/v1");
    
    // Configure HTTP bearer authorization: ApiKeyAuth
    HttpBearerAuth ApiKeyAuth = (HttpBearerAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setBearerToken("BEARER TOKEN");

    UsageApi apiInstance = new UsageApi(defaultClient);
    Integer startTime = 56; // Integer | Start time (Unix seconds) of the query time range, inclusive.
    Integer endTime = 56; // Integer | End time (Unix seconds) of the query time range, exclusive.
    String bucketWidth = "1m"; // String | Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.
    List<String> projectIds = Arrays.asList(); // List<String> | Return only usage for these projects.
    List<String> userIds = Arrays.asList(); // List<String> | Return only usage for these users.
    List<String> apiKeyIds = Arrays.asList(); // List<String> | Return only usage for these API keys.
    List<String> models = Arrays.asList(); // List<String> | Return only usage for these models.
    List<String> groupBy = Arrays.asList(); // List<String> | Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model` or any combination of them.
    Integer limit = 56; // Integer | Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440 
    String page = "page_example"; // String | A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.
    try {
      UsageResponse result = apiInstance.usageAudioSpeeches(startTime, endTime, bucketWidth, projectIds, userIds, apiKeyIds, models, groupBy, limit, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsageApi#usageAudioSpeeches");
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
| **startTime** | **Integer**| Start time (Unix seconds) of the query time range, inclusive. | |
| **endTime** | **Integer**| End time (Unix seconds) of the query time range, exclusive. | [optional] |
| **bucketWidth** | **String**| Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [optional] [default to 1d] [enum: 1m, 1h, 1d] |
| **projectIds** | [**List&lt;String&gt;**](String.md)| Return only usage for these projects. | [optional] |
| **userIds** | [**List&lt;String&gt;**](String.md)| Return only usage for these users. | [optional] |
| **apiKeyIds** | [**List&lt;String&gt;**](String.md)| Return only usage for these API keys. | [optional] |
| **models** | [**List&lt;String&gt;**](String.md)| Return only usage for these models. | [optional] |
| **groupBy** | [**List&lt;String&gt;**](String.md)| Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60; or any combination of them. | [optional] [enum: project_id, user_id, api_key_id, model] |
| **limit** | **Integer**| Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  | [optional] |
| **page** | **String**| A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [optional] |

### Return type

[**UsageResponse**](UsageResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Usage data retrieved successfully. |  -  |

<a id="usageAudioTranscriptions"></a>
# **usageAudioTranscriptions**
> UsageResponse usageAudioTranscriptions(startTime, endTime, bucketWidth, projectIds, userIds, apiKeyIds, models, groupBy, limit, page)

Get audio transcriptions usage details for the organization.

### Example
```java
// Import classes:
import com.github.oapicf.openapiopenai.ApiClient;
import com.github.oapicf.openapiopenai.ApiException;
import com.github.oapicf.openapiopenai.Configuration;
import com.github.oapicf.openapiopenai.auth.*;
import com.github.oapicf.openapiopenai.models.*;
import com.github.oapicf.openapiopenai.api.UsageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.openai.com/v1");
    
    // Configure HTTP bearer authorization: ApiKeyAuth
    HttpBearerAuth ApiKeyAuth = (HttpBearerAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setBearerToken("BEARER TOKEN");

    UsageApi apiInstance = new UsageApi(defaultClient);
    Integer startTime = 56; // Integer | Start time (Unix seconds) of the query time range, inclusive.
    Integer endTime = 56; // Integer | End time (Unix seconds) of the query time range, exclusive.
    String bucketWidth = "1m"; // String | Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.
    List<String> projectIds = Arrays.asList(); // List<String> | Return only usage for these projects.
    List<String> userIds = Arrays.asList(); // List<String> | Return only usage for these users.
    List<String> apiKeyIds = Arrays.asList(); // List<String> | Return only usage for these API keys.
    List<String> models = Arrays.asList(); // List<String> | Return only usage for these models.
    List<String> groupBy = Arrays.asList(); // List<String> | Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model` or any combination of them.
    Integer limit = 56; // Integer | Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440 
    String page = "page_example"; // String | A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.
    try {
      UsageResponse result = apiInstance.usageAudioTranscriptions(startTime, endTime, bucketWidth, projectIds, userIds, apiKeyIds, models, groupBy, limit, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsageApi#usageAudioTranscriptions");
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
| **startTime** | **Integer**| Start time (Unix seconds) of the query time range, inclusive. | |
| **endTime** | **Integer**| End time (Unix seconds) of the query time range, exclusive. | [optional] |
| **bucketWidth** | **String**| Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [optional] [default to 1d] [enum: 1m, 1h, 1d] |
| **projectIds** | [**List&lt;String&gt;**](String.md)| Return only usage for these projects. | [optional] |
| **userIds** | [**List&lt;String&gt;**](String.md)| Return only usage for these users. | [optional] |
| **apiKeyIds** | [**List&lt;String&gt;**](String.md)| Return only usage for these API keys. | [optional] |
| **models** | [**List&lt;String&gt;**](String.md)| Return only usage for these models. | [optional] |
| **groupBy** | [**List&lt;String&gt;**](String.md)| Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60; or any combination of them. | [optional] [enum: project_id, user_id, api_key_id, model] |
| **limit** | **Integer**| Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  | [optional] |
| **page** | **String**| A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [optional] |

### Return type

[**UsageResponse**](UsageResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Usage data retrieved successfully. |  -  |

<a id="usageCodeInterpreterSessions"></a>
# **usageCodeInterpreterSessions**
> UsageResponse usageCodeInterpreterSessions(startTime, endTime, bucketWidth, projectIds, groupBy, limit, page)

Get code interpreter sessions usage details for the organization.

### Example
```java
// Import classes:
import com.github.oapicf.openapiopenai.ApiClient;
import com.github.oapicf.openapiopenai.ApiException;
import com.github.oapicf.openapiopenai.Configuration;
import com.github.oapicf.openapiopenai.auth.*;
import com.github.oapicf.openapiopenai.models.*;
import com.github.oapicf.openapiopenai.api.UsageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.openai.com/v1");
    
    // Configure HTTP bearer authorization: ApiKeyAuth
    HttpBearerAuth ApiKeyAuth = (HttpBearerAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setBearerToken("BEARER TOKEN");

    UsageApi apiInstance = new UsageApi(defaultClient);
    Integer startTime = 56; // Integer | Start time (Unix seconds) of the query time range, inclusive.
    Integer endTime = 56; // Integer | End time (Unix seconds) of the query time range, exclusive.
    String bucketWidth = "1m"; // String | Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.
    List<String> projectIds = Arrays.asList(); // List<String> | Return only usage for these projects.
    List<String> groupBy = Arrays.asList(); // List<String> | Group the usage data by the specified fields. Support fields include `project_id`.
    Integer limit = 56; // Integer | Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440 
    String page = "page_example"; // String | A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.
    try {
      UsageResponse result = apiInstance.usageCodeInterpreterSessions(startTime, endTime, bucketWidth, projectIds, groupBy, limit, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsageApi#usageCodeInterpreterSessions");
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
| **startTime** | **Integer**| Start time (Unix seconds) of the query time range, inclusive. | |
| **endTime** | **Integer**| End time (Unix seconds) of the query time range, exclusive. | [optional] |
| **bucketWidth** | **String**| Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [optional] [default to 1d] [enum: 1m, 1h, 1d] |
| **projectIds** | [**List&lt;String&gt;**](String.md)| Return only usage for these projects. | [optional] |
| **groupBy** | [**List&lt;String&gt;**](String.md)| Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;. | [optional] [enum: project_id] |
| **limit** | **Integer**| Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  | [optional] |
| **page** | **String**| A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [optional] |

### Return type

[**UsageResponse**](UsageResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Usage data retrieved successfully. |  -  |

<a id="usageCompletions"></a>
# **usageCompletions**
> UsageResponse usageCompletions(startTime, endTime, bucketWidth, projectIds, userIds, apiKeyIds, models, batch, groupBy, limit, page)

Get completions usage details for the organization.

### Example
```java
// Import classes:
import com.github.oapicf.openapiopenai.ApiClient;
import com.github.oapicf.openapiopenai.ApiException;
import com.github.oapicf.openapiopenai.Configuration;
import com.github.oapicf.openapiopenai.auth.*;
import com.github.oapicf.openapiopenai.models.*;
import com.github.oapicf.openapiopenai.api.UsageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.openai.com/v1");
    
    // Configure HTTP bearer authorization: ApiKeyAuth
    HttpBearerAuth ApiKeyAuth = (HttpBearerAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setBearerToken("BEARER TOKEN");

    UsageApi apiInstance = new UsageApi(defaultClient);
    Integer startTime = 56; // Integer | Start time (Unix seconds) of the query time range, inclusive.
    Integer endTime = 56; // Integer | End time (Unix seconds) of the query time range, exclusive.
    String bucketWidth = "1m"; // String | Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.
    List<String> projectIds = Arrays.asList(); // List<String> | Return only usage for these projects.
    List<String> userIds = Arrays.asList(); // List<String> | Return only usage for these users.
    List<String> apiKeyIds = Arrays.asList(); // List<String> | Return only usage for these API keys.
    List<String> models = Arrays.asList(); // List<String> | Return only usage for these models.
    Boolean batch = true; // Boolean | If `true`, return batch jobs only. If `false`, return non-batch jobs only. By default, return both. 
    List<String> groupBy = Arrays.asList(); // List<String> | Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model`, `batch` or any combination of them.
    Integer limit = 56; // Integer | Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440 
    String page = "page_example"; // String | A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.
    try {
      UsageResponse result = apiInstance.usageCompletions(startTime, endTime, bucketWidth, projectIds, userIds, apiKeyIds, models, batch, groupBy, limit, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsageApi#usageCompletions");
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
| **startTime** | **Integer**| Start time (Unix seconds) of the query time range, inclusive. | |
| **endTime** | **Integer**| End time (Unix seconds) of the query time range, exclusive. | [optional] |
| **bucketWidth** | **String**| Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [optional] [default to 1d] [enum: 1m, 1h, 1d] |
| **projectIds** | [**List&lt;String&gt;**](String.md)| Return only usage for these projects. | [optional] |
| **userIds** | [**List&lt;String&gt;**](String.md)| Return only usage for these users. | [optional] |
| **apiKeyIds** | [**List&lt;String&gt;**](String.md)| Return only usage for these API keys. | [optional] |
| **models** | [**List&lt;String&gt;**](String.md)| Return only usage for these models. | [optional] |
| **batch** | **Boolean**| If &#x60;true&#x60;, return batch jobs only. If &#x60;false&#x60;, return non-batch jobs only. By default, return both.  | [optional] |
| **groupBy** | [**List&lt;String&gt;**](String.md)| Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60;, &#x60;batch&#x60; or any combination of them. | [optional] [enum: project_id, user_id, api_key_id, model, batch] |
| **limit** | **Integer**| Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  | [optional] |
| **page** | **String**| A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [optional] |

### Return type

[**UsageResponse**](UsageResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Usage data retrieved successfully. |  -  |

<a id="usageCosts"></a>
# **usageCosts**
> UsageResponse usageCosts(startTime, endTime, bucketWidth, projectIds, groupBy, limit, page)

Get costs details for the organization.

### Example
```java
// Import classes:
import com.github.oapicf.openapiopenai.ApiClient;
import com.github.oapicf.openapiopenai.ApiException;
import com.github.oapicf.openapiopenai.Configuration;
import com.github.oapicf.openapiopenai.auth.*;
import com.github.oapicf.openapiopenai.models.*;
import com.github.oapicf.openapiopenai.api.UsageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.openai.com/v1");
    
    // Configure HTTP bearer authorization: ApiKeyAuth
    HttpBearerAuth ApiKeyAuth = (HttpBearerAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setBearerToken("BEARER TOKEN");

    UsageApi apiInstance = new UsageApi(defaultClient);
    Integer startTime = 56; // Integer | Start time (Unix seconds) of the query time range, inclusive.
    Integer endTime = 56; // Integer | End time (Unix seconds) of the query time range, exclusive.
    String bucketWidth = "1d"; // String | Width of each time bucket in response. Currently only `1d` is supported, default to `1d`.
    List<String> projectIds = Arrays.asList(); // List<String> | Return only costs for these projects.
    List<String> groupBy = Arrays.asList(); // List<String> | Group the costs by the specified fields. Support fields include `project_id`, `line_item` and any combination of them.
    Integer limit = 7; // Integer | A limit on the number of buckets to be returned. Limit can range between 1 and 180, and the default is 7. 
    String page = "page_example"; // String | A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.
    try {
      UsageResponse result = apiInstance.usageCosts(startTime, endTime, bucketWidth, projectIds, groupBy, limit, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsageApi#usageCosts");
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
| **startTime** | **Integer**| Start time (Unix seconds) of the query time range, inclusive. | |
| **endTime** | **Integer**| End time (Unix seconds) of the query time range, exclusive. | [optional] |
| **bucketWidth** | **String**| Width of each time bucket in response. Currently only &#x60;1d&#x60; is supported, default to &#x60;1d&#x60;. | [optional] [default to 1d] [enum: 1d] |
| **projectIds** | [**List&lt;String&gt;**](String.md)| Return only costs for these projects. | [optional] |
| **groupBy** | [**List&lt;String&gt;**](String.md)| Group the costs by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;line_item&#x60; and any combination of them. | [optional] [enum: project_id, line_item] |
| **limit** | **Integer**| A limit on the number of buckets to be returned. Limit can range between 1 and 180, and the default is 7.  | [optional] [default to 7] |
| **page** | **String**| A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [optional] |

### Return type

[**UsageResponse**](UsageResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Costs data retrieved successfully. |  -  |

<a id="usageEmbeddings"></a>
# **usageEmbeddings**
> UsageResponse usageEmbeddings(startTime, endTime, bucketWidth, projectIds, userIds, apiKeyIds, models, groupBy, limit, page)

Get embeddings usage details for the organization.

### Example
```java
// Import classes:
import com.github.oapicf.openapiopenai.ApiClient;
import com.github.oapicf.openapiopenai.ApiException;
import com.github.oapicf.openapiopenai.Configuration;
import com.github.oapicf.openapiopenai.auth.*;
import com.github.oapicf.openapiopenai.models.*;
import com.github.oapicf.openapiopenai.api.UsageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.openai.com/v1");
    
    // Configure HTTP bearer authorization: ApiKeyAuth
    HttpBearerAuth ApiKeyAuth = (HttpBearerAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setBearerToken("BEARER TOKEN");

    UsageApi apiInstance = new UsageApi(defaultClient);
    Integer startTime = 56; // Integer | Start time (Unix seconds) of the query time range, inclusive.
    Integer endTime = 56; // Integer | End time (Unix seconds) of the query time range, exclusive.
    String bucketWidth = "1m"; // String | Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.
    List<String> projectIds = Arrays.asList(); // List<String> | Return only usage for these projects.
    List<String> userIds = Arrays.asList(); // List<String> | Return only usage for these users.
    List<String> apiKeyIds = Arrays.asList(); // List<String> | Return only usage for these API keys.
    List<String> models = Arrays.asList(); // List<String> | Return only usage for these models.
    List<String> groupBy = Arrays.asList(); // List<String> | Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model` or any combination of them.
    Integer limit = 56; // Integer | Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440 
    String page = "page_example"; // String | A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.
    try {
      UsageResponse result = apiInstance.usageEmbeddings(startTime, endTime, bucketWidth, projectIds, userIds, apiKeyIds, models, groupBy, limit, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsageApi#usageEmbeddings");
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
| **startTime** | **Integer**| Start time (Unix seconds) of the query time range, inclusive. | |
| **endTime** | **Integer**| End time (Unix seconds) of the query time range, exclusive. | [optional] |
| **bucketWidth** | **String**| Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [optional] [default to 1d] [enum: 1m, 1h, 1d] |
| **projectIds** | [**List&lt;String&gt;**](String.md)| Return only usage for these projects. | [optional] |
| **userIds** | [**List&lt;String&gt;**](String.md)| Return only usage for these users. | [optional] |
| **apiKeyIds** | [**List&lt;String&gt;**](String.md)| Return only usage for these API keys. | [optional] |
| **models** | [**List&lt;String&gt;**](String.md)| Return only usage for these models. | [optional] |
| **groupBy** | [**List&lt;String&gt;**](String.md)| Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60; or any combination of them. | [optional] [enum: project_id, user_id, api_key_id, model] |
| **limit** | **Integer**| Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  | [optional] |
| **page** | **String**| A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [optional] |

### Return type

[**UsageResponse**](UsageResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Usage data retrieved successfully. |  -  |

<a id="usageImages"></a>
# **usageImages**
> UsageResponse usageImages(startTime, endTime, bucketWidth, sources, sizes, projectIds, userIds, apiKeyIds, models, groupBy, limit, page)

Get images usage details for the organization.

### Example
```java
// Import classes:
import com.github.oapicf.openapiopenai.ApiClient;
import com.github.oapicf.openapiopenai.ApiException;
import com.github.oapicf.openapiopenai.Configuration;
import com.github.oapicf.openapiopenai.auth.*;
import com.github.oapicf.openapiopenai.models.*;
import com.github.oapicf.openapiopenai.api.UsageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.openai.com/v1");
    
    // Configure HTTP bearer authorization: ApiKeyAuth
    HttpBearerAuth ApiKeyAuth = (HttpBearerAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setBearerToken("BEARER TOKEN");

    UsageApi apiInstance = new UsageApi(defaultClient);
    Integer startTime = 56; // Integer | Start time (Unix seconds) of the query time range, inclusive.
    Integer endTime = 56; // Integer | End time (Unix seconds) of the query time range, exclusive.
    String bucketWidth = "1m"; // String | Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.
    List<String> sources = Arrays.asList(); // List<String> | Return only usages for these sources. Possible values are `image.generation`, `image.edit`, `image.variation` or any combination of them.
    List<String> sizes = Arrays.asList(); // List<String> | Return only usages for these image sizes. Possible values are `256x256`, `512x512`, `1024x1024`, `1792x1792`, `1024x1792` or any combination of them.
    List<String> projectIds = Arrays.asList(); // List<String> | Return only usage for these projects.
    List<String> userIds = Arrays.asList(); // List<String> | Return only usage for these users.
    List<String> apiKeyIds = Arrays.asList(); // List<String> | Return only usage for these API keys.
    List<String> models = Arrays.asList(); // List<String> | Return only usage for these models.
    List<String> groupBy = Arrays.asList(); // List<String> | Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model`, `size`, `source` or any combination of them.
    Integer limit = 56; // Integer | Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440 
    String page = "page_example"; // String | A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.
    try {
      UsageResponse result = apiInstance.usageImages(startTime, endTime, bucketWidth, sources, sizes, projectIds, userIds, apiKeyIds, models, groupBy, limit, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsageApi#usageImages");
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
| **startTime** | **Integer**| Start time (Unix seconds) of the query time range, inclusive. | |
| **endTime** | **Integer**| End time (Unix seconds) of the query time range, exclusive. | [optional] |
| **bucketWidth** | **String**| Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [optional] [default to 1d] [enum: 1m, 1h, 1d] |
| **sources** | [**List&lt;String&gt;**](String.md)| Return only usages for these sources. Possible values are &#x60;image.generation&#x60;, &#x60;image.edit&#x60;, &#x60;image.variation&#x60; or any combination of them. | [optional] [enum: image.generation, image.edit, image.variation] |
| **sizes** | [**List&lt;String&gt;**](String.md)| Return only usages for these image sizes. Possible values are &#x60;256x256&#x60;, &#x60;512x512&#x60;, &#x60;1024x1024&#x60;, &#x60;1792x1792&#x60;, &#x60;1024x1792&#x60; or any combination of them. | [optional] [enum: 256x256, 512x512, 1024x1024, 1792x1792, 1024x1792] |
| **projectIds** | [**List&lt;String&gt;**](String.md)| Return only usage for these projects. | [optional] |
| **userIds** | [**List&lt;String&gt;**](String.md)| Return only usage for these users. | [optional] |
| **apiKeyIds** | [**List&lt;String&gt;**](String.md)| Return only usage for these API keys. | [optional] |
| **models** | [**List&lt;String&gt;**](String.md)| Return only usage for these models. | [optional] |
| **groupBy** | [**List&lt;String&gt;**](String.md)| Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60;, &#x60;size&#x60;, &#x60;source&#x60; or any combination of them. | [optional] [enum: project_id, user_id, api_key_id, model, size, source] |
| **limit** | **Integer**| Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  | [optional] |
| **page** | **String**| A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [optional] |

### Return type

[**UsageResponse**](UsageResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Usage data retrieved successfully. |  -  |

<a id="usageModerations"></a>
# **usageModerations**
> UsageResponse usageModerations(startTime, endTime, bucketWidth, projectIds, userIds, apiKeyIds, models, groupBy, limit, page)

Get moderations usage details for the organization.

### Example
```java
// Import classes:
import com.github.oapicf.openapiopenai.ApiClient;
import com.github.oapicf.openapiopenai.ApiException;
import com.github.oapicf.openapiopenai.Configuration;
import com.github.oapicf.openapiopenai.auth.*;
import com.github.oapicf.openapiopenai.models.*;
import com.github.oapicf.openapiopenai.api.UsageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.openai.com/v1");
    
    // Configure HTTP bearer authorization: ApiKeyAuth
    HttpBearerAuth ApiKeyAuth = (HttpBearerAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setBearerToken("BEARER TOKEN");

    UsageApi apiInstance = new UsageApi(defaultClient);
    Integer startTime = 56; // Integer | Start time (Unix seconds) of the query time range, inclusive.
    Integer endTime = 56; // Integer | End time (Unix seconds) of the query time range, exclusive.
    String bucketWidth = "1m"; // String | Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.
    List<String> projectIds = Arrays.asList(); // List<String> | Return only usage for these projects.
    List<String> userIds = Arrays.asList(); // List<String> | Return only usage for these users.
    List<String> apiKeyIds = Arrays.asList(); // List<String> | Return only usage for these API keys.
    List<String> models = Arrays.asList(); // List<String> | Return only usage for these models.
    List<String> groupBy = Arrays.asList(); // List<String> | Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model` or any combination of them.
    Integer limit = 56; // Integer | Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440 
    String page = "page_example"; // String | A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.
    try {
      UsageResponse result = apiInstance.usageModerations(startTime, endTime, bucketWidth, projectIds, userIds, apiKeyIds, models, groupBy, limit, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsageApi#usageModerations");
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
| **startTime** | **Integer**| Start time (Unix seconds) of the query time range, inclusive. | |
| **endTime** | **Integer**| End time (Unix seconds) of the query time range, exclusive. | [optional] |
| **bucketWidth** | **String**| Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [optional] [default to 1d] [enum: 1m, 1h, 1d] |
| **projectIds** | [**List&lt;String&gt;**](String.md)| Return only usage for these projects. | [optional] |
| **userIds** | [**List&lt;String&gt;**](String.md)| Return only usage for these users. | [optional] |
| **apiKeyIds** | [**List&lt;String&gt;**](String.md)| Return only usage for these API keys. | [optional] |
| **models** | [**List&lt;String&gt;**](String.md)| Return only usage for these models. | [optional] |
| **groupBy** | [**List&lt;String&gt;**](String.md)| Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60; or any combination of them. | [optional] [enum: project_id, user_id, api_key_id, model] |
| **limit** | **Integer**| Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  | [optional] |
| **page** | **String**| A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [optional] |

### Return type

[**UsageResponse**](UsageResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Usage data retrieved successfully. |  -  |

<a id="usageVectorStores"></a>
# **usageVectorStores**
> UsageResponse usageVectorStores(startTime, endTime, bucketWidth, projectIds, groupBy, limit, page)

Get vector stores usage details for the organization.

### Example
```java
// Import classes:
import com.github.oapicf.openapiopenai.ApiClient;
import com.github.oapicf.openapiopenai.ApiException;
import com.github.oapicf.openapiopenai.Configuration;
import com.github.oapicf.openapiopenai.auth.*;
import com.github.oapicf.openapiopenai.models.*;
import com.github.oapicf.openapiopenai.api.UsageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.openai.com/v1");
    
    // Configure HTTP bearer authorization: ApiKeyAuth
    HttpBearerAuth ApiKeyAuth = (HttpBearerAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setBearerToken("BEARER TOKEN");

    UsageApi apiInstance = new UsageApi(defaultClient);
    Integer startTime = 56; // Integer | Start time (Unix seconds) of the query time range, inclusive.
    Integer endTime = 56; // Integer | End time (Unix seconds) of the query time range, exclusive.
    String bucketWidth = "1m"; // String | Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.
    List<String> projectIds = Arrays.asList(); // List<String> | Return only usage for these projects.
    List<String> groupBy = Arrays.asList(); // List<String> | Group the usage data by the specified fields. Support fields include `project_id`.
    Integer limit = 56; // Integer | Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440 
    String page = "page_example"; // String | A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.
    try {
      UsageResponse result = apiInstance.usageVectorStores(startTime, endTime, bucketWidth, projectIds, groupBy, limit, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsageApi#usageVectorStores");
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
| **startTime** | **Integer**| Start time (Unix seconds) of the query time range, inclusive. | |
| **endTime** | **Integer**| End time (Unix seconds) of the query time range, exclusive. | [optional] |
| **bucketWidth** | **String**| Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [optional] [default to 1d] [enum: 1m, 1h, 1d] |
| **projectIds** | [**List&lt;String&gt;**](String.md)| Return only usage for these projects. | [optional] |
| **groupBy** | [**List&lt;String&gt;**](String.md)| Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;. | [optional] [enum: project_id] |
| **limit** | **Integer**| Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  | [optional] |
| **page** | **String**| A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [optional] |

### Return type

[**UsageResponse**](UsageResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Usage data retrieved successfully. |  -  |

