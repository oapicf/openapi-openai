# \UsageAPI

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**UsageAudioSpeeches**](UsageAPI.md#UsageAudioSpeeches) | **Get** /organization/usage/audio_speeches | Get audio speeches usage details for the organization.
[**UsageAudioTranscriptions**](UsageAPI.md#UsageAudioTranscriptions) | **Get** /organization/usage/audio_transcriptions | Get audio transcriptions usage details for the organization.
[**UsageCodeInterpreterSessions**](UsageAPI.md#UsageCodeInterpreterSessions) | **Get** /organization/usage/code_interpreter_sessions | Get code interpreter sessions usage details for the organization.
[**UsageCompletions**](UsageAPI.md#UsageCompletions) | **Get** /organization/usage/completions | Get completions usage details for the organization.
[**UsageCosts**](UsageAPI.md#UsageCosts) | **Get** /organization/costs | Get costs details for the organization.
[**UsageEmbeddings**](UsageAPI.md#UsageEmbeddings) | **Get** /organization/usage/embeddings | Get embeddings usage details for the organization.
[**UsageImages**](UsageAPI.md#UsageImages) | **Get** /organization/usage/images | Get images usage details for the organization.
[**UsageModerations**](UsageAPI.md#UsageModerations) | **Get** /organization/usage/moderations | Get moderations usage details for the organization.
[**UsageVectorStores**](UsageAPI.md#UsageVectorStores) | **Get** /organization/usage/vector_stores | Get vector stores usage details for the organization.



## UsageAudioSpeeches

> UsageResponse UsageAudioSpeeches(ctx).StartTime(startTime).EndTime(endTime).BucketWidth(bucketWidth).ProjectIds(projectIds).UserIds(userIds).ApiKeyIds(apiKeyIds).Models(models).GroupBy(groupBy).Limit(limit).Page(page).Execute()

Get audio speeches usage details for the organization.

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
	startTime := int32(56) // int32 | Start time (Unix seconds) of the query time range, inclusive.
	endTime := int32(56) // int32 | End time (Unix seconds) of the query time range, exclusive. (optional)
	bucketWidth := "bucketWidth_example" // string | Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`. (optional) (default to "1d")
	projectIds := []string{"Inner_example"} // []string | Return only usage for these projects. (optional)
	userIds := []string{"Inner_example"} // []string | Return only usage for these users. (optional)
	apiKeyIds := []string{"Inner_example"} // []string | Return only usage for these API keys. (optional)
	models := []string{"Inner_example"} // []string | Return only usage for these models. (optional)
	groupBy := []string{"GroupBy_example"} // []string | Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model` or any combination of them. (optional)
	limit := int32(56) // int32 | Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440  (optional)
	page := "page_example" // string | A cursor for use in pagination. Corresponding to the `next_page` field from the previous response. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.UsageAPI.UsageAudioSpeeches(context.Background()).StartTime(startTime).EndTime(endTime).BucketWidth(bucketWidth).ProjectIds(projectIds).UserIds(userIds).ApiKeyIds(apiKeyIds).Models(models).GroupBy(groupBy).Limit(limit).Page(page).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `UsageAPI.UsageAudioSpeeches``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `UsageAudioSpeeches`: UsageResponse
	fmt.Fprintf(os.Stdout, "Response from `UsageAPI.UsageAudioSpeeches`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiUsageAudioSpeechesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startTime** | **int32** | Start time (Unix seconds) of the query time range, inclusive. | 
 **endTime** | **int32** | End time (Unix seconds) of the query time range, exclusive. | 
 **bucketWidth** | **string** | Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [default to &quot;1d&quot;]
 **projectIds** | **[]string** | Return only usage for these projects. | 
 **userIds** | **[]string** | Return only usage for these users. | 
 **apiKeyIds** | **[]string** | Return only usage for these API keys. | 
 **models** | **[]string** | Return only usage for these models. | 
 **groupBy** | **[]string** | Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60; or any combination of them. | 
 **limit** | **int32** | Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  | 
 **page** | **string** | A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | 

### Return type

[**UsageResponse**](UsageResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## UsageAudioTranscriptions

> UsageResponse UsageAudioTranscriptions(ctx).StartTime(startTime).EndTime(endTime).BucketWidth(bucketWidth).ProjectIds(projectIds).UserIds(userIds).ApiKeyIds(apiKeyIds).Models(models).GroupBy(groupBy).Limit(limit).Page(page).Execute()

Get audio transcriptions usage details for the organization.

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
	startTime := int32(56) // int32 | Start time (Unix seconds) of the query time range, inclusive.
	endTime := int32(56) // int32 | End time (Unix seconds) of the query time range, exclusive. (optional)
	bucketWidth := "bucketWidth_example" // string | Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`. (optional) (default to "1d")
	projectIds := []string{"Inner_example"} // []string | Return only usage for these projects. (optional)
	userIds := []string{"Inner_example"} // []string | Return only usage for these users. (optional)
	apiKeyIds := []string{"Inner_example"} // []string | Return only usage for these API keys. (optional)
	models := []string{"Inner_example"} // []string | Return only usage for these models. (optional)
	groupBy := []string{"GroupBy_example"} // []string | Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model` or any combination of them. (optional)
	limit := int32(56) // int32 | Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440  (optional)
	page := "page_example" // string | A cursor for use in pagination. Corresponding to the `next_page` field from the previous response. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.UsageAPI.UsageAudioTranscriptions(context.Background()).StartTime(startTime).EndTime(endTime).BucketWidth(bucketWidth).ProjectIds(projectIds).UserIds(userIds).ApiKeyIds(apiKeyIds).Models(models).GroupBy(groupBy).Limit(limit).Page(page).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `UsageAPI.UsageAudioTranscriptions``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `UsageAudioTranscriptions`: UsageResponse
	fmt.Fprintf(os.Stdout, "Response from `UsageAPI.UsageAudioTranscriptions`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiUsageAudioTranscriptionsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startTime** | **int32** | Start time (Unix seconds) of the query time range, inclusive. | 
 **endTime** | **int32** | End time (Unix seconds) of the query time range, exclusive. | 
 **bucketWidth** | **string** | Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [default to &quot;1d&quot;]
 **projectIds** | **[]string** | Return only usage for these projects. | 
 **userIds** | **[]string** | Return only usage for these users. | 
 **apiKeyIds** | **[]string** | Return only usage for these API keys. | 
 **models** | **[]string** | Return only usage for these models. | 
 **groupBy** | **[]string** | Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60; or any combination of them. | 
 **limit** | **int32** | Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  | 
 **page** | **string** | A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | 

### Return type

[**UsageResponse**](UsageResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## UsageCodeInterpreterSessions

> UsageResponse UsageCodeInterpreterSessions(ctx).StartTime(startTime).EndTime(endTime).BucketWidth(bucketWidth).ProjectIds(projectIds).GroupBy(groupBy).Limit(limit).Page(page).Execute()

Get code interpreter sessions usage details for the organization.

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
	startTime := int32(56) // int32 | Start time (Unix seconds) of the query time range, inclusive.
	endTime := int32(56) // int32 | End time (Unix seconds) of the query time range, exclusive. (optional)
	bucketWidth := "bucketWidth_example" // string | Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`. (optional) (default to "1d")
	projectIds := []string{"Inner_example"} // []string | Return only usage for these projects. (optional)
	groupBy := []string{"GroupBy_example"} // []string | Group the usage data by the specified fields. Support fields include `project_id`. (optional)
	limit := int32(56) // int32 | Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440  (optional)
	page := "page_example" // string | A cursor for use in pagination. Corresponding to the `next_page` field from the previous response. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.UsageAPI.UsageCodeInterpreterSessions(context.Background()).StartTime(startTime).EndTime(endTime).BucketWidth(bucketWidth).ProjectIds(projectIds).GroupBy(groupBy).Limit(limit).Page(page).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `UsageAPI.UsageCodeInterpreterSessions``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `UsageCodeInterpreterSessions`: UsageResponse
	fmt.Fprintf(os.Stdout, "Response from `UsageAPI.UsageCodeInterpreterSessions`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiUsageCodeInterpreterSessionsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startTime** | **int32** | Start time (Unix seconds) of the query time range, inclusive. | 
 **endTime** | **int32** | End time (Unix seconds) of the query time range, exclusive. | 
 **bucketWidth** | **string** | Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [default to &quot;1d&quot;]
 **projectIds** | **[]string** | Return only usage for these projects. | 
 **groupBy** | **[]string** | Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;. | 
 **limit** | **int32** | Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  | 
 **page** | **string** | A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | 

### Return type

[**UsageResponse**](UsageResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## UsageCompletions

> UsageResponse UsageCompletions(ctx).StartTime(startTime).EndTime(endTime).BucketWidth(bucketWidth).ProjectIds(projectIds).UserIds(userIds).ApiKeyIds(apiKeyIds).Models(models).Batch(batch).GroupBy(groupBy).Limit(limit).Page(page).Execute()

Get completions usage details for the organization.

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
	startTime := int32(56) // int32 | Start time (Unix seconds) of the query time range, inclusive.
	endTime := int32(56) // int32 | End time (Unix seconds) of the query time range, exclusive. (optional)
	bucketWidth := "bucketWidth_example" // string | Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`. (optional) (default to "1d")
	projectIds := []string{"Inner_example"} // []string | Return only usage for these projects. (optional)
	userIds := []string{"Inner_example"} // []string | Return only usage for these users. (optional)
	apiKeyIds := []string{"Inner_example"} // []string | Return only usage for these API keys. (optional)
	models := []string{"Inner_example"} // []string | Return only usage for these models. (optional)
	batch := true // bool | If `true`, return batch jobs only. If `false`, return non-batch jobs only. By default, return both.  (optional)
	groupBy := []string{"GroupBy_example"} // []string | Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model`, `batch` or any combination of them. (optional)
	limit := int32(56) // int32 | Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440  (optional)
	page := "page_example" // string | A cursor for use in pagination. Corresponding to the `next_page` field from the previous response. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.UsageAPI.UsageCompletions(context.Background()).StartTime(startTime).EndTime(endTime).BucketWidth(bucketWidth).ProjectIds(projectIds).UserIds(userIds).ApiKeyIds(apiKeyIds).Models(models).Batch(batch).GroupBy(groupBy).Limit(limit).Page(page).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `UsageAPI.UsageCompletions``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `UsageCompletions`: UsageResponse
	fmt.Fprintf(os.Stdout, "Response from `UsageAPI.UsageCompletions`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiUsageCompletionsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startTime** | **int32** | Start time (Unix seconds) of the query time range, inclusive. | 
 **endTime** | **int32** | End time (Unix seconds) of the query time range, exclusive. | 
 **bucketWidth** | **string** | Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [default to &quot;1d&quot;]
 **projectIds** | **[]string** | Return only usage for these projects. | 
 **userIds** | **[]string** | Return only usage for these users. | 
 **apiKeyIds** | **[]string** | Return only usage for these API keys. | 
 **models** | **[]string** | Return only usage for these models. | 
 **batch** | **bool** | If &#x60;true&#x60;, return batch jobs only. If &#x60;false&#x60;, return non-batch jobs only. By default, return both.  | 
 **groupBy** | **[]string** | Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60;, &#x60;batch&#x60; or any combination of them. | 
 **limit** | **int32** | Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  | 
 **page** | **string** | A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | 

### Return type

[**UsageResponse**](UsageResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## UsageCosts

> UsageResponse UsageCosts(ctx).StartTime(startTime).EndTime(endTime).BucketWidth(bucketWidth).ProjectIds(projectIds).GroupBy(groupBy).Limit(limit).Page(page).Execute()

Get costs details for the organization.

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
	startTime := int32(56) // int32 | Start time (Unix seconds) of the query time range, inclusive.
	endTime := int32(56) // int32 | End time (Unix seconds) of the query time range, exclusive. (optional)
	bucketWidth := "bucketWidth_example" // string | Width of each time bucket in response. Currently only `1d` is supported, default to `1d`. (optional) (default to "1d")
	projectIds := []string{"Inner_example"} // []string | Return only costs for these projects. (optional)
	groupBy := []string{"GroupBy_example"} // []string | Group the costs by the specified fields. Support fields include `project_id`, `line_item` and any combination of them. (optional)
	limit := int32(56) // int32 | A limit on the number of buckets to be returned. Limit can range between 1 and 180, and the default is 7.  (optional) (default to 7)
	page := "page_example" // string | A cursor for use in pagination. Corresponding to the `next_page` field from the previous response. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.UsageAPI.UsageCosts(context.Background()).StartTime(startTime).EndTime(endTime).BucketWidth(bucketWidth).ProjectIds(projectIds).GroupBy(groupBy).Limit(limit).Page(page).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `UsageAPI.UsageCosts``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `UsageCosts`: UsageResponse
	fmt.Fprintf(os.Stdout, "Response from `UsageAPI.UsageCosts`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiUsageCostsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startTime** | **int32** | Start time (Unix seconds) of the query time range, inclusive. | 
 **endTime** | **int32** | End time (Unix seconds) of the query time range, exclusive. | 
 **bucketWidth** | **string** | Width of each time bucket in response. Currently only &#x60;1d&#x60; is supported, default to &#x60;1d&#x60;. | [default to &quot;1d&quot;]
 **projectIds** | **[]string** | Return only costs for these projects. | 
 **groupBy** | **[]string** | Group the costs by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;line_item&#x60; and any combination of them. | 
 **limit** | **int32** | A limit on the number of buckets to be returned. Limit can range between 1 and 180, and the default is 7.  | [default to 7]
 **page** | **string** | A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | 

### Return type

[**UsageResponse**](UsageResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## UsageEmbeddings

> UsageResponse UsageEmbeddings(ctx).StartTime(startTime).EndTime(endTime).BucketWidth(bucketWidth).ProjectIds(projectIds).UserIds(userIds).ApiKeyIds(apiKeyIds).Models(models).GroupBy(groupBy).Limit(limit).Page(page).Execute()

Get embeddings usage details for the organization.

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
	startTime := int32(56) // int32 | Start time (Unix seconds) of the query time range, inclusive.
	endTime := int32(56) // int32 | End time (Unix seconds) of the query time range, exclusive. (optional)
	bucketWidth := "bucketWidth_example" // string | Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`. (optional) (default to "1d")
	projectIds := []string{"Inner_example"} // []string | Return only usage for these projects. (optional)
	userIds := []string{"Inner_example"} // []string | Return only usage for these users. (optional)
	apiKeyIds := []string{"Inner_example"} // []string | Return only usage for these API keys. (optional)
	models := []string{"Inner_example"} // []string | Return only usage for these models. (optional)
	groupBy := []string{"GroupBy_example"} // []string | Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model` or any combination of them. (optional)
	limit := int32(56) // int32 | Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440  (optional)
	page := "page_example" // string | A cursor for use in pagination. Corresponding to the `next_page` field from the previous response. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.UsageAPI.UsageEmbeddings(context.Background()).StartTime(startTime).EndTime(endTime).BucketWidth(bucketWidth).ProjectIds(projectIds).UserIds(userIds).ApiKeyIds(apiKeyIds).Models(models).GroupBy(groupBy).Limit(limit).Page(page).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `UsageAPI.UsageEmbeddings``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `UsageEmbeddings`: UsageResponse
	fmt.Fprintf(os.Stdout, "Response from `UsageAPI.UsageEmbeddings`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiUsageEmbeddingsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startTime** | **int32** | Start time (Unix seconds) of the query time range, inclusive. | 
 **endTime** | **int32** | End time (Unix seconds) of the query time range, exclusive. | 
 **bucketWidth** | **string** | Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [default to &quot;1d&quot;]
 **projectIds** | **[]string** | Return only usage for these projects. | 
 **userIds** | **[]string** | Return only usage for these users. | 
 **apiKeyIds** | **[]string** | Return only usage for these API keys. | 
 **models** | **[]string** | Return only usage for these models. | 
 **groupBy** | **[]string** | Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60; or any combination of them. | 
 **limit** | **int32** | Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  | 
 **page** | **string** | A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | 

### Return type

[**UsageResponse**](UsageResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## UsageImages

> UsageResponse UsageImages(ctx).StartTime(startTime).EndTime(endTime).BucketWidth(bucketWidth).Sources(sources).Sizes(sizes).ProjectIds(projectIds).UserIds(userIds).ApiKeyIds(apiKeyIds).Models(models).GroupBy(groupBy).Limit(limit).Page(page).Execute()

Get images usage details for the organization.

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
	startTime := int32(56) // int32 | Start time (Unix seconds) of the query time range, inclusive.
	endTime := int32(56) // int32 | End time (Unix seconds) of the query time range, exclusive. (optional)
	bucketWidth := "bucketWidth_example" // string | Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`. (optional) (default to "1d")
	sources := []string{"Sources_example"} // []string | Return only usages for these sources. Possible values are `image.generation`, `image.edit`, `image.variation` or any combination of them. (optional)
	sizes := []string{"Sizes_example"} // []string | Return only usages for these image sizes. Possible values are `256x256`, `512x512`, `1024x1024`, `1792x1792`, `1024x1792` or any combination of them. (optional)
	projectIds := []string{"Inner_example"} // []string | Return only usage for these projects. (optional)
	userIds := []string{"Inner_example"} // []string | Return only usage for these users. (optional)
	apiKeyIds := []string{"Inner_example"} // []string | Return only usage for these API keys. (optional)
	models := []string{"Inner_example"} // []string | Return only usage for these models. (optional)
	groupBy := []string{"GroupBy_example"} // []string | Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model`, `size`, `source` or any combination of them. (optional)
	limit := int32(56) // int32 | Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440  (optional)
	page := "page_example" // string | A cursor for use in pagination. Corresponding to the `next_page` field from the previous response. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.UsageAPI.UsageImages(context.Background()).StartTime(startTime).EndTime(endTime).BucketWidth(bucketWidth).Sources(sources).Sizes(sizes).ProjectIds(projectIds).UserIds(userIds).ApiKeyIds(apiKeyIds).Models(models).GroupBy(groupBy).Limit(limit).Page(page).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `UsageAPI.UsageImages``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `UsageImages`: UsageResponse
	fmt.Fprintf(os.Stdout, "Response from `UsageAPI.UsageImages`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiUsageImagesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startTime** | **int32** | Start time (Unix seconds) of the query time range, inclusive. | 
 **endTime** | **int32** | End time (Unix seconds) of the query time range, exclusive. | 
 **bucketWidth** | **string** | Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [default to &quot;1d&quot;]
 **sources** | **[]string** | Return only usages for these sources. Possible values are &#x60;image.generation&#x60;, &#x60;image.edit&#x60;, &#x60;image.variation&#x60; or any combination of them. | 
 **sizes** | **[]string** | Return only usages for these image sizes. Possible values are &#x60;256x256&#x60;, &#x60;512x512&#x60;, &#x60;1024x1024&#x60;, &#x60;1792x1792&#x60;, &#x60;1024x1792&#x60; or any combination of them. | 
 **projectIds** | **[]string** | Return only usage for these projects. | 
 **userIds** | **[]string** | Return only usage for these users. | 
 **apiKeyIds** | **[]string** | Return only usage for these API keys. | 
 **models** | **[]string** | Return only usage for these models. | 
 **groupBy** | **[]string** | Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60;, &#x60;size&#x60;, &#x60;source&#x60; or any combination of them. | 
 **limit** | **int32** | Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  | 
 **page** | **string** | A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | 

### Return type

[**UsageResponse**](UsageResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## UsageModerations

> UsageResponse UsageModerations(ctx).StartTime(startTime).EndTime(endTime).BucketWidth(bucketWidth).ProjectIds(projectIds).UserIds(userIds).ApiKeyIds(apiKeyIds).Models(models).GroupBy(groupBy).Limit(limit).Page(page).Execute()

Get moderations usage details for the organization.

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
	startTime := int32(56) // int32 | Start time (Unix seconds) of the query time range, inclusive.
	endTime := int32(56) // int32 | End time (Unix seconds) of the query time range, exclusive. (optional)
	bucketWidth := "bucketWidth_example" // string | Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`. (optional) (default to "1d")
	projectIds := []string{"Inner_example"} // []string | Return only usage for these projects. (optional)
	userIds := []string{"Inner_example"} // []string | Return only usage for these users. (optional)
	apiKeyIds := []string{"Inner_example"} // []string | Return only usage for these API keys. (optional)
	models := []string{"Inner_example"} // []string | Return only usage for these models. (optional)
	groupBy := []string{"GroupBy_example"} // []string | Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model` or any combination of them. (optional)
	limit := int32(56) // int32 | Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440  (optional)
	page := "page_example" // string | A cursor for use in pagination. Corresponding to the `next_page` field from the previous response. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.UsageAPI.UsageModerations(context.Background()).StartTime(startTime).EndTime(endTime).BucketWidth(bucketWidth).ProjectIds(projectIds).UserIds(userIds).ApiKeyIds(apiKeyIds).Models(models).GroupBy(groupBy).Limit(limit).Page(page).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `UsageAPI.UsageModerations``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `UsageModerations`: UsageResponse
	fmt.Fprintf(os.Stdout, "Response from `UsageAPI.UsageModerations`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiUsageModerationsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startTime** | **int32** | Start time (Unix seconds) of the query time range, inclusive. | 
 **endTime** | **int32** | End time (Unix seconds) of the query time range, exclusive. | 
 **bucketWidth** | **string** | Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [default to &quot;1d&quot;]
 **projectIds** | **[]string** | Return only usage for these projects. | 
 **userIds** | **[]string** | Return only usage for these users. | 
 **apiKeyIds** | **[]string** | Return only usage for these API keys. | 
 **models** | **[]string** | Return only usage for these models. | 
 **groupBy** | **[]string** | Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60; or any combination of them. | 
 **limit** | **int32** | Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  | 
 **page** | **string** | A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | 

### Return type

[**UsageResponse**](UsageResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## UsageVectorStores

> UsageResponse UsageVectorStores(ctx).StartTime(startTime).EndTime(endTime).BucketWidth(bucketWidth).ProjectIds(projectIds).GroupBy(groupBy).Limit(limit).Page(page).Execute()

Get vector stores usage details for the organization.

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
	startTime := int32(56) // int32 | Start time (Unix seconds) of the query time range, inclusive.
	endTime := int32(56) // int32 | End time (Unix seconds) of the query time range, exclusive. (optional)
	bucketWidth := "bucketWidth_example" // string | Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`. (optional) (default to "1d")
	projectIds := []string{"Inner_example"} // []string | Return only usage for these projects. (optional)
	groupBy := []string{"GroupBy_example"} // []string | Group the usage data by the specified fields. Support fields include `project_id`. (optional)
	limit := int32(56) // int32 | Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440  (optional)
	page := "page_example" // string | A cursor for use in pagination. Corresponding to the `next_page` field from the previous response. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.UsageAPI.UsageVectorStores(context.Background()).StartTime(startTime).EndTime(endTime).BucketWidth(bucketWidth).ProjectIds(projectIds).GroupBy(groupBy).Limit(limit).Page(page).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `UsageAPI.UsageVectorStores``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `UsageVectorStores`: UsageResponse
	fmt.Fprintf(os.Stdout, "Response from `UsageAPI.UsageVectorStores`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiUsageVectorStoresRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startTime** | **int32** | Start time (Unix seconds) of the query time range, inclusive. | 
 **endTime** | **int32** | End time (Unix seconds) of the query time range, exclusive. | 
 **bucketWidth** | **string** | Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [default to &quot;1d&quot;]
 **projectIds** | **[]string** | Return only usage for these projects. | 
 **groupBy** | **[]string** | Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;. | 
 **limit** | **int32** | Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  | 
 **page** | **string** | A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | 

### Return type

[**UsageResponse**](UsageResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

