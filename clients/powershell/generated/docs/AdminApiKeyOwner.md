# AdminApiKeyOwner
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | **String** |  | [optional] 
**Id** | **String** |  | [optional] 
**Name** | **String** |  | [optional] 
**CreatedAt** | **Int64** |  | [optional] 
**Role** | **String** |  | [optional] 

## Examples

- Prepare the resource
```powershell
$AdminApiKeyOwner = Initialize-PSOpenAPIToolsAdminApiKeyOwner  -Type service_account `
 -Id sa_456 `
 -Name My Service Account `
 -CreatedAt 1711471533 `
 -Role member
```

- Convert the resource to JSON
```powershell
$AdminApiKeyOwner | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

