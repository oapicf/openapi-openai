# FineTuningApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelFineTuningJob**](FineTuningApi.md#cancelFineTuningJob) | **POST** /fine_tuning/jobs/{fine_tuning_job_id}/cancel | Immediately cancel a fine-tune job. 
[**createFineTuningJob**](FineTuningApi.md#createFineTuningJob) | **POST** /fine_tuning/jobs | Creates a fine-tuning job which begins the process of creating a new model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 
[**listFineTuningEvents**](FineTuningApi.md#listFineTuningEvents) | **GET** /fine_tuning/jobs/{fine_tuning_job_id}/events | Get status updates for a fine-tuning job. 
[**listFineTuningJobCheckpoints**](FineTuningApi.md#listFineTuningJobCheckpoints) | **GET** /fine_tuning/jobs/{fine_tuning_job_id}/checkpoints | List checkpoints for a fine-tuning job. 
[**listPaginatedFineTuningJobs**](FineTuningApi.md#listPaginatedFineTuningJobs) | **GET** /fine_tuning/jobs | List your organization&#39;s fine-tuning jobs 
[**retrieveFineTuningJob**](FineTuningApi.md#retrieveFineTuningJob) | **GET** /fine_tuning/jobs/{fine_tuning_job_id} | Get info about a fine-tuning job.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 


<a id="cancelFineTuningJob"></a>
# **cancelFineTuningJob**
> FineTuningJob cancelFineTuningJob(fineTuningJobId)

Immediately cancel a fine-tune job. 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FineTuningApi()
val fineTuningJobId : kotlin.String = ft-AF1WoRqd3aJAHsqc9NY7iL8F // kotlin.String | The ID of the fine-tuning job to cancel. 
try {
    val result : FineTuningJob = apiInstance.cancelFineTuningJob(fineTuningJobId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FineTuningApi#cancelFineTuningJob")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FineTuningApi#cancelFineTuningJob")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fineTuningJobId** | **kotlin.String**| The ID of the fine-tuning job to cancel.  |

### Return type

[**FineTuningJob**](FineTuningJob.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="createFineTuningJob"></a>
# **createFineTuningJob**
> FineTuningJob createFineTuningJob(createFineTuningJobRequest)

Creates a fine-tuning job which begins the process of creating a new model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FineTuningApi()
val createFineTuningJobRequest : CreateFineTuningJobRequest =  // CreateFineTuningJobRequest | 
try {
    val result : FineTuningJob = apiInstance.createFineTuningJob(createFineTuningJobRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FineTuningApi#createFineTuningJob")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FineTuningApi#createFineTuningJob")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createFineTuningJobRequest** | [**CreateFineTuningJobRequest**](CreateFineTuningJobRequest.md)|  |

### Return type

[**FineTuningJob**](FineTuningJob.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="listFineTuningEvents"></a>
# **listFineTuningEvents**
> ListFineTuningJobEventsResponse listFineTuningEvents(fineTuningJobId, after, limit)

Get status updates for a fine-tuning job. 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FineTuningApi()
val fineTuningJobId : kotlin.String = ft-AF1WoRqd3aJAHsqc9NY7iL8F // kotlin.String | The ID of the fine-tuning job to get events for. 
val after : kotlin.String = after_example // kotlin.String | Identifier for the last event from the previous pagination request.
val limit : kotlin.Int = 56 // kotlin.Int | Number of events to retrieve.
try {
    val result : ListFineTuningJobEventsResponse = apiInstance.listFineTuningEvents(fineTuningJobId, after, limit)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FineTuningApi#listFineTuningEvents")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FineTuningApi#listFineTuningEvents")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fineTuningJobId** | **kotlin.String**| The ID of the fine-tuning job to get events for.  |
 **after** | **kotlin.String**| Identifier for the last event from the previous pagination request. | [optional]
 **limit** | **kotlin.Int**| Number of events to retrieve. | [optional] [default to 20]

### Return type

[**ListFineTuningJobEventsResponse**](ListFineTuningJobEventsResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="listFineTuningJobCheckpoints"></a>
# **listFineTuningJobCheckpoints**
> ListFineTuningJobCheckpointsResponse listFineTuningJobCheckpoints(fineTuningJobId, after, limit)

List checkpoints for a fine-tuning job. 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FineTuningApi()
val fineTuningJobId : kotlin.String = ft-AF1WoRqd3aJAHsqc9NY7iL8F // kotlin.String | The ID of the fine-tuning job to get checkpoints for. 
val after : kotlin.String = after_example // kotlin.String | Identifier for the last checkpoint ID from the previous pagination request.
val limit : kotlin.Int = 56 // kotlin.Int | Number of checkpoints to retrieve.
try {
    val result : ListFineTuningJobCheckpointsResponse = apiInstance.listFineTuningJobCheckpoints(fineTuningJobId, after, limit)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FineTuningApi#listFineTuningJobCheckpoints")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FineTuningApi#listFineTuningJobCheckpoints")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fineTuningJobId** | **kotlin.String**| The ID of the fine-tuning job to get checkpoints for.  |
 **after** | **kotlin.String**| Identifier for the last checkpoint ID from the previous pagination request. | [optional]
 **limit** | **kotlin.Int**| Number of checkpoints to retrieve. | [optional] [default to 10]

### Return type

[**ListFineTuningJobCheckpointsResponse**](ListFineTuningJobCheckpointsResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="listPaginatedFineTuningJobs"></a>
# **listPaginatedFineTuningJobs**
> ListPaginatedFineTuningJobsResponse listPaginatedFineTuningJobs(after, limit)

List your organization&#39;s fine-tuning jobs 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FineTuningApi()
val after : kotlin.String = after_example // kotlin.String | Identifier for the last job from the previous pagination request.
val limit : kotlin.Int = 56 // kotlin.Int | Number of fine-tuning jobs to retrieve.
try {
    val result : ListPaginatedFineTuningJobsResponse = apiInstance.listPaginatedFineTuningJobs(after, limit)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FineTuningApi#listPaginatedFineTuningJobs")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FineTuningApi#listPaginatedFineTuningJobs")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **after** | **kotlin.String**| Identifier for the last job from the previous pagination request. | [optional]
 **limit** | **kotlin.Int**| Number of fine-tuning jobs to retrieve. | [optional] [default to 20]

### Return type

[**ListPaginatedFineTuningJobsResponse**](ListPaginatedFineTuningJobsResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="retrieveFineTuningJob"></a>
# **retrieveFineTuningJob**
> FineTuningJob retrieveFineTuningJob(fineTuningJobId)

Get info about a fine-tuning job.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FineTuningApi()
val fineTuningJobId : kotlin.String = ft-AF1WoRqd3aJAHsqc9NY7iL8F // kotlin.String | The ID of the fine-tuning job. 
try {
    val result : FineTuningJob = apiInstance.retrieveFineTuningJob(fineTuningJobId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FineTuningApi#retrieveFineTuningJob")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FineTuningApi#retrieveFineTuningJob")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fineTuningJobId** | **kotlin.String**| The ID of the fine-tuning job.  |

### Return type

[**FineTuningJob**](FineTuningJob.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

