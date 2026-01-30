# REALTIME_SERVER_EVENT_INPUT_AUDIO_BUFFER_SPEECH_STARTED

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event_id** | [**STRING_32**](STRING_32.md) | The unique ID of the server event. | [default to null]
**type** | [**STRING_32**](STRING_32.md) | The event type, must be &#x60;input_audio_buffer.speech_started&#x60;. | [default to null]
**audio_start_ms** | **INTEGER_32** | Milliseconds from the start of all audio written to the buffer during the  session when speech was first detected. This will correspond to the  beginning of audio sent to the model, and thus includes the  &#x60;prefix_padding_ms&#x60; configured in the Session.  | [default to null]
**item_id** | [**STRING_32**](STRING_32.md) | The ID of the user message item that will be created when speech stops.  | [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


