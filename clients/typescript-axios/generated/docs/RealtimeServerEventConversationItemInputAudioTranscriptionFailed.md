# RealtimeServerEventConversationItemInputAudioTranscriptionFailed

Returned when input audio transcription is configured, and a transcription  request for a user message failed. These events are separate from other  `error` events so that the client can identify the related Item. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event_id** | **string** | The unique ID of the server event. | [default to undefined]
**type** | **string** | The event type, must be &#x60;conversation.item.input_audio_transcription.failed&#x60;.  | [default to undefined]
**item_id** | **string** | The ID of the user message item. | [default to undefined]
**content_index** | **number** | The index of the content part containing the audio. | [default to undefined]
**error** | [**RealtimeServerEventConversationItemInputAudioTranscriptionFailedError**](RealtimeServerEventConversationItemInputAudioTranscriptionFailedError.md) |  | [default to undefined]

## Example

```typescript
import { RealtimeServerEventConversationItemInputAudioTranscriptionFailed } from './api';

const instance: RealtimeServerEventConversationItemInputAudioTranscriptionFailed = {
    event_id,
    type,
    item_id,
    content_index,
    error,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
