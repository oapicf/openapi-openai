# RunStepDetailsToolCallsRetrievalObject


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | The ID of the tool call object. | 
**type** | **str** | The type of tool call. This is always going to be &#x60;retrieval&#x60; for this type of tool call. | 
**retrieval** | **object** | For now, this is always going to be an empty object. | 

## Example

```python
from openapiopenai.models.run_step_details_tool_calls_retrieval_object import RunStepDetailsToolCallsRetrievalObject

# TODO update the JSON string below
json = "{}"
# create an instance of RunStepDetailsToolCallsRetrievalObject from a JSON string
run_step_details_tool_calls_retrieval_object_instance = RunStepDetailsToolCallsRetrievalObject.from_json(json)
# print the JSON string representation of the object
print(RunStepDetailsToolCallsRetrievalObject.to_json())

# convert the object into a dict
run_step_details_tool_calls_retrieval_object_dict = run_step_details_tool_calls_retrieval_object_instance.to_dict()
# create an instance of RunStepDetailsToolCallsRetrievalObject from a dict
run_step_details_tool_calls_retrieval_object_from_dict = RunStepDetailsToolCallsRetrievalObject.from_dict(run_step_details_tool_calls_retrieval_object_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


