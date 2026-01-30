

# RealtimeServerEventConversationItemInputAudioTranscriptionFailed

Returned when input audio transcription is configured, and a transcription  request for a user message failed. These events are separate from other  `error` events so that the client can identify the related Item. 

The class is defined in **[RealtimeServerEventConversationItemInputAudioTranscriptionFailed.java](../../src/main/java/org/openapitools/model/RealtimeServerEventConversationItemInputAudioTranscriptionFailed.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**eventId** | `String` | The unique ID of the server event. | 
**type** | [**TypeEnum**](#TypeEnum) | The event type, must be &#x60;conversation.item.input_audio_transcription.failed&#x60;.  | 
**itemId** | `String` | The ID of the user message item. | 
**contentIndex** | `Integer` | The index of the content part containing the audio. | 
**error** | [`RealtimeServerEventConversationItemInputAudioTranscriptionFailedError`](RealtimeServerEventConversationItemInputAudioTranscriptionFailedError.md) |  | 


## TypeEnum

Name | Value
---- | -----
CONVERSATION_ITEM_INPUT_AUDIO_TRANSCRIPTION_FAILED | `"conversation.item.input_audio_transcription.failed"`





