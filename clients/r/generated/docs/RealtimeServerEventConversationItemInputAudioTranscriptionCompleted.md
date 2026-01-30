# openapi::RealtimeServerEventConversationItemInputAudioTranscriptionCompleted

This event is the output of audio transcription for user audio written to the  user audio buffer. Transcription begins when the input audio buffer is  committed by the client or server (in `server_vad` mode). Transcription runs  asynchronously with Response creation, so this event may come before or after  the Response events.  Realtime API models accept audio natively, and thus input transcription is a  separate process run on a separate ASR (Automatic Speech Recognition) model,  currently always `whisper-1`. Thus the transcript may diverge somewhat from  the model's interpretation, and should be treated as a rough guide. 

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event_id** | **character** | The unique ID of the server event. | 
**type** | **character** | The event type, must be &#x60;conversation.item.input_audio_transcription.completed&#x60;.  | [Enum: [conversation.item.input_audio_transcription.completed]] 
**item_id** | **character** | The ID of the user message item containing the audio. | 
**content_index** | **integer** | The index of the content part containing the audio. | 
**transcript** | **character** | The transcribed text. | 


