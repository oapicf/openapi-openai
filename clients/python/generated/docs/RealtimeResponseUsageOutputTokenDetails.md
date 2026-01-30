# RealtimeResponseUsageOutputTokenDetails

Details about the output tokens used in the Response.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**text_tokens** | **int** | The number of text tokens used in the Response. | [optional] 
**audio_tokens** | **int** | The number of audio tokens used in the Response. | [optional] 

## Example

```python
from openapiopenai.models.realtime_response_usage_output_token_details import RealtimeResponseUsageOutputTokenDetails

# TODO update the JSON string below
json = "{}"
# create an instance of RealtimeResponseUsageOutputTokenDetails from a JSON string
realtime_response_usage_output_token_details_instance = RealtimeResponseUsageOutputTokenDetails.from_json(json)
# print the JSON string representation of the object
print(RealtimeResponseUsageOutputTokenDetails.to_json())

# convert the object into a dict
realtime_response_usage_output_token_details_dict = realtime_response_usage_output_token_details_instance.to_dict()
# create an instance of RealtimeResponseUsageOutputTokenDetails from a dict
realtime_response_usage_output_token_details_from_dict = RealtimeResponseUsageOutputTokenDetails.from_dict(realtime_response_usage_output_token_details_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


