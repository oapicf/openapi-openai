# realtime_server_event_conversation_item_truncated_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event_id** | **char \*** | The unique ID of the server event. | 
**type** | **openai_api_realtime_server_event_conversation_item_truncated_TYPE_e** | The event type, must be &#x60;conversation.item.truncated&#x60;. | 
**item_id** | **char \*** | The ID of the assistant message item that was truncated. | 
**content_index** | **int** | The index of the content part that was truncated. | 
**audio_end_ms** | **int** | The duration up to which the audio was truncated, in milliseconds.  | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


