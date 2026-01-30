# ChatCompletionRequestUserMessageContentPart
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | **String** | The type of the content part. | 
**Text** | **String** | The text content. | 
**ImageUrl** | [**ChatCompletionRequestMessageContentPartImageImageUrl**](ChatCompletionRequestMessageContentPartImageImageUrl.md) |  | 
**InputAudio** | [**ChatCompletionRequestMessageContentPartAudioInputAudio**](ChatCompletionRequestMessageContentPartAudioInputAudio.md) |  | 

## Examples

- Prepare the resource
```powershell
$ChatCompletionRequestUserMessageContentPart = Initialize-PSOpenAPIToolsChatCompletionRequestUserMessageContentPart  -Type null `
 -Text null `
 -ImageUrl null `
 -InputAudio null
```

- Convert the resource to JSON
```powershell
$ChatCompletionRequestUserMessageContentPart | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

