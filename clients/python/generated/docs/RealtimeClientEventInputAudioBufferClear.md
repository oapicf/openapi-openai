# RealtimeClientEventInputAudioBufferClear

Send this event to clear the audio bytes in the buffer. The server will  respond with an `input_audio_buffer.cleared` event. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event_id** | **str** | Optional client-generated ID used to identify this event. | [optional] 
**type** | **str** | The event type, must be &#x60;input_audio_buffer.clear&#x60;. | 

## Example

```python
from openapiopenai.models.realtime_client_event_input_audio_buffer_clear import RealtimeClientEventInputAudioBufferClear

# TODO update the JSON string below
json = "{}"
# create an instance of RealtimeClientEventInputAudioBufferClear from a JSON string
realtime_client_event_input_audio_buffer_clear_instance = RealtimeClientEventInputAudioBufferClear.from_json(json)
# print the JSON string representation of the object
print(RealtimeClientEventInputAudioBufferClear.to_json())

# convert the object into a dict
realtime_client_event_input_audio_buffer_clear_dict = realtime_client_event_input_audio_buffer_clear_instance.to_dict()
# create an instance of RealtimeClientEventInputAudioBufferClear from a dict
realtime_client_event_input_audio_buffer_clear_from_dict = RealtimeClientEventInputAudioBufferClear.from_dict(realtime_client_event_input_audio_buffer_clear_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


