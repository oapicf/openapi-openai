# RealtimeServerEventResponseAudioDelta

Returned when the model-generated audio is updated.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event_id** | **str** | The unique ID of the server event. | 
**type** | **str** | The event type, must be &#x60;response.audio.delta&#x60;. | 
**response_id** | **str** | The ID of the response. | 
**item_id** | **str** | The ID of the item. | 
**output_index** | **int** | The index of the output item in the response. | 
**content_index** | **int** | The index of the content part in the item&#39;s content array. | 
**delta** | **str** | Base64-encoded audio data delta. | 

## Example

```python
from openapiopenai.models.realtime_server_event_response_audio_delta import RealtimeServerEventResponseAudioDelta

# TODO update the JSON string below
json = "{}"
# create an instance of RealtimeServerEventResponseAudioDelta from a JSON string
realtime_server_event_response_audio_delta_instance = RealtimeServerEventResponseAudioDelta.from_json(json)
# print the JSON string representation of the object
print(RealtimeServerEventResponseAudioDelta.to_json())

# convert the object into a dict
realtime_server_event_response_audio_delta_dict = realtime_server_event_response_audio_delta_instance.to_dict()
# create an instance of RealtimeServerEventResponseAudioDelta from a dict
realtime_server_event_response_audio_delta_from_dict = RealtimeServerEventResponseAudioDelta.from_dict(realtime_server_event_response_audio_delta_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


