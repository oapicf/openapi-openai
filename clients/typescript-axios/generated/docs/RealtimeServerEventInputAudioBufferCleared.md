# RealtimeServerEventInputAudioBufferCleared

Returned when the input audio buffer is cleared by the client with a  `input_audio_buffer.clear` event. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event_id** | **string** | The unique ID of the server event. | [default to undefined]
**type** | **string** | The event type, must be &#x60;input_audio_buffer.cleared&#x60;. | [default to undefined]

## Example

```typescript
import { RealtimeServerEventInputAudioBufferCleared } from './api';

const instance: RealtimeServerEventInputAudioBufferCleared = {
    event_id,
    type,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
