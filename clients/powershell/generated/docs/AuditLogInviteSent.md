# AuditLogInviteSent
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **String** | The ID of the invite. | [optional] 
**VarData** | [**AuditLogInviteSentData**](AuditLogInviteSentData.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$AuditLogInviteSent = Initialize-PSOpenAPIToolsAuditLogInviteSent  -Id null `
 -VarData null
```

- Convert the resource to JSON
```powershell
$AuditLogInviteSent | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

