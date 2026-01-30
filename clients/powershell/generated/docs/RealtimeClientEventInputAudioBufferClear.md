# RealtimeClientEventInputAudioBufferClear
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**EventId** | **String** | Optional client-generated ID used to identify this event. | [optional] 
**Type** | **String** | The event type, must be &#x60;input_audio_buffer.clear&#x60;. | 

## Examples

- Prepare the resource
```powershell
$RealtimeClientEventInputAudioBufferClear = Initialize-PSOpenAPIToolsRealtimeClientEventInputAudioBufferClear  -EventId null `
 -Type null
```

- Convert the resource to JSON
```powershell
$RealtimeClientEventInputAudioBufferClear | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

