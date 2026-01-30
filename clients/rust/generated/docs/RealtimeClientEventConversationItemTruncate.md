# RealtimeClientEventConversationItemTruncate

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event_id** | Option<**String**> | Optional client-generated ID used to identify this event. | [optional]
**r#type** | **String** | The event type, must be `conversation.item.truncate`. | 
**item_id** | **String** | The ID of the assistant message item to truncate. Only assistant message  items can be truncated.  | 
**content_index** | **i32** | The index of the content part to truncate. Set this to 0. | 
**audio_end_ms** | **i32** | Inclusive duration up to which audio is truncated, in milliseconds. If  the audio_end_ms is greater than the actual audio duration, the server  will respond with an error.  | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


