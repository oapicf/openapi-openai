# ListThreadsResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Object** | **String** |  | 
**VarData** | [**ThreadObject[]**](ThreadObject.md) |  | 
**FirstId** | **String** |  | 
**LastId** | **String** |  | 
**HasMore** | **Boolean** |  | 

## Examples

- Prepare the resource
```powershell
$ListThreadsResponse = Initialize-PSOpenAPIToolsListThreadsResponse  -Object list `
 -VarData null `
 -FirstId asst_abc123 `
 -LastId asst_abc456 `
 -HasMore false
```

- Convert the resource to JSON
```powershell
$ListThreadsResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

