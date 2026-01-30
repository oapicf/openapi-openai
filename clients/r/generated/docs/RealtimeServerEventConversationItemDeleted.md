# openapi::RealtimeServerEventConversationItemDeleted

Returned when an item in the conversation is deleted by the client with a  `conversation.item.delete` event. This event is used to synchronize the  server's understanding of the conversation history with the client's view. 

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event_id** | **character** | The unique ID of the server event. | 
**type** | **character** | The event type, must be &#x60;conversation.item.deleted&#x60;. | [Enum: [conversation.item.deleted]] 
**item_id** | **character** | The ID of the item that was deleted. | 


