# RealtimeServerEventConversationItemInputAudioTranscriptionCompleted

This event is the output of audio transcription for user audio written to the  user audio buffer. Transcription begins when the input audio buffer is  committed by the client or server (in `server_vad` mode). Transcription runs  asynchronously with Response creation, so this event may come before or after  the Response events.  Realtime API models accept audio natively, and thus input transcription is a  separate process run on a separate ASR (Automatic Speech Recognition) model,  currently always `whisper-1`. Thus the transcript may diverge somewhat from  the model\'s interpretation, and should be treated as a rough guide. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event_id** | **string** | The unique ID of the server event. | [default to undefined]
**type** | **string** | The event type, must be &#x60;conversation.item.input_audio_transcription.completed&#x60;.  | [default to undefined]
**item_id** | **string** | The ID of the user message item containing the audio. | [default to undefined]
**content_index** | **number** | The index of the content part containing the audio. | [default to undefined]
**transcript** | **string** | The transcribed text. | [default to undefined]

## Example

```typescript
import { RealtimeServerEventConversationItemInputAudioTranscriptionCompleted } from './api';

const instance: RealtimeServerEventConversationItemInputAudioTranscriptionCompleted = {
    event_id,
    type,
    item_id,
    content_index,
    transcript,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
