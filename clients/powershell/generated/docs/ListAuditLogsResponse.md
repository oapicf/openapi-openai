# ListAuditLogsResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Object** | **String** |  | 
**VarData** | [**AuditLog[]**](AuditLog.md) |  | 
**FirstId** | **String** |  | 
**LastId** | **String** |  | 
**HasMore** | **Boolean** |  | 

## Examples

- Prepare the resource
```powershell
$ListAuditLogsResponse = Initialize-PSOpenAPIToolsListAuditLogsResponse  -Object null `
 -VarData null `
 -FirstId audit_log-defb456h8dks `
 -LastId audit_log-hnbkd8s93s `
 -HasMore null
```

- Convert the resource to JSON
```powershell
$ListAuditLogsResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

