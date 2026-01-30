# CompletionUsagePromptTokensDetails
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AudioTokens** | **Int32** | Audio input tokens present in the prompt. | [optional] 
**CachedTokens** | **Int32** | Cached tokens present in the prompt. | [optional] 

## Examples

- Prepare the resource
```powershell
$CompletionUsagePromptTokensDetails = Initialize-PSOpenAPIToolsCompletionUsagePromptTokensDetails  -AudioTokens null `
 -CachedTokens null
```

- Convert the resource to JSON
```powershell
$CompletionUsagePromptTokensDetails | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

