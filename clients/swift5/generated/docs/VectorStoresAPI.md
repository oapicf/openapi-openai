# VectorStoresAPI

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelVectorStoreFileBatch**](VectorStoresAPI.md#cancelvectorstorefilebatch) | **POST** /vector_stores/{vector_store_id}/file_batches/{batch_id}/cancel | Cancel a vector store file batch. This attempts to cancel the processing of files in this batch as soon as possible.
[**createVectorStore**](VectorStoresAPI.md#createvectorstore) | **POST** /vector_stores | Create a vector store.
[**createVectorStoreFile**](VectorStoresAPI.md#createvectorstorefile) | **POST** /vector_stores/{vector_store_id}/files | Create a vector store file by attaching a [File](/docs/api-reference/files) to a [vector store](/docs/api-reference/vector-stores/object).
[**createVectorStoreFileBatch**](VectorStoresAPI.md#createvectorstorefilebatch) | **POST** /vector_stores/{vector_store_id}/file_batches | Create a vector store file batch.
[**deleteVectorStore**](VectorStoresAPI.md#deletevectorstore) | **DELETE** /vector_stores/{vector_store_id} | Delete a vector store.
[**deleteVectorStoreFile**](VectorStoresAPI.md#deletevectorstorefile) | **DELETE** /vector_stores/{vector_store_id}/files/{file_id} | Delete a vector store file. This will remove the file from the vector store but the file itself will not be deleted. To delete the file, use the [delete file](/docs/api-reference/files/delete) endpoint.
[**getVectorStore**](VectorStoresAPI.md#getvectorstore) | **GET** /vector_stores/{vector_store_id} | Retrieves a vector store.
[**getVectorStoreFile**](VectorStoresAPI.md#getvectorstorefile) | **GET** /vector_stores/{vector_store_id}/files/{file_id} | Retrieves a vector store file.
[**getVectorStoreFileBatch**](VectorStoresAPI.md#getvectorstorefilebatch) | **GET** /vector_stores/{vector_store_id}/file_batches/{batch_id} | Retrieves a vector store file batch.
[**listFilesInVectorStoreBatch**](VectorStoresAPI.md#listfilesinvectorstorebatch) | **GET** /vector_stores/{vector_store_id}/file_batches/{batch_id}/files | Returns a list of vector store files in a batch.
[**listVectorStoreFiles**](VectorStoresAPI.md#listvectorstorefiles) | **GET** /vector_stores/{vector_store_id}/files | Returns a list of vector store files.
[**listVectorStores**](VectorStoresAPI.md#listvectorstores) | **GET** /vector_stores | Returns a list of vector stores.
[**modifyVectorStore**](VectorStoresAPI.md#modifyvectorstore) | **POST** /vector_stores/{vector_store_id} | Modifies a vector store.


# **cancelVectorStoreFileBatch**
```swift
    open class func cancelVectorStoreFileBatch(vectorStoreId: String, batchId: String, completion: @escaping (_ data: VectorStoreFileBatchObject?, _ error: Error?) -> Void)
```

Cancel a vector store file batch. This attempts to cancel the processing of files in this batch as soon as possible.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let vectorStoreId = "vectorStoreId_example" // String | The ID of the vector store that the file batch belongs to.
let batchId = "batchId_example" // String | The ID of the file batch to cancel.

// Cancel a vector store file batch. This attempts to cancel the processing of files in this batch as soon as possible.
VectorStoresAPI.cancelVectorStoreFileBatch(vectorStoreId: vectorStoreId, batchId: batchId) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vectorStoreId** | **String** | The ID of the vector store that the file batch belongs to. | 
 **batchId** | **String** | The ID of the file batch to cancel. | 

### Return type

[**VectorStoreFileBatchObject**](VectorStoreFileBatchObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **createVectorStore**
```swift
    open class func createVectorStore(createVectorStoreRequest: CreateVectorStoreRequest, completion: @escaping (_ data: VectorStoreObject?, _ error: Error?) -> Void)
```

Create a vector store.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let createVectorStoreRequest = CreateVectorStoreRequest(fileIds: ["fileIds_example"], name: "name_example", expiresAfter: VectorStoreExpirationAfter(anchor: "anchor_example", days: 123), chunkingStrategy: CreateVectorStoreRequest_chunking_strategy(type: "type_example", _static: Static_Chunking_Strategy(type: "type_example", _static: Static_Chunking_Strategy_static(maxChunkSizeTokens: 123, chunkOverlapTokens: 123))), metadata: 123) // CreateVectorStoreRequest | 

// Create a vector store.
VectorStoresAPI.createVectorStore(createVectorStoreRequest: createVectorStoreRequest) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createVectorStoreRequest** | [**CreateVectorStoreRequest**](CreateVectorStoreRequest.md) |  | 

### Return type

[**VectorStoreObject**](VectorStoreObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **createVectorStoreFile**
```swift
    open class func createVectorStoreFile(vectorStoreId: String, createVectorStoreFileRequest: CreateVectorStoreFileRequest, completion: @escaping (_ data: VectorStoreFileObject?, _ error: Error?) -> Void)
```

Create a vector store file by attaching a [File](/docs/api-reference/files) to a [vector store](/docs/api-reference/vector-stores/object).

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let vectorStoreId = "vectorStoreId_example" // String | The ID of the vector store for which to create a File. 
let createVectorStoreFileRequest = CreateVectorStoreFileRequest(fileId: "fileId_example", chunkingStrategy: ChunkingStrategyRequestParam(type: "type_example", _static: Static_Chunking_Strategy(type: "type_example", _static: Static_Chunking_Strategy_static(maxChunkSizeTokens: 123, chunkOverlapTokens: 123)))) // CreateVectorStoreFileRequest | 

// Create a vector store file by attaching a [File](/docs/api-reference/files) to a [vector store](/docs/api-reference/vector-stores/object).
VectorStoresAPI.createVectorStoreFile(vectorStoreId: vectorStoreId, createVectorStoreFileRequest: createVectorStoreFileRequest) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vectorStoreId** | **String** | The ID of the vector store for which to create a File.  | 
 **createVectorStoreFileRequest** | [**CreateVectorStoreFileRequest**](CreateVectorStoreFileRequest.md) |  | 

### Return type

[**VectorStoreFileObject**](VectorStoreFileObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **createVectorStoreFileBatch**
```swift
    open class func createVectorStoreFileBatch(vectorStoreId: String, createVectorStoreFileBatchRequest: CreateVectorStoreFileBatchRequest, completion: @escaping (_ data: VectorStoreFileBatchObject?, _ error: Error?) -> Void)
```

Create a vector store file batch.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let vectorStoreId = "vectorStoreId_example" // String | The ID of the vector store for which to create a File Batch. 
let createVectorStoreFileBatchRequest = CreateVectorStoreFileBatchRequest(fileIds: ["fileIds_example"], chunkingStrategy: ChunkingStrategyRequestParam(type: "type_example", _static: Static_Chunking_Strategy(type: "type_example", _static: Static_Chunking_Strategy_static(maxChunkSizeTokens: 123, chunkOverlapTokens: 123)))) // CreateVectorStoreFileBatchRequest | 

// Create a vector store file batch.
VectorStoresAPI.createVectorStoreFileBatch(vectorStoreId: vectorStoreId, createVectorStoreFileBatchRequest: createVectorStoreFileBatchRequest) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vectorStoreId** | **String** | The ID of the vector store for which to create a File Batch.  | 
 **createVectorStoreFileBatchRequest** | [**CreateVectorStoreFileBatchRequest**](CreateVectorStoreFileBatchRequest.md) |  | 

### Return type

[**VectorStoreFileBatchObject**](VectorStoreFileBatchObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **deleteVectorStore**
```swift
    open class func deleteVectorStore(vectorStoreId: String, completion: @escaping (_ data: DeleteVectorStoreResponse?, _ error: Error?) -> Void)
```

Delete a vector store.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let vectorStoreId = "vectorStoreId_example" // String | The ID of the vector store to delete.

// Delete a vector store.
VectorStoresAPI.deleteVectorStore(vectorStoreId: vectorStoreId) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vectorStoreId** | **String** | The ID of the vector store to delete. | 

### Return type

[**DeleteVectorStoreResponse**](DeleteVectorStoreResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **deleteVectorStoreFile**
```swift
    open class func deleteVectorStoreFile(vectorStoreId: String, fileId: String, completion: @escaping (_ data: DeleteVectorStoreFileResponse?, _ error: Error?) -> Void)
```

Delete a vector store file. This will remove the file from the vector store but the file itself will not be deleted. To delete the file, use the [delete file](/docs/api-reference/files/delete) endpoint.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let vectorStoreId = "vectorStoreId_example" // String | The ID of the vector store that the file belongs to.
let fileId = "fileId_example" // String | The ID of the file to delete.

// Delete a vector store file. This will remove the file from the vector store but the file itself will not be deleted. To delete the file, use the [delete file](/docs/api-reference/files/delete) endpoint.
VectorStoresAPI.deleteVectorStoreFile(vectorStoreId: vectorStoreId, fileId: fileId) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vectorStoreId** | **String** | The ID of the vector store that the file belongs to. | 
 **fileId** | **String** | The ID of the file to delete. | 

### Return type

[**DeleteVectorStoreFileResponse**](DeleteVectorStoreFileResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getVectorStore**
```swift
    open class func getVectorStore(vectorStoreId: String, completion: @escaping (_ data: VectorStoreObject?, _ error: Error?) -> Void)
```

Retrieves a vector store.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let vectorStoreId = "vectorStoreId_example" // String | The ID of the vector store to retrieve.

// Retrieves a vector store.
VectorStoresAPI.getVectorStore(vectorStoreId: vectorStoreId) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vectorStoreId** | **String** | The ID of the vector store to retrieve. | 

### Return type

[**VectorStoreObject**](VectorStoreObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getVectorStoreFile**
```swift
    open class func getVectorStoreFile(vectorStoreId: String, fileId: String, completion: @escaping (_ data: VectorStoreFileObject?, _ error: Error?) -> Void)
```

Retrieves a vector store file.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let vectorStoreId = "vectorStoreId_example" // String | The ID of the vector store that the file belongs to.
let fileId = "fileId_example" // String | The ID of the file being retrieved.

// Retrieves a vector store file.
VectorStoresAPI.getVectorStoreFile(vectorStoreId: vectorStoreId, fileId: fileId) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vectorStoreId** | **String** | The ID of the vector store that the file belongs to. | 
 **fileId** | **String** | The ID of the file being retrieved. | 

### Return type

[**VectorStoreFileObject**](VectorStoreFileObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getVectorStoreFileBatch**
```swift
    open class func getVectorStoreFileBatch(vectorStoreId: String, batchId: String, completion: @escaping (_ data: VectorStoreFileBatchObject?, _ error: Error?) -> Void)
```

Retrieves a vector store file batch.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let vectorStoreId = "vectorStoreId_example" // String | The ID of the vector store that the file batch belongs to.
let batchId = "batchId_example" // String | The ID of the file batch being retrieved.

// Retrieves a vector store file batch.
VectorStoresAPI.getVectorStoreFileBatch(vectorStoreId: vectorStoreId, batchId: batchId) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vectorStoreId** | **String** | The ID of the vector store that the file batch belongs to. | 
 **batchId** | **String** | The ID of the file batch being retrieved. | 

### Return type

[**VectorStoreFileBatchObject**](VectorStoreFileBatchObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **listFilesInVectorStoreBatch**
```swift
    open class func listFilesInVectorStoreBatch(vectorStoreId: String, batchId: String, limit: Int? = nil, order: Order_listFilesInVectorStoreBatch? = nil, after: String? = nil, before: String? = nil, filter: Filter_listFilesInVectorStoreBatch? = nil, completion: @escaping (_ data: ListVectorStoreFilesResponse?, _ error: Error?) -> Void)
```

Returns a list of vector store files in a batch.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let vectorStoreId = "vectorStoreId_example" // String | The ID of the vector store that the files belong to.
let batchId = "batchId_example" // String | The ID of the file batch that the files belong to.
let limit = 987 // Int | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional) (default to 20)
let order = "order_example" // String | Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order.  (optional) (default to .desc)
let after = "after_example" // String | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (optional)
let before = "before_example" // String | A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list.  (optional)
let filter = "filter_example" // String | Filter by file status. One of `in_progress`, `completed`, `failed`, `cancelled`. (optional)

// Returns a list of vector store files in a batch.
VectorStoresAPI.listFilesInVectorStoreBatch(vectorStoreId: vectorStoreId, batchId: batchId, limit: limit, order: order, after: after, before: before, filter: filter) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vectorStoreId** | **String** | The ID of the vector store that the files belong to. | 
 **batchId** | **String** | The ID of the file batch that the files belong to. | 
 **limit** | **Int** | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20]
 **order** | **String** | Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  | [optional] [default to .desc]
 **after** | **String** | A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] 
 **before** | **String** | A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [optional] 
 **filter** | **String** | Filter by file status. One of &#x60;in_progress&#x60;, &#x60;completed&#x60;, &#x60;failed&#x60;, &#x60;cancelled&#x60;. | [optional] 

### Return type

[**ListVectorStoreFilesResponse**](ListVectorStoreFilesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **listVectorStoreFiles**
```swift
    open class func listVectorStoreFiles(vectorStoreId: String, limit: Int? = nil, order: Order_listVectorStoreFiles? = nil, after: String? = nil, before: String? = nil, filter: Filter_listVectorStoreFiles? = nil, completion: @escaping (_ data: ListVectorStoreFilesResponse?, _ error: Error?) -> Void)
```

Returns a list of vector store files.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let vectorStoreId = "vectorStoreId_example" // String | The ID of the vector store that the files belong to.
let limit = 987 // Int | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional) (default to 20)
let order = "order_example" // String | Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order.  (optional) (default to .desc)
let after = "after_example" // String | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (optional)
let before = "before_example" // String | A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list.  (optional)
let filter = "filter_example" // String | Filter by file status. One of `in_progress`, `completed`, `failed`, `cancelled`. (optional)

// Returns a list of vector store files.
VectorStoresAPI.listVectorStoreFiles(vectorStoreId: vectorStoreId, limit: limit, order: order, after: after, before: before, filter: filter) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vectorStoreId** | **String** | The ID of the vector store that the files belong to. | 
 **limit** | **Int** | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20]
 **order** | **String** | Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  | [optional] [default to .desc]
 **after** | **String** | A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] 
 **before** | **String** | A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [optional] 
 **filter** | **String** | Filter by file status. One of &#x60;in_progress&#x60;, &#x60;completed&#x60;, &#x60;failed&#x60;, &#x60;cancelled&#x60;. | [optional] 

### Return type

[**ListVectorStoreFilesResponse**](ListVectorStoreFilesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **listVectorStores**
```swift
    open class func listVectorStores(limit: Int? = nil, order: Order_listVectorStores? = nil, after: String? = nil, before: String? = nil, completion: @escaping (_ data: ListVectorStoresResponse?, _ error: Error?) -> Void)
```

Returns a list of vector stores.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let limit = 987 // Int | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional) (default to 20)
let order = "order_example" // String | Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order.  (optional) (default to .desc)
let after = "after_example" // String | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (optional)
let before = "before_example" // String | A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list.  (optional)

// Returns a list of vector stores.
VectorStoresAPI.listVectorStores(limit: limit, order: order, after: after, before: before) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Int** | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20]
 **order** | **String** | Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  | [optional] [default to .desc]
 **after** | **String** | A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] 
 **before** | **String** | A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [optional] 

### Return type

[**ListVectorStoresResponse**](ListVectorStoresResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **modifyVectorStore**
```swift
    open class func modifyVectorStore(vectorStoreId: String, updateVectorStoreRequest: UpdateVectorStoreRequest, completion: @escaping (_ data: VectorStoreObject?, _ error: Error?) -> Void)
```

Modifies a vector store.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let vectorStoreId = "vectorStoreId_example" // String | The ID of the vector store to modify.
let updateVectorStoreRequest = UpdateVectorStoreRequest(name: "name_example", expiresAfter: VectorStoreExpirationAfter(anchor: "anchor_example", days: 123), metadata: 123) // UpdateVectorStoreRequest | 

// Modifies a vector store.
VectorStoresAPI.modifyVectorStore(vectorStoreId: vectorStoreId, updateVectorStoreRequest: updateVectorStoreRequest) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vectorStoreId** | **String** | The ID of the vector store to modify. | 
 **updateVectorStoreRequest** | [**UpdateVectorStoreRequest**](UpdateVectorStoreRequest.md) |  | 

### Return type

[**VectorStoreObject**](VectorStoreObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

