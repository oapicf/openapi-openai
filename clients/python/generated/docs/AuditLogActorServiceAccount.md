# AuditLogActorServiceAccount

The service account that performed the audit logged action.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | The service account id. | [optional] 

## Example

```python
from openapiopenai.models.audit_log_actor_service_account import AuditLogActorServiceAccount

# TODO update the JSON string below
json = "{}"
# create an instance of AuditLogActorServiceAccount from a JSON string
audit_log_actor_service_account_instance = AuditLogActorServiceAccount.from_json(json)
# print the JSON string representation of the object
print(AuditLogActorServiceAccount.to_json())

# convert the object into a dict
audit_log_actor_service_account_dict = audit_log_actor_service_account_instance.to_dict()
# create an instance of AuditLogActorServiceAccount from a dict
audit_log_actor_service_account_from_dict = AuditLogActorServiceAccount.from_dict(audit_log_actor_service_account_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


