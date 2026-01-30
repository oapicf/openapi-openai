# AuditLogsApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ListAuditLogs**](AuditLogsApi.md#ListAuditLogs) | **GET** /organization/audit_logs | List user actions and configuration changes within this organization.


# **ListAuditLogs**
> ListAuditLogsResponse ListAuditLogs(effective_at = var.effective_at, project_ids = var.project_ids, event_types = var.event_types, actor_ids = var.actor_ids, actor_emails = var.actor_emails, resource_ids = var.resource_ids, limit = 20, after = var.after, before = var.before)

List user actions and configuration changes within this organization.

### Example
```R
library(openapi)

# List user actions and configuration changes within this organization.
#
# prepare function argument(s)
var_effective_at <- list_audit_logs_effective_at_parameter$new(123, 123, 123, 123) # ListAuditLogsEffectiveAtParameter | Return only events whose `effective_at` (Unix seconds) is in this range. (Optional)
var_project_ids <- c("inner_example") # array[character] | Return only events for these projects. (Optional)
var_event_types <- c(AuditLogEventType$new()) # array[AuditLogEventType] | Return only events with a `type` in one of these values. For example, `project.created`. For all options, see the documentation for the [audit log object](/docs/api-reference/audit-logs/object). (Optional)
var_actor_ids <- c("inner_example") # array[character] | Return only events performed by these actors. Can be a user ID, a service account ID, or an api key tracking ID. (Optional)
var_actor_emails <- c("inner_example") # array[character] | Return only events performed by users with these emails. (Optional)
var_resource_ids <- c("inner_example") # array[character] | Return only events performed on these targets. For example, a project ID updated. (Optional)
var_limit <- 20 # integer | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (Optional)
var_after <- "after_example" # character | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (Optional)
var_before <- "before_example" # character | A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list.  (Optional)

api_instance <- AuditLogsApi$new()
# Configure HTTP bearer authorization: ApiKeyAuth
api_instance$api_client$bearer_token <- Sys.getenv("BEARER_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$ListAuditLogs(effective_at = var_effective_at, project_ids = var_project_ids, event_types = var_event_types, actor_ids = var_actor_ids, actor_emails = var_actor_emails, resource_ids = var_resource_ids, limit = var_limit, after = var_after, before = var_beforedata_file = "result.txt")
result <- api_instance$ListAuditLogs(effective_at = var_effective_at, project_ids = var_project_ids, event_types = var_event_types, actor_ids = var_actor_ids, actor_emails = var_actor_emails, resource_ids = var_resource_ids, limit = var_limit, after = var_after, before = var_before)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **effective_at** | [**ListAuditLogsEffectiveAtParameter**](.md)| Return only events whose &#x60;effective_at&#x60; (Unix seconds) is in this range. | [optional] 
 **project_ids** | list( **character** )| Return only events for these projects. | [optional] 
 **event_types** | list( [**AuditLogEventType**](AuditLogEventType.md) )| Return only events with a &#x60;type&#x60; in one of these values. For example, &#x60;project.created&#x60;. For all options, see the documentation for the [audit log object](/docs/api-reference/audit-logs/object). | [optional] 
 **actor_ids** | list( **character** )| Return only events performed by these actors. Can be a user ID, a service account ID, or an api key tracking ID. | [optional] 
 **actor_emails** | list( **character** )| Return only events performed by users with these emails. | [optional] 
 **resource_ids** | list( **character** )| Return only events performed on these targets. For example, a project ID updated. | [optional] 
 **limit** | **integer**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20]
 **after** | **character**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] 
 **before** | **character**| A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [optional] 

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

