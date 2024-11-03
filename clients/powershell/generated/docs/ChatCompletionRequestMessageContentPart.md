# ChatCompletionRequestMessageContentPart
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | **String** | The type of the content part. | 
**Text** | **String** | The text content. | 
**ImageUrl** | [**ChatCompletionRequestMessageContentPartImageImageUrl**](ChatCompletionRequestMessageContentPartImageImageUrl.md) |  | 

## Examples

- Prepare the resource
```powershell
$ChatCompletionRequestMessageContentPart = Initialize-PSOpenAPIToolsChatCompletionRequestMessageContentPart  -Type null `
 -Text null `
 -ImageUrl null
```

- Convert the resource to JSON
```powershell
$ChatCompletionRequestMessageContentPart | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

