# ModerationsApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createModeration**](ModerationsApi.md#createModeration) | **Post** /moderations | Classifies if text and/or image inputs are potentially harmful. Learn more in the [moderation guide](/docs/guides/moderation). 


<a name="createModeration"></a>
# **createModeration**
> CreateModerationResponse createModeration(createModerationRequest)

Classifies if text and/or image inputs are potentially harmful. Learn more in the [moderation guide](/docs/guides/moderation). 

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createModerationRequest** | [**CreateModerationRequest**](CreateModerationRequest.md)|  |

### Return type

[**CreateModerationResponse**](CreateModerationResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: APPLICATION_JSON
 - **Accept**: APPLICATION_JSON

