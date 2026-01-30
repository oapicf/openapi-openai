
# RealtimeServerEventResponseOutputItemAdded

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **eventId** | **kotlin.String** | The unique ID of the server event. |  |
| **type** | [**inline**](#Type) | The event type, must be &#x60;response.output_item.added&#x60;. |  |
| **responseId** | **kotlin.String** | The ID of the Response to which the item belongs. |  |
| **outputIndex** | **kotlin.Int** | The index of the output item in the Response. |  |
| **item** | [**RealtimeConversationItem**](RealtimeConversationItem.md) |  |  |


<a id="Type"></a>
## Enum: type
| Name | Value |
| ---- | ----- |
| type | response.output_item.added |



