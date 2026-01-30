# RealtimeServerEventConversationItemInputAudioTranscriptionFailed
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**EventId** | **String** | The unique ID of the server event. | 
**Type** | **String** | The event type, must be &#x60;conversation.item.input_audio_transcription.failed&#x60;.  | 
**ItemId** | **String** | The ID of the user message item. | 
**ContentIndex** | **Int32** | The index of the content part containing the audio. | 
**VarError** | [**RealtimeServerEventConversationItemInputAudioTranscriptionFailedError**](RealtimeServerEventConversationItemInputAudioTranscriptionFailedError.md) |  | 

## Examples

- Prepare the resource
```powershell
$RealtimeServerEventConversationItemInputAudioTranscriptionFailed = Initialize-PSOpenAPIToolsRealtimeServerEventConversationItemInputAudioTranscriptionFailed  -EventId null `
 -Type null `
 -ItemId null `
 -ContentIndex null `
 -VarError null
```

- Convert the resource to JSON
```powershell
$RealtimeServerEventConversationItemInputAudioTranscriptionFailed | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

