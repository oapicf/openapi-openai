# RealtimeServerEventInputAudioBufferSpeechStopped
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**EventId** | **String** | The unique ID of the server event. | 
**Type** | **String** | The event type, must be &#x60;input_audio_buffer.speech_stopped&#x60;. | 
**AudioEndMs** | **Int32** | Milliseconds since the session started when speech stopped. This will  correspond to the end of audio sent to the model, and thus includes the  &#x60;min_silence_duration_ms&#x60; configured in the Session.  | 
**ItemId** | **String** | The ID of the user message item that will be created. | 

## Examples

- Prepare the resource
```powershell
$RealtimeServerEventInputAudioBufferSpeechStopped = Initialize-PSOpenAPIToolsRealtimeServerEventInputAudioBufferSpeechStopped  -EventId null `
 -Type null `
 -AudioEndMs null `
 -ItemId null
```

- Convert the resource to JSON
```powershell
$RealtimeServerEventInputAudioBufferSpeechStopped | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

