# vector_stores_api

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
**createVectorStore**](vector_stores_api.md#createVectorStore) | **POST** /vector_stores | Create a vector store.
**listVectorStores**](vector_stores_api.md#listVectorStores) | **GET** /vector_stores | Returns a list of vector stores.
**createVectorStoreFile**](vector_stores_api.md#createVectorStoreFile) | **POST** /vector_stores/{vector_store_id}/files | Create a vector store file by attaching a [File](/docs/api-reference/files) to a [vector store](/docs/api-reference/vector-stores/object).
**createVectorStoreFileBatch**](vector_stores_api.md#createVectorStoreFileBatch) | **POST** /vector_stores/{vector_store_id}/file_batches | Create a vector store file batch.
**deleteVectorStore**](vector_stores_api.md#deleteVectorStore) | **DELETE** /vector_stores/{vector_store_id} | Delete a vector store.
**getVectorStore**](vector_stores_api.md#getVectorStore) | **GET** /vector_stores/{vector_store_id} | Retrieves a vector store.
**listVectorStoreFiles**](vector_stores_api.md#listVectorStoreFiles) | **GET** /vector_stores/{vector_store_id}/files | Returns a list of vector store files.
**modifyVectorStore**](vector_stores_api.md#modifyVectorStore) | **POST** /vector_stores/{vector_store_id} | Modifies a vector store.
**cancelVectorStoreFileBatch**](vector_stores_api.md#cancelVectorStoreFileBatch) | **POST** /vector_stores/{vector_store_id}/file_batches/{batch_id}/cancel | Cancel a vector store file batch. This attempts to cancel the processing of files in this batch as soon as possible.
**deleteVectorStoreFile**](vector_stores_api.md#deleteVectorStoreFile) | **DELETE** /vector_stores/{vector_store_id}/files/{file_id} | Delete a vector store file. This will remove the file from the vector store but the file itself will not be deleted. To delete the file, use the [delete file](/docs/api-reference/files/delete) endpoint.
**getVectorStoreFile**](vector_stores_api.md#getVectorStoreFile) | **GET** /vector_stores/{vector_store_id}/files/{file_id} | Retrieves a vector store file.
**getVectorStoreFileBatch**](vector_stores_api.md#getVectorStoreFileBatch) | **GET** /vector_stores/{vector_store_id}/file_batches/{batch_id} | Retrieves a vector store file batch.
**listFilesInVectorStoreBatch**](vector_stores_api.md#listFilesInVectorStoreBatch) | **GET** /vector_stores/{vector_store_id}/file_batches/{batch_id}/files | Returns a list of vector store files in a batch.


# **createVectorStore**
> models::VectorStoreObject createVectorStore(ctx, create_vector_store_request)
Create a vector store.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **create_vector_store_request** | [**CreateVectorStoreRequest**](CreateVectorStoreRequest.md)|  | 

### Return type

[**models::VectorStoreObject**](VectorStoreObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **listVectorStores**
> models::ListVectorStoresResponse listVectorStores(ctx, optional)
Returns a list of vector stores.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **i32**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [default to 20]
 **order** | [****](.md)| Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order.  | 
 **after** | **String**| A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  | 
 **before** | **String**| A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list.  | 

### Return type

[**models::ListVectorStoresResponse**](ListVectorStoresResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **createVectorStoreFile**
> models::VectorStoreFileObject createVectorStoreFile(ctx, vector_store_id, create_vector_store_file_request)
Create a vector store file by attaching a [File](/docs/api-reference/files) to a [vector store](/docs/api-reference/vector-stores/object).

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **vector_store_id** | **String**| The ID of the vector store for which to create a File.  | 
  **create_vector_store_file_request** | [**CreateVectorStoreFileRequest**](CreateVectorStoreFileRequest.md)|  | 

### Return type

[**models::VectorStoreFileObject**](VectorStoreFileObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **createVectorStoreFileBatch**
> models::VectorStoreFileBatchObject createVectorStoreFileBatch(ctx, vector_store_id, create_vector_store_file_batch_request)
Create a vector store file batch.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **vector_store_id** | **String**| The ID of the vector store for which to create a File Batch.  | 
  **create_vector_store_file_batch_request** | [**CreateVectorStoreFileBatchRequest**](CreateVectorStoreFileBatchRequest.md)|  | 

### Return type

[**models::VectorStoreFileBatchObject**](VectorStoreFileBatchObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **deleteVectorStore**
> models::DeleteVectorStoreResponse deleteVectorStore(ctx, vector_store_id)
Delete a vector store.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **vector_store_id** | **String**| The ID of the vector store to delete. | 

### Return type

[**models::DeleteVectorStoreResponse**](DeleteVectorStoreResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getVectorStore**
> models::VectorStoreObject getVectorStore(ctx, vector_store_id)
Retrieves a vector store.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **vector_store_id** | **String**| The ID of the vector store to retrieve. | 

### Return type

[**models::VectorStoreObject**](VectorStoreObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **listVectorStoreFiles**
> models::ListVectorStoreFilesResponse listVectorStoreFiles(ctx, vector_store_id, optional)
Returns a list of vector store files.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **vector_store_id** | **String**| The ID of the vector store that the files belong to. | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vector_store_id** | **String**| The ID of the vector store that the files belong to. | 
 **limit** | **i32**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [default to 20]
 **order** | [****](.md)| Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order.  | 
 **after** | **String**| A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  | 
 **before** | **String**| A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list.  | 
 **filter** | [****](.md)| Filter by file status. One of `in_progress`, `completed`, `failed`, `cancelled`. | 

### Return type

[**models::ListVectorStoreFilesResponse**](ListVectorStoreFilesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **modifyVectorStore**
> models::VectorStoreObject modifyVectorStore(ctx, vector_store_id, update_vector_store_request)
Modifies a vector store.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **vector_store_id** | **String**| The ID of the vector store to modify. | 
  **update_vector_store_request** | [**UpdateVectorStoreRequest**](UpdateVectorStoreRequest.md)|  | 

### Return type

[**models::VectorStoreObject**](VectorStoreObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **cancelVectorStoreFileBatch**
> models::VectorStoreFileBatchObject cancelVectorStoreFileBatch(ctx, vector_store_id, batch_id)
Cancel a vector store file batch. This attempts to cancel the processing of files in this batch as soon as possible.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **vector_store_id** | **String**| The ID of the vector store that the file batch belongs to. | 
  **batch_id** | **String**| The ID of the file batch to cancel. | 

### Return type

[**models::VectorStoreFileBatchObject**](VectorStoreFileBatchObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **deleteVectorStoreFile**
> models::DeleteVectorStoreFileResponse deleteVectorStoreFile(ctx, vector_store_id, file_id)
Delete a vector store file. This will remove the file from the vector store but the file itself will not be deleted. To delete the file, use the [delete file](/docs/api-reference/files/delete) endpoint.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **vector_store_id** | **String**| The ID of the vector store that the file belongs to. | 
  **file_id** | **String**| The ID of the file to delete. | 

### Return type

[**models::DeleteVectorStoreFileResponse**](DeleteVectorStoreFileResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getVectorStoreFile**
> models::VectorStoreFileObject getVectorStoreFile(ctx, vector_store_id, file_id)
Retrieves a vector store file.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **vector_store_id** | **String**| The ID of the vector store that the file belongs to. | 
  **file_id** | **String**| The ID of the file being retrieved. | 

### Return type

[**models::VectorStoreFileObject**](VectorStoreFileObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getVectorStoreFileBatch**
> models::VectorStoreFileBatchObject getVectorStoreFileBatch(ctx, vector_store_id, batch_id)
Retrieves a vector store file batch.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **vector_store_id** | **String**| The ID of the vector store that the file batch belongs to. | 
  **batch_id** | **String**| The ID of the file batch being retrieved. | 

### Return type

[**models::VectorStoreFileBatchObject**](VectorStoreFileBatchObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **listFilesInVectorStoreBatch**
> models::ListVectorStoreFilesResponse listFilesInVectorStoreBatch(ctx, vector_store_id, batch_id, optional)
Returns a list of vector store files in a batch.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **vector_store_id** | **String**| The ID of the vector store that the files belong to. | 
  **batch_id** | **String**| The ID of the file batch that the files belong to. | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vector_store_id** | **String**| The ID of the vector store that the files belong to. | 
 **batch_id** | **String**| The ID of the file batch that the files belong to. | 
 **limit** | **i32**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [default to 20]
 **order** | [****](.md)| Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order.  | 
 **after** | **String**| A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  | 
 **before** | **String**| A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list.  | 
 **filter** | [****](.md)| Filter by file status. One of `in_progress`, `completed`, `failed`, `cancelled`. | 

### Return type

[**models::ListVectorStoreFilesResponse**](ListVectorStoreFilesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

