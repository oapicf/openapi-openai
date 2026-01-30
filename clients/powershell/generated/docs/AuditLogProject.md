# AuditLogProject
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **String** | The project ID. | [optional] 
**Name** | **String** | The project title. | [optional] 

## Examples

- Prepare the resource
```powershell
$AuditLogProject = Initialize-PSOpenAPIToolsAuditLogProject  -Id null `
 -Name null
```

- Convert the resource to JSON
```powershell
$AuditLogProject | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

