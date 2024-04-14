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


## Creating FineTuningApi

To initiate an instance of `FineTuningApi`, you can use micronaut's `ApplicationContext`:
```java
/* imports
import io.micronaut.runtime.Micronaut;
import io.micronaut.context.ApplicationContext;
import org.openapitools.api.FineTuningApi;
*/

ApplicationContext context = Micronaut.run(/* ... */);
PetApi apiInstance = context.getBean(FineTuningApi.class);
```

Or the `@Inject` annotation:
```java
@Singleton
class MyClass {
    @Inject
    FineTuningApi fineTuningApi;

    /* ... use the injected variable */
}
```
Note that the class needs to be annotated with one of Micronaut's [scope annotations](https://docs.micronaut.io/latest/guide/#scopes) like `Singleton` in order to be processed.

More information can be found inside [Inversion of Control guide section](https://docs.micronaut.io/latest/guide/#ioc).

<a id="cancelFineTuningJob"></a>
# **cancelFineTuningJob**
```java
Mono<FineTuningJob> FineTuningApi.cancelFineTuningJob(fineTuningJobId)
```

Immediately cancel a fine-tune job. 

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **fineTuningJobId** | `String`| The ID of the fine-tuning job to cancel.  | |


### Return type
[**FineTuningJob**](FineTuningJob.md)

### Authorization
* **[ApiKeyAuth](auth.md#ApiKeyAuth)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="createFineTuningJob"></a>
# **createFineTuningJob**
```java
Mono<FineTuningJob> FineTuningApi.createFineTuningJob(createFineTuningJobRequest)
```

Creates a fine-tuning job which begins the process of creating a new model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **createFineTuningJobRequest** | [**CreateFineTuningJobRequest**](CreateFineTuningJobRequest.md)|  | |


### Return type
[**FineTuningJob**](FineTuningJob.md)

### Authorization
* **[ApiKeyAuth](auth.md#ApiKeyAuth)**

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

<a id="listFineTuningEvents"></a>
# **listFineTuningEvents**
```java
Mono<ListFineTuningJobEventsResponse> FineTuningApi.listFineTuningEvents(fineTuningJobIdafterlimit)
```

Get status updates for a fine-tuning job. 

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **fineTuningJobId** | `String`| The ID of the fine-tuning job to get events for.  | |
| **after** | `String`| Identifier for the last event from the previous pagination request. | [optional parameter] |
| **limit** | `Integer`| Number of events to retrieve. | [optional parameter] [default to `20`] |


### Return type
[**ListFineTuningJobEventsResponse**](ListFineTuningJobEventsResponse.md)

### Authorization
* **[ApiKeyAuth](auth.md#ApiKeyAuth)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="listFineTuningJobCheckpoints"></a>
# **listFineTuningJobCheckpoints**
```java
Mono<ListFineTuningJobCheckpointsResponse> FineTuningApi.listFineTuningJobCheckpoints(fineTuningJobIdafterlimit)
```

List checkpoints for a fine-tuning job. 

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **fineTuningJobId** | `String`| The ID of the fine-tuning job to get checkpoints for.  | |
| **after** | `String`| Identifier for the last checkpoint ID from the previous pagination request. | [optional parameter] |
| **limit** | `Integer`| Number of checkpoints to retrieve. | [optional parameter] [default to `10`] |


### Return type
[**ListFineTuningJobCheckpointsResponse**](ListFineTuningJobCheckpointsResponse.md)

### Authorization
* **[ApiKeyAuth](auth.md#ApiKeyAuth)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="listPaginatedFineTuningJobs"></a>
# **listPaginatedFineTuningJobs**
```java
Mono<ListPaginatedFineTuningJobsResponse> FineTuningApi.listPaginatedFineTuningJobs(afterlimit)
```

List your organization&#39;s fine-tuning jobs 

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **after** | `String`| Identifier for the last job from the previous pagination request. | [optional parameter] |
| **limit** | `Integer`| Number of fine-tuning jobs to retrieve. | [optional parameter] [default to `20`] |


### Return type
[**ListPaginatedFineTuningJobsResponse**](ListPaginatedFineTuningJobsResponse.md)

### Authorization
* **[ApiKeyAuth](auth.md#ApiKeyAuth)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="retrieveFineTuningJob"></a>
# **retrieveFineTuningJob**
```java
Mono<FineTuningJob> FineTuningApi.retrieveFineTuningJob(fineTuningJobId)
```

Get info about a fine-tuning job.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **fineTuningJobId** | `String`| The ID of the fine-tuning job.  | |


### Return type
[**FineTuningJob**](FineTuningJob.md)

### Authorization
* **[ApiKeyAuth](auth.md#ApiKeyAuth)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

