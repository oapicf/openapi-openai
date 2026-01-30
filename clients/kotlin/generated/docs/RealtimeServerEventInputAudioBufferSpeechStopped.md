
# RealtimeServerEventInputAudioBufferSpeechStopped

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **eventId** | **kotlin.String** | The unique ID of the server event. |  |
| **type** | [**inline**](#Type) | The event type, must be &#x60;input_audio_buffer.speech_stopped&#x60;. |  |
| **audioEndMs** | **kotlin.Int** | Milliseconds since the session started when speech stopped. This will  correspond to the end of audio sent to the model, and thus includes the  &#x60;min_silence_duration_ms&#x60; configured in the Session.  |  |
| **itemId** | **kotlin.String** | The ID of the user message item that will be created. |  |


<a id="Type"></a>
## Enum: type
| Name | Value |
| ---- | ----- |
| type | input_audio_buffer.speech_stopped |



