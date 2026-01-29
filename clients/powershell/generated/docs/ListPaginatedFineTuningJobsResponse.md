# ListPaginatedFineTuningJobsResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**VarData** | [**FineTuningJob[]**](FineTuningJob.md) |  | 
**HasMore** | **Boolean** |  | 
**Object** | **String** |  | 

## Examples

- Prepare the resource
```powershell
$ListPaginatedFineTuningJobsResponse = Initialize-PSOpenAPIToolsListPaginatedFineTuningJobsResponse  -VarData null `
 -HasMore null `
 -Object null
```

- Convert the resource to JSON
```powershell
$ListPaginatedFineTuningJobsResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

