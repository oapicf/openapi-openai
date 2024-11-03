# CompletionsController

All URIs are relative to `"/v1"`

The controller class is defined in **[CompletionsController.java](../../src/main/java/org/openapitools/controller/CompletionsController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCompletion**](#createCompletion) | **POST** /completions | Creates a completion for the provided prompt and parameters.

<a id="createCompletion"></a>
# **createCompletion**
```java
Mono<CreateCompletionResponse> CompletionsController.createCompletion(createCompletionRequest)
```

Creates a completion for the provided prompt and parameters.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**createCompletionRequest** | [**CreateCompletionRequest**](../../docs/models/CreateCompletionRequest.md) |  |

### Return type
[**CreateCompletionResponse**](../../docs/models/CreateCompletionResponse.md)

### Authorization
* **ApiKeyAuth**

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

