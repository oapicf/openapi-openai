# RunStepDetailsToolCallsCodeOutputLogsObject

Text output from the Code Interpreter tool call as part of a run step.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **str** | Always &#x60;logs&#x60;. | 
**logs** | **str** | The text output from the Code Interpreter tool call. | 

## Example

```python
from openapiopenai.models.run_step_details_tool_calls_code_output_logs_object import RunStepDetailsToolCallsCodeOutputLogsObject

# TODO update the JSON string below
json = "{}"
# create an instance of RunStepDetailsToolCallsCodeOutputLogsObject from a JSON string
run_step_details_tool_calls_code_output_logs_object_instance = RunStepDetailsToolCallsCodeOutputLogsObject.from_json(json)
# print the JSON string representation of the object
print(RunStepDetailsToolCallsCodeOutputLogsObject.to_json())

# convert the object into a dict
run_step_details_tool_calls_code_output_logs_object_dict = run_step_details_tool_calls_code_output_logs_object_instance.to_dict()
# create an instance of RunStepDetailsToolCallsCodeOutputLogsObject from a dict
run_step_details_tool_calls_code_output_logs_object_from_dict = RunStepDetailsToolCallsCodeOutputLogsObject.from_dict(run_step_details_tool_calls_code_output_logs_object_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


