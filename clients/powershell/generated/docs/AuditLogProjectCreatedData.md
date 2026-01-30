# AuditLogProjectCreatedData
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Name** | **String** | The project name. | [optional] 
**Title** | **String** | The title of the project as seen on the dashboard. | [optional] 

## Examples

- Prepare the resource
```powershell
$AuditLogProjectCreatedData = Initialize-PSOpenAPIToolsAuditLogProjectCreatedData  -Name null `
 -Title null
```

- Convert the resource to JSON
```powershell
$AuditLogProjectCreatedData | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

