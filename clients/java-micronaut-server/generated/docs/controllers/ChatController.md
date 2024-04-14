# ChatController

All URIs are relative to `"/v1"`

The controller class is defined in **[ChatController.java](../../src/main/java/org/openapitools/controller/ChatController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**createChatCompletion**](#createChatCompletion) | **POST** /chat/completions | Creates a model response for the given chat conversation.

<a id="createChatCompletion"></a>
# **createChatCompletion**
```java
Mono<CreateChatCompletionResponse> ChatController.createChatCompletion(createChatCompletionRequest)
```

Creates a model response for the given chat conversation.

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

