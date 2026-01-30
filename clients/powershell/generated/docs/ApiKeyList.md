# ApiKeyList
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Object** | **String** |  | [optional] 
**VarData** | [**AdminApiKey[]**](AdminApiKey.md) |  | [optional] 
**HasMore** | **Boolean** |  | [optional] 
**FirstId** | **String** |  | [optional] 
**LastId** | **String** |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ApiKeyList = Initialize-PSOpenAPIToolsApiKeyList  -Object list `
 -VarData null `
 -HasMore false `
 -FirstId key_abc `
 -LastId key_xyz
```

- Convert the resource to JSON
```powershell
$ApiKeyList | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

