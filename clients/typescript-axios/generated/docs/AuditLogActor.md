# AuditLogActor

The actor who performed the audit logged action.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **string** | The type of actor. Is either &#x60;session&#x60; or &#x60;api_key&#x60;. | [optional] [default to undefined]
**session** | [**AuditLogActorSession**](.md) |  | [optional] [default to undefined]
**api_key** | [**AuditLogActorApiKey**](.md) |  | [optional] [default to undefined]

## Example

```typescript
import { AuditLogActor } from './api';

const instance: AuditLogActor = {
    type,
    session,
    api_key,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
