# Org.OpenAPITools.Api.AuditLogsApi

All URIs are relative to *https://api.openai.com/v1*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**ListAuditLogs**](AuditLogsApi.md#listauditlogs) | **GET** /organization/audit_logs | List user actions and configuration changes within this organization. |

<a id="listauditlogs"></a>
# **ListAuditLogs**
> ListAuditLogsResponse ListAuditLogs (ListAuditLogsEffectiveAtParameter effectiveAt = null, List<string> projectIds = null, List<AuditLogEventType> eventTypes = null, List<string> actorIds = null, List<string> actorEmails = null, List<string> resourceIds = null, int limit = null, string after = null, string before = null)

List user actions and configuration changes within this organization.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **effectiveAt** | [**ListAuditLogsEffectiveAtParameter**](ListAuditLogsEffectiveAtParameter.md) | Return only events whose &#x60;effective_at&#x60; (Unix seconds) is in this range. | [optional]  |
| **projectIds** | [**List&lt;string&gt;**](string.md) | Return only events for these projects. | [optional]  |
| **eventTypes** | [**List&lt;AuditLogEventType&gt;**](AuditLogEventType.md) | Return only events with a &#x60;type&#x60; in one of these values. For example, &#x60;project.created&#x60;. For all options, see the documentation for the [audit log object](/docs/api-reference/audit-logs/object). | [optional]  |
| **actorIds** | [**List&lt;string&gt;**](string.md) | Return only events performed by these actors. Can be a user ID, a service account ID, or an api key tracking ID. | [optional]  |
| **actorEmails** | [**List&lt;string&gt;**](string.md) | Return only events performed by users with these emails. | [optional]  |
| **resourceIds** | [**List&lt;string&gt;**](string.md) | Return only events performed on these targets. For example, a project ID updated. | [optional]  |
| **limit** | **int** | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20] |
| **after** | **string** | A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional]  |
| **before** | **string** | A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [optional]  |

### Return type

[**ListAuditLogsResponse**](ListAuditLogsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Audit logs listed successfully. |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

