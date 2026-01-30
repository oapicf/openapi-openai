# RealtimeServerEventConversationItemDeleted

Returned when an item in the conversation is deleted by the client with a  `conversation.item.delete` event. This event is used to synchronize the  server\'s understanding of the conversation history with the client\'s view. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event_id** | **string** | The unique ID of the server event. | [default to undefined]
**type** | **string** | The event type, must be &#x60;conversation.item.deleted&#x60;. | [default to undefined]
**item_id** | **string** | The ID of the item that was deleted. | [default to undefined]

## Example

```typescript
import { RealtimeServerEventConversationItemDeleted } from './api';

const instance: RealtimeServerEventConversationItemDeleted = {
    event_id,
    type,
    item_id,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
