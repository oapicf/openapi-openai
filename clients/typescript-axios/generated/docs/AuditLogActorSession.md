# AuditLogActorSession

The session in which the audit logged action was performed.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**user** | [**AuditLogActorUser**](AuditLogActorUser.md) |  | [optional] [default to undefined]
**ip_address** | **string** | The IP address from which the action was performed. | [optional] [default to undefined]

## Example

```typescript
import { AuditLogActorSession } from './api';

const instance: AuditLogActorSession = {
    user,
    ip_address,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
