# DefaultApi

All URIs are relative to *https://api.openai.com/v1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**adminApiKeysCreate**](DefaultApi.md#adminApiKeysCreate) | **POST** /organization/admin_api_keys | Create an organization admin API key |
| [**adminApiKeysDelete**](DefaultApi.md#adminApiKeysDelete) | **DELETE** /organization/admin_api_keys/{key_id} | Delete an organization admin API key |
| [**adminApiKeysGet**](DefaultApi.md#adminApiKeysGet) | **GET** /organization/admin_api_keys/{key_id} | Retrieve a single organization API key |
| [**adminApiKeysList**](DefaultApi.md#adminApiKeysList) | **GET** /organization/admin_api_keys | List organization API keys |


<a id="adminApiKeysCreate"></a>
# **adminApiKeysCreate**
> AdminApiKey adminApiKeysCreate(adminApiKeysCreateRequest)

Create an organization admin API key

Create a new admin-level API key for the organization.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

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
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **adminApiKeysCreateRequest** | [**AdminApiKeysCreateRequest**](AdminApiKeysCreateRequest.md)|  | |

### Return type

[**AdminApiKey**](AdminApiKey.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="adminApiKeysDelete"></a>
# **adminApiKeysDelete**
> AdminApiKeysDelete200Response adminApiKeysDelete(keyId)

Delete an organization admin API key

Delete the specified admin API key.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

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
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **keyId** | **kotlin.String**|  | |

### Return type

[**AdminApiKeysDelete200Response**](AdminApiKeysDelete200Response.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="adminApiKeysGet"></a>
# **adminApiKeysGet**
> AdminApiKey adminApiKeysGet(keyId)

Retrieve a single organization API key

Get details for a specific organization API key by its ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

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
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **keyId** | **kotlin.String**|  | |

### Return type

[**AdminApiKey**](AdminApiKey.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="adminApiKeysList"></a>
# **adminApiKeysList**
> ApiKeyList adminApiKeysList(after, order, limit)

List organization API keys

Retrieve a paginated list of organization admin API keys.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

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
| **after** | **kotlin.String**|  | [optional] |
| **order** | **kotlin.String**|  | [optional] [default to Order.asc] [enum: asc, desc] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **limit** | **kotlin.Int**|  | [optional] [default to 20] |

### Return type

[**ApiKeyList**](ApiKeyList.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

