# openapiopenai.AuditLogsApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**list_audit_logs**](AuditLogsApi.md#list_audit_logs) | **GET** /organization/audit_logs | List user actions and configuration changes within this organization.


# **list_audit_logs**
> ListAuditLogsResponse list_audit_logs(effective_at=effective_at, project_ids=project_ids, event_types=event_types, actor_ids=actor_ids, actor_emails=actor_emails, resource_ids=resource_ids, limit=limit, after=after, before=before)

List user actions and configuration changes within this organization.

### Example

* Bearer Authentication (ApiKeyAuth):

```python
import openapiopenai
from openapiopenai.models.audit_log_event_type import AuditLogEventType
from openapiopenai.models.list_audit_logs_effective_at_parameter import ListAuditLogsEffectiveAtParameter
from openapiopenai.models.list_audit_logs_response import ListAuditLogsResponse
from openapiopenai.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.openai.com/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = openapiopenai.Configuration(
    host = "https://api.openai.com/v1"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure Bearer authorization: ApiKeyAuth
configuration = openapiopenai.Configuration(
    access_token = os.environ["BEARER_TOKEN"]
)

# Enter a context with an instance of the API client
with openapiopenai.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapiopenai.AuditLogsApi(api_client)
    effective_at = openapiopenai.ListAuditLogsEffectiveAtParameter() # ListAuditLogsEffectiveAtParameter | Return only events whose `effective_at` (Unix seconds) is in this range. (optional)
    project_ids = ['project_ids_example'] # List[str] | Return only events for these projects. (optional)
    event_types = [openapiopenai.AuditLogEventType()] # List[AuditLogEventType] | Return only events with a `type` in one of these values. For example, `project.created`. For all options, see the documentation for the [audit log object](/docs/api-reference/audit-logs/object). (optional)
    actor_ids = ['actor_ids_example'] # List[str] | Return only events performed by these actors. Can be a user ID, a service account ID, or an api key tracking ID. (optional)
    actor_emails = ['actor_emails_example'] # List[str] | Return only events performed by users with these emails. (optional)
    resource_ids = ['resource_ids_example'] # List[str] | Return only events performed on these targets. For example, a project ID updated. (optional)
    limit = 20 # int | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional) (default to 20)
    after = 'after_example' # str | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (optional)
    before = 'before_example' # str | A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list.  (optional)

    try:
        # List user actions and configuration changes within this organization.
        api_response = api_instance.list_audit_logs(effective_at=effective_at, project_ids=project_ids, event_types=event_types, actor_ids=actor_ids, actor_emails=actor_emails, resource_ids=resource_ids, limit=limit, after=after, before=before)
        print("The response of AuditLogsApi->list_audit_logs:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AuditLogsApi->list_audit_logs: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **effective_at** | [**ListAuditLogsEffectiveAtParameter**](.md)| Return only events whose &#x60;effective_at&#x60; (Unix seconds) is in this range. | [optional] 
 **project_ids** | [**List[str]**](str.md)| Return only events for these projects. | [optional] 
 **event_types** | [**List[AuditLogEventType]**](AuditLogEventType.md)| Return only events with a &#x60;type&#x60; in one of these values. For example, &#x60;project.created&#x60;. For all options, see the documentation for the [audit log object](/docs/api-reference/audit-logs/object). | [optional] 
 **actor_ids** | [**List[str]**](str.md)| Return only events performed by these actors. Can be a user ID, a service account ID, or an api key tracking ID. | [optional] 
 **actor_emails** | [**List[str]**](str.md)| Return only events performed by users with these emails. | [optional] 
 **resource_ids** | [**List[str]**](str.md)| Return only events performed on these targets. For example, a project ID updated. | [optional] 
 **limit** | **int**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20]
 **after** | **str**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] 
 **before** | **str**| A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [optional] 

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
**200** | Audit logs listed successfully. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

