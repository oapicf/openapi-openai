# CompletionsApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_completion**](CompletionsApi.md#create_completion) | **POST** /completions | Creates a completion for the provided prompt and parameters.


# **create_completion**
> `create_completion`(_api::`CompletionsApi`, `create_completion_request`::`CreateCompletionRequest`; _mediaType=nothing) -> `CreateCompletionResponse`, `OpenAPI.Clients.ApiResponse` <br/>
> `create_completion`(_api::`CompletionsApi`, response_stream::`Channel`, `create_completion_request`::`CreateCompletionRequest`; _mediaType=nothing) -> `Channel`{ `CreateCompletionResponse` }, `OpenAPI.Clients.ApiResponse`

Creates a completion for the provided prompt and parameters.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`CompletionsApi`** | API context | 
**`create_completion_request`** | [**`CreateCompletionRequest`**](CreateCompletionRequest.md) |  |

### Return type

[**`CreateCompletionResponse`**](CreateCompletionResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

