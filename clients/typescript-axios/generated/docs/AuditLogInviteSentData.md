# AuditLogInviteSentData

The payload used to create the invite.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**email** | **string** | The email invited to the organization. | [optional] [default to undefined]
**role** | **string** | The role the email was invited to be. Is either &#x60;owner&#x60; or &#x60;member&#x60;. | [optional] [default to undefined]

## Example

```typescript
import { AuditLogInviteSentData } from './api';

const instance: AuditLogInviteSentData = {
    email,
    role,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
