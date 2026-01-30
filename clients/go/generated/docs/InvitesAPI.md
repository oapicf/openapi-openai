# \InvitesAPI

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**DeleteInvite**](InvitesAPI.md#DeleteInvite) | **Delete** /organization/invites/{invite_id} | Delete an invite. If the invite has already been accepted, it cannot be deleted.
[**InviteUser**](InvitesAPI.md#InviteUser) | **Post** /organization/invites | Create an invite for a user to the organization. The invite must be accepted by the user before they have access to the organization.
[**ListInvites**](InvitesAPI.md#ListInvites) | **Get** /organization/invites | Returns a list of invites in the organization.
[**RetrieveInvite**](InvitesAPI.md#RetrieveInvite) | **Get** /organization/invites/{invite_id} | Retrieves an invite.



## DeleteInvite

> InviteDeleteResponse DeleteInvite(ctx, inviteId).Execute()

Delete an invite. If the invite has already been accepted, it cannot be deleted.

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
	inviteId := "inviteId_example" // string | The ID of the invite to delete.

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.InvitesAPI.DeleteInvite(context.Background(), inviteId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `InvitesAPI.DeleteInvite``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `DeleteInvite`: InviteDeleteResponse
	fmt.Fprintf(os.Stdout, "Response from `InvitesAPI.DeleteInvite`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**inviteId** | **string** | The ID of the invite to delete. | 

### Other Parameters

Other parameters are passed through a pointer to a apiDeleteInviteRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**InviteDeleteResponse**](InviteDeleteResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## InviteUser

> Invite InviteUser(ctx).InviteRequest(inviteRequest).Execute()

Create an invite for a user to the organization. The invite must be accepted by the user before they have access to the organization.

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
	inviteRequest := *openapiclient.NewInviteRequest("Email_example", "Role_example") // InviteRequest | The invite request payload.

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.InvitesAPI.InviteUser(context.Background()).InviteRequest(inviteRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `InvitesAPI.InviteUser``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `InviteUser`: Invite
	fmt.Fprintf(os.Stdout, "Response from `InvitesAPI.InviteUser`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiInviteUserRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inviteRequest** | [**InviteRequest**](InviteRequest.md) | The invite request payload. | 

### Return type

[**Invite**](Invite.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ListInvites

> InviteListResponse ListInvites(ctx).Limit(limit).After(after).Execute()

Returns a list of invites in the organization.

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
	limit := int32(56) // int32 | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional) (default to 20)
	after := "after_example" // string | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.InvitesAPI.ListInvites(context.Background()).Limit(limit).After(after).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `InvitesAPI.ListInvites``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ListInvites`: InviteListResponse
	fmt.Fprintf(os.Stdout, "Response from `InvitesAPI.ListInvites`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiListInvitesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **int32** | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [default to 20]
 **after** | **string** | A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | 

### Return type

[**InviteListResponse**](InviteListResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## RetrieveInvite

> Invite RetrieveInvite(ctx, inviteId).Execute()

Retrieves an invite.

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
	inviteId := "inviteId_example" // string | The ID of the invite to retrieve.

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.InvitesAPI.RetrieveInvite(context.Background(), inviteId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `InvitesAPI.RetrieveInvite``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `RetrieveInvite`: Invite
	fmt.Fprintf(os.Stdout, "Response from `InvitesAPI.RetrieveInvite`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**inviteId** | **string** | The ID of the invite to retrieve. | 

### Other Parameters

Other parameters are passed through a pointer to a apiRetrieveInviteRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**Invite**](Invite.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

