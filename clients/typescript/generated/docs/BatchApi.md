# .BatchApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelBatch**](BatchApi.md#cancelBatch) | **POST** /batches/{batch_id}/cancel | Cancels an in-progress batch. The batch will be in status &#x60;cancelling&#x60; for up to 10 minutes, before changing to &#x60;cancelled&#x60;, where it will have partial results (if any) available in the output file.
[**createBatch**](BatchApi.md#createBatch) | **POST** /batches | Creates and executes a batch from an uploaded file of requests
[**listBatches**](BatchApi.md#listBatches) | **GET** /batches | List your organization\&#39;s batches.
[**retrieveBatch**](BatchApi.md#retrieveBatch) | **GET** /batches/{batch_id} | Retrieves a batch.


# **cancelBatch**
> Batch cancelBatch()


### Example


```typescript
import { createConfiguration, BatchApi } from '';
import type { BatchApiCancelBatchRequest } from '';

const configuration = createConfiguration();
const apiInstance = new BatchApi(configuration);

const request: BatchApiCancelBatchRequest = {
    // The ID of the batch to cancel.
  batchId: "batch_id_example",
};

const data = await apiInstance.cancelBatch(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **batchId** | [**string**] | The ID of the batch to cancel. | defaults to undefined


### Return type

**Batch**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Batch is cancelling. Returns the cancelling batch\&#39;s details. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **createBatch**
> Batch createBatch(createBatchRequest)


### Example


```typescript
import { createConfiguration, BatchApi } from '';
import type { BatchApiCreateBatchRequest } from '';

const configuration = createConfiguration();
const apiInstance = new BatchApi(configuration);

const request: BatchApiCreateBatchRequest = {
  
  createBatchRequest: {
    inputFileId: "inputFileId_example",
    endpoint: "/v1/chat/completions",
    completionWindow: "24h",
    metadata: {
      "key": "key_example",
    },
  },
};

const data = await apiInstance.createBatch(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createBatchRequest** | **CreateBatchRequest**|  |


### Return type

**Batch**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Batch created successfully. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **listBatches**
> ListBatchesResponse listBatches()


### Example


```typescript
import { createConfiguration, BatchApi } from '';
import type { BatchApiListBatchesRequest } from '';

const configuration = createConfiguration();
const apiInstance = new BatchApi(configuration);

const request: BatchApiListBatchesRequest = {
    // A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (optional)
  after: "after_example",
    // A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional)
  limit: 20,
};

const data = await apiInstance.listBatches(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **after** | [**string**] | A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | (optional) defaults to undefined
 **limit** | [**number**] | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | (optional) defaults to 20


### Return type

**ListBatchesResponse**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Batch listed successfully. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **retrieveBatch**
> Batch retrieveBatch()


### Example


```typescript
import { createConfiguration, BatchApi } from '';
import type { BatchApiRetrieveBatchRequest } from '';

const configuration = createConfiguration();
const apiInstance = new BatchApi(configuration);

const request: BatchApiRetrieveBatchRequest = {
    // The ID of the batch to retrieve.
  batchId: "batch_id_example",
};

const data = await apiInstance.retrieveBatch(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **batchId** | [**string**] | The ID of the batch to retrieve. | defaults to undefined


### Return type

**Batch**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Batch retrieved successfully. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)


