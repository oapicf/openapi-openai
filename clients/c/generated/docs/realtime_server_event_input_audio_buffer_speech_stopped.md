# realtime_server_event_input_audio_buffer_speech_stopped_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event_id** | **char \*** | The unique ID of the server event. | 
**type** | **openai_api_realtime_server_event_input_audio_buffer_speech_stopped_TYPE_e** | The event type, must be &#x60;input_audio_buffer.speech_stopped&#x60;. | 
**audio_end_ms** | **int** | Milliseconds since the session started when speech stopped. This will  correspond to the end of audio sent to the model, and thus includes the  &#x60;min_silence_duration_ms&#x60; configured in the Session.  | 
**item_id** | **char \*** | The ID of the user message item that will be created. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


