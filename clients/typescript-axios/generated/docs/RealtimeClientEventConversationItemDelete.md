# RealtimeClientEventConversationItemDelete

Send this event when you want to remove any item from the conversation  history. The server will respond with a `conversation.item.deleted` event,  unless the item does not exist in the conversation history, in which case the  server will respond with an error. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event_id** | **string** | Optional client-generated ID used to identify this event. | [optional] [default to undefined]
**type** | **string** | The event type, must be &#x60;conversation.item.delete&#x60;. | [default to undefined]
**item_id** | **string** | The ID of the item to delete. | [default to undefined]

## Example

```typescript
import { RealtimeClientEventConversationItemDelete } from './api';

const instance: RealtimeClientEventConversationItemDelete = {
    event_id,
    type,
    item_id,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
