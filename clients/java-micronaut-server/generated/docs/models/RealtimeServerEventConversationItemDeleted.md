

# RealtimeServerEventConversationItemDeleted

Returned when an item in the conversation is deleted by the client with a  `conversation.item.delete` event. This event is used to synchronize the  server's understanding of the conversation history with the client's view. 

The class is defined in **[RealtimeServerEventConversationItemDeleted.java](../../src/main/java/org/openapitools/model/RealtimeServerEventConversationItemDeleted.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**eventId** | `String` | The unique ID of the server event. | 
**type** | [**TypeEnum**](#TypeEnum) | The event type, must be &#x60;conversation.item.deleted&#x60;. | 
**itemId** | `String` | The ID of the item that was deleted. | 


## TypeEnum

Name | Value
---- | -----
CONVERSATION_ITEM_DELETED | `"conversation.item.deleted"`



