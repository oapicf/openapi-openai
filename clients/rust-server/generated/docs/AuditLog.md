# AuditLog

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The ID of this log. | 
**r#type** | [***models::AuditLogEventType**](AuditLogEventType.md) |  | 
**effective_at** | **i32** | The Unix timestamp (in seconds) of the event. | 
**project** | [***models::AuditLogProject**](AuditLog_project.md) |  | [optional] [default to None]
**actor** | [***models::AuditLogActor**](AuditLogActor.md) |  | 
**api_key_created** | [***models::AuditLogApiKeyCreated**](AuditLog_api_key_created.md) |  | [optional] [default to None]
**api_key_updated** | [***models::AuditLogApiKeyUpdated**](AuditLog_api_key_updated.md) |  | [optional] [default to None]
**api_key_deleted** | [***models::AuditLogApiKeyDeleted**](AuditLog_api_key_deleted.md) |  | [optional] [default to None]
**invite_sent** | [***models::AuditLogInviteSent**](AuditLog_invite_sent.md) |  | [optional] [default to None]
**invite_accepted** | [***models::AuditLogInviteAccepted**](AuditLog_invite_accepted.md) |  | [optional] [default to None]
**invite_deleted** | [***models::AuditLogInviteAccepted**](AuditLog_invite_accepted.md) |  | [optional] [default to None]
**login_failed** | [***models::AuditLogLoginFailed**](AuditLog_login_failed.md) |  | [optional] [default to None]
**logout_failed** | [***models::AuditLogLoginFailed**](AuditLog_login_failed.md) |  | [optional] [default to None]
**organization_updated** | [***models::AuditLogOrganizationUpdated**](AuditLog_organization_updated.md) |  | [optional] [default to None]
**project_created** | [***models::AuditLogProjectCreated**](AuditLog_project_created.md) |  | [optional] [default to None]
**project_updated** | [***models::AuditLogProjectUpdated**](AuditLog_project_updated.md) |  | [optional] [default to None]
**project_archived** | [***models::AuditLogProjectArchived**](AuditLog_project_archived.md) |  | [optional] [default to None]
**rate_limit_updated** | [***models::AuditLogRateLimitUpdated**](AuditLog_rate_limit_updated.md) |  | [optional] [default to None]
**rate_limit_deleted** | [***models::AuditLogRateLimitDeleted**](AuditLog_rate_limit_deleted.md) |  | [optional] [default to None]
**service_account_created** | [***models::AuditLogServiceAccountCreated**](AuditLog_service_account_created.md) |  | [optional] [default to None]
**service_account_updated** | [***models::AuditLogServiceAccountUpdated**](AuditLog_service_account_updated.md) |  | [optional] [default to None]
**service_account_deleted** | [***models::AuditLogServiceAccountDeleted**](AuditLog_service_account_deleted.md) |  | [optional] [default to None]
**user_added** | [***models::AuditLogUserAdded**](AuditLog_user_added.md) |  | [optional] [default to None]
**user_updated** | [***models::AuditLogUserUpdated**](AuditLog_user_updated.md) |  | [optional] [default to None]
**user_deleted** | [***models::AuditLogUserDeleted**](AuditLog_user_deleted.md) |  | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


