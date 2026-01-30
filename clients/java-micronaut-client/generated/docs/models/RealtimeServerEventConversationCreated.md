

# RealtimeServerEventConversationCreated

Returned when a conversation is created. Emitted right after session creation. 

The class is defined in **[RealtimeServerEventConversationCreated.java](../../src/main/java/org/openapitools/model/RealtimeServerEventConversationCreated.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**eventId** | `String` | The unique ID of the server event. | 
**type** | [**TypeEnum**](#TypeEnum) | The event type, must be &#x60;conversation.created&#x60;. | 
**conversation** | [`RealtimeServerEventConversationCreatedConversation`](RealtimeServerEventConversationCreatedConversation.md) |  | 


## TypeEnum

Name | Value
---- | -----
CONVERSATION_CREATED | `"conversation.created"`



