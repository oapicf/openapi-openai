

# RealtimeServerEventConversationItemCreated

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**eventId** | **String** | The unique ID of the server event. | 
**type** | [**TypeEnum**](#TypeEnum) | The event type, must be &#x60;conversation.item.created&#x60;. | 
**previousItemId** | **String** | The ID of the preceding item in the Conversation context, allows the  client to understand the order of the conversation.  | 
**item** | [**RealtimeConversationItem**](RealtimeConversationItem.md) |  | 


## Enum: TypeEnum

Name | Value
---- | -----




