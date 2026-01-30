# AuditLogsApi

All URIs are relative to *https://api.openai.com/v1*

|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|[**listAuditLogs**](#listauditlogs) | **GET** /organization/audit_logs | List user actions and configuration changes within this organization.|

# **listAuditLogs**
> ListAuditLogsResponse listAuditLogs()


### Example

```typescript
import {
    AuditLogsApi,
    Configuration,
    ListAuditLogsEffectiveAtParameter
} from './api';

const configuration = new Configuration();
const apiInstance = new AuditLogsApi(configuration);

let effectiveAt: ListAuditLogsEffectiveAtParameter; //Return only events whose `effective_at` (Unix seconds) is in this range. (optional) (default to undefined)
let projectIds: Array<string>; //Return only events for these projects. (optional) (default to undefined)
let eventTypes: Array<AuditLogEventType>; //Return only events with a `type` in one of these values. For example, `project.created`. For all options, see the documentation for the [audit log object](/docs/api-reference/audit-logs/object). (optional) (default to undefined)
let actorIds: Array<string>; //Return only events performed by these actors. Can be a user ID, a service account ID, or an api key tracking ID. (optional) (default to undefined)
let actorEmails: Array<string>; //Return only events performed by users with these emails. (optional) (default to undefined)
let resourceIds: Array<string>; //Return only events performed on these targets. For example, a project ID updated. (optional) (default to undefined)
let limit: number; //A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional) (default to 20)
let after: string; //A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (optional) (default to undefined)
let before: string; //A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list.  (optional) (default to undefined)

const { status, data } = await apiInstance.listAuditLogs(
    effectiveAt,
    projectIds,
    eventTypes,
    actorIds,
    actorEmails,
    resourceIds,
    limit,
    after,
    before
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **effectiveAt** | **ListAuditLogsEffectiveAtParameter** | Return only events whose &#x60;effective_at&#x60; (Unix seconds) is in this range. | (optional) defaults to undefined|
| **projectIds** | **Array&lt;string&gt;** | Return only events for these projects. | (optional) defaults to undefined|
| **eventTypes** | **Array&lt;AuditLogEventType&gt;** | Return only events with a &#x60;type&#x60; in one of these values. For example, &#x60;project.created&#x60;. For all options, see the documentation for the [audit log object](/docs/api-reference/audit-logs/object). | (optional) defaults to undefined|
| **actorIds** | **Array&lt;string&gt;** | Return only events performed by these actors. Can be a user ID, a service account ID, or an api key tracking ID. | (optional) defaults to undefined|
| **actorEmails** | **Array&lt;string&gt;** | Return only events performed by users with these emails. | (optional) defaults to undefined|
| **resourceIds** | **Array&lt;string&gt;** | Return only events performed on these targets. For example, a project ID updated. | (optional) defaults to undefined|
| **limit** | [**number**] | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | (optional) defaults to 20|
| **after** | [**string**] | A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | (optional) defaults to undefined|
| **before** | [**string**] | A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | (optional) defaults to undefined|


### Return type

**ListAuditLogsResponse**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | Audit logs listed successfully. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

