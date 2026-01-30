# RealtimeServerEventConversationItemCreated

Returned when a conversation item is created. There are several scenarios that  produce this event:   - The server is generating a Response, which if successful will produce      either one or two Items, which will be of type `message`      (role `assistant`) or type `function_call`.   - The input audio buffer has been committed, either by the client or the      server (in `server_vad` mode). The server will take the content of the      input audio buffer and add it to a new user message Item.   - The client has sent a `conversation.item.create` event to add a new Item      to the Conversation. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event_id** | **string** | The unique ID of the server event. | [default to undefined]
**type** | **string** | The event type, must be &#x60;conversation.item.created&#x60;. | [default to undefined]
**previous_item_id** | **string** | The ID of the preceding item in the Conversation context, allows the  client to understand the order of the conversation.  | [default to undefined]
**item** | [**RealtimeConversationItem**](RealtimeConversationItem.md) |  | [default to undefined]

## Example

```typescript
import { RealtimeServerEventConversationItemCreated } from './api';

const instance: RealtimeServerEventConversationItemCreated = {
    event_id,
    type,
    previous_item_id,
    item,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
