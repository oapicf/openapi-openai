# AuditLogsApi

All URIs are relative to *https://api.openai.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**listAuditLogs**](AuditLogsApi.md#listAuditLogs) | **GET** /organization/audit_logs | List user actions and configuration changes within this organization. |


<a name="listAuditLogs"></a>
# **listAuditLogs**
> ListAuditLogsResponse listAuditLogs(effective\_at, project\_ids\[\], event\_types\[\], actor\_ids\[\], actor\_emails\[\], resource\_ids\[\], limit, after, before)

List user actions and configuration changes within this organization.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **effective\_at** | [**list_audit_logs_effective_at_parameter**](../Models/.md)| Return only events whose &#x60;effective_at&#x60; (Unix seconds) is in this range. | [optional] [default to null] |
| **project\_ids\[\]** | [**List**](../Models/String.md)| Return only events for these projects. | [optional] [default to null] |
| **event\_types\[\]** | [**List**](../Models/AuditLogEventType.md)| Return only events with a &#x60;type&#x60; in one of these values. For example, &#x60;project.created&#x60;. For all options, see the documentation for the [audit log object](/docs/api-reference/audit-logs/object). | [optional] [default to null] |
| **actor\_ids\[\]** | [**List**](../Models/String.md)| Return only events performed by these actors. Can be a user ID, a service account ID, or an api key tracking ID. | [optional] [default to null] |
| **actor\_emails\[\]** | [**List**](../Models/String.md)| Return only events performed by users with these emails. | [optional] [default to null] |
| **resource\_ids\[\]** | [**List**](../Models/String.md)| Return only events performed on these targets. For example, a project ID updated. | [optional] [default to null] |
| **limit** | **Integer**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20] |
| **after** | **String**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] [default to null] |
| **before** | **String**| A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [optional] [default to null] |

### Return type

[**ListAuditLogsResponse**](../Models/ListAuditLogsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

