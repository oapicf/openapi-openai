# RealtimeClientEventInputAudioBufferAppend

Send this event to append audio bytes to the input audio buffer. The audio  buffer is temporary storage you can write to and later commit. In Server VAD  mode, the audio buffer is used to detect speech and the server will decide  when to commit. When Server VAD is disabled, you must commit the audio buffer manually.  The client may choose how much audio to place in each event up to a maximum  of 15 MiB, for example streaming smaller chunks from the client may allow the  VAD to be more responsive. Unlike made other client events, the server will  not send a confirmation response to this event. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event_id** | **str** | Optional client-generated ID used to identify this event. | [optional] 
**type** | **str** | The event type, must be &#x60;input_audio_buffer.append&#x60;. | 
**audio** | **str** | Base64-encoded audio bytes. This must be in the format specified by the  &#x60;input_audio_format&#x60; field in the session configuration.  | 

## Example

```python
from openapiopenai.models.realtime_client_event_input_audio_buffer_append import RealtimeClientEventInputAudioBufferAppend

# TODO update the JSON string below
json = "{}"
# create an instance of RealtimeClientEventInputAudioBufferAppend from a JSON string
realtime_client_event_input_audio_buffer_append_instance = RealtimeClientEventInputAudioBufferAppend.from_json(json)
# print the JSON string representation of the object
print(RealtimeClientEventInputAudioBufferAppend.to_json())

# convert the object into a dict
realtime_client_event_input_audio_buffer_append_dict = realtime_client_event_input_audio_buffer_append_instance.to_dict()
# create an instance of RealtimeClientEventInputAudioBufferAppend from a dict
realtime_client_event_input_audio_buffer_append_from_dict = RealtimeClientEventInputAudioBufferAppend.from_dict(realtime_client_event_input_audio_buffer_append_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


