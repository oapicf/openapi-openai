# RealtimeServerEventInputAudioBufferSpeechStarted


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**`event_id`** | **`String`** | The unique ID of the server event. | [default to nothing]
**`type`** | **`String`** | The event type, must be &#x60;input_audio_buffer.speech_started&#x60;. | [default to nothing]
**`audio_start_ms`** | **`Int64`** | Milliseconds from the start of all audio written to the buffer during the  session when speech was first detected. This will correspond to the  beginning of audio sent to the model, and thus includes the  &#x60;prefix_padding_ms&#x60; configured in the Session.  | [default to nothing]
**`item_id`** | **`String`** | The ID of the user message item that will be created when speech stops.  | [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


