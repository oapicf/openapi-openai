# AuditLogUserUpdatedChangesRequested

The payload used to update the user.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**role** | **str** | The role of the user. Is either &#x60;owner&#x60; or &#x60;member&#x60;. | [optional] 

## Example

```python
from openapiopenai.models.audit_log_user_updated_changes_requested import AuditLogUserUpdatedChangesRequested

# TODO update the JSON string below
json = "{}"
# create an instance of AuditLogUserUpdatedChangesRequested from a JSON string
audit_log_user_updated_changes_requested_instance = AuditLogUserUpdatedChangesRequested.from_json(json)
# print the JSON string representation of the object
print(AuditLogUserUpdatedChangesRequested.to_json())

# convert the object into a dict
audit_log_user_updated_changes_requested_dict = audit_log_user_updated_changes_requested_instance.to_dict()
# create an instance of AuditLogUserUpdatedChangesRequested from a dict
audit_log_user_updated_changes_requested_from_dict = AuditLogUserUpdatedChangesRequested.from_dict(audit_log_user_updated_changes_requested_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


