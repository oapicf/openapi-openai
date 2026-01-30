
# RealtimeServerEventConversationItemInputAudioTranscriptionCompleted

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **eventId** | **kotlin.String** | The unique ID of the server event. |  |
| **type** | [**inline**](#Type) | The event type, must be &#x60;conversation.item.input_audio_transcription.completed&#x60;.  |  |
| **itemId** | **kotlin.String** | The ID of the user message item containing the audio. |  |
| **contentIndex** | **kotlin.Int** | The index of the content part containing the audio. |  |
| **transcript** | **kotlin.String** | The transcribed text. |  |


<a id="Type"></a>
## Enum: type
| Name | Value |
| ---- | ----- |
| type | conversation.item.input_audio_transcription.completed |



