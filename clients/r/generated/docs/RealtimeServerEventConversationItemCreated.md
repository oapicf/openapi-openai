# openapi::RealtimeServerEventConversationItemCreated

Returned when a conversation item is created. There are several scenarios that  produce this event:   - The server is generating a Response, which if successful will produce      either one or two Items, which will be of type `message`      (role `assistant`) or type `function_call`.   - The input audio buffer has been committed, either by the client or the      server (in `server_vad` mode). The server will take the content of the      input audio buffer and add it to a new user message Item.   - The client has sent a `conversation.item.create` event to add a new Item      to the Conversation. 

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event_id** | **character** | The unique ID of the server event. | 
**type** | **character** | The event type, must be &#x60;conversation.item.created&#x60;. | [Enum: [conversation.item.created]] 
**previous_item_id** | **character** | The ID of the preceding item in the Conversation context, allows the  client to understand the order of the conversation.  | 
**item** | [**RealtimeConversationItem**](RealtimeConversationItem.md) |  | 


