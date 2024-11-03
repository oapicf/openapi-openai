# RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | **String** | Always &#x60;logs&#x60;. | 
**Logs** | **String** | The text output from the Code Interpreter tool call. | 
**Image** | [**RunStepDetailsToolCallsCodeOutputImageObjectImage**](RunStepDetailsToolCallsCodeOutputImageObjectImage.md) |  | 

## Examples

- Prepare the resource
```powershell
$RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner = Initialize-PSOpenAPIToolsRunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner  -Type null `
 -Logs null `
 -Image null
```

- Convert the resource to JSON
```powershell
$RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

