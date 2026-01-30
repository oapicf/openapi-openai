# User
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Object** | **String** | The object type, which is always &#x60;organization.user&#x60; | 
**Id** | **String** | The identifier, which can be referenced in API endpoints | 
**Name** | **String** | The name of the user | 
**Email** | **String** | The email address of the user | 
**Role** | **String** | &#x60;owner&#x60; or &#x60;reader&#x60; | 
**AddedAt** | **Int32** | The Unix timestamp (in seconds) of when the user was added. | 

## Examples

- Prepare the resource
```powershell
$User = Initialize-PSOpenAPIToolsUser  -Object null `
 -Id null `
 -Name null `
 -Email null `
 -Role null `
 -AddedAt null
```

- Convert the resource to JSON
```powershell
$User | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

