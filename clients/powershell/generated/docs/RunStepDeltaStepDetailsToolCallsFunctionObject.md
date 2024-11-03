# RunStepDeltaStepDetailsToolCallsFunctionObject
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Index** | **Int32** | The index of the tool call in the tool calls array. | 
**Id** | **String** | The ID of the tool call object. | [optional] 
**Type** | **String** | The type of tool call. This is always going to be &#x60;function&#x60; for this type of tool call. | 
**VarFunction** | [**RunStepDeltaStepDetailsToolCallsFunctionObjectFunction**](RunStepDeltaStepDetailsToolCallsFunctionObjectFunction.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$RunStepDeltaStepDetailsToolCallsFunctionObject = Initialize-PSOpenAPIToolsRunStepDeltaStepDetailsToolCallsFunctionObject  -Index null `
 -Id null `
 -Type null `
 -VarFunction null
```

- Convert the resource to JSON
```powershell
$RunStepDeltaStepDetailsToolCallsFunctionObject | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

