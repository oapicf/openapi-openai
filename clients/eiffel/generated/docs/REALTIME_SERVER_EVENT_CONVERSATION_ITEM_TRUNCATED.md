# REALTIME_SERVER_EVENT_CONVERSATION_ITEM_TRUNCATED

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event_id** | [**STRING_32**](STRING_32.md) | The unique ID of the server event. | [default to null]
**type** | [**STRING_32**](STRING_32.md) | The event type, must be &#x60;conversation.item.truncated&#x60;. | [default to null]
**item_id** | [**STRING_32**](STRING_32.md) | The ID of the assistant message item that was truncated. | [default to null]
**content_index** | **INTEGER_32** | The index of the content part that was truncated. | [default to null]
**audio_end_ms** | **INTEGER_32** | The duration up to which the audio was truncated, in milliseconds.  | [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


