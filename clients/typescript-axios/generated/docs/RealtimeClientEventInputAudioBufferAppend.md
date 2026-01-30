# RealtimeClientEventInputAudioBufferAppend

Send this event to append audio bytes to the input audio buffer. The audio  buffer is temporary storage you can write to and later commit. In Server VAD  mode, the audio buffer is used to detect speech and the server will decide  when to commit. When Server VAD is disabled, you must commit the audio buffer manually.  The client may choose how much audio to place in each event up to a maximum  of 15 MiB, for example streaming smaller chunks from the client may allow the  VAD to be more responsive. Unlike made other client events, the server will  not send a confirmation response to this event. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event_id** | **string** | Optional client-generated ID used to identify this event. | [optional] [default to undefined]
**type** | **string** | The event type, must be &#x60;input_audio_buffer.append&#x60;. | [default to undefined]
**audio** | **string** | Base64-encoded audio bytes. This must be in the format specified by the  &#x60;input_audio_format&#x60; field in the session configuration.  | [default to undefined]

## Example

```typescript
import { RealtimeClientEventInputAudioBufferAppend } from './api';

const instance: RealtimeClientEventInputAudioBufferAppend = {
    event_id,
    type,
    audio,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
