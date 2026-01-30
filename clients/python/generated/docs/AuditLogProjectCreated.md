# AuditLogProjectCreated

The details for events with this `type`.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | The project ID. | [optional] 
**data** | [**AuditLogProjectCreatedData**](AuditLogProjectCreatedData.md) |  | [optional] 

## Example

```python
from openapiopenai.models.audit_log_project_created import AuditLogProjectCreated

# TODO update the JSON string below
json = "{}"
# create an instance of AuditLogProjectCreated from a JSON string
audit_log_project_created_instance = AuditLogProjectCreated.from_json(json)
# print the JSON string representation of the object
print(AuditLogProjectCreated.to_json())

# convert the object into a dict
audit_log_project_created_dict = audit_log_project_created_instance.to_dict()
# create an instance of AuditLogProjectCreated from a dict
audit_log_project_created_from_dict = AuditLogProjectCreated.from_dict(audit_log_project_created_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


