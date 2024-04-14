# RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **str** | Always &#x60;logs&#x60;. | 
**logs** | **str** | The text output from the Code Interpreter tool call. | 
**image** | [**RunStepDetailsToolCallsCodeOutputImageObjectImage**](RunStepDetailsToolCallsCodeOutputImageObjectImage.md) |  | 

## Example

```python
from openapiopenai.models.run_step_details_tool_calls_code_object_code_interpreter_outputs_inner import RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner

# TODO update the JSON string below
json = "{}"
# create an instance of RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner from a JSON string
run_step_details_tool_calls_code_object_code_interpreter_outputs_inner_instance = RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner.from_json(json)
# print the JSON string representation of the object
print(RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner.to_json())

# convert the object into a dict
run_step_details_tool_calls_code_object_code_interpreter_outputs_inner_dict = run_step_details_tool_calls_code_object_code_interpreter_outputs_inner_instance.to_dict()
# create an instance of RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner from a dict
run_step_details_tool_calls_code_object_code_interpreter_outputs_inner_form_dict = run_step_details_tool_calls_code_object_code_interpreter_outputs_inner.from_dict(run_step_details_tool_calls_code_object_code_interpreter_outputs_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


