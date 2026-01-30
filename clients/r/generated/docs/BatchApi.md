# BatchApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CancelBatch**](BatchApi.md#CancelBatch) | **POST** /batches/{batch_id}/cancel | Cancels an in-progress batch. The batch will be in status &#x60;cancelling&#x60; for up to 10 minutes, before changing to &#x60;cancelled&#x60;, where it will have partial results (if any) available in the output file.
[**CreateBatch**](BatchApi.md#CreateBatch) | **POST** /batches | Creates and executes a batch from an uploaded file of requests
[**ListBatches**](BatchApi.md#ListBatches) | **GET** /batches | List your organization&#39;s batches.
[**RetrieveBatch**](BatchApi.md#RetrieveBatch) | **GET** /batches/{batch_id} | Retrieves a batch.


# **CancelBatch**
> Batch CancelBatch(batch_id)

Cancels an in-progress batch. The batch will be in status `cancelling` for up to 10 minutes, before changing to `cancelled`, where it will have partial results (if any) available in the output file.

### Example
```R
library(openapi)

# Cancels an in-progress batch. The batch will be in status `cancelling` for up to 10 minutes, before changing to `cancelled`, where it will have partial results (if any) available in the output file.
#
# prepare function argument(s)
var_batch_id <- "batch_id_example" # character | The ID of the batch to cancel.

api_instance <- BatchApi$new()
# Configure HTTP bearer authorization: ApiKeyAuth
api_instance$api_client$bearer_token <- Sys.getenv("BEARER_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$CancelBatch(var_batch_iddata_file = "result.txt")
result <- api_instance$CancelBatch(var_batch_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **batch_id** | **character**| The ID of the batch to cancel. | 

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

# **CreateBatch**
> Batch CreateBatch(create_batch_request)

Creates and executes a batch from an uploaded file of requests

### Example
```R
library(openapi)

# Creates and executes a batch from an uploaded file of requests
#
# prepare function argument(s)
var_create_batch_request <- createBatch_request$new("input_file_id_example", "/v1/chat/completions", "24h", c(key = "inner_example")) # CreateBatchRequest | 

api_instance <- BatchApi$new()
# Configure HTTP bearer authorization: ApiKeyAuth
api_instance$api_client$bearer_token <- Sys.getenv("BEARER_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$CreateBatch(var_create_batch_requestdata_file = "result.txt")
result <- api_instance$CreateBatch(var_create_batch_request)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **create_batch_request** | [**CreateBatchRequest**](CreateBatchRequest.md)|  | 

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

# **ListBatches**
> ListBatchesResponse ListBatches(after = var.after, limit = 20)

List your organization's batches.

### Example
```R
library(openapi)

# List your organization's batches.
#
# prepare function argument(s)
var_after <- "after_example" # character | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (Optional)
var_limit <- 20 # integer | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (Optional)

api_instance <- BatchApi$new()
# Configure HTTP bearer authorization: ApiKeyAuth
api_instance$api_client$bearer_token <- Sys.getenv("BEARER_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$ListBatches(after = var_after, limit = var_limitdata_file = "result.txt")
result <- api_instance$ListBatches(after = var_after, limit = var_limit)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **after** | **character**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] 
 **limit** | **integer**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20]

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

# **RetrieveBatch**
> Batch RetrieveBatch(batch_id)

Retrieves a batch.

### Example
```R
library(openapi)

# Retrieves a batch.
#
# prepare function argument(s)
var_batch_id <- "batch_id_example" # character | The ID of the batch to retrieve.

api_instance <- BatchApi$new()
# Configure HTTP bearer authorization: ApiKeyAuth
api_instance$api_client$bearer_token <- Sys.getenv("BEARER_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$RetrieveBatch(var_batch_iddata_file = "result.txt")
result <- api_instance$RetrieveBatch(var_batch_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **batch_id** | **character**| The ID of the batch to retrieve. | 

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

