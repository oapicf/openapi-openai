# AuditLogOrganizationUpdatedChangesRequested

The payload used to update the organization settings.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**title** | **str** | The organization title. | [optional] 
**description** | **str** | The organization description. | [optional] 
**name** | **str** | The organization name. | [optional] 
**settings** | [**AuditLogOrganizationUpdatedChangesRequestedSettings**](AuditLogOrganizationUpdatedChangesRequestedSettings.md) |  | [optional] 

## Example

```python
from openapiopenai.models.audit_log_organization_updated_changes_requested import AuditLogOrganizationUpdatedChangesRequested

# TODO update the JSON string below
json = "{}"
# create an instance of AuditLogOrganizationUpdatedChangesRequested from a JSON string
audit_log_organization_updated_changes_requested_instance = AuditLogOrganizationUpdatedChangesRequested.from_json(json)
# print the JSON string representation of the object
print(AuditLogOrganizationUpdatedChangesRequested.to_json())

# convert the object into a dict
audit_log_organization_updated_changes_requested_dict = audit_log_organization_updated_changes_requested_instance.to_dict()
# create an instance of AuditLogOrganizationUpdatedChangesRequested from a dict
audit_log_organization_updated_changes_requested_from_dict = AuditLogOrganizationUpdatedChangesRequested.from_dict(audit_log_organization_updated_changes_requested_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


