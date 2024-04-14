# RunStepDeltaStepDetailsToolCallsFunctionObject


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**index** | **int** | The index of the tool call in the tool calls array. | 
**id** | **str** | The ID of the tool call object. | [optional] 
**type** | **str** | The type of tool call. This is always going to be &#x60;function&#x60; for this type of tool call. | 
**function** | [**RunStepDeltaStepDetailsToolCallsFunctionObjectFunction**](RunStepDeltaStepDetailsToolCallsFunctionObjectFunction.md) |  | [optional] 

## Example

```python
from openapiopenai.models.run_step_delta_step_details_tool_calls_function_object import RunStepDeltaStepDetailsToolCallsFunctionObject

# TODO update the JSON string below
json = "{}"
# create an instance of RunStepDeltaStepDetailsToolCallsFunctionObject from a JSON string
run_step_delta_step_details_tool_calls_function_object_instance = RunStepDeltaStepDetailsToolCallsFunctionObject.from_json(json)
# print the JSON string representation of the object
print(RunStepDeltaStepDetailsToolCallsFunctionObject.to_json())

# convert the object into a dict
run_step_delta_step_details_tool_calls_function_object_dict = run_step_delta_step_details_tool_calls_function_object_instance.to_dict()
# create an instance of RunStepDeltaStepDetailsToolCallsFunctionObject from a dict
run_step_delta_step_details_tool_calls_function_object_form_dict = run_step_delta_step_details_tool_calls_function_object.from_dict(run_step_delta_step_details_tool_calls_function_object_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


