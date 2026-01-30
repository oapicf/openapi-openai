# UsageCompletionsResult

The aggregated completions usage details of the specific time bucket.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**object** | **str** |  | 
**input_tokens** | **int** | The aggregated number of text input tokens used, including cached tokens. For customers subscribe to scale tier, this includes scale tier tokens. | 
**input_cached_tokens** | **int** | The aggregated number of text input tokens that has been cached from previous requests. For customers subscribe to scale tier, this includes scale tier tokens. | [optional] 
**output_tokens** | **int** | The aggregated number of text output tokens used. For customers subscribe to scale tier, this includes scale tier tokens. | 
**input_audio_tokens** | **int** | The aggregated number of audio input tokens used, including cached tokens. | [optional] 
**output_audio_tokens** | **int** | The aggregated number of audio output tokens used. | [optional] 
**num_model_requests** | **int** | The count of requests made to the model. | 
**project_id** | **str** | When &#x60;group_by&#x3D;project_id&#x60;, this field provides the project ID of the grouped usage result. | [optional] 
**user_id** | **str** | When &#x60;group_by&#x3D;user_id&#x60;, this field provides the user ID of the grouped usage result. | [optional] 
**api_key_id** | **str** | When &#x60;group_by&#x3D;api_key_id&#x60;, this field provides the API key ID of the grouped usage result. | [optional] 
**model** | **str** | When &#x60;group_by&#x3D;model&#x60;, this field provides the model name of the grouped usage result. | [optional] 
**batch** | **bool** | When &#x60;group_by&#x3D;batch&#x60;, this field tells whether the grouped usage result is batch or not. | [optional] 

## Example

```python
from openapiopenai.models.usage_completions_result import UsageCompletionsResult

# TODO update the JSON string below
json = "{}"
# create an instance of UsageCompletionsResult from a JSON string
usage_completions_result_instance = UsageCompletionsResult.from_json(json)
# print the JSON string representation of the object
print(UsageCompletionsResult.to_json())

# convert the object into a dict
usage_completions_result_dict = usage_completions_result_instance.to_dict()
# create an instance of UsageCompletionsResult from a dict
usage_completions_result_from_dict = UsageCompletionsResult.from_dict(usage_completions_result_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


