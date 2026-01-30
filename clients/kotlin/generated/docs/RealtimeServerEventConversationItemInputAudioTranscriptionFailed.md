
# RealtimeServerEventConversationItemInputAudioTranscriptionFailed

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **eventId** | **kotlin.String** | The unique ID of the server event. |  |
| **type** | [**inline**](#Type) | The event type, must be &#x60;conversation.item.input_audio_transcription.failed&#x60;.  |  |
| **itemId** | **kotlin.String** | The ID of the user message item. |  |
| **contentIndex** | **kotlin.Int** | The index of the content part containing the audio. |  |
| **error** | [**RealtimeServerEventConversationItemInputAudioTranscriptionFailedError**](RealtimeServerEventConversationItemInputAudioTranscriptionFailedError.md) |  |  |


<a id="Type"></a>
## Enum: type
| Name | Value |
| ---- | ----- |
| type | conversation.item.input_audio_transcription.failed |



