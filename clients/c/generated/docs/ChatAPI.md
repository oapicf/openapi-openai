# ChatAPI

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ChatAPI_createChatCompletion**](ChatAPI.md#ChatAPI_createChatCompletion) | **POST** /chat/completions | Creates a model response for the given chat conversation.


# **ChatAPI_createChatCompletion**
```c
// Creates a model response for the given chat conversation.
//
create_chat_completion_response_t* ChatAPI_createChatCompletion(apiClient_t *apiClient, create_chat_completion_request_t *create_chat_completion_request);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**create_chat_completion_request** | **[create_chat_completion_request_t](create_chat_completion_request.md) \*** |  | 

### Return type

[create_chat_completion_response_t](create_chat_completion_response.md) *


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

