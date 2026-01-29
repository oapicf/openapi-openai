# Org.OpenAPITools.Api.ChatApi

All URIs are relative to *https://api.openai.com/v1*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**CreateChatCompletion**](ChatApi.md#createchatcompletion) | **POST** /chat/completions | Creates a model response for the given chat conversation. |

<a id="createchatcompletion"></a>
# **CreateChatCompletion**
> CreateChatCompletionResponse CreateChatCompletion (CreateChatCompletionRequest createChatCompletionRequest)

Creates a model response for the given chat conversation.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **createChatCompletionRequest** | [**CreateChatCompletionRequest**](CreateChatCompletionRequest.md) |  |  |

### Return type

[**CreateChatCompletionResponse**](CreateChatCompletionResponse.md)

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

