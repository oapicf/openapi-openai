# ChatApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createChatCompletion**](ChatApi.md#createChatCompletion) | **POST** /chat/completions | Creates a model response for the given chat conversation.



## createChatCompletion

> CreateChatCompletionResponse createChatCompletion(createChatCompletionRequest)

Creates a model response for the given chat conversation.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ChatApi;

ChatApi apiInstance = new ChatApi();
CreateChatCompletionRequest createChatCompletionRequest = new CreateChatCompletionRequest(); // CreateChatCompletionRequest | 
try {
    CreateChatCompletionResponse result = apiInstance.createChatCompletion(createChatCompletionRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChatApi#createChatCompletion");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createChatCompletionRequest** | [**CreateChatCompletionRequest**](CreateChatCompletionRequest.md)|  |

### Return type

[**CreateChatCompletionResponse**](CreateChatCompletionResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

