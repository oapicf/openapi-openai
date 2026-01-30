# AuditLogOrganizationUpdated
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **String** | The organization ID. | [optional] 
**ChangesRequested** | [**AuditLogOrganizationUpdatedChangesRequested**](AuditLogOrganizationUpdatedChangesRequested.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$AuditLogOrganizationUpdated = Initialize-PSOpenAPIToolsAuditLogOrganizationUpdated  -Id null `
 -ChangesRequested null
```

- Convert the resource to JSON
```powershell
$AuditLogOrganizationUpdated | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

