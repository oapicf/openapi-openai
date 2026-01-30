

# RealtimeClientEventInputAudioBufferClear

Send this event to clear the audio bytes in the buffer. The server will  respond with an `input_audio_buffer.cleared` event. 

The class is defined in **[RealtimeClientEventInputAudioBufferClear.java](../../src/main/java/org/openapitools/model/RealtimeClientEventInputAudioBufferClear.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**eventId** | `String` | Optional client-generated ID used to identify this event. |  [optional property]
**type** | [**TypeEnum**](#TypeEnum) | The event type, must be &#x60;input_audio_buffer.clear&#x60;. | 


## TypeEnum

Name | Value
---- | -----
INPUT_AUDIO_BUFFER_CLEAR | `"input_audio_buffer.clear"`


