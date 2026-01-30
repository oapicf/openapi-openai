# AuditLogApiKeyUpdatedChangesRequested

The payload used to update the API key.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scopes** | **List[str]** | A list of scopes allowed for the API key, e.g. &#x60;[\&quot;api.model.request\&quot;]&#x60; | [optional] 

## Example

```python
from openapiopenai.models.audit_log_api_key_updated_changes_requested import AuditLogApiKeyUpdatedChangesRequested

# TODO update the JSON string below
json = "{}"
# create an instance of AuditLogApiKeyUpdatedChangesRequested from a JSON string
audit_log_api_key_updated_changes_requested_instance = AuditLogApiKeyUpdatedChangesRequested.from_json(json)
# print the JSON string representation of the object
print(AuditLogApiKeyUpdatedChangesRequested.to_json())

# convert the object into a dict
audit_log_api_key_updated_changes_requested_dict = audit_log_api_key_updated_changes_requested_instance.to_dict()
# create an instance of AuditLogApiKeyUpdatedChangesRequested from a dict
audit_log_api_key_updated_changes_requested_from_dict = AuditLogApiKeyUpdatedChangesRequested.from_dict(audit_log_api_key_updated_changes_requested_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


