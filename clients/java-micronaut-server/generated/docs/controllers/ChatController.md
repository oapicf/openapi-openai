# ChatController

All URIs are relative to `"/v1"`

The controller class is defined in **[ChatController.java](../../src/main/java/org/openapitools/controller/ChatController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**createChatCompletion**](#createChatCompletion) | **POST** /chat/completions | Creates a model response for the given chat conversation. Learn more in the [text generation](/docs/guides/text-generation), [vision](/docs/guides/vision), and [audio](/docs/guides/audio) guides.  Parameter support can differ depending on the model used to generate the response, particularly for newer reasoning models. Parameters that are only supported for reasoning models are noted below. For the current state of  unsupported parameters in reasoning models,  [refer to the reasoning guide](/docs/guides/reasoning). 

<a id="createChatCompletion"></a>
# **createChatCompletion**
```java
Mono<CreateChatCompletionResponse> ChatController.createChatCompletion(createChatCompletionRequest)
```

Creates a model response for the given chat conversation. Learn more in the [text generation](/docs/guides/text-generation), [vision](/docs/guides/vision), and [audio](/docs/guides/audio) guides.  Parameter support can differ depending on the model used to generate the response, particularly for newer reasoning models. Parameters that are only supported for reasoning models are noted below. For the current state of  unsupported parameters in reasoning models,  [refer to the reasoning guide](/docs/guides/reasoning). 

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**createChatCompletionRequest** | [**CreateChatCompletionRequest**](../../docs/models/CreateChatCompletionRequest.md) |  |

### Return type
[**CreateChatCompletionResponse**](../../docs/models/CreateChatCompletionResponse.md)

### Authorization
* **ApiKeyAuth**

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

