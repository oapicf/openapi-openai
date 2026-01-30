# AuditLogServiceAccountDeleted

The details for events with this `type`.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | The service account ID. | [optional] 

## Example

```python
from openapiopenai.models.audit_log_service_account_deleted import AuditLogServiceAccountDeleted

# TODO update the JSON string below
json = "{}"
# create an instance of AuditLogServiceAccountDeleted from a JSON string
audit_log_service_account_deleted_instance = AuditLogServiceAccountDeleted.from_json(json)
# print the JSON string representation of the object
print(AuditLogServiceAccountDeleted.to_json())

# convert the object into a dict
audit_log_service_account_deleted_dict = audit_log_service_account_deleted_instance.to_dict()
# create an instance of AuditLogServiceAccountDeleted from a dict
audit_log_service_account_deleted_from_dict = AuditLogServiceAccountDeleted.from_dict(audit_log_service_account_deleted_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


