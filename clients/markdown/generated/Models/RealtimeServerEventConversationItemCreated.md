# RealtimeServerEventConversationItemCreated
## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **event\_id** | **String** | The unique ID of the server event. | [default to null] |
| **type** | **String** | The event type, must be &#x60;conversation.item.created&#x60;. | [default to null] |
| **previous\_item\_id** | **String** | The ID of the preceding item in the Conversation context, allows the  client to understand the order of the conversation.  | [default to null] |
| **item** | [**RealtimeConversationItem**](RealtimeConversationItem.md) |  | [default to null] |

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

