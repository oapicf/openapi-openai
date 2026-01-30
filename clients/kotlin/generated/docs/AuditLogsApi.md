# AuditLogsApi

All URIs are relative to *https://api.openai.com/v1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**listAuditLogs**](AuditLogsApi.md#listAuditLogs) | **GET** /organization/audit_logs | List user actions and configuration changes within this organization. |


<a id="listAuditLogs"></a>
# **listAuditLogs**
> ListAuditLogsResponse listAuditLogs(effectiveAt, projectIds, eventTypes, actorIds, actorEmails, resourceIds, limit, after, before)

List user actions and configuration changes within this organization.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AuditLogsApi()
val effectiveAt : ListAuditLogsEffectiveAtParameter =  // ListAuditLogsEffectiveAtParameter | Return only events whose `effective_at` (Unix seconds) is in this range.
val projectIds : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | Return only events for these projects.
val eventTypes : kotlin.collections.List<AuditLogEventType> =  // kotlin.collections.List<AuditLogEventType> | Return only events with a `type` in one of these values. For example, `project.created`. For all options, see the documentation for the [audit log object](/docs/api-reference/audit-logs/object).
val actorIds : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | Return only events performed by these actors. Can be a user ID, a service account ID, or an api key tracking ID.
val actorEmails : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | Return only events performed by users with these emails.
val resourceIds : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | Return only events performed on these targets. For example, a project ID updated.
val limit : kotlin.Int = 56 // kotlin.Int | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
val after : kotlin.String = after_example // kotlin.String | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
val before : kotlin.String = before_example // kotlin.String | A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. 
try {
    val result : ListAuditLogsResponse = apiInstance.listAuditLogs(effectiveAt, projectIds, eventTypes, actorIds, actorEmails, resourceIds, limit, after, before)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AuditLogsApi#listAuditLogs")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AuditLogsApi#listAuditLogs")
    e.printStackTrace()
}
```

### Parameters
| **effectiveAt** | [**ListAuditLogsEffectiveAtParameter**](.md)| Return only events whose &#x60;effective_at&#x60; (Unix seconds) is in this range. | [optional] |
| **projectIds** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| Return only events for these projects. | [optional] |
| **eventTypes** | [**kotlin.collections.List&lt;AuditLogEventType&gt;**](AuditLogEventType.md)| Return only events with a &#x60;type&#x60; in one of these values. For example, &#x60;project.created&#x60;. For all options, see the documentation for the [audit log object](/docs/api-reference/audit-logs/object). | [optional] |
| **actorIds** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| Return only events performed by these actors. Can be a user ID, a service account ID, or an api key tracking ID. | [optional] |
| **actorEmails** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| Return only events performed by users with these emails. | [optional] |
| **resourceIds** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| Return only events performed on these targets. For example, a project ID updated. | [optional] |
| **limit** | **kotlin.Int**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20] |
| **after** | **kotlin.String**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **before** | **kotlin.String**| A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [optional] |

### Return type

[**ListAuditLogsResponse**](ListAuditLogsResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

