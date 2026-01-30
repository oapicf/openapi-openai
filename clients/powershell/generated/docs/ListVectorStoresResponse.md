# ListVectorStoresResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Object** | **String** |  | 
**VarData** | [**VectorStoreObject[]**](VectorStoreObject.md) |  | 
**FirstId** | **String** |  | 
**LastId** | **String** |  | 
**HasMore** | **Boolean** |  | 

## Examples

- Prepare the resource
```powershell
$ListVectorStoresResponse = Initialize-PSOpenAPIToolsListVectorStoresResponse  -Object list `
 -VarData null `
 -FirstId vs_abc123 `
 -LastId vs_abc456 `
 -HasMore false
```

- Convert the resource to JSON
```powershell
$ListVectorStoresResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

