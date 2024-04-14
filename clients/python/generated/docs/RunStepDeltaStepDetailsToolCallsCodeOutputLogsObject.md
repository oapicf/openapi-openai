# RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject

Text output from the Code Interpreter tool call as part of a run step.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**index** | **int** | The index of the output in the outputs array. | 
**type** | **str** | Always &#x60;logs&#x60;. | 
**logs** | **str** | The text output from the Code Interpreter tool call. | [optional] 

## Example

```python
from openapiopenai.models.run_step_delta_step_details_tool_calls_code_output_logs_object import RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject

# TODO update the JSON string below
json = "{}"
# create an instance of RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject from a JSON string
run_step_delta_step_details_tool_calls_code_output_logs_object_instance = RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject.from_json(json)
# print the JSON string representation of the object
print(RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject.to_json())

# convert the object into a dict
run_step_delta_step_details_tool_calls_code_output_logs_object_dict = run_step_delta_step_details_tool_calls_code_output_logs_object_instance.to_dict()
# create an instance of RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject from a dict
run_step_delta_step_details_tool_calls_code_output_logs_object_form_dict = run_step_delta_step_details_tool_calls_code_output_logs_object.from_dict(run_step_delta_step_details_tool_calls_code_output_logs_object_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


