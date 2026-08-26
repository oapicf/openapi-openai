# CompletionsApi

All URIs are relative to *https://api.openai.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createCompletion**](CompletionsApi.md#createCompletion) | **POST** /completions | Creates a completion for the provided prompt and parameters. |



## createCompletion

> CreateCompletionResponse createCompletion(createCompletionRequest)

Creates a completion for the provided prompt and parameters.

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

