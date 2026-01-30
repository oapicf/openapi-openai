# RealtimeServerEventInputAudioBufferSpeechStarted

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**eventId** | **String!** | The unique ID of the server event. | [default to null]
**Type_** | **String!** | The event type, must be &#x60;input_audio_buffer.speech_started&#x60;. | [default to null]
**audioStartMs** | **Int!** | Milliseconds from the start of all audio written to the buffer during the  session when speech was first detected. This will correspond to the  beginning of audio sent to the model, and thus includes the  &#x60;prefix_padding_ms&#x60; configured in the Session.  | [default to null]
**itemId** | **String!** | The ID of the user message item that will be created when speech stops.  | [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


