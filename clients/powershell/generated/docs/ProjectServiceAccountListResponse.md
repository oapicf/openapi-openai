# ProjectServiceAccountListResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Object** | **String** |  | 
**VarData** | [**ProjectServiceAccount[]**](ProjectServiceAccount.md) |  | 
**FirstId** | **String** |  | 
**LastId** | **String** |  | 
**HasMore** | **Boolean** |  | 

## Examples

- Prepare the resource
```powershell
$ProjectServiceAccountListResponse = Initialize-PSOpenAPIToolsProjectServiceAccountListResponse  -Object null `
 -VarData null `
 -FirstId null `
 -LastId null `
 -HasMore null
```

- Convert the resource to JSON
```powershell
$ProjectServiceAccountListResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

