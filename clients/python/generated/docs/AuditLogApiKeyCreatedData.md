# AuditLogApiKeyCreatedData

The payload used to create the API key.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scopes** | **List[str]** | A list of scopes allowed for the API key, e.g. &#x60;[\&quot;api.model.request\&quot;]&#x60; | [optional] 

## Example

```python
from openapiopenai.models.audit_log_api_key_created_data import AuditLogApiKeyCreatedData

# TODO update the JSON string below
json = "{}"
# create an instance of AuditLogApiKeyCreatedData from a JSON string
audit_log_api_key_created_data_instance = AuditLogApiKeyCreatedData.from_json(json)
# print the JSON string representation of the object
print(AuditLogApiKeyCreatedData.to_json())

# convert the object into a dict
audit_log_api_key_created_data_dict = audit_log_api_key_created_data_instance.to_dict()
# create an instance of AuditLogApiKeyCreatedData from a dict
audit_log_api_key_created_data_from_dict = AuditLogApiKeyCreatedData.from_dict(audit_log_api_key_created_data_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


