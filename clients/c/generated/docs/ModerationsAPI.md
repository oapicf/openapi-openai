# ModerationsAPI

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ModerationsAPI_createModeration**](ModerationsAPI.md#ModerationsAPI_createModeration) | **POST** /moderations | Classifies if text is potentially harmful.


# **ModerationsAPI_createModeration**
```c
// Classifies if text is potentially harmful.
//
create_moderation_response_t* ModerationsAPI_createModeration(apiClient_t *apiClient, create_moderation_request_t *create_moderation_request);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**create_moderation_request** | **[create_moderation_request_t](create_moderation_request.md) \*** |  | 

### Return type

[create_moderation_response_t](create_moderation_response.md) *


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

