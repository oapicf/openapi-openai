# .AuditLogsApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listAuditLogs**](AuditLogsApi.md#listAuditLogs) | **GET** /organization/audit_logs | List user actions and configuration changes within this organization.


# **listAuditLogs**
> ListAuditLogsResponse listAuditLogs()


### Example


```typescript
import { createConfiguration, AuditLogsApi } from '';
import type { AuditLogsApiListAuditLogsRequest } from '';

const configuration = createConfiguration();
const apiInstance = new AuditLogsApi(configuration);

const request: AuditLogsApiListAuditLogsRequest = {
    // Return only events whose `effective_at` (Unix seconds) is in this range. (optional)
  effectiveAt: {
    gt: 1,
    gte: 1,
    lt: 1,
    lte: 1,
  },
    // Return only events for these projects. (optional)
  projectIds: [
    "project_ids[]_example",
  ],
    // Return only events with a `type` in one of these values. For example, `project.created`. For all options, see the documentation for the [audit log object](/docs/api-reference/audit-logs/object). (optional)
  eventTypes: [
    "api_key.created",
  ],
    // Return only events performed by these actors. Can be a user ID, a service account ID, or an api key tracking ID. (optional)
  actorIds: [
    "actor_ids[]_example",
  ],
    // Return only events performed by users with these emails. (optional)
  actorEmails: [
    "actor_emails[]_example",
  ],
    // Return only events performed on these targets. For example, a project ID updated. (optional)
  resourceIds: [
    "resource_ids[]_example",
  ],
    // A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional)
  limit: 20,
    // A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (optional)
  after: "after_example",
    // A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list.  (optional)
  before: "before_example",
};

const data = await apiInstance.listAuditLogs(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **effectiveAt** | **ListAuditLogsEffectiveAtParameter** | Return only events whose &#x60;effective_at&#x60; (Unix seconds) is in this range. | (optional) defaults to undefined
 **projectIds** | **Array&lt;string&gt;** | Return only events for these projects. | (optional) defaults to undefined
 **eventTypes** | **Array&lt;AuditLogEventType&gt;** | Return only events with a &#x60;type&#x60; in one of these values. For example, &#x60;project.created&#x60;. For all options, see the documentation for the [audit log object](/docs/api-reference/audit-logs/object). | (optional) defaults to undefined
 **actorIds** | **Array&lt;string&gt;** | Return only events performed by these actors. Can be a user ID, a service account ID, or an api key tracking ID. | (optional) defaults to undefined
 **actorEmails** | **Array&lt;string&gt;** | Return only events performed by users with these emails. | (optional) defaults to undefined
 **resourceIds** | **Array&lt;string&gt;** | Return only events performed on these targets. For example, a project ID updated. | (optional) defaults to undefined
 **limit** | [**number**] | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | (optional) defaults to 20
 **after** | [**string**] | A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | (optional) defaults to undefined
 **before** | [**string**] | A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | (optional) defaults to undefined


### Return type

**ListAuditLogsResponse**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Audit logs listed successfully. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)


