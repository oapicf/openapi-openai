# AuditLogServiceAccountCreatedData

The payload used to create the service account.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**role** | **str** | The role of the service account. Is either &#x60;owner&#x60; or &#x60;member&#x60;. | [optional] 

## Example

```python
from openapiopenai.models.audit_log_service_account_created_data import AuditLogServiceAccountCreatedData

# TODO update the JSON string below
json = "{}"
# create an instance of AuditLogServiceAccountCreatedData from a JSON string
audit_log_service_account_created_data_instance = AuditLogServiceAccountCreatedData.from_json(json)
# print the JSON string representation of the object
print(AuditLogServiceAccountCreatedData.to_json())

# convert the object into a dict
audit_log_service_account_created_data_dict = audit_log_service_account_created_data_instance.to_dict()
# create an instance of AuditLogServiceAccountCreatedData from a dict
audit_log_service_account_created_data_from_dict = AuditLogServiceAccountCreatedData.from_dict(audit_log_service_account_created_data_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


