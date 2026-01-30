# AuditLogUserAdded
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **String** | The user ID. | [optional] 
**VarData** | [**AuditLogUserAddedData**](AuditLogUserAddedData.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$AuditLogUserAdded = Initialize-PSOpenAPIToolsAuditLogUserAdded  -Id null `
 -VarData null
```

- Convert the resource to JSON
```powershell
$AuditLogUserAdded | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

