# RealtimeServerEventInputAudioBufferSpeechStarted
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**EventId** | **String** | The unique ID of the server event. | 
**Type** | **String** | The event type, must be &#x60;input_audio_buffer.speech_started&#x60;. | 
**AudioStartMs** | **Int32** | Milliseconds from the start of all audio written to the buffer during the  session when speech was first detected. This will correspond to the  beginning of audio sent to the model, and thus includes the  &#x60;prefix_padding_ms&#x60; configured in the Session.  | 
**ItemId** | **String** | The ID of the user message item that will be created when speech stops.  | 

## Examples

- Prepare the resource
```powershell
$RealtimeServerEventInputAudioBufferSpeechStarted = Initialize-PSOpenAPIToolsRealtimeServerEventInputAudioBufferSpeechStarted  -EventId null `
 -Type null `
 -AudioStartMs null `
 -ItemId null
```

- Convert the resource to JSON
```powershell
$RealtimeServerEventInputAudioBufferSpeechStarted | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

