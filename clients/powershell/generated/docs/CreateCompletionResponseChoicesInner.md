# CreateCompletionResponseChoicesInner
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**FinishReason** | **String** | The reason the model stopped generating tokens. This will be &#x60;stop&#x60; if the model hit a natural stop point or a provided stop sequence, &#x60;length&#x60; if the maximum number of tokens specified in the request was reached, or &#x60;content_filter&#x60; if content was omitted due to a flag from our content filters.  | 
**Index** | **Int32** |  | 
**Logprobs** | [**CreateCompletionResponseChoicesInnerLogprobs**](CreateCompletionResponseChoicesInnerLogprobs.md) |  | 
**Text** | **String** |  | 

## Examples

- Prepare the resource
```powershell
$CreateCompletionResponseChoicesInner = Initialize-PSOpenAPIToolsCreateCompletionResponseChoicesInner  -FinishReason null `
 -Index null `
 -Logprobs null `
 -Text null
```

- Convert the resource to JSON
```powershell
$CreateCompletionResponseChoicesInner | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

