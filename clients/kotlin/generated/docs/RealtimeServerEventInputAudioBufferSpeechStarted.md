
# RealtimeServerEventInputAudioBufferSpeechStarted

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **eventId** | **kotlin.String** | The unique ID of the server event. |  |
| **type** | [**inline**](#Type) | The event type, must be &#x60;input_audio_buffer.speech_started&#x60;. |  |
| **audioStartMs** | **kotlin.Int** | Milliseconds from the start of all audio written to the buffer during the  session when speech was first detected. This will correspond to the  beginning of audio sent to the model, and thus includes the  &#x60;prefix_padding_ms&#x60; configured in the Session.  |  |
| **itemId** | **kotlin.String** | The ID of the user message item that will be created when speech stops.  |  |


<a id="Type"></a>
## Enum: type
| Name | Value |
| ---- | ----- |
| type | input_audio_buffer.speech_started |



