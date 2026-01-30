# RealtimeApi

All URIs are relative to *https://api.openai.com/v1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createRealtimeSession**](RealtimeApi.md#createRealtimeSession) | **POST** /realtime/sessions | Create an ephemeral API token for use in client-side applications with the Realtime API. Can be configured with the same session parameters as the &#x60;session.update&#x60; client event.  It responds with a session object, plus a &#x60;client_secret&#x60; key which contains a usable ephemeral API token that can be used to authenticate browser clients for the Realtime API.  |


<a id="createRealtimeSession"></a>
# **createRealtimeSession**
> RealtimeSessionCreateResponse createRealtimeSession(realtimeSessionCreateRequest)

Create an ephemeral API token for use in client-side applications with the Realtime API. Can be configured with the same session parameters as the &#x60;session.update&#x60; client event.  It responds with a session object, plus a &#x60;client_secret&#x60; key which contains a usable ephemeral API token that can be used to authenticate browser clients for the Realtime API. 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = RealtimeApi()
val realtimeSessionCreateRequest : RealtimeSessionCreateRequest =  // RealtimeSessionCreateRequest | Create an ephemeral API key with the given session configuration.
try {
    val result : RealtimeSessionCreateResponse = apiInstance.createRealtimeSession(realtimeSessionCreateRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RealtimeApi#createRealtimeSession")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RealtimeApi#createRealtimeSession")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **realtimeSessionCreateRequest** | [**RealtimeSessionCreateRequest**](RealtimeSessionCreateRequest.md)| Create an ephemeral API key with the given session configuration. | |

### Return type

[**RealtimeSessionCreateResponse**](RealtimeSessionCreateResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

