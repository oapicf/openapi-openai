# CreateCompletionResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **String** |  | 
**Object** | **String** |  | 
**Created** | **Int32** |  | 
**Model** | **String** |  | 
**Choices** | [**CreateCompletionResponseChoicesInner[]**](CreateCompletionResponseChoicesInner.md) |  | 
**Usage** | [**CreateCompletionResponseUsage**](CreateCompletionResponseUsage.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$CreateCompletionResponse = Initialize-PSOpenAPIToolsCreateCompletionResponse  -Id null `
 -Object null `
 -Created null `
 -Model null `
 -Choices null `
 -Usage null
```

- Convert the resource to JSON
```powershell
$CreateCompletionResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

