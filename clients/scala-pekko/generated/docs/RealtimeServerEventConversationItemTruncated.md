

# RealtimeServerEventConversationItemTruncated

Returned when an earlier assistant audio message item is truncated by the  client with a `conversation.item.truncate` event. This event is used to  synchronize the server's understanding of the audio with the client's playback.  This action will truncate the audio and remove the server-side text transcript  to ensure there is no text in the context that hasn't been heard by the user. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**eventId** | **String** | The unique ID of the server event. | 
**`type`** | [**`Type`**](#`Type`) | The event type, must be &#x60;conversation.item.truncated&#x60;. | 
**itemId** | **String** | The ID of the assistant message item that was truncated. | 
**contentIndex** | **Int** | The index of the content part that was truncated. | 
**audioEndMs** | **Int** | The duration up to which the audio was truncated, in milliseconds.  | 


## Enum: `Type`
Allowed values: [conversation.item.truncated]




