# AuditLogApiKeyCreated
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **String** | The tracking ID of the API key. | [optional] 
**VarData** | [**AuditLogApiKeyCreatedData**](AuditLogApiKeyCreatedData.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$AuditLogApiKeyCreated = Initialize-PSOpenAPIToolsAuditLogApiKeyCreated  -Id null `
 -VarData null
```

- Convert the resource to JSON
```powershell
$AuditLogApiKeyCreated | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

