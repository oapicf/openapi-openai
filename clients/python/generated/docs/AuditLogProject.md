# AuditLogProject

The project that the action was scoped to. Absent for actions not scoped to projects.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | The project ID. | [optional] 
**name** | **str** | The project title. | [optional] 

## Example

```python
from openapiopenai.models.audit_log_project import AuditLogProject

# TODO update the JSON string below
json = "{}"
# create an instance of AuditLogProject from a JSON string
audit_log_project_instance = AuditLogProject.from_json(json)
# print the JSON string representation of the object
print(AuditLogProject.to_json())

# convert the object into a dict
audit_log_project_dict = audit_log_project_instance.to_dict()
# create an instance of AuditLogProject from a dict
audit_log_project_from_dict = AuditLogProject.from_dict(audit_log_project_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


