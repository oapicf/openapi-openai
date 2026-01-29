# FineTuningApi

All URIs are relative to *https://api.openai.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cancelFineTuningJob**](FineTuningApi.md#cancelfinetuningjob) | **POST** /fine_tuning/jobs/{fine_tuning_job_id}/cancel | Immediately cancel a fine-tune job.  |
| [**createFineTuningJob**](FineTuningApi.md#createfinetuningjoboperation) | **POST** /fine_tuning/jobs | Creates a fine-tuning job which begins the process of creating a new model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about fine-tuning](/docs/guides/fine-tuning)  |
| [**listFineTuningEvents**](FineTuningApi.md#listfinetuningevents) | **GET** /fine_tuning/jobs/{fine_tuning_job_id}/events | Get status updates for a fine-tuning job.  |
| [**listFineTuningJobCheckpoints**](FineTuningApi.md#listfinetuningjobcheckpoints) | **GET** /fine_tuning/jobs/{fine_tuning_job_id}/checkpoints | List checkpoints for a fine-tuning job.  |
| [**listPaginatedFineTuningJobs**](FineTuningApi.md#listpaginatedfinetuningjobs) | **GET** /fine_tuning/jobs | List your organization\&#39;s fine-tuning jobs  |
| [**retrieveFineTuningJob**](FineTuningApi.md#retrievefinetuningjob) | **GET** /fine_tuning/jobs/{fine_tuning_job_id} | Get info about a fine-tuning job.  [Learn more about fine-tuning](/docs/guides/fine-tuning)  |



## cancelFineTuningJob

> FineTuningJob cancelFineTuningJob(fineTuningJobId)

Immediately cancel a fine-tune job. 

### Example

```ts
import {
  Configuration,
  FineTuningApi,
} from '';
import type { CancelFineTuningJobRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // Configure HTTP bearer authorization: ApiKeyAuth
    accessToken: "YOUR BEARER TOKEN",
  });
  const api = new FineTuningApi(config);

  const body = {
    // string | The ID of the fine-tuning job to cancel. 
    fineTuningJobId: ft-AF1WoRqd3aJAHsqc9NY7iL8F,
  } satisfies CancelFineTuningJobRequest;

  try {
    const data = await api.cancelFineTuningJob(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **fineTuningJobId** | `string` | The ID of the fine-tuning job to cancel.  | [Defaults to `undefined`] |

### Return type

[**FineTuningJob**](FineTuningJob.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## createFineTuningJob

> FineTuningJob createFineTuningJob(createFineTuningJobRequest)

Creates a fine-tuning job which begins the process of creating a new model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 

### Example

```ts
import {
  Configuration,
  FineTuningApi,
} from '';
import type { CreateFineTuningJobOperationRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // Configure HTTP bearer authorization: ApiKeyAuth
    accessToken: "YOUR BEARER TOKEN",
  });
  const api = new FineTuningApi(config);

  const body = {
    // CreateFineTuningJobRequest
    createFineTuningJobRequest: ...,
  } satisfies CreateFineTuningJobOperationRequest;

  try {
    const data = await api.createFineTuningJob(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **createFineTuningJobRequest** | [CreateFineTuningJobRequest](CreateFineTuningJobRequest.md) |  | |

### Return type

[**FineTuningJob**](FineTuningJob.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## listFineTuningEvents

> ListFineTuningJobEventsResponse listFineTuningEvents(fineTuningJobId, after, limit)

Get status updates for a fine-tuning job. 

### Example

```ts
import {
  Configuration,
  FineTuningApi,
} from '';
import type { ListFineTuningEventsRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // Configure HTTP bearer authorization: ApiKeyAuth
    accessToken: "YOUR BEARER TOKEN",
  });
  const api = new FineTuningApi(config);

  const body = {
    // string | The ID of the fine-tuning job to get events for. 
    fineTuningJobId: ft-AF1WoRqd3aJAHsqc9NY7iL8F,
    // string | Identifier for the last event from the previous pagination request. (optional)
    after: after_example,
    // number | Number of events to retrieve. (optional)
    limit: 56,
  } satisfies ListFineTuningEventsRequest;

  try {
    const data = await api.listFineTuningEvents(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **fineTuningJobId** | `string` | The ID of the fine-tuning job to get events for.  | [Defaults to `undefined`] |
| **after** | `string` | Identifier for the last event from the previous pagination request. | [Optional] [Defaults to `undefined`] |
| **limit** | `number` | Number of events to retrieve. | [Optional] [Defaults to `20`] |

### Return type

[**ListFineTuningJobEventsResponse**](ListFineTuningJobEventsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## listFineTuningJobCheckpoints

> ListFineTuningJobCheckpointsResponse listFineTuningJobCheckpoints(fineTuningJobId, after, limit)

List checkpoints for a fine-tuning job. 

### Example

```ts
import {
  Configuration,
  FineTuningApi,
} from '';
import type { ListFineTuningJobCheckpointsRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // Configure HTTP bearer authorization: ApiKeyAuth
    accessToken: "YOUR BEARER TOKEN",
  });
  const api = new FineTuningApi(config);

  const body = {
    // string | The ID of the fine-tuning job to get checkpoints for. 
    fineTuningJobId: ft-AF1WoRqd3aJAHsqc9NY7iL8F,
    // string | Identifier for the last checkpoint ID from the previous pagination request. (optional)
    after: after_example,
    // number | Number of checkpoints to retrieve. (optional)
    limit: 56,
  } satisfies ListFineTuningJobCheckpointsRequest;

  try {
    const data = await api.listFineTuningJobCheckpoints(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **fineTuningJobId** | `string` | The ID of the fine-tuning job to get checkpoints for.  | [Defaults to `undefined`] |
| **after** | `string` | Identifier for the last checkpoint ID from the previous pagination request. | [Optional] [Defaults to `undefined`] |
| **limit** | `number` | Number of checkpoints to retrieve. | [Optional] [Defaults to `10`] |

### Return type

[**ListFineTuningJobCheckpointsResponse**](ListFineTuningJobCheckpointsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## listPaginatedFineTuningJobs

> ListPaginatedFineTuningJobsResponse listPaginatedFineTuningJobs(after, limit)

List your organization\&#39;s fine-tuning jobs 

### Example

```ts
import {
  Configuration,
  FineTuningApi,
} from '';
import type { ListPaginatedFineTuningJobsRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // Configure HTTP bearer authorization: ApiKeyAuth
    accessToken: "YOUR BEARER TOKEN",
  });
  const api = new FineTuningApi(config);

  const body = {
    // string | Identifier for the last job from the previous pagination request. (optional)
    after: after_example,
    // number | Number of fine-tuning jobs to retrieve. (optional)
    limit: 56,
  } satisfies ListPaginatedFineTuningJobsRequest;

  try {
    const data = await api.listPaginatedFineTuningJobs(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **after** | `string` | Identifier for the last job from the previous pagination request. | [Optional] [Defaults to `undefined`] |
| **limit** | `number` | Number of fine-tuning jobs to retrieve. | [Optional] [Defaults to `20`] |

### Return type

[**ListPaginatedFineTuningJobsResponse**](ListPaginatedFineTuningJobsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## retrieveFineTuningJob

> FineTuningJob retrieveFineTuningJob(fineTuningJobId)

Get info about a fine-tuning job.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 

### Example

```ts
import {
  Configuration,
  FineTuningApi,
} from '';
import type { RetrieveFineTuningJobRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // Configure HTTP bearer authorization: ApiKeyAuth
    accessToken: "YOUR BEARER TOKEN",
  });
  const api = new FineTuningApi(config);

  const body = {
    // string | The ID of the fine-tuning job. 
    fineTuningJobId: ft-AF1WoRqd3aJAHsqc9NY7iL8F,
  } satisfies RetrieveFineTuningJobRequest;

  try {
    const data = await api.retrieveFineTuningJob(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **fineTuningJobId** | `string` | The ID of the fine-tuning job.  | [Defaults to `undefined`] |

### Return type

[**FineTuningJob**](FineTuningJob.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

