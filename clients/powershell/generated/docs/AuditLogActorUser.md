# AuditLogActorUser
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **String** | The user id. | [optional] 
**Email** | **String** | The user email. | [optional] 

## Examples

- Prepare the resource
```powershell
$AuditLogActorUser = Initialize-PSOpenAPIToolsAuditLogActorUser  -Id null `
 -Email null
```

- Convert the resource to JSON
```powershell
$AuditLogActorUser | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

