# ProjectServiceAccountApiKey
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Object** | **String** | The object type, which is always &#x60;organization.project.service_account.api_key&#x60; | 
**Value** | **String** |  | 
**Name** | **String** |  | 
**CreatedAt** | **Int32** |  | 
**Id** | **String** |  | 

## Examples

- Prepare the resource
```powershell
$ProjectServiceAccountApiKey = Initialize-PSOpenAPIToolsProjectServiceAccountApiKey  -Object null `
 -Value null `
 -Name null `
 -CreatedAt null `
 -Id null
```

- Convert the resource to JSON
```powershell
$ProjectServiceAccountApiKey | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

