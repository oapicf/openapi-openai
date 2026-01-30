# RealtimeResponseUsage

Usage statistics for the Response, this will correspond to billing. A  Realtime API session will maintain a conversation context and append new  Items to the Conversation, thus output from previous turns (text and  audio tokens) will become the input for later turns. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**total_tokens** | **int** | The total number of tokens in the Response including input and output  text and audio tokens.  | [optional] 
**input_tokens** | **int** | The number of input tokens used in the Response, including text and  audio tokens.  | [optional] 
**output_tokens** | **int** | The number of output tokens sent in the Response, including text and  audio tokens.  | [optional] 
**input_token_details** | [**RealtimeResponseUsageInputTokenDetails**](RealtimeResponseUsageInputTokenDetails.md) |  | [optional] 
**output_token_details** | [**RealtimeResponseUsageOutputTokenDetails**](RealtimeResponseUsageOutputTokenDetails.md) |  | [optional] 

## Example

```python
from openapiopenai.models.realtime_response_usage import RealtimeResponseUsage

# TODO update the JSON string below
json = "{}"
# create an instance of RealtimeResponseUsage from a JSON string
realtime_response_usage_instance = RealtimeResponseUsage.from_json(json)
# print the JSON string representation of the object
print(RealtimeResponseUsage.to_json())

# convert the object into a dict
realtime_response_usage_dict = realtime_response_usage_instance.to_dict()
# create an instance of RealtimeResponseUsage from a dict
realtime_response_usage_from_dict = RealtimeResponseUsage.from_dict(realtime_response_usage_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


