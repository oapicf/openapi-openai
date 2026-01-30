# RunStepDetailsToolCallsFileSearchObjectFileSearch

For now, this is always going to be an empty object.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ranking_options** | [**RunStepDetailsToolCallsFileSearchRankingOptionsObject**](RunStepDetailsToolCallsFileSearchRankingOptionsObject.md) |  | [optional] 
**results** | [**List[RunStepDetailsToolCallsFileSearchResultObject]**](RunStepDetailsToolCallsFileSearchResultObject.md) | The results of the file search. | [optional] 

## Example

```python
from openapiopenai.models.run_step_details_tool_calls_file_search_object_file_search import RunStepDetailsToolCallsFileSearchObjectFileSearch

# TODO update the JSON string below
json = "{}"
# create an instance of RunStepDetailsToolCallsFileSearchObjectFileSearch from a JSON string
run_step_details_tool_calls_file_search_object_file_search_instance = RunStepDetailsToolCallsFileSearchObjectFileSearch.from_json(json)
# print the JSON string representation of the object
print(RunStepDetailsToolCallsFileSearchObjectFileSearch.to_json())

# convert the object into a dict
run_step_details_tool_calls_file_search_object_file_search_dict = run_step_details_tool_calls_file_search_object_file_search_instance.to_dict()
# create an instance of RunStepDetailsToolCallsFileSearchObjectFileSearch from a dict
run_step_details_tool_calls_file_search_object_file_search_from_dict = RunStepDetailsToolCallsFileSearchObjectFileSearch.from_dict(run_step_details_tool_calls_file_search_object_file_search_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


