# RunStepDetailsToolCallsCodeObjectCodeInterpreter
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**VarInput** | **String** | The input to the Code Interpreter tool call. | 
**Outputs** | [**RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner[]**](RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner.md) | The outputs from the Code Interpreter tool call. Code Interpreter can output one or more items, including text (&#x60;logs&#x60;) or images (&#x60;image&#x60;). Each of these are represented by a different object type. | 

## Examples

- Prepare the resource
```powershell
$RunStepDetailsToolCallsCodeObjectCodeInterpreter = Initialize-PSOpenAPIToolsRunStepDetailsToolCallsCodeObjectCodeInterpreter  -VarInput null `
 -Outputs null
```

- Convert the resource to JSON
```powershell
$RunStepDetailsToolCallsCodeObjectCodeInterpreter | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

