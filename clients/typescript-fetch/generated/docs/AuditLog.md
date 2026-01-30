
# AuditLog

A log of a user action or configuration change within this organization.

## Properties

Name | Type
------------ | -------------
`id` | string
`type` | [AuditLogEventType](AuditLogEventType.md)
`effectiveAt` | number
`project` | [AuditLogProject](AuditLogProject.md)
`actor` | [AuditLogActor](AuditLogActor.md)
`apiKeyCreated` | [AuditLogApiKeyCreated](AuditLogApiKeyCreated.md)
`apiKeyUpdated` | [AuditLogApiKeyUpdated](AuditLogApiKeyUpdated.md)
`apiKeyDeleted` | [AuditLogApiKeyDeleted](AuditLogApiKeyDeleted.md)
`inviteSent` | [AuditLogInviteSent](AuditLogInviteSent.md)
`inviteAccepted` | [AuditLogInviteAccepted](AuditLogInviteAccepted.md)
`inviteDeleted` | [AuditLogInviteAccepted](AuditLogInviteAccepted.md)
`loginFailed` | [AuditLogLoginFailed](AuditLogLoginFailed.md)
`logoutFailed` | [AuditLogLoginFailed](AuditLogLoginFailed.md)
`organizationUpdated` | [AuditLogOrganizationUpdated](AuditLogOrganizationUpdated.md)
`projectCreated` | [AuditLogProjectCreated](AuditLogProjectCreated.md)
`projectUpdated` | [AuditLogProjectUpdated](AuditLogProjectUpdated.md)
`projectArchived` | [AuditLogProjectArchived](AuditLogProjectArchived.md)
`rateLimitUpdated` | [AuditLogRateLimitUpdated](AuditLogRateLimitUpdated.md)
`rateLimitDeleted` | [AuditLogRateLimitDeleted](AuditLogRateLimitDeleted.md)
`serviceAccountCreated` | [AuditLogServiceAccountCreated](AuditLogServiceAccountCreated.md)
`serviceAccountUpdated` | [AuditLogServiceAccountUpdated](AuditLogServiceAccountUpdated.md)
`serviceAccountDeleted` | [AuditLogServiceAccountDeleted](AuditLogServiceAccountDeleted.md)
`userAdded` | [AuditLogUserAdded](AuditLogUserAdded.md)
`userUpdated` | [AuditLogUserUpdated](AuditLogUserUpdated.md)
`userDeleted` | [AuditLogUserDeleted](AuditLogUserDeleted.md)

## Example

```typescript
import type { AuditLog } from ''

// TODO: Update the object below with actual values
const example = {
  "id": null,
  "type": null,
  "effectiveAt": null,
  "project": null,
  "actor": null,
  "apiKeyCreated": null,
  "apiKeyUpdated": null,
  "apiKeyDeleted": null,
  "inviteSent": null,
  "inviteAccepted": null,
  "inviteDeleted": null,
  "loginFailed": null,
  "logoutFailed": null,
  "organizationUpdated": null,
  "projectCreated": null,
  "projectUpdated": null,
  "projectArchived": null,
  "rateLimitUpdated": null,
  "rateLimitDeleted": null,
  "serviceAccountCreated": null,
  "serviceAccountUpdated": null,
  "serviceAccountDeleted": null,
  "userAdded": null,
  "userUpdated": null,
  "userDeleted": null,
} satisfies AuditLog

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as AuditLog
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


