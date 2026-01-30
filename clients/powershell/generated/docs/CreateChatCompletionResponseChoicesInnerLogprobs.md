# CreateChatCompletionResponseChoicesInnerLogprobs
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Content** | [**ChatCompletionTokenLogprob[]**](ChatCompletionTokenLogprob.md) | A list of message content tokens with log probability information. | 
**Refusal** | [**ChatCompletionTokenLogprob[]**](ChatCompletionTokenLogprob.md) | A list of message refusal tokens with log probability information. | 

## Examples

- Prepare the resource
```powershell
$CreateChatCompletionResponseChoicesInnerLogprobs = Initialize-PSOpenAPIToolsCreateChatCompletionResponseChoicesInnerLogprobs  -Content null `
 -Refusal null
```

- Convert the resource to JSON
```powershell
$CreateChatCompletionResponseChoicesInnerLogprobs | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

