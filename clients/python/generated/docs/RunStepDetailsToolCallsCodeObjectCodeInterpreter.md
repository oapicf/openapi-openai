# RunStepDetailsToolCallsCodeObjectCodeInterpreter

The Code Interpreter tool call definition.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**input** | **str** | The input to the Code Interpreter tool call. | 
**outputs** | [**List[RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner]**](RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner.md) | The outputs from the Code Interpreter tool call. Code Interpreter can output one or more items, including text (&#x60;logs&#x60;) or images (&#x60;image&#x60;). Each of these are represented by a different object type. | 

## Example

```python
from openapiopenai.models.run_step_details_tool_calls_code_object_code_interpreter import RunStepDetailsToolCallsCodeObjectCodeInterpreter

# TODO update the JSON string below
json = "{}"
# create an instance of RunStepDetailsToolCallsCodeObjectCodeInterpreter from a JSON string
run_step_details_tool_calls_code_object_code_interpreter_instance = RunStepDetailsToolCallsCodeObjectCodeInterpreter.from_json(json)
# print the JSON string representation of the object
print(RunStepDetailsToolCallsCodeObjectCodeInterpreter.to_json())

# convert the object into a dict
run_step_details_tool_calls_code_object_code_interpreter_dict = run_step_details_tool_calls_code_object_code_interpreter_instance.to_dict()
# create an instance of RunStepDetailsToolCallsCodeObjectCodeInterpreter from a dict
run_step_details_tool_calls_code_object_code_interpreter_form_dict = run_step_details_tool_calls_code_object_code_interpreter.from_dict(run_step_details_tool_calls_code_object_code_interpreter_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


