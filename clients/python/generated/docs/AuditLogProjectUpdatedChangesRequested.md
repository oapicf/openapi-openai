# AuditLogProjectUpdatedChangesRequested

The payload used to update the project.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**title** | **str** | The title of the project as seen on the dashboard. | [optional] 

## Example

```python
from openapiopenai.models.audit_log_project_updated_changes_requested import AuditLogProjectUpdatedChangesRequested

# TODO update the JSON string below
json = "{}"
# create an instance of AuditLogProjectUpdatedChangesRequested from a JSON string
audit_log_project_updated_changes_requested_instance = AuditLogProjectUpdatedChangesRequested.from_json(json)
# print the JSON string representation of the object
print(AuditLogProjectUpdatedChangesRequested.to_json())

# convert the object into a dict
audit_log_project_updated_changes_requested_dict = audit_log_project_updated_changes_requested_instance.to_dict()
# create an instance of AuditLogProjectUpdatedChangesRequested from a dict
audit_log_project_updated_changes_requested_from_dict = AuditLogProjectUpdatedChangesRequested.from_dict(audit_log_project_updated_changes_requested_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


