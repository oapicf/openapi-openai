# RunStepDetailsToolCallsCodeObject
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **String** | The ID of the tool call. | 
**Type** | **String** | The type of tool call. This is always going to be &#x60;code_interpreter&#x60; for this type of tool call. | 
**CodeInterpreter** | [**RunStepDetailsToolCallsCodeObjectCodeInterpreter**](RunStepDetailsToolCallsCodeObjectCodeInterpreter.md) |  | 

## Examples

- Prepare the resource
```powershell
$RunStepDetailsToolCallsCodeObject = Initialize-PSOpenAPIToolsRunStepDetailsToolCallsCodeObject  -Id null `
 -Type null `
 -CodeInterpreter null
```

- Convert the resource to JSON
```powershell
$RunStepDetailsToolCallsCodeObject | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

