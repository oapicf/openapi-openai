# AuditLogRateLimitDeleted

The details for events with this `type`.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | The rate limit ID | [optional] 

## Example

```python
from openapiopenai.models.audit_log_rate_limit_deleted import AuditLogRateLimitDeleted

# TODO update the JSON string below
json = "{}"
# create an instance of AuditLogRateLimitDeleted from a JSON string
audit_log_rate_limit_deleted_instance = AuditLogRateLimitDeleted.from_json(json)
# print the JSON string representation of the object
print(AuditLogRateLimitDeleted.to_json())

# convert the object into a dict
audit_log_rate_limit_deleted_dict = audit_log_rate_limit_deleted_instance.to_dict()
# create an instance of AuditLogRateLimitDeleted from a dict
audit_log_rate_limit_deleted_from_dict = AuditLogRateLimitDeleted.from_dict(audit_log_rate_limit_deleted_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


