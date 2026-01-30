

# RealtimeServerEventInputAudioBufferSpeechStarted

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**eventId** | **String** | The unique ID of the server event. | 
**type** | [**TypeEnum**](#TypeEnum) | The event type, must be &#x60;input_audio_buffer.speech_started&#x60;. | 
**audioStartMs** | **Integer** | Milliseconds from the start of all audio written to the buffer during the  session when speech was first detected. This will correspond to the  beginning of audio sent to the model, and thus includes the  &#x60;prefix_padding_ms&#x60; configured in the Session.  | 
**itemId** | **String** | The ID of the user message item that will be created when speech stops.  | 


## Enum: TypeEnum

Name | Value
---- | -----




