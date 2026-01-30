
# RealtimeClientEventConversationItemTruncate

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**inline**](#Type) | The event type, must be &#x60;conversation.item.truncate&#x60;. |  |
| **itemId** | **kotlin.String** | The ID of the assistant message item to truncate. Only assistant message  items can be truncated.  |  |
| **contentIndex** | **kotlin.Int** | The index of the content part to truncate. Set this to 0. |  |
| **audioEndMs** | **kotlin.Int** | Inclusive duration up to which audio is truncated, in milliseconds. If  the audio_end_ms is greater than the actual audio duration, the server  will respond with an error.  |  |
| **eventId** | **kotlin.String** | Optional client-generated ID used to identify this event. |  [optional] |


<a id="Type"></a>
## Enum: type
| Name | Value |
| ---- | ----- |
| type | conversation.item.truncate |



