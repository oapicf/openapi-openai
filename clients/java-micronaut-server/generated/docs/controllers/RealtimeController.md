# RealtimeController

All URIs are relative to `"/v1"`

The controller class is defined in **[RealtimeController.java](../../src/main/java/org/openapitools/controller/RealtimeController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**createRealtimeSession**](#createRealtimeSession) | **POST** /realtime/sessions | Create an ephemeral API token for use in client-side applications with the Realtime API. Can be configured with the same session parameters as the &#x60;session.update&#x60; client event.  It responds with a session object, plus a &#x60;client_secret&#x60; key which contains a usable ephemeral API token that can be used to authenticate browser clients for the Realtime API. 

<a id="createRealtimeSession"></a>
# **createRealtimeSession**
```java
Mono<RealtimeSessionCreateResponse> RealtimeController.createRealtimeSession(realtimeSessionCreateRequest)
```

Create an ephemeral API token for use in client-side applications with the Realtime API. Can be configured with the same session parameters as the &#x60;session.update&#x60; client event.  It responds with a session object, plus a &#x60;client_secret&#x60; key which contains a usable ephemeral API token that can be used to authenticate browser clients for the Realtime API. 

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**realtimeSessionCreateRequest** | [**RealtimeSessionCreateRequest**](../../docs/models/RealtimeSessionCreateRequest.md) | Create an ephemeral API key with the given session configuration. |

### Return type
[**RealtimeSessionCreateResponse**](../../docs/models/RealtimeSessionCreateResponse.md)

### Authorization
* **ApiKeyAuth**

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

