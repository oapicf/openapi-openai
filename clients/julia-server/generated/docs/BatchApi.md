# BatchApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancel_batch**](BatchApi.md#cancel_batch) | **POST** /batches/{batch_id}/cancel | Cancels an in-progress batch. The batch will be in status &#x60;cancelling&#x60; for up to 10 minutes, before changing to &#x60;cancelled&#x60;, where it will have partial results (if any) available in the output file.
[**create_batch**](BatchApi.md#create_batch) | **POST** /batches | Creates and executes a batch from an uploaded file of requests
[**list_batches**](BatchApi.md#list_batches) | **GET** /batches | List your organization&#39;s batches.
[**retrieve_batch**](BatchApi.md#retrieve_batch) | **GET** /batches/{batch_id} | Retrieves a batch.


# **cancel_batch**
> `cancel_batch`(req::`HTTP.Request`, `batch_id`::`String`;) -> `Batch`

Cancels an in-progress batch. The batch will be in status `cancelling` for up to 10 minutes, before changing to `cancelled`, where it will have partial results (if any) available in the output file.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`batch_id`** | **`String`**| The ID of the batch to cancel. |

### Return type

[**`Batch`**](Batch.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_batch**
> `create_batch`(req::`HTTP.Request`, `create_batch_request`::`CreateBatchRequest`;) -> `Batch`

Creates and executes a batch from an uploaded file of requests

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`create_batch_request`** | [**`CreateBatchRequest`**](CreateBatchRequest.md)|  |

### Return type

[**`Batch`**](Batch.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_batches**
> `list_batches`(req::`HTTP.Request`; `after`=nothing, `limit`=nothing,) -> `ListBatchesResponse`

List your organization's batches.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`after`** | **`String`**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [default to nothing]
 **`limit`** | **`Int64`**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [default to 20]

### Return type

[**`ListBatchesResponse`**](ListBatchesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **retrieve_batch**
> `retrieve_batch`(req::`HTTP.Request`, `batch_id`::`String`;) -> `Batch`

Retrieves a batch.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`batch_id`** | **`String`**| The ID of the batch to retrieve. |

### Return type

[**`Batch`**](Batch.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

