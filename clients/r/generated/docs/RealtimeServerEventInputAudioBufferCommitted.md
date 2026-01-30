# openapi::RealtimeServerEventInputAudioBufferCommitted

Returned when an input audio buffer is committed, either by the client or  automatically in server VAD mode. The `item_id` property is the ID of the user message item that will be created, thus a `conversation.item.created` event  will also be sent to the client. 

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event_id** | **character** | The unique ID of the server event. | 
**type** | **character** | The event type, must be &#x60;input_audio_buffer.committed&#x60;. | [Enum: [input_audio_buffer.committed]] 
**previous_item_id** | **character** | The ID of the preceding item after which the new item will be inserted.  | 
**item_id** | **character** | The ID of the user message item that will be created. | 


