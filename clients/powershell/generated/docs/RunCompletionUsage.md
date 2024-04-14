# RunCompletionUsage
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CompletionTokens** | **Int32** | Number of completion tokens used over the course of the run. | 
**PromptTokens** | **Int32** | Number of prompt tokens used over the course of the run. | 
**TotalTokens** | **Int32** | Total number of tokens used (prompt + completion). | 

## Examples

- Prepare the resource
```powershell
$RunCompletionUsage = Initialize-PSOpenAPIToolsRunCompletionUsage  -CompletionTokens null `
 -PromptTokens null `
 -TotalTokens null
```

- Convert the resource to JSON
```powershell
$RunCompletionUsage | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

