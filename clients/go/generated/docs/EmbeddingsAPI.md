# \EmbeddingsAPI

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CreateEmbedding**](EmbeddingsAPI.md#CreateEmbedding) | **Post** /embeddings | Creates an embedding vector representing the input text.



## CreateEmbedding

> CreateEmbeddingResponse CreateEmbedding(ctx).CreateEmbeddingRequest(createEmbeddingRequest).Execute()

Creates an embedding vector representing the input text.

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
	createEmbeddingRequest := *openapiclient.NewCreateEmbeddingRequest(openapiclient.CreateEmbeddingRequest_input{ArrayOfArrayOfInt32: new([][]int32)}, *openapiclient.NewCreateEmbeddingRequestModel()) // CreateEmbeddingRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.EmbeddingsAPI.CreateEmbedding(context.Background()).CreateEmbeddingRequest(createEmbeddingRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `EmbeddingsAPI.CreateEmbedding``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CreateEmbedding`: CreateEmbeddingResponse
	fmt.Fprintf(os.Stdout, "Response from `EmbeddingsAPI.CreateEmbedding`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCreateEmbeddingRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createEmbeddingRequest** | [**CreateEmbeddingRequest**](CreateEmbeddingRequest.md) |  | 

### Return type

[**CreateEmbeddingResponse**](CreateEmbeddingResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

