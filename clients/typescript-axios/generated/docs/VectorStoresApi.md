# VectorStoresApi

All URIs are relative to *https://api.openai.com/v1*

|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|[**cancelVectorStoreFileBatch**](#cancelvectorstorefilebatch) | **POST** /vector_stores/{vector_store_id}/file_batches/{batch_id}/cancel | Cancel a vector store file batch. This attempts to cancel the processing of files in this batch as soon as possible.|
|[**createVectorStore**](#createvectorstore) | **POST** /vector_stores | Create a vector store.|
|[**createVectorStoreFile**](#createvectorstorefile) | **POST** /vector_stores/{vector_store_id}/files | Create a vector store file by attaching a [File](/docs/api-reference/files) to a [vector store](/docs/api-reference/vector-stores/object).|
|[**createVectorStoreFileBatch**](#createvectorstorefilebatch) | **POST** /vector_stores/{vector_store_id}/file_batches | Create a vector store file batch.|
|[**deleteVectorStore**](#deletevectorstore) | **DELETE** /vector_stores/{vector_store_id} | Delete a vector store.|
|[**deleteVectorStoreFile**](#deletevectorstorefile) | **DELETE** /vector_stores/{vector_store_id}/files/{file_id} | Delete a vector store file. This will remove the file from the vector store but the file itself will not be deleted. To delete the file, use the [delete file](/docs/api-reference/files/delete) endpoint.|
|[**getVectorStore**](#getvectorstore) | **GET** /vector_stores/{vector_store_id} | Retrieves a vector store.|
|[**getVectorStoreFile**](#getvectorstorefile) | **GET** /vector_stores/{vector_store_id}/files/{file_id} | Retrieves a vector store file.|
|[**getVectorStoreFileBatch**](#getvectorstorefilebatch) | **GET** /vector_stores/{vector_store_id}/file_batches/{batch_id} | Retrieves a vector store file batch.|
|[**listFilesInVectorStoreBatch**](#listfilesinvectorstorebatch) | **GET** /vector_stores/{vector_store_id}/file_batches/{batch_id}/files | Returns a list of vector store files in a batch.|
|[**listVectorStoreFiles**](#listvectorstorefiles) | **GET** /vector_stores/{vector_store_id}/files | Returns a list of vector store files.|
|[**listVectorStores**](#listvectorstores) | **GET** /vector_stores | Returns a list of vector stores.|
|[**modifyVectorStore**](#modifyvectorstore) | **POST** /vector_stores/{vector_store_id} | Modifies a vector store.|

# **cancelVectorStoreFileBatch**
> VectorStoreFileBatchObject cancelVectorStoreFileBatch()


### Example

```typescript
import {
    VectorStoresApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new VectorStoresApi(configuration);

let vectorStoreId: string; //The ID of the vector store that the file batch belongs to. (default to undefined)
let batchId: string; //The ID of the file batch to cancel. (default to undefined)

const { status, data } = await apiInstance.cancelVectorStoreFileBatch(
    vectorStoreId,
    batchId
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **vectorStoreId** | [**string**] | The ID of the vector store that the file batch belongs to. | defaults to undefined|
| **batchId** | [**string**] | The ID of the file batch to cancel. | defaults to undefined|


### Return type

**VectorStoreFileBatchObject**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **createVectorStore**
> VectorStoreObject createVectorStore(createVectorStoreRequest)


### Example

```typescript
import {
    VectorStoresApi,
    Configuration,
    CreateVectorStoreRequest
} from './api';

const configuration = new Configuration();
const apiInstance = new VectorStoresApi(configuration);

let createVectorStoreRequest: CreateVectorStoreRequest; //

const { status, data } = await apiInstance.createVectorStore(
    createVectorStoreRequest
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **createVectorStoreRequest** | **CreateVectorStoreRequest**|  | |


### Return type

**VectorStoreObject**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **createVectorStoreFile**
> VectorStoreFileObject createVectorStoreFile(createVectorStoreFileRequest)


### Example

```typescript
import {
    VectorStoresApi,
    Configuration,
    CreateVectorStoreFileRequest
} from './api';

const configuration = new Configuration();
const apiInstance = new VectorStoresApi(configuration);

let vectorStoreId: string; //The ID of the vector store for which to create a File.  (default to undefined)
let createVectorStoreFileRequest: CreateVectorStoreFileRequest; //

const { status, data } = await apiInstance.createVectorStoreFile(
    vectorStoreId,
    createVectorStoreFileRequest
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **createVectorStoreFileRequest** | **CreateVectorStoreFileRequest**|  | |
| **vectorStoreId** | [**string**] | The ID of the vector store for which to create a File.  | defaults to undefined|


### Return type

**VectorStoreFileObject**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **createVectorStoreFileBatch**
> VectorStoreFileBatchObject createVectorStoreFileBatch(createVectorStoreFileBatchRequest)


### Example

```typescript
import {
    VectorStoresApi,
    Configuration,
    CreateVectorStoreFileBatchRequest
} from './api';

const configuration = new Configuration();
const apiInstance = new VectorStoresApi(configuration);

let vectorStoreId: string; //The ID of the vector store for which to create a File Batch.  (default to undefined)
let createVectorStoreFileBatchRequest: CreateVectorStoreFileBatchRequest; //

const { status, data } = await apiInstance.createVectorStoreFileBatch(
    vectorStoreId,
    createVectorStoreFileBatchRequest
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **createVectorStoreFileBatchRequest** | **CreateVectorStoreFileBatchRequest**|  | |
| **vectorStoreId** | [**string**] | The ID of the vector store for which to create a File Batch.  | defaults to undefined|


### Return type

**VectorStoreFileBatchObject**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **deleteVectorStore**
> DeleteVectorStoreResponse deleteVectorStore()


### Example

```typescript
import {
    VectorStoresApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new VectorStoresApi(configuration);

let vectorStoreId: string; //The ID of the vector store to delete. (default to undefined)

const { status, data } = await apiInstance.deleteVectorStore(
    vectorStoreId
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **vectorStoreId** | [**string**] | The ID of the vector store to delete. | defaults to undefined|


### Return type

**DeleteVectorStoreResponse**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **deleteVectorStoreFile**
> DeleteVectorStoreFileResponse deleteVectorStoreFile()


### Example

```typescript
import {
    VectorStoresApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new VectorStoresApi(configuration);

let vectorStoreId: string; //The ID of the vector store that the file belongs to. (default to undefined)
let fileId: string; //The ID of the file to delete. (default to undefined)

const { status, data } = await apiInstance.deleteVectorStoreFile(
    vectorStoreId,
    fileId
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **vectorStoreId** | [**string**] | The ID of the vector store that the file belongs to. | defaults to undefined|
| **fileId** | [**string**] | The ID of the file to delete. | defaults to undefined|


### Return type

**DeleteVectorStoreFileResponse**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getVectorStore**
> VectorStoreObject getVectorStore()


### Example

```typescript
import {
    VectorStoresApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new VectorStoresApi(configuration);

let vectorStoreId: string; //The ID of the vector store to retrieve. (default to undefined)

const { status, data } = await apiInstance.getVectorStore(
    vectorStoreId
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **vectorStoreId** | [**string**] | The ID of the vector store to retrieve. | defaults to undefined|


### Return type

**VectorStoreObject**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getVectorStoreFile**
> VectorStoreFileObject getVectorStoreFile()


### Example

```typescript
import {
    VectorStoresApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new VectorStoresApi(configuration);

let vectorStoreId: string; //The ID of the vector store that the file belongs to. (default to undefined)
let fileId: string; //The ID of the file being retrieved. (default to undefined)

const { status, data } = await apiInstance.getVectorStoreFile(
    vectorStoreId,
    fileId
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **vectorStoreId** | [**string**] | The ID of the vector store that the file belongs to. | defaults to undefined|
| **fileId** | [**string**] | The ID of the file being retrieved. | defaults to undefined|


### Return type

**VectorStoreFileObject**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getVectorStoreFileBatch**
> VectorStoreFileBatchObject getVectorStoreFileBatch()


### Example

```typescript
import {
    VectorStoresApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new VectorStoresApi(configuration);

let vectorStoreId: string; //The ID of the vector store that the file batch belongs to. (default to undefined)
let batchId: string; //The ID of the file batch being retrieved. (default to undefined)

const { status, data } = await apiInstance.getVectorStoreFileBatch(
    vectorStoreId,
    batchId
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **vectorStoreId** | [**string**] | The ID of the vector store that the file batch belongs to. | defaults to undefined|
| **batchId** | [**string**] | The ID of the file batch being retrieved. | defaults to undefined|


### Return type

**VectorStoreFileBatchObject**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **listFilesInVectorStoreBatch**
> ListVectorStoreFilesResponse listFilesInVectorStoreBatch()


### Example

```typescript
import {
    VectorStoresApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new VectorStoresApi(configuration);

let vectorStoreId: string; //The ID of the vector store that the files belong to. (default to undefined)
let batchId: string; //The ID of the file batch that the files belong to. (default to undefined)
let limit: number; //A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional) (default to 20)
let order: 'asc' | 'desc'; //Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order.  (optional) (default to 'desc')
let after: string; //A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (optional) (default to undefined)
let before: string; //A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list.  (optional) (default to undefined)
let filter: 'in_progress' | 'completed' | 'failed' | 'cancelled'; //Filter by file status. One of `in_progress`, `completed`, `failed`, `cancelled`. (optional) (default to undefined)

const { status, data } = await apiInstance.listFilesInVectorStoreBatch(
    vectorStoreId,
    batchId,
    limit,
    order,
    after,
    before,
    filter
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **vectorStoreId** | [**string**] | The ID of the vector store that the files belong to. | defaults to undefined|
| **batchId** | [**string**] | The ID of the file batch that the files belong to. | defaults to undefined|
| **limit** | [**number**] | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | (optional) defaults to 20|
| **order** | [**&#39;asc&#39; | &#39;desc&#39;**]**Array<&#39;asc&#39; &#124; &#39;desc&#39;>** | Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  | (optional) defaults to 'desc'|
| **after** | [**string**] | A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | (optional) defaults to undefined|
| **before** | [**string**] | A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | (optional) defaults to undefined|
| **filter** | [**&#39;in_progress&#39; | &#39;completed&#39; | &#39;failed&#39; | &#39;cancelled&#39;**]**Array<&#39;in_progress&#39; &#124; &#39;completed&#39; &#124; &#39;failed&#39; &#124; &#39;cancelled&#39;>** | Filter by file status. One of &#x60;in_progress&#x60;, &#x60;completed&#x60;, &#x60;failed&#x60;, &#x60;cancelled&#x60;. | (optional) defaults to undefined|


### Return type

**ListVectorStoreFilesResponse**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **listVectorStoreFiles**
> ListVectorStoreFilesResponse listVectorStoreFiles()


### Example

```typescript
import {
    VectorStoresApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new VectorStoresApi(configuration);

let vectorStoreId: string; //The ID of the vector store that the files belong to. (default to undefined)
let limit: number; //A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional) (default to 20)
let order: 'asc' | 'desc'; //Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order.  (optional) (default to 'desc')
let after: string; //A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (optional) (default to undefined)
let before: string; //A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list.  (optional) (default to undefined)
let filter: 'in_progress' | 'completed' | 'failed' | 'cancelled'; //Filter by file status. One of `in_progress`, `completed`, `failed`, `cancelled`. (optional) (default to undefined)

const { status, data } = await apiInstance.listVectorStoreFiles(
    vectorStoreId,
    limit,
    order,
    after,
    before,
    filter
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **vectorStoreId** | [**string**] | The ID of the vector store that the files belong to. | defaults to undefined|
| **limit** | [**number**] | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | (optional) defaults to 20|
| **order** | [**&#39;asc&#39; | &#39;desc&#39;**]**Array<&#39;asc&#39; &#124; &#39;desc&#39;>** | Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  | (optional) defaults to 'desc'|
| **after** | [**string**] | A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | (optional) defaults to undefined|
| **before** | [**string**] | A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | (optional) defaults to undefined|
| **filter** | [**&#39;in_progress&#39; | &#39;completed&#39; | &#39;failed&#39; | &#39;cancelled&#39;**]**Array<&#39;in_progress&#39; &#124; &#39;completed&#39; &#124; &#39;failed&#39; &#124; &#39;cancelled&#39;>** | Filter by file status. One of &#x60;in_progress&#x60;, &#x60;completed&#x60;, &#x60;failed&#x60;, &#x60;cancelled&#x60;. | (optional) defaults to undefined|


### Return type

**ListVectorStoreFilesResponse**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **listVectorStores**
> ListVectorStoresResponse listVectorStores()


### Example

```typescript
import {
    VectorStoresApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new VectorStoresApi(configuration);

let limit: number; //A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional) (default to 20)
let order: 'asc' | 'desc'; //Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order.  (optional) (default to 'desc')
let after: string; //A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (optional) (default to undefined)
let before: string; //A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list.  (optional) (default to undefined)

const { status, data } = await apiInstance.listVectorStores(
    limit,
    order,
    after,
    before
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **limit** | [**number**] | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | (optional) defaults to 20|
| **order** | [**&#39;asc&#39; | &#39;desc&#39;**]**Array<&#39;asc&#39; &#124; &#39;desc&#39;>** | Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  | (optional) defaults to 'desc'|
| **after** | [**string**] | A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | (optional) defaults to undefined|
| **before** | [**string**] | A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | (optional) defaults to undefined|


### Return type

**ListVectorStoresResponse**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **modifyVectorStore**
> VectorStoreObject modifyVectorStore(updateVectorStoreRequest)


### Example

```typescript
import {
    VectorStoresApi,
    Configuration,
    UpdateVectorStoreRequest
} from './api';

const configuration = new Configuration();
const apiInstance = new VectorStoresApi(configuration);

let vectorStoreId: string; //The ID of the vector store to modify. (default to undefined)
let updateVectorStoreRequest: UpdateVectorStoreRequest; //

const { status, data } = await apiInstance.modifyVectorStore(
    vectorStoreId,
    updateVectorStoreRequest
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **updateVectorStoreRequest** | **UpdateVectorStoreRequest**|  | |
| **vectorStoreId** | [**string**] | The ID of the vector store to modify. | defaults to undefined|


### Return type

**VectorStoreObject**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

