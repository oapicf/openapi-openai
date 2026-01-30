# AuditLogProjectUpdated
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **String** | The project ID. | [optional] 
**ChangesRequested** | [**AuditLogProjectUpdatedChangesRequested**](AuditLogProjectUpdatedChangesRequested.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$AuditLogProjectUpdated = Initialize-PSOpenAPIToolsAuditLogProjectUpdated  -Id null `
 -ChangesRequested null
```

- Convert the resource to JSON
```powershell
$AuditLogProjectUpdated | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

