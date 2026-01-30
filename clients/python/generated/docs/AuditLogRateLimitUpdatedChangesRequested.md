# AuditLogRateLimitUpdatedChangesRequested

The payload used to update the rate limits.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**max_requests_per_1_minute** | **int** | The maximum requests per minute. | [optional] 
**max_tokens_per_1_minute** | **int** | The maximum tokens per minute. | [optional] 
**max_images_per_1_minute** | **int** | The maximum images per minute. Only relevant for certain models. | [optional] 
**max_audio_megabytes_per_1_minute** | **int** | The maximum audio megabytes per minute. Only relevant for certain models. | [optional] 
**max_requests_per_1_day** | **int** | The maximum requests per day. Only relevant for certain models. | [optional] 
**batch_1_day_max_input_tokens** | **int** | The maximum batch input tokens per day. Only relevant for certain models. | [optional] 

## Example

```python
from openapiopenai.models.audit_log_rate_limit_updated_changes_requested import AuditLogRateLimitUpdatedChangesRequested

# TODO update the JSON string below
json = "{}"
# create an instance of AuditLogRateLimitUpdatedChangesRequested from a JSON string
audit_log_rate_limit_updated_changes_requested_instance = AuditLogRateLimitUpdatedChangesRequested.from_json(json)
# print the JSON string representation of the object
print(AuditLogRateLimitUpdatedChangesRequested.to_json())

# convert the object into a dict
audit_log_rate_limit_updated_changes_requested_dict = audit_log_rate_limit_updated_changes_requested_instance.to_dict()
# create an instance of AuditLogRateLimitUpdatedChangesRequested from a dict
audit_log_rate_limit_updated_changes_requested_from_dict = AuditLogRateLimitUpdatedChangesRequested.from_dict(audit_log_rate_limit_updated_changes_requested_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


