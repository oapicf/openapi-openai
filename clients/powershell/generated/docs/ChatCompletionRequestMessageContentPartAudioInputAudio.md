# ChatCompletionRequestMessageContentPartAudioInputAudio
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**VarData** | **String** | Base64 encoded audio data. | 
**Format** | **String** | The format of the encoded audio data. Currently supports &quot;&quot;wav&quot;&quot; and &quot;&quot;mp3&quot;&quot;.  | 

## Examples

- Prepare the resource
```powershell
$ChatCompletionRequestMessageContentPartAudioInputAudio = Initialize-PSOpenAPIToolsChatCompletionRequestMessageContentPartAudioInputAudio  -VarData null `
 -Format null
```

- Convert the resource to JSON
```powershell
$ChatCompletionRequestMessageContentPartAudioInputAudio | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

