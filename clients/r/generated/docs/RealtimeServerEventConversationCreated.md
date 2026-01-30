# openapi::RealtimeServerEventConversationCreated

Returned when a conversation is created. Emitted right after session creation. 

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event_id** | **character** | The unique ID of the server event. | 
**type** | **character** | The event type, must be &#x60;conversation.created&#x60;. | [Enum: [conversation.created]] 
**conversation** | [**RealtimeServerEventConversationCreatedConversation**](RealtimeServerEventConversationCreated_conversation.md) |  | 


