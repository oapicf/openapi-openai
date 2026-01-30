# AuditLog
## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **id** | **String** | The ID of this log. | [default to null] |
| **type** | [**AuditLogEventType**](AuditLogEventType.md) |  | [default to null] |
| **effective\_at** | **Integer** | The Unix timestamp (in seconds) of the event. | [default to null] |
| **project** | [**AuditLog_project**](AuditLog_project.md) |  | [optional] [default to null] |
| **actor** | [**AuditLogActor**](AuditLogActor.md) |  | [default to null] |
| **api\_key.created** | [**AuditLog_api_key_created**](AuditLog_api_key_created.md) |  | [optional] [default to null] |
| **api\_key.updated** | [**AuditLog_api_key_updated**](AuditLog_api_key_updated.md) |  | [optional] [default to null] |
| **api\_key.deleted** | [**AuditLog_api_key_deleted**](AuditLog_api_key_deleted.md) |  | [optional] [default to null] |
| **invite.sent** | [**AuditLog_invite_sent**](AuditLog_invite_sent.md) |  | [optional] [default to null] |
| **invite.accepted** | [**AuditLog_invite_accepted**](AuditLog_invite_accepted.md) |  | [optional] [default to null] |
| **invite.deleted** | [**AuditLog_invite_accepted**](AuditLog_invite_accepted.md) |  | [optional] [default to null] |
| **login.failed** | [**AuditLog_login_failed**](AuditLog_login_failed.md) |  | [optional] [default to null] |
| **logout.failed** | [**AuditLog_login_failed**](AuditLog_login_failed.md) |  | [optional] [default to null] |
| **organization.updated** | [**AuditLog_organization_updated**](AuditLog_organization_updated.md) |  | [optional] [default to null] |
| **project.created** | [**AuditLog_project_created**](AuditLog_project_created.md) |  | [optional] [default to null] |
| **project.updated** | [**AuditLog_project_updated**](AuditLog_project_updated.md) |  | [optional] [default to null] |
| **project.archived** | [**AuditLog_project_archived**](AuditLog_project_archived.md) |  | [optional] [default to null] |
| **rate\_limit.updated** | [**AuditLog_rate_limit_updated**](AuditLog_rate_limit_updated.md) |  | [optional] [default to null] |
| **rate\_limit.deleted** | [**AuditLog_rate_limit_deleted**](AuditLog_rate_limit_deleted.md) |  | [optional] [default to null] |
| **service\_account.created** | [**AuditLog_service_account_created**](AuditLog_service_account_created.md) |  | [optional] [default to null] |
| **service\_account.updated** | [**AuditLog_service_account_updated**](AuditLog_service_account_updated.md) |  | [optional] [default to null] |
| **service\_account.deleted** | [**AuditLog_service_account_deleted**](AuditLog_service_account_deleted.md) |  | [optional] [default to null] |
| **user.added** | [**AuditLog_user_added**](AuditLog_user_added.md) |  | [optional] [default to null] |
| **user.updated** | [**AuditLog_user_updated**](AuditLog_user_updated.md) |  | [optional] [default to null] |
| **user.deleted** | [**AuditLog_user_deleted**](AuditLog_user_deleted.md) |  | [optional] [default to null] |

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

