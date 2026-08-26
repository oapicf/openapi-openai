# AuditLog

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The ID of this log. | 
**r#type** | [**models::AuditLogEventType**](AuditLogEventType.md) |  | 
**effective_at** | **i32** | The Unix timestamp (in seconds) of the event. | 
**project** | Option<[**models::AuditLogProject**](AuditLogProject.md)> |  | [optional]
**actor** | [**models::AuditLogActor**](AuditLogActor.md) |  | 
**api_key_created** | Option<[**models::AuditLogApiKeyCreated**](AuditLogApiKeyCreated.md)> |  | [optional]
**api_key_updated** | Option<[**models::AuditLogApiKeyUpdated**](AuditLogApiKeyUpdated.md)> |  | [optional]
**api_key_deleted** | Option<[**models::AuditLogApiKeyDeleted**](AuditLogApiKeyDeleted.md)> |  | [optional]
**invite_sent** | Option<[**models::AuditLogInviteSent**](AuditLogInviteSent.md)> |  | [optional]
**invite_accepted** | Option<[**models::AuditLogInviteAccepted**](AuditLogInviteAccepted.md)> |  | [optional]
**invite_deleted** | Option<[**models::AuditLogInviteAccepted**](AuditLogInviteAccepted.md)> |  | [optional]
**login_failed** | Option<[**models::AuditLogLoginFailed**](AuditLogLoginFailed.md)> |  | [optional]
**logout_failed** | Option<[**models::AuditLogLoginFailed**](AuditLogLoginFailed.md)> |  | [optional]
**organization_updated** | Option<[**models::AuditLogOrganizationUpdated**](AuditLogOrganizationUpdated.md)> |  | [optional]
**project_created** | Option<[**models::AuditLogProjectCreated**](AuditLogProjectCreated.md)> |  | [optional]
**project_updated** | Option<[**models::AuditLogProjectUpdated**](AuditLogProjectUpdated.md)> |  | [optional]
**project_archived** | Option<[**models::AuditLogProjectArchived**](AuditLogProjectArchived.md)> |  | [optional]
**rate_limit_updated** | Option<[**models::AuditLogRateLimitUpdated**](AuditLogRateLimitUpdated.md)> |  | [optional]
**rate_limit_deleted** | Option<[**models::AuditLogRateLimitDeleted**](AuditLogRateLimitDeleted.md)> |  | [optional]
**service_account_created** | Option<[**models::AuditLogServiceAccountCreated**](AuditLogServiceAccountCreated.md)> |  | [optional]
**service_account_updated** | Option<[**models::AuditLogServiceAccountUpdated**](AuditLogServiceAccountUpdated.md)> |  | [optional]
**service_account_deleted** | Option<[**models::AuditLogServiceAccountDeleted**](AuditLogServiceAccountDeleted.md)> |  | [optional]
**user_added** | Option<[**models::AuditLogUserAdded**](AuditLogUserAdded.md)> |  | [optional]
**user_updated** | Option<[**models::AuditLogUserUpdated**](AuditLogUserUpdated.md)> |  | [optional]
**user_deleted** | Option<[**models::AuditLogUserDeleted**](AuditLogUserDeleted.md)> |  | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


