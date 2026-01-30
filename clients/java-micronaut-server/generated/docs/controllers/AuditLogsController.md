# AuditLogsController

All URIs are relative to `"/v1"`

The controller class is defined in **[AuditLogsController.java](../../src/main/java/org/openapitools/controller/AuditLogsController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**listAuditLogs**](#listAuditLogs) | **GET** /organization/audit_logs | List user actions and configuration changes within this organization.

<a id="listAuditLogs"></a>
# **listAuditLogs**
```java
Mono<ListAuditLogsResponse> AuditLogsController.listAuditLogs(effectiveAtprojectIdseventTypesactorIdsactorEmailsresourceIdslimitafterbefore)
```

List user actions and configuration changes within this organization.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**effectiveAt** | [**ListAuditLogsEffectiveAtParameter**](../../docs/models/.md) | Return only events whose &#x60;effective_at&#x60; (Unix seconds) is in this range. | [optional parameter]
**projectIds** | [**List&lt;String&gt;**](../../docs/models/String.md) | Return only events for these projects. | [optional parameter]
**eventTypes** | [**List&lt;AuditLogEventType&gt;**](../../docs/models/AuditLogEventType.md) | Return only events with a &#x60;type&#x60; in one of these values. For example, &#x60;project.created&#x60;. For all options, see the documentation for the [audit log object](/docs/api-reference/audit-logs/object). | [optional parameter]
**actorIds** | [**List&lt;String&gt;**](../../docs/models/String.md) | Return only events performed by these actors. Can be a user ID, a service account ID, or an api key tracking ID. | [optional parameter]
**actorEmails** | [**List&lt;String&gt;**](../../docs/models/String.md) | Return only events performed by users with these emails. | [optional parameter]
**resourceIds** | [**List&lt;String&gt;**](../../docs/models/String.md) | Return only events performed on these targets. For example, a project ID updated. | [optional parameter]
**limit** | `Integer` | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional parameter] [default to `20`]
**after** | `String` | A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional parameter]
**before** | `String` | A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [optional parameter]

### Return type
[**ListAuditLogsResponse**](../../docs/models/ListAuditLogsResponse.md)

### Authorization
* **ApiKeyAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

