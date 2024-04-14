# RunStepDeltaStepDetailsToolCallsCodeObject

Details of the Code Interpreter tool call the run step was involved in.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**index** | **int** | The index of the tool call in the tool calls array. | 
**id** | **str** | The ID of the tool call. | [optional] 
**type** | **str** | The type of tool call. This is always going to be &#x60;code_interpreter&#x60; for this type of tool call. | 
**code_interpreter** | [**RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter**](RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter.md) |  | [optional] 

## Example

```python
from openapiopenai.models.run_step_delta_step_details_tool_calls_code_object import RunStepDeltaStepDetailsToolCallsCodeObject

# TODO update the JSON string below
json = "{}"
# create an instance of RunStepDeltaStepDetailsToolCallsCodeObject from a JSON string
run_step_delta_step_details_tool_calls_code_object_instance = RunStepDeltaStepDetailsToolCallsCodeObject.from_json(json)
# print the JSON string representation of the object
print(RunStepDeltaStepDetailsToolCallsCodeObject.to_json())

# convert the object into a dict
run_step_delta_step_details_tool_calls_code_object_dict = run_step_delta_step_details_tool_calls_code_object_instance.to_dict()
# create an instance of RunStepDeltaStepDetailsToolCallsCodeObject from a dict
run_step_delta_step_details_tool_calls_code_object_form_dict = run_step_delta_step_details_tool_calls_code_object.from_dict(run_step_delta_step_details_tool_calls_code_object_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


