# CompletionsAPI

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CompletionsAPI_createCompletion**](CompletionsAPI.md#CompletionsAPI_createCompletion) | **POST** /completions | Creates a completion for the provided prompt and parameters.


# **CompletionsAPI_createCompletion**
```c
// Creates a completion for the provided prompt and parameters.
//
create_completion_response_t* CompletionsAPI_createCompletion(apiClient_t *apiClient, create_completion_request_t *create_completion_request);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**create_completion_request** | **[create_completion_request_t](create_completion_request.md) \*** |  | 

### Return type

[create_completion_response_t](create_completion_response.md) *


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

