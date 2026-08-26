# RealtimeServerEventConversationItemCreated


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**`event_id`** | **`String`** | The unique ID of the server event. | [default to nothing]
**`type`** | **`String`** | The event type, must be &#x60;conversation.item.created&#x60;. | [default to nothing]
**`previous_item_id`** | **`String`** | The ID of the preceding item in the Conversation context, allows the  client to understand the order of the conversation.  | [default to nothing]
**`item`** | [**`*RealtimeConversationItem`**](RealtimeConversationItem.md) |  | [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


