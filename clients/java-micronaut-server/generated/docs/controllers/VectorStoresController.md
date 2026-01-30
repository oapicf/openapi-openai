# VectorStoresController

All URIs are relative to `"/v1"`

The controller class is defined in **[VectorStoresController.java](../../src/main/java/org/openapitools/controller/VectorStoresController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelVectorStoreFileBatch**](#cancelVectorStoreFileBatch) | **POST** /vector_stores/{vector_store_id}/file_batches/{batch_id}/cancel | Cancel a vector store file batch. This attempts to cancel the processing of files in this batch as soon as possible.
[**createVectorStore**](#createVectorStore) | **POST** /vector_stores | Create a vector store.
[**createVectorStoreFile**](#createVectorStoreFile) | **POST** /vector_stores/{vector_store_id}/files | Create a vector store file by attaching a [File](/docs/api-reference/files) to a [vector store](/docs/api-reference/vector-stores/object).
[**createVectorStoreFileBatch**](#createVectorStoreFileBatch) | **POST** /vector_stores/{vector_store_id}/file_batches | Create a vector store file batch.
[**deleteVectorStore**](#deleteVectorStore) | **DELETE** /vector_stores/{vector_store_id} | Delete a vector store.
[**deleteVectorStoreFile**](#deleteVectorStoreFile) | **DELETE** /vector_stores/{vector_store_id}/files/{file_id} | Delete a vector store file. This will remove the file from the vector store but the file itself will not be deleted. To delete the file, use the [delete file](/docs/api-reference/files/delete) endpoint.
[**getVectorStore**](#getVectorStore) | **GET** /vector_stores/{vector_store_id} | Retrieves a vector store.
[**getVectorStoreFile**](#getVectorStoreFile) | **GET** /vector_stores/{vector_store_id}/files/{file_id} | Retrieves a vector store file.
[**getVectorStoreFileBatch**](#getVectorStoreFileBatch) | **GET** /vector_stores/{vector_store_id}/file_batches/{batch_id} | Retrieves a vector store file batch.
[**listFilesInVectorStoreBatch**](#listFilesInVectorStoreBatch) | **GET** /vector_stores/{vector_store_id}/file_batches/{batch_id}/files | Returns a list of vector store files in a batch.
[**listVectorStoreFiles**](#listVectorStoreFiles) | **GET** /vector_stores/{vector_store_id}/files | Returns a list of vector store files.
[**listVectorStores**](#listVectorStores) | **GET** /vector_stores | Returns a list of vector stores.
[**modifyVectorStore**](#modifyVectorStore) | **POST** /vector_stores/{vector_store_id} | Modifies a vector store.

<a id="cancelVectorStoreFileBatch"></a>
# **cancelVectorStoreFileBatch**
```java
Mono<VectorStoreFileBatchObject> VectorStoresController.cancelVectorStoreFileBatch(vectorStoreIdbatchId)
```

Cancel a vector store file batch. This attempts to cancel the processing of files in this batch as soon as possible.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**vectorStoreId** | `String` | The ID of the vector store that the file batch belongs to. |
**batchId** | `String` | The ID of the file batch to cancel. |

### Return type
[**VectorStoreFileBatchObject**](../../docs/models/VectorStoreFileBatchObject.md)

### Authorization
* **ApiKeyAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="createVectorStore"></a>
# **createVectorStore**
```java
Mono<VectorStoreObject> VectorStoresController.createVectorStore(createVectorStoreRequest)
```

Create a vector store.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**createVectorStoreRequest** | [**CreateVectorStoreRequest**](../../docs/models/CreateVectorStoreRequest.md) |  |

### Return type
[**VectorStoreObject**](../../docs/models/VectorStoreObject.md)

### Authorization
* **ApiKeyAuth**

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

<a id="createVectorStoreFile"></a>
# **createVectorStoreFile**
```java
Mono<VectorStoreFileObject> VectorStoresController.createVectorStoreFile(vectorStoreIdcreateVectorStoreFileRequest)
```

Create a vector store file by attaching a [File](/docs/api-reference/files) to a [vector store](/docs/api-reference/vector-stores/object).

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**vectorStoreId** | `String` | The ID of the vector store for which to create a File.  |
**createVectorStoreFileRequest** | [**CreateVectorStoreFileRequest**](../../docs/models/CreateVectorStoreFileRequest.md) |  |

### Return type
[**VectorStoreFileObject**](../../docs/models/VectorStoreFileObject.md)

### Authorization
* **ApiKeyAuth**

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

<a id="createVectorStoreFileBatch"></a>
# **createVectorStoreFileBatch**
```java
Mono<VectorStoreFileBatchObject> VectorStoresController.createVectorStoreFileBatch(vectorStoreIdcreateVectorStoreFileBatchRequest)
```

Create a vector store file batch.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**vectorStoreId** | `String` | The ID of the vector store for which to create a File Batch.  |
**createVectorStoreFileBatchRequest** | [**CreateVectorStoreFileBatchRequest**](../../docs/models/CreateVectorStoreFileBatchRequest.md) |  |

### Return type
[**VectorStoreFileBatchObject**](../../docs/models/VectorStoreFileBatchObject.md)

### Authorization
* **ApiKeyAuth**

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

<a id="deleteVectorStore"></a>
# **deleteVectorStore**
```java
Mono<DeleteVectorStoreResponse> VectorStoresController.deleteVectorStore(vectorStoreId)
```

Delete a vector store.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**vectorStoreId** | `String` | The ID of the vector store to delete. |

### Return type
[**DeleteVectorStoreResponse**](../../docs/models/DeleteVectorStoreResponse.md)

### Authorization
* **ApiKeyAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="deleteVectorStoreFile"></a>
# **deleteVectorStoreFile**
```java
Mono<DeleteVectorStoreFileResponse> VectorStoresController.deleteVectorStoreFile(vectorStoreIdfileId)
```

Delete a vector store file. This will remove the file from the vector store but the file itself will not be deleted. To delete the file, use the [delete file](/docs/api-reference/files/delete) endpoint.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**vectorStoreId** | `String` | The ID of the vector store that the file belongs to. |
**fileId** | `String` | The ID of the file to delete. |

### Return type
[**DeleteVectorStoreFileResponse**](../../docs/models/DeleteVectorStoreFileResponse.md)

### Authorization
* **ApiKeyAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="getVectorStore"></a>
# **getVectorStore**
```java
Mono<VectorStoreObject> VectorStoresController.getVectorStore(vectorStoreId)
```

Retrieves a vector store.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**vectorStoreId** | `String` | The ID of the vector store to retrieve. |

### Return type
[**VectorStoreObject**](../../docs/models/VectorStoreObject.md)

### Authorization
* **ApiKeyAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="getVectorStoreFile"></a>
# **getVectorStoreFile**
```java
Mono<VectorStoreFileObject> VectorStoresController.getVectorStoreFile(vectorStoreIdfileId)
```

Retrieves a vector store file.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**vectorStoreId** | `String` | The ID of the vector store that the file belongs to. |
**fileId** | `String` | The ID of the file being retrieved. |

### Return type
[**VectorStoreFileObject**](../../docs/models/VectorStoreFileObject.md)

### Authorization
* **ApiKeyAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="getVectorStoreFileBatch"></a>
# **getVectorStoreFileBatch**
```java
Mono<VectorStoreFileBatchObject> VectorStoresController.getVectorStoreFileBatch(vectorStoreIdbatchId)
```

Retrieves a vector store file batch.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**vectorStoreId** | `String` | The ID of the vector store that the file batch belongs to. |
**batchId** | `String` | The ID of the file batch being retrieved. |

### Return type
[**VectorStoreFileBatchObject**](../../docs/models/VectorStoreFileBatchObject.md)

### Authorization
* **ApiKeyAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="listFilesInVectorStoreBatch"></a>
# **listFilesInVectorStoreBatch**
```java
Mono<ListVectorStoreFilesResponse> VectorStoresController.listFilesInVectorStoreBatch(vectorStoreIdbatchIdlimitorderafterbeforefilter)
```

Returns a list of vector store files in a batch.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**vectorStoreId** | `String` | The ID of the vector store that the files belong to. |
**batchId** | `String` | The ID of the file batch that the files belong to. |
**limit** | `Integer` | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional parameter] [default to `20`]
**order** | `String` | Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  | [optional parameter] [default to `desc`] [enum: `asc`, `desc`]
**after** | `String` | A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional parameter]
**before** | `String` | A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [optional parameter]
**filter** | `String` | Filter by file status. One of &#x60;in_progress&#x60;, &#x60;completed&#x60;, &#x60;failed&#x60;, &#x60;cancelled&#x60;. | [optional parameter] [enum: `in_progress`, `completed`, `failed`, `cancelled`]

### Return type
[**ListVectorStoreFilesResponse**](../../docs/models/ListVectorStoreFilesResponse.md)

### Authorization
* **ApiKeyAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="listVectorStoreFiles"></a>
# **listVectorStoreFiles**
```java
Mono<ListVectorStoreFilesResponse> VectorStoresController.listVectorStoreFiles(vectorStoreIdlimitorderafterbeforefilter)
```

Returns a list of vector store files.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**vectorStoreId** | `String` | The ID of the vector store that the files belong to. |
**limit** | `Integer` | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional parameter] [default to `20`]
**order** | `String` | Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  | [optional parameter] [default to `desc`] [enum: `asc`, `desc`]
**after** | `String` | A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional parameter]
**before** | `String` | A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [optional parameter]
**filter** | `String` | Filter by file status. One of &#x60;in_progress&#x60;, &#x60;completed&#x60;, &#x60;failed&#x60;, &#x60;cancelled&#x60;. | [optional parameter] [enum: `in_progress`, `completed`, `failed`, `cancelled`]

### Return type
[**ListVectorStoreFilesResponse**](../../docs/models/ListVectorStoreFilesResponse.md)

### Authorization
* **ApiKeyAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="listVectorStores"></a>
# **listVectorStores**
```java
Mono<ListVectorStoresResponse> VectorStoresController.listVectorStores(limitorderafterbefore)
```

Returns a list of vector stores.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**limit** | `Integer` | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional parameter] [default to `20`]
**order** | `String` | Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  | [optional parameter] [default to `desc`] [enum: `asc`, `desc`]
**after** | `String` | A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional parameter]
**before** | `String` | A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [optional parameter]

### Return type
[**ListVectorStoresResponse**](../../docs/models/ListVectorStoresResponse.md)

### Authorization
* **ApiKeyAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="modifyVectorStore"></a>
# **modifyVectorStore**
```java
Mono<VectorStoreObject> VectorStoresController.modifyVectorStore(vectorStoreIdupdateVectorStoreRequest)
```

Modifies a vector store.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**vectorStoreId** | `String` | The ID of the vector store to modify. |
**updateVectorStoreRequest** | [**UpdateVectorStoreRequest**](../../docs/models/UpdateVectorStoreRequest.md) |  |

### Return type
[**VectorStoreObject**](../../docs/models/VectorStoreObject.md)

### Authorization
* **ApiKeyAuth**

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

