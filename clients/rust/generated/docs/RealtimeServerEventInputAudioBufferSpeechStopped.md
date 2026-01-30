# RealtimeServerEventInputAudioBufferSpeechStopped

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event_id** | **String** | The unique ID of the server event. | 
**r#type** | **String** | The event type, must be `input_audio_buffer.speech_stopped`. | 
**audio_end_ms** | **i32** | Milliseconds since the session started when speech stopped. This will  correspond to the end of audio sent to the model, and thus includes the  `min_silence_duration_ms` configured in the Session.  | 
**item_id** | **String** | The ID of the user message item that will be created. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


