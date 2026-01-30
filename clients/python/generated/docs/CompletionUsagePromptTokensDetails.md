# CompletionUsagePromptTokensDetails

Breakdown of tokens used in the prompt.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**audio_tokens** | **int** | Audio input tokens present in the prompt. | [optional] 
**cached_tokens** | **int** | Cached tokens present in the prompt. | [optional] 

## Example

```python
from openapiopenai.models.completion_usage_prompt_tokens_details import CompletionUsagePromptTokensDetails

# TODO update the JSON string below
json = "{}"
# create an instance of CompletionUsagePromptTokensDetails from a JSON string
completion_usage_prompt_tokens_details_instance = CompletionUsagePromptTokensDetails.from_json(json)
# print the JSON string representation of the object
print(CompletionUsagePromptTokensDetails.to_json())

# convert the object into a dict
completion_usage_prompt_tokens_details_dict = completion_usage_prompt_tokens_details_instance.to_dict()
# create an instance of CompletionUsagePromptTokensDetails from a dict
completion_usage_prompt_tokens_details_from_dict = CompletionUsagePromptTokensDetails.from_dict(completion_usage_prompt_tokens_details_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


