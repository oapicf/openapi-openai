# REALTIME_CLIENT_EVENT_CONVERSATION_ITEM_TRUNCATE

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event_id** | [**STRING_32**](STRING_32.md) | Optional client-generated ID used to identify this event. | [optional] [default to null]
**type** | [**STRING_32**](STRING_32.md) | The event type, must be &#x60;conversation.item.truncate&#x60;. | [default to null]
**item_id** | [**STRING_32**](STRING_32.md) | The ID of the assistant message item to truncate. Only assistant message  items can be truncated.  | [default to null]
**content_index** | **INTEGER_32** | The index of the content part to truncate. Set this to 0. | [default to null]
**audio_end_ms** | **INTEGER_32** | Inclusive duration up to which audio is truncated, in milliseconds. If  the audio_end_ms is greater than the actual audio duration, the server  will respond with an error.  | [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


