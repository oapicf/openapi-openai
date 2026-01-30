# openapi::RealtimeServerEventConversationItemInputAudioTranscriptionFailed

Returned when input audio transcription is configured, and a transcription  request for a user message failed. These events are separate from other  `error` events so that the client can identify the related Item. 

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event_id** | **character** | The unique ID of the server event. | 
**type** | **character** | The event type, must be &#x60;conversation.item.input_audio_transcription.failed&#x60;.  | [Enum: [conversation.item.input_audio_transcription.failed]] 
**item_id** | **character** | The ID of the user message item. | 
**content_index** | **integer** | The index of the content part containing the audio. | 
**error** | [**RealtimeServerEventConversationItemInputAudioTranscriptionFailedError**](RealtimeServerEventConversationItemInputAudioTranscriptionFailed_error.md) |  | 


