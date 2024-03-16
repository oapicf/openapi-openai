# ChatCompletionResponseMessage
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Role** | **String** | The role of the author of this message. | 
**Content** | **String** | The contents of the message. | [optional] 
**FunctionCall** | [**ChatCompletionRequestMessageFunctionCall**](ChatCompletionRequestMessageFunctionCall.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ChatCompletionResponseMessage = Initialize-PSOpenAPIToolsChatCompletionResponseMessage  -Role null `
 -Content null `
 -FunctionCall null
```

- Convert the resource to JSON
```powershell
$ChatCompletionResponseMessage | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

