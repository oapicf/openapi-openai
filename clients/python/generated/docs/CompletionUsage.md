# CompletionUsage

Usage statistics for the completion request.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**completion_tokens** | **int** | Number of tokens in the generated completion. | 
**prompt_tokens** | **int** | Number of tokens in the prompt. | 
**total_tokens** | **int** | Total number of tokens used in the request (prompt + completion). | 

## Example

```python
from openapiopenai.models.completion_usage import CompletionUsage

# TODO update the JSON string below
json = "{}"
# create an instance of CompletionUsage from a JSON string
completion_usage_instance = CompletionUsage.from_json(json)
# print the JSON string representation of the object
print(CompletionUsage.to_json())

# convert the object into a dict
completion_usage_dict = completion_usage_instance.to_dict()
# create an instance of CompletionUsage from a dict
completion_usage_form_dict = completion_usage.from_dict(completion_usage_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


