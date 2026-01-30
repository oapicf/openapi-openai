# AuditLogProjectCreated
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **String** | The project ID. | [optional] 
**VarData** | [**AuditLogProjectCreatedData**](AuditLogProjectCreatedData.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$AuditLogProjectCreated = Initialize-PSOpenAPIToolsAuditLogProjectCreated  -Id null `
 -VarData null
```

- Convert the resource to JSON
```powershell
$AuditLogProjectCreated | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

