# AuditLogApiKeyDeleted

The details for events with this `type`.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | The tracking ID of the API key. | [optional] 

## Example

```python
from openapiopenai.models.audit_log_api_key_deleted import AuditLogApiKeyDeleted

# TODO update the JSON string below
json = "{}"
# create an instance of AuditLogApiKeyDeleted from a JSON string
audit_log_api_key_deleted_instance = AuditLogApiKeyDeleted.from_json(json)
# print the JSON string representation of the object
print(AuditLogApiKeyDeleted.to_json())

# convert the object into a dict
audit_log_api_key_deleted_dict = audit_log_api_key_deleted_instance.to_dict()
# create an instance of AuditLogApiKeyDeleted from a dict
audit_log_api_key_deleted_from_dict = AuditLogApiKeyDeleted.from_dict(audit_log_api_key_deleted_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


