# RunStepObjectStepDetails

The details of the run step.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **str** | Always &#x60;message_creation&#x60;. | 
**message_creation** | [**RunStepDetailsMessageCreationObjectMessageCreation**](RunStepDetailsMessageCreationObjectMessageCreation.md) |  | 
**tool_calls** | [**List[RunStepDetailsToolCallsObjectToolCallsInner]**](RunStepDetailsToolCallsObjectToolCallsInner.md) | An array of tool calls the run step was involved in. These can be associated with one of three types of tools: &#x60;code_interpreter&#x60;, &#x60;retrieval&#x60;, or &#x60;function&#x60;.  | 

## Example

```python
from openapiopenai.models.run_step_object_step_details import RunStepObjectStepDetails

# TODO update the JSON string below
json = "{}"
# create an instance of RunStepObjectStepDetails from a JSON string
run_step_object_step_details_instance = RunStepObjectStepDetails.from_json(json)
# print the JSON string representation of the object
print(RunStepObjectStepDetails.to_json())

# convert the object into a dict
run_step_object_step_details_dict = run_step_object_step_details_instance.to_dict()
# create an instance of RunStepObjectStepDetails from a dict
run_step_object_step_details_from_dict = RunStepObjectStepDetails.from_dict(run_step_object_step_details_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


