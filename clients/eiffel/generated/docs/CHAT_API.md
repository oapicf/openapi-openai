# CHAT_API

All URIs are relative to *https://api.openai.com/v1*

Feature | HTTP request | Description
------------- | ------------- | -------------
[**create_chat_completion**](CHAT_API.md#create_chat_completion) | **Post** /chat/completions | Creates a model response for the given chat conversation.


# **create_chat_completion**
> create_chat_completion (create_chat_completion_request: CREATE_CHAT_COMPLETION_REQUEST ): detachable CREATE_CHAT_COMPLETION_RESPONSE


Creates a model response for the given chat conversation.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **create_chat_completion_request** | [**CREATE_CHAT_COMPLETION_REQUEST**](CREATE_CHAT_COMPLETION_REQUEST.md)|  | 

### Return type

[**CREATE_CHAT_COMPLETION_RESPONSE**](CreateChatCompletionResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

