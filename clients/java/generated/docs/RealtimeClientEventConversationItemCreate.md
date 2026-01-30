

# RealtimeClientEventConversationItemCreate

Add a new Item to the Conversation's context, including messages, function  calls, and function call responses. This event can be used both to populate a  \"history\" of the conversation and to add new items mid-stream, but has the  current limitation that it cannot populate assistant audio messages.  If successful, the server will respond with a `conversation.item.created`  event, otherwise an `error` event will be sent. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**eventId** | **String** | Optional client-generated ID used to identify this event. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | The event type, must be &#x60;conversation.item.create&#x60;. |  |
|**previousItemId** | **String** | The ID of the preceding item after which the new item will be inserted.  If not set, the new item will be appended to the end of the conversation.  If set, it allows an item to be inserted mid-conversation. If the ID  cannot be found, an error will be returned and the item will not be added.  |  [optional] |
|**item** | [**RealtimeConversationItem**](RealtimeConversationItem.md) |  |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| CONVERSATION_ITEM_CREATE | &quot;conversation.item.create&quot; |



