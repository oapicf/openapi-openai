
# RealtimeClientEventInputAudioBufferAppend

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**inline**](#Type) | The event type, must be &#x60;input_audio_buffer.append&#x60;. |  |
| **audio** | **kotlin.String** | Base64-encoded audio bytes. This must be in the format specified by the  &#x60;input_audio_format&#x60; field in the session configuration.  |  |
| **eventId** | **kotlin.String** | Optional client-generated ID used to identify this event. |  [optional] |


<a id="Type"></a>
## Enum: type
| Name | Value |
| ---- | ----- |
| type | input_audio_buffer.append |



