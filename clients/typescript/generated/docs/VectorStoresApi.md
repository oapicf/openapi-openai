# .VectorStoresApi

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


# **cancelVectorStoreFileBatch**
> VectorStoreFileBatchObject cancelVectorStoreFileBatch()


### Example


```typescript
import { createConfiguration, VectorStoresApi } from '';
import type { VectorStoresApiCancelVectorStoreFileBatchRequest } from '';

const configuration = createConfiguration();
const apiInstance = new VectorStoresApi(configuration);

const request: VectorStoresApiCancelVectorStoreFileBatchRequest = {
    // The ID of the vector store that the file batch belongs to.
  vectorStoreId: "vector_store_id_example",
    // The ID of the file batch to cancel.
  batchId: "batch_id_example",
};

const data = await apiInstance.cancelVectorStoreFileBatch(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vectorStoreId** | [**string**] | The ID of the vector store that the file batch belongs to. | defaults to undefined
 **batchId** | [**string**] | The ID of the file batch to cancel. | defaults to undefined


### Return type

**VectorStoreFileBatchObject**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **createVectorStore**
> VectorStoreObject createVectorStore(createVectorStoreRequest)


### Example


```typescript
import { createConfiguration, VectorStoresApi } from '';
import type { VectorStoresApiCreateVectorStoreRequest } from '';

const configuration = createConfiguration();
const apiInstance = new VectorStoresApi(configuration);

const request: VectorStoresApiCreateVectorStoreRequest = {
  
  createVectorStoreRequest: {
    fileIds: [
      "fileIds_example",
    ],
    name: "name_example",
    expiresAfter: {
      anchor: "last_active_at",
      days: 1,
    },
    chunkingStrategy: {
    type: "auto",
  },
    metadata: {},
  },
};

