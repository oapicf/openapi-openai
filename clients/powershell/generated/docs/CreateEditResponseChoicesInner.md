# CreateEditResponseChoicesInner
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Text** | **String** |  | [optional] 
**Index** | **Int32** |  | [optional] 
**Logprobs** | [**CreateCompletionResponseChoicesInnerLogprobs**](CreateCompletionResponseChoicesInnerLogprobs.md) |  | [optional] 
**FinishReason** | **String** |  | [optional] 

## Examples

- Prepare the resource
```powershell
$CreateEditResponseChoicesInner = Initialize-PSOpenAPIToolsCreateEditResponseChoicesInner  -Text null `
 -Index null `
 -Logprobs null `
 -FinishReason null
```

- Convert the resource to JSON
```powershell
$CreateEditResponseChoicesInner | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

