# OAIAuditLog

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**_id** | **NSString*** | The ID of this log. | 
**type** | [**OAIAuditLogEventType***](OAIAuditLogEventType.md) |  | 
**effectiveAt** | **NSNumber*** | The Unix timestamp (in seconds) of the event. | 
**project** | [**OAIAuditLogProject***](OAIAuditLogProject.md) |  | [optional] 
**actor** | [**OAIAuditLogActor***](OAIAuditLogActor.md) |  | 
**apiKeyCreated** | [**OAIAuditLogApiKeyCreated***](OAIAuditLogApiKeyCreated.md) |  | [optional] 
**apiKeyUpdated** | [**OAIAuditLogApiKeyUpdated***](OAIAuditLogApiKeyUpdated.md) |  | [optional] 
**apiKeyDeleted** | [**OAIAuditLogApiKeyDeleted***](OAIAuditLogApiKeyDeleted.md) |  | [optional] 
**inviteSent** | [**OAIAuditLogInviteSent***](OAIAuditLogInviteSent.md) |  | [optional] 
**inviteAccepted** | [**OAIAuditLogInviteAccepted***](OAIAuditLogInviteAccepted.md) |  | [optional] 
**inviteDeleted** | [**OAIAuditLogInviteAccepted***](OAIAuditLogInviteAccepted.md) |  | [optional] 
**loginFailed** | [**OAIAuditLogLoginFailed***](OAIAuditLogLoginFailed.md) |  | [optional] 
**logoutFailed** | [**OAIAuditLogLoginFailed***](OAIAuditLogLoginFailed.md) |  | [optional] 
**organizationUpdated** | [**OAIAuditLogOrganizationUpdated***](OAIAuditLogOrganizationUpdated.md) |  | [optional] 
**projectCreated** | [**OAIAuditLogProjectCreated***](OAIAuditLogProjectCreated.md) |  | [optional] 
**projectUpdated** | [**OAIAuditLogProjectUpdated***](OAIAuditLogProjectUpdated.md) |  | [optional] 
**projectArchived** | [**OAIAuditLogProjectArchived***](OAIAuditLogProjectArchived.md) |  | [optional] 
**rateLimitUpdated** | [**OAIAuditLogRateLimitUpdated***](OAIAuditLogRateLimitUpdated.md) |  | [optional] 
**rateLimitDeleted** | [**OAIAuditLogRateLimitDeleted***](OAIAuditLogRateLimitDeleted.md) |  | [optional] 
**serviceAccountCreated** | [**OAIAuditLogServiceAccountCreated***](OAIAuditLogServiceAccountCreated.md) |  | [optional] 
**serviceAccountUpdated** | [**OAIAuditLogServiceAccountUpdated***](OAIAuditLogServiceAccountUpdated.md) |  | [optional] 
**serviceAccountDeleted** | [**OAIAuditLogServiceAccountDeleted***](OAIAuditLogServiceAccountDeleted.md) |  | [optional] 
**userAdded** | [**OAIAuditLogUserAdded***](OAIAuditLogUserAdded.md) |  | [optional] 
**userUpdated** | [**OAIAuditLogUserUpdated***](OAIAuditLogUserUpdated.md) |  | [optional] 
**userDeleted** | [**OAIAuditLogUserDeleted***](OAIAuditLogUserDeleted.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


