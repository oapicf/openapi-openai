# RunStepDeltaStepDetailsToolCallsObjectToolCallsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**index** | **int** | The index of the tool call in the tool calls array. | 
**id** | **str** | The ID of the tool call object. | [optional] 
**type** | **str** | The type of tool call. This is always going to be &#x60;code_interpreter&#x60; for this type of tool call. | 
**code_interpreter** | [**RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter**](RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter.md) |  | [optional] 
**retrieval** | **object** | For now, this is always going to be an empty object. | [optional] 
**function** | [**RunStepDeltaStepDetailsToolCallsFunctionObjectFunction**](RunStepDeltaStepDetailsToolCallsFunctionObjectFunction.md) |  | [optional] 

## Example

```python
from openapiopenai.models.run_step_delta_step_details_tool_calls_object_tool_calls_inner import RunStepDeltaStepDetailsToolCallsObjectToolCallsInner

# TODO update the JSON string below
json = "{}"
# create an instance of RunStepDeltaStepDetailsToolCallsObjectToolCallsInner from a JSON string
run_step_delta_step_details_tool_calls_object_tool_calls_inner_instance = RunStepDeltaStepDetailsToolCallsObjectToolCallsInner.from_json(json)
# print the JSON string representation of the object
print(RunStepDeltaStepDetailsToolCallsObjectToolCallsInner.to_json())

# convert the object into a dict
run_step_delta_step_details_tool_calls_object_tool_calls_inner_dict = run_step_delta_step_details_tool_calls_object_tool_calls_inner_instance.to_dict()
# create an instance of RunStepDeltaStepDetailsToolCallsObjectToolCallsInner from a dict
run_step_delta_step_details_tool_calls_object_tool_calls_inner_from_dict = RunStepDeltaStepDetailsToolCallsObjectToolCallsInner.from_dict(run_step_delta_step_details_tool_calls_object_tool_calls_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


