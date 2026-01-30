# VECTORSTORES_API

All URIs are relative to *https://api.openai.com/v1*

Feature | HTTP request | Description
------------- | ------------- | -------------
[**cancel_vector_store_file_batch**](VECTORSTORES_API.md#cancel_vector_store_file_batch) | **Post** /vector_stores/{vector_store_id}/file_batches/{batch_id}/cancel | Cancel a vector store file batch. This attempts to cancel the processing of files in this batch as soon as possible.
[**create_vector_store**](VECTORSTORES_API.md#create_vector_store) | **Post** /vector_stores | Create a vector store.
[**create_vector_store_file**](VECTORSTORES_API.md#create_vector_store_file) | **Post** /vector_stores/{vector_store_id}/files | Create a vector store file by attaching a [File](/docs/api-reference/files) to a [vector store](/docs/api-reference/vector-stores/object).
[**create_vector_store_file_batch**](VECTORSTORES_API.md#create_vector_store_file_batch) | **Post** /vector_stores/{vector_store_id}/file_batches | Create a vector store file batch.
[**delete_vector_store**](VECTORSTORES_API.md#delete_vector_store) | **Delete** /vector_stores/{vector_store_id} | Delete a vector store.
[**delete_vector_store_file**](VECTORSTORES_API.md#delete_vector_store_file) | **Delete** /vector_stores/{vector_store_id}/files/{file_id} | Delete a vector store file. This will remove the file from the vector store but the file itself will not be deleted. To delete the file, use the [delete file](/docs/api-reference/files/delete) endpoint.
[**list_files_in_vector_store_batch**](VECTORSTORES_API.md#list_files_in_vector_store_batch) | **Get** /vector_stores/{vector_store_id}/file_batches/{batch_id}/files | Returns a list of vector store files in a batch.
[**list_vector_store_files**](VECTORSTORES_API.md#list_vector_store_files) | **Get** /vector_stores/{vector_store_id}/files | Returns a list of vector store files.
[**list_vector_stores**](VECTORSTORES_API.md#list_vector_stores) | **Get** /vector_stores | Returns a list of vector stores.
[**modify_vector_store**](VECTORSTORES_API.md#modify_vector_store) | **Post** /vector_stores/{vector_store_id} | Modifies a vector store.
[**vector_store**](VECTORSTORES_API.md#vector_store) | **Get** /vector_stores/{vector_store_id} | Retrieves a vector store.
[**vector_store_file**](VECTORSTORES_API.md#vector_store_file) | **Get** /vector_stores/{vector_store_id}/files/{file_id} | Retrieves a vector store file.
[**vector_store_file_batch**](VECTORSTORES_API.md#vector_store_file_batch) | **Get** /vector_stores/{vector_store_id}/file_batches/{batch_id} | Retrieves a vector store file batch.


# **cancel_vector_store_file_batch**
> cancel_vector_store_file_batch (vector_store_id: STRING_32 ; batch_id: STRING_32 ): detachable VECTOR_STORE_FILE_BATCH_OBJECT


Cancel a vector store file batch. This attempts to cancel the processing of files in this batch as soon as possible.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vector_store_id** | **STRING_32**| The ID of the vector store that the file batch belongs to. | [default to null]
 **batch_id** | **STRING_32**| The ID of the file batch to cancel. | [default to null]

### Return type

[**VECTOR_STORE_FILE_BATCH_OBJECT**](VectorStoreFileBatchObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_vector_store**
> create_vector_store (create_vector_store_request: CREATE_VECTOR_STORE_REQUEST ): detachable VECTOR_STORE_OBJECT


Create a vector store.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **create_vector_store_request** | [**CREATE_VECTOR_STORE_REQUEST**](CREATE_VECTOR_STORE_REQUEST.md)|  | 

### Return type

[**VECTOR_STORE_OBJECT**](VectorStoreObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_vector_store_file**
> create_vector_store_file (vector_store_id: STRING_32 ; create_vector_store_file_request: CREATE_VECTOR_STORE_FILE_REQUEST ): detachable VECTOR_STORE_FILE_OBJECT


Create a vector store file by attaching a [File](/docs/api-reference/files) to a [vector store](/docs/api-reference/vector-stores/object).


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vector_store_id** | **STRING_32**| The ID of the vector store for which to create a File.  | [default to null]
 **create_vector_store_file_request** | [**CREATE_VECTOR_STORE_FILE_REQUEST**](CREATE_VECTOR_STORE_FILE_REQUEST.md)|  | 

### Return type

[**VECTOR_STORE_FILE_OBJECT**](VectorStoreFileObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_vector_store_file_batch**
> create_vector_store_file_batch (vector_store_id: STRING_32 ; create_vector_store_file_batch_request: CREATE_VECTOR_STORE_FILE_BATCH_REQUEST ): detachable VECTOR_STORE_FILE_BATCH_OBJECT


Create a vector store file batch.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vector_store_id** | **STRING_32**| The ID of the vector store for which to create a File Batch.  | [default to null]
 **create_vector_store_file_batch_request** | [**CREATE_VECTOR_STORE_FILE_BATCH_REQUEST**](CREATE_VECTOR_STORE_FILE_BATCH_REQUEST.md)|  | 

### Return type

[**VECTOR_STORE_FILE_BATCH_OBJECT**](VectorStoreFileBatchObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_vector_store**
> delete_vector_store (vector_store_id: STRING_32 ): detachable DELETE_VECTOR_STORE_RESPONSE


Delete a vector store.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vector_store_id** | **STRING_32**| The ID of the vector store to delete. | [default to null]

### Return type

[**DELETE_VECTOR_STORE_RESPONSE**](DeleteVectorStoreResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_vector_store_file**
> delete_vector_store_file (vector_store_id: STRING_32 ; file_id: STRING_32 ): detachable DELETE_VECTOR_STORE_FILE_RESPONSE


Delete a vector store file. This will remove the file from the vector store but the file itself will not be deleted. To delete the file, use the [delete file](/docs/api-reference/files/delete) endpoint.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vector_store_id** | **STRING_32**| The ID of the vector store that the file belongs to. | [default to null]
 **file_id** | **STRING_32**| The ID of the file to delete. | [default to null]

### Return type

[**DELETE_VECTOR_STORE_FILE_RESPONSE**](DeleteVectorStoreFileResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_files_in_vector_store_batch**
> list_files_in_vector_store_batch (vector_store_id: STRING_32 ; batch_id: STRING_32 ; limit:  detachable INTEGER_32 ; order:  detachable STRING_32 ; after:  detachable STRING_32 ; before:  detachable STRING_32 ; filter:  detachable STRING_32 ): detachable LIST_VECTOR_STORE_FILES_RESPONSE


Returns a list of vector store files in a batch.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vector_store_id** | **STRING_32**| The ID of the vector store that the files belong to. | [default to null]
 **batch_id** | **STRING_32**| The ID of the file batch that the files belong to. | [default to null]
 **limit** | **INTEGER_32**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20]
 **order** | **STRING_32**| Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  | [optional] [default to desc]
 **after** | **STRING_32**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] [default to null]
 **before** | **STRING_32**| A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [optional] [default to null]
 **filter** | **STRING_32**| Filter by file status. One of &#x60;in_progress&#x60;, &#x60;completed&#x60;, &#x60;failed&#x60;, &#x60;cancelled&#x60;. | [optional] [default to null]

### Return type

[**LIST_VECTOR_STORE_FILES_RESPONSE**](ListVectorStoreFilesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_vector_store_files**
> list_vector_store_files (vector_store_id: STRING_32 ; limit:  detachable INTEGER_32 ; order:  detachable STRING_32 ; after:  detachable STRING_32 ; before:  detachable STRING_32 ; filter:  detachable STRING_32 ): detachable LIST_VECTOR_STORE_FILES_RESPONSE


Returns a list of vector store files.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vector_store_id** | **STRING_32**| The ID of the vector store that the files belong to. | [default to null]
 **limit** | **INTEGER_32**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20]
 **order** | **STRING_32**| Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  | [optional] [default to desc]
 **after** | **STRING_32**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] [default to null]
 **before** | **STRING_32**| A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [optional] [default to null]
 **filter** | **STRING_32**| Filter by file status. One of &#x60;in_progress&#x60;, &#x60;completed&#x60;, &#x60;failed&#x60;, &#x60;cancelled&#x60;. | [optional] [default to null]

### Return type

[**LIST_VECTOR_STORE_FILES_RESPONSE**](ListVectorStoreFilesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_vector_stores**
> list_vector_stores (limit:  detachable INTEGER_32 ; order:  detachable STRING_32 ; after:  detachable STRING_32 ; before:  detachable STRING_32 ): detachable LIST_VECTOR_STORES_RESPONSE


Returns a list of vector stores.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **INTEGER_32**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20]
 **order** | **STRING_32**| Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  | [optional] [default to desc]
 **after** | **STRING_32**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] [default to null]
 **before** | **STRING_32**| A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [optional] [default to null]

### Return type

[**LIST_VECTOR_STORES_RESPONSE**](ListVectorStoresResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **modify_vector_store**
> modify_vector_store (vector_store_id: STRING_32 ; update_vector_store_request: UPDATE_VECTOR_STORE_REQUEST ): detachable VECTOR_STORE_OBJECT


Modifies a vector store.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vector_store_id** | **STRING_32**| The ID of the vector store to modify. | [default to null]
 **update_vector_store_request** | [**UPDATE_VECTOR_STORE_REQUEST**](UPDATE_VECTOR_STORE_REQUEST.md)|  | 

### Return type

[**VECTOR_STORE_OBJECT**](VectorStoreObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **vector_store**
> vector_store (vector_store_id: STRING_32 ): detachable VECTOR_STORE_OBJECT


Retrieves a vector store.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vector_store_id** | **STRING_32**| The ID of the vector store to retrieve. | [default to null]

### Return type

[**VECTOR_STORE_OBJECT**](VectorStoreObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **vector_store_file**
> vector_store_file (vector_store_id: STRING_32 ; file_id: STRING_32 ): detachable VECTOR_STORE_FILE_OBJECT


Retrieves a vector store file.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vector_store_id** | **STRING_32**| The ID of the vector store that the file belongs to. | [default to null]
 **file_id** | **STRING_32**| The ID of the file being retrieved. | [default to null]

### Return type

[**VECTOR_STORE_FILE_OBJECT**](VectorStoreFileObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **vector_store_file_batch**
> vector_store_file_batch (vector_store_id: STRING_32 ; batch_id: STRING_32 ): detachable VECTOR_STORE_FILE_BATCH_OBJECT


Retrieves a vector store file batch.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vector_store_id** | **STRING_32**| The ID of the vector store that the file batch belongs to. | [default to null]
 **batch_id** | **STRING_32**| The ID of the file batch being retrieved. | [default to null]

### Return type

[**VECTOR_STORE_FILE_BATCH_OBJECT**](VectorStoreFileBatchObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

