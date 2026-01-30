# RealtimeClientEventInputAudioBufferClear

Send this event to clear the audio bytes in the buffer. The server will  respond with an `input_audio_buffer.cleared` event. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event_id** | **string** | Optional client-generated ID used to identify this event. | [optional] [default to undefined]
**type** | **string** | The event type, must be &#x60;input_audio_buffer.clear&#x60;. | [default to undefined]

## Example

```typescript
import { RealtimeClientEventInputAudioBufferClear } from './api';

const instance: RealtimeClientEventInputAudioBufferClear = {
    event_id,
    type,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
