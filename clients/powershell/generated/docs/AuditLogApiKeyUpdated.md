# AuditLogApiKeyUpdated
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **String** | The tracking ID of the API key. | [optional] 
**ChangesRequested** | [**AuditLogApiKeyUpdatedChangesRequested**](AuditLogApiKeyUpdatedChangesRequested.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$AuditLogApiKeyUpdated = Initialize-PSOpenAPIToolsAuditLogApiKeyUpdated  -Id null `
 -ChangesRequested null
```

- Convert the resource to JSON
```powershell
$AuditLogApiKeyUpdated | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

