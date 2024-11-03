# CreateChatCompletionFunctionResponseChoicesInner
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**FinishReason** | **String** | The reason the model stopped generating tokens. This will be &#x60;stop&#x60; if the model hit a natural stop point or a provided stop sequence, &#x60;length&#x60; if the maximum number of tokens specified in the request was reached, &#x60;content_filter&#x60; if content was omitted due to a flag from our content filters, or &#x60;function_call&#x60; if the model called a function.  | 
**Index** | **Int32** | The index of the choice in the list of choices. | 
**Message** | [**ChatCompletionResponseMessage**](ChatCompletionResponseMessage.md) |  | 

## Examples

- Prepare the resource
```powershell
$CreateChatCompletionFunctionResponseChoicesInner = Initialize-PSOpenAPIToolsCreateChatCompletionFunctionResponseChoicesInner  -FinishReason null `
 -Index null `
 -Message null
```

- Convert the resource to JSON
```powershell
$CreateChatCompletionFunctionResponseChoicesInner | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

