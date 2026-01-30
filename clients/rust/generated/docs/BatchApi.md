# \BatchApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancel_batch**](BatchApi.md#cancel_batch) | **POST** /batches/{batch_id}/cancel | Cancels an in-progress batch. The batch will be in status `cancelling` for up to 10 minutes, before changing to `cancelled`, where it will have partial results (if any) available in the output file.
[**create_batch**](BatchApi.md#create_batch) | **POST** /batches | Creates and executes a batch from an uploaded file of requests
[**list_batches**](BatchApi.md#list_batches) | **GET** /batches | List your organization's batches.
[**retrieve_batch**](BatchApi.md#retrieve_batch) | **GET** /batches/{batch_id} | Retrieves a batch.



## cancel_batch

> models::Batch cancel_batch(batch_id)
Cancels an in-progress batch. The batch will be in status `cancelling` for up to 10 minutes, before changing to `cancelled`, where it will have partial results (if any) available in the output file.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**batch_id** | **String** | The ID of the batch to cancel. | [required] |

### Return type

[**models::Batch**](Batch.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## create_batch

> models::Batch create_batch(create_batch_request)
Creates and executes a batch from an uploaded file of requests

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**create_batch_request** | [**CreateBatchRequest**](CreateBatchRequest.md) |  | [required] |

### Return type

[**models::Batch**](Batch.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## list_batches

> models::ListBatchesResponse list_batches(after, limit)
List your organization's batches.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**after** | Option<**String**> | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  |  |
**limit** | Option<**i32**> | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  |  |[default to 20]

### Return type

[**models::ListBatchesResponse**](ListBatchesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## retrieve_batch

> models::Batch retrieve_batch(batch_id)
Retrieves a batch.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**batch_id** | **String** | The ID of the batch to retrieve. | [required] |

### Return type

[**models::Batch**](Batch.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

