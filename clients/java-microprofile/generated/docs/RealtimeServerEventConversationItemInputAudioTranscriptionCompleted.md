

# RealtimeServerEventConversationItemInputAudioTranscriptionCompleted

This event is the output of audio transcription for user audio written to the  user audio buffer. Transcription begins when the input audio buffer is  committed by the client or server (in `server_vad` mode). Transcription runs  asynchronously with Response creation, so this event may come before or after  the Response events.  Realtime API models accept audio natively, and thus input transcription is a  separate process run on a separate ASR (Automatic Speech Recognition) model,  currently always `whisper-1`. Thus the transcript may diverge somewhat from  the model's interpretation, and should be treated as a rough guide. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**eventId** | **String** | The unique ID of the server event. |  |
|**type** | [**TypeEnum**](#TypeEnum) | The event type, must be &#x60;conversation.item.input_audio_transcription.completed&#x60;.  |  |
|**itemId** | **String** | The ID of the user message item containing the audio. |  |
|**contentIndex** | **Integer** | The index of the content part containing the audio. |  |
|**transcript** | **String** | The transcribed text. |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| CONVERSATION_ITEM_INPUT_AUDIO_TRANSCRIPTION_COMPLETED | &quot;conversation.item.input_audio_transcription.completed&quot; |



