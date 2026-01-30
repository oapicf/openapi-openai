# RunStepDeltaStepDetailsToolCallsObject
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | **String** | Always &#x60;tool_calls&#x60;. | 
**ToolCalls** | [**RunStepDeltaStepDetailsToolCallsObjectToolCallsInner[]**](RunStepDeltaStepDetailsToolCallsObjectToolCallsInner.md) | An array of tool calls the run step was involved in. These can be associated with one of three types of tools: &#x60;code_interpreter&#x60;, &#x60;file_search&#x60;, or &#x60;function&#x60;.  | [optional] 

## Examples

- Prepare the resource
```powershell
$RunStepDeltaStepDetailsToolCallsObject = Initialize-PSOpenAPIToolsRunStepDeltaStepDetailsToolCallsObject  -Type null `
 -ToolCalls null
```

- Convert the resource to JSON
```powershell
$RunStepDeltaStepDetailsToolCallsObject | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

