# ListBatchesResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**VarData** | [**Batch[]**](Batch.md) |  | 
**FirstId** | **String** |  | [optional] 
**LastId** | **String** |  | [optional] 
**HasMore** | **Boolean** |  | 
**Object** | **String** |  | 

## Examples

- Prepare the resource
```powershell
$ListBatchesResponse = Initialize-PSOpenAPIToolsListBatchesResponse  -VarData null `
 -FirstId batch_abc123 `
 -LastId batch_abc456 `
 -HasMore null `
 -Object null
```

- Convert the resource to JSON
```powershell
$ListBatchesResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

