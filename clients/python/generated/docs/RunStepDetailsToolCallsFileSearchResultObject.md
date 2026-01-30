# RunStepDetailsToolCallsFileSearchResultObject

A result instance of the file search.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**file_id** | **str** | The ID of the file that result was found in. | 
**file_name** | **str** | The name of the file that result was found in. | 
**score** | **float** | The score of the result. All values must be a floating point number between 0 and 1. | 
**content** | [**List[RunStepDetailsToolCallsFileSearchResultObjectContentInner]**](RunStepDetailsToolCallsFileSearchResultObjectContentInner.md) | The content of the result that was found. The content is only included if requested via the include query parameter. | [optional] 

## Example

```python
from openapiopenai.models.run_step_details_tool_calls_file_search_result_object import RunStepDetailsToolCallsFileSearchResultObject

# TODO update the JSON string below
json = "{}"
# create an instance of RunStepDetailsToolCallsFileSearchResultObject from a JSON string
run_step_details_tool_calls_file_search_result_object_instance = RunStepDetailsToolCallsFileSearchResultObject.from_json(json)
# print the JSON string representation of the object
print(RunStepDetailsToolCallsFileSearchResultObject.to_json())

# convert the object into a dict
run_step_details_tool_calls_file_search_result_object_dict = run_step_details_tool_calls_file_search_result_object_instance.to_dict()
# create an instance of RunStepDetailsToolCallsFileSearchResultObject from a dict
run_step_details_tool_calls_file_search_result_object_from_dict = RunStepDetailsToolCallsFileSearchResultObject.from_dict(run_step_details_tool_calls_file_search_result_object_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


