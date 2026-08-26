# CompletionsApi

All URIs are relative to *https://api.openai.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createCompletion**](CompletionsApi.md#createCompletion) | **POST** /completions | Creates a completion for the provided prompt and parameters. |



## createCompletion

> CreateCompletionResponse createCompletion(createCompletionRequest)

Creates a completion for the provided prompt and parameters.

### Example

```java
// Import classes:
import org.openapitools.server.ApiClient;
import org.openapitools.server.ApiException;
import org.openapitools.server.Configuration;
import org.openapitools.server.auth.*;
import org.openapitools.server.models.*;
import org.openapitools.server.api.CompletionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.openai.com/v1");
        
        // Configure HTTP bearer authorization: ApiKeyAuth
        HttpBearerAuth ApiKeyAuth = (HttpBearerAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setBearerToken("BEARER TOKEN");

        CompletionsApi apiInstance = new CompletionsApi(defaultClient);
        CreateCompletionRequest createCompletionRequest = new CreateCompletionRequest(); // CreateCompletionRequest | 
        try {
            CreateCompletionResponse result = apiInstance.createCompletion(createCompletionRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CompletionsApi#createCompletion");
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
| **createCompletionRequest** | [**CreateCompletionRequest**](CreateCompletionRequest.md)|  | |

### Return type

[**CreateCompletionResponse**](CreateCompletionResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

