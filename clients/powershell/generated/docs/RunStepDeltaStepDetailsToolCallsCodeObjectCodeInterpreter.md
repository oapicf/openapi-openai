# RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**VarInput** | **String** | The input to the Code Interpreter tool call. | [optional] 
**Outputs** | [**RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner[]**](RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner.md) | The outputs from the Code Interpreter tool call. Code Interpreter can output one or more items, including text (&#x60;logs&#x60;) or images (&#x60;image&#x60;). Each of these are represented by a different object type. | [optional] 

## Examples

- Prepare the resource
```powershell
$RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter = Initialize-PSOpenAPIToolsRunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter  -VarInput null `
 -Outputs null
```

- Convert the resource to JSON
```powershell
$RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

