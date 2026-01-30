# \RealtimeAPI

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CreateRealtimeSession**](RealtimeAPI.md#CreateRealtimeSession) | **Post** /realtime/sessions | Create an ephemeral API token for use in client-side applications with the Realtime API. Can be configured with the same session parameters as the &#x60;session.update&#x60; client event.  It responds with a session object, plus a &#x60;client_secret&#x60; key which contains a usable ephemeral API token that can be used to authenticate browser clients for the Realtime API. 



## CreateRealtimeSession

> RealtimeSessionCreateResponse CreateRealtimeSession(ctx).RealtimeSessionCreateRequest(realtimeSessionCreateRequest).Execute()

Create an ephemeral API token for use in client-side applications with the Realtime API. Can be configured with the same session parameters as the `session.update` client event.  It responds with a session object, plus a `client_secret` key which contains a usable ephemeral API token that can be used to authenticate browser clients for the Realtime API. 

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
	realtimeSessionCreateRequest := *openapiclient.NewRealtimeSessionCreateRequest("Model_example") // RealtimeSessionCreateRequest | Create an ephemeral API key with the given session configuration.

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.RealtimeAPI.CreateRealtimeSession(context.Background()).RealtimeSessionCreateRequest(realtimeSessionCreateRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `RealtimeAPI.CreateRealtimeSession``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CreateRealtimeSession`: RealtimeSessionCreateResponse
	fmt.Fprintf(os.Stdout, "Response from `RealtimeAPI.CreateRealtimeSession`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCreateRealtimeSessionRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **realtimeSessionCreateRequest** | [**RealtimeSessionCreateRequest**](RealtimeSessionCreateRequest.md) | Create an ephemeral API key with the given session configuration. | 

### Return type

[**RealtimeSessionCreateResponse**](RealtimeSessionCreateResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

