# CompletionsApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCompletion**](CompletionsApi.md#createCompletion) | **POST** /completions | Creates a completion for the provided prompt and parameters.



## createCompletion

> CreateCompletionResponse createCompletion(createCompletionRequest)

Creates a completion for the provided prompt and parameters.

### Example

```java
// Import classes:
//import org.openapitools.client.api.CompletionsApi;

CompletionsApi apiInstance = new CompletionsApi();
CreateCompletionRequest createCompletionRequest = new CreateCompletionRequest(); // CreateCompletionRequest | 
try {
    CreateCompletionResponse result = apiInstance.createCompletion(createCompletionRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CompletionsApi#createCompletion");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createCompletionRequest** | [**CreateCompletionRequest**](CreateCompletionRequest.md)|  |

### Return type

[**CreateCompletionResponse**](CreateCompletionResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

