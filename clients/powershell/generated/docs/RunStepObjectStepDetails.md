# RunStepObjectStepDetails
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | **String** | Always &#x60;message_creation&#x60;. | 
**MessageCreation** | [**RunStepDetailsMessageCreationObjectMessageCreation**](RunStepDetailsMessageCreationObjectMessageCreation.md) |  | 
**ToolCalls** | [**RunStepDetailsToolCallsObjectToolCallsInner[]**](RunStepDetailsToolCallsObjectToolCallsInner.md) | An array of tool calls the run step was involved in. These can be associated with one of three types of tools: &#x60;code_interpreter&#x60;, &#x60;retrieval&#x60;, or &#x60;function&#x60;.  | 

## Examples

- Prepare the resource
```powershell
$RunStepObjectStepDetails = Initialize-PSOpenAPIToolsRunStepObjectStepDetails  -Type null `
 -MessageCreation null `
 -ToolCalls null
```

- Convert the resource to JSON
```powershell
$RunStepObjectStepDetails | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

