# CreateEmbeddingResponseUsage
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**PromptTokens** | **Int32** | The number of tokens used by the prompt. | 
**TotalTokens** | **Int32** | The total number of tokens used by the request. | 

## Examples

- Prepare the resource
```powershell
$CreateEmbeddingResponseUsage = Initialize-PSOpenAPIToolsCreateEmbeddingResponseUsage  -PromptTokens null `
 -TotalTokens null
```

- Convert the resource to JSON
```powershell
$CreateEmbeddingResponseUsage | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

