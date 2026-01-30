# AuditLogRateLimitUpdated
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **String** | The rate limit ID | [optional] 
**ChangesRequested** | [**AuditLogRateLimitUpdatedChangesRequested**](AuditLogRateLimitUpdatedChangesRequested.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$AuditLogRateLimitUpdated = Initialize-PSOpenAPIToolsAuditLogRateLimitUpdated  -Id null `
 -ChangesRequested null
```

- Convert the resource to JSON
```powershell
$AuditLogRateLimitUpdated | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

