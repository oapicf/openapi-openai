# CreateChatCompletionStreamResponseChoicesInner
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Index** | **Int32** |  | [optional] 
**Delta** | [**ChatCompletionStreamResponseDelta**](ChatCompletionStreamResponseDelta.md) |  | [optional] 
**FinishReason** | **String** |  | [optional] 

## Examples

- Prepare the resource
```powershell
$CreateChatCompletionStreamResponseChoicesInner = Initialize-PSOpenAPIToolsCreateChatCompletionStreamResponseChoicesInner  -Index null `
 -Delta null `
 -FinishReason null
```

- Convert the resource to JSON
```powershell
$CreateChatCompletionStreamResponseChoicesInner | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

