# RunStepCompletionUsage

Usage statistics related to the run step. This value will be `null` while the run step's status is `in_progress`.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**completion_tokens** | **int** | Number of completion tokens used over the course of the run step. | 
**prompt_tokens** | **int** | Number of prompt tokens used over the course of the run step. | 
**total_tokens** | **int** | Total number of tokens used (prompt + completion). | 

## Example

```python
from openapiopenai.models.run_step_completion_usage import RunStepCompletionUsage

# TODO update the JSON string below
json = "{}"
# create an instance of RunStepCompletionUsage from a JSON string
run_step_completion_usage_instance = RunStepCompletionUsage.from_json(json)
# print the JSON string representation of the object
print(RunStepCompletionUsage.to_json())

# convert the object into a dict
run_step_completion_usage_dict = run_step_completion_usage_instance.to_dict()
# create an instance of RunStepCompletionUsage from a dict
run_step_completion_usage_form_dict = run_step_completion_usage.from_dict(run_step_completion_usage_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


