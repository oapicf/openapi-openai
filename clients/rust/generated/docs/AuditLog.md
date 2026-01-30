# AuditLog

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The ID of this log. | 
**r#type** | [**models::AuditLogEventType**](AuditLogEventType.md) |  | 
**effective_at** | **i32** | The Unix timestamp (in seconds) of the event. | 
**project** | Option<[**models::AuditLogProject**](AuditLog_project.md)> |  | [optional]
**actor** | [**models::AuditLogActor**](AuditLogActor.md) |  | 
**api_key_created** | Option<[**models::AuditLogApiKeyCreated**](AuditLog_api_key_created.md)> |  | [optional]
**api_key_updated** | Option<[**models::AuditLogApiKeyUpdated**](AuditLog_api_key_updated.md)> |  | [optional]
**api_key_deleted** | Option<[**models::AuditLogApiKeyDeleted**](AuditLog_api_key_deleted.md)> |  | [optional]
**invite_sent** | Option<[**models::AuditLogInviteSent**](AuditLog_invite_sent.md)> |  | [optional]
**invite_accepted** | Option<[**models::AuditLogInviteAccepted**](AuditLog_invite_accepted.md)> |  | [optional]
**invite_deleted** | Option<[**models::AuditLogInviteAccepted**](AuditLog_invite_accepted.md)> |  | [optional]
**login_failed** | Option<[**models::AuditLogLoginFailed**](AuditLog_login_failed.md)> |  | [optional]
**logout_failed** | Option<[**models::AuditLogLoginFailed**](AuditLog_login_failed.md)> |  | [optional]
**organization_updated** | Option<[**models::AuditLogOrganizationUpdated**](AuditLog_organization_updated.md)> |  | [optional]
**project_created** | Option<[**models::AuditLogProjectCreated**](AuditLog_project_created.md)> |  | [optional]
**project_updated** | Option<[**models::AuditLogProjectUpdated**](AuditLog_project_updated.md)> |  | [optional]
**project_archived** | Option<[**models::AuditLogProjectArchived**](AuditLog_project_archived.md)> |  | [optional]
**rate_limit_updated** | Option<[**models::AuditLogRateLimitUpdated**](AuditLog_rate_limit_updated.md)> |  | [optional]
**rate_limit_deleted** | Option<[**models::AuditLogRateLimitDeleted**](AuditLog_rate_limit_deleted.md)> |  | [optional]
**service_account_created** | Option<[**models::AuditLogServiceAccountCreated**](AuditLog_service_account_created.md)> |  | [optional]
**service_account_updated** | Option<[**models::AuditLogServiceAccountUpdated**](AuditLog_service_account_updated.md)> |  | [optional]
**service_account_deleted** | Option<[**models::AuditLogServiceAccountDeleted**](AuditLog_service_account_deleted.md)> |  | [optional]
**user_added** | Option<[**models::AuditLogUserAdded**](AuditLog_user_added.md)> |  | [optional]
**user_updated** | Option<[**models::AuditLogUserUpdated**](AuditLog_user_updated.md)> |  | [optional]
**user_deleted** | Option<[**models::AuditLogUserDeleted**](AuditLog_user_deleted.md)> |  | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


