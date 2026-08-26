# RealtimeApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_realtime_session**](RealtimeApi.md#create_realtime_session) | **POST** /realtime/sessions | Create an ephemeral API token for use in client-side applications with the Realtime API. Can be configured with the same session parameters as the &#x60;session.update&#x60; client event.  It responds with a session object, plus a &#x60;client_secret&#x60; key which contains a usable ephemeral API token that can be used to authenticate browser clients for the Realtime API. 


# **create_realtime_session**
> `create_realtime_session`(_api::`RealtimeApi`, `realtime_session_create_request`::`RealtimeSessionCreateRequest`; _mediaType=nothing) -> `RealtimeSessionCreateResponse`, `OpenAPI.Clients.ApiResponse` <br/>
> `create_realtime_session`(_api::`RealtimeApi`, response_stream::`Channel`, `realtime_session_create_request`::`RealtimeSessionCreateRequest`; _mediaType=nothing) -> `Channel`{ `RealtimeSessionCreateResponse` }, `OpenAPI.Clients.ApiResponse`

Create an ephemeral API token for use in client-side applications with the Realtime API. Can be configured with the same session parameters as the `session.update` client event.  It responds with a session object, plus a `client_secret` key which contains a usable ephemeral API token that can be used to authenticate browser clients for the Realtime API. 

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`RealtimeApi`** | API context | 
**`realtime_session_create_request`** | [**`RealtimeSessionCreateRequest`**](RealtimeSessionCreateRequest.md) | Create an ephemeral API key with the given session configuration. |

### Return type

[**`RealtimeSessionCreateResponse`**](RealtimeSessionCreateResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

