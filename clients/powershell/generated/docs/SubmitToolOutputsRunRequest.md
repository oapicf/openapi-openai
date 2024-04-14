# SubmitToolOutputsRunRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ToolOutputs** | [**SubmitToolOutputsRunRequestToolOutputsInner[]**](SubmitToolOutputsRunRequestToolOutputsInner.md) | A list of tools for which the outputs are being submitted. | 
**Stream** | **Boolean** | If &#x60;true&#x60;, returns a stream of events that happen during the Run as server-sent events, terminating when the Run enters a terminal state with a &#x60;data: [DONE]&#x60; message.  | [optional] 

## Examples

- Prepare the resource
```powershell
$SubmitToolOutputsRunRequest = Initialize-PSOpenAPIToolsSubmitToolOutputsRunRequest  -ToolOutputs null `
 -Stream null
```

- Convert the resource to JSON
```powershell
$SubmitToolOutputsRunRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

