# VectorStoresApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CancelVectorStoreFileBatch**](VectorStoresApi.md#CancelVectorStoreFileBatch) | **POST** /vector_stores/{vector_store_id}/file_batches/{batch_id}/cancel | Cancel a vector store file batch. This attempts to cancel the processing of files in this batch as soon as possible.
[**CreateVectorStore**](VectorStoresApi.md#CreateVectorStore) | **POST** /vector_stores | Create a vector store.
[**CreateVectorStoreFile**](VectorStoresApi.md#CreateVectorStoreFile) | **POST** /vector_stores/{vector_store_id}/files | Create a vector store file by attaching a [File](/docs/api-reference/files) to a [vector store](/docs/api-reference/vector-stores/object).
[**CreateVectorStoreFileBatch**](VectorStoresApi.md#CreateVectorStoreFileBatch) | **POST** /vector_stores/{vector_store_id}/file_batches | Create a vector store file batch.
[**DeleteVectorStore**](VectorStoresApi.md#DeleteVectorStore) | **DELETE** /vector_stores/{vector_store_id} | Delete a vector store.
[**DeleteVectorStoreFile**](VectorStoresApi.md#DeleteVectorStoreFile) | **DELETE** /vector_stores/{vector_store_id}/files/{file_id} | Delete a vector store file. This will remove the file from the vector store but the file itself will not be deleted. To delete the file, use the [delete file](/docs/api-reference/files/delete) endpoint.
[**GetVectorStore**](VectorStoresApi.md#GetVectorStore) | **GET** /vector_stores/{vector_store_id} | Retrieves a vector store.
[**GetVectorStoreFile**](VectorStoresApi.md#GetVectorStoreFile) | **GET** /vector_stores/{vector_store_id}/files/{file_id} | Retrieves a vector store file.
[**GetVectorStoreFileBatch**](VectorStoresApi.md#GetVectorStoreFileBatch) | **GET** /vector_stores/{vector_store_id}/file_batches/{batch_id} | Retrieves a vector store file batch.
[**ListFilesInVectorStoreBatch**](VectorStoresApi.md#ListFilesInVectorStoreBatch) | **GET** /vector_stores/{vector_store_id}/file_batches/{batch_id}/files | Returns a list of vector store files in a batch.
[**ListVectorStoreFiles**](VectorStoresApi.md#ListVectorStoreFiles) | **GET** /vector_stores/{vector_store_id}/files | Returns a list of vector store files.
[**ListVectorStores**](VectorStoresApi.md#ListVectorStores) | **GET** /vector_stores | Returns a list of vector stores.
[**ModifyVectorStore**](VectorStoresApi.md#ModifyVectorStore) | **POST** /vector_stores/{vector_store_id} | Modifies a vector store.


# **CancelVectorStoreFileBatch**
> VectorStoreFileBatchObject CancelVectorStoreFileBatch(vector_store_id, batch_id)

Cancel a vector store file batch. This attempts to cancel the processing of files in this batch as soon as possible.

### Example
```R
library(openapi)

# Cancel a vector store file batch. This attempts to cancel the processing of files in this batch as soon as possible.
#
# prepare function argument(s)
var_vector_store_id <- "vector_store_id_example" # character | The ID of the vector store that the file batch belongs to.
var_batch_id <- "batch_id_example" # character | The ID of the file batch to cancel.

api_instance <- VectorStoresApi$new()
# Configure HTTP bearer authorization: ApiKeyAuth
api_instance$api_client$bearer_token <- Sys.getenv("BEARER_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$CancelVectorStoreFileBatch(var_vector_store_id, var_batch_iddata_file = "result.txt")
result <- api_instance$CancelVectorStoreFileBatch(var_vector_store_id, var_batch_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vector_store_id** | **character**| The ID of the vector store that the file batch belongs to. | 
 **batch_id** | **character**| The ID of the file batch to cancel. | 

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

# **CreateVectorStore**
> VectorStoreObject CreateVectorStore(create_vector_store_request)

Create a vector store.

### Example
```R
library(openapi)

# Create a vector store.
#
# prepare function argument(s)
var_create_vector_store_request <- CreateVectorStoreRequest$new(c("file_ids_example"), "name_example", VectorStoreExpirationAfter$new("last_active_at", 123), CreateVectorStoreRequest_chunking_strategy$new("auto", Static_Chunking_Strategy$new("static", Static_Chunking_Strategy_static$new(123, 123))), 123) # CreateVectorStoreRequest | 

api_instance <- VectorStoresApi$new()
# Configure HTTP bearer authorization: ApiKeyAuth
api_instance$api_client$bearer_token <- Sys.getenv("BEARER_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$CreateVectorStore(var_create_vector_store_requestdata_file = "result.txt")
result <- api_instance$CreateVectorStore(var_create_vector_store_request)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **create_vector_store_request** | [**CreateVectorStoreRequest**](CreateVectorStoreRequest.md)|  | 

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

# **CreateVectorStoreFile**
> VectorStoreFileObject CreateVectorStoreFile(vector_store_id, create_vector_store_file_request)

Create a vector store file by attaching a [File](/docs/api-reference/files) to a [vector store](/docs/api-reference/vector-stores/object).

### Example
```R
library(openapi)

# Create a vector store file by attaching a [File](/docs/api-reference/files) to a [vector store](/docs/api-reference/vector-stores/object).
#
# prepare function argument(s)
var_vector_store_id <- "vs_abc123" # character | The ID of the vector store for which to create a File. 
var_create_vector_store_file_request <- CreateVectorStoreFileRequest$new("file_id_example", ChunkingStrategyRequestParam$new("auto", Static_Chunking_Strategy$new("static", Static_Chunking_Strategy_static$new(123, 123)))) # CreateVectorStoreFileRequest | 

api_instance <- VectorStoresApi$new()
# Configure HTTP bearer authorization: ApiKeyAuth
api_instance$api_client$bearer_token <- Sys.getenv("BEARER_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$CreateVectorStoreFile(var_vector_store_id, var_create_vector_store_file_requestdata_file = "result.txt")
result <- api_instance$CreateVectorStoreFile(var_vector_store_id, var_create_vector_store_file_request)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vector_store_id** | **character**| The ID of the vector store for which to create a File.  | 
 **create_vector_store_file_request** | [**CreateVectorStoreFileRequest**](CreateVectorStoreFileRequest.md)|  | 

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

# **CreateVectorStoreFileBatch**
> VectorStoreFileBatchObject CreateVectorStoreFileBatch(vector_store_id, create_vector_store_file_batch_request)

Create a vector store file batch.

### Example
```R
library(openapi)

# Create a vector store file batch.
#
# prepare function argument(s)
var_vector_store_id <- "vs_abc123" # character | The ID of the vector store for which to create a File Batch. 
var_create_vector_store_file_batch_request <- CreateVectorStoreFileBatchRequest$new(c("file_ids_example"), ChunkingStrategyRequestParam$new("auto", Static_Chunking_Strategy$new("static", Static_Chunking_Strategy_static$new(123, 123)))) # CreateVectorStoreFileBatchRequest | 

api_instance <- VectorStoresApi$new()
# Configure HTTP bearer authorization: ApiKeyAuth
api_instance$api_client$bearer_token <- Sys.getenv("BEARER_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$CreateVectorStoreFileBatch(var_vector_store_id, var_create_vector_store_file_batch_requestdata_file = "result.txt")
result <- api_instance$CreateVectorStoreFileBatch(var_vector_store_id, var_create_vector_store_file_batch_request)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vector_store_id** | **character**| The ID of the vector store for which to create a File Batch.  | 
 **create_vector_store_file_batch_request** | [**CreateVectorStoreFileBatchRequest**](CreateVectorStoreFileBatchRequest.md)|  | 

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

# **DeleteVectorStore**
> DeleteVectorStoreResponse DeleteVectorStore(vector_store_id)

Delete a vector store.

### Example
```R
library(openapi)

# Delete a vector store.
#
# prepare function argument(s)
var_vector_store_id <- "vector_store_id_example" # character | The ID of the vector store to delete.

api_instance <- VectorStoresApi$new()
# Configure HTTP bearer authorization: ApiKeyAuth
api_instance$api_client$bearer_token <- Sys.getenv("BEARER_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$DeleteVectorStore(var_vector_store_iddata_file = "result.txt")
result <- api_instance$DeleteVectorStore(var_vector_store_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vector_store_id** | **character**| The ID of the vector store to delete. | 

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

# **DeleteVectorStoreFile**
> DeleteVectorStoreFileResponse DeleteVectorStoreFile(vector_store_id, file_id)

Delete a vector store file. This will remove the file from the vector store but the file itself will not be deleted. To delete the file, use the [delete file](/docs/api-reference/files/delete) endpoint.

### Example
```R
library(openapi)

# Delete a vector store file. This will remove the file from the vector store but the file itself will not be deleted. To delete the file, use the [delete file](/docs/api-reference/files/delete) endpoint.
#
# prepare function argument(s)
var_vector_store_id <- "vector_store_id_example" # character | The ID of the vector store that the file belongs to.
var_file_id <- "file_id_example" # character | The ID of the file to delete.

api_instance <- VectorStoresApi$new()
# Configure HTTP bearer authorization: ApiKeyAuth
api_instance$api_client$bearer_token <- Sys.getenv("BEARER_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$DeleteVectorStoreFile(var_vector_store_id, var_file_iddata_file = "result.txt")
result <- api_instance$DeleteVectorStoreFile(var_vector_store_id, var_file_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vector_store_id** | **character**| The ID of the vector store that the file belongs to. | 
 **file_id** | **character**| The ID of the file to delete. | 

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

# **GetVectorStore**
> VectorStoreObject GetVectorStore(vector_store_id)

Retrieves a vector store.

### Example
```R
library(openapi)

# Retrieves a vector store.
#
# prepare function argument(s)
var_vector_store_id <- "vector_store_id_example" # character | The ID of the vector store to retrieve.

api_instance <- VectorStoresApi$new()
# Configure HTTP bearer authorization: ApiKeyAuth
api_instance$api_client$bearer_token <- Sys.getenv("BEARER_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$GetVectorStore(var_vector_store_iddata_file = "result.txt")
result <- api_instance$GetVectorStore(var_vector_store_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vector_store_id** | **character**| The ID of the vector store to retrieve. | 

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

# **GetVectorStoreFile**
> VectorStoreFileObject GetVectorStoreFile(vector_store_id, file_id)

Retrieves a vector store file.

### Example
```R
library(openapi)

# Retrieves a vector store file.
#
# prepare function argument(s)
var_vector_store_id <- "vs_abc123" # character | The ID of the vector store that the file belongs to.
var_file_id <- "file-abc123" # character | The ID of the file being retrieved.

api_instance <- VectorStoresApi$new()
# Configure HTTP bearer authorization: ApiKeyAuth
api_instance$api_client$bearer_token <- Sys.getenv("BEARER_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$GetVectorStoreFile(var_vector_store_id, var_file_iddata_file = "result.txt")
result <- api_instance$GetVectorStoreFile(var_vector_store_id, var_file_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vector_store_id** | **character**| The ID of the vector store that the file belongs to. | 
 **file_id** | **character**| The ID of the file being retrieved. | 

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

# **GetVectorStoreFileBatch**
> VectorStoreFileBatchObject GetVectorStoreFileBatch(vector_store_id, batch_id)

Retrieves a vector store file batch.

### Example
```R
library(openapi)

# Retrieves a vector store file batch.
#
# prepare function argument(s)
var_vector_store_id <- "vs_abc123" # character | The ID of the vector store that the file batch belongs to.
var_batch_id <- "vsfb_abc123" # character | The ID of the file batch being retrieved.

api_instance <- VectorStoresApi$new()
# Configure HTTP bearer authorization: ApiKeyAuth
api_instance$api_client$bearer_token <- Sys.getenv("BEARER_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$GetVectorStoreFileBatch(var_vector_store_id, var_batch_iddata_file = "result.txt")
result <- api_instance$GetVectorStoreFileBatch(var_vector_store_id, var_batch_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vector_store_id** | **character**| The ID of the vector store that the file batch belongs to. | 
 **batch_id** | **character**| The ID of the file batch being retrieved. | 

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

# **ListFilesInVectorStoreBatch**
> ListVectorStoreFilesResponse ListFilesInVectorStoreBatch(vector_store_id, batch_id, limit = 20, order = "desc", after = var.after, before = var.before, filter = var.filter)

Returns a list of vector store files in a batch.

### Example
```R
library(openapi)

# Returns a list of vector store files in a batch.
#
# prepare function argument(s)
var_vector_store_id <- "vector_store_id_example" # character | The ID of the vector store that the files belong to.
var_batch_id <- "batch_id_example" # character | The ID of the file batch that the files belong to.
var_limit <- 20 # integer | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (Optional)
var_order <- "desc" # character | Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order.  (Optional)
var_after <- "after_example" # character | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (Optional)
var_before <- "before_example" # character | A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list.  (Optional)
var_filter <- "filter_example" # character | Filter by file status. One of `in_progress`, `completed`, `failed`, `cancelled`. (Optional)

api_instance <- VectorStoresApi$new()
# Configure HTTP bearer authorization: ApiKeyAuth
api_instance$api_client$bearer_token <- Sys.getenv("BEARER_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$ListFilesInVectorStoreBatch(var_vector_store_id, var_batch_id, limit = var_limit, order = var_order, after = var_after, before = var_before, filter = var_filterdata_file = "result.txt")
result <- api_instance$ListFilesInVectorStoreBatch(var_vector_store_id, var_batch_id, limit = var_limit, order = var_order, after = var_after, before = var_before, filter = var_filter)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vector_store_id** | **character**| The ID of the vector store that the files belong to. | 
 **batch_id** | **character**| The ID of the file batch that the files belong to. | 
 **limit** | **integer**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20]
 **order** | Enum [asc, desc] | Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  | [optional] [default to &quot;desc&quot;]
 **after** | **character**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] 
 **before** | **character**| A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [optional] 
 **filter** | Enum [in_progress, completed, failed, cancelled] | Filter by file status. One of &#x60;in_progress&#x60;, &#x60;completed&#x60;, &#x60;failed&#x60;, &#x60;cancelled&#x60;. | [optional] 

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

# **ListVectorStoreFiles**
> ListVectorStoreFilesResponse ListVectorStoreFiles(vector_store_id, limit = 20, order = "desc", after = var.after, before = var.before, filter = var.filter)

Returns a list of vector store files.

### Example
```R
library(openapi)

# Returns a list of vector store files.
#
# prepare function argument(s)
var_vector_store_id <- "vector_store_id_example" # character | The ID of the vector store that the files belong to.
var_limit <- 20 # integer | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (Optional)
var_order <- "desc" # character | Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order.  (Optional)
var_after <- "after_example" # character | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (Optional)
var_before <- "before_example" # character | A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list.  (Optional)
var_filter <- "filter_example" # character | Filter by file status. One of `in_progress`, `completed`, `failed`, `cancelled`. (Optional)

api_instance <- VectorStoresApi$new()
# Configure HTTP bearer authorization: ApiKeyAuth
api_instance$api_client$bearer_token <- Sys.getenv("BEARER_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$ListVectorStoreFiles(var_vector_store_id, limit = var_limit, order = var_order, after = var_after, before = var_before, filter = var_filterdata_file = "result.txt")
result <- api_instance$ListVectorStoreFiles(var_vector_store_id, limit = var_limit, order = var_order, after = var_after, before = var_before, filter = var_filter)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vector_store_id** | **character**| The ID of the vector store that the files belong to. | 
 **limit** | **integer**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20]
 **order** | Enum [asc, desc] | Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  | [optional] [default to &quot;desc&quot;]
 **after** | **character**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] 
 **before** | **character**| A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [optional] 
 **filter** | Enum [in_progress, completed, failed, cancelled] | Filter by file status. One of &#x60;in_progress&#x60;, &#x60;completed&#x60;, &#x60;failed&#x60;, &#x60;cancelled&#x60;. | [optional] 

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

# **ListVectorStores**
> ListVectorStoresResponse ListVectorStores(limit = 20, order = "desc", after = var.after, before = var.before)

Returns a list of vector stores.

### Example
```R
library(openapi)

# Returns a list of vector stores.
#
# prepare function argument(s)
var_limit <- 20 # integer | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (Optional)
var_order <- "desc" # character | Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order.  (Optional)
var_after <- "after_example" # character | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (Optional)
var_before <- "before_example" # character | A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list.  (Optional)

api_instance <- VectorStoresApi$new()
# Configure HTTP bearer authorization: ApiKeyAuth
api_instance$api_client$bearer_token <- Sys.getenv("BEARER_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$ListVectorStores(limit = var_limit, order = var_order, after = var_after, before = var_beforedata_file = "result.txt")
result <- api_instance$ListVectorStores(limit = var_limit, order = var_order, after = var_after, before = var_before)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **integer**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20]
 **order** | Enum [asc, desc] | Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  | [optional] [default to &quot;desc&quot;]
 **after** | **character**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] 
 **before** | **character**| A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [optional] 

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

# **ModifyVectorStore**
> VectorStoreObject ModifyVectorStore(vector_store_id, update_vector_store_request)

Modifies a vector store.

### Example
```R
library(openapi)

# Modifies a vector store.
#
# prepare function argument(s)
var_vector_store_id <- "vector_store_id_example" # character | The ID of the vector store to modify.
var_update_vector_store_request <- UpdateVectorStoreRequest$new("name_example", VectorStoreExpirationAfter$new("last_active_at", 123), 123) # UpdateVectorStoreRequest | 

api_instance <- VectorStoresApi$new()
# Configure HTTP bearer authorization: ApiKeyAuth
api_instance$api_client$bearer_token <- Sys.getenv("BEARER_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$ModifyVectorStore(var_vector_store_id, var_update_vector_store_requestdata_file = "result.txt")
result <- api_instance$ModifyVectorStore(var_vector_store_id, var_update_vector_store_request)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vector_store_id** | **character**| The ID of the vector store to modify. | 
 **update_vector_store_request** | [**UpdateVectorStoreRequest**](UpdateVectorStoreRequest.md)|  | 

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

