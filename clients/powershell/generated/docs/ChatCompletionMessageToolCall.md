# ChatCompletionMessageToolCall
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **String** | The ID of the tool call. | 
**Type** | **String** | The type of the tool. Currently, only &#x60;function&#x60; is supported. | 
**VarFunction** | [**ChatCompletionMessageToolCallFunction**](ChatCompletionMessageToolCallFunction.md) |  | 

## Examples

- Prepare the resource
```powershell
$ChatCompletionMessageToolCall = Initialize-PSOpenAPIToolsChatCompletionMessageToolCall  -Id null `
 -Type null `
 -VarFunction null
```

- Convert the resource to JSON
```powershell
$ChatCompletionMessageToolCall | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

