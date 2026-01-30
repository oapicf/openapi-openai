
# RealtimeServerEventConversationItemTruncated

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **eventId** | **kotlin.String** | The unique ID of the server event. |  |
| **type** | [**inline**](#Type) | The event type, must be &#x60;conversation.item.truncated&#x60;. |  |
| **itemId** | **kotlin.String** | The ID of the assistant message item that was truncated. |  |
| **contentIndex** | **kotlin.Int** | The index of the content part that was truncated. |  |
| **audioEndMs** | **kotlin.Int** | The duration up to which the audio was truncated, in milliseconds.  |  |


<a id="Type"></a>
## Enum: type
| Name | Value |
| ---- | ----- |
| type | conversation.item.truncated |



