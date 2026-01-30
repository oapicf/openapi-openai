# CompletionUsage
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CompletionTokens** | **Int32** | Number of tokens in the generated completion. | 
**PromptTokens** | **Int32** | Number of tokens in the prompt. | 
**TotalTokens** | **Int32** | Total number of tokens used in the request (prompt + completion). | 
**CompletionTokensDetails** | [**CompletionUsageCompletionTokensDetails**](CompletionUsageCompletionTokensDetails.md) |  | [optional] 
**PromptTokensDetails** | [**CompletionUsagePromptTokensDetails**](CompletionUsagePromptTokensDetails.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$CompletionUsage = Initialize-PSOpenAPIToolsCompletionUsage  -CompletionTokens null `
 -PromptTokens null `
 -TotalTokens null `
 -CompletionTokensDetails null `
 -PromptTokensDetails null
```

- Convert the resource to JSON
```powershell
$CompletionUsage | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

