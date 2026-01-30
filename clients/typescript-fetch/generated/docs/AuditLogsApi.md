# AuditLogsApi

All URIs are relative to *https://api.openai.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**listAuditLogs**](AuditLogsApi.md#listauditlogs) | **GET** /organization/audit_logs | List user actions and configuration changes within this organization. |



## listAuditLogs

> ListAuditLogsResponse listAuditLogs(effectiveAt, projectIds, eventTypes, actorIds, actorEmails, resourceIds, limit, after, before)

List user actions and configuration changes within this organization.

### Example

```ts
import {
  Configuration,
  AuditLogsApi,
} from '';
import type { ListAuditLogsRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // Configure HTTP bearer authorization: ApiKeyAuth
    accessToken: "YOUR BEARER TOKEN",
  });
  const api = new AuditLogsApi(config);

  const body = {
    // ListAuditLogsEffectiveAtParameter | Return only events whose `effective_at` (Unix seconds) is in this range. (optional)
    effectiveAt: ...,
    // Array<string> | Return only events for these projects. (optional)
    projectIds: ...,
    // Array<AuditLogEventType> | Return only events with a `type` in one of these values. For example, `project.created`. For all options, see the documentation for the [audit log object](/docs/api-reference/audit-logs/object). (optional)
    eventTypes: ...,
    // Array<string> | Return only events performed by these actors. Can be a user ID, a service account ID, or an api key tracking ID. (optional)
    actorIds: ...,
    // Array<string> | Return only events performed by users with these emails. (optional)
    actorEmails: ...,
    // Array<string> | Return only events performed on these targets. For example, a project ID updated. (optional)
    resourceIds: ...,
    // number | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional)
    limit: 56,
    // string | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (optional)
    after: after_example,
    // string | A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list.  (optional)
    before: before_example,
  } satisfies ListAuditLogsRequest;

  try {
    const data = await api.listAuditLogs(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **effectiveAt** | [](.md) | Return only events whose &#x60;effective_at&#x60; (Unix seconds) is in this range. | [Optional] [Defaults to `undefined`] |
| **projectIds** | `Array<string>` | Return only events for these projects. | [Optional] |
| **eventTypes** | `Array<AuditLogEventType>` | Return only events with a &#x60;type&#x60; in one of these values. For example, &#x60;project.created&#x60;. For all options, see the documentation for the [audit log object](/docs/api-reference/audit-logs/object). | [Optional] |
| **actorIds** | `Array<string>` | Return only events performed by these actors. Can be a user ID, a service account ID, or an api key tracking ID. | [Optional] |
| **actorEmails** | `Array<string>` | Return only events performed by users with these emails. | [Optional] |
| **resourceIds** | `Array<string>` | Return only events performed on these targets. For example, a project ID updated. | [Optional] |
| **limit** | `number` | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [Optional] [Defaults to `20`] |
| **after** | `string` | A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [Optional] [Defaults to `undefined`] |
| **before** | `string` | A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [Optional] [Defaults to `undefined`] |

### Return type

[**ListAuditLogsResponse**](ListAuditLogsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Audit logs listed successfully. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

