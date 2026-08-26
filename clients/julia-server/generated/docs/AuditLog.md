# AuditLog


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**`id`** | **`String`** | The ID of this log. | [default to nothing]
**`type`** | [**`*AuditLogEventType`**](AuditLogEventType.md) |  | [default to nothing]
**`effective_at`** | **`Int64`** | The Unix timestamp (in seconds) of the event. | [default to nothing]
**`project`** | [**`*AuditLogProject`**](AuditLogProject.md) |  | [optional] [default to nothing]
**`actor`** | [**`*AuditLogActor`**](AuditLogActor.md) |  | [default to nothing]
**`var&quot;api_key.created&quot;`** | [**`*AuditLogApiKeyCreated`**](AuditLogApiKeyCreated.md) |  | [optional] [default to nothing]
**`var&quot;api_key.updated&quot;`** | [**`*AuditLogApiKeyUpdated`**](AuditLogApiKeyUpdated.md) |  | [optional] [default to nothing]
**`var&quot;api_key.deleted&quot;`** | [**`*AuditLogApiKeyDeleted`**](AuditLogApiKeyDeleted.md) |  | [optional] [default to nothing]
**`var&quot;invite.sent&quot;`** | [**`*AuditLogInviteSent`**](AuditLogInviteSent.md) |  | [optional] [default to nothing]
**`var&quot;invite.accepted&quot;`** | [**`*AuditLogInviteAccepted`**](AuditLogInviteAccepted.md) |  | [optional] [default to nothing]
**`var&quot;invite.deleted&quot;`** | [**`*AuditLogInviteAccepted`**](AuditLogInviteAccepted.md) |  | [optional] [default to nothing]
**`var&quot;login.failed&quot;`** | [**`*AuditLogLoginFailed`**](AuditLogLoginFailed.md) |  | [optional] [default to nothing]
**`var&quot;logout.failed&quot;`** | [**`*AuditLogLoginFailed`**](AuditLogLoginFailed.md) |  | [optional] [default to nothing]
**`var&quot;organization.updated&quot;`** | [**`*AuditLogOrganizationUpdated`**](AuditLogOrganizationUpdated.md) |  | [optional] [default to nothing]
**`var&quot;project.created&quot;`** | [**`*AuditLogProjectCreated`**](AuditLogProjectCreated.md) |  | [optional] [default to nothing]
**`var&quot;project.updated&quot;`** | [**`*AuditLogProjectUpdated`**](AuditLogProjectUpdated.md) |  | [optional] [default to nothing]
**`var&quot;project.archived&quot;`** | [**`*AuditLogProjectArchived`**](AuditLogProjectArchived.md) |  | [optional] [default to nothing]
**`var&quot;rate_limit.updated&quot;`** | [**`*AuditLogRateLimitUpdated`**](AuditLogRateLimitUpdated.md) |  | [optional] [default to nothing]
**`var&quot;rate_limit.deleted&quot;`** | [**`*AuditLogRateLimitDeleted`**](AuditLogRateLimitDeleted.md) |  | [optional] [default to nothing]
**`var&quot;service_account.created&quot;`** | [**`*AuditLogServiceAccountCreated`**](AuditLogServiceAccountCreated.md) |  | [optional] [default to nothing]
**`var&quot;service_account.updated&quot;`** | [**`*AuditLogServiceAccountUpdated`**](AuditLogServiceAccountUpdated.md) |  | [optional] [default to nothing]
**`var&quot;service_account.deleted&quot;`** | [**`*AuditLogServiceAccountDeleted`**](AuditLogServiceAccountDeleted.md) |  | [optional] [default to nothing]
**`var&quot;user.added&quot;`** | [**`*AuditLogUserAdded`**](AuditLogUserAdded.md) |  | [optional] [default to nothing]
**`var&quot;user.updated&quot;`** | [**`*AuditLogUserUpdated`**](AuditLogUserUpdated.md) |  | [optional] [default to nothing]
**`var&quot;user.deleted&quot;`** | [**`*AuditLogUserDeleted`**](AuditLogUserDeleted.md) |  | [optional] [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


