# OpenapiOpenai.RealtimeServerEventConversationItemTruncated

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**eventId** | **String** | The unique ID of the server event. | 
**type** | **String** | The event type, must be &#x60;conversation.item.truncated&#x60;. | 
**itemId** | **String** | The ID of the assistant message item that was truncated. | 
**contentIndex** | **Number** | The index of the content part that was truncated. | 
**audioEndMs** | **Number** | The duration up to which the audio was truncated, in milliseconds.  | 



## Enum: TypeEnum


* `conversation.item.truncated` (value: `"conversation.item.truncated"`)




