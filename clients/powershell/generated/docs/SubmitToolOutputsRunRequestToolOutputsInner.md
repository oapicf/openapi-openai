# SubmitToolOutputsRunRequestToolOutputsInner
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ToolCallId** | **String** | The ID of the tool call in the &#x60;required_action&#x60; object within the run object the output is being submitted for. | [optional] 
**Output** | **String** | The output of the tool call to be submitted to continue the run. | [optional] 

## Examples

- Prepare the resource
```powershell
$SubmitToolOutputsRunRequestToolOutputsInner = Initialize-PSOpenAPIToolsSubmitToolOutputsRunRequestToolOutputsInner  -ToolCallId null `
 -Output null
```

- Convert the resource to JSON
```powershell
$SubmitToolOutputsRunRequestToolOutputsInner | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

