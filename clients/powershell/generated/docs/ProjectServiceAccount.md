# ProjectServiceAccount
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Object** | **String** | The object type, which is always &#x60;organization.project.service_account&#x60; | 
**Id** | **String** | The identifier, which can be referenced in API endpoints | 
**Name** | **String** | The name of the service account | 
**Role** | **String** | &#x60;owner&#x60; or &#x60;member&#x60; | 
**CreatedAt** | **Int32** | The Unix timestamp (in seconds) of when the service account was created | 

## Examples

- Prepare the resource
```powershell
$ProjectServiceAccount = Initialize-PSOpenAPIToolsProjectServiceAccount  -Object null `
 -Id null `
 -Name null `
 -Role null `
 -CreatedAt null
```

- Convert the resource to JSON
```powershell
$ProjectServiceAccount | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

