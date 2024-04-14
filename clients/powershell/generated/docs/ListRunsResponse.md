# ListRunsResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Object** | **String** |  | 
**VarData** | [**RunObject[]**](RunObject.md) |  | 
**FirstId** | **String** |  | 
**LastId** | **String** |  | 
**HasMore** | **Boolean** |  | 

## Examples

- Prepare the resource
```powershell
$ListRunsResponse = Initialize-PSOpenAPIToolsListRunsResponse  -Object list `
 -VarData null `
 -FirstId run_abc123 `
 -LastId run_abc456 `
 -HasMore false
```

- Convert the resource to JSON
```powershell
$ListRunsResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

