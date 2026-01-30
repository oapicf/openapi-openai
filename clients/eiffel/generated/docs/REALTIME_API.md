# REALTIME_API

All URIs are relative to *https://api.openai.com/v1*

Feature | HTTP request | Description
------------- | ------------- | -------------
[**create_realtime_session**](REALTIME_API.md#create_realtime_session) | **Post** /realtime/sessions | Create an ephemeral API token for use in client-side applications with the Realtime API. Can be configured with the same session parameters as the &#x60;session.update&#x60; client event.  It responds with a session object, plus a &#x60;client_secret&#x60; key which contains a usable ephemeral API token that can be used to authenticate browser clients for the Realtime API. 


# **create_realtime_session**
> create_realtime_session (realtime_session_create_request: REALTIME_SESSION_CREATE_REQUEST ): detachable REALTIME_SESSION_CREATE_RESPONSE


Create an ephemeral API token for use in client-side applications with the Realtime API. Can be configured with the same session parameters as the `session.update` client event.  It responds with a session object, plus a `client_secret` key which contains a usable ephemeral API token that can be used to authenticate browser clients for the Realtime API. 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **realtime_session_create_request** | [**REALTIME_SESSION_CREATE_REQUEST**](REALTIME_SESSION_CREATE_REQUEST.md)| Create an ephemeral API key with the given session configuration. | 

### Return type

[**REALTIME_SESSION_CREATE_RESPONSE**](RealtimeSessionCreateResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

