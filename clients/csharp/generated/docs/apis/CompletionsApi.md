# Org.OpenAPITools.Api.CompletionsApi

All URIs are relative to *https://api.openai.com/v1*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**CreateCompletion**](CompletionsApi.md#createcompletion) | **POST** /completions | Creates a completion for the provided prompt and parameters. |

<a id="createcompletion"></a>
# **CreateCompletion**
> CreateCompletionResponse CreateCompletion (CreateCompletionRequest createCompletionRequest)

Creates a completion for the provided prompt and parameters.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **createCompletionRequest** | [**CreateCompletionRequest**](CreateCompletionRequest.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

