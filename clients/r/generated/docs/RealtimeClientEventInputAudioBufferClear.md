# openapi::RealtimeClientEventInputAudioBufferClear

Send this event to clear the audio bytes in the buffer. The server will  respond with an `input_audio_buffer.cleared` event. 

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event_id** | **character** | Optional client-generated ID used to identify this event. | [optional] 
**type** | **character** | The event type, must be &#x60;input_audio_buffer.clear&#x60;. | [Enum: [input_audio_buffer.clear]] 


