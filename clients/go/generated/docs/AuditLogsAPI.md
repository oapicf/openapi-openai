# \AuditLogsAPI

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ListAuditLogs**](AuditLogsAPI.md#ListAuditLogs) | **Get** /organization/audit_logs | List user actions and configuration changes within this organization.



## ListAuditLogs

> ListAuditLogsResponse ListAuditLogs(ctx).EffectiveAt(effectiveAt).ProjectIds(projectIds).EventTypes(eventTypes).ActorIds(actorIds).ActorEmails(actorEmails).ResourceIds(resourceIds).Limit(limit).After(after).Before(before).Execute()

List user actions and configuration changes within this organization.

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
	effectiveAt := *openapiclient.NewListAuditLogsEffectiveAtParameter() // ListAuditLogsEffectiveAtParameter | Return only events whose `effective_at` (Unix seconds) is in this range. (optional)
	projectIds := []string{"Inner_example"} // []string | Return only events for these projects. (optional)
	eventTypes := []openapiclient.AuditLogEventType{openapiclient.AuditLogEventType("api_key.created")} // []AuditLogEventType | Return only events with a `type` in one of these values. For example, `project.created`. For all options, see the documentation for the [audit log object](/docs/api-reference/audit-logs/object). (optional)
	actorIds := []string{"Inner_example"} // []string | Return only events performed by these actors. Can be a user ID, a service account ID, or an api key tracking ID. (optional)
	actorEmails := []string{"Inner_example"} // []string | Return only events performed by users with these emails. (optional)
	resourceIds := []string{"Inner_example"} // []string | Return only events performed on these targets. For example, a project ID updated. (optional)
	limit := int32(56) // int32 | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional) (default to 20)
	after := "after_example" // string | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (optional)
	before := "before_example" // string | A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list.  (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.AuditLogsAPI.ListAuditLogs(context.Background()).EffectiveAt(effectiveAt).ProjectIds(projectIds).EventTypes(eventTypes).ActorIds(actorIds).ActorEmails(actorEmails).ResourceIds(resourceIds).Limit(limit).After(after).Before(before).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `AuditLogsAPI.ListAuditLogs``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ListAuditLogs`: ListAuditLogsResponse
	fmt.Fprintf(os.Stdout, "Response from `AuditLogsAPI.ListAuditLogs`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiListAuditLogsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **effectiveAt** | [**ListAuditLogsEffectiveAtParameter**](ListAuditLogsEffectiveAtParameter.md) | Return only events whose &#x60;effective_at&#x60; (Unix seconds) is in this range. | 
 **projectIds** | **[]string** | Return only events for these projects. | 
 **eventTypes** | [**[]AuditLogEventType**](AuditLogEventType.md) | Return only events with a &#x60;type&#x60; in one of these values. For example, &#x60;project.created&#x60;. For all options, see the documentation for the [audit log object](/docs/api-reference/audit-logs/object). | 
 **actorIds** | **[]string** | Return only events performed by these actors. Can be a user ID, a service account ID, or an api key tracking ID. | 
 **actorEmails** | **[]string** | Return only events performed by users with these emails. | 
 **resourceIds** | **[]string** | Return only events performed on these targets. For example, a project ID updated. | 
 **limit** | **int32** | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [default to 20]
 **after** | **string** | A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | 
 **before** | **string** | A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | 

### Return type

[**ListAuditLogsResponse**](ListAuditLogsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

