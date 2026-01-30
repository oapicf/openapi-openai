# RealtimeServerEventInputAudioBufferCommitted
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**EventId** | **String** | The unique ID of the server event. | 
**Type** | **String** | The event type, must be &#x60;input_audio_buffer.committed&#x60;. | 
**PreviousItemId** | **String** | The ID of the preceding item after which the new item will be inserted.  | 
**ItemId** | **String** | The ID of the user message item that will be created. | 

## Examples

- Prepare the resource
```powershell
$RealtimeServerEventInputAudioBufferCommitted = Initialize-PSOpenAPIToolsRealtimeServerEventInputAudioBufferCommitted  -EventId null `
 -Type null `
 -PreviousItemId null `
 -ItemId null
```

- Convert the resource to JSON
```powershell
$RealtimeServerEventInputAudioBufferCommitted | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

