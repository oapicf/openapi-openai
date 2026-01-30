# VectorStoresApi

All URIs are relative to *https://api.openai.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cancelVectorStoreFileBatch**](VectorStoresApi.md#cancelvectorstorefilebatch) | **POST** /vector_stores/{vector_store_id}/file_batches/{batch_id}/cancel | Cancel a vector store file batch. This attempts to cancel the processing of files in this batch as soon as possible. |
| [**createVectorStore**](VectorStoresApi.md#createvectorstoreoperation) | **POST** /vector_stores | Create a vector store. |
| [**createVectorStoreFile**](VectorStoresApi.md#createvectorstorefileoperation) | **POST** /vector_stores/{vector_store_id}/files | Create a vector store file by attaching a [File](/docs/api-reference/files) to a [vector store](/docs/api-reference/vector-stores/object). |
| [**createVectorStoreFileBatch**](VectorStoresApi.md#createvectorstorefilebatchoperation) | **POST** /vector_stores/{vector_store_id}/file_batches | Create a vector store file batch. |
| [**deleteVectorStore**](VectorStoresApi.md#deletevectorstore) | **DELETE** /vector_stores/{vector_store_id} | Delete a vector store. |
| [**deleteVectorStoreFile**](VectorStoresApi.md#deletevectorstorefile) | **DELETE** /vector_stores/{vector_store_id}/files/{file_id} | Delete a vector store file. This will remove the file from the vector store but the file itself will not be deleted. To delete the file, use the [delete file](/docs/api-reference/files/delete) endpoint. |
| [**getVectorStore**](VectorStoresApi.md#getvectorstore) | **GET** /vector_stores/{vector_store_id} | Retrieves a vector store. |
| [**getVectorStoreFile**](VectorStoresApi.md#getvectorstorefile) | **GET** /vector_stores/{vector_store_id}/files/{file_id} | Retrieves a vector store file. |
| [**getVectorStoreFileBatch**](VectorStoresApi.md#getvectorstorefilebatch) | **GET** /vector_stores/{vector_store_id}/file_batches/{batch_id} | Retrieves a vector store file batch. |
| [**listFilesInVectorStoreBatch**](VectorStoresApi.md#listfilesinvectorstorebatch) | **GET** /vector_stores/{vector_store_id}/file_batches/{batch_id}/files | Returns a list of vector store files in a batch. |
| [**listVectorStoreFiles**](VectorStoresApi.md#listvectorstorefiles) | **GET** /vector_stores/{vector_store_id}/files | Returns a list of vector store files. |
| [**listVectorStores**](VectorStoresApi.md#listvectorstores) | **GET** /vector_stores | Returns a list of vector stores. |
| [**modifyVectorStore**](VectorStoresApi.md#modifyvectorstore) | **POST** /vector_stores/{vector_store_id} | Modifies a vector store. |



## cancelVectorStoreFileBatch

> VectorStoreFileBatchObject cancelVectorStoreFileBatch(vectorStoreId, batchId)

Cancel a vector store file batch. This attempts to cancel the processing of files in this batch as soon as possible.

### Example

```ts
import {
  Configuration,
  VectorStoresApi,
} from '';
import type { CancelVectorStoreFileBatchRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // Configure HTTP bearer authorization: ApiKeyAuth
    accessToken: "YOUR BEARER TOKEN",
  });
  const api = new VectorStoresApi(config);

  const body = {
    // string | The ID of the vector store that the file batch belongs to.
    vectorStoreId: vectorStoreId_example,
    // string | The ID of the file batch to cancel.
    batchId: batchId_example,
  } satisfies CancelVectorStoreFileBatchRequest;

  try {
    const data = await api.cancelVectorStoreFileBatch(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **vectorStoreId** | `string` | The ID of the vector store that the file batch belongs to. | [Defaults to `undefined`] |
| **batchId** | `string` | The ID of the file batch to cancel. | [Defaults to `undefined`] |

### Return type

[**VectorStoreFileBatchObject**](VectorStoreFileBatchObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## createVectorStore

> VectorStoreObject createVectorStore(createVectorStoreRequest)

Create a vector store.

### Example

```ts
import {
  Configuration,
  VectorStoresApi,
} from '';
import type { CreateVectorStoreOperationRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // Configure HTTP bearer authorization: ApiKeyAuth
    accessToken: "YOUR BEARER TOKEN",
  });
  const api = new VectorStoresApi(config);

  const body = {
    // CreateVectorStoreRequest
    createVectorStoreRequest: ...,
  } satisfies CreateVectorStoreOperationRequest;

  try {
    const data = await api.createVectorStore(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **createVectorStoreRequest** | [CreateVectorStoreRequest](CreateVectorStoreRequest.md) |  | |

### Return type

[**VectorStoreObject**](VectorStoreObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## createVectorStoreFile

> VectorStoreFileObject createVectorStoreFile(vectorStoreId, createVectorStoreFileRequest)

Create a vector store file by attaching a [File](/docs/api-reference/files) to a [vector store](/docs/api-reference/vector-stores/object).

### Example

```ts
import {
  Configuration,
  VectorStoresApi,
} from '';
import type { CreateVectorStoreFileOperationRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // Configure HTTP bearer authorization: ApiKeyAuth
    accessToken: "YOUR BEARER TOKEN",
  });
  const api = new VectorStoresApi(config);

  const body = {
    // string | The ID of the vector store for which to create a File. 
    vectorStoreId: vs_abc123,
    // CreateVectorStoreFileRequest
    createVectorStoreFileRequest: ...,
  } satisfies CreateVectorStoreFileOperationRequest;

  try {
    const data = await api.createVectorStoreFile(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **vectorStoreId** | `string` | The ID of the vector store for which to create a File.  | [Defaults to `undefined`] |
| **createVectorStoreFileRequest** | [CreateVectorStoreFileRequest](CreateVectorStoreFileRequest.md) |  | |

### Return type

[**VectorStoreFileObject**](VectorStoreFileObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## createVectorStoreFileBatch

> VectorStoreFileBatchObject createVectorStoreFileBatch(vectorStoreId, createVectorStoreFileBatchRequest)

Create a vector store file batch.

### Example

```ts
import {
  Configuration,
  VectorStoresApi,
} from '';
import type { CreateVectorStoreFileBatchOperationRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // Configure HTTP bearer authorization: ApiKeyAuth
    accessToken: "YOUR BEARER TOKEN",
  });
  const api = new VectorStoresApi(config);

  const body = {
    // string | The ID of the vector store for which to create a File Batch. 
    vectorStoreId: vs_abc123,
    // CreateVectorStoreFileBatchRequest
    createVectorStoreFileBatchRequest: ...,
  } satisfies CreateVectorStoreFileBatchOperationRequest;

  try {
    const data = await api.createVectorStoreFileBatch(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **vectorStoreId** | `string` | The ID of the vector store for which to create a File Batch.  | [Defaults to `undefined`] |
| **createVectorStoreFileBatchRequest** | [CreateVectorStoreFileBatchRequest](CreateVectorStoreFileBatchRequest.md) |  | |

### Return type

[**VectorStoreFileBatchObject**](VectorStoreFileBatchObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## deleteVectorStore

> DeleteVectorStoreResponse deleteVectorStore(vectorStoreId)

Delete a vector store.

### Example

```ts
import {
  Configuration,
  VectorStoresApi,
} from '';
import type { DeleteVectorStoreRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // Configure HTTP bearer authorization: ApiKeyAuth
    accessToken: "YOUR BEARER TOKEN",
  });
  const api = new VectorStoresApi(config);

  const body = {
    // string | The ID of the vector store to delete.
    vectorStoreId: vectorStoreId_example,
  } satisfies DeleteVectorStoreRequest;

  try {
    const data = await api.deleteVectorStore(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **vectorStoreId** | `string` | The ID of the vector store to delete. | [Defaults to `undefined`] |

### Return type

[**DeleteVectorStoreResponse**](DeleteVectorStoreResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## deleteVectorStoreFile

> DeleteVectorStoreFileResponse deleteVectorStoreFile(vectorStoreId, fileId)

Delete a vector store file. This will remove the file from the vector store but the file itself will not be deleted. To delete the file, use the [delete file](/docs/api-reference/files/delete) endpoint.

### Example

```ts
import {
  Configuration,
  VectorStoresApi,
} from '';
import type { DeleteVectorStoreFileRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // Configure HTTP bearer authorization: ApiKeyAuth
    accessToken: "YOUR BEARER TOKEN",
  });
  const api = new VectorStoresApi(config);

  const body = {
    // string | The ID of the vector store that the file belongs to.
    vectorStoreId: vectorStoreId_example,
    // string | The ID of the file to delete.
    fileId: fileId_example,
  } satisfies DeleteVectorStoreFileRequest;

  try {
    const data = await api.deleteVectorStoreFile(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **vectorStoreId** | `string` | The ID of the vector store that the file belongs to. | [Defaults to `undefined`] |
| **fileId** | `string` | The ID of the file to delete. | [Defaults to `undefined`] |

### Return type

[**DeleteVectorStoreFileResponse**](DeleteVectorStoreFileResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## getVectorStore

> VectorStoreObject getVectorStore(vectorStoreId)

Retrieves a vector store.

### Example

```ts
import {
  Configuration,
  VectorStoresApi,
} from '';
import type { GetVectorStoreRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // Configure HTTP bearer authorization: ApiKeyAuth
    accessToken: "YOUR BEARER TOKEN",
  });
  const api = new VectorStoresApi(config);

  const body = {
    // string | The ID of the vector store to retrieve.
    vectorStoreId: vectorStoreId_example,
  } satisfies GetVectorStoreRequest;

  try {
    const data = await api.getVectorStore(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **vectorStoreId** | `string` | The ID of the vector store to retrieve. | [Defaults to `undefined`] |

### Return type

[**VectorStoreObject**](VectorStoreObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## getVectorStoreFile

> VectorStoreFileObject getVectorStoreFile(vectorStoreId, fileId)

Retrieves a vector store file.

### Example

```ts
import {
  Configuration,
  VectorStoresApi,
} from '';
import type { GetVectorStoreFileRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // Configure HTTP bearer authorization: ApiKeyAuth
    accessToken: "YOUR BEARER TOKEN",
  });
  const api = new VectorStoresApi(config);

  const body = {
    // string | The ID of the vector store that the file belongs to.
    vectorStoreId: vs_abc123,
    // string | The ID of the file being retrieved.
    fileId: file-abc123,
  } satisfies GetVectorStoreFileRequest;

  try {
    const data = await api.getVectorStoreFile(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **vectorStoreId** | `string` | The ID of the vector store that the file belongs to. | [Defaults to `undefined`] |
| **fileId** | `string` | The ID of the file being retrieved. | [Defaults to `undefined`] |

### Return type

[**VectorStoreFileObject**](VectorStoreFileObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## getVectorStoreFileBatch

> VectorStoreFileBatchObject getVectorStoreFileBatch(vectorStoreId, batchId)

Retrieves a vector store file batch.

### Example

```ts
import {
  Configuration,
  VectorStoresApi,
} from '';
import type { GetVectorStoreFileBatchRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // Configure HTTP bearer authorization: ApiKeyAuth
    accessToken: "YOUR BEARER TOKEN",
  });
  const api = new VectorStoresApi(config);

  const body = {
    // string | The ID of the vector store that the file batch belongs to.
    vectorStoreId: vs_abc123,
    // string | The ID of the file batch being retrieved.
    batchId: vsfb_abc123,
  } satisfies GetVectorStoreFileBatchRequest;

  try {
    const data = await api.getVectorStoreFileBatch(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **vectorStoreId** | `string` | The ID of the vector store that the file batch belongs to. | [Defaults to `undefined`] |
| **batchId** | `string` | The ID of the file batch being retrieved. | [Defaults to `undefined`] |

### Return type

[**VectorStoreFileBatchObject**](VectorStoreFileBatchObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## listFilesInVectorStoreBatch

> ListVectorStoreFilesResponse listFilesInVectorStoreBatch(vectorStoreId, batchId, limit, order, after, before, filter)

Returns a list of vector store files in a batch.

### Example

```ts
import {
  Configuration,
  VectorStoresApi,
} from '';
import type { ListFilesInVectorStoreBatchRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // Configure HTTP bearer authorization: ApiKeyAuth
    accessToken: "YOUR BEARER TOKEN",
  });
  const api = new VectorStoresApi(config);

  const body = {
    // string | The ID of the vector store that the files belong to.
    vectorStoreId: vectorStoreId_example,
    // string | The ID of the file batch that the files belong to.
    batchId: batchId_example,
    // number | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional)
    limit: 56,
    // 'asc' | 'desc' | Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order.  (optional)
    order: order_example,
    // string | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (optional)
    after: after_example,
    // string | A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list.  (optional)
    before: before_example,
    // 'in_progress' | 'completed' | 'failed' | 'cancelled' | Filter by file status. One of `in_progress`, `completed`, `failed`, `cancelled`. (optional)
    filter: filter_example,
  } satisfies ListFilesInVectorStoreBatchRequest;

  try {
    const data = await api.listFilesInVectorStoreBatch(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **vectorStoreId** | `string` | The ID of the vector store that the files belong to. | [Defaults to `undefined`] |
| **batchId** | `string` | The ID of the file batch that the files belong to. | [Defaults to `undefined`] |
| **limit** | `number` | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [Optional] [Defaults to `20`] |
| **order** | `asc`, `desc` | Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  | [Optional] [Defaults to `&#39;desc&#39;`] [Enum: asc, desc] |
| **after** | `string` | A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [Optional] [Defaults to `undefined`] |
| **before** | `string` | A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [Optional] [Defaults to `undefined`] |
| **filter** | `in_progress`, `completed`, `failed`, `cancelled` | Filter by file status. One of &#x60;in_progress&#x60;, &#x60;completed&#x60;, &#x60;failed&#x60;, &#x60;cancelled&#x60;. | [Optional] [Defaults to `undefined`] [Enum: in_progress, completed, failed, cancelled] |

### Return type

[**ListVectorStoreFilesResponse**](ListVectorStoreFilesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## listVectorStoreFiles

> ListVectorStoreFilesResponse listVectorStoreFiles(vectorStoreId, limit, order, after, before, filter)

Returns a list of vector store files.

### Example

```ts
import {
  Configuration,
  VectorStoresApi,
} from '';
import type { ListVectorStoreFilesRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // Configure HTTP bearer authorization: ApiKeyAuth
    accessToken: "YOUR BEARER TOKEN",
  });
  const api = new VectorStoresApi(config);

  const body = {
    // string | The ID of the vector store that the files belong to.
    vectorStoreId: vectorStoreId_example,
    // number | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional)
    limit: 56,
    // 'asc' | 'desc' | Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order.  (optional)
    order: order_example,
    // string | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (optional)
    after: after_example,
    // string | A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list.  (optional)
    before: before_example,
    // 'in_progress' | 'completed' | 'failed' | 'cancelled' | Filter by file status. One of `in_progress`, `completed`, `failed`, `cancelled`. (optional)
    filter: filter_example,
  } satisfies ListVectorStoreFilesRequest;

  try {
    const data = await api.listVectorStoreFiles(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **vectorStoreId** | `string` | The ID of the vector store that the files belong to. | [Defaults to `undefined`] |
| **limit** | `number` | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [Optional] [Defaults to `20`] |
| **order** | `asc`, `desc` | Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  | [Optional] [Defaults to `&#39;desc&#39;`] [Enum: asc, desc] |
| **after** | `string` | A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [Optional] [Defaults to `undefined`] |
| **before** | `string` | A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [Optional] [Defaults to `undefined`] |
| **filter** | `in_progress`, `completed`, `failed`, `cancelled` | Filter by file status. One of &#x60;in_progress&#x60;, &#x60;completed&#x60;, &#x60;failed&#x60;, &#x60;cancelled&#x60;. | [Optional] [Defaults to `undefined`] [Enum: in_progress, completed, failed, cancelled] |

### Return type

[**ListVectorStoreFilesResponse**](ListVectorStoreFilesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## listVectorStores

> ListVectorStoresResponse listVectorStores(limit, order, after, before)

Returns a list of vector stores.

### Example

```ts
import {
  Configuration,
  VectorStoresApi,
} from '';
import type { ListVectorStoresRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // Configure HTTP bearer authorization: ApiKeyAuth
    accessToken: "YOUR BEARER TOKEN",
  });
  const api = new VectorStoresApi(config);

  const body = {
    // number | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional)
    limit: 56,
    // 'asc' | 'desc' | Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order.  (optional)
    order: order_example,
    // string | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (optional)
    after: after_example,
    // string | A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list.  (optional)
    before: before_example,
  } satisfies ListVectorStoresRequest;

  try {
    const data = await api.listVectorStores(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **limit** | `number` | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [Optional] [Defaults to `20`] |
| **order** | `asc`, `desc` | Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  | [Optional] [Defaults to `&#39;desc&#39;`] [Enum: asc, desc] |
| **after** | `string` | A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [Optional] [Defaults to `undefined`] |
| **before** | `string` | A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [Optional] [Defaults to `undefined`] |

### Return type

[**ListVectorStoresResponse**](ListVectorStoresResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## modifyVectorStore

> VectorStoreObject modifyVectorStore(vectorStoreId, updateVectorStoreRequest)

Modifies a vector store.

### Example

```ts
import {
  Configuration,
  VectorStoresApi,
} from '';
import type { ModifyVectorStoreRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // Configure HTTP bearer authorization: ApiKeyAuth
    accessToken: "YOUR BEARER TOKEN",
  });
  const api = new VectorStoresApi(config);

  const body = {
    // string | The ID of the vector store to modify.
    vectorStoreId: vectorStoreId_example,
    // UpdateVectorStoreRequest
    updateVectorStoreRequest: ...,
  } satisfies ModifyVectorStoreRequest;

  try {
    const data = await api.modifyVectorStore(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **vectorStoreId** | `string` | The ID of the vector store to modify. | [Defaults to `undefined`] |
| **updateVectorStoreRequest** | [UpdateVectorStoreRequest](UpdateVectorStoreRequest.md) |  | |

### Return type

[**VectorStoreObject**](VectorStoreObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

