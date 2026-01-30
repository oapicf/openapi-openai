# RealtimeServerEventInputAudioBufferSpeechStarted

Sent by the server when in `server_vad` mode to indicate that speech has been  detected in the audio buffer. This can happen any time audio is added to the  buffer (unless speech is already detected). The client may want to use this  event to interrupt audio playback or provide visual feedback to the user.   The client should expect to receive a `input_audio_buffer.speech_stopped` event  when speech stops. The `item_id` property is the ID of the user message item  that will be created when speech stops and will also be included in the  `input_audio_buffer.speech_stopped` event (unless the client manually commits  the audio buffer during VAD activation). 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event_id** | **str** | The unique ID of the server event. | 
**type** | **str** | The event type, must be &#x60;input_audio_buffer.speech_started&#x60;. | 
**audio_start_ms** | **int** | Milliseconds from the start of all audio written to the buffer during the  session when speech was first detected. This will correspond to the  beginning of audio sent to the model, and thus includes the  &#x60;prefix_padding_ms&#x60; configured in the Session.  | 
**item_id** | **str** | The ID of the user message item that will be created when speech stops.  | 

## Example

```python
from openapiopenai.models.realtime_server_event_input_audio_buffer_speech_started import RealtimeServerEventInputAudioBufferSpeechStarted

# TODO update the JSON string below
json = "{}"
# create an instance of RealtimeServerEventInputAudioBufferSpeechStarted from a JSON string
realtime_server_event_input_audio_buffer_speech_started_instance = RealtimeServerEventInputAudioBufferSpeechStarted.from_json(json)
# print the JSON string representation of the object
print(RealtimeServerEventInputAudioBufferSpeechStarted.to_json())

# convert the object into a dict
realtime_server_event_input_audio_buffer_speech_started_dict = realtime_server_event_input_audio_buffer_speech_started_instance.to_dict()
# create an instance of RealtimeServerEventInputAudioBufferSpeechStarted from a dict
realtime_server_event_input_audio_buffer_speech_started_from_dict = RealtimeServerEventInputAudioBufferSpeechStarted.from_dict(realtime_server_event_input_audio_buffer_speech_started_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


