# RunCompletionUsage

Usage statistics related to the run. This value will be `null` if the run is not in a terminal state (i.e. `in_progress`, `queued`, etc.).

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**completion_tokens** | **int** | Number of completion tokens used over the course of the run. | 
**prompt_tokens** | **int** | Number of prompt tokens used over the course of the run. | 
**total_tokens** | **int** | Total number of tokens used (prompt + completion). | 

## Example

```python
from openapiopenai.models.run_completion_usage import RunCompletionUsage

# TODO update the JSON string below
json = "{}"
# create an instance of RunCompletionUsage from a JSON string
run_completion_usage_instance = RunCompletionUsage.from_json(json)
# print the JSON string representation of the object
print(RunCompletionUsage.to_json())

# convert the object into a dict
run_completion_usage_dict = run_completion_usage_instance.to_dict()
# create an instance of RunCompletionUsage from a dict
run_completion_usage_from_dict = RunCompletionUsage.from_dict(run_completion_usage_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


