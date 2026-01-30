# ProjectApiKeyListResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Object** | **String** |  | 
**VarData** | [**ProjectApiKey[]**](ProjectApiKey.md) |  | 
**FirstId** | **String** |  | 
**LastId** | **String** |  | 
**HasMore** | **Boolean** |  | 

## Examples

- Prepare the resource
```powershell
$ProjectApiKeyListResponse = Initialize-PSOpenAPIToolsProjectApiKeyListResponse  -Object null `
 -VarData null `
 -FirstId null `
 -LastId null `
 -HasMore null
```

- Convert the resource to JSON
```powershell
$ProjectApiKeyListResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

