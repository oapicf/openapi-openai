# AuditLogRateLimitUpdated

The details for events with this `type`.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | The rate limit ID | [optional] 
**changes_requested** | [**AuditLogRateLimitUpdatedChangesRequested**](AuditLogRateLimitUpdatedChangesRequested.md) |  | [optional] 

## Example

```python
from openapiopenai.models.audit_log_rate_limit_updated import AuditLogRateLimitUpdated

# TODO update the JSON string below
json = "{}"
# create an instance of AuditLogRateLimitUpdated from a JSON string
audit_log_rate_limit_updated_instance = AuditLogRateLimitUpdated.from_json(json)
# print the JSON string representation of the object
print(AuditLogRateLimitUpdated.to_json())

# convert the object into a dict
audit_log_rate_limit_updated_dict = audit_log_rate_limit_updated_instance.to_dict()
# create an instance of AuditLogRateLimitUpdated from a dict
audit_log_rate_limit_updated_from_dict = AuditLogRateLimitUpdated.from_dict(audit_log_rate_limit_updated_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


