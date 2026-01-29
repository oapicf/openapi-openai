# RunStepDetailsToolCallsFunctionObject
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **String** | The ID of the tool call object. | 
**Type** | **String** | The type of tool call. This is always going to be &#x60;function&#x60; for this type of tool call. | 
**VarFunction** | [**RunStepDetailsToolCallsFunctionObjectFunction**](RunStepDetailsToolCallsFunctionObjectFunction.md) |  | 

## Examples

- Prepare the resource
```powershell
$RunStepDetailsToolCallsFunctionObject = Initialize-PSOpenAPIToolsRunStepDetailsToolCallsFunctionObject  -Id null `
 -Type null `
 -VarFunction null
```

- Convert the resource to JSON
```powershell
$RunStepDetailsToolCallsFunctionObject | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

