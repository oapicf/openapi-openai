# AdminApiKeysDelete200Response
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **String** |  | [optional] 
**Object** | **String** |  | [optional] 
**Deleted** | **Boolean** |  | [optional] 

## Examples

- Prepare the resource
```powershell
$AdminApiKeysDelete200Response = Initialize-PSOpenAPIToolsAdminApiKeysDelete200Response  -Id key_abc `
 -Object organization.admin_api_key.deleted `
 -Deleted true
```

- Convert the resource to JSON
```powershell
$AdminApiKeysDelete200Response | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

