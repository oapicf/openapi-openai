# CreateChatCompletionResponseChoicesInner
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Index** | **Int32** |  | [optional] 
**Message** | [**ChatCompletionResponseMessage**](ChatCompletionResponseMessage.md) |  | [optional] 
**FinishReason** | **String** |  | [optional] 

## Examples

- Prepare the resource
```powershell
$CreateChatCompletionResponseChoicesInner = Initialize-PSOpenAPIToolsCreateChatCompletionResponseChoicesInner  -Index null `
 -Message null `
 -FinishReason null
```

- Convert the resource to JSON
```powershell
$CreateChatCompletionResponseChoicesInner | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

