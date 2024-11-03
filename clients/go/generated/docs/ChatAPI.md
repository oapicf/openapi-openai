# \ChatAPI

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CreateChatCompletion**](ChatAPI.md#CreateChatCompletion) | **Post** /chat/completions | Creates a model response for the given chat conversation.



## CreateChatCompletion

> CreateChatCompletionResponse CreateChatCompletion(ctx).CreateChatCompletionRequest(createChatCompletionRequest).Execute()

Creates a model response for the given chat conversation.

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
	createChatCompletionRequest := *openapiclient.NewCreateChatCompletionRequest([]openapiclient.ChatCompletionRequestMessage{openapiclient.ChatCompletionRequestMessage{ChatCompletionRequestAssistantMessage: openapiclient.NewChatCompletionRequestAssistantMessage("Role_example")}}, *openapiclient.NewCreateChatCompletionRequestModel()) // CreateChatCompletionRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ChatAPI.CreateChatCompletion(context.Background()).CreateChatCompletionRequest(createChatCompletionRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ChatAPI.CreateChatCompletion``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CreateChatCompletion`: CreateChatCompletionResponse
	fmt.Fprintf(os.Stdout, "Response from `ChatAPI.CreateChatCompletion`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCreateChatCompletionRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createChatCompletionRequest** | [**CreateChatCompletionRequest**](CreateChatCompletionRequest.md) |  | 

### Return type

[**CreateChatCompletionResponse**](CreateChatCompletionResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

