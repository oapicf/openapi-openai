# RunObjectRequiredAction
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | **String** | For now, this is always &#x60;submit_tool_outputs&#x60;. | 
**SubmitToolOutputs** | [**RunObjectRequiredActionSubmitToolOutputs**](RunObjectRequiredActionSubmitToolOutputs.md) |  | 

## Examples

- Prepare the resource
```powershell
$RunObjectRequiredAction = Initialize-PSOpenAPIToolsRunObjectRequiredAction  -Type null `
 -SubmitToolOutputs null
```

- Convert the resource to JSON
```powershell
$RunObjectRequiredAction | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

