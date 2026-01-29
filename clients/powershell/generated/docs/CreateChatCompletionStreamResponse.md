# CreateChatCompletionStreamResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **String** | A unique identifier for the chat completion. Each chunk has the same ID. | 
**Choices** | [**CreateChatCompletionStreamResponseChoicesInner[]**](CreateChatCompletionStreamResponseChoicesInner.md) | A list of chat completion choices. Can be more than one if &#x60;n&#x60; is greater than 1. | 
**Created** | **Int32** | The Unix timestamp (in seconds) of when the chat completion was created. Each chunk has the same timestamp. | 
**Model** | **String** | The model to generate the completion. | 
**SystemFingerprint** | **String** | This fingerprint represents the backend configuration that the model runs with. Can be used in conjunction with the &#x60;seed&#x60; request parameter to understand when backend changes have been made that might impact determinism.  | [optional] 
**Object** | **String** | The object type, which is always &#x60;chat.completion.chunk&#x60;. | 

## Examples

- Prepare the resource
```powershell
$CreateChatCompletionStreamResponse = Initialize-PSOpenAPIToolsCreateChatCompletionStreamResponse  -Id null `
 -Choices null `
 -Created null `
 -Model null `
 -SystemFingerprint null `
 -Object null
```

- Convert the resource to JSON
```powershell
$CreateChatCompletionStreamResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

