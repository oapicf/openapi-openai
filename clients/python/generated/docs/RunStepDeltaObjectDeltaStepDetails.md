# RunStepDeltaObjectDeltaStepDetails

The details of the run step.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **str** | Always &#x60;message_creation&#x60;. | 
**message_creation** | [**RunStepDeltaStepDetailsMessageCreationObjectMessageCreation**](RunStepDeltaStepDetailsMessageCreationObjectMessageCreation.md) |  | [optional] 
**tool_calls** | [**List[RunStepDeltaStepDetailsToolCallsObjectToolCallsInner]**](RunStepDeltaStepDetailsToolCallsObjectToolCallsInner.md) | An array of tool calls the run step was involved in. These can be associated with one of three types of tools: &#x60;code_interpreter&#x60;, &#x60;file_search&#x60;, or &#x60;function&#x60;.  | [optional] 

## Example

```python
from openapiopenai.models.run_step_delta_object_delta_step_details import RunStepDeltaObjectDeltaStepDetails

# TODO update the JSON string below
json = "{}"
# create an instance of RunStepDeltaObjectDeltaStepDetails from a JSON string
run_step_delta_object_delta_step_details_instance = RunStepDeltaObjectDeltaStepDetails.from_json(json)
# print the JSON string representation of the object
print(RunStepDeltaObjectDeltaStepDetails.to_json())

# convert the object into a dict
run_step_delta_object_delta_step_details_dict = run_step_delta_object_delta_step_details_instance.to_dict()
# create an instance of RunStepDeltaObjectDeltaStepDetails from a dict
run_step_delta_object_delta_step_details_from_dict = RunStepDeltaObjectDeltaStepDetails.from_dict(run_step_delta_object_delta_step_details_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


