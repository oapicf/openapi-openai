# RealtimeServerEventConversationItemTruncated


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**`event_id`** | **`String`** | The unique ID of the server event. | [default to nothing]
**`type`** | **`String`** | The event type, must be &#x60;conversation.item.truncated&#x60;. | [default to nothing]
**`item_id`** | **`String`** | The ID of the assistant message item that was truncated. | [default to nothing]
**`content_index`** | **`Int64`** | The index of the content part that was truncated. | [default to nothing]
**`audio_end_ms`** | **`Int64`** | The duration up to which the audio was truncated, in milliseconds.  | [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


