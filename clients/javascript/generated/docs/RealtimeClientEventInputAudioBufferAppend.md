# OpenapiOpenai.RealtimeClientEventInputAudioBufferAppend

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**eventId** | **String** | Optional client-generated ID used to identify this event. | [optional] 
**type** | **String** | The event type, must be &#x60;input_audio_buffer.append&#x60;. | 
**audio** | **String** | Base64-encoded audio bytes. This must be in the format specified by the  &#x60;input_audio_format&#x60; field in the session configuration.  | 



## Enum: TypeEnum


* `input_audio_buffer.append` (value: `"input_audio_buffer.append"`)




