# RunObjectRequiredActionSubmitToolOutputs
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ToolCalls** | [**RunToolCallObject[]**](RunToolCallObject.md) | A list of the relevant tool calls. | 

## Examples

- Prepare the resource
```powershell
$RunObjectRequiredActionSubmitToolOutputs = Initialize-PSOpenAPIToolsRunObjectRequiredActionSubmitToolOutputs  -ToolCalls null
```

- Convert the resource to JSON
```powershell
$RunObjectRequiredActionSubmitToolOutputs | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

