# AuditLogsApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listAuditLogs**](AuditLogsApi.md#listAuditLogs) | **GET** /organization/audit_logs | List user actions and configuration changes within this organization.



## listAuditLogs

> ListAuditLogsResponse listAuditLogs(effectiveAt, projectIds, eventTypes, actorIds, actorEmails, resourceIds, limit, after, before)

List user actions and configuration changes within this organization.

### Example

```java
// Import classes:
//import org.openapitools.client.api.AuditLogsApi;

AuditLogsApi apiInstance = new AuditLogsApi();
ListAuditLogsEffectiveAtParameter effectiveAt = null; // ListAuditLogsEffectiveAtParameter | Return only events whose `effective_at` (Unix seconds) is in this range.
List<String> projectIds = null; // List<String> | Return only events for these projects.
List<AuditLogEventType> eventTypes = null; // List<AuditLogEventType> | Return only events with a `type` in one of these values. For example, `project.created`. For all options, see the documentation for the [audit log object](/docs/api-reference/audit-logs/object).
List<String> actorIds = null; // List<String> | Return only events performed by these actors. Can be a user ID, a service account ID, or an api key tracking ID.
List<String> actorEmails = null; // List<String> | Return only events performed by users with these emails.
List<String> resourceIds = null; // List<String> | Return only events performed on these targets. For example, a project ID updated.
Integer limit = 20; // Integer | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
String after = null; // String | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
String before = null; // String | A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. 
try {
    ListAuditLogsResponse result = apiInstance.listAuditLogs(effectiveAt, projectIds, eventTypes, actorIds, actorEmails, resourceIds, limit, after, before);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuditLogsApi#listAuditLogs");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **effectiveAt** | [**ListAuditLogsEffectiveAtParameter**](.md)| Return only events whose &#x60;effective_at&#x60; (Unix seconds) is in this range. | [optional] [default to null]
 **projectIds** | [**List&lt;String&gt;**](String.md)| Return only events for these projects. | [optional] [default to null]
 **eventTypes** | [**List&lt;AuditLogEventType&gt;**](AuditLogEventType.md)| Return only events with a &#x60;type&#x60; in one of these values. For example, &#x60;project.created&#x60;. For all options, see the documentation for the [audit log object](/docs/api-reference/audit-logs/object). | [optional] [default to null]
 **actorIds** | [**List&lt;String&gt;**](String.md)| Return only events performed by these actors. Can be a user ID, a service account ID, or an api key tracking ID. | [optional] [default to null]
 **actorEmails** | [**List&lt;String&gt;**](String.md)| Return only events performed by users with these emails. | [optional] [default to null]
 **resourceIds** | [**List&lt;String&gt;**](String.md)| Return only events performed on these targets. For example, a project ID updated. | [optional] [default to null]
 **limit** | **Integer**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20]
 **after** | **String**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] [default to null]
 **before** | **String**| A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [optional] [default to null]

### Return type

[**ListAuditLogsResponse**](ListAuditLogsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

