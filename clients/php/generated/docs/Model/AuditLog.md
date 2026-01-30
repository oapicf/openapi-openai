# # AuditLog

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **string** | The ID of this log. |
**type** | [**\OpenAPI\Client\Model\AuditLogEventType**](AuditLogEventType.md) |  |
**effective_at** | **int** | The Unix timestamp (in seconds) of the event. |
**project** | [**\OpenAPI\Client\Model\AuditLogProject**](AuditLogProject.md) |  | [optional]
**actor** | [**\OpenAPI\Client\Model\AuditLogActor**](AuditLogActor.md) |  |
**api_key_created** | [**\OpenAPI\Client\Model\AuditLogApiKeyCreated**](AuditLogApiKeyCreated.md) |  | [optional]
**api_key_updated** | [**\OpenAPI\Client\Model\AuditLogApiKeyUpdated**](AuditLogApiKeyUpdated.md) |  | [optional]
**api_key_deleted** | [**\OpenAPI\Client\Model\AuditLogApiKeyDeleted**](AuditLogApiKeyDeleted.md) |  | [optional]
**invite_sent** | [**\OpenAPI\Client\Model\AuditLogInviteSent**](AuditLogInviteSent.md) |  | [optional]
**invite_accepted** | [**\OpenAPI\Client\Model\AuditLogInviteAccepted**](AuditLogInviteAccepted.md) |  | [optional]
**invite_deleted** | [**\OpenAPI\Client\Model\AuditLogInviteAccepted**](AuditLogInviteAccepted.md) |  | [optional]
**login_failed** | [**\OpenAPI\Client\Model\AuditLogLoginFailed**](AuditLogLoginFailed.md) |  | [optional]
**logout_failed** | [**\OpenAPI\Client\Model\AuditLogLoginFailed**](AuditLogLoginFailed.md) |  | [optional]
**organization_updated** | [**\OpenAPI\Client\Model\AuditLogOrganizationUpdated**](AuditLogOrganizationUpdated.md) |  | [optional]
**project_created** | [**\OpenAPI\Client\Model\AuditLogProjectCreated**](AuditLogProjectCreated.md) |  | [optional]
**project_updated** | [**\OpenAPI\Client\Model\AuditLogProjectUpdated**](AuditLogProjectUpdated.md) |  | [optional]
**project_archived** | [**\OpenAPI\Client\Model\AuditLogProjectArchived**](AuditLogProjectArchived.md) |  | [optional]
**rate_limit_updated** | [**\OpenAPI\Client\Model\AuditLogRateLimitUpdated**](AuditLogRateLimitUpdated.md) |  | [optional]
**rate_limit_deleted** | [**\OpenAPI\Client\Model\AuditLogRateLimitDeleted**](AuditLogRateLimitDeleted.md) |  | [optional]
**service_account_created** | [**\OpenAPI\Client\Model\AuditLogServiceAccountCreated**](AuditLogServiceAccountCreated.md) |  | [optional]
**service_account_updated** | [**\OpenAPI\Client\Model\AuditLogServiceAccountUpdated**](AuditLogServiceAccountUpdated.md) |  | [optional]
**service_account_deleted** | [**\OpenAPI\Client\Model\AuditLogServiceAccountDeleted**](AuditLogServiceAccountDeleted.md) |  | [optional]
**user_added** | [**\OpenAPI\Client\Model\AuditLogUserAdded**](AuditLogUserAdded.md) |  | [optional]
**user_updated** | [**\OpenAPI\Client\Model\AuditLogUserUpdated**](AuditLogUserUpdated.md) |  | [optional]
**user_deleted** | [**\OpenAPI\Client\Model\AuditLogUserDeleted**](AuditLogUserDeleted.md) |  | [optional]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
