# AuditLogsAPI

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listAuditLogs**](AuditLogsAPI.md#listauditlogs) | **GET** /organization/audit_logs | List user actions and configuration changes within this organization.


# **listAuditLogs**
```swift
    open class func listAuditLogs(effectiveAt: ListAuditLogsEffectiveAtParameter? = nil, projectIds: [String]? = nil, eventTypes: [AuditLogEventType]? = nil, actorIds: [String]? = nil, actorEmails: [String]? = nil, resourceIds: [String]? = nil, limit: Int? = nil, after: String? = nil, before: String? = nil, completion: @escaping (_ data: ListAuditLogsResponse?, _ error: Error?) -> Void)
```

List user actions and configuration changes within this organization.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let effectiveAt = list_audit_logs_effective_at_parameter(gt: 123, gte: 123, lt: 123, lte: 123) // ListAuditLogsEffectiveAtParameter | Return only events whose `effective_at` (Unix seconds) is in this range. (optional)
let projectIds = ["inner_example"] // [String] | Return only events for these projects. (optional)
let eventTypes = [AuditLogEventType()] // [AuditLogEventType] | Return only events with a `type` in one of these values. For example, `project.created`. For all options, see the documentation for the [audit log object](/docs/api-reference/audit-logs/object). (optional)
let actorIds = ["inner_example"] // [String] | Return only events performed by these actors. Can be a user ID, a service account ID, or an api key tracking ID. (optional)
let actorEmails = ["inner_example"] // [String] | Return only events performed by users with these emails. (optional)
let resourceIds = ["inner_example"] // [String] | Return only events performed on these targets. For example, a project ID updated. (optional)
let limit = 987 // Int | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional) (default to 20)
let after = "after_example" // String | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (optional)
let before = "before_example" // String | A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list.  (optional)

// List user actions and configuration changes within this organization.
AuditLogsAPI.listAuditLogs(effectiveAt: effectiveAt, projectIds: projectIds, eventTypes: eventTypes, actorIds: actorIds, actorEmails: actorEmails, resourceIds: resourceIds, limit: limit, after: after, before: before) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **effectiveAt** | [**ListAuditLogsEffectiveAtParameter**](.md) | Return only events whose &#x60;effective_at&#x60; (Unix seconds) is in this range. | [optional] 
 **projectIds** | [**[String]**](String.md) | Return only events for these projects. | [optional] 
 **eventTypes** | [**[AuditLogEventType]**](AuditLogEventType.md) | Return only events with a &#x60;type&#x60; in one of these values. For example, &#x60;project.created&#x60;. For all options, see the documentation for the [audit log object](/docs/api-reference/audit-logs/object). | [optional] 
 **actorIds** | [**[String]**](String.md) | Return only events performed by these actors. Can be a user ID, a service account ID, or an api key tracking ID. | [optional] 
 **actorEmails** | [**[String]**](String.md) | Return only events performed by users with these emails. | [optional] 
 **resourceIds** | [**[String]**](String.md) | Return only events performed on these targets. For example, a project ID updated. | [optional] 
 **limit** | **Int** | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20]
 **after** | **String** | A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] 
 **before** | **String** | A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [optional] 

### Return type

[**ListAuditLogsResponse**](ListAuditLogsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

