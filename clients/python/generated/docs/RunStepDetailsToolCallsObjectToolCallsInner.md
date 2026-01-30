# RunStepDetailsToolCallsObjectToolCallsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | The ID of the tool call object. | 
**type** | **str** | The type of tool call. This is always going to be &#x60;code_interpreter&#x60; for this type of tool call. | 
**code_interpreter** | [**RunStepDetailsToolCallsCodeObjectCodeInterpreter**](RunStepDetailsToolCallsCodeObjectCodeInterpreter.md) |  | 
**file_search** | [**RunStepDetailsToolCallsFileSearchObjectFileSearch**](RunStepDetailsToolCallsFileSearchObjectFileSearch.md) |  | 
**function** | [**RunStepDetailsToolCallsFunctionObjectFunction**](RunStepDetailsToolCallsFunctionObjectFunction.md) |  | 

## Example

```python
from openapiopenai.models.run_step_details_tool_calls_object_tool_calls_inner import RunStepDetailsToolCallsObjectToolCallsInner

# TODO update the JSON string below
json = "{}"
# create an instance of RunStepDetailsToolCallsObjectToolCallsInner from a JSON string
run_step_details_tool_calls_object_tool_calls_inner_instance = RunStepDetailsToolCallsObjectToolCallsInner.from_json(json)
# print the JSON string representation of the object
print(RunStepDetailsToolCallsObjectToolCallsInner.to_json())

# convert the object into a dict
run_step_details_tool_calls_object_tool_calls_inner_dict = run_step_details_tool_calls_object_tool_calls_inner_instance.to_dict()
# create an instance of RunStepDetailsToolCallsObjectToolCallsInner from a dict
run_step_details_tool_calls_object_tool_calls_inner_from_dict = RunStepDetailsToolCallsObjectToolCallsInner.from_dict(run_step_details_tool_calls_object_tool_calls_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


