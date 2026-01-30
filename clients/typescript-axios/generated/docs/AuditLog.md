# AuditLog

A log of a user action or configuration change within this organization.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **string** | The ID of this log. | [default to undefined]
**type** | [**AuditLogEventType**](AuditLogEventType.md) |  | [default to undefined]
**effective_at** | **number** | The Unix timestamp (in seconds) of the event. | [default to undefined]
**project** | [**AuditLogProject**](AuditLogProject.md) |  | [optional] [default to undefined]
**actor** | [**AuditLogActor**](AuditLogActor.md) |  | [default to undefined]
**api_key_created** | [**AuditLogApiKeyCreated**](AuditLogApiKeyCreated.md) |  | [optional] [default to undefined]
**api_key_updated** | [**AuditLogApiKeyUpdated**](AuditLogApiKeyUpdated.md) |  | [optional] [default to undefined]
**api_key_deleted** | [**AuditLogApiKeyDeleted**](AuditLogApiKeyDeleted.md) |  | [optional] [default to undefined]
**invite_sent** | [**AuditLogInviteSent**](AuditLogInviteSent.md) |  | [optional] [default to undefined]
**invite_accepted** | [**AuditLogInviteAccepted**](AuditLogInviteAccepted.md) |  | [optional] [default to undefined]
**invite_deleted** | [**AuditLogInviteAccepted**](AuditLogInviteAccepted.md) |  | [optional] [default to undefined]
**login_failed** | [**AuditLogLoginFailed**](AuditLogLoginFailed.md) |  | [optional] [default to undefined]
**logout_failed** | [**AuditLogLoginFailed**](AuditLogLoginFailed.md) |  | [optional] [default to undefined]
**organization_updated** | [**AuditLogOrganizationUpdated**](AuditLogOrganizationUpdated.md) |  | [optional] [default to undefined]
**project_created** | [**AuditLogProjectCreated**](AuditLogProjectCreated.md) |  | [optional] [default to undefined]
**project_updated** | [**AuditLogProjectUpdated**](AuditLogProjectUpdated.md) |  | [optional] [default to undefined]
**project_archived** | [**AuditLogProjectArchived**](AuditLogProjectArchived.md) |  | [optional] [default to undefined]
**rate_limit_updated** | [**AuditLogRateLimitUpdated**](AuditLogRateLimitUpdated.md) |  | [optional] [default to undefined]
**rate_limit_deleted** | [**AuditLogRateLimitDeleted**](AuditLogRateLimitDeleted.md) |  | [optional] [default to undefined]
**service_account_created** | [**AuditLogServiceAccountCreated**](AuditLogServiceAccountCreated.md) |  | [optional] [default to undefined]
**service_account_updated** | [**AuditLogServiceAccountUpdated**](AuditLogServiceAccountUpdated.md) |  | [optional] [default to undefined]
**service_account_deleted** | [**AuditLogServiceAccountDeleted**](AuditLogServiceAccountDeleted.md) |  | [optional] [default to undefined]
**user_added** | [**AuditLogUserAdded**](AuditLogUserAdded.md) |  | [optional] [default to undefined]
**user_updated** | [**AuditLogUserUpdated**](AuditLogUserUpdated.md) |  | [optional] [default to undefined]
**user_deleted** | [**AuditLogUserDeleted**](AuditLogUserDeleted.md) |  | [optional] [default to undefined]

## Example

```typescript
import { AuditLog } from './api';

const instance: AuditLog = {
    id,
    type,
    effective_at,
    project,
    actor,
    api_key_created,
    api_key_updated,
    api_key_deleted,
    invite_sent,
    invite_accepted,
    invite_deleted,
    login_failed,
    logout_failed,
    organization_updated,
    project_created,
    project_updated,
    project_archived,
    rate_limit_updated,
    rate_limit_deleted,
    service_account_created,
    service_account_updated,
    service_account_deleted,
    user_added,
    user_updated,
    user_deleted,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
