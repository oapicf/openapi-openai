# RunStepDetailsToolCallsFunctionObjectFunction

The definition of the function that was called.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** | The name of the function. | 
**arguments** | **str** | The arguments passed to the function. | 
**output** | **str** | The output of the function. This will be &#x60;null&#x60; if the outputs have not been [submitted](/docs/api-reference/runs/submitToolOutputs) yet. | 

## Example

```python
from openapiopenai.models.run_step_details_tool_calls_function_object_function import RunStepDetailsToolCallsFunctionObjectFunction

# TODO update the JSON string below
json = "{}"
# create an instance of RunStepDetailsToolCallsFunctionObjectFunction from a JSON string
run_step_details_tool_calls_function_object_function_instance = RunStepDetailsToolCallsFunctionObjectFunction.from_json(json)
# print the JSON string representation of the object
print(RunStepDetailsToolCallsFunctionObjectFunction.to_json())

# convert the object into a dict
run_step_details_tool_calls_function_object_function_dict = run_step_details_tool_calls_function_object_function_instance.to_dict()
# create an instance of RunStepDetailsToolCallsFunctionObjectFunction from a dict
run_step_details_tool_calls_function_object_function_from_dict = RunStepDetailsToolCallsFunctionObjectFunction.from_dict(run_step_details_tool_calls_function_object_function_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


