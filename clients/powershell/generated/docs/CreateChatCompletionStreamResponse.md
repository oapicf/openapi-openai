# CreateChatCompletionStreamResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **String** |  | 
**Object** | **String** |  | 
**Created** | **Int32** |  | 
**Model** | **String** |  | 
**Choices** | [**CreateChatCompletionStreamResponseChoicesInner[]**](CreateChatCompletionStreamResponseChoicesInner.md) |  | 

## Examples

- Prepare the resource
```powershell
$CreateChatCompletionStreamResponse = Initialize-PSOpenAPIToolsCreateChatCompletionStreamResponse  -Id null `
 -Object null `
 -Created null `
 -Model null `
 -Choices null
```

- Convert the resource to JSON
```powershell
$CreateChatCompletionStreamResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

