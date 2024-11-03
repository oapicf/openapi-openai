# FINETUNING_API

All URIs are relative to *https://api.openai.com/v1*

Feature | HTTP request | Description
------------- | ------------- | -------------
[**cancel_fine_tuning_job**](FINETUNING_API.md#cancel_fine_tuning_job) | **Post** /fine_tuning/jobs/{fine_tuning_job_id}/cancel | Immediately cancel a fine-tune job. 
[**create_fine_tuning_job**](FINETUNING_API.md#create_fine_tuning_job) | **Post** /fine_tuning/jobs | Creates a fine-tuning job which begins the process of creating a new model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 
[**list_fine_tuning_events**](FINETUNING_API.md#list_fine_tuning_events) | **Get** /fine_tuning/jobs/{fine_tuning_job_id}/events | Get status updates for a fine-tuning job. 
[**list_fine_tuning_job_checkpoints**](FINETUNING_API.md#list_fine_tuning_job_checkpoints) | **Get** /fine_tuning/jobs/{fine_tuning_job_id}/checkpoints | List checkpoints for a fine-tuning job. 
[**list_paginated_fine_tuning_jobs**](FINETUNING_API.md#list_paginated_fine_tuning_jobs) | **Get** /fine_tuning/jobs | List your organization&#39;s fine-tuning jobs 
[**retrieve_fine_tuning_job**](FINETUNING_API.md#retrieve_fine_tuning_job) | **Get** /fine_tuning/jobs/{fine_tuning_job_id} | Get info about a fine-tuning job.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 


# **cancel_fine_tuning_job**
> cancel_fine_tuning_job (fine_tuning_job_id: STRING_32 ): detachable FINE_TUNING_JOB


Immediately cancel a fine-tune job. 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fine_tuning_job_id** | **STRING_32**| The ID of the fine-tuning job to cancel.  | [default to null]

### Return type

[**FINE_TUNING_JOB**](FineTuningJob.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_fine_tuning_job**
> create_fine_tuning_job (create_fine_tuning_job_request: CREATE_FINE_TUNING_JOB_REQUEST ): detachable FINE_TUNING_JOB


Creates a fine-tuning job which begins the process of creating a new model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **create_fine_tuning_job_request** | [**CREATE_FINE_TUNING_JOB_REQUEST**](CREATE_FINE_TUNING_JOB_REQUEST.md)|  | 

### Return type

[**FINE_TUNING_JOB**](FineTuningJob.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_fine_tuning_events**
> list_fine_tuning_events (fine_tuning_job_id: STRING_32 ; after:  detachable STRING_32 ; limit:  detachable INTEGER_32 ): detachable LIST_FINE_TUNING_JOB_EVENTS_RESPONSE


Get status updates for a fine-tuning job. 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fine_tuning_job_id** | **STRING_32**| The ID of the fine-tuning job to get events for.  | [default to null]
 **after** | **STRING_32**| Identifier for the last event from the previous pagination request. | [optional] [default to null]
 **limit** | **INTEGER_32**| Number of events to retrieve. | [optional] [default to 20]

### Return type

[**LIST_FINE_TUNING_JOB_EVENTS_RESPONSE**](ListFineTuningJobEventsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_fine_tuning_job_checkpoints**
> list_fine_tuning_job_checkpoints (fine_tuning_job_id: STRING_32 ; after:  detachable STRING_32 ; limit:  detachable INTEGER_32 ): detachable LIST_FINE_TUNING_JOB_CHECKPOINTS_RESPONSE


List checkpoints for a fine-tuning job. 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fine_tuning_job_id** | **STRING_32**| The ID of the fine-tuning job to get checkpoints for.  | [default to null]
 **after** | **STRING_32**| Identifier for the last checkpoint ID from the previous pagination request. | [optional] [default to null]
 **limit** | **INTEGER_32**| Number of checkpoints to retrieve. | [optional] [default to 10]

### Return type

[**LIST_FINE_TUNING_JOB_CHECKPOINTS_RESPONSE**](ListFineTuningJobCheckpointsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_paginated_fine_tuning_jobs**
> list_paginated_fine_tuning_jobs (after:  detachable STRING_32 ; limit:  detachable INTEGER_32 ): detachable LIST_PAGINATED_FINE_TUNING_JOBS_RESPONSE


List your organization's fine-tuning jobs 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **after** | **STRING_32**| Identifier for the last job from the previous pagination request. | [optional] [default to null]
 **limit** | **INTEGER_32**| Number of fine-tuning jobs to retrieve. | [optional] [default to 20]

### Return type

[**LIST_PAGINATED_FINE_TUNING_JOBS_RESPONSE**](ListPaginatedFineTuningJobsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **retrieve_fine_tuning_job**
> retrieve_fine_tuning_job (fine_tuning_job_id: STRING_32 ): detachable FINE_TUNING_JOB


Get info about a fine-tuning job.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fine_tuning_job_id** | **STRING_32**| The ID of the fine-tuning job.  | [default to null]

### Return type

[**FINE_TUNING_JOB**](FineTuningJob.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

