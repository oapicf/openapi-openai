# AuditLogApiKeyCreated

The details for events with this `type`.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | The tracking ID of the API key. | [optional] 
**data** | [**AuditLogApiKeyCreatedData**](AuditLogApiKeyCreatedData.md) |  | [optional] 

## Example

```python
from openapiopenai.models.audit_log_api_key_created import AuditLogApiKeyCreated

# TODO update the JSON string below
json = "{}"
# create an instance of AuditLogApiKeyCreated from a JSON string
audit_log_api_key_created_instance = AuditLogApiKeyCreated.from_json(json)
# print the JSON string representation of the object
print(AuditLogApiKeyCreated.to_json())

# convert the object into a dict
audit_log_api_key_created_dict = audit_log_api_key_created_instance.to_dict()
# create an instance of AuditLogApiKeyCreated from a dict
audit_log_api_key_created_from_dict = AuditLogApiKeyCreated.from_dict(audit_log_api_key_created_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


