# \FineTuningAPI

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CancelFineTuningJob**](FineTuningAPI.md#CancelFineTuningJob) | **Post** /fine_tuning/jobs/{fine_tuning_job_id}/cancel | Immediately cancel a fine-tune job. 
[**CreateFineTuningJob**](FineTuningAPI.md#CreateFineTuningJob) | **Post** /fine_tuning/jobs | Creates a fine-tuning job which begins the process of creating a new model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 
[**ListFineTuningEvents**](FineTuningAPI.md#ListFineTuningEvents) | **Get** /fine_tuning/jobs/{fine_tuning_job_id}/events | Get status updates for a fine-tuning job. 
[**ListFineTuningJobCheckpoints**](FineTuningAPI.md#ListFineTuningJobCheckpoints) | **Get** /fine_tuning/jobs/{fine_tuning_job_id}/checkpoints | List checkpoints for a fine-tuning job. 
[**ListPaginatedFineTuningJobs**](FineTuningAPI.md#ListPaginatedFineTuningJobs) | **Get** /fine_tuning/jobs | List your organization&#39;s fine-tuning jobs 
[**RetrieveFineTuningJob**](FineTuningAPI.md#RetrieveFineTuningJob) | **Get** /fine_tuning/jobs/{fine_tuning_job_id} | Get info about a fine-tuning job.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 



## CancelFineTuningJob

> FineTuningJob CancelFineTuningJob(ctx, fineTuningJobId).Execute()

Immediately cancel a fine-tune job. 

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/oapicf/openapi-openai"
)

func main() {
	fineTuningJobId := "ft-AF1WoRqd3aJAHsqc9NY7iL8F" // string | The ID of the fine-tuning job to cancel. 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.FineTuningAPI.CancelFineTuningJob(context.Background(), fineTuningJobId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `FineTuningAPI.CancelFineTuningJob``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CancelFineTuningJob`: FineTuningJob
	fmt.Fprintf(os.Stdout, "Response from `FineTuningAPI.CancelFineTuningJob`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**fineTuningJobId** | **string** | The ID of the fine-tuning job to cancel.  | 

### Other Parameters

Other parameters are passed through a pointer to a apiCancelFineTuningJobRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**FineTuningJob**](FineTuningJob.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CreateFineTuningJob

> FineTuningJob CreateFineTuningJob(ctx).CreateFineTuningJobRequest(createFineTuningJobRequest).Execute()

Creates a fine-tuning job which begins the process of creating a new model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/oapicf/openapi-openai"
)

func main() {
	createFineTuningJobRequest := *openapiclient.NewCreateFineTuningJobRequest(*openapiclient.NewCreateFineTuningJobRequestModel(), "file-abc123") // CreateFineTuningJobRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.FineTuningAPI.CreateFineTuningJob(context.Background()).CreateFineTuningJobRequest(createFineTuningJobRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `FineTuningAPI.CreateFineTuningJob``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CreateFineTuningJob`: FineTuningJob
	fmt.Fprintf(os.Stdout, "Response from `FineTuningAPI.CreateFineTuningJob`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCreateFineTuningJobRequest struct via the builder pattern


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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ListFineTuningEvents

> ListFineTuningJobEventsResponse ListFineTuningEvents(ctx, fineTuningJobId).After(after).Limit(limit).Execute()

Get status updates for a fine-tuning job. 

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/oapicf/openapi-openai"
)

func main() {
	fineTuningJobId := "ft-AF1WoRqd3aJAHsqc9NY7iL8F" // string | The ID of the fine-tuning job to get events for. 
	after := "after_example" // string | Identifier for the last event from the previous pagination request. (optional)
	limit := int32(56) // int32 | Number of events to retrieve. (optional) (default to 20)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.FineTuningAPI.ListFineTuningEvents(context.Background(), fineTuningJobId).After(after).Limit(limit).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `FineTuningAPI.ListFineTuningEvents``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ListFineTuningEvents`: ListFineTuningJobEventsResponse
	fmt.Fprintf(os.Stdout, "Response from `FineTuningAPI.ListFineTuningEvents`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**fineTuningJobId** | **string** | The ID of the fine-tuning job to get events for.  | 

### Other Parameters

Other parameters are passed through a pointer to a apiListFineTuningEventsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **after** | **string** | Identifier for the last event from the previous pagination request. | 
 **limit** | **int32** | Number of events to retrieve. | [default to 20]

### Return type

[**ListFineTuningJobEventsResponse**](ListFineTuningJobEventsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ListFineTuningJobCheckpoints

> ListFineTuningJobCheckpointsResponse ListFineTuningJobCheckpoints(ctx, fineTuningJobId).After(after).Limit(limit).Execute()

List checkpoints for a fine-tuning job. 

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/oapicf/openapi-openai"
)

func main() {
	fineTuningJobId := "ft-AF1WoRqd3aJAHsqc9NY7iL8F" // string | The ID of the fine-tuning job to get checkpoints for. 
	after := "after_example" // string | Identifier for the last checkpoint ID from the previous pagination request. (optional)
	limit := int32(56) // int32 | Number of checkpoints to retrieve. (optional) (default to 10)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.FineTuningAPI.ListFineTuningJobCheckpoints(context.Background(), fineTuningJobId).After(after).Limit(limit).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `FineTuningAPI.ListFineTuningJobCheckpoints``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ListFineTuningJobCheckpoints`: ListFineTuningJobCheckpointsResponse
	fmt.Fprintf(os.Stdout, "Response from `FineTuningAPI.ListFineTuningJobCheckpoints`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**fineTuningJobId** | **string** | The ID of the fine-tuning job to get checkpoints for.  | 

### Other Parameters

Other parameters are passed through a pointer to a apiListFineTuningJobCheckpointsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **after** | **string** | Identifier for the last checkpoint ID from the previous pagination request. | 
 **limit** | **int32** | Number of checkpoints to retrieve. | [default to 10]

### Return type

[**ListFineTuningJobCheckpointsResponse**](ListFineTuningJobCheckpointsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ListPaginatedFineTuningJobs

> ListPaginatedFineTuningJobsResponse ListPaginatedFineTuningJobs(ctx).After(after).Limit(limit).Execute()

List your organization's fine-tuning jobs 

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/oapicf/openapi-openai"
)

func main() {
	after := "after_example" // string | Identifier for the last job from the previous pagination request. (optional)
	limit := int32(56) // int32 | Number of fine-tuning jobs to retrieve. (optional) (default to 20)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.FineTuningAPI.ListPaginatedFineTuningJobs(context.Background()).After(after).Limit(limit).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `FineTuningAPI.ListPaginatedFineTuningJobs``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ListPaginatedFineTuningJobs`: ListPaginatedFineTuningJobsResponse
	fmt.Fprintf(os.Stdout, "Response from `FineTuningAPI.ListPaginatedFineTuningJobs`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiListPaginatedFineTuningJobsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **after** | **string** | Identifier for the last job from the previous pagination request. | 
 **limit** | **int32** | Number of fine-tuning jobs to retrieve. | [default to 20]

### Return type

[**ListPaginatedFineTuningJobsResponse**](ListPaginatedFineTuningJobsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## RetrieveFineTuningJob

> FineTuningJob RetrieveFineTuningJob(ctx, fineTuningJobId).Execute()

Get info about a fine-tuning job.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/oapicf/openapi-openai"
)

func main() {
	fineTuningJobId := "ft-AF1WoRqd3aJAHsqc9NY7iL8F" // string | The ID of the fine-tuning job. 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.FineTuningAPI.RetrieveFineTuningJob(context.Background(), fineTuningJobId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `FineTuningAPI.RetrieveFineTuningJob``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `RetrieveFineTuningJob`: FineTuningJob
	fmt.Fprintf(os.Stdout, "Response from `FineTuningAPI.RetrieveFineTuningJob`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**fineTuningJobId** | **string** | The ID of the fine-tuning job.  | 

### Other Parameters

Other parameters are passed through a pointer to a apiRetrieveFineTuningJobRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**FineTuningJob**](FineTuningJob.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

