# openapi::RealtimeClientEventConversationItemTruncate

Send this event to truncate a previous assistant message’s audio. The server  will produce audio faster than realtime, so this event is useful when the user  interrupts to truncate audio that has already been sent to the client but not  yet played. This will synchronize the server's understanding of the audio with  the client's playback.  Truncating audio will delete the server-side text transcript to ensure there  is not text in the context that hasn't been heard by the user.  If successful, the server will respond with a `conversation.item.truncated`  event.  

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event_id** | **character** | Optional client-generated ID used to identify this event. | [optional] 
**type** | **character** | The event type, must be &#x60;conversation.item.truncate&#x60;. | [Enum: [conversation.item.truncate]] 
**item_id** | **character** | The ID of the assistant message item to truncate. Only assistant message  items can be truncated.  | 
**content_index** | **integer** | The index of the content part to truncate. Set this to 0. | 
**audio_end_ms** | **integer** | Inclusive duration up to which audio is truncated, in milliseconds. If  the audio_end_ms is greater than the actual audio duration, the server  will respond with an error.  | 


