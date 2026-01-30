

# RealtimeClientEventConversationItemCreate

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**eventId** | **String** | Optional client-generated ID used to identify this event. |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | The event type, must be &#x60;conversation.item.create&#x60;. | 
**previousItemId** | **String** | The ID of the preceding item after which the new item will be inserted.  If not set, the new item will be appended to the end of the conversation.  If set, it allows an item to be inserted mid-conversation. If the ID  cannot be found, an error will be returned and the item will not be added.  |  [optional]
**item** | [**RealtimeConversationItem**](RealtimeConversationItem.md) |  | 


## Enum: TypeEnum

Name | Value
---- | -----




