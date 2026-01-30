# ModerationsApi

All URIs are relative to *https://api.openai.com/v1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createModeration**](ModerationsApi.md#createModeration) | **POST** /moderations | Classifies if text and/or image inputs are potentially harmful. Learn more in the [moderation guide](/docs/guides/moderation).  |


<a id="createModeration"></a>
# **createModeration**
> CreateModerationResponse createModeration(createModerationRequest)

Classifies if text and/or image inputs are potentially harmful. Learn more in the [moderation guide](/docs/guides/moderation). 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ModerationsApi()
val createModerationRequest : CreateModerationRequest =  // CreateModerationRequest | 
try {
    val result : CreateModerationResponse = apiInstance.createModeration(createModerationRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ModerationsApi#createModeration")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ModerationsApi#createModeration")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **createModerationRequest** | [**CreateModerationRequest**](CreateModerationRequest.md)|  | |

### Return type

[**CreateModerationResponse**](CreateModerationResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

