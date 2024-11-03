# RunStepDeltaStepDetailsToolCallsFunctionObjectFunction

The definition of the function that was called.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** | The name of the function. | [optional] 
**arguments** | **str** | The arguments passed to the function. | [optional] 
**output** | **str** | The output of the function. This will be &#x60;null&#x60; if the outputs have not been [submitted](/docs/api-reference/runs/submitToolOutputs) yet. | [optional] 

## Example

```python
from openapiopenai.models.run_step_delta_step_details_tool_calls_function_object_function import RunStepDeltaStepDetailsToolCallsFunctionObjectFunction

# TODO update the JSON string below
json = "{}"
# create an instance of RunStepDeltaStepDetailsToolCallsFunctionObjectFunction from a JSON string
run_step_delta_step_details_tool_calls_function_object_function_instance = RunStepDeltaStepDetailsToolCallsFunctionObjectFunction.from_json(json)
# print the JSON string representation of the object
print(RunStepDeltaStepDetailsToolCallsFunctionObjectFunction.to_json())

# convert the object into a dict
run_step_delta_step_details_tool_calls_function_object_function_dict = run_step_delta_step_details_tool_calls_function_object_function_instance.to_dict()
# create an instance of RunStepDeltaStepDetailsToolCallsFunctionObjectFunction from a dict
run_step_delta_step_details_tool_calls_function_object_function_from_dict = RunStepDeltaStepDetailsToolCallsFunctionObjectFunction.from_dict(run_step_delta_step_details_tool_calls_function_object_function_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


