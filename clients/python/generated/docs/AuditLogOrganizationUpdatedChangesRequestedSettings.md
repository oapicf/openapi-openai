# AuditLogOrganizationUpdatedChangesRequestedSettings


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**threads_ui_visibility** | **str** | Visibility of the threads page which shows messages created with the Assistants API and Playground. One of &#x60;ANY_ROLE&#x60;, &#x60;OWNERS&#x60;, or &#x60;NONE&#x60;. | [optional] 
**usage_dashboard_visibility** | **str** | Visibility of the usage dashboard which shows activity and costs for your organization. One of &#x60;ANY_ROLE&#x60; or &#x60;OWNERS&#x60;. | [optional] 

## Example

```python
from openapiopenai.models.audit_log_organization_updated_changes_requested_settings import AuditLogOrganizationUpdatedChangesRequestedSettings

# TODO update the JSON string below
json = "{}"
# create an instance of AuditLogOrganizationUpdatedChangesRequestedSettings from a JSON string
audit_log_organization_updated_changes_requested_settings_instance = AuditLogOrganizationUpdatedChangesRequestedSettings.from_json(json)
# print the JSON string representation of the object
print(AuditLogOrganizationUpdatedChangesRequestedSettings.to_json())

# convert the object into a dict
audit_log_organization_updated_changes_requested_settings_dict = audit_log_organization_updated_changes_requested_settings_instance.to_dict()
# create an instance of AuditLogOrganizationUpdatedChangesRequestedSettings from a dict
audit_log_organization_updated_changes_requested_settings_from_dict = AuditLogOrganizationUpdatedChangesRequestedSettings.from_dict(audit_log_organization_updated_changes_requested_settings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


