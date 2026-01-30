# AdminApiKey
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Object** | **String** |  | [optional] 
**Id** | **String** |  | [optional] 
**Name** | **String** |  | [optional] 
**RedactedValue** | **String** |  | [optional] 
**Value** | **String** |  | [optional] 
**CreatedAt** | **Int64** |  | [optional] 
**Owner** | [**AdminApiKeyOwner**](AdminApiKeyOwner.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$AdminApiKey = Initialize-PSOpenAPIToolsAdminApiKey  -Object organization.admin_api_key `
 -Id key_abc `
 -Name Administration Key `
 -RedactedValue sk-admin...def `
 -Value sk-admin-1234abcd `
 -CreatedAt 1711471533 `
 -Owner null
```

- Convert the resource to JSON
```powershell
$AdminApiKey | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

