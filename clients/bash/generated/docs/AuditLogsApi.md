# AuditLogsApi

All URIs are relative to */v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listAuditLogs**](AuditLogsApi.md#listAuditLogs) | **GET** /organization/audit_logs | List user actions and configuration changes within this organization.



## listAuditLogs

List user actions and configuration changes within this organization.

### Example

```bash
 listAuditLogs  effective_at=value  Specify as:  project_ids[]=value1 project_ids[]=value2 project_ids[]=...  Specify as:  event_types[]=value1 event_types[]=value2 event_types[]=...  Specify as:  actor_ids[]=value1 actor_ids[]=value2 actor_ids[]=...  Specify as:  actor_emails[]=value1 actor_emails[]=value2 actor_emails[]=...  Specify as:  resource_ids[]=value1 resource_ids[]=value2 resource_ids[]=...  limit=value  after=value  before=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **effectiveAt** | [**ListAuditLogsEffectiveAtParameter**](.md) | Return only events whose 'effective_at' (Unix seconds) is in this range. | [optional] [default to null]
 **projectIdsLeft_Square_BracketRight_Square_Bracket** | [**array[string]**](string.md) | Return only events for these projects. | [optional] [default to null]
 **eventTypesLeft_Square_BracketRight_Square_Bracket** | [**array[AuditLogEventType]**](AuditLogEventType.md) | Return only events with a 'type' in one of these values. For example, 'project.created'. For all options, see the documentation for the [audit log object](/docs/api-reference/audit-logs/object). | [optional] [default to null]
 **actorIdsLeft_Square_BracketRight_Square_Bracket** | [**array[string]**](string.md) | Return only events performed by these actors. Can be a user ID, a service account ID, or an api key tracking ID. | [optional] [default to null]
 **actorEmailsLeft_Square_BracketRight_Square_Bracket** | [**array[string]**](string.md) | Return only events performed by users with these emails. | [optional] [default to null]
 **resourceIdsLeft_Square_BracketRight_Square_Bracket** | [**array[string]**](string.md) | Return only events performed on these targets. For example, a project ID updated. | [optional] [default to null]
 **limit** | **integer** | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. | [optional] [default to 20]
 **after** | **string** | A cursor for use in pagination. 'after' is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. | [optional] [default to null]
 **before** | **string** | A cursor for use in pagination. 'before' is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. | [optional] [default to null]

### Return type

[**ListAuditLogsResponse**](ListAuditLogsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

