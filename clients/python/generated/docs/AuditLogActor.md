# AuditLogActor

The actor who performed the audit logged action.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **str** | The type of actor. Is either &#x60;session&#x60; or &#x60;api_key&#x60;. | [optional] 
**session** | [**AuditLogActorSession**](.md) |  | [optional] 
**api_key** | [**AuditLogActorApiKey**](.md) |  | [optional] 

## Example

```python
from openapiopenai.models.audit_log_actor import AuditLogActor

# TODO update the JSON string below
json = "{}"
# create an instance of AuditLogActor from a JSON string
audit_log_actor_instance = AuditLogActor.from_json(json)
# print the JSON string representation of the object
print(AuditLogActor.to_json())

# convert the object into a dict
audit_log_actor_dict = audit_log_actor_instance.to_dict()
# create an instance of AuditLogActor from a dict
audit_log_actor_from_dict = AuditLogActor.from_dict(audit_log_actor_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


