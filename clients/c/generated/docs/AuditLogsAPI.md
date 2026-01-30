# AuditLogsAPI

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AuditLogsAPI_listAuditLogs**](AuditLogsAPI.md#AuditLogsAPI_listAuditLogs) | **GET** /organization/audit_logs | List user actions and configuration changes within this organization.


# **AuditLogsAPI_listAuditLogs**
```c
// List user actions and configuration changes within this organization.
//
list_audit_logs_response_t* AuditLogsAPI_listAuditLogs(apiClient_t *apiClient, list_audit_logs_effective_at_parameter_t *effective_at, list_t *project_ids[], list_t *event_types[], list_t *actor_ids[], list_t *actor_emails[], list_t *resource_ids[], int *limit, char *after, char *before);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**effective_at** | **[list_audit_logs_effective_at_parameter_t](.md) \*** | Return only events whose &#x60;effective_at&#x60; (Unix seconds) is in this range. | [optional] 
**project_ids[]** | **[list_t](char.md) \*** | Return only events for these projects. | [optional] 
**event_types[]** | **[list_t](audit_log_event_type.md) \*** | Return only events with a &#x60;type&#x60; in one of these values. For example, &#x60;project.created&#x60;. For all options, see the documentation for the [audit log object](/docs/api-reference/audit-logs/object). | [optional] 
**actor_ids[]** | **[list_t](char.md) \*** | Return only events performed by these actors. Can be a user ID, a service account ID, or an api key tracking ID. | [optional] 
**actor_emails[]** | **[list_t](char.md) \*** | Return only events performed by users with these emails. | [optional] 
**resource_ids[]** | **[list_t](char.md) \*** | Return only events performed on these targets. For example, a project ID updated. | [optional] 
**limit** | **int \*** | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20]
**after** | **char \*** | A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] 
**before** | **char \*** | A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [optional] 

### Return type

[list_audit_logs_response_t](list_audit_logs_response.md) *


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

