# RealtimeClientEventConversationItemTruncate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**eventId** | **String** | Optional client-generated ID used to identify this event. | [optional] 
**type** | **String** | The event type, must be &#x60;conversation.item.truncate&#x60;. | 
**itemId** | **String** | The ID of the assistant message item to truncate. Only assistant message  items can be truncated.  | 
**contentIndex** | **Int** | The index of the content part to truncate. Set this to 0. | 
**audioEndMs** | **Int** | Inclusive duration up to which audio is truncated, in milliseconds. If  the audio_end_ms is greater than the actual audio duration, the server  will respond with an error.  | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


