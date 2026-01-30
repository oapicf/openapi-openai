# RealtimeServerEventConversationCreated

Returned when a conversation is created. Emitted right after session creation. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event_id** | **string** | The unique ID of the server event. | [default to undefined]
**type** | **string** | The event type, must be &#x60;conversation.created&#x60;. | [default to undefined]
**conversation** | [**RealtimeServerEventConversationCreatedConversation**](RealtimeServerEventConversationCreatedConversation.md) |  | [default to undefined]

## Example

```typescript
import { RealtimeServerEventConversationCreated } from './api';

const instance: RealtimeServerEventConversationCreated = {
    event_id,
    type,
    conversation,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
