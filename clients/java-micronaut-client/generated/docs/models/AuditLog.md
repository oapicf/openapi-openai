

# AuditLog

A log of a user action or configuration change within this organization.

The class is defined in **[AuditLog.java](../../src/main/java/org/openapitools/model/AuditLog.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | `String` | The ID of this log. | 
**type** | `AuditLogEventType` |  | 
**effectiveAt** | `Integer` | The Unix timestamp (in seconds) of the event. | 
**project** | [`AuditLogProject`](AuditLogProject.md) |  |  [optional property]
**actor** | [`AuditLogActor`](AuditLogActor.md) |  | 
**apiKeyCreated** | [`AuditLogApiKeyCreated`](AuditLogApiKeyCreated.md) |  |  [optional property]
**apiKeyUpdated** | [`AuditLogApiKeyUpdated`](AuditLogApiKeyUpdated.md) |  |  [optional property]
**apiKeyDeleted** | [`AuditLogApiKeyDeleted`](AuditLogApiKeyDeleted.md) |  |  [optional property]
**inviteSent** | [`AuditLogInviteSent`](AuditLogInviteSent.md) |  |  [optional property]
**inviteAccepted** | [`AuditLogInviteAccepted`](AuditLogInviteAccepted.md) |  |  [optional property]
**inviteDeleted** | [`AuditLogInviteAccepted`](AuditLogInviteAccepted.md) |  |  [optional property]
**loginFailed** | [`AuditLogLoginFailed`](AuditLogLoginFailed.md) |  |  [optional property]
**logoutFailed** | [`AuditLogLoginFailed`](AuditLogLoginFailed.md) |  |  [optional property]
**organizationUpdated** | [`AuditLogOrganizationUpdated`](AuditLogOrganizationUpdated.md) |  |  [optional property]
**projectCreated** | [`AuditLogProjectCreated`](AuditLogProjectCreated.md) |  |  [optional property]
**projectUpdated** | [`AuditLogProjectUpdated`](AuditLogProjectUpdated.md) |  |  [optional property]
**projectArchived** | [`AuditLogProjectArchived`](AuditLogProjectArchived.md) |  |  [optional property]
**rateLimitUpdated** | [`AuditLogRateLimitUpdated`](AuditLogRateLimitUpdated.md) |  |  [optional property]
**rateLimitDeleted** | [`AuditLogRateLimitDeleted`](AuditLogRateLimitDeleted.md) |  |  [optional property]
**serviceAccountCreated** | [`AuditLogServiceAccountCreated`](AuditLogServiceAccountCreated.md) |  |  [optional property]
**serviceAccountUpdated** | [`AuditLogServiceAccountUpdated`](AuditLogServiceAccountUpdated.md) |  |  [optional property]
**serviceAccountDeleted** | [`AuditLogServiceAccountDeleted`](AuditLogServiceAccountDeleted.md) |  |  [optional property]
**userAdded** | [`AuditLogUserAdded`](AuditLogUserAdded.md) |  |  [optional property]
**userUpdated** | [`AuditLogUserUpdated`](AuditLogUserUpdated.md) |  |  [optional property]
**userDeleted** | [`AuditLogUserDeleted`](AuditLogUserDeleted.md) |  |  [optional property]



























