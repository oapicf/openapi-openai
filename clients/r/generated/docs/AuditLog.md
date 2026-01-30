# openapi::AuditLog

A log of a user action or configuration change within this organization.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **character** | The ID of this log. | 
**type** | [**AuditLogEventType**](AuditLogEventType.md) |  | [Enum: ] 
**effective_at** | **integer** | The Unix timestamp (in seconds) of the event. | 
**project** | [**AuditLogProject**](AuditLog_project.md) |  | [optional] 
**actor** | [**AuditLogActor**](AuditLogActor.md) |  | 
**api_key.created** | [**AuditLogApiKeyCreated**](AuditLog_api_key_created.md) |  | [optional] 
**api_key.updated** | [**AuditLogApiKeyUpdated**](AuditLog_api_key_updated.md) |  | [optional] 
**api_key.deleted** | [**AuditLogApiKeyDeleted**](AuditLog_api_key_deleted.md) |  | [optional] 
**invite.sent** | [**AuditLogInviteSent**](AuditLog_invite_sent.md) |  | [optional] 
**invite.accepted** | [**AuditLogInviteAccepted**](AuditLog_invite_accepted.md) |  | [optional] 
**invite.deleted** | [**AuditLogInviteAccepted**](AuditLog_invite_accepted.md) |  | [optional] 
**login.failed** | [**AuditLogLoginFailed**](AuditLog_login_failed.md) |  | [optional] 
**logout.failed** | [**AuditLogLoginFailed**](AuditLog_login_failed.md) |  | [optional] 
**organization.updated** | [**AuditLogOrganizationUpdated**](AuditLog_organization_updated.md) |  | [optional] 
**project.created** | [**AuditLogProjectCreated**](AuditLog_project_created.md) |  | [optional] 
**project.updated** | [**AuditLogProjectUpdated**](AuditLog_project_updated.md) |  | [optional] 
**project.archived** | [**AuditLogProjectArchived**](AuditLog_project_archived.md) |  | [optional] 
**rate_limit.updated** | [**AuditLogRateLimitUpdated**](AuditLog_rate_limit_updated.md) |  | [optional] 
**rate_limit.deleted** | [**AuditLogRateLimitDeleted**](AuditLog_rate_limit_deleted.md) |  | [optional] 
**service_account.created** | [**AuditLogServiceAccountCreated**](AuditLog_service_account_created.md) |  | [optional] 
**service_account.updated** | [**AuditLogServiceAccountUpdated**](AuditLog_service_account_updated.md) |  | [optional] 
**service_account.deleted** | [**AuditLogServiceAccountDeleted**](AuditLog_service_account_deleted.md) |  | [optional] 
**user.added** | [**AuditLogUserAdded**](AuditLog_user_added.md) |  | [optional] 
**user.updated** | [**AuditLogUserUpdated**](AuditLog_user_updated.md) |  | [optional] 
**user.deleted** | [**AuditLogUserDeleted**](AuditLog_user_deleted.md) |  | [optional] 


