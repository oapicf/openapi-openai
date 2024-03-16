# CreateCompletionResponseUsage
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**PromptTokens** | **Int32** |  | 
**CompletionTokens** | **Int32** |  | 
**TotalTokens** | **Int32** |  | 

## Examples

- Prepare the resource
```powershell
$CreateCompletionResponseUsage = Initialize-PSOpenAPIToolsCreateCompletionResponseUsage  -PromptTokens null `
 -CompletionTokens null `
 -TotalTokens null
```

- Convert the resource to JSON
```powershell
$CreateCompletionResponseUsage | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

