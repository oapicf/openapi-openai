# RunStepDetailsToolCallsFileSearchObject


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | The ID of the tool call object. | 
**type** | **str** | The type of tool call. This is always going to be &#x60;file_search&#x60; for this type of tool call. | 
**file_search** | [**RunStepDetailsToolCallsFileSearchObjectFileSearch**](RunStepDetailsToolCallsFileSearchObjectFileSearch.md) |  | 

## Example

```python
from openapiopenai.models.run_step_details_tool_calls_file_search_object import RunStepDetailsToolCallsFileSearchObject

# TODO update the JSON string below
json = "{}"
# create an instance of RunStepDetailsToolCallsFileSearchObject from a JSON string
run_step_details_tool_calls_file_search_object_instance = RunStepDetailsToolCallsFileSearchObject.from_json(json)
# print the JSON string representation of the object
print(RunStepDetailsToolCallsFileSearchObject.to_json())

# convert the object into a dict
run_step_details_tool_calls_file_search_object_dict = run_step_details_tool_calls_file_search_object_instance.to_dict()
# create an instance of RunStepDetailsToolCallsFileSearchObject from a dict
run_step_details_tool_calls_file_search_object_from_dict = RunStepDetailsToolCallsFileSearchObject.from_dict(run_step_details_tool_calls_file_search_object_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


