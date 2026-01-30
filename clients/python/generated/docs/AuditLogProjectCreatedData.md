# AuditLogProjectCreatedData

The payload used to create the project.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** | The project name. | [optional] 
**title** | **str** | The title of the project as seen on the dashboard. | [optional] 

## Example

```python
from openapiopenai.models.audit_log_project_created_data import AuditLogProjectCreatedData

# TODO update the JSON string below
json = "{}"
# create an instance of AuditLogProjectCreatedData from a JSON string
audit_log_project_created_data_instance = AuditLogProjectCreatedData.from_json(json)
# print the JSON string representation of the object
print(AuditLogProjectCreatedData.to_json())

# convert the object into a dict
audit_log_project_created_data_dict = audit_log_project_created_data_instance.to_dict()
# create an instance of AuditLogProjectCreatedData from a dict
audit_log_project_created_data_from_dict = AuditLogProjectCreatedData.from_dict(audit_log_project_created_data_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


