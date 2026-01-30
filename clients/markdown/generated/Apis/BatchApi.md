# BatchApi

All URIs are relative to *https://api.openai.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cancelBatch**](BatchApi.md#cancelBatch) | **POST** /batches/{batch_id}/cancel | Cancels an in-progress batch. The batch will be in status &#x60;cancelling&#x60; for up to 10 minutes, before changing to &#x60;cancelled&#x60;, where it will have partial results (if any) available in the output file. |
| [**createBatch**](BatchApi.md#createBatch) | **POST** /batches | Creates and executes a batch from an uploaded file of requests |
| [**listBatches**](BatchApi.md#listBatches) | **GET** /batches | List your organization&#39;s batches. |
| [**retrieveBatch**](BatchApi.md#retrieveBatch) | **GET** /batches/{batch_id} | Retrieves a batch. |


<a name="cancelBatch"></a>
# **cancelBatch**
> Batch cancelBatch(batch\_id)

Cancels an in-progress batch. The batch will be in status &#x60;cancelling&#x60; for up to 10 minutes, before changing to &#x60;cancelled&#x60;, where it will have partial results (if any) available in the output file.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **batch\_id** | **String**| The ID of the batch to cancel. | [default to null] |

### Return type

[**Batch**](../Models/Batch.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="createBatch"></a>
# **createBatch**
> Batch createBatch(createBatch\_request)

Creates and executes a batch from an uploaded file of requests

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **createBatch\_request** | [**createBatch_request**](../Models/createBatch_request.md)|  | |

### Return type

[**Batch**](../Models/Batch.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="listBatches"></a>
# **listBatches**
> ListBatchesResponse listBatches(after, limit)

List your organization&#39;s batches.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **after** | **String**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] [default to null] |
| **limit** | **Integer**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20] |

### Return type

[**ListBatchesResponse**](../Models/ListBatchesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="retrieveBatch"></a>
# **retrieveBatch**
> Batch retrieveBatch(batch\_id)

Retrieves a batch.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **batch\_id** | **String**| The ID of the batch to retrieve. | [default to null] |

### Return type

[**Batch**](../Models/Batch.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

