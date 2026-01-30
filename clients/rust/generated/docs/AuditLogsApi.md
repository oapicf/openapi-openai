# \AuditLogsApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**list_audit_logs**](AuditLogsApi.md#list_audit_logs) | **GET** /organization/audit_logs | List user actions and configuration changes within this organization.



## list_audit_logs

> models::ListAuditLogsResponse list_audit_logs(effective_at, project_ids_left_square_bracket_right_square_bracket, event_types_left_square_bracket_right_square_bracket, actor_ids_left_square_bracket_right_square_bracket, actor_emails_left_square_bracket_right_square_bracket, resource_ids_left_square_bracket_right_square_bracket, limit, after, before)
List user actions and configuration changes within this organization.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**effective_at** | Option<[**ListAuditLogsEffectiveAtParameter**](.md)> | Return only events whose `effective_at` (Unix seconds) is in this range. |  |
**project_ids_left_square_bracket_right_square_bracket** | Option<[**Vec<String>**](String.md)> | Return only events for these projects. |  |
**event_types_left_square_bracket_right_square_bracket** | Option<[**Vec<models::AuditLogEventType>**](models::AuditLogEventType.md)> | Return only events with a `type` in one of these values. For example, `project.created`. For all options, see the documentation for the [audit log object](/docs/api-reference/audit-logs/object). |  |
**actor_ids_left_square_bracket_right_square_bracket** | Option<[**Vec<String>**](String.md)> | Return only events performed by these actors. Can be a user ID, a service account ID, or an api key tracking ID. |  |
**actor_emails_left_square_bracket_right_square_bracket** | Option<[**Vec<String>**](String.md)> | Return only events performed by users with these emails. |  |
**resource_ids_left_square_bracket_right_square_bracket** | Option<[**Vec<String>**](String.md)> | Return only events performed on these targets. For example, a project ID updated. |  |
**limit** | Option<**i32**> | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  |  |[default to 20]
**after** | Option<**String**> | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  |  |
**before** | Option<**String**> | A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list.  |  |

### Return type

[**models::ListAuditLogsResponse**](ListAuditLogsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

