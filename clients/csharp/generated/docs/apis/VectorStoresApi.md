# Org.OpenAPITools.Api.VectorStoresApi

All URIs are relative to *https://api.openai.com/v1*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**CancelVectorStoreFileBatch**](VectorStoresApi.md#cancelvectorstorefilebatch) | **POST** /vector_stores/{vector_store_id}/file_batches/{batch_id}/cancel | Cancel a vector store file batch. This attempts to cancel the processing of files in this batch as soon as possible. |
| [**CreateVectorStore**](VectorStoresApi.md#createvectorstore) | **POST** /vector_stores | Create a vector store. |
| [**CreateVectorStoreFile**](VectorStoresApi.md#createvectorstorefile) | **POST** /vector_stores/{vector_store_id}/files | Create a vector store file by attaching a [File](/docs/api-reference/files) to a [vector store](/docs/api-reference/vector-stores/object). |
| [**CreateVectorStoreFileBatch**](VectorStoresApi.md#createvectorstorefilebatch) | **POST** /vector_stores/{vector_store_id}/file_batches | Create a vector store file batch. |
| [**DeleteVectorStore**](VectorStoresApi.md#deletevectorstore) | **DELETE** /vector_stores/{vector_store_id} | Delete a vector store. |
| [**DeleteVectorStoreFile**](VectorStoresApi.md#deletevectorstorefile) | **DELETE** /vector_stores/{vector_store_id}/files/{file_id} | Delete a vector store file. This will remove the file from the vector store but the file itself will not be deleted. To delete the file, use the [delete file](/docs/api-reference/files/delete) endpoint. |
| [**GetVectorStore**](VectorStoresApi.md#getvectorstore) | **GET** /vector_stores/{vector_store_id} | Retrieves a vector store. |
| [**GetVectorStoreFile**](VectorStoresApi.md#getvectorstorefile) | **GET** /vector_stores/{vector_store_id}/files/{file_id} | Retrieves a vector store file. |
| [**GetVectorStoreFileBatch**](VectorStoresApi.md#getvectorstorefilebatch) | **GET** /vector_stores/{vector_store_id}/file_batches/{batch_id} | Retrieves a vector store file batch. |
| [**ListFilesInVectorStoreBatch**](VectorStoresApi.md#listfilesinvectorstorebatch) | **GET** /vector_stores/{vector_store_id}/file_batches/{batch_id}/files | Returns a list of vector store files in a batch. |
| [**ListVectorStoreFiles**](VectorStoresApi.md#listvectorstorefiles) | **GET** /vector_stores/{vector_store_id}/files | Returns a list of vector store files. |
| [**ListVectorStores**](VectorStoresApi.md#listvectorstores) | **GET** /vector_stores | Returns a list of vector stores. |
| [**ModifyVectorStore**](VectorStoresApi.md#modifyvectorstore) | **POST** /vector_stores/{vector_store_id} | Modifies a vector store. |

<a id="cancelvectorstorefilebatch"></a>
# **CancelVectorStoreFileBatch**
> VectorStoreFileBatchObject CancelVectorStoreFileBatch (string vectorStoreId, string batchId)

Cancel a vector store file batch. This attempts to cancel the processing of files in this batch as soon as possible.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **vectorStoreId** | **string** | The ID of the vector store that the file batch belongs to. |  |
| **batchId** | **string** | The ID of the file batch to cancel. |  |

### Return type

[**VectorStoreFileBatchObject**](VectorStoreFileBatchObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="createvectorstore"></a>
# **CreateVectorStore**
> VectorStoreObject CreateVectorStore (CreateVectorStoreRequest createVectorStoreRequest)

Create a vector store.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **createVectorStoreRequest** | [**CreateVectorStoreRequest**](CreateVectorStoreRequest.md) |  |  |

### Return type

[**VectorStoreObject**](VectorStoreObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="createvectorstorefile"></a>
# **CreateVectorStoreFile**
> VectorStoreFileObject CreateVectorStoreFile (string vectorStoreId, CreateVectorStoreFileRequest createVectorStoreFileRequest)

Create a vector store file by attaching a [File](/docs/api-reference/files) to a [vector store](/docs/api-reference/vector-stores/object).


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **vectorStoreId** | **string** | The ID of the vector store for which to create a File.  |  |
| **createVectorStoreFileRequest** | [**CreateVectorStoreFileRequest**](CreateVectorStoreFileRequest.md) |  |  |

### Return type

[**VectorStoreFileObject**](VectorStoreFileObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="createvectorstorefilebatch"></a>
# **CreateVectorStoreFileBatch**
> VectorStoreFileBatchObject CreateVectorStoreFileBatch (string vectorStoreId, CreateVectorStoreFileBatchRequest createVectorStoreFileBatchRequest)

Create a vector store file batch.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **vectorStoreId** | **string** | The ID of the vector store for which to create a File Batch.  |  |
| **createVectorStoreFileBatchRequest** | [**CreateVectorStoreFileBatchRequest**](CreateVectorStoreFileBatchRequest.md) |  |  |

### Return type

[**VectorStoreFileBatchObject**](VectorStoreFileBatchObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="deletevectorstore"></a>
# **DeleteVectorStore**
> DeleteVectorStoreResponse DeleteVectorStore (string vectorStoreId)

Delete a vector store.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **vectorStoreId** | **string** | The ID of the vector store to delete. |  |

### Return type

[**DeleteVectorStoreResponse**](DeleteVectorStoreResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="deletevectorstorefile"></a>
# **DeleteVectorStoreFile**
> DeleteVectorStoreFileResponse DeleteVectorStoreFile (string vectorStoreId, string fileId)

Delete a vector store file. This will remove the file from the vector store but the file itself will not be deleted. To delete the file, use the [delete file](/docs/api-reference/files/delete) endpoint.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **vectorStoreId** | **string** | The ID of the vector store that the file belongs to. |  |
| **fileId** | **string** | The ID of the file to delete. |  |

### Return type

[**DeleteVectorStoreFileResponse**](DeleteVectorStoreFileResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="getvectorstore"></a>
# **GetVectorStore**
> VectorStoreObject GetVectorStore (string vectorStoreId)

Retrieves a vector store.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **vectorStoreId** | **string** | The ID of the vector store to retrieve. |  |

### Return type

[**VectorStoreObject**](VectorStoreObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="getvectorstorefile"></a>
# **GetVectorStoreFile**
> VectorStoreFileObject GetVectorStoreFile (string vectorStoreId, string fileId)

Retrieves a vector store file.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **vectorStoreId** | **string** | The ID of the vector store that the file belongs to. |  |
| **fileId** | **string** | The ID of the file being retrieved. |  |

### Return type

[**VectorStoreFileObject**](VectorStoreFileObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="getvectorstorefilebatch"></a>
# **GetVectorStoreFileBatch**
> VectorStoreFileBatchObject GetVectorStoreFileBatch (string vectorStoreId, string batchId)

Retrieves a vector store file batch.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **vectorStoreId** | **string** | The ID of the vector store that the file batch belongs to. |  |
| **batchId** | **string** | The ID of the file batch being retrieved. |  |

### Return type

[**VectorStoreFileBatchObject**](VectorStoreFileBatchObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="listfilesinvectorstorebatch"></a>
# **ListFilesInVectorStoreBatch**
> ListVectorStoreFilesResponse ListFilesInVectorStoreBatch (string vectorStoreId, string batchId, int limit = null, string order = null, string after = null, string before = null, string filter = null)

Returns a list of vector store files in a batch.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **vectorStoreId** | **string** | The ID of the vector store that the files belong to. |  |
| **batchId** | **string** | The ID of the file batch that the files belong to. |  |
| **limit** | **int** | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20] |
| **order** | **string** | Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  | [optional] [default to desc] |
| **after** | **string** | A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional]  |
| **before** | **string** | A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [optional]  |
| **filter** | **string** | Filter by file status. One of &#x60;in_progress&#x60;, &#x60;completed&#x60;, &#x60;failed&#x60;, &#x60;cancelled&#x60;. | [optional]  |

### Return type

[**ListVectorStoreFilesResponse**](ListVectorStoreFilesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="listvectorstorefiles"></a>
# **ListVectorStoreFiles**
> ListVectorStoreFilesResponse ListVectorStoreFiles (string vectorStoreId, int limit = null, string order = null, string after = null, string before = null, string filter = null)

Returns a list of vector store files.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **vectorStoreId** | **string** | The ID of the vector store that the files belong to. |  |
| **limit** | **int** | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20] |
| **order** | **string** | Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  | [optional] [default to desc] |
| **after** | **string** | A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional]  |
| **before** | **string** | A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [optional]  |
| **filter** | **string** | Filter by file status. One of &#x60;in_progress&#x60;, &#x60;completed&#x60;, &#x60;failed&#x60;, &#x60;cancelled&#x60;. | [optional]  |

### Return type

[**ListVectorStoreFilesResponse**](ListVectorStoreFilesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="listvectorstores"></a>
# **ListVectorStores**
> ListVectorStoresResponse ListVectorStores (int limit = null, string order = null, string after = null, string before = null)

Returns a list of vector stores.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **limit** | **int** | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20] |
| **order** | **string** | Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  | [optional] [default to desc] |
| **after** | **string** | A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional]  |
| **before** | **string** | A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [optional]  |

### Return type

[**ListVectorStoresResponse**](ListVectorStoresResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="modifyvectorstore"></a>
# **ModifyVectorStore**
> VectorStoreObject ModifyVectorStore (string vectorStoreId, UpdateVectorStoreRequest updateVectorStoreRequest)

Modifies a vector store.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **vectorStoreId** | **string** | The ID of the vector store to modify. |  |
| **updateVectorStoreRequest** | [**UpdateVectorStoreRequest**](UpdateVectorStoreRequest.md) |  |  |

### Return type

[**VectorStoreObject**](VectorStoreObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

