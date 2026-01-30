# RealtimeServerEventResponseAudioDone
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**EventId** | **String** | The unique ID of the server event. | 
**Type** | **String** | The event type, must be &#x60;response.audio.done&#x60;. | 
**ResponseId** | **String** | The ID of the response. | 
**ItemId** | **String** | The ID of the item. | 
**OutputIndex** | **Int32** | The index of the output item in the response. | 
**ContentIndex** | **Int32** | The index of the content part in the item&#39;s content array. | 

## Examples

- Prepare the resource
```powershell
$RealtimeServerEventResponseAudioDone = Initialize-PSOpenAPIToolsRealtimeServerEventResponseAudioDone  -EventId null `
 -Type null `
 -ResponseId null `
 -ItemId null `
 -OutputIndex null `
 -ContentIndex null
```

- Convert the resource to JSON
```powershell
$RealtimeServerEventResponseAudioDone | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

