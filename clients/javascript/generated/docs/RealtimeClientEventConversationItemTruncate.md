# OpenapiOpenai.RealtimeClientEventConversationItemTruncate

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**eventId** | **String** | Optional client-generated ID used to identify this event. | [optional] 
**type** | **String** | The event type, must be &#x60;conversation.item.truncate&#x60;. | 
**itemId** | **String** | The ID of the assistant message item to truncate. Only assistant message  items can be truncated.  | 
**contentIndex** | **Number** | The index of the content part to truncate. Set this to 0. | 
**audioEndMs** | **Number** | Inclusive duration up to which audio is truncated, in milliseconds. If  the audio_end_ms is greater than the actual audio duration, the server  will respond with an error.  | 



## Enum: TypeEnum


* `conversation.item.truncate` (value: `"conversation.item.truncate"`)




