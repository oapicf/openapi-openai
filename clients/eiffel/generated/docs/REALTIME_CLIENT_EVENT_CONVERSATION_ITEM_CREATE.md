# REALTIME_CLIENT_EVENT_CONVERSATION_ITEM_CREATE

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event_id** | [**STRING_32**](STRING_32.md) | Optional client-generated ID used to identify this event. | [optional] [default to null]
**type** | [**STRING_32**](STRING_32.md) | The event type, must be &#x60;conversation.item.create&#x60;. | [default to null]
**previous_item_id** | [**STRING_32**](STRING_32.md) | The ID of the preceding item after which the new item will be inserted.  If not set, the new item will be appended to the end of the conversation.  If set, it allows an item to be inserted mid-conversation. If the ID  cannot be found, an error will be returned and the item will not be added.  | [optional] [default to null]
**item** | [**REALTIME_CONVERSATION_ITEM**](RealtimeConversationItem.md) |  | [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


