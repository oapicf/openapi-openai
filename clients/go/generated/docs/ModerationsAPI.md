# \ModerationsAPI

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CreateModeration**](ModerationsAPI.md#CreateModeration) | **Post** /moderations | Classifies if text and/or image inputs are potentially harmful. Learn more in the [moderation guide](/docs/guides/moderation). 



## CreateModeration

> CreateModerationResponse CreateModeration(ctx).CreateModerationRequest(createModerationRequest).Execute()

Classifies if text and/or image inputs are potentially harmful. Learn more in the [moderation guide](/docs/guides/moderation). 

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
	createModerationRequest := *openapiclient.NewCreateModerationRequest(openapiclient.CreateModerationRequest_input{ArrayOfCreateModerationRequestInputOneOfInner: new([]CreateModerationRequestInputOneOfInner)}) // CreateModerationRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModerationsAPI.CreateModeration(context.Background()).CreateModerationRequest(createModerationRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModerationsAPI.CreateModeration``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CreateModeration`: CreateModerationResponse
	fmt.Fprintf(os.Stdout, "Response from `ModerationsAPI.CreateModeration`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCreateModerationRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createModerationRequest** | [**CreateModerationRequest**](CreateModerationRequest.md) |  | 

### Return type

[**CreateModerationResponse**](CreateModerationResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

