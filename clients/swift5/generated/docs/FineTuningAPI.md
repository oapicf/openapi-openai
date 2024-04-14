# FineTuningAPI

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelFineTuningJob**](FineTuningAPI.md#cancelfinetuningjob) | **POST** /fine_tuning/jobs/{fine_tuning_job_id}/cancel | Immediately cancel a fine-tune job. 
[**createFineTuningJob**](FineTuningAPI.md#createfinetuningjob) | **POST** /fine_tuning/jobs | Creates a fine-tuning job which begins the process of creating a new model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 
[**listFineTuningEvents**](FineTuningAPI.md#listfinetuningevents) | **GET** /fine_tuning/jobs/{fine_tuning_job_id}/events | Get status updates for a fine-tuning job. 
[**listFineTuningJobCheckpoints**](FineTuningAPI.md#listfinetuningjobcheckpoints) | **GET** /fine_tuning/jobs/{fine_tuning_job_id}/checkpoints | List checkpoints for a fine-tuning job. 
[**listPaginatedFineTuningJobs**](FineTuningAPI.md#listpaginatedfinetuningjobs) | **GET** /fine_tuning/jobs | List your organization&#39;s fine-tuning jobs 
[**retrieveFineTuningJob**](FineTuningAPI.md#retrievefinetuningjob) | **GET** /fine_tuning/jobs/{fine_tuning_job_id} | Get info about a fine-tuning job.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 


# **cancelFineTuningJob**
```swift
    open class func cancelFineTuningJob(fineTuningJobId: String, completion: @escaping (_ data: FineTuningJob?, _ error: Error?) -> Void)
```

Immediately cancel a fine-tune job. 

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let fineTuningJobId = "fineTuningJobId_example" // String | The ID of the fine-tuning job to cancel. 

// Immediately cancel a fine-tune job. 
FineTuningAPI.cancelFineTuningJob(fineTuningJobId: fineTuningJobId) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fineTuningJobId** | **String** | The ID of the fine-tuning job to cancel.  | 

### Return type

[**FineTuningJob**](FineTuningJob.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **createFineTuningJob**
```swift
    open class func createFineTuningJob(createFineTuningJobRequest: CreateFineTuningJobRequest, completion: @escaping (_ data: FineTuningJob?, _ error: Error?) -> Void)
```

Creates a fine-tuning job which begins the process of creating a new model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let createFineTuningJobRequest = CreateFineTuningJobRequest(model: CreateFineTuningJobRequest_model(), trainingFile: "trainingFile_example", hyperparameters: CreateFineTuningJobRequest_hyperparameters(batchSize: CreateFineTuningJobRequest_hyperparameters_batch_size(), learningRateMultiplier: CreateFineTuningJobRequest_hyperparameters_learning_rate_multiplier(), nEpochs: CreateFineTuningJobRequest_hyperparameters_n_epochs()), suffix: "suffix_example", validationFile: "validationFile_example", integrations: [CreateFineTuningJobRequest_integrations_inner(type: CreateFineTuningJobRequest_integrations_inner_type(), wandb: CreateFineTuningJobRequest_integrations_inner_wandb(project: "project_example", name: "name_example", entity: "entity_example", tags: ["tags_example"]))], seed: 123) // CreateFineTuningJobRequest | 

// Creates a fine-tuning job which begins the process of creating a new model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 
FineTuningAPI.createFineTuningJob(createFineTuningJobRequest: createFineTuningJobRequest) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createFineTuningJobRequest** | [**CreateFineTuningJobRequest**](CreateFineTuningJobRequest.md) |  | 

### Return type

[**FineTuningJob**](FineTuningJob.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **listFineTuningEvents**
```swift
    open class func listFineTuningEvents(fineTuningJobId: String, after: String? = nil, limit: Int? = nil, completion: @escaping (_ data: ListFineTuningJobEventsResponse?, _ error: Error?) -> Void)
```

Get status updates for a fine-tuning job. 

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let fineTuningJobId = "fineTuningJobId_example" // String | The ID of the fine-tuning job to get events for. 
let after = "after_example" // String | Identifier for the last event from the previous pagination request. (optional)
let limit = 987 // Int | Number of events to retrieve. (optional) (default to 20)

// Get status updates for a fine-tuning job. 
FineTuningAPI.listFineTuningEvents(fineTuningJobId: fineTuningJobId, after: after, limit: limit) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fineTuningJobId** | **String** | The ID of the fine-tuning job to get events for.  | 
 **after** | **String** | Identifier for the last event from the previous pagination request. | [optional] 
 **limit** | **Int** | Number of events to retrieve. | [optional] [default to 20]

### Return type

[**ListFineTuningJobEventsResponse**](ListFineTuningJobEventsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **listFineTuningJobCheckpoints**
```swift
    open class func listFineTuningJobCheckpoints(fineTuningJobId: String, after: String? = nil, limit: Int? = nil, completion: @escaping (_ data: ListFineTuningJobCheckpointsResponse?, _ error: Error?) -> Void)
```

List checkpoints for a fine-tuning job. 

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let fineTuningJobId = "fineTuningJobId_example" // String | The ID of the fine-tuning job to get checkpoints for. 
let after = "after_example" // String | Identifier for the last checkpoint ID from the previous pagination request. (optional)
let limit = 987 // Int | Number of checkpoints to retrieve. (optional) (default to 10)

// List checkpoints for a fine-tuning job. 
FineTuningAPI.listFineTuningJobCheckpoints(fineTuningJobId: fineTuningJobId, after: after, limit: limit) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fineTuningJobId** | **String** | The ID of the fine-tuning job to get checkpoints for.  | 
 **after** | **String** | Identifier for the last checkpoint ID from the previous pagination request. | [optional] 
 **limit** | **Int** | Number of checkpoints to retrieve. | [optional] [default to 10]

### Return type

[**ListFineTuningJobCheckpointsResponse**](ListFineTuningJobCheckpointsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **listPaginatedFineTuningJobs**
```swift
    open class func listPaginatedFineTuningJobs(after: String? = nil, limit: Int? = nil, completion: @escaping (_ data: ListPaginatedFineTuningJobsResponse?, _ error: Error?) -> Void)
```

List your organization's fine-tuning jobs 

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let after = "after_example" // String | Identifier for the last job from the previous pagination request. (optional)
let limit = 987 // Int | Number of fine-tuning jobs to retrieve. (optional) (default to 20)

// List your organization's fine-tuning jobs 
FineTuningAPI.listPaginatedFineTuningJobs(after: after, limit: limit) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **after** | **String** | Identifier for the last job from the previous pagination request. | [optional] 
 **limit** | **Int** | Number of fine-tuning jobs to retrieve. | [optional] [default to 20]

### Return type

[**ListPaginatedFineTuningJobsResponse**](ListPaginatedFineTuningJobsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **retrieveFineTuningJob**
```swift
    open class func retrieveFineTuningJob(fineTuningJobId: String, completion: @escaping (_ data: FineTuningJob?, _ error: Error?) -> Void)
```

Get info about a fine-tuning job.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let fineTuningJobId = "fineTuningJobId_example" // String | The ID of the fine-tuning job. 

// Get info about a fine-tuning job.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 
FineTuningAPI.retrieveFineTuningJob(fineTuningJobId: fineTuningJobId) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fineTuningJobId** | **String** | The ID of the fine-tuning job.  | 

### Return type

[**FineTuningJob**](FineTuningJob.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

