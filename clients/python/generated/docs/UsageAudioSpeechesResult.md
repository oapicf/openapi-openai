# UsageAudioSpeechesResult

The aggregated audio speeches usage details of the specific time bucket.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**object** | **str** |  | 
**characters** | **int** | The number of characters processed. | 
**num_model_requests** | **int** | The count of requests made to the model. | 
**project_id** | **str** | When &#x60;group_by&#x3D;project_id&#x60;, this field provides the project ID of the grouped usage result. | [optional] 
**user_id** | **str** | When &#x60;group_by&#x3D;user_id&#x60;, this field provides the user ID of the grouped usage result. | [optional] 
**api_key_id** | **str** | When &#x60;group_by&#x3D;api_key_id&#x60;, this field provides the API key ID of the grouped usage result. | [optional] 
**model** | **str** | When &#x60;group_by&#x3D;model&#x60;, this field provides the model name of the grouped usage result. | [optional] 

## Example

```python
from openapiopenai.models.usage_audio_speeches_result import UsageAudioSpeechesResult

# TODO update the JSON string below
json = "{}"
# create an instance of UsageAudioSpeechesResult from a JSON string
usage_audio_speeches_result_instance = UsageAudioSpeechesResult.from_json(json)
# print the JSON string representation of the object
print(UsageAudioSpeechesResult.to_json())

# convert the object into a dict
usage_audio_speeches_result_dict = usage_audio_speeches_result_instance.to_dict()
# create an instance of UsageAudioSpeechesResult from a dict
usage_audio_speeches_result_from_dict = UsageAudioSpeechesResult.from_dict(usage_audio_speeches_result_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


