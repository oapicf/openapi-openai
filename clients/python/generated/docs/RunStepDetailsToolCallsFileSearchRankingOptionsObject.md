# RunStepDetailsToolCallsFileSearchRankingOptionsObject

The ranking options for the file search.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ranker** | **str** | The ranker used for the file search. | 
**score_threshold** | **float** | The score threshold for the file search. All values must be a floating point number between 0 and 1. | 

## Example

```python
from openapiopenai.models.run_step_details_tool_calls_file_search_ranking_options_object import RunStepDetailsToolCallsFileSearchRankingOptionsObject

# TODO update the JSON string below
json = "{}"
# create an instance of RunStepDetailsToolCallsFileSearchRankingOptionsObject from a JSON string
run_step_details_tool_calls_file_search_ranking_options_object_instance = RunStepDetailsToolCallsFileSearchRankingOptionsObject.from_json(json)
# print the JSON string representation of the object
print(RunStepDetailsToolCallsFileSearchRankingOptionsObject.to_json())

# convert the object into a dict
run_step_details_tool_calls_file_search_ranking_options_object_dict = run_step_details_tool_calls_file_search_ranking_options_object_instance.to_dict()
# create an instance of RunStepDetailsToolCallsFileSearchRankingOptionsObject from a dict
run_step_details_tool_calls_file_search_ranking_options_object_from_dict = RunStepDetailsToolCallsFileSearchRankingOptionsObject.from_dict(run_step_details_tool_calls_file_search_ranking_options_object_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


