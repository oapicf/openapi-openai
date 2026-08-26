# CompletionsApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCompletion**](CompletionsApi.md#createCompletion) | **Post** /completions | Creates a completion for the provided prompt and parameters.


<a name="createCompletion"></a>
# **createCompletion**
> CreateCompletionResponse createCompletion(createCompletionRequest)

Creates a completion for the provided prompt and parameters.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = CompletionsApi()
val createCompletionRequest : CreateCompletionRequest =  // CreateCompletionRequest | 
try {
    val result : CreateCompletionResponse = apiInstance.createCompletion(createCompletionRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CompletionsApi#createCompletion")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CompletionsApi#createCompletion")
    e.printStackTrace()
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

 - **Content-Type**: APPLICATION_JSON
 - **Accept**: APPLICATION_JSON

