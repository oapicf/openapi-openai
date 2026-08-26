

# RealtimeClientEventInputAudioBufferClear

Send this event to clear the audio bytes in the buffer. The server will  respond with an `input_audio_buffer.cleared` event. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**eventId** | **String** | Optional client-generated ID used to identify this event. |  [optional]
**`type`** | [**`Type`**](#`Type`) | The event type, must be &#x60;input_audio_buffer.clear&#x60;. | 


## Enum: `Type`
Allowed values: [input_audio_buffer.clear]




