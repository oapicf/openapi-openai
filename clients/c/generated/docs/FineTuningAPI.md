# FineTuningAPI

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**FineTuningAPI_cancelFineTuningJob**](FineTuningAPI.md#FineTuningAPI_cancelFineTuningJob) | **POST** /fine_tuning/jobs/{fine_tuning_job_id}/cancel | Immediately cancel a fine-tune job. 
[**FineTuningAPI_createFineTuningJob**](FineTuningAPI.md#FineTuningAPI_createFineTuningJob) | **POST** /fine_tuning/jobs | Creates a fine-tuning job which begins the process of creating a new model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 
[**FineTuningAPI_listFineTuningEvents**](FineTuningAPI.md#FineTuningAPI_listFineTuningEvents) | **GET** /fine_tuning/jobs/{fine_tuning_job_id}/events | Get status updates for a fine-tuning job. 
[**FineTuningAPI_listFineTuningJobCheckpoints**](FineTuningAPI.md#FineTuningAPI_listFineTuningJobCheckpoints) | **GET** /fine_tuning/jobs/{fine_tuning_job_id}/checkpoints | List checkpoints for a fine-tuning job. 
[**FineTuningAPI_listPaginatedFineTuningJobs**](FineTuningAPI.md#FineTuningAPI_listPaginatedFineTuningJobs) | **GET** /fine_tuning/jobs | List your organization&#39;s fine-tuning jobs 
[**FineTuningAPI_retrieveFineTuningJob**](FineTuningAPI.md#FineTuningAPI_retrieveFineTuningJob) | **GET** /fine_tuning/jobs/{fine_tuning_job_id} | Get info about a fine-tuning job.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 


# **FineTuningAPI_cancelFineTuningJob**
```c
// Immediately cancel a fine-tune job. 
//
fine_tuning_job_t* FineTuningAPI_cancelFineTuningJob(apiClient_t *apiClient, char *fine_tuning_job_id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**fine_tuning_job_id** | **char \*** | The ID of the fine-tuning job to cancel.  | 

### Return type

[fine_tuning_job_t](fine_tuning_job.md) *


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **FineTuningAPI_createFineTuningJob**
```c
// Creates a fine-tuning job which begins the process of creating a new model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 
//
fine_tuning_job_t* FineTuningAPI_createFineTuningJob(apiClient_t *apiClient, create_fine_tuning_job_request_t *create_fine_tuning_job_request);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**create_fine_tuning_job_request** | **[create_fine_tuning_job_request_t](create_fine_tuning_job_request.md) \*** |  | 

### Return type

[fine_tuning_job_t](fine_tuning_job.md) *


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **FineTuningAPI_listFineTuningEvents**
```c
// Get status updates for a fine-tuning job. 
//
list_fine_tuning_job_events_response_t* FineTuningAPI_listFineTuningEvents(apiClient_t *apiClient, char *fine_tuning_job_id, char *after, int *limit);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**fine_tuning_job_id** | **char \*** | The ID of the fine-tuning job to get events for.  | 
**after** | **char \*** | Identifier for the last event from the previous pagination request. | [optional] 
**limit** | **int \*** | Number of events to retrieve. | [optional] [default to 20]

### Return type

[list_fine_tuning_job_events_response_t](list_fine_tuning_job_events_response.md) *


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **FineTuningAPI_listFineTuningJobCheckpoints**
```c
// List checkpoints for a fine-tuning job. 
//
list_fine_tuning_job_checkpoints_response_t* FineTuningAPI_listFineTuningJobCheckpoints(apiClient_t *apiClient, char *fine_tuning_job_id, char *after, int *limit);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**fine_tuning_job_id** | **char \*** | The ID of the fine-tuning job to get checkpoints for.  | 
**after** | **char \*** | Identifier for the last checkpoint ID from the previous pagination request. | [optional] 
**limit** | **int \*** | Number of checkpoints to retrieve. | [optional] [default to 10]

### Return type

[list_fine_tuning_job_checkpoints_response_t](list_fine_tuning_job_checkpoints_response.md) *


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **FineTuningAPI_listPaginatedFineTuningJobs**
```c
// List your organization's fine-tuning jobs 
//
list_paginated_fine_tuning_jobs_response_t* FineTuningAPI_listPaginatedFineTuningJobs(apiClient_t *apiClient, char *after, int *limit);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**after** | **char \*** | Identifier for the last job from the previous pagination request. | [optional] 
**limit** | **int \*** | Number of fine-tuning jobs to retrieve. | [optional] [default to 20]

### Return type

[list_paginated_fine_tuning_jobs_response_t](list_paginated_fine_tuning_jobs_response.md) *


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **FineTuningAPI_retrieveFineTuningJob**
```c
// Get info about a fine-tuning job.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 
//
fine_tuning_job_t* FineTuningAPI_retrieveFineTuningJob(apiClient_t *apiClient, char *fine_tuning_job_id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**fine_tuning_job_id** | **char \*** | The ID of the fine-tuning job.  | 

### Return type

[fine_tuning_job_t](fine_tuning_job.md) *


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

