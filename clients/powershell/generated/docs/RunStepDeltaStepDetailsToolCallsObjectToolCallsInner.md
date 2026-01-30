# RunStepDeltaStepDetailsToolCallsObjectToolCallsInner
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Index** | **Int32** | The index of the tool call in the tool calls array. | 
**Id** | **String** | The ID of the tool call object. | [optional] 
**Type** | **String** | The type of tool call. This is always going to be &#x60;code_interpreter&#x60; for this type of tool call. | 
**CodeInterpreter** | [**RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter**](RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter.md) |  | [optional] 
**FileSearch** | [**SystemCollectionsHashtable**](.md) | For now, this is always going to be an empty object. | 
**VarFunction** | [**RunStepDeltaStepDetailsToolCallsFunctionObjectFunction**](RunStepDeltaStepDetailsToolCallsFunctionObjectFunction.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$RunStepDeltaStepDetailsToolCallsObjectToolCallsInner = Initialize-PSOpenAPIToolsRunStepDeltaStepDetailsToolCallsObjectToolCallsInner  -Index null `
 -Id null `
 -Type null `
 -CodeInterpreter null `
 -FileSearch null `
 -VarFunction null
```

- Convert the resource to JSON
```powershell
$RunStepDeltaStepDetailsToolCallsObjectToolCallsInner | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

