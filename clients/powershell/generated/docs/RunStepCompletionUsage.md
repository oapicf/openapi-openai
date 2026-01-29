# RunStepCompletionUsage
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CompletionTokens** | **Int32** | Number of completion tokens used over the course of the run step. | 
**PromptTokens** | **Int32** | Number of prompt tokens used over the course of the run step. | 
**TotalTokens** | **Int32** | Total number of tokens used (prompt + completion). | 

## Examples

- Prepare the resource
```powershell
$RunStepCompletionUsage = Initialize-PSOpenAPIToolsRunStepCompletionUsage  -CompletionTokens null `
 -PromptTokens null `
 -TotalTokens null
```

- Convert the resource to JSON
```powershell
$RunStepCompletionUsage | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

