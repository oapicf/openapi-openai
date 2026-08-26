# FineTuningApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancel_fine_tuning_job**](FineTuningApi.md#cancel_fine_tuning_job) | **POST** /fine_tuning/jobs/{fine_tuning_job_id}/cancel | Immediately cancel a fine-tune job. 
[**create_fine_tuning_job**](FineTuningApi.md#create_fine_tuning_job) | **POST** /fine_tuning/jobs | Creates a fine-tuning job which begins the process of creating a new model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 
[**list_fine_tuning_events**](FineTuningApi.md#list_fine_tuning_events) | **GET** /fine_tuning/jobs/{fine_tuning_job_id}/events | Get status updates for a fine-tuning job. 
[**list_fine_tuning_job_checkpoints**](FineTuningApi.md#list_fine_tuning_job_checkpoints) | **GET** /fine_tuning/jobs/{fine_tuning_job_id}/checkpoints | List checkpoints for a fine-tuning job. 
[**list_paginated_fine_tuning_jobs**](FineTuningApi.md#list_paginated_fine_tuning_jobs) | **GET** /fine_tuning/jobs | List your organization&#39;s fine-tuning jobs 
[**retrieve_fine_tuning_job**](FineTuningApi.md#retrieve_fine_tuning_job) | **GET** /fine_tuning/jobs/{fine_tuning_job_id} | Get info about a fine-tuning job.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 


# **cancel_fine_tuning_job**
> `cancel_fine_tuning_job`(_api::`FineTuningApi`, `fine_tuning_job_id`::`String`; _mediaType=nothing) -> `FineTuningJob`, `OpenAPI.Clients.ApiResponse` <br/>
> `cancel_fine_tuning_job`(_api::`FineTuningApi`, response_stream::`Channel`, `fine_tuning_job_id`::`String`; _mediaType=nothing) -> `Channel`{ `FineTuningJob` }, `OpenAPI.Clients.ApiResponse`

Immediately cancel a fine-tune job. 

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`FineTuningApi`** | API context | 
**`fine_tuning_job_id`** | **`String`** | The ID of the fine-tuning job to cancel.  |

### Return type

[**`FineTuningJob`**](FineTuningJob.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **create_fine_tuning_job**
> `create_fine_tuning_job`(_api::`FineTuningApi`, `create_fine_tuning_job_request`::`CreateFineTuningJobRequest`; _mediaType=nothing) -> `FineTuningJob`, `OpenAPI.Clients.ApiResponse` <br/>
> `create_fine_tuning_job`(_api::`FineTuningApi`, response_stream::`Channel`, `create_fine_tuning_job_request`::`CreateFineTuningJobRequest`; _mediaType=nothing) -> `Channel`{ `FineTuningJob` }, `OpenAPI.Clients.ApiResponse`

Creates a fine-tuning job which begins the process of creating a new model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`FineTuningApi`** | API context | 
**`create_fine_tuning_job_request`** | [**`CreateFineTuningJobRequest`**](CreateFineTuningJobRequest.md) |  |

### Return type

[**`FineTuningJob`**](FineTuningJob.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **list_fine_tuning_events**
> `list_fine_tuning_events`(_api::`FineTuningApi`, `fine_tuning_job_id`::`String`; `after`=nothing, `limit`=nothing, _mediaType=nothing) -> `ListFineTuningJobEventsResponse`, `OpenAPI.Clients.ApiResponse` <br/>
> `list_fine_tuning_events`(_api::`FineTuningApi`, response_stream::`Channel`, `fine_tuning_job_id`::`String`; `after`=nothing, `limit`=nothing, _mediaType=nothing) -> `Channel`{ `ListFineTuningJobEventsResponse` }, `OpenAPI.Clients.ApiResponse`

Get status updates for a fine-tuning job. 

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`FineTuningApi`** | API context | 
**`fine_tuning_job_id`** | **`String`** | The ID of the fine-tuning job to get events for.  |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`after`** | **`String`** | Identifier for the last event from the previous pagination request. | [default to nothing]
 **`limit`** | **`Int64`** | Number of events to retrieve. | [default to 20]

### Return type

[**`ListFineTuningJobEventsResponse`**](ListFineTuningJobEventsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **list_fine_tuning_job_checkpoints**
> `list_fine_tuning_job_checkpoints`(_api::`FineTuningApi`, `fine_tuning_job_id`::`String`; `after`=nothing, `limit`=nothing, _mediaType=nothing) -> `ListFineTuningJobCheckpointsResponse`, `OpenAPI.Clients.ApiResponse` <br/>
> `list_fine_tuning_job_checkpoints`(_api::`FineTuningApi`, response_stream::`Channel`, `fine_tuning_job_id`::`String`; `after`=nothing, `limit`=nothing, _mediaType=nothing) -> `Channel`{ `ListFineTuningJobCheckpointsResponse` }, `OpenAPI.Clients.ApiResponse`

List checkpoints for a fine-tuning job. 

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`FineTuningApi`** | API context | 
**`fine_tuning_job_id`** | **`String`** | The ID of the fine-tuning job to get checkpoints for.  |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`after`** | **`String`** | Identifier for the last checkpoint ID from the previous pagination request. | [default to nothing]
 **`limit`** | **`Int64`** | Number of checkpoints to retrieve. | [default to 10]

### Return type

[**`ListFineTuningJobCheckpointsResponse`**](ListFineTuningJobCheckpointsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **list_paginated_fine_tuning_jobs**
> `list_paginated_fine_tuning_jobs`(_api::`FineTuningApi`; `after`=nothing, `limit`=nothing, _mediaType=nothing) -> `ListPaginatedFineTuningJobsResponse`, `OpenAPI.Clients.ApiResponse` <br/>
> `list_paginated_fine_tuning_jobs`(_api::`FineTuningApi`, response_stream::`Channel`; `after`=nothing, `limit`=nothing, _mediaType=nothing) -> `Channel`{ `ListPaginatedFineTuningJobsResponse` }, `OpenAPI.Clients.ApiResponse`

List your organization's fine-tuning jobs 

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`FineTuningApi`** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`after`** | **`String`** | Identifier for the last job from the previous pagination request. | [default to nothing]
 **`limit`** | **`Int64`** | Number of fine-tuning jobs to retrieve. | [default to 20]

### Return type

[**`ListPaginatedFineTuningJobsResponse`**](ListPaginatedFineTuningJobsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **retrieve_fine_tuning_job**
> `retrieve_fine_tuning_job`(_api::`FineTuningApi`, `fine_tuning_job_id`::`String`; _mediaType=nothing) -> `FineTuningJob`, `OpenAPI.Clients.ApiResponse` <br/>
> `retrieve_fine_tuning_job`(_api::`FineTuningApi`, response_stream::`Channel`, `fine_tuning_job_id`::`String`; _mediaType=nothing) -> `Channel`{ `FineTuningJob` }, `OpenAPI.Clients.ApiResponse`

Get info about a fine-tuning job.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`FineTuningApi`** | API context | 
**`fine_tuning_job_id`** | **`String`** | The ID of the fine-tuning job.  |

### Return type

[**`FineTuningJob`**](FineTuningJob.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

