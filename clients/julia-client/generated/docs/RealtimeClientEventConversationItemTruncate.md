# RealtimeClientEventConversationItemTruncate


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**`event_id`** | **`String`** | Optional client-generated ID used to identify this event. | [optional] [default to nothing]
**`type`** | **`String`** | The event type, must be &#x60;conversation.item.truncate&#x60;. | [default to nothing]
**`item_id`** | **`String`** | The ID of the assistant message item to truncate. Only assistant message  items can be truncated.  | [default to nothing]
**`content_index`** | **`Int64`** | The index of the content part to truncate. Set this to 0. | [default to nothing]
**`audio_end_ms`** | **`Int64`** | Inclusive duration up to which audio is truncated, in milliseconds. If  the audio_end_ms is greater than the actual audio duration, the server  will respond with an error.  | [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


