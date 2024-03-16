# ChatCompletionStreamResponseDelta
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Role** | **String** | The role of the author of this message. | [optional] 
**Content** | **String** | The contents of the chunk message. | [optional] 
**FunctionCall** | [**ChatCompletionRequestMessageFunctionCall**](ChatCompletionRequestMessageFunctionCall.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ChatCompletionStreamResponseDelta = Initialize-PSOpenAPIToolsChatCompletionStreamResponseDelta  -Role null `
 -Content null `
 -FunctionCall null
```

- Convert the resource to JSON
```powershell
$ChatCompletionStreamResponseDelta | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

