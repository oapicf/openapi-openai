# .FineTuningApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelFineTuningJob**](FineTuningApi.md#cancelFineTuningJob) | **POST** /fine_tuning/jobs/{fine_tuning_job_id}/cancel | Immediately cancel a fine-tune job. 
[**createFineTuningJob**](FineTuningApi.md#createFineTuningJob) | **POST** /fine_tuning/jobs | Creates a fine-tuning job which begins the process of creating a new model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 
[**listFineTuningEvents**](FineTuningApi.md#listFineTuningEvents) | **GET** /fine_tuning/jobs/{fine_tuning_job_id}/events | Get status updates for a fine-tuning job. 
[**listFineTuningJobCheckpoints**](FineTuningApi.md#listFineTuningJobCheckpoints) | **GET** /fine_tuning/jobs/{fine_tuning_job_id}/checkpoints | List checkpoints for a fine-tuning job. 
[**listPaginatedFineTuningJobs**](FineTuningApi.md#listPaginatedFineTuningJobs) | **GET** /fine_tuning/jobs | List your organization\&#39;s fine-tuning jobs 
[**retrieveFineTuningJob**](FineTuningApi.md#retrieveFineTuningJob) | **GET** /fine_tuning/jobs/{fine_tuning_job_id} | Get info about a fine-tuning job.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 


# **cancelFineTuningJob**
> FineTuningJob cancelFineTuningJob()


### Example


```typescript
import { createConfiguration, FineTuningApi } from '';
import type { FineTuningApiCancelFineTuningJobRequest } from '';

const configuration = createConfiguration();
const apiInstance = new FineTuningApi(configuration);

const request: FineTuningApiCancelFineTuningJobRequest = {
    // The ID of the fine-tuning job to cancel. 
  fineTuningJobId: "ft-AF1WoRqd3aJAHsqc9NY7iL8F",
};

const data = await apiInstance.cancelFineTuningJob(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fineTuningJobId** | [**string**] | The ID of the fine-tuning job to cancel.  | defaults to undefined


### Return type

**FineTuningJob**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **createFineTuningJob**
> FineTuningJob createFineTuningJob(createFineTuningJobRequest)


### Example


```typescript
import { createConfiguration, FineTuningApi } from '';
import type { FineTuningApiCreateFineTuningJobRequest } from '';

const configuration = createConfiguration();
const apiInstance = new FineTuningApi(configuration);

const request: FineTuningApiCreateFineTuningJobRequest = {
  
  createFineTuningJobRequest: {
    model: null,
    trainingFile: "file-abc123",
    hyperparameters: {
      batchSize: null,
      learningRateMultiplier: null,
      nEpochs: null,
    },
    suffix: "suffix_example",
    validationFile: "file-abc123",
    integrations: [
      {
        type: null,
        wandb: {
          project: "my-wandb-project",
          name: "name_example",
          entity: "entity_example",
          tags: [
            "custom-tag",
          ],
        },
      },
    ],
    seed: 42,
  },
};

const data = await apiInstance.createFineTuningJob(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createFineTuningJobRequest** | **CreateFineTuningJobRequest**|  |


### Return type

**FineTuningJob**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **listFineTuningEvents**
> ListFineTuningJobEventsResponse listFineTuningEvents()


### Example


```typescript
import { createConfiguration, FineTuningApi } from '';
import type { FineTuningApiListFineTuningEventsRequest } from '';

const configuration = createConfiguration();
const apiInstance = new FineTuningApi(configuration);

const request: FineTuningApiListFineTuningEventsRequest = {
    // The ID of the fine-tuning job to get events for. 
  fineTuningJobId: "ft-AF1WoRqd3aJAHsqc9NY7iL8F",
    // Identifier for the last event from the previous pagination request. (optional)
  after: "after_example",
    // Number of events to retrieve. (optional)
  limit: 20,
};

const data = await apiInstance.listFineTuningEvents(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fineTuningJobId** | [**string**] | The ID of the fine-tuning job to get events for.  | defaults to undefined
 **after** | [**string**] | Identifier for the last event from the previous pagination request. | (optional) defaults to undefined
 **limit** | [**number**] | Number of events to retrieve. | (optional) defaults to 20


### Return type

**ListFineTuningJobEventsResponse**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **listFineTuningJobCheckpoints**
> ListFineTuningJobCheckpointsResponse listFineTuningJobCheckpoints()


### Example


```typescript
import { createConfiguration, FineTuningApi } from '';
import type { FineTuningApiListFineTuningJobCheckpointsRequest } from '';

const configuration = createConfiguration();
const apiInstance = new FineTuningApi(configuration);

const request: FineTuningApiListFineTuningJobCheckpointsRequest = {
    // The ID of the fine-tuning job to get checkpoints for. 
  fineTuningJobId: "ft-AF1WoRqd3aJAHsqc9NY7iL8F",
    // Identifier for the last checkpoint ID from the previous pagination request. (optional)
  after: "after_example",
    // Number of checkpoints to retrieve. (optional)
  limit: 10,
};

const data = await apiInstance.listFineTuningJobCheckpoints(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fineTuningJobId** | [**string**] | The ID of the fine-tuning job to get checkpoints for.  | defaults to undefined
 **after** | [**string**] | Identifier for the last checkpoint ID from the previous pagination request. | (optional) defaults to undefined
 **limit** | [**number**] | Number of checkpoints to retrieve. | (optional) defaults to 10


### Return type

**ListFineTuningJobCheckpointsResponse**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **listPaginatedFineTuningJobs**
> ListPaginatedFineTuningJobsResponse listPaginatedFineTuningJobs()


### Example


```typescript
import { createConfiguration, FineTuningApi } from '';
import type { FineTuningApiListPaginatedFineTuningJobsRequest } from '';

const configuration = createConfiguration();
const apiInstance = new FineTuningApi(configuration);

const request: FineTuningApiListPaginatedFineTuningJobsRequest = {
    // Identifier for the last job from the previous pagination request. (optional)
  after: "after_example",
    // Number of fine-tuning jobs to retrieve. (optional)
  limit: 20,
};

const data = await apiInstance.listPaginatedFineTuningJobs(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **after** | [**string**] | Identifier for the last job from the previous pagination request. | (optional) defaults to undefined
 **limit** | [**number**] | Number of fine-tuning jobs to retrieve. | (optional) defaults to 20


### Return type

**ListPaginatedFineTuningJobsResponse**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **retrieveFineTuningJob**
> FineTuningJob retrieveFineTuningJob()


### Example


```typescript
import { createConfiguration, FineTuningApi } from '';
import type { FineTuningApiRetrieveFineTuningJobRequest } from '';

const configuration = createConfiguration();
const apiInstance = new FineTuningApi(configuration);

const request: FineTuningApiRetrieveFineTuningJobRequest = {
    // The ID of the fine-tuning job. 
  fineTuningJobId: "ft-AF1WoRqd3aJAHsqc9NY7iL8F",
};

const data = await apiInstance.retrieveFineTuningJob(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fineTuningJobId** | [**string**] | The ID of the fine-tuning job.  | defaults to undefined


### Return type

**FineTuningJob**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)


