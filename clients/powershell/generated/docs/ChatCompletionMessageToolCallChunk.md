# ChatCompletionMessageToolCallChunk
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Index** | **Int32** |  | 
**Id** | **String** | The ID of the tool call. | [optional] 
**Type** | **String** | The type of the tool. Currently, only &#x60;function&#x60; is supported. | [optional] 
**VarFunction** | [**ChatCompletionMessageToolCallChunkFunction**](ChatCompletionMessageToolCallChunkFunction.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ChatCompletionMessageToolCallChunk = Initialize-PSOpenAPIToolsChatCompletionMessageToolCallChunk  -Index null `
 -Id null `
 -Type null `
 -VarFunction null
```

- Convert the resource to JSON
```powershell
$ChatCompletionMessageToolCallChunk | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

