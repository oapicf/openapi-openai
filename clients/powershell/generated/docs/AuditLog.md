# AuditLog
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **String** | The ID of this log. | 
**Type** | [**AuditLogEventType**](AuditLogEventType.md) |  | 
**EffectiveAt** | **Int32** | The Unix timestamp (in seconds) of the event. | 
**Project** | [**AuditLogProject**](AuditLogProject.md) |  | [optional] 
**Actor** | [**AuditLogActor**](AuditLogActor.md) |  | 
**ApiKeyCreated** | [**AuditLogApiKeyCreated**](AuditLogApiKeyCreated.md) |  | [optional] 
**ApiKeyUpdated** | [**AuditLogApiKeyUpdated**](AuditLogApiKeyUpdated.md) |  | [optional] 
**ApiKeyDeleted** | [**AuditLogApiKeyDeleted**](AuditLogApiKeyDeleted.md) |  | [optional] 
**InviteSent** | [**AuditLogInviteSent**](AuditLogInviteSent.md) |  | [optional] 
**InviteAccepted** | [**AuditLogInviteAccepted**](AuditLogInviteAccepted.md) |  | [optional] 
**InviteDeleted** | [**AuditLogInviteAccepted**](AuditLogInviteAccepted.md) |  | [optional] 
**LoginFailed** | [**AuditLogLoginFailed**](AuditLogLoginFailed.md) |  | [optional] 
**LogoutFailed** | [**AuditLogLoginFailed**](AuditLogLoginFailed.md) |  | [optional] 
**OrganizationUpdated** | [**AuditLogOrganizationUpdated**](AuditLogOrganizationUpdated.md) |  | [optional] 
**ProjectCreated** | [**AuditLogProjectCreated**](AuditLogProjectCreated.md) |  | [optional] 
**ProjectUpdated** | [**AuditLogProjectUpdated**](AuditLogProjectUpdated.md) |  | [optional] 
**ProjectArchived** | [**AuditLogProjectArchived**](AuditLogProjectArchived.md) |  | [optional] 
**RateLimitUpdated** | [**AuditLogRateLimitUpdated**](AuditLogRateLimitUpdated.md) |  | [optional] 
**RateLimitDeleted** | [**AuditLogRateLimitDeleted**](AuditLogRateLimitDeleted.md) |  | [optional] 
**ServiceAccountCreated** | [**AuditLogServiceAccountCreated**](AuditLogServiceAccountCreated.md) |  | [optional] 
**ServiceAccountUpdated** | [**AuditLogServiceAccountUpdated**](AuditLogServiceAccountUpdated.md) |  | [optional] 
**ServiceAccountDeleted** | [**AuditLogServiceAccountDeleted**](AuditLogServiceAccountDeleted.md) |  | [optional] 
**UserAdded** | [**AuditLogUserAdded**](AuditLogUserAdded.md) |  | [optional] 
**UserUpdated** | [**AuditLogUserUpdated**](AuditLogUserUpdated.md) |  | [optional] 
**UserDeleted** | [**AuditLogUserDeleted**](AuditLogUserDeleted.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$AuditLog = Initialize-PSOpenAPIToolsAuditLog  -Id null `
 -Type null `
 -EffectiveAt null `
 -Project null `
 -Actor null `
 -ApiKeyCreated null `
 -ApiKeyUpdated null `
 -ApiKeyDeleted null `
 -InviteSent null `
 -InviteAccepted null `
 -InviteDeleted null `
 -LoginFailed null `
 -LogoutFailed null `
 -OrganizationUpdated null `
 -ProjectCreated null `
 -ProjectUpdated null `
 -ProjectArchived null `
 -RateLimitUpdated null `
 -RateLimitDeleted null `
 -ServiceAccountCreated null `
 -ServiceAccountUpdated null `
 -ServiceAccountDeleted null `
 -UserAdded null `
 -UserUpdated null `
 -UserDeleted null
```

- Convert the resource to JSON
```powershell
$AuditLog | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

