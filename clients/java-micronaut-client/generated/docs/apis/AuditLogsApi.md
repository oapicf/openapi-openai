# AuditLogsApi

All URIs are relative to *https://api.openai.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**listAuditLogs**](AuditLogsApi.md#listAuditLogs) | **GET** /organization/audit_logs | List user actions and configuration changes within this organization. |


## Creating AuditLogsApi

To initiate an instance of `AuditLogsApi`, you can use micronaut's `ApplicationContext`:
```java
/* imports
import io.micronaut.runtime.Micronaut;
import io.micronaut.context.ApplicationContext;
import org.openapitools.api.AuditLogsApi;
*/

ApplicationContext context = Micronaut.run(/* ... */);
PetApi apiInstance = context.getBean(AuditLogsApi.class);
```

Or the `@Inject` annotation:
```java
@Singleton
class MyClass {
    @Inject
    AuditLogsApi auditLogsApi;

    /* ... use the injected variable */
}
```
Note that the class needs to be annotated with one of Micronaut's [scope annotations](https://docs.micronaut.io/latest/guide/#scopes) like `Singleton` in order to be processed.

More information can be found inside [Inversion of Control guide section](https://docs.micronaut.io/latest/guide/#ioc).

<a id="listAuditLogs"></a>
# **listAuditLogs**
```java
Mono<ListAuditLogsResponse> AuditLogsApi.listAuditLogs(effectiveAtprojectIdseventTypesactorIdsactorEmailsresourceIdslimitafterbefore)
```

List user actions and configuration changes within this organization.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **effectiveAt** | [**ListAuditLogsEffectiveAtParameter**](.md)| Return only events whose &#x60;effective_at&#x60; (Unix seconds) is in this range. | [optional parameter] |
| **projectIds** | [**List&lt;String&gt;**](String.md)| Return only events for these projects. | [optional parameter] |
| **eventTypes** | [**List&lt;AuditLogEventType&gt;**](AuditLogEventType.md)| Return only events with a &#x60;type&#x60; in one of these values. For example, &#x60;project.created&#x60;. For all options, see the documentation for the [audit log object](/docs/api-reference/audit-logs/object). | [optional parameter] |
| **actorIds** | [**List&lt;String&gt;**](String.md)| Return only events performed by these actors. Can be a user ID, a service account ID, or an api key tracking ID. | [optional parameter] |
| **actorEmails** | [**List&lt;String&gt;**](String.md)| Return only events performed by users with these emails. | [optional parameter] |
| **resourceIds** | [**List&lt;String&gt;**](String.md)| Return only events performed on these targets. For example, a project ID updated. | [optional parameter] |
| **limit** | `Integer`| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional parameter] [default to `20`] |
| **after** | `String`| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional parameter] |
| **before** | `String`| A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [optional parameter] |


### Return type
[**ListAuditLogsResponse**](ListAuditLogsResponse.md)

### Authorization
* **[ApiKeyAuth](auth.md#ApiKeyAuth)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

