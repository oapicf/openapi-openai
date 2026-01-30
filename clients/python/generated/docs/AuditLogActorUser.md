# AuditLogActorUser

The user who performed the audit logged action.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | The user id. | [optional] 
**email** | **str** | The user email. | [optional] 

## Example

```python
from openapiopenai.models.audit_log_actor_user import AuditLogActorUser

# TODO update the JSON string below
json = "{}"
# create an instance of AuditLogActorUser from a JSON string
audit_log_actor_user_instance = AuditLogActorUser.from_json(json)
# print the JSON string representation of the object
print(AuditLogActorUser.to_json())

# convert the object into a dict
audit_log_actor_user_dict = audit_log_actor_user_instance.to_dict()
# create an instance of AuditLogActorUser from a dict
audit_log_actor_user_from_dict = AuditLogActorUser.from_dict(audit_log_actor_user_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


