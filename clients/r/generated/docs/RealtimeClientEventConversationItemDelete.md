# openapi::RealtimeClientEventConversationItemDelete

Send this event when you want to remove any item from the conversation  history. The server will respond with a `conversation.item.deleted` event,  unless the item does not exist in the conversation history, in which case the  server will respond with an error. 

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event_id** | **character** | Optional client-generated ID used to identify this event. | [optional] 
**type** | **character** | The event type, must be &#x60;conversation.item.delete&#x60;. | [Enum: [conversation.item.delete]] 
**item_id** | **character** | The ID of the item to delete. | 


