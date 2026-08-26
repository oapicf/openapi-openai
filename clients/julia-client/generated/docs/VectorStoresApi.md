# VectorStoresApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancel_vector_store_file_batch**](VectorStoresApi.md#cancel_vector_store_file_batch) | **POST** /vector_stores/{vector_store_id}/file_batches/{batch_id}/cancel | Cancel a vector store file batch. This attempts to cancel the processing of files in this batch as soon as possible.
[**create_vector_store**](VectorStoresApi.md#create_vector_store) | **POST** /vector_stores | Create a vector store.
[**create_vector_store_file**](VectorStoresApi.md#create_vector_store_file) | **POST** /vector_stores/{vector_store_id}/files | Create a vector store file by attaching a [File](/docs/api-reference/files) to a [vector store](/docs/api-reference/vector-stores/object).
[**create_vector_store_file_batch**](VectorStoresApi.md#create_vector_store_file_batch) | **POST** /vector_stores/{vector_store_id}/file_batches | Create a vector store file batch.
[**delete_vector_store**](VectorStoresApi.md#delete_vector_store) | **DELETE** /vector_stores/{vector_store_id} | Delete a vector store.
[**delete_vector_store_file**](VectorStoresApi.md#delete_vector_store_file) | **DELETE** /vector_stores/{vector_store_id}/files/{file_id} | Delete a vector store file. This will remove the file from the vector store but the file itself will not be deleted. To delete the file, use the [delete file](/docs/api-reference/files/delete) endpoint.
[**get_vector_store**](VectorStoresApi.md#get_vector_store) | **GET** /vector_stores/{vector_store_id} | Retrieves a vector store.
[**get_vector_store_file**](VectorStoresApi.md#get_vector_store_file) | **GET** /vector_stores/{vector_store_id}/files/{file_id} | Retrieves a vector store file.
[**get_vector_store_file_batch**](VectorStoresApi.md#get_vector_store_file_batch) | **GET** /vector_stores/{vector_store_id}/file_batches/{batch_id} | Retrieves a vector store file batch.
[**list_files_in_vector_store_batch**](VectorStoresApi.md#list_files_in_vector_store_batch) | **GET** /vector_stores/{vector_store_id}/file_batches/{batch_id}/files | Returns a list of vector store files in a batch.
[**list_vector_store_files**](VectorStoresApi.md#list_vector_store_files) | **GET** /vector_stores/{vector_store_id}/files | Returns a list of vector store files.
[**list_vector_stores**](VectorStoresApi.md#list_vector_stores) | **GET** /vector_stores | Returns a list of vector stores.
[**modify_vector_store**](VectorStoresApi.md#modify_vector_store) | **POST** /vector_stores/{vector_store_id} | Modifies a vector store.


# **cancel_vector_store_file_batch**
> `cancel_vector_store_file_batch`(_api::`VectorStoresApi`, `vector_store_id`::`String`, `batch_id`::`String`; _mediaType=nothing) -> `VectorStoreFileBatchObject`, `OpenAPI.Clients.ApiResponse` <br/>
> `cancel_vector_store_file_batch`(_api::`VectorStoresApi`, response_stream::`Channel`, `vector_store_id`::`String`, `batch_id`::`String`; _mediaType=nothing) -> `Channel`{ `VectorStoreFileBatchObject` }, `OpenAPI.Clients.ApiResponse`

Cancel a vector store file batch. This attempts to cancel the processing of files in this batch as soon as possible.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`VectorStoresApi`** | API context | 
**`vector_store_id`** | **`String`** | The ID of the vector store that the file batch belongs to. |
**`batch_id`** | **`String`** | The ID of the file batch to cancel. |

### Return type

[**`VectorStoreFileBatchObject`**](VectorStoreFileBatchObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **create_vector_store**
> `create_vector_store`(_api::`VectorStoresApi`, `create_vector_store_request`::`CreateVectorStoreRequest`; _mediaType=nothing) -> `VectorStoreObject`, `OpenAPI.Clients.ApiResponse` <br/>
> `create_vector_store`(_api::`VectorStoresApi`, response_stream::`Channel`, `create_vector_store_request`::`CreateVectorStoreRequest`; _mediaType=nothing) -> `Channel`{ `VectorStoreObject` }, `OpenAPI.Clients.ApiResponse`

Create a vector store.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`VectorStoresApi`** | API context | 
**`create_vector_store_request`** | [**`CreateVectorStoreRequest`**](CreateVectorStoreRequest.md) |  |

### Return type

[**`VectorStoreObject`**](VectorStoreObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **create_vector_store_file**
> `create_vector_store_file`(_api::`VectorStoresApi`, `vector_store_id`::`String`, `create_vector_store_file_request`::`CreateVectorStoreFileRequest`; _mediaType=nothing) -> `VectorStoreFileObject`, `OpenAPI.Clients.ApiResponse` <br/>
> `create_vector_store_file`(_api::`VectorStoresApi`, response_stream::`Channel`, `vector_store_id`::`String`, `create_vector_store_file_request`::`CreateVectorStoreFileRequest`; _mediaType=nothing) -> `Channel`{ `VectorStoreFileObject` }, `OpenAPI.Clients.ApiResponse`

Create a vector store file by attaching a [File](/docs/api-reference/files) to a [vector store](/docs/api-reference/vector-stores/object).

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`VectorStoresApi`** | API context | 
**`vector_store_id`** | **`String`** | The ID of the vector store for which to create a File.  |
**`create_vector_store_file_request`** | [**`CreateVectorStoreFileRequest`**](CreateVectorStoreFileRequest.md) |  |

### Return type

[**`VectorStoreFileObject`**](VectorStoreFileObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **create_vector_store_file_batch**
> `create_vector_store_file_batch`(_api::`VectorStoresApi`, `vector_store_id`::`String`, `create_vector_store_file_batch_request`::`CreateVectorStoreFileBatchRequest`; _mediaType=nothing) -> `VectorStoreFileBatchObject`, `OpenAPI.Clients.ApiResponse` <br/>
> `create_vector_store_file_batch`(_api::`VectorStoresApi`, response_stream::`Channel`, `vector_store_id`::`String`, `create_vector_store_file_batch_request`::`CreateVectorStoreFileBatchRequest`; _mediaType=nothing) -> `Channel`{ `VectorStoreFileBatchObject` }, `OpenAPI.Clients.ApiResponse`

Create a vector store file batch.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`VectorStoresApi`** | API context | 
**`vector_store_id`** | **`String`** | The ID of the vector store for which to create a File Batch.  |
**`create_vector_store_file_batch_request`** | [**`CreateVectorStoreFileBatchRequest`**](CreateVectorStoreFileBatchRequest.md) |  |

### Return type

[**`VectorStoreFileBatchObject`**](VectorStoreFileBatchObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **delete_vector_store**
> `delete_vector_store`(_api::`VectorStoresApi`, `vector_store_id`::`String`; _mediaType=nothing) -> `DeleteVectorStoreResponse`, `OpenAPI.Clients.ApiResponse` <br/>
> `delete_vector_store`(_api::`VectorStoresApi`, response_stream::`Channel`, `vector_store_id`::`String`; _mediaType=nothing) -> `Channel`{ `DeleteVectorStoreResponse` }, `OpenAPI.Clients.ApiResponse`

Delete a vector store.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`VectorStoresApi`** | API context | 
**`vector_store_id`** | **`String`** | The ID of the vector store to delete. |

### Return type

[**`DeleteVectorStoreResponse`**](DeleteVectorStoreResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **delete_vector_store_file**
> `delete_vector_store_file`(_api::`VectorStoresApi`, `vector_store_id`::`String`, `file_id`::`String`; _mediaType=nothing) -> `DeleteVectorStoreFileResponse`, `OpenAPI.Clients.ApiResponse` <br/>
> `delete_vector_store_file`(_api::`VectorStoresApi`, response_stream::`Channel`, `vector_store_id`::`String`, `file_id`::`String`; _mediaType=nothing) -> `Channel`{ `DeleteVectorStoreFileResponse` }, `OpenAPI.Clients.ApiResponse`

Delete a vector store file. This will remove the file from the vector store but the file itself will not be deleted. To delete the file, use the [delete file](/docs/api-reference/files/delete) endpoint.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`VectorStoresApi`** | API context | 
**`vector_store_id`** | **`String`** | The ID of the vector store that the file belongs to. |
**`file_id`** | **`String`** | The ID of the file to delete. |

### Return type

[**`DeleteVectorStoreFileResponse`**](DeleteVectorStoreFileResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **get_vector_store**
> `get_vector_store`(_api::`VectorStoresApi`, `vector_store_id`::`String`; _mediaType=nothing) -> `VectorStoreObject`, `OpenAPI.Clients.ApiResponse` <br/>
> `get_vector_store`(_api::`VectorStoresApi`, response_stream::`Channel`, `vector_store_id`::`String`; _mediaType=nothing) -> `Channel`{ `VectorStoreObject` }, `OpenAPI.Clients.ApiResponse`

Retrieves a vector store.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`VectorStoresApi`** | API context | 
**`vector_store_id`** | **`String`** | The ID of the vector store to retrieve. |

### Return type

[**`VectorStoreObject`**](VectorStoreObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **get_vector_store_file**
> `get_vector_store_file`(_api::`VectorStoresApi`, `vector_store_id`::`String`, `file_id`::`String`; _mediaType=nothing) -> `VectorStoreFileObject`, `OpenAPI.Clients.ApiResponse` <br/>
> `get_vector_store_file`(_api::`VectorStoresApi`, response_stream::`Channel`, `vector_store_id`::`String`, `file_id`::`String`; _mediaType=nothing) -> `Channel`{ `VectorStoreFileObject` }, `OpenAPI.Clients.ApiResponse`

Retrieves a vector store file.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`VectorStoresApi`** | API context | 
**`vector_store_id`** | **`String`** | The ID of the vector store that the file belongs to. |
**`file_id`** | **`String`** | The ID of the file being retrieved. |

### Return type

[**`VectorStoreFileObject`**](VectorStoreFileObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **get_vector_store_file_batch**
> `get_vector_store_file_batch`(_api::`VectorStoresApi`, `vector_store_id`::`String`, `batch_id`::`String`; _mediaType=nothing) -> `VectorStoreFileBatchObject`, `OpenAPI.Clients.ApiResponse` <br/>
> `get_vector_store_file_batch`(_api::`VectorStoresApi`, response_stream::`Channel`, `vector_store_id`::`String`, `batch_id`::`String`; _mediaType=nothing) -> `Channel`{ `VectorStoreFileBatchObject` }, `OpenAPI.Clients.ApiResponse`

Retrieves a vector store file batch.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`VectorStoresApi`** | API context | 
**`vector_store_id`** | **`String`** | The ID of the vector store that the file batch belongs to. |
**`batch_id`** | **`String`** | The ID of the file batch being retrieved. |

### Return type

[**`VectorStoreFileBatchObject`**](VectorStoreFileBatchObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **list_files_in_vector_store_batch**
> `list_files_in_vector_store_batch`(_api::`VectorStoresApi`, `vector_store_id`::`String`, `batch_id`::`String`; `limit`=nothing, `order`=nothing, `after`=nothing, `before`=nothing, `filter`=nothing, _mediaType=nothing) -> `ListVectorStoreFilesResponse`, `OpenAPI.Clients.ApiResponse` <br/>
> `list_files_in_vector_store_batch`(_api::`VectorStoresApi`, response_stream::`Channel`, `vector_store_id`::`String`, `batch_id`::`String`; `limit`=nothing, `order`=nothing, `after`=nothing, `before`=nothing, `filter`=nothing, _mediaType=nothing) -> `Channel`{ `ListVectorStoreFilesResponse` }, `OpenAPI.Clients.ApiResponse`

Returns a list of vector store files in a batch.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`VectorStoresApi`** | API context | 
**`vector_store_id`** | **`String`** | The ID of the vector store that the files belong to. |
**`batch_id`** | **`String`** | The ID of the file batch that the files belong to. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`limit`** | **`Int64`** | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [default to 20]
 **`order`** | **`String`** | Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  | [default to &quot;desc&quot;]
 **`after`** | **`String`** | A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [default to nothing]
 **`before`** | **`String`** | A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [default to nothing]
 **`filter`** | **`String`** | Filter by file status. One of &#x60;in_progress&#x60;, &#x60;completed&#x60;, &#x60;failed&#x60;, &#x60;cancelled&#x60;. | [default to nothing]

### Return type

[**`ListVectorStoreFilesResponse`**](ListVectorStoreFilesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **list_vector_store_files**
> `list_vector_store_files`(_api::`VectorStoresApi`, `vector_store_id`::`String`; `limit`=nothing, `order`=nothing, `after`=nothing, `before`=nothing, `filter`=nothing, _mediaType=nothing) -> `ListVectorStoreFilesResponse`, `OpenAPI.Clients.ApiResponse` <br/>
> `list_vector_store_files`(_api::`VectorStoresApi`, response_stream::`Channel`, `vector_store_id`::`String`; `limit`=nothing, `order`=nothing, `after`=nothing, `before`=nothing, `filter`=nothing, _mediaType=nothing) -> `Channel`{ `ListVectorStoreFilesResponse` }, `OpenAPI.Clients.ApiResponse`

Returns a list of vector store files.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`VectorStoresApi`** | API context | 
**`vector_store_id`** | **`String`** | The ID of the vector store that the files belong to. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`limit`** | **`Int64`** | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [default to 20]
 **`order`** | **`String`** | Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  | [default to &quot;desc&quot;]
 **`after`** | **`String`** | A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [default to nothing]
 **`before`** | **`String`** | A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [default to nothing]
 **`filter`** | **`String`** | Filter by file status. One of &#x60;in_progress&#x60;, &#x60;completed&#x60;, &#x60;failed&#x60;, &#x60;cancelled&#x60;. | [default to nothing]

### Return type

[**`ListVectorStoreFilesResponse`**](ListVectorStoreFilesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **list_vector_stores**
> `list_vector_stores`(_api::`VectorStoresApi`; `limit`=nothing, `order`=nothing, `after`=nothing, `before`=nothing, _mediaType=nothing) -> `ListVectorStoresResponse`, `OpenAPI.Clients.ApiResponse` <br/>
> `list_vector_stores`(_api::`VectorStoresApi`, response_stream::`Channel`; `limit`=nothing, `order`=nothing, `after`=nothing, `before`=nothing, _mediaType=nothing) -> `Channel`{ `ListVectorStoresResponse` }, `OpenAPI.Clients.ApiResponse`

Returns a list of vector stores.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`VectorStoresApi`** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`limit`** | **`Int64`** | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [default to 20]
 **`order`** | **`String`** | Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  | [default to &quot;desc&quot;]
 **`after`** | **`String`** | A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [default to nothing]
 **`before`** | **`String`** | A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [default to nothing]

### Return type

[**`ListVectorStoresResponse`**](ListVectorStoresResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **modify_vector_store**
> `modify_vector_store`(_api::`VectorStoresApi`, `vector_store_id`::`String`, `update_vector_store_request`::`UpdateVectorStoreRequest`; _mediaType=nothing) -> `VectorStoreObject`, `OpenAPI.Clients.ApiResponse` <br/>
> `modify_vector_store`(_api::`VectorStoresApi`, response_stream::`Channel`, `vector_store_id`::`String`, `update_vector_store_request`::`UpdateVectorStoreRequest`; _mediaType=nothing) -> `Channel`{ `VectorStoreObject` }, `OpenAPI.Clients.ApiResponse`

Modifies a vector store.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`VectorStoresApi`** | API context | 
**`vector_store_id`** | **`String`** | The ID of the vector store to modify. |
**`update_vector_store_request`** | [**`UpdateVectorStoreRequest`**](UpdateVectorStoreRequest.md) |  |

### Return type

[**`VectorStoreObject`**](VectorStoreObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

