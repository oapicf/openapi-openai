# RealtimeResponseUsageInputTokenDetails

Details about the input tokens used in the Response.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cached_tokens** | **int** | The number of cached tokens used in the Response. | [optional] 
**text_tokens** | **int** | The number of text tokens used in the Response. | [optional] 
**audio_tokens** | **int** | The number of audio tokens used in the Response. | [optional] 

## Example

```python
from openapiopenai.models.realtime_response_usage_input_token_details import RealtimeResponseUsageInputTokenDetails

# TODO update the JSON string below
json = "{}"
# create an instance of RealtimeResponseUsageInputTokenDetails from a JSON string
realtime_response_usage_input_token_details_instance = RealtimeResponseUsageInputTokenDetails.from_json(json)
# print the JSON string representation of the object
print(RealtimeResponseUsageInputTokenDetails.to_json())

# convert the object into a dict
realtime_response_usage_input_token_details_dict = realtime_response_usage_input_token_details_instance.to_dict()
# create an instance of RealtimeResponseUsageInputTokenDetails from a dict
realtime_response_usage_input_token_details_from_dict = RealtimeResponseUsageInputTokenDetails.from_dict(realtime_response_usage_input_token_details_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


