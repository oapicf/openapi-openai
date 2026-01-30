# RealtimeServerEventConversationItemTruncated

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event_id** | **String** | The unique ID of the server event. | 
**r#type** | **String** | The event type, must be `conversation.item.truncated`. | 
**item_id** | **String** | The ID of the assistant message item that was truncated. | 
**content_index** | **i32** | The index of the content part that was truncated. | 
**audio_end_ms** | **i32** | The duration up to which the audio was truncated, in milliseconds.  | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


