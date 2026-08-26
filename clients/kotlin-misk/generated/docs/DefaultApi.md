# DefaultApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adminApiKeysCreate**](DefaultApi.md#adminApiKeysCreate) | **Post** /organization/admin_api_keys | Create an organization admin API key
[**adminApiKeysDelete**](DefaultApi.md#adminApiKeysDelete) | **Delete** /organization/admin_api_keys/{key_id} | Delete an organization admin API key
[**adminApiKeysGet**](DefaultApi.md#adminApiKeysGet) | **Get** /organization/admin_api_keys/{key_id} | Retrieve a single organization API key
[**adminApiKeysList**](DefaultApi.md#adminApiKeysList) | **Get** /organization/admin_api_keys | List organization API keys


<a name="adminApiKeysCreate"></a>
# **adminApiKeysCreate**
> AdminApiKey adminApiKeysCreate(adminApiKeysCreateRequest)

Create an organization admin API key

Create a new admin-level API key for the organization.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = DefaultApi()
val adminApiKeysCreateRequest : AdminApiKeysCreateRequest =  // AdminApiKeysCreateRequest | 
try {
    val result : AdminApiKey = apiInstance.adminApiKeysCreate(adminApiKeysCreateRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#adminApiKeysCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#adminApiKeysCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adminApiKeysCreateRequest** | [**AdminApiKeysCreateRequest**](AdminApiKeysCreateRequest.md)|  |

### Return type

[**AdminApiKey**](AdminApiKey.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: APPLICATION_JSON
 - **Accept**: APPLICATION_JSON

<a name="adminApiKeysDelete"></a>
# **adminApiKeysDelete**
> AdminApiKeysDelete200Response adminApiKeysDelete(keyId)

Delete an organization admin API key

Delete the specified admin API key.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = DefaultApi()
val keyId : kotlin.String = keyId_example // kotlin.String | 
try {
    val result : AdminApiKeysDelete200Response = apiInstance.adminApiKeysDelete(keyId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#adminApiKeysDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#adminApiKeysDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **keyId** | **kotlin.String**|  |

### Return type

[**AdminApiKeysDelete200Response**](AdminApiKeysDelete200Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: APPLICATION_JSON

<a name="adminApiKeysGet"></a>
# **adminApiKeysGet**
> AdminApiKey adminApiKeysGet(keyId)

Retrieve a single organization API key

Get details for a specific organization API key by its ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = DefaultApi()
val keyId : kotlin.String = keyId_example // kotlin.String | 
try {
    val result : AdminApiKey = apiInstance.adminApiKeysGet(keyId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#adminApiKeysGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#adminApiKeysGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **keyId** | **kotlin.String**|  |

### Return type

[**AdminApiKey**](AdminApiKey.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: APPLICATION_JSON

<a name="adminApiKeysList"></a>
# **adminApiKeysList**
> ApiKeyList adminApiKeysList(after, order, limit)

List organization API keys

Retrieve a paginated list of organization admin API keys.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = DefaultApi()
val after : kotlin.String = after_example // kotlin.String | 
val order : kotlin.String = order_example // kotlin.String | 
val limit : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : ApiKeyList = apiInstance.adminApiKeysList(after, order, limit)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#adminApiKeysList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#adminApiKeysList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **after** | **kotlin.String**|  | [optional]
 **order** | **kotlin.String**|  | [optional] [default to asc] [enum: asc, desc]
 **limit** | **kotlin.Int**|  | [optional] [default to 20]

### Return type

[**ApiKeyList**](ApiKeyList.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: APPLICATION_JSON

