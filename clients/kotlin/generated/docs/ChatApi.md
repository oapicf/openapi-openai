# ChatApi

All URIs are relative to *https://api.openai.com/v1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createChatCompletion**](ChatApi.md#createChatCompletion) | **POST** /chat/completions | Creates a model response for the given chat conversation. Learn more in the [text generation](/docs/guides/text-generation), [vision](/docs/guides/vision), and [audio](/docs/guides/audio) guides.  Parameter support can differ depending on the model used to generate the response, particularly for newer reasoning models. Parameters that are only supported for reasoning models are noted below. For the current state of  unsupported parameters in reasoning models,  [refer to the reasoning guide](/docs/guides/reasoning).  |


<a id="createChatCompletion"></a>
# **createChatCompletion**
> CreateChatCompletionResponse createChatCompletion(createChatCompletionRequest)

Creates a model response for the given chat conversation. Learn more in the [text generation](/docs/guides/text-generation), [vision](/docs/guides/vision), and [audio](/docs/guides/audio) guides.  Parameter support can differ depending on the model used to generate the response, particularly for newer reasoning models. Parameters that are only supported for reasoning models are noted below. For the current state of  unsupported parameters in reasoning models,  [refer to the reasoning guide](/docs/guides/reasoning). 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ChatApi()
val createChatCompletionRequest : CreateChatCompletionRequest =  // CreateChatCompletionRequest | 
try {
    val result : CreateChatCompletionResponse = apiInstance.createChatCompletion(createChatCompletionRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ChatApi#createChatCompletion")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ChatApi#createChatCompletion")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **createChatCompletionRequest** | [**CreateChatCompletionRequest**](CreateChatCompletionRequest.md)|  | |

### Return type

[**CreateChatCompletionResponse**](CreateChatCompletionResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

