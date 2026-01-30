# VectorStoresAPI

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**VectorStoresAPI_cancelVectorStoreFileBatch**](VectorStoresAPI.md#VectorStoresAPI_cancelVectorStoreFileBatch) | **POST** /vector_stores/{vector_store_id}/file_batches/{batch_id}/cancel | Cancel a vector store file batch. This attempts to cancel the processing of files in this batch as soon as possible.
[**VectorStoresAPI_createVectorStore**](VectorStoresAPI.md#VectorStoresAPI_createVectorStore) | **POST** /vector_stores | Create a vector store.
[**VectorStoresAPI_createVectorStoreFile**](VectorStoresAPI.md#VectorStoresAPI_createVectorStoreFile) | **POST** /vector_stores/{vector_store_id}/files | Create a vector store file by attaching a [File](/docs/api-reference/files) to a [vector store](/docs/api-reference/vector-stores/object).
[**VectorStoresAPI_createVectorStoreFileBatch**](VectorStoresAPI.md#VectorStoresAPI_createVectorStoreFileBatch) | **POST** /vector_stores/{vector_store_id}/file_batches | Create a vector store file batch.
[**VectorStoresAPI_deleteVectorStore**](VectorStoresAPI.md#VectorStoresAPI_deleteVectorStore) | **DELETE** /vector_stores/{vector_store_id} | Delete a vector store.
[**VectorStoresAPI_deleteVectorStoreFile**](VectorStoresAPI.md#VectorStoresAPI_deleteVectorStoreFile) | **DELETE** /vector_stores/{vector_store_id}/files/{file_id} | Delete a vector store file. This will remove the file from the vector store but the file itself will not be deleted. To delete the file, use the [delete file](/docs/api-reference/files/delete) endpoint.
[**VectorStoresAPI_getVectorStore**](VectorStoresAPI.md#VectorStoresAPI_getVectorStore) | **GET** /vector_stores/{vector_store_id} | Retrieves a vector store.
[**VectorStoresAPI_getVectorStoreFile**](VectorStoresAPI.md#VectorStoresAPI_getVectorStoreFile) | **GET** /vector_stores/{vector_store_id}/files/{file_id} | Retrieves a vector store file.
[**VectorStoresAPI_getVectorStoreFileBatch**](VectorStoresAPI.md#VectorStoresAPI_getVectorStoreFileBatch) | **GET** /vector_stores/{vector_store_id}/file_batches/{batch_id} | Retrieves a vector store file batch.
[**VectorStoresAPI_listFilesInVectorStoreBatch**](VectorStoresAPI.md#VectorStoresAPI_listFilesInVectorStoreBatch) | **GET** /vector_stores/{vector_store_id}/file_batches/{batch_id}/files | Returns a list of vector store files in a batch.
[**VectorStoresAPI_listVectorStoreFiles**](VectorStoresAPI.md#VectorStoresAPI_listVectorStoreFiles) | **GET** /vector_stores/{vector_store_id}/files | Returns a list of vector store files.
[**VectorStoresAPI_listVectorStores**](VectorStoresAPI.md#VectorStoresAPI_listVectorStores) | **GET** /vector_stores | Returns a list of vector stores.
[**VectorStoresAPI_modifyVectorStore**](VectorStoresAPI.md#VectorStoresAPI_modifyVectorStore) | **POST** /vector_stores/{vector_store_id} | Modifies a vector store.


# **VectorStoresAPI_cancelVectorStoreFileBatch**
```c
// Cancel a vector store file batch. This attempts to cancel the processing of files in this batch as soon as possible.
//
vector_store_file_batch_object_t* VectorStoresAPI_cancelVectorStoreFileBatch(apiClient_t *apiClient, char *vector_store_id, char *batch_id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**vector_store_id** | **char \*** | The ID of the vector store that the file batch belongs to. | 
**batch_id** | **char \*** | The ID of the file batch to cancel. | 

### Return type

[vector_store_file_batch_object_t](vector_store_file_batch_object.md) *


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **VectorStoresAPI_createVectorStore**
```c
// Create a vector store.
//
vector_store_object_t* VectorStoresAPI_createVectorStore(apiClient_t *apiClient, create_vector_store_request_t *create_vector_store_request);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**create_vector_store_request** | **[create_vector_store_request_t](create_vector_store_request.md) \*** |  | 

### Return type

[vector_store_object_t](vector_store_object.md) *


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **VectorStoresAPI_createVectorStoreFile**
```c
// Create a vector store file by attaching a [File](/docs/api-reference/files) to a [vector store](/docs/api-reference/vector-stores/object).
//
vector_store_file_object_t* VectorStoresAPI_createVectorStoreFile(apiClient_t *apiClient, char *vector_store_id, create_vector_store_file_request_t *create_vector_store_file_request);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**vector_store_id** | **char \*** | The ID of the vector store for which to create a File.  | 
**create_vector_store_file_request** | **[create_vector_store_file_request_t](create_vector_store_file_request.md) \*** |  | 

### Return type

[vector_store_file_object_t](vector_store_file_object.md) *


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **VectorStoresAPI_createVectorStoreFileBatch**
```c
// Create a vector store file batch.
//
vector_store_file_batch_object_t* VectorStoresAPI_createVectorStoreFileBatch(apiClient_t *apiClient, char *vector_store_id, create_vector_store_file_batch_request_t *create_vector_store_file_batch_request);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**vector_store_id** | **char \*** | The ID of the vector store for which to create a File Batch.  | 
**create_vector_store_file_batch_request** | **[create_vector_store_file_batch_request_t](create_vector_store_file_batch_request.md) \*** |  | 

### Return type

[vector_store_file_batch_object_t](vector_store_file_batch_object.md) *


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **VectorStoresAPI_deleteVectorStore**
```c
// Delete a vector store.
//
delete_vector_store_response_t* VectorStoresAPI_deleteVectorStore(apiClient_t *apiClient, char *vector_store_id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**vector_store_id** | **char \*** | The ID of the vector store to delete. | 

### Return type

[delete_vector_store_response_t](delete_vector_store_response.md) *


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **VectorStoresAPI_deleteVectorStoreFile**
```c
// Delete a vector store file. This will remove the file from the vector store but the file itself will not be deleted. To delete the file, use the [delete file](/docs/api-reference/files/delete) endpoint.
//
delete_vector_store_file_response_t* VectorStoresAPI_deleteVectorStoreFile(apiClient_t *apiClient, char *vector_store_id, char *file_id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**vector_store_id** | **char \*** | The ID of the vector store that the file belongs to. | 
**file_id** | **char \*** | The ID of the file to delete. | 

### Return type

[delete_vector_store_file_response_t](delete_vector_store_file_response.md) *


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **VectorStoresAPI_getVectorStore**
```c
// Retrieves a vector store.
//
vector_store_object_t* VectorStoresAPI_getVectorStore(apiClient_t *apiClient, char *vector_store_id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**vector_store_id** | **char \*** | The ID of the vector store to retrieve. | 

### Return type

[vector_store_object_t](vector_store_object.md) *


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **VectorStoresAPI_getVectorStoreFile**
```c
// Retrieves a vector store file.
//
vector_store_file_object_t* VectorStoresAPI_getVectorStoreFile(apiClient_t *apiClient, char *vector_store_id, char *file_id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**vector_store_id** | **char \*** | The ID of the vector store that the file belongs to. | 
**file_id** | **char \*** | The ID of the file being retrieved. | 

### Return type

[vector_store_file_object_t](vector_store_file_object.md) *


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **VectorStoresAPI_getVectorStoreFileBatch**
```c
// Retrieves a vector store file batch.
//
vector_store_file_batch_object_t* VectorStoresAPI_getVectorStoreFileBatch(apiClient_t *apiClient, char *vector_store_id, char *batch_id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**vector_store_id** | **char \*** | The ID of the vector store that the file batch belongs to. | 
**batch_id** | **char \*** | The ID of the file batch being retrieved. | 

### Return type

[vector_store_file_batch_object_t](vector_store_file_batch_object.md) *


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **VectorStoresAPI_listFilesInVectorStoreBatch**
```c
// Returns a list of vector store files in a batch.
//
list_vector_store_files_response_t* VectorStoresAPI_listFilesInVectorStoreBatch(apiClient_t *apiClient, char *vector_store_id, char *batch_id, int *limit, openai_api_listFilesInVectorStoreBatch_order_e order, char *after, char *before, openai_api_listFilesInVectorStoreBatch_filter_e filter);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**vector_store_id** | **char \*** | The ID of the vector store that the files belong to. | 
**batch_id** | **char \*** | The ID of the file batch that the files belong to. | 
**limit** | **int \*** | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20]
**order** | **openai_api_listFilesInVectorStoreBatch_order_e** | Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  | [optional] [default to &#39;desc&#39;]
**after** | **char \*** | A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] 
**before** | **char \*** | A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [optional] 
**filter** | **openai_api_listFilesInVectorStoreBatch_filter_e** | Filter by file status. One of &#x60;in_progress&#x60;, &#x60;completed&#x60;, &#x60;failed&#x60;, &#x60;cancelled&#x60;. | [optional] 

### Return type

[list_vector_store_files_response_t](list_vector_store_files_response.md) *


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **VectorStoresAPI_listVectorStoreFiles**
```c
// Returns a list of vector store files.
//
list_vector_store_files_response_t* VectorStoresAPI_listVectorStoreFiles(apiClient_t *apiClient, char *vector_store_id, int *limit, openai_api_listVectorStoreFiles_order_e order, char *after, char *before, openai_api_listVectorStoreFiles_filter_e filter);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**vector_store_id** | **char \*** | The ID of the vector store that the files belong to. | 
**limit** | **int \*** | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20]
**order** | **openai_api_listVectorStoreFiles_order_e** | Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  | [optional] [default to &#39;desc&#39;]
**after** | **char \*** | A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] 
**before** | **char \*** | A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [optional] 
**filter** | **openai_api_listVectorStoreFiles_filter_e** | Filter by file status. One of &#x60;in_progress&#x60;, &#x60;completed&#x60;, &#x60;failed&#x60;, &#x60;cancelled&#x60;. | [optional] 

### Return type

[list_vector_store_files_response_t](list_vector_store_files_response.md) *


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **VectorStoresAPI_listVectorStores**
```c
// Returns a list of vector stores.
//
list_vector_stores_response_t* VectorStoresAPI_listVectorStores(apiClient_t *apiClient, int *limit, openai_api_listVectorStores_order_e order, char *after, char *before);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**limit** | **int \*** | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20]
**order** | **openai_api_listVectorStores_order_e** | Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  | [optional] [default to &#39;desc&#39;]
**after** | **char \*** | A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] 
**before** | **char \*** | A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [optional] 

### Return type

[list_vector_stores_response_t](list_vector_stores_response.md) *


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **VectorStoresAPI_modifyVectorStore**
```c
// Modifies a vector store.
//
vector_store_object_t* VectorStoresAPI_modifyVectorStore(apiClient_t *apiClient, char *vector_store_id, update_vector_store_request_t *update_vector_store_request);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**vector_store_id** | **char \*** | The ID of the vector store to modify. | 
**update_vector_store_request** | **[update_vector_store_request_t](update_vector_store_request.md) \*** |  | 

### Return type

[vector_store_object_t](vector_store_object.md) *


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

