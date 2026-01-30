# BatchApi

All URIs are relative to *https://api.openai.com/v1*

|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|[**cancelBatch**](#cancelbatch) | **POST** /batches/{batch_id}/cancel | Cancels an in-progress batch. The batch will be in status &#x60;cancelling&#x60; for up to 10 minutes, before changing to &#x60;cancelled&#x60;, where it will have partial results (if any) available in the output file.|
|[**createBatch**](#createbatch) | **POST** /batches | Creates and executes a batch from an uploaded file of requests|
|[**listBatches**](#listbatches) | **GET** /batches | List your organization\&#39;s batches.|
|[**retrieveBatch**](#retrievebatch) | **GET** /batches/{batch_id} | Retrieves a batch.|

# **cancelBatch**
> Batch cancelBatch()


### Example

```typescript
import {
    BatchApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new BatchApi(configuration);

let batchId: string; //The ID of the batch to cancel. (default to undefined)

const { status, data } = await apiInstance.cancelBatch(
    batchId
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **batchId** | [**string**] | The ID of the batch to cancel. | defaults to undefined|


### Return type

**Batch**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | Batch is cancelling. Returns the cancelling batch\&#39;s details. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **createBatch**
> Batch createBatch(createBatchRequest)


### Example

```typescript
import {
    BatchApi,
    Configuration,
    CreateBatchRequest
} from './api';

const configuration = new Configuration();
const apiInstance = new BatchApi(configuration);

let createBatchRequest: CreateBatchRequest; //

const { status, data } = await apiInstance.createBatch(
    createBatchRequest
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **createBatchRequest** | **CreateBatchRequest**|  | |


### Return type

**Batch**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | Batch created successfully. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **listBatches**
> ListBatchesResponse listBatches()


### Example

```typescript
import {
    BatchApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new BatchApi(configuration);

let after: string; //A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (optional) (default to undefined)
let limit: number; //A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional) (default to 20)

const { status, data } = await apiInstance.listBatches(
    after,
    limit
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **after** | [**string**] | A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | (optional) defaults to undefined|
| **limit** | [**number**] | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | (optional) defaults to 20|


### Return type

**ListBatchesResponse**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | Batch listed successfully. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **retrieveBatch**
> Batch retrieveBatch()


### Example

```typescript
import {
    BatchApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new BatchApi(configuration);

let batchId: string; //The ID of the batch to retrieve. (default to undefined)

const { status, data } = await apiInstance.retrieveBatch(
    batchId
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **batchId** | [**string**] | The ID of the batch to retrieve. | defaults to undefined|


### Return type

**Batch**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | Batch retrieved successfully. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

