# AuditLogActorApiKey

The API Key used to perform the audit logged action.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | The tracking id of the API key. | [optional] 
**type** | **str** | The type of API key. Can be either &#x60;user&#x60; or &#x60;service_account&#x60;. | [optional] 
**user** | [**AuditLogActorUser**](AuditLogActorUser.md) |  | [optional] 
**service_account** | [**AuditLogActorServiceAccount**](AuditLogActorServiceAccount.md) |  | [optional] 

## Example

```python
from openapiopenai.models.audit_log_actor_api_key import AuditLogActorApiKey

# TODO update the JSON string below
json = "{}"
# create an instance of AuditLogActorApiKey from a JSON string
audit_log_actor_api_key_instance = AuditLogActorApiKey.from_json(json)
# print the JSON string representation of the object
print(AuditLogActorApiKey.to_json())

# convert the object into a dict
audit_log_actor_api_key_dict = audit_log_actor_api_key_instance.to_dict()
# create an instance of AuditLogActorApiKey from a dict
audit_log_actor_api_key_from_dict = AuditLogActorApiKey.from_dict(audit_log_actor_api_key_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


