# RealtimeApi

All URIs are relative to */v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createRealtimeSession**](RealtimeApi.md#createRealtimeSession) | **POST** /realtime/sessions | Create an ephemeral API token for use in client-side applications with the
Realtime API. Can be configured with the same session parameters as the
&#39;session.update&#39; client event.

It responds with a session object, plus a &#39;client_secret&#39; key which contains
a usable ephemeral API token that can be used to authenticate browser clients
for the Realtime API.



## createRealtimeSession

Create an ephemeral API token for use in client-side applications with the
Realtime API. Can be configured with the same session parameters as the
'session.update' client event.

It responds with a session object, plus a 'client_secret' key which contains
a usable ephemeral API token that can be used to authenticate browser clients
for the Realtime API.

### Example

```bash
 createRealtimeSession
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **realtimeSessionCreateRequest** | [**RealtimeSessionCreateRequest**](RealtimeSessionCreateRequest.md) | Create an ephemeral API key with the given session configuration. |

### Return type

[**RealtimeSessionCreateResponse**](RealtimeSessionCreateResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

