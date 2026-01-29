# FineTuningApi

All URIs are relative to *https://api.openai.com/v1*

|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|[**cancelFineTuningJob**](#cancelfinetuningjob) | **POST** /fine_tuning/jobs/{fine_tuning_job_id}/cancel | Immediately cancel a fine-tune job. |
|[**createFineTuningJob**](#createfinetuningjob) | **POST** /fine_tuning/jobs | Creates a fine-tuning job which begins the process of creating a new model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about fine-tuning](/docs/guides/fine-tuning) |
|[**listFineTuningEvents**](#listfinetuningevents) | **GET** /fine_tuning/jobs/{fine_tuning_job_id}/events | Get status updates for a fine-tuning job. |
|[**listFineTuningJobCheckpoints**](#listfinetuningjobcheckpoints) | **GET** /fine_tuning/jobs/{fine_tuning_job_id}/checkpoints | List checkpoints for a fine-tuning job. |
|[**listPaginatedFineTuningJobs**](#listpaginatedfinetuningjobs) | **GET** /fine_tuning/jobs | List your organization\&#39;s fine-tuning jobs |
|[**retrieveFineTuningJob**](#retrievefinetuningjob) | **GET** /fine_tuning/jobs/{fine_tuning_job_id} | Get info about a fine-tuning job.  [Learn more about fine-tuning](/docs/guides/fine-tuning) |

# **cancelFineTuningJob**
> FineTuningJob cancelFineTuningJob()


### Example

```typescript
import {
    FineTuningApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new FineTuningApi(configuration);

let fineTuningJobId: string; //The ID of the fine-tuning job to cancel.  (default to undefined)

const { status, data } = await apiInstance.cancelFineTuningJob(
    fineTuningJobId
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **fineTuningJobId** | [**string**] | The ID of the fine-tuning job to cancel.  | defaults to undefined|


### Return type

**FineTuningJob**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **createFineTuningJob**
> FineTuningJob createFineTuningJob(createFineTuningJobRequest)


### Example

```typescript
import {
    FineTuningApi,
    Configuration,
    CreateFineTuningJobRequest
} from './api';

const configuration = new Configuration();
const apiInstance = new FineTuningApi(configuration);

let createFineTuningJobRequest: CreateFineTuningJobRequest; //

const { status, data } = await apiInstance.createFineTuningJob(
    createFineTuningJobRequest
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **createFineTuningJobRequest** | **CreateFineTuningJobRequest**|  | |


### Return type

**FineTuningJob**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **listFineTuningEvents**
> ListFineTuningJobEventsResponse listFineTuningEvents()


### Example

```typescript
import {
    FineTuningApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new FineTuningApi(configuration);

let fineTuningJobId: string; //The ID of the fine-tuning job to get events for.  (default to undefined)
let after: string; //Identifier for the last event from the previous pagination request. (optional) (default to undefined)
let limit: number; //Number of events to retrieve. (optional) (default to 20)

const { status, data } = await apiInstance.listFineTuningEvents(
    fineTuningJobId,
    after,
    limit
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **fineTuningJobId** | [**string**] | The ID of the fine-tuning job to get events for.  | defaults to undefined|
| **after** | [**string**] | Identifier for the last event from the previous pagination request. | (optional) defaults to undefined|
| **limit** | [**number**] | Number of events to retrieve. | (optional) defaults to 20|


### Return type

**ListFineTuningJobEventsResponse**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **listFineTuningJobCheckpoints**
> ListFineTuningJobCheckpointsResponse listFineTuningJobCheckpoints()


### Example

```typescript
import {
    FineTuningApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new FineTuningApi(configuration);

let fineTuningJobId: string; //The ID of the fine-tuning job to get checkpoints for.  (default to undefined)
let after: string; //Identifier for the last checkpoint ID from the previous pagination request. (optional) (default to undefined)
let limit: number; //Number of checkpoints to retrieve. (optional) (default to 10)

const { status, data } = await apiInstance.listFineTuningJobCheckpoints(
    fineTuningJobId,
    after,
    limit
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **fineTuningJobId** | [**string**] | The ID of the fine-tuning job to get checkpoints for.  | defaults to undefined|
| **after** | [**string**] | Identifier for the last checkpoint ID from the previous pagination request. | (optional) defaults to undefined|
| **limit** | [**number**] | Number of checkpoints to retrieve. | (optional) defaults to 10|


### Return type

**ListFineTuningJobCheckpointsResponse**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **listPaginatedFineTuningJobs**
> ListPaginatedFineTuningJobsResponse listPaginatedFineTuningJobs()


### Example

```typescript
import {
    FineTuningApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new FineTuningApi(configuration);

let after: string; //Identifier for the last job from the previous pagination request. (optional) (default to undefined)
let limit: number; //Number of fine-tuning jobs to retrieve. (optional) (default to 20)

const { status, data } = await apiInstance.listPaginatedFineTuningJobs(
    after,
    limit
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **after** | [**string**] | Identifier for the last job from the previous pagination request. | (optional) defaults to undefined|
| **limit** | [**number**] | Number of fine-tuning jobs to retrieve. | (optional) defaults to 20|


### Return type

**ListPaginatedFineTuningJobsResponse**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **retrieveFineTuningJob**
> FineTuningJob retrieveFineTuningJob()


### Example

```typescript
import {
    FineTuningApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new FineTuningApi(configuration);

let fineTuningJobId: string; //The ID of the fine-tuning job.  (default to undefined)

const { status, data } = await apiInstance.retrieveFineTuningJob(
    fineTuningJobId
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **fineTuningJobId** | [**string**] | The ID of the fine-tuning job.  | defaults to undefined|


### Return type

**FineTuningJob**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

