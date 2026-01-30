# WWW::OpenAPIClient::Object::AuditLog

## Load the model package
```perl
use WWW::OpenAPIClient::Object::AuditLog;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **string** | The ID of this log. | 
**type** | [**AuditLogEventType**](AuditLogEventType.md) |  | 
**effective_at** | **int** | The Unix timestamp (in seconds) of the event. | 
**project** | [**AuditLogProject**](AuditLogProject.md) |  | [optional] 
**actor** | [**AuditLogActor**](AuditLogActor.md) |  | 
**api_key/created** | [**AuditLogApiKeyCreated**](AuditLogApiKeyCreated.md) |  | [optional] 
**api_key/updated** | [**AuditLogApiKeyUpdated**](AuditLogApiKeyUpdated.md) |  | [optional] 
**api_key/deleted** | [**AuditLogApiKeyDeleted**](AuditLogApiKeyDeleted.md) |  | [optional] 
**invite/sent** | [**AuditLogInviteSent**](AuditLogInviteSent.md) |  | [optional] 
**invite/accepted** | [**AuditLogInviteAccepted**](AuditLogInviteAccepted.md) |  | [optional] 
**invite/deleted** | [**AuditLogInviteAccepted**](AuditLogInviteAccepted.md) |  | [optional] 
**login/failed** | [**AuditLogLoginFailed**](AuditLogLoginFailed.md) |  | [optional] 
**logout/failed** | [**AuditLogLoginFailed**](AuditLogLoginFailed.md) |  | [optional] 
**organization/updated** | [**AuditLogOrganizationUpdated**](AuditLogOrganizationUpdated.md) |  | [optional] 
**project/created** | [**AuditLogProjectCreated**](AuditLogProjectCreated.md) |  | [optional] 
**project/updated** | [**AuditLogProjectUpdated**](AuditLogProjectUpdated.md) |  | [optional] 
**project/archived** | [**AuditLogProjectArchived**](AuditLogProjectArchived.md) |  | [optional] 
**rate_limit/updated** | [**AuditLogRateLimitUpdated**](AuditLogRateLimitUpdated.md) |  | [optional] 
**rate_limit/deleted** | [**AuditLogRateLimitDeleted**](AuditLogRateLimitDeleted.md) |  | [optional] 
**service_account/created** | [**AuditLogServiceAccountCreated**](AuditLogServiceAccountCreated.md) |  | [optional] 
**service_account/updated** | [**AuditLogServiceAccountUpdated**](AuditLogServiceAccountUpdated.md) |  | [optional] 
**service_account/deleted** | [**AuditLogServiceAccountDeleted**](AuditLogServiceAccountDeleted.md) |  | [optional] 
**user/added** | [**AuditLogUserAdded**](AuditLogUserAdded.md) |  | [optional] 
**user/updated** | [**AuditLogUserUpdated**](AuditLogUserUpdated.md) |  | [optional] 
**user/deleted** | [**AuditLogUserDeleted**](AuditLogUserDeleted.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


