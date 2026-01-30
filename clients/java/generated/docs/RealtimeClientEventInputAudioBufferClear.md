

# RealtimeClientEventInputAudioBufferClear

Send this event to clear the audio bytes in the buffer. The server will  respond with an `input_audio_buffer.cleared` event. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**eventId** | **String** | Optional client-generated ID used to identify this event. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | The event type, must be &#x60;input_audio_buffer.clear&#x60;. |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| INPUT_AUDIO_BUFFER_CLEAR | &quot;input_audio_buffer.clear&quot; |



