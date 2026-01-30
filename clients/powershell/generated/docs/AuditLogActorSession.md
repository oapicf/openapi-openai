# AuditLogActorSession
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**User** | [**AuditLogActorUser**](AuditLogActorUser.md) |  | [optional] 
**IpAddress** | **String** | The IP address from which the action was performed. | [optional] 

## Examples

- Prepare the resource
```powershell
$AuditLogActorSession = Initialize-PSOpenAPIToolsAuditLogActorSession  -User null `
 -IpAddress null
```

- Convert the resource to JSON
```powershell
$AuditLogActorSession | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

