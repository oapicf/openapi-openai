
# RealtimeClientEventConversationItemCreate

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**inline**](#Type) | The event type, must be &#x60;conversation.item.create&#x60;. |  |
| **item** | [**RealtimeConversationItem**](RealtimeConversationItem.md) |  |  |
| **eventId** | **kotlin.String** | Optional client-generated ID used to identify this event. |  [optional] |
| **previousItemId** | **kotlin.String** | The ID of the preceding item after which the new item will be inserted.  If not set, the new item will be appended to the end of the conversation.  If set, it allows an item to be inserted mid-conversation. If the ID  cannot be found, an error will be returned and the item will not be added.  |  [optional] |


<a id="Type"></a>
## Enum: type
| Name | Value |
| ---- | ----- |
| type | conversation.item.create |



