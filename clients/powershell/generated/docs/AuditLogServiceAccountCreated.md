# AuditLogServiceAccountCreated
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **String** | The service account ID. | [optional] 
**VarData** | [**AuditLogServiceAccountCreatedData**](AuditLogServiceAccountCreatedData.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$AuditLogServiceAccountCreated = Initialize-PSOpenAPIToolsAuditLogServiceAccountCreated  -Id null `
 -VarData null
```

- Convert the resource to JSON
```powershell
$AuditLogServiceAccountCreated | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

