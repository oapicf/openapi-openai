# AuditLogServiceAccountCreated

The details for events with this `type`.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | The service account ID. | [optional] 
**data** | [**AuditLogServiceAccountCreatedData**](AuditLogServiceAccountCreatedData.md) |  | [optional] 

## Example

```python
from openapiopenai.models.audit_log_service_account_created import AuditLogServiceAccountCreated

# TODO update the JSON string below
json = "{}"
# create an instance of AuditLogServiceAccountCreated from a JSON string
audit_log_service_account_created_instance = AuditLogServiceAccountCreated.from_json(json)
# print the JSON string representation of the object
print(AuditLogServiceAccountCreated.to_json())

# convert the object into a dict
audit_log_service_account_created_dict = audit_log_service_account_created_instance.to_dict()
# create an instance of AuditLogServiceAccountCreated from a dict
audit_log_service_account_created_from_dict = AuditLogServiceAccountCreated.from_dict(audit_log_service_account_created_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


