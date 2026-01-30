# RealtimeApi

All URIs are relative to *https://api.openai.com/v1*

|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|[**createRealtimeSession**](#createrealtimesession) | **POST** /realtime/sessions | Create an ephemeral API token for use in client-side applications with the Realtime API. Can be configured with the same session parameters as the &#x60;session.update&#x60; client event.  It responds with a session object, plus a &#x60;client_secret&#x60; key which contains a usable ephemeral API token that can be used to authenticate browser clients for the Realtime API. |

# **createRealtimeSession**
> RealtimeSessionCreateResponse createRealtimeSession(realtimeSessionCreateRequest)


### Example

```typescript
import {
    RealtimeApi,
    Configuration,
    RealtimeSessionCreateRequest
} from './api';

const configuration = new Configuration();
const apiInstance = new RealtimeApi(configuration);

let realtimeSessionCreateRequest: RealtimeSessionCreateRequest; //Create an ephemeral API key with the given session configuration.

const { status, data } = await apiInstance.createRealtimeSession(
    realtimeSessionCreateRequest
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **realtimeSessionCreateRequest** | **RealtimeSessionCreateRequest**| Create an ephemeral API key with the given session configuration. | |


### Return type

**RealtimeSessionCreateResponse**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | Session created successfully. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

