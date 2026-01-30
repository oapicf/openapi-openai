# WWW::OpenAPIClient::AuditLogsApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::AuditLogsApi;
```

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**list_audit_logs**](AuditLogsApi.md#list_audit_logs) | **GET** /organization/audit_logs | List user actions and configuration changes within this organization.


# **list_audit_logs**
> ListAuditLogsResponse list_audit_logs(effective_at => $effective_at, project_ids[] => $project_ids[], event_types[] => $event_types[], actor_ids[] => $actor_ids[], actor_emails[] => $actor_emails[], resource_ids[] => $resource_ids[], limit => $limit, after => $after, before => $before)

List user actions and configuration changes within this organization.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::AuditLogsApi;
my $api_instance = WWW::OpenAPIClient::AuditLogsApi->new(

    # Configure bearer access token for authorization: ApiKeyAuth
    access_token => 'YOUR_BEARER_TOKEN',
    
);

my $effective_at = new WWW::OpenAPIClient.ListAuditLogsEffectiveAtParameter(); # ListAuditLogsEffectiveAtParameter | Return only events whose `effective_at` (Unix seconds) is in this range.
my $project_ids[] = [("null")]; # ARRAY[string] | Return only events for these projects.
my $event_types[] = [(new WWW::OpenAPIClient.AuditLogEventType())]; # ARRAY[AuditLogEventType] | Return only events with a `type` in one of these values. For example, `project.created`. For all options, see the documentation for the [audit log object](/docs/api-reference/audit-logs/object).
my $actor_ids[] = [("null")]; # ARRAY[string] | Return only events performed by these actors. Can be a user ID, a service account ID, or an api key tracking ID.
my $actor_emails[] = [("null")]; # ARRAY[string] | Return only events performed by users with these emails.
my $resource_ids[] = [("null")]; # ARRAY[string] | Return only events performed on these targets. For example, a project ID updated.
my $limit = 20; # int | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
my $after = "after_example"; # string | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
my $before = "before_example"; # string | A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. 

eval {
    my $result = $api_instance->list_audit_logs(effective_at => $effective_at, project_ids[] => $project_ids[], event_types[] => $event_types[], actor_ids[] => $actor_ids[], actor_emails[] => $actor_emails[], resource_ids[] => $resource_ids[], limit => $limit, after => $after, before => $before);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling AuditLogsApi->list_audit_logs: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **effective_at** | [**ListAuditLogsEffectiveAtParameter**](.md)| Return only events whose &#x60;effective_at&#x60; (Unix seconds) is in this range. | [optional] 
 **project_ids[]** | [**ARRAY[string]**](string.md)| Return only events for these projects. | [optional] 
 **event_types[]** | [**ARRAY[AuditLogEventType]**](AuditLogEventType.md)| Return only events with a &#x60;type&#x60; in one of these values. For example, &#x60;project.created&#x60;. For all options, see the documentation for the [audit log object](/docs/api-reference/audit-logs/object). | [optional] 
 **actor_ids[]** | [**ARRAY[string]**](string.md)| Return only events performed by these actors. Can be a user ID, a service account ID, or an api key tracking ID. | [optional] 
 **actor_emails[]** | [**ARRAY[string]**](string.md)| Return only events performed by users with these emails. | [optional] 
 **resource_ids[]** | [**ARRAY[string]**](string.md)| Return only events performed on these targets. For example, a project ID updated. | [optional] 
 **limit** | **int**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20]
 **after** | **string**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] 
 **before** | **string**| A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [optional] 

### Return type

[**ListAuditLogsResponse**](ListAuditLogsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

