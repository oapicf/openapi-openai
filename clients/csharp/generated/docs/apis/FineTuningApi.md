# Org.OpenAPITools.Api.FineTuningApi

All URIs are relative to *https://api.openai.com/v1*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**CancelFineTuningJob**](FineTuningApi.md#cancelfinetuningjob) | **POST** /fine_tuning/jobs/{fine_tuning_job_id}/cancel | Immediately cancel a fine-tune job.  |
| [**CreateFineTuningJob**](FineTuningApi.md#createfinetuningjob) | **POST** /fine_tuning/jobs | Creates a fine-tuning job which begins the process of creating a new model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about fine-tuning](/docs/guides/fine-tuning)  |
| [**ListFineTuningEvents**](FineTuningApi.md#listfinetuningevents) | **GET** /fine_tuning/jobs/{fine_tuning_job_id}/events | Get status updates for a fine-tuning job.  |
| [**ListFineTuningJobCheckpoints**](FineTuningApi.md#listfinetuningjobcheckpoints) | **GET** /fine_tuning/jobs/{fine_tuning_job_id}/checkpoints | List checkpoints for a fine-tuning job.  |
| [**ListPaginatedFineTuningJobs**](FineTuningApi.md#listpaginatedfinetuningjobs) | **GET** /fine_tuning/jobs | List your organization&#39;s fine-tuning jobs  |
| [**RetrieveFineTuningJob**](FineTuningApi.md#retrievefinetuningjob) | **GET** /fine_tuning/jobs/{fine_tuning_job_id} | Get info about a fine-tuning job.  [Learn more about fine-tuning](/docs/guides/fine-tuning)  |

<a id="cancelfinetuningjob"></a>
# **CancelFineTuningJob**
> FineTuningJob CancelFineTuningJob (string fineTuningJobId)

Immediately cancel a fine-tune job. 


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **fineTuningJobId** | **string** | The ID of the fine-tuning job to cancel.  |  |

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

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="createfinetuningjob"></a>
# **CreateFineTuningJob**
> FineTuningJob CreateFineTuningJob (CreateFineTuningJobRequest createFineTuningJobRequest)

Creates a fine-tuning job which begins the process of creating a new model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **createFineTuningJobRequest** | [**CreateFineTuningJobRequest**](CreateFineTuningJobRequest.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="listfinetuningevents"></a>
# **ListFineTuningEvents**
> ListFineTuningJobEventsResponse ListFineTuningEvents (string fineTuningJobId, string after = null, int limit = null)

Get status updates for a fine-tuning job. 


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **fineTuningJobId** | **string** | The ID of the fine-tuning job to get events for.  |  |
| **after** | **string** | Identifier for the last event from the previous pagination request. | [optional]  |
| **limit** | **int** | Number of events to retrieve. | [optional] [default to 20] |

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

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="listfinetuningjobcheckpoints"></a>
# **ListFineTuningJobCheckpoints**
> ListFineTuningJobCheckpointsResponse ListFineTuningJobCheckpoints (string fineTuningJobId, string after = null, int limit = null)

List checkpoints for a fine-tuning job. 


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **fineTuningJobId** | **string** | The ID of the fine-tuning job to get checkpoints for.  |  |
| **after** | **string** | Identifier for the last checkpoint ID from the previous pagination request. | [optional]  |
| **limit** | **int** | Number of checkpoints to retrieve. | [optional] [default to 10] |

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

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="listpaginatedfinetuningjobs"></a>
# **ListPaginatedFineTuningJobs**
> ListPaginatedFineTuningJobsResponse ListPaginatedFineTuningJobs (string after = null, int limit = null)

List your organization's fine-tuning jobs 


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **after** | **string** | Identifier for the last job from the previous pagination request. | [optional]  |
| **limit** | **int** | Number of fine-tuning jobs to retrieve. | [optional] [default to 20] |

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

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="retrievefinetuningjob"></a>
# **RetrieveFineTuningJob**
> FineTuningJob RetrieveFineTuningJob (string fineTuningJobId)

Get info about a fine-tuning job.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **fineTuningJobId** | **string** | The ID of the fine-tuning job.  |  |

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

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

