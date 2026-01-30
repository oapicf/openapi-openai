# AuditLog

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **string** | The ID of this log. | 
**type** | [**OpenAPI\Server\Model\AuditLogEventType**](AuditLogEventType.md) |  | 
**effectiveAt** | **int** | The Unix timestamp (in seconds) of the event. | 
**project** | [**OpenAPI\Server\Model\AuditLogProject**](AuditLogProject.md) |  | [optional] 
**actor** | [**OpenAPI\Server\Model\AuditLogActor**](AuditLogActor.md) |  | 
**apiKeyCreated** | [**OpenAPI\Server\Model\AuditLogApiKeyCreated**](AuditLogApiKeyCreated.md) |  | [optional] 
**apiKeyUpdated** | [**OpenAPI\Server\Model\AuditLogApiKeyUpdated**](AuditLogApiKeyUpdated.md) |  | [optional] 
**apiKeyDeleted** | [**OpenAPI\Server\Model\AuditLogApiKeyDeleted**](AuditLogApiKeyDeleted.md) |  | [optional] 
**inviteSent** | [**OpenAPI\Server\Model\AuditLogInviteSent**](AuditLogInviteSent.md) |  | [optional] 
**inviteAccepted** | [**OpenAPI\Server\Model\AuditLogInviteAccepted**](AuditLogInviteAccepted.md) |  | [optional] 
**inviteDeleted** | [**OpenAPI\Server\Model\AuditLogInviteAccepted**](AuditLogInviteAccepted.md) |  | [optional] 
**loginFailed** | [**OpenAPI\Server\Model\AuditLogLoginFailed**](AuditLogLoginFailed.md) |  | [optional] 
**logoutFailed** | [**OpenAPI\Server\Model\AuditLogLoginFailed**](AuditLogLoginFailed.md) |  | [optional] 
**organizationUpdated** | [**OpenAPI\Server\Model\AuditLogOrganizationUpdated**](AuditLogOrganizationUpdated.md) |  | [optional] 
**projectCreated** | [**OpenAPI\Server\Model\AuditLogProjectCreated**](AuditLogProjectCreated.md) |  | [optional] 
**projectUpdated** | [**OpenAPI\Server\Model\AuditLogProjectUpdated**](AuditLogProjectUpdated.md) |  | [optional] 
**projectArchived** | [**OpenAPI\Server\Model\AuditLogProjectArchived**](AuditLogProjectArchived.md) |  | [optional] 
**rateLimitUpdated** | [**OpenAPI\Server\Model\AuditLogRateLimitUpdated**](AuditLogRateLimitUpdated.md) |  | [optional] 
**rateLimitDeleted** | [**OpenAPI\Server\Model\AuditLogRateLimitDeleted**](AuditLogRateLimitDeleted.md) |  | [optional] 
**serviceAccountCreated** | [**OpenAPI\Server\Model\AuditLogServiceAccountCreated**](AuditLogServiceAccountCreated.md) |  | [optional] 
**serviceAccountUpdated** | [**OpenAPI\Server\Model\AuditLogServiceAccountUpdated**](AuditLogServiceAccountUpdated.md) |  | [optional] 
**serviceAccountDeleted** | [**OpenAPI\Server\Model\AuditLogServiceAccountDeleted**](AuditLogServiceAccountDeleted.md) |  | [optional] 
**userAdded** | [**OpenAPI\Server\Model\AuditLogUserAdded**](AuditLogUserAdded.md) |  | [optional] 
**userUpdated** | [**OpenAPI\Server\Model\AuditLogUserUpdated**](AuditLogUserUpdated.md) |  | [optional] 
**userDeleted** | [**OpenAPI\Server\Model\AuditLogUserDeleted**](AuditLogUserDeleted.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


