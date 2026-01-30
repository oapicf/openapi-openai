
# AuditLog

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **kotlin.String** | The ID of this log. |  |
| **type** | [**AuditLogEventType**](AuditLogEventType.md) |  |  |
| **effectiveAt** | **kotlin.Int** | The Unix timestamp (in seconds) of the event. |  |
| **actor** | [**AuditLogActor**](AuditLogActor.md) |  |  |
| **project** | [**AuditLogProject**](AuditLogProject.md) |  |  [optional] |
| **apiKeyCreated** | [**AuditLogApiKeyCreated**](AuditLogApiKeyCreated.md) |  |  [optional] |
| **apiKeyUpdated** | [**AuditLogApiKeyUpdated**](AuditLogApiKeyUpdated.md) |  |  [optional] |
| **apiKeyDeleted** | [**AuditLogApiKeyDeleted**](AuditLogApiKeyDeleted.md) |  |  [optional] |
| **inviteSent** | [**AuditLogInviteSent**](AuditLogInviteSent.md) |  |  [optional] |
| **inviteAccepted** | [**AuditLogInviteAccepted**](AuditLogInviteAccepted.md) |  |  [optional] |
| **inviteDeleted** | [**AuditLogInviteAccepted**](AuditLogInviteAccepted.md) |  |  [optional] |
| **loginFailed** | [**AuditLogLoginFailed**](AuditLogLoginFailed.md) |  |  [optional] |
| **logoutFailed** | [**AuditLogLoginFailed**](AuditLogLoginFailed.md) |  |  [optional] |
| **organizationUpdated** | [**AuditLogOrganizationUpdated**](AuditLogOrganizationUpdated.md) |  |  [optional] |
| **projectCreated** | [**AuditLogProjectCreated**](AuditLogProjectCreated.md) |  |  [optional] |
| **projectUpdated** | [**AuditLogProjectUpdated**](AuditLogProjectUpdated.md) |  |  [optional] |
| **projectArchived** | [**AuditLogProjectArchived**](AuditLogProjectArchived.md) |  |  [optional] |
| **rateLimitUpdated** | [**AuditLogRateLimitUpdated**](AuditLogRateLimitUpdated.md) |  |  [optional] |
| **rateLimitDeleted** | [**AuditLogRateLimitDeleted**](AuditLogRateLimitDeleted.md) |  |  [optional] |
| **serviceAccountCreated** | [**AuditLogServiceAccountCreated**](AuditLogServiceAccountCreated.md) |  |  [optional] |
| **serviceAccountUpdated** | [**AuditLogServiceAccountUpdated**](AuditLogServiceAccountUpdated.md) |  |  [optional] |
| **serviceAccountDeleted** | [**AuditLogServiceAccountDeleted**](AuditLogServiceAccountDeleted.md) |  |  [optional] |
| **userAdded** | [**AuditLogUserAdded**](AuditLogUserAdded.md) |  |  [optional] |
| **userUpdated** | [**AuditLogUserUpdated**](AuditLogUserUpdated.md) |  |  [optional] |
| **userDeleted** | [**AuditLogUserDeleted**](AuditLogUserDeleted.md) |  |  [optional] |



