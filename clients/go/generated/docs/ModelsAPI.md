# \ModelsAPI

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**DeleteModel**](ModelsAPI.md#DeleteModel) | **Delete** /models/{model} | Delete a fine-tuned model. You must have the Owner role in your organization to delete a model.
[**ListModels**](ModelsAPI.md#ListModels) | **Get** /models | Lists the currently available models, and provides basic information about each one such as the owner and availability.
[**RetrieveModel**](ModelsAPI.md#RetrieveModel) | **Get** /models/{model} | Retrieves a model instance, providing basic information about the model such as the owner and permissioning.



## DeleteModel

> DeleteModelResponse DeleteModel(ctx, model).Execute()

Delete a fine-tuned model. You must have the Owner role in your organization to delete a model.

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
	model := "ft:gpt-4o-mini:acemeco:suffix:abc123" // string | The model to delete

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModelsAPI.DeleteModel(context.Background(), model).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModelsAPI.DeleteModel``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `DeleteModel`: DeleteModelResponse
	fmt.Fprintf(os.Stdout, "Response from `ModelsAPI.DeleteModel`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**model** | **string** | The model to delete | 

### Other Parameters

Other parameters are passed through a pointer to a apiDeleteModelRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**DeleteModelResponse**](DeleteModelResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ListModels

> ListModelsResponse ListModels(ctx).Execute()

Lists the currently available models, and provides basic information about each one such as the owner and availability.

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

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModelsAPI.ListModels(context.Background()).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModelsAPI.ListModels``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ListModels`: ListModelsResponse
	fmt.Fprintf(os.Stdout, "Response from `ModelsAPI.ListModels`: %v\n", resp)
}
```

### Path Parameters

This endpoint does not need any parameter.

### Other Parameters

Other parameters are passed through a pointer to a apiListModelsRequest struct via the builder pattern


### Return type

[**ListModelsResponse**](ListModelsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## RetrieveModel

> Model RetrieveModel(ctx, model).Execute()

Retrieves a model instance, providing basic information about the model such as the owner and permissioning.

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
	model := "gpt-4o-mini" // string | The ID of the model to use for this request

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModelsAPI.RetrieveModel(context.Background(), model).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModelsAPI.RetrieveModel``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `RetrieveModel`: Model
	fmt.Fprintf(os.Stdout, "Response from `ModelsAPI.RetrieveModel`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**model** | **string** | The ID of the model to use for this request | 

### Other Parameters

Other parameters are passed through a pointer to a apiRetrieveModelRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**Model**](Model.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

