# RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Index** | **Int32** | The index of the output in the outputs array. | 
**Type** | **String** | Always &#x60;logs&#x60;. | 
**Logs** | **String** | The text output from the Code Interpreter tool call. | [optional] 

## Examples

- Prepare the resource
```powershell
$RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject = Initialize-PSOpenAPIToolsRunStepDeltaStepDetailsToolCallsCodeOutputLogsObject  -Index null `
 -Type null `
 -Logs null
```

- Convert the resource to JSON
```powershell
$RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

