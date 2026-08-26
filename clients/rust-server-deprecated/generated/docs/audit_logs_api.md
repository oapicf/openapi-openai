# audit_logs_api

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
**list-audit-logs**](audit_logs_api.md#list-audit-logs) | **GET** /organization/audit_logs | List user actions and configuration changes within this organization.


# **list-audit-logs**
> models::ListAuditLogsResponse list-audit-logs(ctx, optional)
List user actions and configuration changes within this organization.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **effective_at** | [****](.md)| Return only events whose `effective_at` (Unix seconds) is in this range. | 
 **project_ids_left_square_bracket_right_square_bracket** | [**String**](String.md)| Return only events for these projects. | 
 **event_types_left_square_bracket_right_square_bracket** | [**models::AuditLogEventType**](models::AuditLogEventType.md)| Return only events with a `type` in one of these values. For example, `project.created`. For all options, see the documentation for the [audit log object](/docs/api-reference/audit-logs/object). | 
 **actor_ids_left_square_bracket_right_square_bracket** | [**String**](String.md)| Return only events performed by these actors. Can be a user ID, a service account ID, or an api key tracking ID. | 
 **actor_emails_left_square_bracket_right_square_bracket** | [**String**](String.md)| Return only events performed by users with these emails. | 
 **resource_ids_left_square_bracket_right_square_bracket** | [**String**](String.md)| Return only events performed on these targets. For example, a project ID updated. | 
 **limit** | **i32**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [default to 20]
 **after** | **String**| A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  | 
 **before** | **String**| A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list.  | 

### Return type

[**models::ListAuditLogsResponse**](ListAuditLogsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

