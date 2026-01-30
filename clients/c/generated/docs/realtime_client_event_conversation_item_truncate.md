# realtime_client_event_conversation_item_truncate_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event_id** | **char \*** | Optional client-generated ID used to identify this event. | [optional] 
**type** | **openai_api_realtime_client_event_conversation_item_truncate_TYPE_e** | The event type, must be &#x60;conversation.item.truncate&#x60;. | 
**item_id** | **char \*** | The ID of the assistant message item to truncate. Only assistant message  items can be truncated.  | 
**content_index** | **int** | The index of the content part to truncate. Set this to 0. | 
**audio_end_ms** | **int** | Inclusive duration up to which audio is truncated, in milliseconds. If  the audio_end_ms is greater than the actual audio duration, the server  will respond with an error.  | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


