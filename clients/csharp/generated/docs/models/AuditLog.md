# Org.OpenAPITools.Model.AuditLog
A log of a user action or configuration change within this organization.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **string** | The ID of this log. | 
**Type** | **AuditLogEventType** |  | 
**EffectiveAt** | **int** | The Unix timestamp (in seconds) of the event. | 
**Actor** | [**AuditLogActor**](AuditLogActor.md) |  | 
**Project** | [**AuditLogProject**](AuditLogProject.md) |  | [optional] 
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

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

