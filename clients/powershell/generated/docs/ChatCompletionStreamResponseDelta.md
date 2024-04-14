# ChatCompletionStreamResponseDelta
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Content** | **String** | The contents of the chunk message. | [optional] 
**FunctionCall** | [**ChatCompletionStreamResponseDeltaFunctionCall**](ChatCompletionStreamResponseDeltaFunctionCall.md) |  | [optional] 
**ToolCalls** | [**ChatCompletionMessageToolCallChunk[]**](ChatCompletionMessageToolCallChunk.md) |  | [optional] 
**Role** | **String** | The role of the author of this message. | [optional] 

## Examples

- Prepare the resource
```powershell
$ChatCompletionStreamResponseDelta = Initialize-PSOpenAPIToolsChatCompletionStreamResponseDelta  -Content null `
 -FunctionCall null `
 -ToolCalls null `
 -Role null
```

- Convert the resource to JSON
```powershell
$ChatCompletionStreamResponseDelta | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

