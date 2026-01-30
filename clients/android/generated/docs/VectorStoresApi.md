# VectorStoresApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelVectorStoreFileBatch**](VectorStoresApi.md#cancelVectorStoreFileBatch) | **POST** /vector_stores/{vector_store_id}/file_batches/{batch_id}/cancel | Cancel a vector store file batch. This attempts to cancel the processing of files in this batch as soon as possible.
[**createVectorStore**](VectorStoresApi.md#createVectorStore) | **POST** /vector_stores | Create a vector store.
[**createVectorStoreFile**](VectorStoresApi.md#createVectorStoreFile) | **POST** /vector_stores/{vector_store_id}/files | Create a vector store file by attaching a [File](/docs/api-reference/files) to a [vector store](/docs/api-reference/vector-stores/object).
[**createVectorStoreFileBatch**](VectorStoresApi.md#createVectorStoreFileBatch) | **POST** /vector_stores/{vector_store_id}/file_batches | Create a vector store file batch.
[**deleteVectorStore**](VectorStoresApi.md#deleteVectorStore) | **DELETE** /vector_stores/{vector_store_id} | Delete a vector store.
[**deleteVectorStoreFile**](VectorStoresApi.md#deleteVectorStoreFile) | **DELETE** /vector_stores/{vector_store_id}/files/{file_id} | Delete a vector store file. This will remove the file from the vector store but the file itself will not be deleted. To delete the file, use the [delete file](/docs/api-reference/files/delete) endpoint.
[**getVectorStore**](VectorStoresApi.md#getVectorStore) | **GET** /vector_stores/{vector_store_id} | Retrieves a vector store.
[**getVectorStoreFile**](VectorStoresApi.md#getVectorStoreFile) | **GET** /vector_stores/{vector_store_id}/files/{file_id} | Retrieves a vector store file.
[**getVectorStoreFileBatch**](VectorStoresApi.md#getVectorStoreFileBatch) | **GET** /vector_stores/{vector_store_id}/file_batches/{batch_id} | Retrieves a vector store file batch.
[**listFilesInVectorStoreBatch**](VectorStoresApi.md#listFilesInVectorStoreBatch) | **GET** /vector_stores/{vector_store_id}/file_batches/{batch_id}/files | Returns a list of vector store files in a batch.
[**listVectorStoreFiles**](VectorStoresApi.md#listVectorStoreFiles) | **GET** /vector_stores/{vector_store_id}/files | Returns a list of vector store files.
[**listVectorStores**](VectorStoresApi.md#listVectorStores) | **GET** /vector_stores | Returns a list of vector stores.
[**modifyVectorStore**](VectorStoresApi.md#modifyVectorStore) | **POST** /vector_stores/{vector_store_id} | Modifies a vector store.



## cancelVectorStoreFileBatch

> VectorStoreFileBatchObject cancelVectorStoreFileBatch(vectorStoreId, batchId)

Cancel a vector store file batch. This attempts to cancel the processing of files in this batch as soon as possible.

### Example

```java
// Import classes:
//import org.openapitools.client.api.VectorStoresApi;

VectorStoresApi apiInstance = new VectorStoresApi();
String vectorStoreId = null; // String | The ID of the vector store that the file batch belongs to.
String batchId = null; // String | The ID of the file batch to cancel.
try {
    VectorStoreFileBatchObject result = apiInstance.cancelVectorStoreFileBatch(vectorStoreId, batchId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VectorStoresApi#cancelVectorStoreFileBatch");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vectorStoreId** | **String**| The ID of the vector store that the file batch belongs to. | [default to null]
 **batchId** | **String**| The ID of the file batch to cancel. | [default to null]

### Return type

[**VectorStoreFileBatchObject**](VectorStoreFileBatchObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## createVectorStore

> VectorStoreObject createVectorStore(createVectorStoreRequest)

Create a vector store.

### Example

```java
// Import classes:
//import org.openapitools.client.api.VectorStoresApi;

VectorStoresApi apiInstance = new VectorStoresApi();
CreateVectorStoreRequest createVectorStoreRequest = new CreateVectorStoreRequest(); // CreateVectorStoreRequest | 
try {
    VectorStoreObject result = apiInstance.createVectorStore(createVectorStoreRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VectorStoresApi#createVectorStore");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createVectorStoreRequest** | [**CreateVectorStoreRequest**](CreateVectorStoreRequest.md)|  |

### Return type

[**VectorStoreObject**](VectorStoreObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## createVectorStoreFile

> VectorStoreFileObject createVectorStoreFile(vectorStoreId, createVectorStoreFileRequest)

Create a vector store file by attaching a [File](/docs/api-reference/files) to a [vector store](/docs/api-reference/vector-stores/object).

### Example

```java
// Import classes:
//import org.openapitools.client.api.VectorStoresApi;

VectorStoresApi apiInstance = new VectorStoresApi();
String vectorStoreId = vs_abc123; // String | The ID of the vector store for which to create a File. 
CreateVectorStoreFileRequest createVectorStoreFileRequest = new CreateVectorStoreFileRequest(); // CreateVectorStoreFileRequest | 
try {
    VectorStoreFileObject result = apiInstance.createVectorStoreFile(vectorStoreId, createVectorStoreFileRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VectorStoresApi#createVectorStoreFile");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vectorStoreId** | **String**| The ID of the vector store for which to create a File.  | [default to null]
 **createVectorStoreFileRequest** | [**CreateVectorStoreFileRequest**](CreateVectorStoreFileRequest.md)|  |

### Return type

[**VectorStoreFileObject**](VectorStoreFileObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## createVectorStoreFileBatch

> VectorStoreFileBatchObject createVectorStoreFileBatch(vectorStoreId, createVectorStoreFileBatchRequest)

Create a vector store file batch.

### Example

```java
// Import classes:
//import org.openapitools.client.api.VectorStoresApi;

VectorStoresApi apiInstance = new VectorStoresApi();
String vectorStoreId = vs_abc123; // String | The ID of the vector store for which to create a File Batch. 
CreateVectorStoreFileBatchRequest createVectorStoreFileBatchRequest = new CreateVectorStoreFileBatchRequest(); // CreateVectorStoreFileBatchRequest | 
try {
    VectorStoreFileBatchObject result = apiInstance.createVectorStoreFileBatch(vectorStoreId, createVectorStoreFileBatchRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VectorStoresApi#createVectorStoreFileBatch");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vectorStoreId** | **String**| The ID of the vector store for which to create a File Batch.  | [default to null]
 **createVectorStoreFileBatchRequest** | [**CreateVectorStoreFileBatchRequest**](CreateVectorStoreFileBatchRequest.md)|  |

### Return type

[**VectorStoreFileBatchObject**](VectorStoreFileBatchObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## deleteVectorStore

> DeleteVectorStoreResponse deleteVectorStore(vectorStoreId)

Delete a vector store.

### Example

```java
// Import classes:
//import org.openapitools.client.api.VectorStoresApi;

VectorStoresApi apiInstance = new VectorStoresApi();
String vectorStoreId = null; // String | The ID of the vector store to delete.
try {
    DeleteVectorStoreResponse result = apiInstance.deleteVectorStore(vectorStoreId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VectorStoresApi#deleteVectorStore");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vectorStoreId** | **String**| The ID of the vector store to delete. | [default to null]

### Return type

[**DeleteVectorStoreResponse**](DeleteVectorStoreResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## deleteVectorStoreFile

> DeleteVectorStoreFileResponse deleteVectorStoreFile(vectorStoreId, fileId)

Delete a vector store file. This will remove the file from the vector store but the file itself will not be deleted. To delete the file, use the [delete file](/docs/api-reference/files/delete) endpoint.

### Example

```java
// Import classes:
//import org.openapitools.client.api.VectorStoresApi;

VectorStoresApi apiInstance = new VectorStoresApi();
String vectorStoreId = null; // String | The ID of the vector store that the file belongs to.
String fileId = null; // String | The ID of the file to delete.
try {
    DeleteVectorStoreFileResponse result = apiInstance.deleteVectorStoreFile(vectorStoreId, fileId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VectorStoresApi#deleteVectorStoreFile");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vectorStoreId** | **String**| The ID of the vector store that the file belongs to. | [default to null]
 **fileId** | **String**| The ID of the file to delete. | [default to null]

### Return type

[**DeleteVectorStoreFileResponse**](DeleteVectorStoreFileResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getVectorStore

> VectorStoreObject getVectorStore(vectorStoreId)

Retrieves a vector store.

### Example

```java
// Import classes:
//import org.openapitools.client.api.VectorStoresApi;

VectorStoresApi apiInstance = new VectorStoresApi();
String vectorStoreId = null; // String | The ID of the vector store to retrieve.
try {
    VectorStoreObject result = apiInstance.getVectorStore(vectorStoreId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VectorStoresApi#getVectorStore");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vectorStoreId** | **String**| The ID of the vector store to retrieve. | [default to null]

### Return type

[**VectorStoreObject**](VectorStoreObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getVectorStoreFile

> VectorStoreFileObject getVectorStoreFile(vectorStoreId, fileId)

Retrieves a vector store file.

### Example

```java
// Import classes:
//import org.openapitools.client.api.VectorStoresApi;

VectorStoresApi apiInstance = new VectorStoresApi();
String vectorStoreId = vs_abc123; // String | The ID of the vector store that the file belongs to.
String fileId = file-abc123; // String | The ID of the file being retrieved.
try {
    VectorStoreFileObject result = apiInstance.getVectorStoreFile(vectorStoreId, fileId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VectorStoresApi#getVectorStoreFile");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vectorStoreId** | **String**| The ID of the vector store that the file belongs to. | [default to null]
 **fileId** | **String**| The ID of the file being retrieved. | [default to null]

### Return type

[**VectorStoreFileObject**](VectorStoreFileObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getVectorStoreFileBatch

> VectorStoreFileBatchObject getVectorStoreFileBatch(vectorStoreId, batchId)

Retrieves a vector store file batch.

### Example

```java
// Import classes:
//import org.openapitools.client.api.VectorStoresApi;

VectorStoresApi apiInstance = new VectorStoresApi();
String vectorStoreId = vs_abc123; // String | The ID of the vector store that the file batch belongs to.
String batchId = vsfb_abc123; // String | The ID of the file batch being retrieved.
try {
    VectorStoreFileBatchObject result = apiInstance.getVectorStoreFileBatch(vectorStoreId, batchId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VectorStoresApi#getVectorStoreFileBatch");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vectorStoreId** | **String**| The ID of the vector store that the file batch belongs to. | [default to null]
 **batchId** | **String**| The ID of the file batch being retrieved. | [default to null]

### Return type

[**VectorStoreFileBatchObject**](VectorStoreFileBatchObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## listFilesInVectorStoreBatch

> ListVectorStoreFilesResponse listFilesInVectorStoreBatch(vectorStoreId, batchId, limit, order, after, before, filter)

Returns a list of vector store files in a batch.

### Example

```java
// Import classes:
//import org.openapitools.client.api.VectorStoresApi;

VectorStoresApi apiInstance = new VectorStoresApi();
String vectorStoreId = null; // String | The ID of the vector store that the files belong to.
String batchId = null; // String | The ID of the file batch that the files belong to.
Integer limit = 20; // Integer | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
String order = desc; // String | Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order. 
String after = null; // String | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
String before = null; // String | A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. 
String filter = null; // String | Filter by file status. One of `in_progress`, `completed`, `failed`, `cancelled`.
try {
    ListVectorStoreFilesResponse result = apiInstance.listFilesInVectorStoreBatch(vectorStoreId, batchId, limit, order, after, before, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VectorStoresApi#listFilesInVectorStoreBatch");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vectorStoreId** | **String**| The ID of the vector store that the files belong to. | [default to null]
 **batchId** | **String**| The ID of the file batch that the files belong to. | [default to null]
 **limit** | **Integer**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20]
 **order** | **String**| Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  | [optional] [default to desc] [enum: asc, desc]
 **after** | **String**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] [default to null]
 **before** | **String**| A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [optional] [default to null]
 **filter** | **String**| Filter by file status. One of &#x60;in_progress&#x60;, &#x60;completed&#x60;, &#x60;failed&#x60;, &#x60;cancelled&#x60;. | [optional] [default to null] [enum: in_progress, completed, failed, cancelled]

### Return type

[**ListVectorStoreFilesResponse**](ListVectorStoreFilesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## listVectorStoreFiles

> ListVectorStoreFilesResponse listVectorStoreFiles(vectorStoreId, limit, order, after, before, filter)

Returns a list of vector store files.

### Example

```java
// Import classes:
//import org.openapitools.client.api.VectorStoresApi;

VectorStoresApi apiInstance = new VectorStoresApi();
String vectorStoreId = null; // String | The ID of the vector store that the files belong to.
Integer limit = 20; // Integer | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
String order = desc; // String | Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order. 
String after = null; // String | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
String before = null; // String | A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. 
String filter = null; // String | Filter by file status. One of `in_progress`, `completed`, `failed`, `cancelled`.
try {
    ListVectorStoreFilesResponse result = apiInstance.listVectorStoreFiles(vectorStoreId, limit, order, after, before, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VectorStoresApi#listVectorStoreFiles");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vectorStoreId** | **String**| The ID of the vector store that the files belong to. | [default to null]
 **limit** | **Integer**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20]
 **order** | **String**| Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  | [optional] [default to desc] [enum: asc, desc]
 **after** | **String**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] [default to null]
 **before** | **String**| A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [optional] [default to null]
 **filter** | **String**| Filter by file status. One of &#x60;in_progress&#x60;, &#x60;completed&#x60;, &#x60;failed&#x60;, &#x60;cancelled&#x60;. | [optional] [default to null] [enum: in_progress, completed, failed, cancelled]

### Return type

[**ListVectorStoreFilesResponse**](ListVectorStoreFilesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## listVectorStores

> ListVectorStoresResponse listVectorStores(limit, order, after, before)

Returns a list of vector stores.

### Example

```java
// Import classes:
//import org.openapitools.client.api.VectorStoresApi;

VectorStoresApi apiInstance = new VectorStoresApi();
Integer limit = 20; // Integer | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
String order = desc; // String | Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order. 
String after = null; // String | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
String before = null; // String | A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. 
try {
    ListVectorStoresResponse result = apiInstance.listVectorStores(limit, order, after, before);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VectorStoresApi#listVectorStores");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20]
 **order** | **String**| Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  | [optional] [default to desc] [enum: asc, desc]
 **after** | **String**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] [default to null]
 **before** | **String**| A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [optional] [default to null]

### Return type

[**ListVectorStoresResponse**](ListVectorStoresResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## modifyVectorStore

> VectorStoreObject modifyVectorStore(vectorStoreId, updateVectorStoreRequest)

Modifies a vector store.

### Example

```java
// Import classes:
//import org.openapitools.client.api.VectorStoresApi;

VectorStoresApi apiInstance = new VectorStoresApi();
String vectorStoreId = null; // String | The ID of the vector store to modify.
UpdateVectorStoreRequest updateVectorStoreRequest = new UpdateVectorStoreRequest(); // UpdateVectorStoreRequest | 
try {
    VectorStoreObject result = apiInstance.modifyVectorStore(vectorStoreId, updateVectorStoreRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VectorStoresApi#modifyVectorStore");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vectorStoreId** | **String**| The ID of the vector store to modify. | [default to null]
 **updateVectorStoreRequest** | [**UpdateVectorStoreRequest**](UpdateVectorStoreRequest.md)|  |

### Return type

[**VectorStoreObject**](VectorStoreObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

