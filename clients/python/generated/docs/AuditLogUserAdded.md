# AuditLogUserAdded

The details for events with this `type`.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | The user ID. | [optional] 
**data** | [**AuditLogUserAddedData**](AuditLogUserAddedData.md) |  | [optional] 

## Example

```python
from openapiopenai.models.audit_log_user_added import AuditLogUserAdded

# TODO update the JSON string below
json = "{}"
# create an instance of AuditLogUserAdded from a JSON string
audit_log_user_added_instance = AuditLogUserAdded.from_json(json)
# print the JSON string representation of the object
print(AuditLogUserAdded.to_json())

# convert the object into a dict
audit_log_user_added_dict = audit_log_user_added_instance.to_dict()
# create an instance of AuditLogUserAdded from a dict
audit_log_user_added_from_dict = AuditLogUserAdded.from_dict(audit_log_user_added_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


