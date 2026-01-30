# AuditLogUserDeleted

The details for events with this `type`.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | The user ID. | [optional] 

## Example

```python
from openapiopenai.models.audit_log_user_deleted import AuditLogUserDeleted

# TODO update the JSON string below
json = "{}"
# create an instance of AuditLogUserDeleted from a JSON string
audit_log_user_deleted_instance = AuditLogUserDeleted.from_json(json)
# print the JSON string representation of the object
print(AuditLogUserDeleted.to_json())

# convert the object into a dict
audit_log_user_deleted_dict = audit_log_user_deleted_instance.to_dict()
# create an instance of AuditLogUserDeleted from a dict
audit_log_user_deleted_from_dict = AuditLogUserDeleted.from_dict(audit_log_user_deleted_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


