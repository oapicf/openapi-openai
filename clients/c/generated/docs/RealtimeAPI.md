# RealtimeAPI

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**RealtimeAPI_createRealtimeSession**](RealtimeAPI.md#RealtimeAPI_createRealtimeSession) | **POST** /realtime/sessions | Create an ephemeral API token for use in client-side applications with the Realtime API. Can be configured with the same session parameters as the &#x60;session.update&#x60; client event.  It responds with a session object, plus a &#x60;client_secret&#x60; key which contains a usable ephemeral API token that can be used to authenticate browser clients for the Realtime API. 


# **RealtimeAPI_createRealtimeSession**
```c
// Create an ephemeral API token for use in client-side applications with the Realtime API. Can be configured with the same session parameters as the `session.update` client event.  It responds with a session object, plus a `client_secret` key which contains a usable ephemeral API token that can be used to authenticate browser clients for the Realtime API. 
//
realtime_session_create_response_t* RealtimeAPI_createRealtimeSession(apiClient_t *apiClient, realtime_session_create_request_t *realtime_session_create_request);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**realtime_session_create_request** | **[realtime_session_create_request_t](realtime_session_create_request.md) \*** | Create an ephemeral API key with the given session configuration. | 

### Return type

[realtime_session_create_response_t](realtime_session_create_response.md) *


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

