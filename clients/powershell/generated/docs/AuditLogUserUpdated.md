# AuditLogUserUpdated
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **String** | The project ID. | [optional] 
**ChangesRequested** | [**AuditLogUserUpdatedChangesRequested**](AuditLogUserUpdatedChangesRequested.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$AuditLogUserUpdated = Initialize-PSOpenAPIToolsAuditLogUserUpdated  -Id null `
 -ChangesRequested null
```

- Convert the resource to JSON
```powershell
$AuditLogUserUpdated | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

