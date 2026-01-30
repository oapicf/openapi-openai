# CreateChatCompletionStreamResponseUsage
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CompletionTokens** | **Int32** | Number of tokens in the generated completion. | 
**PromptTokens** | **Int32** | Number of tokens in the prompt. | 
**TotalTokens** | **Int32** | Total number of tokens used in the request (prompt + completion). | 

## Examples

- Prepare the resource
```powershell
$CreateChatCompletionStreamResponseUsage = Initialize-PSOpenAPIToolsCreateChatCompletionStreamResponseUsage  -CompletionTokens null `
 -PromptTokens null `
 -TotalTokens null
```

- Convert the resource to JSON
```powershell
$CreateChatCompletionStreamResponseUsage | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

