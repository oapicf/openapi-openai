# AuditLogsApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**list_audit_logs**](AuditLogsApi.md#list_audit_logs) | **GET** /organization/audit_logs | List user actions and configuration changes within this organization.


# **list_audit_logs**
> `list_audit_logs`(_api::`AuditLogsApi`; `effective_at`=nothing, `project_ids`=nothing, `event_types`=nothing, `actor_ids`=nothing, `actor_emails`=nothing, `resource_ids`=nothing, `limit`=nothing, `after`=nothing, `before`=nothing, _mediaType=nothing) -> `ListAuditLogsResponse`, `OpenAPI.Clients.ApiResponse` <br/>
> `list_audit_logs`(_api::`AuditLogsApi`, response_stream::`Channel`; `effective_at`=nothing, `project_ids`=nothing, `event_types`=nothing, `actor_ids`=nothing, `actor_emails`=nothing, `resource_ids`=nothing, `limit`=nothing, `after`=nothing, `before`=nothing, _mediaType=nothing) -> `Channel`{ `ListAuditLogsResponse` }, `OpenAPI.Clients.ApiResponse`

List user actions and configuration changes within this organization.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`AuditLogsApi`** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`effective_at`** | [**`ListAuditLogsEffectiveAtParameter`**](.md) | Return only events whose &#x60;effective_at&#x60; (Unix seconds) is in this range. | [default to nothing]
 **`project_ids`** | [**`Vector{String}`**](String.md) | Return only events for these projects. | [default to nothing]
 **`event_types`** | [**`Vector{AuditLogEventType}`**](AuditLogEventType.md) | Return only events with a &#x60;type&#x60; in one of these values. For example, &#x60;project.created&#x60;. For all options, see the documentation for the [audit log object](/docs/api-reference/audit-logs/object). | [default to nothing]
 **`actor_ids`** | [**`Vector{String}`**](String.md) | Return only events performed by these actors. Can be a user ID, a service account ID, or an api key tracking ID. | [default to nothing]
 **`actor_emails`** | [**`Vector{String}`**](String.md) | Return only events performed by users with these emails. | [default to nothing]
 **`resource_ids`** | [**`Vector{String}`**](String.md) | Return only events performed on these targets. For example, a project ID updated. | [default to nothing]
 **`limit`** | **`Int64`** | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [default to 20]
 **`after`** | **`String`** | A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [default to nothing]
 **`before`** | **`String`** | A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [default to nothing]

### Return type

[**`ListAuditLogsResponse`**](ListAuditLogsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

