# RealtimeClientEventInputAudioBufferAppend
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**EventId** | **String** | Optional client-generated ID used to identify this event. | [optional] 
**Type** | **String** | The event type, must be &#x60;input_audio_buffer.append&#x60;. | 
**Audio** | **String** | Base64-encoded audio bytes. This must be in the format specified by the  &#x60;input_audio_format&#x60; field in the session configuration.  | 

## Examples

- Prepare the resource
```powershell
$RealtimeClientEventInputAudioBufferAppend = Initialize-PSOpenAPIToolsRealtimeClientEventInputAudioBufferAppend  -EventId null `
 -Type null `
 -Audio null
```

- Convert the resource to JSON
```powershell
$RealtimeClientEventInputAudioBufferAppend | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

