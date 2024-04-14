# CreateCompletionResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **String** | A unique identifier for the completion. | 
**Choices** | [**CreateCompletionResponseChoicesInner[]**](CreateCompletionResponseChoicesInner.md) | The list of completion choices the model generated for the input prompt. | 
**Created** | **Int32** | The Unix timestamp (in seconds) of when the completion was created. | 
**Model** | **String** | The model used for completion. | 
**SystemFingerprint** | **String** | This fingerprint represents the backend configuration that the model runs with.  Can be used in conjunction with the &#x60;seed&#x60; request parameter to understand when backend changes have been made that might impact determinism.  | [optional] 
**Object** | **String** | The object type, which is always &quot;&quot;text_completion&quot;&quot; | 
**Usage** | [**CompletionUsage**](CompletionUsage.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$CreateCompletionResponse = Initialize-PSOpenAPIToolsCreateCompletionResponse  -Id null `
 -Choices null `
 -Created null `
 -Model null `
 -SystemFingerprint null `
 -Object null `
 -Usage null
```

- Convert the resource to JSON
```powershell
$CreateCompletionResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

