# RealtimeServerEventInputAudioBufferSpeechStopped


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**`event_id`** | **`String`** | The unique ID of the server event. | [default to nothing]
**`type`** | **`String`** | The event type, must be &#x60;input_audio_buffer.speech_stopped&#x60;. | [default to nothing]
**`audio_end_ms`** | **`Int64`** | Milliseconds since the session started when speech stopped. This will  correspond to the end of audio sent to the model, and thus includes the  &#x60;min_silence_duration_ms&#x60; configured in the Session.  | [default to nothing]
**`item_id`** | **`String`** | The ID of the user message item that will be created. | [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


