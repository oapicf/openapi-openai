# RunToolCallObject
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **String** | The ID of the tool call. This ID must be referenced when you submit the tool outputs in using the [Submit tool outputs to run](/docs/api-reference/runs/submitToolOutputs) endpoint. | 
**Type** | **String** | The type of tool call the output is required for. For now, this is always &#x60;function&#x60;. | 
**VarFunction** | [**RunToolCallObjectFunction**](RunToolCallObjectFunction.md) |  | 

## Examples

- Prepare the resource
```powershell
$RunToolCallObject = Initialize-PSOpenAPIToolsRunToolCallObject  -Id null `
 -Type null `
 -VarFunction null
```

- Convert the resource to JSON
```powershell
$RunToolCallObject | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

