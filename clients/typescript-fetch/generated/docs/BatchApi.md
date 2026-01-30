# BatchApi

All URIs are relative to *https://api.openai.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cancelBatch**](BatchApi.md#cancelbatch) | **POST** /batches/{batch_id}/cancel | Cancels an in-progress batch. The batch will be in status &#x60;cancelling&#x60; for up to 10 minutes, before changing to &#x60;cancelled&#x60;, where it will have partial results (if any) available in the output file. |
| [**createBatch**](BatchApi.md#createbatchoperation) | **POST** /batches | Creates and executes a batch from an uploaded file of requests |
| [**listBatches**](BatchApi.md#listbatches) | **GET** /batches | List your organization\&#39;s batches. |
| [**retrieveBatch**](BatchApi.md#retrievebatch) | **GET** /batches/{batch_id} | Retrieves a batch. |



## cancelBatch

> Batch cancelBatch(batchId)

Cancels an in-progress batch. The batch will be in status &#x60;cancelling&#x60; for up to 10 minutes, before changing to &#x60;cancelled&#x60;, where it will have partial results (if any) available in the output file.

### Example

```ts
import {
  Configuration,
  BatchApi,
} from '';
import type { CancelBatchRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // Configure HTTP bearer authorization: ApiKeyAuth
    accessToken: "YOUR BEARER TOKEN",
  });
  const api = new BatchApi(config);

  const body = {
    // string | The ID of the batch to cancel.
    batchId: batchId_example,
  } satisfies CancelBatchRequest;

  try {
    const data = await api.cancelBatch(body);
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
| **batchId** | `string` | The ID of the batch to cancel. | [Defaults to `undefined`] |

### Return type

[**Batch**](Batch.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Batch is cancelling. Returns the cancelling batch\&#39;s details. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## createBatch

> Batch createBatch(createBatchRequest)

Creates and executes a batch from an uploaded file of requests

### Example

```ts
import {
  Configuration,
  BatchApi,
} from '';
import type { CreateBatchOperationRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // Configure HTTP bearer authorization: ApiKeyAuth
    accessToken: "YOUR BEARER TOKEN",
  });
  const api = new BatchApi(config);

  const body = {
    // CreateBatchRequest
    createBatchRequest: ...,
  } satisfies CreateBatchOperationRequest;

  try {
    const data = await api.createBatch(body);
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
| **createBatchRequest** | [CreateBatchRequest](CreateBatchRequest.md) |  | |

### Return type

[**Batch**](Batch.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Batch created successfully. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## listBatches

> ListBatchesResponse listBatches(after, limit)

List your organization\&#39;s batches.

### Example

```ts
import {
  Configuration,
  BatchApi,
} from '';
import type { ListBatchesRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // Configure HTTP bearer authorization: ApiKeyAuth
    accessToken: "YOUR BEARER TOKEN",
  });
  const api = new BatchApi(config);

  const body = {
    // string | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (optional)
    after: after_example,
    // number | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional)
    limit: 56,
  } satisfies ListBatchesRequest;

  try {
    const data = await api.listBatches(body);
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
| **after** | `string` | A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [Optional] [Defaults to `undefined`] |
| **limit** | `number` | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [Optional] [Defaults to `20`] |

### Return type

[**ListBatchesResponse**](ListBatchesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Batch listed successfully. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## retrieveBatch

> Batch retrieveBatch(batchId)

Retrieves a batch.

### Example

```ts
import {
  Configuration,
  BatchApi,
} from '';
import type { RetrieveBatchRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // Configure HTTP bearer authorization: ApiKeyAuth
    accessToken: "YOUR BEARER TOKEN",
  });
  const api = new BatchApi(config);

  const body = {
    // string | The ID of the batch to retrieve.
    batchId: batchId_example,
  } satisfies RetrieveBatchRequest;

  try {
    const data = await api.retrieveBatch(body);
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
| **batchId** | `string` | The ID of the batch to retrieve. | [Defaults to `undefined`] |

### Return type

[**Batch**](Batch.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Batch retrieved successfully. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

