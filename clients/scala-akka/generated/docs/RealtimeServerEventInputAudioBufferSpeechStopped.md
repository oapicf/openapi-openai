

# RealtimeServerEventInputAudioBufferSpeechStopped

Returned in `server_vad` mode when the server detects the end of speech in  the audio buffer. The server will also send an `conversation.item.created`  event with the user message item that is created from the audio buffer. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**eventId** | **String** | The unique ID of the server event. | 
**`type`** | [**`Type`**](#`Type`) | The event type, must be &#x60;input_audio_buffer.speech_stopped&#x60;. | 
**audioEndMs** | **Int** | Milliseconds since the session started when speech stopped. This will  correspond to the end of audio sent to the model, and thus includes the  &#x60;min_silence_duration_ms&#x60; configured in the Session.  | 
**itemId** | **String** | The ID of the user message item that will be created. | 


## Enum: `Type`
Allowed values: [input_audio_buffer.speech_stopped]




