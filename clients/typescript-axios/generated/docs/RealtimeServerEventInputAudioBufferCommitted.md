# RealtimeServerEventInputAudioBufferCommitted

Returned when an input audio buffer is committed, either by the client or  automatically in server VAD mode. The `item_id` property is the ID of the user message item that will be created, thus a `conversation.item.created` event  will also be sent to the client. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event_id** | **string** | The unique ID of the server event. | [default to undefined]
**type** | **string** | The event type, must be &#x60;input_audio_buffer.committed&#x60;. | [default to undefined]
**previous_item_id** | **string** | The ID of the preceding item after which the new item will be inserted.  | [default to undefined]
**item_id** | **string** | The ID of the user message item that will be created. | [default to undefined]

## Example

```typescript
import { RealtimeServerEventInputAudioBufferCommitted } from './api';

const instance: RealtimeServerEventInputAudioBufferCommitted = {
    event_id,
    type,
    previous_item_id,
    item_id,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
