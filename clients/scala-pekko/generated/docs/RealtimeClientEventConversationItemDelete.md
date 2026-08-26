

# RealtimeClientEventConversationItemDelete

Send this event when you want to remove any item from the conversation  history. The server will respond with a `conversation.item.deleted` event,  unless the item does not exist in the conversation history, in which case the  server will respond with an error. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**eventId** | **String** | Optional client-generated ID used to identify this event. |  [optional]
**`type`** | [**`Type`**](#`Type`) | The event type, must be &#x60;conversation.item.delete&#x60;. | 
**itemId** | **String** | The ID of the item to delete. | 


## Enum: `Type`
Allowed values: [conversation.item.delete]




