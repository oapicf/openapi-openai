# openapi::RealtimeServerEventConversationItemTruncated

Returned when an earlier assistant audio message item is truncated by the  client with a `conversation.item.truncate` event. This event is used to  synchronize the server's understanding of the audio with the client's playback.  This action will truncate the audio and remove the server-side text transcript  to ensure there is no text in the context that hasn't been heard by the user. 

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event_id** | **character** | The unique ID of the server event. | 
**type** | **character** | The event type, must be &#x60;conversation.item.truncated&#x60;. | [Enum: [conversation.item.truncated]] 
**item_id** | **character** | The ID of the assistant message item that was truncated. | 
**content_index** | **integer** | The index of the content part that was truncated. | 
**audio_end_ms** | **integer** | The duration up to which the audio was truncated, in milliseconds.  | 


