# RealtimeServerEventInputAudioBufferCleared

Returned when the input audio buffer is cleared by the client with a  `input_audio_buffer.clear` event. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event_id** | **str** | The unique ID of the server event. | 
**type** | **str** | The event type, must be &#x60;input_audio_buffer.cleared&#x60;. | 

## Example

```python
from openapiopenai.models.realtime_server_event_input_audio_buffer_cleared import RealtimeServerEventInputAudioBufferCleared

# TODO update the JSON string below
json = "{}"
# create an instance of RealtimeServerEventInputAudioBufferCleared from a JSON string
realtime_server_event_input_audio_buffer_cleared_instance = RealtimeServerEventInputAudioBufferCleared.from_json(json)
# print the JSON string representation of the object
print(RealtimeServerEventInputAudioBufferCleared.to_json())

# convert the object into a dict
realtime_server_event_input_audio_buffer_cleared_dict = realtime_server_event_input_audio_buffer_cleared_instance.to_dict()
# create an instance of RealtimeServerEventInputAudioBufferCleared from a dict
realtime_server_event_input_audio_buffer_cleared_from_dict = RealtimeServerEventInputAudioBufferCleared.from_dict(realtime_server_event_input_audio_buffer_cleared_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


