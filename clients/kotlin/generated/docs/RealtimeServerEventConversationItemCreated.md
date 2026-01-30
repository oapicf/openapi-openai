
# RealtimeServerEventConversationItemCreated

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **eventId** | **kotlin.String** | The unique ID of the server event. |  |
| **type** | [**inline**](#Type) | The event type, must be &#x60;conversation.item.created&#x60;. |  |
| **previousItemId** | **kotlin.String** | The ID of the preceding item in the Conversation context, allows the  client to understand the order of the conversation.  |  |
| **item** | [**RealtimeConversationItem**](RealtimeConversationItem.md) |  |  |


<a id="Type"></a>
## Enum: type
| Name | Value |
| ---- | ----- |
| type | conversation.item.created |



