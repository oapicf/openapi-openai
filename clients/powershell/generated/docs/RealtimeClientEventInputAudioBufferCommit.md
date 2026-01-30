# RealtimeClientEventInputAudioBufferCommit
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**EventId** | **String** | Optional client-generated ID used to identify this event. | [optional] 
**Type** | **String** | The event type, must be &#x60;input_audio_buffer.commit&#x60;. | 

## Examples

- Prepare the resource
```powershell
$RealtimeClientEventInputAudioBufferCommit = Initialize-PSOpenAPIToolsRealtimeClientEventInputAudioBufferCommit  -EventId null `
 -Type null
```

- Convert the resource to JSON
```powershell
$RealtimeClientEventInputAudioBufferCommit | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

