# VectorStoresApi

All URIs are relative to *https://api.openai.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
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


<a name="cancelVectorStoreFileBatch"></a>
# **cancelVectorStoreFileBatch**
> VectorStoreFileBatchObject cancelVectorStoreFileBatch(vector\_store\_id, batch\_id)

Cancel a vector store file batch. This attempts to cancel the processing of files in this batch as soon as possible.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **vector\_store\_id** | **String**| The ID of the vector store that the file batch belongs to. | [default to null] |
| **batch\_id** | **String**| The ID of the file batch to cancel. | [default to null] |

### Return type

[**VectorStoreFileBatchObject**](../Models/VectorStoreFileBatchObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="createVectorStore"></a>
# **createVectorStore**
> VectorStoreObject createVectorStore(CreateVectorStoreRequest)

Create a vector store.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **CreateVectorStoreRequest** | [**CreateVectorStoreRequest**](../Models/CreateVectorStoreRequest.md)|  | |

### Return type

[**VectorStoreObject**](../Models/VectorStoreObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="createVectorStoreFile"></a>
# **createVectorStoreFile**
> VectorStoreFileObject createVectorStoreFile(vector\_store\_id, CreateVectorStoreFileRequest)

Create a vector store file by attaching a [File](/docs/api-reference/files) to a [vector store](/docs/api-reference/vector-stores/object).

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **vector\_store\_id** | **String**| The ID of the vector store for which to create a File.  | [default to null] |
| **CreateVectorStoreFileRequest** | [**CreateVectorStoreFileRequest**](../Models/CreateVectorStoreFileRequest.md)|  | |

### Return type

[**VectorStoreFileObject**](../Models/VectorStoreFileObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="createVectorStoreFileBatch"></a>
# **createVectorStoreFileBatch**
> VectorStoreFileBatchObject createVectorStoreFileBatch(vector\_store\_id, CreateVectorStoreFileBatchRequest)

Create a vector store file batch.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **vector\_store\_id** | **String**| The ID of the vector store for which to create a File Batch.  | [default to null] |
| **CreateVectorStoreFileBatchRequest** | [**CreateVectorStoreFileBatchRequest**](../Models/CreateVectorStoreFileBatchRequest.md)|  | |

### Return type

[**VectorStoreFileBatchObject**](../Models/VectorStoreFileBatchObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="deleteVectorStore"></a>
# **deleteVectorStore**
> DeleteVectorStoreResponse deleteVectorStore(vector\_store\_id)

Delete a vector store.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **vector\_store\_id** | **String**| The ID of the vector store to delete. | [default to null] |

### Return type

[**DeleteVectorStoreResponse**](../Models/DeleteVectorStoreResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="deleteVectorStoreFile"></a>
# **deleteVectorStoreFile**
> DeleteVectorStoreFileResponse deleteVectorStoreFile(vector\_store\_id, file\_id)

Delete a vector store file. This will remove the file from the vector store but the file itself will not be deleted. To delete the file, use the [delete file](/docs/api-reference/files/delete) endpoint.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **vector\_store\_id** | **String**| The ID of the vector store that the file belongs to. | [default to null] |
| **file\_id** | **String**| The ID of the file to delete. | [default to null] |

### Return type

[**DeleteVectorStoreFileResponse**](../Models/DeleteVectorStoreFileResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getVectorStore"></a>
# **getVectorStore**
> VectorStoreObject getVectorStore(vector\_store\_id)

Retrieves a vector store.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **vector\_store\_id** | **String**| The ID of the vector store to retrieve. | [default to null] |

### Return type

[**VectorStoreObject**](../Models/VectorStoreObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getVectorStoreFile"></a>
# **getVectorStoreFile**
> VectorStoreFileObject getVectorStoreFile(vector\_store\_id, file\_id)

Retrieves a vector store file.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **vector\_store\_id** | **String**| The ID of the vector store that the file belongs to. | [default to null] |
| **file\_id** | **String**| The ID of the file being retrieved. | [default to null] |

### Return type

[**VectorStoreFileObject**](../Models/VectorStoreFileObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getVectorStoreFileBatch"></a>
# **getVectorStoreFileBatch**
> VectorStoreFileBatchObject getVectorStoreFileBatch(vector\_store\_id, batch\_id)

Retrieves a vector store file batch.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **vector\_store\_id** | **String**| The ID of the vector store that the file batch belongs to. | [default to null] |
| **batch\_id** | **String**| The ID of the file batch being retrieved. | [default to null] |

### Return type

[**VectorStoreFileBatchObject**](../Models/VectorStoreFileBatchObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="listFilesInVectorStoreBatch"></a>
# **listFilesInVectorStoreBatch**
> ListVectorStoreFilesResponse listFilesInVectorStoreBatch(vector\_store\_id, batch\_id, limit, order, after, before, filter)

Returns a list of vector store files in a batch.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **vector\_store\_id** | **String**| The ID of the vector store that the files belong to. | [default to null] |
| **batch\_id** | **String**| The ID of the file batch that the files belong to. | [default to null] |
| **limit** | **Integer**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20] |
| **order** | **String**| Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  | [optional] [default to desc] [enum: asc, desc] |
| **after** | **String**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] [default to null] |
| **before** | **String**| A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [optional] [default to null] |
| **filter** | **String**| Filter by file status. One of &#x60;in_progress&#x60;, &#x60;completed&#x60;, &#x60;failed&#x60;, &#x60;cancelled&#x60;. | [optional] [default to null] [enum: in_progress, completed, failed, cancelled] |

### Return type

[**ListVectorStoreFilesResponse**](../Models/ListVectorStoreFilesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="listVectorStoreFiles"></a>
# **listVectorStoreFiles**
> ListVectorStoreFilesResponse listVectorStoreFiles(vector\_store\_id, limit, order, after, before, filter)

Returns a list of vector store files.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **vector\_store\_id** | **String**| The ID of the vector store that the files belong to. | [default to null] |
| **limit** | **Integer**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20] |
| **order** | **String**| Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  | [optional] [default to desc] [enum: asc, desc] |
| **after** | **String**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] [default to null] |
| **before** | **String**| A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [optional] [default to null] |
| **filter** | **String**| Filter by file status. One of &#x60;in_progress&#x60;, &#x60;completed&#x60;, &#x60;failed&#x60;, &#x60;cancelled&#x60;. | [optional] [default to null] [enum: in_progress, completed, failed, cancelled] |

### Return type

[**ListVectorStoreFilesResponse**](../Models/ListVectorStoreFilesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="listVectorStores"></a>
# **listVectorStores**
> ListVectorStoresResponse listVectorStores(limit, order, after, before)

Returns a list of vector stores.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **limit** | **Integer**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20] |
| **order** | **String**| Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  | [optional] [default to desc] [enum: asc, desc] |
| **after** | **String**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] [default to null] |
| **before** | **String**| A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [optional] [default to null] |

### Return type

[**ListVectorStoresResponse**](../Models/ListVectorStoresResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="modifyVectorStore"></a>
# **modifyVectorStore**
> VectorStoreObject modifyVectorStore(vector\_store\_id, UpdateVectorStoreRequest)

Modifies a vector store.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **vector\_store\_id** | **String**| The ID of the vector store to modify. | [default to null] |
| **UpdateVectorStoreRequest** | [**UpdateVectorStoreRequest**](../Models/UpdateVectorStoreRequest.md)|  | |

### Return type

[**VectorStoreObject**](../Models/VectorStoreObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

