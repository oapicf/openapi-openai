# BatchApi

All URIs are relative to */v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelBatch**](BatchApi.md#cancelBatch) | **POST** /batches/{batch_id}/cancel | Cancels an in-progress batch. The batch will be in status &#39;cancelling&#39; for up to 10 minutes, before changing to &#39;cancelled&#39;, where it will have partial results (if any) available in the output file.
[**createBatch**](BatchApi.md#createBatch) | **POST** /batches | Creates and executes a batch from an uploaded file of requests
[**listBatches**](BatchApi.md#listBatches) | **GET** /batches | List your organization&#39;s batches.
[**retrieveBatch**](BatchApi.md#retrieveBatch) | **GET** /batches/{batch_id} | Retrieves a batch.



## cancelBatch

Cancels an in-progress batch. The batch will be in status 'cancelling' for up to 10 minutes, before changing to 'cancelled', where it will have partial results (if any) available in the output file.

### Example

```bash
 cancelBatch batch_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **batchId** | **string** | The ID of the batch to cancel. | [default to null]

### Return type

[**Batch**](Batch.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## createBatch

Creates and executes a batch from an uploaded file of requests

### Example

```bash
 createBatch
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createBatchRequest** | [**CreateBatchRequest**](CreateBatchRequest.md) |  |

### Return type

[**Batch**](Batch.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## listBatches

List your organization's batches.

### Example

```bash
 listBatches  after=value  limit=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **after** | **string** | A cursor for use in pagination. 'after' is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. | [optional] [default to null]
 **limit** | **integer** | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. | [optional] [default to 20]

### Return type

[**ListBatchesResponse**](ListBatchesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## retrieveBatch

Retrieves a batch.

### Example

```bash
 retrieveBatch batch_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **batchId** | **string** | The ID of the batch to retrieve. | [default to null]

### Return type

[**Batch**](Batch.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

