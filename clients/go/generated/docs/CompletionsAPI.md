# \CompletionsAPI

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CreateCompletion**](CompletionsAPI.md#CreateCompletion) | **Post** /completions | Creates a completion for the provided prompt and parameters.



## CreateCompletion

> CreateCompletionResponse CreateCompletion(ctx).CreateCompletionRequest(createCompletionRequest).Execute()

Creates a completion for the provided prompt and parameters.

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
	createCompletionRequest := *openapiclient.NewCreateCompletionRequest(*openapiclient.NewCreateCompletionRequestModel(), "TODO") // CreateCompletionRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.CompletionsAPI.CreateCompletion(context.Background()).CreateCompletionRequest(createCompletionRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `CompletionsAPI.CreateCompletion``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CreateCompletion`: CreateCompletionResponse
	fmt.Fprintf(os.Stdout, "Response from `CompletionsAPI.CreateCompletion`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCreateCompletionRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createCompletionRequest** | [**CreateCompletionRequest**](CreateCompletionRequest.md) |  | 

### Return type

[**CreateCompletionResponse**](CreateCompletionResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

