# FineTuningApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CancelFineTuningJob**](FineTuningApi.md#CancelFineTuningJob) | **POST** /fine_tuning/jobs/{fine_tuning_job_id}/cancel | Immediately cancel a fine-tune job. 
[**CreateFineTuningJob**](FineTuningApi.md#CreateFineTuningJob) | **POST** /fine_tuning/jobs | Creates a fine-tuning job which begins the process of creating a new model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 
[**ListFineTuningEvents**](FineTuningApi.md#ListFineTuningEvents) | **GET** /fine_tuning/jobs/{fine_tuning_job_id}/events | Get status updates for a fine-tuning job. 
[**ListFineTuningJobCheckpoints**](FineTuningApi.md#ListFineTuningJobCheckpoints) | **GET** /fine_tuning/jobs/{fine_tuning_job_id}/checkpoints | List checkpoints for a fine-tuning job. 
[**ListPaginatedFineTuningJobs**](FineTuningApi.md#ListPaginatedFineTuningJobs) | **GET** /fine_tuning/jobs | List your organization&#39;s fine-tuning jobs 
[**RetrieveFineTuningJob**](FineTuningApi.md#RetrieveFineTuningJob) | **GET** /fine_tuning/jobs/{fine_tuning_job_id} | Get info about a fine-tuning job.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 


# **CancelFineTuningJob**
> FineTuningJob CancelFineTuningJob(fine_tuning_job_id)

Immediately cancel a fine-tune job. 

### Example
```R
library(openapi)

# Immediately cancel a fine-tune job. 
#
# prepare function argument(s)
var_fine_tuning_job_id <- "ft-AF1WoRqd3aJAHsqc9NY7iL8F" # character | The ID of the fine-tuning job to cancel. 

api_instance <- FineTuningApi$new()
# Configure HTTP bearer authorization: ApiKeyAuth
api_instance$api_client$bearer_token <- Sys.getenv("BEARER_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$CancelFineTuningJob(var_fine_tuning_job_iddata_file = "result.txt")
result <- api_instance$CancelFineTuningJob(var_fine_tuning_job_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fine_tuning_job_id** | **character**| The ID of the fine-tuning job to cancel.  | 

### Return type

[**FineTuningJob**](FineTuningJob.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

# **CreateFineTuningJob**
> FineTuningJob CreateFineTuningJob(create_fine_tuning_job_request)

Creates a fine-tuning job which begins the process of creating a new model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 

### Example
```R
library(openapi)

# Creates a fine-tuning job which begins the process of creating a new model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 
#
# prepare function argument(s)
var_create_fine_tuning_job_request <- CreateFineTuningJobRequest$new(CreateFineTuningJobRequest_model$new(), "training_file_example", CreateFineTuningJobRequest_hyperparameters$new(CreateFineTuningJobRequest_hyperparameters_batch_size$new(), CreateFineTuningJobRequest_hyperparameters_learning_rate_multiplier$new(), CreateFineTuningJobRequest_hyperparameters_n_epochs$new()), "suffix_example", "validation_file_example", c(CreateFineTuningJobRequest_integrations_inner$new("wandb", CreateFineTuningJobRequest_integrations_inner_wandb$new("project_example", "name_example", "entity_example", c("tags_example")))), 123) # CreateFineTuningJobRequest | 

api_instance <- FineTuningApi$new()
# Configure HTTP bearer authorization: ApiKeyAuth
api_instance$api_client$bearer_token <- Sys.getenv("BEARER_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$CreateFineTuningJob(var_create_fine_tuning_job_requestdata_file = "result.txt")
result <- api_instance$CreateFineTuningJob(var_create_fine_tuning_job_request)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **create_fine_tuning_job_request** | [**CreateFineTuningJobRequest**](CreateFineTuningJobRequest.md)|  | 

### Return type

[**FineTuningJob**](FineTuningJob.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

# **ListFineTuningEvents**
> ListFineTuningJobEventsResponse ListFineTuningEvents(fine_tuning_job_id, after = var.after, limit = 20)

Get status updates for a fine-tuning job. 

### Example
```R
library(openapi)

# Get status updates for a fine-tuning job. 
#
# prepare function argument(s)
var_fine_tuning_job_id <- "ft-AF1WoRqd3aJAHsqc9NY7iL8F" # character | The ID of the fine-tuning job to get events for. 
var_after <- "after_example" # character | Identifier for the last event from the previous pagination request. (Optional)
var_limit <- 20 # integer | Number of events to retrieve. (Optional)

api_instance <- FineTuningApi$new()
# Configure HTTP bearer authorization: ApiKeyAuth
api_instance$api_client$bearer_token <- Sys.getenv("BEARER_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$ListFineTuningEvents(var_fine_tuning_job_id, after = var_after, limit = var_limitdata_file = "result.txt")
result <- api_instance$ListFineTuningEvents(var_fine_tuning_job_id, after = var_after, limit = var_limit)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fine_tuning_job_id** | **character**| The ID of the fine-tuning job to get events for.  | 
 **after** | **character**| Identifier for the last event from the previous pagination request. | [optional] 
 **limit** | **integer**| Number of events to retrieve. | [optional] [default to 20]

### Return type

[**ListFineTuningJobEventsResponse**](ListFineTuningJobEventsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

# **ListFineTuningJobCheckpoints**
> ListFineTuningJobCheckpointsResponse ListFineTuningJobCheckpoints(fine_tuning_job_id, after = var.after, limit = 10)

List checkpoints for a fine-tuning job. 

### Example
```R
library(openapi)

# List checkpoints for a fine-tuning job. 
#
# prepare function argument(s)
var_fine_tuning_job_id <- "ft-AF1WoRqd3aJAHsqc9NY7iL8F" # character | The ID of the fine-tuning job to get checkpoints for. 
var_after <- "after_example" # character | Identifier for the last checkpoint ID from the previous pagination request. (Optional)
var_limit <- 10 # integer | Number of checkpoints to retrieve. (Optional)

api_instance <- FineTuningApi$new()
# Configure HTTP bearer authorization: ApiKeyAuth
api_instance$api_client$bearer_token <- Sys.getenv("BEARER_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$ListFineTuningJobCheckpoints(var_fine_tuning_job_id, after = var_after, limit = var_limitdata_file = "result.txt")
result <- api_instance$ListFineTuningJobCheckpoints(var_fine_tuning_job_id, after = var_after, limit = var_limit)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fine_tuning_job_id** | **character**| The ID of the fine-tuning job to get checkpoints for.  | 
 **after** | **character**| Identifier for the last checkpoint ID from the previous pagination request. | [optional] 
 **limit** | **integer**| Number of checkpoints to retrieve. | [optional] [default to 10]

### Return type

[**ListFineTuningJobCheckpointsResponse**](ListFineTuningJobCheckpointsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

# **ListPaginatedFineTuningJobs**
> ListPaginatedFineTuningJobsResponse ListPaginatedFineTuningJobs(after = var.after, limit = 20)

List your organization's fine-tuning jobs 

### Example
```R
library(openapi)

# List your organization's fine-tuning jobs 
#
# prepare function argument(s)
var_after <- "after_example" # character | Identifier for the last job from the previous pagination request. (Optional)
var_limit <- 20 # integer | Number of fine-tuning jobs to retrieve. (Optional)

api_instance <- FineTuningApi$new()
# Configure HTTP bearer authorization: ApiKeyAuth
api_instance$api_client$bearer_token <- Sys.getenv("BEARER_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$ListPaginatedFineTuningJobs(after = var_after, limit = var_limitdata_file = "result.txt")
result <- api_instance$ListPaginatedFineTuningJobs(after = var_after, limit = var_limit)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **after** | **character**| Identifier for the last job from the previous pagination request. | [optional] 
 **limit** | **integer**| Number of fine-tuning jobs to retrieve. | [optional] [default to 20]

### Return type

[**ListPaginatedFineTuningJobsResponse**](ListPaginatedFineTuningJobsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

# **RetrieveFineTuningJob**
> FineTuningJob RetrieveFineTuningJob(fine_tuning_job_id)

Get info about a fine-tuning job.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 

### Example
```R
library(openapi)

# Get info about a fine-tuning job.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 
#
# prepare function argument(s)
var_fine_tuning_job_id <- "ft-AF1WoRqd3aJAHsqc9NY7iL8F" # character | The ID of the fine-tuning job. 

api_instance <- FineTuningApi$new()
# Configure HTTP bearer authorization: ApiKeyAuth
api_instance$api_client$bearer_token <- Sys.getenv("BEARER_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$RetrieveFineTuningJob(var_fine_tuning_job_iddata_file = "result.txt")
result <- api_instance$RetrieveFineTuningJob(var_fine_tuning_job_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fine_tuning_job_id** | **character**| The ID of the fine-tuning job.  | 

### Return type

[**FineTuningJob**](FineTuningJob.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

