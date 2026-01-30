# REALTIME_SERVER_EVENT_CONVERSATION_ITEM_CREATED

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event_id** | [**STRING_32**](STRING_32.md) | The unique ID of the server event. | [default to null]
**type** | [**STRING_32**](STRING_32.md) | The event type, must be &#x60;conversation.item.created&#x60;. | [default to null]
**previous_item_id** | [**STRING_32**](STRING_32.md) | The ID of the preceding item in the Conversation context, allows the  client to understand the order of the conversation.  | [default to null]
**item** | [**REALTIME_CONVERSATION_ITEM**](RealtimeConversationItem.md) |  | [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


