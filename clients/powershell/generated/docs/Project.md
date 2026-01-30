# Project
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **String** | The identifier, which can be referenced in API endpoints | 
**Object** | **String** | The object type, which is always &#x60;organization.project&#x60; | 
**Name** | **String** | The name of the project. This appears in reporting. | 
**CreatedAt** | **Int32** | The Unix timestamp (in seconds) of when the project was created. | 
**ArchivedAt** | **Int32** | The Unix timestamp (in seconds) of when the project was archived or &#x60;null&#x60;. | [optional] 
**Status** | **String** | &#x60;active&#x60; or &#x60;archived&#x60; | 

## Examples

- Prepare the resource
```powershell
$Project = Initialize-PSOpenAPIToolsProject  -Id null `
 -Object null `
 -Name null `
 -CreatedAt null `
 -ArchivedAt null `
 -Status null
```

- Convert the resource to JSON
```powershell
$Project | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

