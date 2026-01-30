# AuditLog

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id_** | **String!** | The ID of this log. | [default to null]
**Type_** | [***AuditLogEventType**](AuditLogEventType.md) |  | [default to null]
**effectiveAt** | **Int!** | The Unix timestamp (in seconds) of the event. | [default to null]
**project** | [***AuditLogProject**](AuditLog_project.md) |  | [optional] [default to null]
**actor** | [***AuditLogActor**](AuditLogActor.md) |  | [default to null]
**apiKeyCreated** | [***AuditLogApiKeyCreated**](AuditLog_api_key_created.md) |  | [optional] [default to null]
**apiKeyUpdated** | [***AuditLogApiKeyUpdated**](AuditLog_api_key_updated.md) |  | [optional] [default to null]
**apiKeyDeleted** | [***AuditLogApiKeyDeleted**](AuditLog_api_key_deleted.md) |  | [optional] [default to null]
**inviteSent** | [***AuditLogInviteSent**](AuditLog_invite_sent.md) |  | [optional] [default to null]
**inviteAccepted** | [***AuditLogInviteAccepted**](AuditLog_invite_accepted.md) |  | [optional] [default to null]
**inviteDeleted** | [***AuditLogInviteAccepted**](AuditLog_invite_accepted.md) |  | [optional] [default to null]
**loginFailed** | [***AuditLogLoginFailed**](AuditLog_login_failed.md) |  | [optional] [default to null]
**logoutFailed** | [***AuditLogLoginFailed**](AuditLog_login_failed.md) |  | [optional] [default to null]
**organizationUpdated** | [***AuditLogOrganizationUpdated**](AuditLog_organization_updated.md) |  | [optional] [default to null]
**projectCreated** | [***AuditLogProjectCreated**](AuditLog_project_created.md) |  | [optional] [default to null]
**projectUpdated** | [***AuditLogProjectUpdated**](AuditLog_project_updated.md) |  | [optional] [default to null]
**projectArchived** | [***AuditLogProjectArchived**](AuditLog_project_archived.md) |  | [optional] [default to null]
**rateLimitUpdated** | [***AuditLogRateLimitUpdated**](AuditLog_rate_limit_updated.md) |  | [optional] [default to null]
**rateLimitDeleted** | [***AuditLogRateLimitDeleted**](AuditLog_rate_limit_deleted.md) |  | [optional] [default to null]
**serviceAccountCreated** | [***AuditLogServiceAccountCreated**](AuditLog_service_account_created.md) |  | [optional] [default to null]
**serviceAccountUpdated** | [***AuditLogServiceAccountUpdated**](AuditLog_service_account_updated.md) |  | [optional] [default to null]
**serviceAccountDeleted** | [***AuditLogServiceAccountDeleted**](AuditLog_service_account_deleted.md) |  | [optional] [default to null]
**userAdded** | [***AuditLogUserAdded**](AuditLog_user_added.md) |  | [optional] [default to null]
**userUpdated** | [***AuditLogUserUpdated**](AuditLog_user_updated.md) |  | [optional] [default to null]
**userDeleted** | [***AuditLogUserDeleted**](AuditLog_user_deleted.md) |  | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


