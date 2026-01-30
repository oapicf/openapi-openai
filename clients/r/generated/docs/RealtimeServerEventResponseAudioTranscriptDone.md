# openapi::RealtimeServerEventResponseAudioTranscriptDone

Returned when the model-generated transcription of audio output is done streaming. Also emitted when a Response is interrupted, incomplete, or cancelled. 

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event_id** | **character** | The unique ID of the server event. | 
**type** | **character** | The event type, must be &#x60;response.audio_transcript.done&#x60;. | [Enum: [response.audio_transcript.done]] 
**response_id** | **character** | The ID of the response. | 
**item_id** | **character** | The ID of the item. | 
**output_index** | **integer** | The index of the output item in the response. | 
**content_index** | **integer** | The index of the content part in the item&#39;s content array. | 
**transcript** | **character** | The final transcript of the audio. | 


