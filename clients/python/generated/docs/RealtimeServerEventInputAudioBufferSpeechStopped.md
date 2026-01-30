# RealtimeServerEventInputAudioBufferSpeechStopped

Returned in `server_vad` mode when the server detects the end of speech in  the audio buffer. The server will also send an `conversation.item.created`  event with the user message item that is created from the audio buffer. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event_id** | **str** | The unique ID of the server event. | 
**type** | **str** | The event type, must be &#x60;input_audio_buffer.speech_stopped&#x60;. | 
**audio_end_ms** | **int** | Milliseconds since the session started when speech stopped. This will  correspond to the end of audio sent to the model, and thus includes the  &#x60;min_silence_duration_ms&#x60; configured in the Session.  | 
**item_id** | **str** | The ID of the user message item that will be created. | 

## Example

```python
from openapiopenai.models.realtime_server_event_input_audio_buffer_speech_stopped import RealtimeServerEventInputAudioBufferSpeechStopped

# TODO update the JSON string below
json = "{}"
# create an instance of RealtimeServerEventInputAudioBufferSpeechStopped from a JSON string
realtime_server_event_input_audio_buffer_speech_stopped_instance = RealtimeServerEventInputAudioBufferSpeechStopped.from_json(json)
# print the JSON string representation of the object
print(RealtimeServerEventInputAudioBufferSpeechStopped.to_json())

# convert the object into a dict
realtime_server_event_input_audio_buffer_speech_stopped_dict = realtime_server_event_input_audio_buffer_speech_stopped_instance.to_dict()
# create an instance of RealtimeServerEventInputAudioBufferSpeechStopped from a dict
realtime_server_event_input_audio_buffer_speech_stopped_from_dict = RealtimeServerEventInputAudioBufferSpeechStopped.from_dict(realtime_server_event_input_audio_buffer_speech_stopped_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


