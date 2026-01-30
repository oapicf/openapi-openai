# AuditLogApiKeyUpdated

The details for events with this `type`.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | The tracking ID of the API key. | [optional] 
**changes_requested** | [**AuditLogApiKeyUpdatedChangesRequested**](AuditLogApiKeyUpdatedChangesRequested.md) |  | [optional] 

## Example

```python
from openapiopenai.models.audit_log_api_key_updated import AuditLogApiKeyUpdated

# TODO update the JSON string below
json = "{}"
# create an instance of AuditLogApiKeyUpdated from a JSON string
audit_log_api_key_updated_instance = AuditLogApiKeyUpdated.from_json(json)
# print the JSON string representation of the object
print(AuditLogApiKeyUpdated.to_json())

# convert the object into a dict
audit_log_api_key_updated_dict = audit_log_api_key_updated_instance.to_dict()
# create an instance of AuditLogApiKeyUpdated from a dict
audit_log_api_key_updated_from_dict = AuditLogApiKeyUpdated.from_dict(audit_log_api_key_updated_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


