# RealtimeServerEventResponseAudioTranscriptDone
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**EventId** | **String** | The unique ID of the server event. | 
**Type** | **String** | The event type, must be &#x60;response.audio_transcript.done&#x60;. | 
**ResponseId** | **String** | The ID of the response. | 
**ItemId** | **String** | The ID of the item. | 
**OutputIndex** | **Int32** | The index of the output item in the response. | 
**ContentIndex** | **Int32** | The index of the content part in the item&#39;s content array. | 
**Transcript** | **String** | The final transcript of the audio. | 

## Examples

- Prepare the resource
```powershell
$RealtimeServerEventResponseAudioTranscriptDone = Initialize-PSOpenAPIToolsRealtimeServerEventResponseAudioTranscriptDone  -EventId null `
 -Type null `
 -ResponseId null `
 -ItemId null `
 -OutputIndex null `
 -ContentIndex null `
 -Transcript null
```

- Convert the resource to JSON
```powershell
$RealtimeServerEventResponseAudioTranscriptDone | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

