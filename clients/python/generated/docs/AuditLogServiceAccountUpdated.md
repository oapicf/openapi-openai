# AuditLogServiceAccountUpdated

The details for events with this `type`.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | The service account ID. | [optional] 
**changes_requested** | [**AuditLogServiceAccountUpdatedChangesRequested**](AuditLogServiceAccountUpdatedChangesRequested.md) |  | [optional] 

## Example

```python
from openapiopenai.models.audit_log_service_account_updated import AuditLogServiceAccountUpdated

# TODO update the JSON string below
json = "{}"
# create an instance of AuditLogServiceAccountUpdated from a JSON string
audit_log_service_account_updated_instance = AuditLogServiceAccountUpdated.from_json(json)
# print the JSON string representation of the object
print(AuditLogServiceAccountUpdated.to_json())

# convert the object into a dict
audit_log_service_account_updated_dict = audit_log_service_account_updated_instance.to_dict()
# create an instance of AuditLogServiceAccountUpdated from a dict
audit_log_service_account_updated_from_dict = AuditLogServiceAccountUpdated.from_dict(audit_log_service_account_updated_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


