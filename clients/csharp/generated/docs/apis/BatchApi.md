# Org.OpenAPITools.Api.BatchApi

All URIs are relative to *https://api.openai.com/v1*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**CancelBatch**](BatchApi.md#cancelbatch) | **POST** /batches/{batch_id}/cancel | Cancels an in-progress batch. The batch will be in status &#x60;cancelling&#x60; for up to 10 minutes, before changing to &#x60;cancelled&#x60;, where it will have partial results (if any) available in the output file. |
| [**CreateBatch**](BatchApi.md#createbatch) | **POST** /batches | Creates and executes a batch from an uploaded file of requests |
| [**ListBatches**](BatchApi.md#listbatches) | **GET** /batches | List your organization&#39;s batches. |
| [**RetrieveBatch**](BatchApi.md#retrievebatch) | **GET** /batches/{batch_id} | Retrieves a batch. |

<a id="cancelbatch"></a>
# **CancelBatch**
> Batch CancelBatch (string batchId)

Cancels an in-progress batch. The batch will be in status `cancelling` for up to 10 minutes, before changing to `cancelled`, where it will have partial results (if any) available in the output file.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **batchId** | **string** | The ID of the batch to cancel. |  |

### Return type

[**Batch**](Batch.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Batch is cancelling. Returns the cancelling batch&#39;s details. |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="createbatch"></a>
# **CreateBatch**
> Batch CreateBatch (CreateBatchRequest createBatchRequest)

Creates and executes a batch from an uploaded file of requests


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **createBatchRequest** | [**CreateBatchRequest**](CreateBatchRequest.md) |  |  |

### Return type

[**Batch**](Batch.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Batch created successfully. |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="listbatches"></a>
# **ListBatches**
> ListBatchesResponse ListBatches (string after = null, int limit = null)

List your organization's batches.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **after** | **string** | A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional]  |
| **limit** | **int** | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20] |

### Return type

[**ListBatchesResponse**](ListBatchesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Batch listed successfully. |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="retrievebatch"></a>
# **RetrieveBatch**
> Batch RetrieveBatch (string batchId)

Retrieves a batch.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **batchId** | **string** | The ID of the batch to retrieve. |  |

### Return type

[**Batch**](Batch.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Batch retrieved successfully. |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

