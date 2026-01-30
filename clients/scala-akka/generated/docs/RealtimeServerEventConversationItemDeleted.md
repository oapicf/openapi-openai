

# RealtimeServerEventConversationItemDeleted

Returned when an item in the conversation is deleted by the client with a  `conversation.item.delete` event. This event is used to synchronize the  server's understanding of the conversation history with the client's view. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**eventId** | **String** | The unique ID of the server event. | 
**`type`** | [**`Type`**](#`Type`) | The event type, must be &#x60;conversation.item.deleted&#x60;. | 
**itemId** | **String** | The ID of the item that was deleted. | 


## Enum: `Type`
Allowed values: [conversation.item.deleted]




