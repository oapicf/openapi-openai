# AuditLogActorSession

The session in which the audit logged action was performed.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**user** | [**AuditLogActorUser**](AuditLogActorUser.md) |  | [optional] 
**ip_address** | **str** | The IP address from which the action was performed. | [optional] 

## Example

```python
from openapiopenai.models.audit_log_actor_session import AuditLogActorSession

# TODO update the JSON string below
json = "{}"
# create an instance of AuditLogActorSession from a JSON string
audit_log_actor_session_instance = AuditLogActorSession.from_json(json)
# print the JSON string representation of the object
print(AuditLogActorSession.to_json())

# convert the object into a dict
audit_log_actor_session_dict = audit_log_actor_session_instance.to_dict()
# create an instance of AuditLogActorSession from a dict
audit_log_actor_session_from_dict = AuditLogActorSession.from_dict(audit_log_actor_session_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


