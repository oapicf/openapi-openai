# RunStepDeltaStepDetailsToolCallsFileSearchObject


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**index** | **int** | The index of the tool call in the tool calls array. | 
**id** | **str** | The ID of the tool call object. | [optional] 
**type** | **str** | The type of tool call. This is always going to be &#x60;file_search&#x60; for this type of tool call. | 
**file_search** | **object** | For now, this is always going to be an empty object. | 

## Example

```python
from openapiopenai.models.run_step_delta_step_details_tool_calls_file_search_object import RunStepDeltaStepDetailsToolCallsFileSearchObject

# TODO update the JSON string below
json = "{}"
# create an instance of RunStepDeltaStepDetailsToolCallsFileSearchObject from a JSON string
run_step_delta_step_details_tool_calls_file_search_object_instance = RunStepDeltaStepDetailsToolCallsFileSearchObject.from_json(json)
# print the JSON string representation of the object
print(RunStepDeltaStepDetailsToolCallsFileSearchObject.to_json())

# convert the object into a dict
run_step_delta_step_details_tool_calls_file_search_object_dict = run_step_delta_step_details_tool_calls_file_search_object_instance.to_dict()
# create an instance of RunStepDeltaStepDetailsToolCallsFileSearchObject from a dict
run_step_delta_step_details_tool_calls_file_search_object_from_dict = RunStepDeltaStepDetailsToolCallsFileSearchObject.from_dict(run_step_delta_step_details_tool_calls_file_search_object_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


