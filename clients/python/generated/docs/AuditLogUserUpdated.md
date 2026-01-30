# AuditLogUserUpdated

The details for events with this `type`.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | The project ID. | [optional] 
**changes_requested** | [**AuditLogUserUpdatedChangesRequested**](AuditLogUserUpdatedChangesRequested.md) |  | [optional] 

## Example

```python
from openapiopenai.models.audit_log_user_updated import AuditLogUserUpdated

# TODO update the JSON string below
json = "{}"
# create an instance of AuditLogUserUpdated from a JSON string
audit_log_user_updated_instance = AuditLogUserUpdated.from_json(json)
# print the JSON string representation of the object
print(AuditLogUserUpdated.to_json())

# convert the object into a dict
audit_log_user_updated_dict = audit_log_user_updated_instance.to_dict()
# create an instance of AuditLogUserUpdated from a dict
audit_log_user_updated_from_dict = AuditLogUserUpdated.from_dict(audit_log_user_updated_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


