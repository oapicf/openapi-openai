# AuditLogOrganizationUpdatedChangesRequested
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Title** | **String** | The organization title. | [optional] 
**Description** | **String** | The organization description. | [optional] 
**Name** | **String** | The organization name. | [optional] 
**Settings** | [**AuditLogOrganizationUpdatedChangesRequestedSettings**](AuditLogOrganizationUpdatedChangesRequestedSettings.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$AuditLogOrganizationUpdatedChangesRequested = Initialize-PSOpenAPIToolsAuditLogOrganizationUpdatedChangesRequested  -Title null `
 -Description null `
 -Name null `
 -Settings null
```

- Convert the resource to JSON
```powershell
$AuditLogOrganizationUpdatedChangesRequested | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

