# RunStepDeltaStepDetailsToolCallsFunctionObjectFunction
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Name** | **String** | The name of the function. | [optional] 
**Arguments** | **String** | The arguments passed to the function. | [optional] 
**Output** | **String** | The output of the function. This will be &#x60;null&#x60; if the outputs have not been [submitted](/docs/api-reference/runs/submitToolOutputs) yet. | [optional] 

## Examples

- Prepare the resource
```powershell
$RunStepDeltaStepDetailsToolCallsFunctionObjectFunction = Initialize-PSOpenAPIToolsRunStepDeltaStepDetailsToolCallsFunctionObjectFunction  -Name null `
 -Arguments null `
 -Output null
```

- Convert the resource to JSON
```powershell
$RunStepDeltaStepDetailsToolCallsFunctionObjectFunction | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

