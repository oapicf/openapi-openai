# BatchApi

All URIs are relative to *https://api.openai.com/v1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**cancelBatch**](BatchApi.md#cancelBatch) | **POST** /batches/{batch_id}/cancel | Cancels an in-progress batch. The batch will be in status &#x60;cancelling&#x60; for up to 10 minutes, before changing to &#x60;cancelled&#x60;, where it will have partial results (if any) available in the output file. |
| [**createBatch**](BatchApi.md#createBatch) | **POST** /batches | Creates and executes a batch from an uploaded file of requests |
| [**listBatches**](BatchApi.md#listBatches) | **GET** /batches | List your organization&#39;s batches. |
| [**retrieveBatch**](BatchApi.md#retrieveBatch) | **GET** /batches/{batch_id} | Retrieves a batch. |


<a id="cancelBatch"></a>
# **cancelBatch**
> Batch cancelBatch(batchId)

Cancels an in-progress batch. The batch will be in status &#x60;cancelling&#x60; for up to 10 minutes, before changing to &#x60;cancelled&#x60;, where it will have partial results (if any) available in the output file.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BatchApi()
val batchId : kotlin.String = batchId_example // kotlin.String | The ID of the batch to cancel.
try {
    val result : Batch = apiInstance.cancelBatch(batchId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BatchApi#cancelBatch")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BatchApi#cancelBatch")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **batchId** | **kotlin.String**| The ID of the batch to cancel. | |

### Return type

[**Batch**](Batch.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="createBatch"></a>
# **createBatch**
> Batch createBatch(createBatchRequest)

Creates and executes a batch from an uploaded file of requests

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BatchApi()
val createBatchRequest : CreateBatchRequest =  // CreateBatchRequest | 
try {
    val result : Batch = apiInstance.createBatch(createBatchRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BatchApi#createBatch")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BatchApi#createBatch")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **createBatchRequest** | [**CreateBatchRequest**](CreateBatchRequest.md)|  | |

### Return type

[**Batch**](Batch.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="listBatches"></a>
# **listBatches**
> ListBatchesResponse listBatches(after, limit)

List your organization&#39;s batches.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BatchApi()
val after : kotlin.String = after_example // kotlin.String | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
val limit : kotlin.Int = 56 // kotlin.Int | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
try {
    val result : ListBatchesResponse = apiInstance.listBatches(after, limit)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BatchApi#listBatches")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BatchApi#listBatches")
    e.printStackTrace()
}
```

### Parameters
| **after** | **kotlin.String**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **limit** | **kotlin.Int**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20] |

### Return type

[**ListBatchesResponse**](ListBatchesResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="retrieveBatch"></a>
# **retrieveBatch**
> Batch retrieveBatch(batchId)

Retrieves a batch.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BatchApi()
val batchId : kotlin.String = batchId_example // kotlin.String | The ID of the batch to retrieve.
try {
    val result : Batch = apiInstance.retrieveBatch(batchId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BatchApi#retrieveBatch")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BatchApi#retrieveBatch")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **batchId** | **kotlin.String**| The ID of the batch to retrieve. | |

### Return type

[**Batch**](Batch.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

