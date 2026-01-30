# RealtimeServerEventInputAudioBufferSpeechStopped
## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **event\_id** | **String** | The unique ID of the server event. | [default to null] |
| **type** | **String** | The event type, must be &#x60;input_audio_buffer.speech_stopped&#x60;. | [default to null] |
| **audio\_end\_ms** | **Integer** | Milliseconds since the session started when speech stopped. This will  correspond to the end of audio sent to the model, and thus includes the  &#x60;min_silence_duration_ms&#x60; configured in the Session.  | [default to null] |
| **item\_id** | **String** | The ID of the user message item that will be created. | [default to null] |

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

