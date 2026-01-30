# AUDIT_LOG

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**STRING_32**](STRING_32.md) | The ID of this log. | [default to null]
**type** | [**AUDIT_LOG_EVENT_TYPE**](AuditLogEventType.md) |  | [default to null]
**effective_at** | **INTEGER_32** | The Unix timestamp (in seconds) of the event. | [default to null]
**project** | [**AUDIT_LOG_PROJECT**](AuditLog_project.md) |  | [optional] [default to null]
**actor** | [**AUDIT_LOG_ACTOR**](AuditLogActor.md) |  | [default to null]
**api_key_created** | [**AUDIT_LOG_API_KEY_CREATED**](AuditLog_api_key_created.md) |  | [optional] [default to null]
**api_key_updated** | [**AUDIT_LOG_API_KEY_UPDATED**](AuditLog_api_key_updated.md) |  | [optional] [default to null]
**api_key_deleted** | [**AUDIT_LOG_API_KEY_DELETED**](AuditLog_api_key_deleted.md) |  | [optional] [default to null]
**invite_sent** | [**AUDIT_LOG_INVITE_SENT**](AuditLog_invite_sent.md) |  | [optional] [default to null]
**invite_accepted** | [**AUDIT_LOG_INVITE_ACCEPTED**](AuditLog_invite_accepted.md) |  | [optional] [default to null]
**invite_deleted** | [**AUDIT_LOG_INVITE_ACCEPTED**](AuditLog_invite_accepted.md) |  | [optional] [default to null]
**login_failed** | [**AUDIT_LOG_LOGIN_FAILED**](AuditLog_login_failed.md) |  | [optional] [default to null]
**logout_failed** | [**AUDIT_LOG_LOGIN_FAILED**](AuditLog_login_failed.md) |  | [optional] [default to null]
**organization_updated** | [**AUDIT_LOG_ORGANIZATION_UPDATED**](AuditLog_organization_updated.md) |  | [optional] [default to null]
**project_created** | [**AUDIT_LOG_PROJECT_CREATED**](AuditLog_project_created.md) |  | [optional] [default to null]
**project_updated** | [**AUDIT_LOG_PROJECT_UPDATED**](AuditLog_project_updated.md) |  | [optional] [default to null]
**project_archived** | [**AUDIT_LOG_PROJECT_ARCHIVED**](AuditLog_project_archived.md) |  | [optional] [default to null]
**rate_limit_updated** | [**AUDIT_LOG_RATE_LIMIT_UPDATED**](AuditLog_rate_limit_updated.md) |  | [optional] [default to null]
**rate_limit_deleted** | [**AUDIT_LOG_RATE_LIMIT_DELETED**](AuditLog_rate_limit_deleted.md) |  | [optional] [default to null]
**service_account_created** | [**AUDIT_LOG_SERVICE_ACCOUNT_CREATED**](AuditLog_service_account_created.md) |  | [optional] [default to null]
**service_account_updated** | [**AUDIT_LOG_SERVICE_ACCOUNT_UPDATED**](AuditLog_service_account_updated.md) |  | [optional] [default to null]
**service_account_deleted** | [**AUDIT_LOG_SERVICE_ACCOUNT_DELETED**](AuditLog_service_account_deleted.md) |  | [optional] [default to null]
**user_added** | [**AUDIT_LOG_USER_ADDED**](AuditLog_user_added.md) |  | [optional] [default to null]
**user_updated** | [**AUDIT_LOG_USER_UPDATED**](AuditLog_user_updated.md) |  | [optional] [default to null]
**user_deleted** | [**AUDIT_LOG_USER_DELETED**](AuditLog_user_deleted.md) |  | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


