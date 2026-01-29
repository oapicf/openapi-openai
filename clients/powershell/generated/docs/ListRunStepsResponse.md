# ListRunStepsResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Object** | **String** |  | 
**VarData** | [**RunStepObject[]**](RunStepObject.md) |  | 
**FirstId** | **String** |  | 
**LastId** | **String** |  | 
**HasMore** | **Boolean** |  | 

## Examples

- Prepare the resource
```powershell
$ListRunStepsResponse = Initialize-PSOpenAPIToolsListRunStepsResponse  -Object list `
 -VarData null `
 -FirstId step_abc123 `
 -LastId step_abc456 `
 -HasMore false
```

- Convert the resource to JSON
```powershell
$ListRunStepsResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

