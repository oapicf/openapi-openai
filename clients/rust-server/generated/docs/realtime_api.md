# realtime_api

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
**create-realtime-session**](realtime_api.md#create-realtime-session) | **POST** /realtime/sessions | Create an ephemeral API token for use in client-side applications with the Realtime API. Can be configured with the same session parameters as the `session.update` client event.  It responds with a session object, plus a `client_secret` key which contains a usable ephemeral API token that can be used to authenticate browser clients for the Realtime API. 


# **create-realtime-session**
> models::RealtimeSessionCreateResponse create-realtime-session(ctx, realtime_session_create_request)
Create an ephemeral API token for use in client-side applications with the Realtime API. Can be configured with the same session parameters as the `session.update` client event.  It responds with a session object, plus a `client_secret` key which contains a usable ephemeral API token that can be used to authenticate browser clients for the Realtime API. 

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **realtime_session_create_request** | [**RealtimeSessionCreateRequest**](RealtimeSessionCreateRequest.md)| Create an ephemeral API key with the given session configuration. | 

### Return type

[**models::RealtimeSessionCreateResponse**](RealtimeSessionCreateResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

