# AuditLogLoginFailed

The details for events with this `type`.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**error_code** | **str** | The error code of the failure. | [optional] 
**error_message** | **str** | The error message of the failure. | [optional] 

## Example

```python
from openapiopenai.models.audit_log_login_failed import AuditLogLoginFailed

# TODO update the JSON string below
json = "{}"
# create an instance of AuditLogLoginFailed from a JSON string
audit_log_login_failed_instance = AuditLogLoginFailed.from_json(json)
# print the JSON string representation of the object
print(AuditLogLoginFailed.to_json())

# convert the object into a dict
audit_log_login_failed_dict = audit_log_login_failed_instance.to_dict()
# create an instance of AuditLogLoginFailed from a dict
audit_log_login_failed_from_dict = AuditLogLoginFailed.from_dict(audit_log_login_failed_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


