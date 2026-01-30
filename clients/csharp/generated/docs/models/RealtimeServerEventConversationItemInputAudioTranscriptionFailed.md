# Org.OpenAPITools.Model.RealtimeServerEventConversationItemInputAudioTranscriptionFailed
Returned when input audio transcription is configured, and a transcription  request for a user message failed. These events are separate from other  `error` events so that the client can identify the related Item. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**EventId** | **string** | The unique ID of the server event. | 
**Type** | **string** | The event type, must be &#x60;conversation.item.input_audio_transcription.failed&#x60;.  | 
**ItemId** | **string** | The ID of the user message item. | 
**ContentIndex** | **int** | The index of the content part containing the audio. | 
**Error** | [**RealtimeServerEventConversationItemInputAudioTranscriptionFailedError**](RealtimeServerEventConversationItemInputAudioTranscriptionFailedError.md) |  | 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

