# RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**index** | **int** | The index of the output in the outputs array. | 
**type** | **str** | Always &#x60;logs&#x60;. | 
**logs** | **str** | The text output from the Code Interpreter tool call. | [optional] 
**image** | [**RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage**](RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage.md) |  | [optional] 

## Example

```python
from openapiopenai.models.run_step_delta_step_details_tool_calls_code_object_code_interpreter_outputs_inner import RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner

# TODO update the JSON string below
json = "{}"
# create an instance of RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner from a JSON string
run_step_delta_step_details_tool_calls_code_object_code_interpreter_outputs_inner_instance = RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner.from_json(json)
# print the JSON string representation of the object
print(RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner.to_json())

# convert the object into a dict
run_step_delta_step_details_tool_calls_code_object_code_interpreter_outputs_inner_dict = run_step_delta_step_details_tool_calls_code_object_code_interpreter_outputs_inner_instance.to_dict()
# create an instance of RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner from a dict
run_step_delta_step_details_tool_calls_code_object_code_interpreter_outputs_inner_form_dict = run_step_delta_step_details_tool_calls_code_object_code_interpreter_outputs_inner.from_dict(run_step_delta_step_details_tool_calls_code_object_code_interpreter_outputs_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


