# RunStepDetailsToolCallsFunctionObject


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | The ID of the tool call object. | 
**type** | **str** | The type of tool call. This is always going to be &#x60;function&#x60; for this type of tool call. | 
**function** | [**RunStepDetailsToolCallsFunctionObjectFunction**](RunStepDetailsToolCallsFunctionObjectFunction.md) |  | 

## Example

```python
from openapiopenai.models.run_step_details_tool_calls_function_object import RunStepDetailsToolCallsFunctionObject

# TODO update the JSON string below
json = "{}"
# create an instance of RunStepDetailsToolCallsFunctionObject from a JSON string
run_step_details_tool_calls_function_object_instance = RunStepDetailsToolCallsFunctionObject.from_json(json)
# print the JSON string representation of the object
print(RunStepDetailsToolCallsFunctionObject.to_json())

# convert the object into a dict
run_step_details_tool_calls_function_object_dict = run_step_details_tool_calls_function_object_instance.to_dict()
# create an instance of RunStepDetailsToolCallsFunctionObject from a dict
run_step_details_tool_calls_function_object_form_dict = run_step_details_tool_calls_function_object.from_dict(run_step_details_tool_calls_function_object_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


