# ChatCompletionRequestMessageContentPartAudio
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | **String** | The type of the content part. Always &#x60;input_audio&#x60;. | 
**InputAudio** | [**ChatCompletionRequestMessageContentPartAudioInputAudio**](ChatCompletionRequestMessageContentPartAudioInputAudio.md) |  | 

## Examples

- Prepare the resource
```powershell
$ChatCompletionRequestMessageContentPartAudio = Initialize-PSOpenAPIToolsChatCompletionRequestMessageContentPartAudio  -Type null `
 -InputAudio null
```

- Convert the resource to JSON
```powershell
$ChatCompletionRequestMessageContentPartAudio | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

