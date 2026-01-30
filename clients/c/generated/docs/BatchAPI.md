# BatchAPI

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**BatchAPI_cancelBatch**](BatchAPI.md#BatchAPI_cancelBatch) | **POST** /batches/{batch_id}/cancel | Cancels an in-progress batch. The batch will be in status &#x60;cancelling&#x60; for up to 10 minutes, before changing to &#x60;cancelled&#x60;, where it will have partial results (if any) available in the output file.
[**BatchAPI_createBatch**](BatchAPI.md#BatchAPI_createBatch) | **POST** /batches | Creates and executes a batch from an uploaded file of requests
[**BatchAPI_listBatches**](BatchAPI.md#BatchAPI_listBatches) | **GET** /batches | List your organization&#39;s batches.
[**BatchAPI_retrieveBatch**](BatchAPI.md#BatchAPI_retrieveBatch) | **GET** /batches/{batch_id} | Retrieves a batch.


# **BatchAPI_cancelBatch**
```c
// Cancels an in-progress batch. The batch will be in status `cancelling` for up to 10 minutes, before changing to `cancelled`, where it will have partial results (if any) available in the output file.
//
batch_t* BatchAPI_cancelBatch(apiClient_t *apiClient, char *batch_id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**batch_id** | **char \*** | The ID of the batch to cancel. | 

### Return type

[batch_t](batch.md) *


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **BatchAPI_createBatch**
```c
// Creates and executes a batch from an uploaded file of requests
//
batch_t* BatchAPI_createBatch(apiClient_t *apiClient, create_batch_request_t *create_batch_request);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**create_batch_request** | **[create_batch_request_t](create_batch_request.md) \*** |  | 

### Return type

[batch_t](batch.md) *


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **BatchAPI_listBatches**
```c
// List your organization's batches.
//
list_batches_response_t* BatchAPI_listBatches(apiClient_t *apiClient, char *after, int *limit);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**after** | **char \*** | A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] 
**limit** | **int \*** | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20]

### Return type

[list_batches_response_t](list_batches_response.md) *


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **BatchAPI_retrieveBatch**
```c
// Retrieves a batch.
//
batch_t* BatchAPI_retrieveBatch(apiClient_t *apiClient, char *batch_id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**batch_id** | **char \*** | The ID of the batch to retrieve. | 

### Return type

[batch_t](batch.md) *


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

