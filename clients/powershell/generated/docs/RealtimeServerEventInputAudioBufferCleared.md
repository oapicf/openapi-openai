# RealtimeServerEventInputAudioBufferCleared
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**EventId** | **String** | The unique ID of the server event. | 
**Type** | **String** | The event type, must be &#x60;input_audio_buffer.cleared&#x60;. | 

## Examples

- Prepare the resource
```powershell
$RealtimeServerEventInputAudioBufferCleared = Initialize-PSOpenAPIToolsRealtimeServerEventInputAudioBufferCleared  -EventId null `
 -Type null
```

- Convert the resource to JSON
```powershell
$RealtimeServerEventInputAudioBufferCleared | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

