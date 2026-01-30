# BATCH_API

All URIs are relative to *https://api.openai.com/v1*

Feature | HTTP request | Description
------------- | ------------- | -------------
[**cancel_batch**](BATCH_API.md#cancel_batch) | **Post** /batches/{batch_id}/cancel | Cancels an in-progress batch. The batch will be in status &#x60;cancelling&#x60; for up to 10 minutes, before changing to &#x60;cancelled&#x60;, where it will have partial results (if any) available in the output file.
[**create_batch**](BATCH_API.md#create_batch) | **Post** /batches | Creates and executes a batch from an uploaded file of requests
[**list_batches**](BATCH_API.md#list_batches) | **Get** /batches | List your organization&#39;s batches.
[**retrieve_batch**](BATCH_API.md#retrieve_batch) | **Get** /batches/{batch_id} | Retrieves a batch.


# **cancel_batch**
> cancel_batch (batch_id: STRING_32 ): detachable BATCH


Cancels an in-progress batch. The batch will be in status `cancelling` for up to 10 minutes, before changing to `cancelled`, where it will have partial results (if any) available in the output file.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **batch_id** | **STRING_32**| The ID of the batch to cancel. | [default to null]

### Return type

[**BATCH**](Batch.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_batch**
> create_batch (create_batch_request: CREATE_BATCH_REQUEST ): detachable BATCH


Creates and executes a batch from an uploaded file of requests


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **create_batch_request** | [**CREATE_BATCH_REQUEST**](CREATE_BATCH_REQUEST.md)|  | 

### Return type

[**BATCH**](Batch.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_batches**
> list_batches (after:  detachable STRING_32 ; limit:  detachable INTEGER_32 ): detachable LIST_BATCHES_RESPONSE


List your organization's batches.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **after** | **STRING_32**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] [default to null]
 **limit** | **INTEGER_32**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20]

### Return type

[**LIST_BATCHES_RESPONSE**](ListBatchesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **retrieve_batch**
> retrieve_batch (batch_id: STRING_32 ): detachable BATCH


Retrieves a batch.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **batch_id** | **STRING_32**| The ID of the batch to retrieve. | [default to null]

### Return type

[**BATCH**](Batch.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

