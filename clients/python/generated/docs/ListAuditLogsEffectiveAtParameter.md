# ListAuditLogsEffectiveAtParameter


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**gt** | **int** | Return only events whose &#x60;effective_at&#x60; (Unix seconds) is greater than this value. | [optional] 
**gte** | **int** | Return only events whose &#x60;effective_at&#x60; (Unix seconds) is greater than or equal to this value. | [optional] 
**lt** | **int** | Return only events whose &#x60;effective_at&#x60; (Unix seconds) is less than this value. | [optional] 
**lte** | **int** | Return only events whose &#x60;effective_at&#x60; (Unix seconds) is less than or equal to this value. | [optional] 

## Example

```python
from openapiopenai.models.list_audit_logs_effective_at_parameter import ListAuditLogsEffectiveAtParameter

# TODO update the JSON string below
json = "{}"
# create an instance of ListAuditLogsEffectiveAtParameter from a JSON string
list_audit_logs_effective_at_parameter_instance = ListAuditLogsEffectiveAtParameter.from_json(json)
# print the JSON string representation of the object
print(ListAuditLogsEffectiveAtParameter.to_json())

# convert the object into a dict
list_audit_logs_effective_at_parameter_dict = list_audit_logs_effective_at_parameter_instance.to_dict()
# create an instance of ListAuditLogsEffectiveAtParameter from a dict
list_audit_logs_effective_at_parameter_from_dict = ListAuditLogsEffectiveAtParameter.from_dict(list_audit_logs_effective_at_parameter_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


