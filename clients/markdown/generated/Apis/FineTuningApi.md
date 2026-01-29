# FineTuningApi

All URIs are relative to *https://api.openai.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cancelFineTuningJob**](FineTuningApi.md#cancelFineTuningJob) | **POST** /fine_tuning/jobs/{fine_tuning_job_id}/cancel | Immediately cancel a fine-tune job.  |
| [**createFineTuningJob**](FineTuningApi.md#createFineTuningJob) | **POST** /fine_tuning/jobs | Creates a fine-tuning job which begins the process of creating a new model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about fine-tuning](/docs/guides/fine-tuning)  |
| [**listFineTuningEvents**](FineTuningApi.md#listFineTuningEvents) | **GET** /fine_tuning/jobs/{fine_tuning_job_id}/events | Get status updates for a fine-tuning job.  |
| [**listFineTuningJobCheckpoints**](FineTuningApi.md#listFineTuningJobCheckpoints) | **GET** /fine_tuning/jobs/{fine_tuning_job_id}/checkpoints | List checkpoints for a fine-tuning job.  |
| [**listPaginatedFineTuningJobs**](FineTuningApi.md#listPaginatedFineTuningJobs) | **GET** /fine_tuning/jobs | List your organization&#39;s fine-tuning jobs  |
| [**retrieveFineTuningJob**](FineTuningApi.md#retrieveFineTuningJob) | **GET** /fine_tuning/jobs/{fine_tuning_job_id} | Get info about a fine-tuning job.  [Learn more about fine-tuning](/docs/guides/fine-tuning)  |


<a name="cancelFineTuningJob"></a>
# **cancelFineTuningJob**
> FineTuningJob cancelFineTuningJob(fine\_tuning\_job\_id)

Immediately cancel a fine-tune job. 

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **fine\_tuning\_job\_id** | **String**| The ID of the fine-tuning job to cancel.  | [default to null] |

### Return type

[**FineTuningJob**](../Models/FineTuningJob.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="createFineTuningJob"></a>
# **createFineTuningJob**
> FineTuningJob createFineTuningJob(CreateFineTuningJobRequest)

Creates a fine-tuning job which begins the process of creating a new model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **CreateFineTuningJobRequest** | [**CreateFineTuningJobRequest**](../Models/CreateFineTuningJobRequest.md)|  | |

### Return type

[**FineTuningJob**](../Models/FineTuningJob.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="listFineTuningEvents"></a>
# **listFineTuningEvents**
> ListFineTuningJobEventsResponse listFineTuningEvents(fine\_tuning\_job\_id, after, limit)

Get status updates for a fine-tuning job. 

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **fine\_tuning\_job\_id** | **String**| The ID of the fine-tuning job to get events for.  | [default to null] |
| **after** | **String**| Identifier for the last event from the previous pagination request. | [optional] [default to null] |
| **limit** | **Integer**| Number of events to retrieve. | [optional] [default to 20] |

### Return type

[**ListFineTuningJobEventsResponse**](../Models/ListFineTuningJobEventsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="listFineTuningJobCheckpoints"></a>
# **listFineTuningJobCheckpoints**
> ListFineTuningJobCheckpointsResponse listFineTuningJobCheckpoints(fine\_tuning\_job\_id, after, limit)

List checkpoints for a fine-tuning job. 

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **fine\_tuning\_job\_id** | **String**| The ID of the fine-tuning job to get checkpoints for.  | [default to null] |
| **after** | **String**| Identifier for the last checkpoint ID from the previous pagination request. | [optional] [default to null] |
| **limit** | **Integer**| Number of checkpoints to retrieve. | [optional] [default to 10] |

### Return type

[**ListFineTuningJobCheckpointsResponse**](../Models/ListFineTuningJobCheckpointsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="listPaginatedFineTuningJobs"></a>
# **listPaginatedFineTuningJobs**
> ListPaginatedFineTuningJobsResponse listPaginatedFineTuningJobs(after, limit)

List your organization&#39;s fine-tuning jobs 

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **after** | **String**| Identifier for the last job from the previous pagination request. | [optional] [default to null] |
| **limit** | **Integer**| Number of fine-tuning jobs to retrieve. | [optional] [default to 20] |

### Return type

[**ListPaginatedFineTuningJobsResponse**](../Models/ListPaginatedFineTuningJobsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="retrieveFineTuningJob"></a>
# **retrieveFineTuningJob**
> FineTuningJob retrieveFineTuningJob(fine\_tuning\_job\_id)

Get info about a fine-tuning job.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **fine\_tuning\_job\_id** | **String**| The ID of the fine-tuning job.  | [default to null] |

### Return type

[**FineTuningJob**](../Models/FineTuningJob.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