const data = await apiInstance.createVectorStore(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createVectorStoreRequest** | **CreateVectorStoreRequest**|  |


### Return type

**VectorStoreObject**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **createVectorStoreFile**
> VectorStoreFileObject createVectorStoreFile(createVectorStoreFileRequest)


### Example


```typescript
import { createConfiguration, VectorStoresApi } from '';
import type { VectorStoresApiCreateVectorStoreFileRequest } from '';

const configuration = createConfiguration();
const apiInstance = new VectorStoresApi(configuration);

const request: VectorStoresApiCreateVectorStoreFileRequest = {
    // The ID of the vector store for which to create a File. 
  vectorStoreId: "vs_abc123",
  
  createVectorStoreFileRequest: {
    fileId: "fileId_example",
    chunkingStrategy: {
    type: "auto",
  },
  },
};

const data = await apiInstance.createVectorStoreFile(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createVectorStoreFileRequest** | **CreateVectorStoreFileRequest**|  |
 **vectorStoreId** | [**string**] | The ID of the vector store for which to create a File.  | defaults to undefined


### Return type

**VectorStoreFileObject**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **createVectorStoreFileBatch**
> VectorStoreFileBatchObject createVectorStoreFileBatch(createVectorStoreFileBatchRequest)


### Example


```typescript
import { createConfiguration, VectorStoresApi } from '';
import type { VectorStoresApiCreateVectorStoreFileBatchRequest } from '';

const configuration = createConfiguration();
const apiInstance = new VectorStoresApi(configuration);

const request: VectorStoresApiCreateVectorStoreFileBatchRequest = {
    // The ID of the vector store for which to create a File Batch. 
  vectorStoreId: "vs_abc123",
  
  createVectorStoreFileBatchRequest: {
    fileIds: [
      "fileIds_example",
    ],
    chunkingStrategy: {
    type: "auto",
  },
  },
};

const data = await apiInstance.createVectorStoreFileBatch(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createVectorStoreFileBatchRequest** | **CreateVectorStoreFileBatchRequest**|  |
 **vectorStoreId** | [**string**] | The ID of the vector store for which to create a File Batch.  | defaults to undefined


### Return type

**VectorStoreFileBatchObject**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **deleteVectorStore**
> DeleteVectorStoreResponse deleteVectorStore()


### Example


```typescript
import { createConfiguration, VectorStoresApi } from '';
import type { VectorStoresApiDeleteVectorStoreRequest } from '';

const configuration = createConfiguration();
const apiInstance = new VectorStoresApi(configuration);

const request: VectorStoresApiDeleteVectorStoreRequest = {
    // The ID of the vector store to delete.
  vectorStoreId: "vector_store_id_example",
};

const data = await apiInstance.deleteVectorStore(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vectorStoreId** | [**string**] | The ID of the vector store to delete. | defaults to undefined


### Return type

**DeleteVectorStoreResponse**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **deleteVectorStoreFile**
> DeleteVectorStoreFileResponse deleteVectorStoreFile()


### Example


```typescript
import { createConfiguration, VectorStoresApi } from '';
import type { VectorStoresApiDeleteVectorStoreFileRequest } from '';

const configuration = createConfiguration();
const apiInstance = new VectorStoresApi(configuration);

const request: VectorStoresApiDeleteVectorStoreFileRequest = {
    // The ID of the vector store that the file belongs to.
  vectorStoreId: "vector_store_id_example",
    // The ID of the file to delete.
  fileId: "file_id_example",
};

const data = await apiInstance.deleteVectorStoreFile(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vectorStoreId** | [**string**] | The ID of the vector store that the file belongs to. | defaults to undefined
 **fileId** | [**string**] | The ID of the file to delete. | defaults to undefined


### Return type

**DeleteVectorStoreFileResponse**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **getVectorStore**
> VectorStoreObject getVectorStore()


### Example


```typescript
import { createConfiguration, VectorStoresApi } from '';
import type { VectorStoresApiGetVectorStoreRequest } from '';

const configuration = createConfiguration();
const apiInstance = new VectorStoresApi(configuration);

const request: VectorStoresApiGetVectorStoreRequest = {
    // The ID of the vector store to retrieve.
  vectorStoreId: "vector_store_id_example",
};

const data = await apiInstance.getVectorStore(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vectorStoreId** | [**string**] | The ID of the vector store to retrieve. | defaults to undefined


### Return type

**VectorStoreObject**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **getVectorStoreFile**
> VectorStoreFileObject getVectorStoreFile()


### Example


```typescript
import { createConfiguration, VectorStoresApi } from '';
import type { VectorStoresApiGetVectorStoreFileRequest } from '';

const configuration = createConfiguration();
const apiInstance = new VectorStoresApi(configuration);

const request: VectorStoresApiGetVectorStoreFileRequest = {
    // The ID of the vector store that the file belongs to.
  vectorStoreId: "vs_abc123",
    // The ID of the file being retrieved.
  fileId: "file-abc123",
};

const data = await apiInstance.getVectorStoreFile(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vectorStoreId** | [**string**] | The ID of the vector store that the file belongs to. | defaults to undefined
 **fileId** | [**string**] | The ID of the file being retrieved. | defaults to undefined


### Return type

**VectorStoreFileObject**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **getVectorStoreFileBatch**
> VectorStoreFileBatchObject getVectorStoreFileBatch()


### Example


```typescript
import { createConfiguration, VectorStoresApi } from '';
import type { VectorStoresApiGetVectorStoreFileBatchRequest } from '';

const configuration = createConfiguration();
const apiInstance = new VectorStoresApi(configuration);

const request: VectorStoresApiGetVectorStoreFileBatchRequest = {
    // The ID of the vector store that the file batch belongs to.
  vectorStoreId: "vs_abc123",
    // The ID of the file batch being retrieved.
  batchId: "vsfb_abc123",
};

const data = await apiInstance.getVectorStoreFileBatch(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vectorStoreId** | [**string**] | The ID of the vector store that the file batch belongs to. | defaults to undefined
 **batchId** | [**string**] | The ID of the file batch being retrieved. | defaults to undefined


### Return type

**VectorStoreFileBatchObject**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **listFilesInVectorStoreBatch**
> ListVectorStoreFilesResponse listFilesInVectorStoreBatch()


### Example


```typescript
import { createConfiguration, VectorStoresApi } from '';
import type { VectorStoresApiListFilesInVectorStoreBatchRequest } from '';

const configuration = createConfiguration();
const apiInstance = new VectorStoresApi(configuration);

const request: VectorStoresApiListFilesInVectorStoreBatchRequest = {
    // The ID of the vector store that the files belong to.
  vectorStoreId: "vector_store_id_example",
    // The ID of the file batch that the files belong to.
  batchId: "batch_id_example",
    // A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional)
  limit: 20,
    // Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order.  (optional)
  order: "desc",
    // A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (optional)
  after: "after_example",
    // A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list.  (optional)
  before: "before_example",
    // Filter by file status. One of `in_progress`, `completed`, `failed`, `cancelled`. (optional)
  filter: "in_progress",
};

const data = await apiInstance.listFilesInVectorStoreBatch(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vectorStoreId** | [**string**] | The ID of the vector store that the files belong to. | defaults to undefined
 **batchId** | [**string**] | The ID of the file batch that the files belong to. | defaults to undefined
 **limit** | [**number**] | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | (optional) defaults to 20
 **order** | [**&#39;asc&#39; | &#39;desc&#39;**]**Array<&#39;asc&#39; &#124; &#39;desc&#39;>** | Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  | (optional) defaults to 'desc'
 **after** | [**string**] | A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | (optional) defaults to undefined
 **before** | [**string**] | A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | (optional) defaults to undefined
 **filter** | [**&#39;in_progress&#39; | &#39;completed&#39; | &#39;failed&#39; | &#39;cancelled&#39;**]**Array<&#39;in_progress&#39; &#124; &#39;completed&#39; &#124; &#39;failed&#39; &#124; &#39;cancelled&#39;>** | Filter by file status. One of &#x60;in_progress&#x60;, &#x60;completed&#x60;, &#x60;failed&#x60;, &#x60;cancelled&#x60;. | (optional) defaults to undefined


### Return type

**ListVectorStoreFilesResponse**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **listVectorStoreFiles**
> ListVectorStoreFilesResponse listVectorStoreFiles()


### Example


```typescript
import { createConfiguration, VectorStoresApi } from '';
import type { VectorStoresApiListVectorStoreFilesRequest } from '';

const configuration = createConfiguration();
const apiInstance = new VectorStoresApi(configuration);

const request: VectorStoresApiListVectorStoreFilesRequest = {
    // The ID of the vector store that the files belong to.
  vectorStoreId: "vector_store_id_example",
    // A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional)
  limit: 20,
    // Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order.  (optional)
  order: "desc",
    // A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (optional)
  after: "after_example",
    // A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list.  (optional)
  before: "before_example",
    // Filter by file status. One of `in_progress`, `completed`, `failed`, `cancelled`. (optional)
  filter: "in_progress",
};

const data = await apiInstance.listVectorStoreFiles(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vectorStoreId** | [**string**] | The ID of the vector store that the files belong to. | defaults to undefined
 **limit** | [**number**] | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | (optional) defaults to 20
 **order** | [**&#39;asc&#39; | &#39;desc&#39;**]**Array<&#39;asc&#39; &#124; &#39;desc&#39;>** | Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  | (optional) defaults to 'desc'
 **after** | [**string**] | A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | (optional) defaults to undefined
 **before** | [**string**] | A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | (optional) defaults to undefined
 **filter** | [**&#39;in_progress&#39; | &#39;completed&#39; | &#39;failed&#39; | &#39;cancelled&#39;**]**Array<&#39;in_progress&#39; &#124; &#39;completed&#39; &#124; &#39;failed&#39; &#124; &#39;cancelled&#39;>** | Filter by file status. One of &#x60;in_progress&#x60;, &#x60;completed&#x60;, &#x60;failed&#x60;, &#x60;cancelled&#x60;. | (optional) defaults to undefined


### Return type

**ListVectorStoreFilesResponse**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **listVectorStores**
> ListVectorStoresResponse listVectorStores()


### Example


```typescript
import { createConfiguration, VectorStoresApi } from '';
import type { VectorStoresApiListVectorStoresRequest } from '';

const configuration = createConfiguration();
const apiInstance = new VectorStoresApi(configuration);

const request: VectorStoresApiListVectorStoresRequest = {
    // A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional)
  limit: 20,
    // Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order.  (optional)
  order: "desc",
    // A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (optional)
  after: "after_example",
    // A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list.  (optional)
  before: "before_example",
};

const data = await apiInstance.listVectorStores(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | [**number**] | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | (optional) defaults to 20
 **order** | [**&#39;asc&#39; | &#39;desc&#39;**]**Array<&#39;asc&#39; &#124; &#39;desc&#39;>** | Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  | (optional) defaults to 'desc'
 **after** | [**string**] | A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | (optional) defaults to undefined
 **before** | [**string**] | A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | (optional) defaults to undefined


### Return type

**ListVectorStoresResponse**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **modifyVectorStore**
> VectorStoreObject modifyVectorStore(updateVectorStoreRequest)


### Example


```typescript
import { createConfiguration, VectorStoresApi } from '';
import type { VectorStoresApiModifyVectorStoreRequest } from '';

const configuration = createConfiguration();
const apiInstance = new VectorStoresApi(configuration);

const request: VectorStoresApiModifyVectorStoreRequest = {
    // The ID of the vector store to modify.
  vectorStoreId: "vector_store_id_example",
  
  updateVectorStoreRequest: {
    name: "name_example",
    expiresAfter: {
      anchor: "last_active_at",
      days: 1,
    },
    metadata: {},
  },
};

const data = await apiInstance.modifyVectorStore(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **updateVectorStoreRequest** | **UpdateVectorStoreRequest**|  |
 **vectorStoreId** | [**string**] | The ID of the vector store to modify. | defaults to undefined


### Return type

**VectorStoreObject**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)


