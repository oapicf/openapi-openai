# AuditLogServiceAccountUpdatedChangesRequested

The payload used to updated the service account.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**role** | **str** | The role of the service account. Is either &#x60;owner&#x60; or &#x60;member&#x60;. | [optional] 

## Example

```python
from openapiopenai.models.audit_log_service_account_updated_changes_requested import AuditLogServiceAccountUpdatedChangesRequested

# TODO update the JSON string below
json = "{}"
# create an instance of AuditLogServiceAccountUpdatedChangesRequested from a JSON string
audit_log_service_account_updated_changes_requested_instance = AuditLogServiceAccountUpdatedChangesRequested.from_json(json)
# print the JSON string representation of the object
print(AuditLogServiceAccountUpdatedChangesRequested.to_json())

# convert the object into a dict
audit_log_service_account_updated_changes_requested_dict = audit_log_service_account_updated_changes_requested_instance.to_dict()
# create an instance of AuditLogServiceAccountUpdatedChangesRequested from a dict
audit_log_service_account_updated_changes_requested_from_dict = AuditLogServiceAccountUpdatedChangesRequested.from_dict(audit_log_service_account_updated_changes_requested_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


