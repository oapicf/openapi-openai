# RealtimeClientEventConversationItemTruncate

Send this event to truncate a previous assistant message’s audio. The server  will produce audio faster than realtime, so this event is useful when the user  interrupts to truncate audio that has already been sent to the client but not  yet played. This will synchronize the server\'s understanding of the audio with  the client\'s playback.  Truncating audio will delete the server-side text transcript to ensure there  is not text in the context that hasn\'t been heard by the user.  If successful, the server will respond with a `conversation.item.truncated`  event.  

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event_id** | **string** | Optional client-generated ID used to identify this event. | [optional] [default to undefined]
**type** | **string** | The event type, must be &#x60;conversation.item.truncate&#x60;. | [default to undefined]
**item_id** | **string** | The ID of the assistant message item to truncate. Only assistant message  items can be truncated.  | [default to undefined]
**content_index** | **number** | The index of the content part to truncate. Set this to 0. | [default to undefined]
**audio_end_ms** | **number** | Inclusive duration up to which audio is truncated, in milliseconds. If  the audio_end_ms is greater than the actual audio duration, the server  will respond with an error.  | [default to undefined]

## Example

```typescript
import { RealtimeClientEventConversationItemTruncate } from './api';

const instance: RealtimeClientEventConversationItemTruncate = {
    event_id,
    type,
    item_id,
    content_index,
    audio_end_ms,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
