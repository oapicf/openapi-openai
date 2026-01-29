# RunStepDeltaStepDetailsToolCallsObject

Details of the tool call.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **str** | Always &#x60;tool_calls&#x60;. | 
**tool_calls** | [**List[RunStepDeltaStepDetailsToolCallsObjectToolCallsInner]**](RunStepDeltaStepDetailsToolCallsObjectToolCallsInner.md) | An array of tool calls the run step was involved in. These can be associated with one of three types of tools: &#x60;code_interpreter&#x60;, &#x60;retrieval&#x60;, or &#x60;function&#x60;.  | [optional] 

## Example

```python
from openapiopenai.models.run_step_delta_step_details_tool_calls_object import RunStepDeltaStepDetailsToolCallsObject

# TODO update the JSON string below
json = "{}"
# create an instance of RunStepDeltaStepDetailsToolCallsObject from a JSON string
run_step_delta_step_details_tool_calls_object_instance = RunStepDeltaStepDetailsToolCallsObject.from_json(json)
# print the JSON string representation of the object
print(RunStepDeltaStepDetailsToolCallsObject.to_json())

# convert the object into a dict
run_step_delta_step_details_tool_calls_object_dict = run_step_delta_step_details_tool_calls_object_instance.to_dict()
# create an instance of RunStepDeltaStepDetailsToolCallsObject from a dict
run_step_delta_step_details_tool_calls_object_from_dict = RunStepDeltaStepDetailsToolCallsObject.from_dict(run_step_delta_step_details_tool_calls_object_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


