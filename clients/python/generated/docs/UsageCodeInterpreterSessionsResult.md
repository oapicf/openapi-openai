# UsageCodeInterpreterSessionsResult

The aggregated code interpreter sessions usage details of the specific time bucket.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**object** | **str** |  | 
**sessions** | **int** | The number of code interpreter sessions. | 
**project_id** | **str** | When &#x60;group_by&#x3D;project_id&#x60;, this field provides the project ID of the grouped usage result. | [optional] 

## Example

```python
from openapiopenai.models.usage_code_interpreter_sessions_result import UsageCodeInterpreterSessionsResult

# TODO update the JSON string below
json = "{}"
# create an instance of UsageCodeInterpreterSessionsResult from a JSON string
usage_code_interpreter_sessions_result_instance = UsageCodeInterpreterSessionsResult.from_json(json)
# print the JSON string representation of the object
print(UsageCodeInterpreterSessionsResult.to_json())

# convert the object into a dict
usage_code_interpreter_sessions_result_dict = usage_code_interpreter_sessions_result_instance.to_dict()
# create an instance of UsageCodeInterpreterSessionsResult from a dict
usage_code_interpreter_sessions_result_from_dict = UsageCodeInterpreterSessionsResult.from_dict(usage_code_interpreter_sessions_result_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


