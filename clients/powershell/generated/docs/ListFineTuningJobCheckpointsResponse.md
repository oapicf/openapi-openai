# ListFineTuningJobCheckpointsResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**VarData** | [**FineTuningJobCheckpoint[]**](FineTuningJobCheckpoint.md) |  | 
**Object** | **String** |  | 
**FirstId** | **String** |  | [optional] 
**LastId** | **String** |  | [optional] 
**HasMore** | **Boolean** |  | 

## Examples

- Prepare the resource
```powershell
$ListFineTuningJobCheckpointsResponse = Initialize-PSOpenAPIToolsListFineTuningJobCheckpointsResponse  -VarData null `
 -Object null `
 -FirstId null `
 -LastId null `
 -HasMore null
```

- Convert the resource to JSON
```powershell
$ListFineTuningJobCheckpointsResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

