# VectorStoresApi

All URIs are relative to *https://api.openai.com/v1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**cancelVectorStoreFileBatch**](VectorStoresApi.md#cancelVectorStoreFileBatch) | **POST** /vector_stores/{vector_store_id}/file_batches/{batch_id}/cancel | Cancel a vector store file batch. This attempts to cancel the processing of files in this batch as soon as possible. |
| [**createVectorStore**](VectorStoresApi.md#createVectorStore) | **POST** /vector_stores | Create a vector store. |
| [**createVectorStoreFile**](VectorStoresApi.md#createVectorStoreFile) | **POST** /vector_stores/{vector_store_id}/files | Create a vector store file by attaching a [File](/docs/api-reference/files) to a [vector store](/docs/api-reference/vector-stores/object). |
| [**createVectorStoreFileBatch**](VectorStoresApi.md#createVectorStoreFileBatch) | **POST** /vector_stores/{vector_store_id}/file_batches | Create a vector store file batch. |
| [**deleteVectorStore**](VectorStoresApi.md#deleteVectorStore) | **DELETE** /vector_stores/{vector_store_id} | Delete a vector store. |
| [**deleteVectorStoreFile**](VectorStoresApi.md#deleteVectorStoreFile) | **DELETE** /vector_stores/{vector_store_id}/files/{file_id} | Delete a vector store file. This will remove the file from the vector store but the file itself will not be deleted. To delete the file, use the [delete file](/docs/api-reference/files/delete) endpoint. |
| [**getVectorStore**](VectorStoresApi.md#getVectorStore) | **GET** /vector_stores/{vector_store_id} | Retrieves a vector store. |
| [**getVectorStoreFile**](VectorStoresApi.md#getVectorStoreFile) | **GET** /vector_stores/{vector_store_id}/files/{file_id} | Retrieves a vector store file. |
| [**getVectorStoreFileBatch**](VectorStoresApi.md#getVectorStoreFileBatch) | **GET** /vector_stores/{vector_store_id}/file_batches/{batch_id} | Retrieves a vector store file batch. |
| [**listFilesInVectorStoreBatch**](VectorStoresApi.md#listFilesInVectorStoreBatch) | **GET** /vector_stores/{vector_store_id}/file_batches/{batch_id}/files | Returns a list of vector store files in a batch. |
| [**listVectorStoreFiles**](VectorStoresApi.md#listVectorStoreFiles) | **GET** /vector_stores/{vector_store_id}/files | Returns a list of vector store files. |
| [**listVectorStores**](VectorStoresApi.md#listVectorStores) | **GET** /vector_stores | Returns a list of vector stores. |
| [**modifyVectorStore**](VectorStoresApi.md#modifyVectorStore) | **POST** /vector_stores/{vector_store_id} | Modifies a vector store. |


<a id="cancelVectorStoreFileBatch"></a>
# **cancelVectorStoreFileBatch**
> VectorStoreFileBatchObject cancelVectorStoreFileBatch(vectorStoreId, batchId)

Cancel a vector store file batch. This attempts to cancel the processing of files in this batch as soon as possible.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = VectorStoresApi()
val vectorStoreId : kotlin.String = vectorStoreId_example // kotlin.String | The ID of the vector store that the file batch belongs to.
val batchId : kotlin.String = batchId_example // kotlin.String | The ID of the file batch to cancel.
try {
    val result : VectorStoreFileBatchObject = apiInstance.cancelVectorStoreFileBatch(vectorStoreId, batchId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VectorStoresApi#cancelVectorStoreFileBatch")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VectorStoresApi#cancelVectorStoreFileBatch")
    e.printStackTrace()
}
```

### Parameters
| **vectorStoreId** | **kotlin.String**| The ID of the vector store that the file batch belongs to. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **batchId** | **kotlin.String**| The ID of the file batch to cancel. | |

### Return type

[**VectorStoreFileBatchObject**](VectorStoreFileBatchObject.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="createVectorStore"></a>
# **createVectorStore**
> VectorStoreObject createVectorStore(createVectorStoreRequest)

Create a vector store.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = VectorStoresApi()
val createVectorStoreRequest : CreateVectorStoreRequest =  // CreateVectorStoreRequest | 
try {
    val result : VectorStoreObject = apiInstance.createVectorStore(createVectorStoreRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VectorStoresApi#createVectorStore")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VectorStoresApi#createVectorStore")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **createVectorStoreRequest** | [**CreateVectorStoreRequest**](CreateVectorStoreRequest.md)|  | |

### Return type

[**VectorStoreObject**](VectorStoreObject.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="createVectorStoreFile"></a>
# **createVectorStoreFile**
> VectorStoreFileObject createVectorStoreFile(vectorStoreId, createVectorStoreFileRequest)

Create a vector store file by attaching a [File](/docs/api-reference/files) to a [vector store](/docs/api-reference/vector-stores/object).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = VectorStoresApi()
val vectorStoreId : kotlin.String = vs_abc123 // kotlin.String | The ID of the vector store for which to create a File. 
val createVectorStoreFileRequest : CreateVectorStoreFileRequest =  // CreateVectorStoreFileRequest | 
try {
    val result : VectorStoreFileObject = apiInstance.createVectorStoreFile(vectorStoreId, createVectorStoreFileRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VectorStoresApi#createVectorStoreFile")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VectorStoresApi#createVectorStoreFile")
    e.printStackTrace()
}
```

### Parameters
| **vectorStoreId** | **kotlin.String**| The ID of the vector store for which to create a File.  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **createVectorStoreFileRequest** | [**CreateVectorStoreFileRequest**](CreateVectorStoreFileRequest.md)|  | |

### Return type

[**VectorStoreFileObject**](VectorStoreFileObject.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="createVectorStoreFileBatch"></a>
# **createVectorStoreFileBatch**
> VectorStoreFileBatchObject createVectorStoreFileBatch(vectorStoreId, createVectorStoreFileBatchRequest)

Create a vector store file batch.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = VectorStoresApi()
val vectorStoreId : kotlin.String = vs_abc123 // kotlin.String | The ID of the vector store for which to create a File Batch. 
val createVectorStoreFileBatchRequest : CreateVectorStoreFileBatchRequest =  // CreateVectorStoreFileBatchRequest | 
try {
    val result : VectorStoreFileBatchObject = apiInstance.createVectorStoreFileBatch(vectorStoreId, createVectorStoreFileBatchRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VectorStoresApi#createVectorStoreFileBatch")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VectorStoresApi#createVectorStoreFileBatch")
    e.printStackTrace()
}
```

### Parameters
| **vectorStoreId** | **kotlin.String**| The ID of the vector store for which to create a File Batch.  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **createVectorStoreFileBatchRequest** | [**CreateVectorStoreFileBatchRequest**](CreateVectorStoreFileBatchRequest.md)|  | |

### Return type

[**VectorStoreFileBatchObject**](VectorStoreFileBatchObject.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteVectorStore"></a>
# **deleteVectorStore**
> DeleteVectorStoreResponse deleteVectorStore(vectorStoreId)

Delete a vector store.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = VectorStoresApi()
val vectorStoreId : kotlin.String = vectorStoreId_example // kotlin.String | The ID of the vector store to delete.
try {
    val result : DeleteVectorStoreResponse = apiInstance.deleteVectorStore(vectorStoreId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VectorStoresApi#deleteVectorStore")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VectorStoresApi#deleteVectorStore")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **vectorStoreId** | **kotlin.String**| The ID of the vector store to delete. | |

### Return type

[**DeleteVectorStoreResponse**](DeleteVectorStoreResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="deleteVectorStoreFile"></a>
# **deleteVectorStoreFile**
> DeleteVectorStoreFileResponse deleteVectorStoreFile(vectorStoreId, fileId)

Delete a vector store file. This will remove the file from the vector store but the file itself will not be deleted. To delete the file, use the [delete file](/docs/api-reference/files/delete) endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = VectorStoresApi()
val vectorStoreId : kotlin.String = vectorStoreId_example // kotlin.String | The ID of the vector store that the file belongs to.
val fileId : kotlin.String = fileId_example // kotlin.String | The ID of the file to delete.
try {
    val result : DeleteVectorStoreFileResponse = apiInstance.deleteVectorStoreFile(vectorStoreId, fileId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VectorStoresApi#deleteVectorStoreFile")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VectorStoresApi#deleteVectorStoreFile")
    e.printStackTrace()
}
```

### Parameters
| **vectorStoreId** | **kotlin.String**| The ID of the vector store that the file belongs to. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **fileId** | **kotlin.String**| The ID of the file to delete. | |

### Return type

[**DeleteVectorStoreFileResponse**](DeleteVectorStoreFileResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getVectorStore"></a>
# **getVectorStore**
> VectorStoreObject getVectorStore(vectorStoreId)

Retrieves a vector store.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = VectorStoresApi()
val vectorStoreId : kotlin.String = vectorStoreId_example // kotlin.String | The ID of the vector store to retrieve.
try {
    val result : VectorStoreObject = apiInstance.getVectorStore(vectorStoreId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VectorStoresApi#getVectorStore")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VectorStoresApi#getVectorStore")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **vectorStoreId** | **kotlin.String**| The ID of the vector store to retrieve. | |

### Return type

[**VectorStoreObject**](VectorStoreObject.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getVectorStoreFile"></a>
# **getVectorStoreFile**
> VectorStoreFileObject getVectorStoreFile(vectorStoreId, fileId)

Retrieves a vector store file.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = VectorStoresApi()
val vectorStoreId : kotlin.String = vs_abc123 // kotlin.String | The ID of the vector store that the file belongs to.
val fileId : kotlin.String = file-abc123 // kotlin.String | The ID of the file being retrieved.
try {
    val result : VectorStoreFileObject = apiInstance.getVectorStoreFile(vectorStoreId, fileId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VectorStoresApi#getVectorStoreFile")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VectorStoresApi#getVectorStoreFile")
    e.printStackTrace()
}
```

### Parameters
| **vectorStoreId** | **kotlin.String**| The ID of the vector store that the file belongs to. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **fileId** | **kotlin.String**| The ID of the file being retrieved. | |

### Return type

[**VectorStoreFileObject**](VectorStoreFileObject.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getVectorStoreFileBatch"></a>
# **getVectorStoreFileBatch**
> VectorStoreFileBatchObject getVectorStoreFileBatch(vectorStoreId, batchId)

Retrieves a vector store file batch.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = VectorStoresApi()
val vectorStoreId : kotlin.String = vs_abc123 // kotlin.String | The ID of the vector store that the file batch belongs to.
val batchId : kotlin.String = vsfb_abc123 // kotlin.String | The ID of the file batch being retrieved.
try {
    val result : VectorStoreFileBatchObject = apiInstance.getVectorStoreFileBatch(vectorStoreId, batchId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VectorStoresApi#getVectorStoreFileBatch")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VectorStoresApi#getVectorStoreFileBatch")
    e.printStackTrace()
}
```

### Parameters
| **vectorStoreId** | **kotlin.String**| The ID of the vector store that the file batch belongs to. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **batchId** | **kotlin.String**| The ID of the file batch being retrieved. | |

### Return type

[**VectorStoreFileBatchObject**](VectorStoreFileBatchObject.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="listFilesInVectorStoreBatch"></a>
# **listFilesInVectorStoreBatch**
> ListVectorStoreFilesResponse listFilesInVectorStoreBatch(vectorStoreId, batchId, limit, order, after, before, filter)

Returns a list of vector store files in a batch.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = VectorStoresApi()
val vectorStoreId : kotlin.String = vectorStoreId_example // kotlin.String | The ID of the vector store that the files belong to.
val batchId : kotlin.String = batchId_example // kotlin.String | The ID of the file batch that the files belong to.
val limit : kotlin.Int = 56 // kotlin.Int | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
val order : kotlin.String = order_example // kotlin.String | Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order. 
val after : kotlin.String = after_example // kotlin.String | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
val before : kotlin.String = before_example // kotlin.String | A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. 
val filter : kotlin.String = filter_example // kotlin.String | Filter by file status. One of `in_progress`, `completed`, `failed`, `cancelled`.
try {
    val result : ListVectorStoreFilesResponse = apiInstance.listFilesInVectorStoreBatch(vectorStoreId, batchId, limit, order, after, before, filter)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VectorStoresApi#listFilesInVectorStoreBatch")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VectorStoresApi#listFilesInVectorStoreBatch")
    e.printStackTrace()
}
```

### Parameters
| **vectorStoreId** | **kotlin.String**| The ID of the vector store that the files belong to. | |
| **batchId** | **kotlin.String**| The ID of the file batch that the files belong to. | |
| **limit** | **kotlin.Int**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20] |
| **order** | **kotlin.String**| Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  | [optional] [default to Order.desc] [enum: asc, desc] |
| **after** | **kotlin.String**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] |
| **before** | **kotlin.String**| A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **filter** | **kotlin.String**| Filter by file status. One of &#x60;in_progress&#x60;, &#x60;completed&#x60;, &#x60;failed&#x60;, &#x60;cancelled&#x60;. | [optional] [enum: in_progress, completed, failed, cancelled] |

### Return type

[**ListVectorStoreFilesResponse**](ListVectorStoreFilesResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="listVectorStoreFiles"></a>
# **listVectorStoreFiles**
> ListVectorStoreFilesResponse listVectorStoreFiles(vectorStoreId, limit, order, after, before, filter)

Returns a list of vector store files.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = VectorStoresApi()
val vectorStoreId : kotlin.String = vectorStoreId_example // kotlin.String | The ID of the vector store that the files belong to.
val limit : kotlin.Int = 56 // kotlin.Int | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
val order : kotlin.String = order_example // kotlin.String | Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order. 
val after : kotlin.String = after_example // kotlin.String | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
val before : kotlin.String = before_example // kotlin.String | A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. 
val filter : kotlin.String = filter_example // kotlin.String | Filter by file status. One of `in_progress`, `completed`, `failed`, `cancelled`.
try {
    val result : ListVectorStoreFilesResponse = apiInstance.listVectorStoreFiles(vectorStoreId, limit, order, after, before, filter)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VectorStoresApi#listVectorStoreFiles")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VectorStoresApi#listVectorStoreFiles")
    e.printStackTrace()
}
```

### Parameters
| **vectorStoreId** | **kotlin.String**| The ID of the vector store that the files belong to. | |
| **limit** | **kotlin.Int**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20] |
| **order** | **kotlin.String**| Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  | [optional] [default to Order.desc] [enum: asc, desc] |
| **after** | **kotlin.String**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] |
| **before** | **kotlin.String**| A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **filter** | **kotlin.String**| Filter by file status. One of &#x60;in_progress&#x60;, &#x60;completed&#x60;, &#x60;failed&#x60;, &#x60;cancelled&#x60;. | [optional] [enum: in_progress, completed, failed, cancelled] |

### Return type

[**ListVectorStoreFilesResponse**](ListVectorStoreFilesResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="listVectorStores"></a>
# **listVectorStores**
> ListVectorStoresResponse listVectorStores(limit, order, after, before)

Returns a list of vector stores.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = VectorStoresApi()
val limit : kotlin.Int = 56 // kotlin.Int | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
val order : kotlin.String = order_example // kotlin.String | Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order. 
val after : kotlin.String = after_example // kotlin.String | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
val before : kotlin.String = before_example // kotlin.String | A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. 
try {
    val result : ListVectorStoresResponse = apiInstance.listVectorStores(limit, order, after, before)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VectorStoresApi#listVectorStores")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VectorStoresApi#listVectorStores")
    e.printStackTrace()
}
```

### Parameters
| **limit** | **kotlin.Int**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20] |
| **order** | **kotlin.String**| Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  | [optional] [default to Order.desc] [enum: asc, desc] |
| **after** | **kotlin.String**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **before** | **kotlin.String**| A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [optional] |

### Return type

[**ListVectorStoresResponse**](ListVectorStoresResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="modifyVectorStore"></a>
# **modifyVectorStore**
> VectorStoreObject modifyVectorStore(vectorStoreId, updateVectorStoreRequest)

Modifies a vector store.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = VectorStoresApi()
val vectorStoreId : kotlin.String = vectorStoreId_example // kotlin.String | The ID of the vector store to modify.
val updateVectorStoreRequest : UpdateVectorStoreRequest =  // UpdateVectorStoreRequest | 
try {
    val result : VectorStoreObject = apiInstance.modifyVectorStore(vectorStoreId, updateVectorStoreRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VectorStoresApi#modifyVectorStore")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VectorStoresApi#modifyVectorStore")
    e.printStackTrace()
}
```

### Parameters
| **vectorStoreId** | **kotlin.String**| The ID of the vector store to modify. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **updateVectorStoreRequest** | [**UpdateVectorStoreRequest**](UpdateVectorStoreRequest.md)|  | |

### Return type

[**VectorStoreObject**](VectorStoreObject.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

