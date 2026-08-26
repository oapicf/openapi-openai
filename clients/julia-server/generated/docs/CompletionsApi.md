# CompletionsApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_completion**](CompletionsApi.md#create_completion) | **POST** /completions | Creates a completion for the provided prompt and parameters.


# **create_completion**
> `create_completion`(req::`HTTP.Request`, `create_completion_request`::`CreateCompletionRequest`;) -> `CreateCompletionResponse`

Creates a completion for the provided prompt and parameters.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`create_completion_request`** | [**`CreateCompletionRequest`**](CreateCompletionRequest.md)|  |

### Return type

[**`CreateCompletionResponse`**](CreateCompletionResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

