# FineTuningController

All URIs are relative to `"/v1"`

The controller class is defined in **[FineTuningController.java](../../src/main/java/org/openapitools/controller/FineTuningController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelFineTuningJob**](#cancelFineTuningJob) | **POST** /fine_tuning/jobs/{fine_tuning_job_id}/cancel | Immediately cancel a fine-tune job. 
[**createFineTuningJob**](#createFineTuningJob) | **POST** /fine_tuning/jobs | Creates a fine-tuning job which begins the process of creating a new model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 
[**listFineTuningEvents**](#listFineTuningEvents) | **GET** /fine_tuning/jobs/{fine_tuning_job_id}/events | Get status updates for a fine-tuning job. 
[**listFineTuningJobCheckpoints**](#listFineTuningJobCheckpoints) | **GET** /fine_tuning/jobs/{fine_tuning_job_id}/checkpoints | List checkpoints for a fine-tuning job. 
[**listPaginatedFineTuningJobs**](#listPaginatedFineTuningJobs) | **GET** /fine_tuning/jobs | List your organization&#39;s fine-tuning jobs 
[**retrieveFineTuningJob**](#retrieveFineTuningJob) | **GET** /fine_tuning/jobs/{fine_tuning_job_id} | Get info about a fine-tuning job.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 

<a id="cancelFineTuningJob"></a>
# **cancelFineTuningJob**
```java
Mono<FineTuningJob> FineTuningController.cancelFineTuningJob(fineTuningJobId)
```

Immediately cancel a fine-tune job. 

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**fineTuningJobId** | `String` | The ID of the fine-tuning job to cancel.  |

### Return type
[**FineTuningJob**](../../docs/models/FineTuningJob.md)

### Authorization
* **ApiKeyAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="createFineTuningJob"></a>
# **createFineTuningJob**
```java
Mono<FineTuningJob> FineTuningController.createFineTuningJob(createFineTuningJobRequest)
```

Creates a fine-tuning job which begins the process of creating a new model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**createFineTuningJobRequest** | [**CreateFineTuningJobRequest**](../../docs/models/CreateFineTuningJobRequest.md) |  |

### Return type
[**FineTuningJob**](../../docs/models/FineTuningJob.md)

### Authorization
* **ApiKeyAuth**

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

<a id="listFineTuningEvents"></a>
# **listFineTuningEvents**
```java
Mono<ListFineTuningJobEventsResponse> FineTuningController.listFineTuningEvents(fineTuningJobIdafterlimit)
```

Get status updates for a fine-tuning job. 

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**fineTuningJobId** | `String` | The ID of the fine-tuning job to get events for.  |
**after** | `String` | Identifier for the last event from the previous pagination request. | [optional parameter]
**limit** | `Integer` | Number of events to retrieve. | [optional parameter] [default to `20`]

### Return type
[**ListFineTuningJobEventsResponse**](../../docs/models/ListFineTuningJobEventsResponse.md)

### Authorization
* **ApiKeyAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="listFineTuningJobCheckpoints"></a>
# **listFineTuningJobCheckpoints**
```java
Mono<ListFineTuningJobCheckpointsResponse> FineTuningController.listFineTuningJobCheckpoints(fineTuningJobIdafterlimit)
```

List checkpoints for a fine-tuning job. 

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**fineTuningJobId** | `String` | The ID of the fine-tuning job to get checkpoints for.  |
**after** | `String` | Identifier for the last checkpoint ID from the previous pagination request. | [optional parameter]
**limit** | `Integer` | Number of checkpoints to retrieve. | [optional parameter] [default to `10`]

### Return type
[**ListFineTuningJobCheckpointsResponse**](../../docs/models/ListFineTuningJobCheckpointsResponse.md)

### Authorization
* **ApiKeyAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="listPaginatedFineTuningJobs"></a>
# **listPaginatedFineTuningJobs**
```java
Mono<ListPaginatedFineTuningJobsResponse> FineTuningController.listPaginatedFineTuningJobs(afterlimit)
```

List your organization&#39;s fine-tuning jobs 

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**after** | `String` | Identifier for the last job from the previous pagination request. | [optional parameter]
**limit** | `Integer` | Number of fine-tuning jobs to retrieve. | [optional parameter] [default to `20`]

### Return type
[**ListPaginatedFineTuningJobsResponse**](../../docs/models/ListPaginatedFineTuningJobsResponse.md)

### Authorization
* **ApiKeyAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="retrieveFineTuningJob"></a>
# **retrieveFineTuningJob**
```java
Mono<FineTuningJob> FineTuningController.retrieveFineTuningJob(fineTuningJobId)
```

Get info about a fine-tuning job.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**fineTuningJobId** | `String` | The ID of the fine-tuning job.  |

### Return type
[**FineTuningJob**](../../docs/models/FineTuningJob.md)

### Authorization
* **ApiKeyAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

