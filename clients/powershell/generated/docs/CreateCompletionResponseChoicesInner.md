# CreateCompletionResponseChoicesInner
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Text** | **String** |  | 
**Index** | **Int32** |  | 
**Logprobs** | [**CreateCompletionResponseChoicesInnerLogprobs**](CreateCompletionResponseChoicesInnerLogprobs.md) |  | 
**FinishReason** | **String** |  | 

## Examples

- Prepare the resource
```powershell
$CreateCompletionResponseChoicesInner = Initialize-PSOpenAPIToolsCreateCompletionResponseChoicesInner  -Text null `
 -Index null `
 -Logprobs null `
 -FinishReason null
```

- Convert the resource to JSON
```powershell
$CreateCompletionResponseChoicesInner | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

