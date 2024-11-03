# CompletionsApi

All URIs are relative to *https://api.openai.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createCompletion**](CompletionsApi.md#createCompletion) | **POST** /completions | Creates a completion for the provided prompt and parameters. |


<a name="createCompletion"></a>
# **createCompletion**
> CreateCompletionResponse createCompletion(CreateCompletionRequest)

Creates a completion for the provided prompt and parameters.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **CreateCompletionRequest** | [**CreateCompletionRequest**](../Models/CreateCompletionRequest.md)|  | |

### Return type

[**CreateCompletionResponse**](../Models/CreateCompletionResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

