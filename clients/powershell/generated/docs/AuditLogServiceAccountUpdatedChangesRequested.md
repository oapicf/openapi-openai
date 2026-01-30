# AuditLogServiceAccountUpdatedChangesRequested
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Role** | **String** | The role of the service account. Is either &#x60;owner&#x60; or &#x60;member&#x60;. | [optional] 

## Examples

- Prepare the resource
```powershell
$AuditLogServiceAccountUpdatedChangesRequested = Initialize-PSOpenAPIToolsAuditLogServiceAccountUpdatedChangesRequested  -Role null
```

- Convert the resource to JSON
```powershell
$AuditLogServiceAccountUpdatedChangesRequested | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

