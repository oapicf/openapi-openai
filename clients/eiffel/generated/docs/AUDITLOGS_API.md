# AUDITLOGS_API

All URIs are relative to *https://api.openai.com/v1*

Feature | HTTP request | Description
------------- | ------------- | -------------
[**list_audit_logs**](AUDITLOGS_API.md#list_audit_logs) | **Get** /organization/audit_logs | List user actions and configuration changes within this organization.


# **list_audit_logs**
> list_audit_logs (effective_at:  detachable LIST_AUDIT_LOGS_EFFECTIVE_AT_PARAMETER ; project_ids:  detachable LIST [STRING_32] ; event_types:  detachable LIST [AUDIT_LOG_EVENT_TYPE] ; actor_ids:  detachable LIST [STRING_32] ; actor_emails:  detachable LIST [STRING_32] ; resource_ids:  detachable LIST [STRING_32] ; limit:  detachable INTEGER_32 ; after:  detachable STRING_32 ; before:  detachable STRING_32 ): detachable LIST_AUDIT_LOGS_RESPONSE


List user actions and configuration changes within this organization.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **effective_at** | [**LIST_AUDIT_LOGS_EFFECTIVE_AT_PARAMETER**](.md)| Return only events whose &#x60;effective_at&#x60; (Unix seconds) is in this range. | [optional] [default to null]
 **project_ids** | [**LIST [STRING_32]**](STRING_32.md)| Return only events for these projects. | [optional] [default to null]
 **event_types** | [**LIST [AUDIT_LOG_EVENT_TYPE]**](AUDIT_LOG_EVENT_TYPE.md)| Return only events with a &#x60;type&#x60; in one of these values. For example, &#x60;project.created&#x60;. For all options, see the documentation for the [audit log object](/docs/api-reference/audit-logs/object). | [optional] [default to null]
 **actor_ids** | [**LIST [STRING_32]**](STRING_32.md)| Return only events performed by these actors. Can be a user ID, a service account ID, or an api key tracking ID. | [optional] [default to null]
 **actor_emails** | [**LIST [STRING_32]**](STRING_32.md)| Return only events performed by users with these emails. | [optional] [default to null]
 **resource_ids** | [**LIST [STRING_32]**](STRING_32.md)| Return only events performed on these targets. For example, a project ID updated. | [optional] [default to null]
 **limit** | **INTEGER_32**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20]
 **after** | **STRING_32**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] [default to null]
 **before** | **STRING_32**| A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [optional] [default to null]

### Return type

[**LIST_AUDIT_LOGS_RESPONSE**](ListAuditLogsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

