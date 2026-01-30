# AuditLogApiKeyUpdated

The details for events with this `type`.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **string** | The tracking ID of the API key. | [optional] [default to undefined]
**changes_requested** | [**AuditLogApiKeyUpdatedChangesRequested**](AuditLogApiKeyUpdatedChangesRequested.md) |  | [optional] [default to undefined]

## Example

```typescript
import { AuditLogApiKeyUpdated } from './api';

const instance: AuditLogApiKeyUpdated = {
    id,
    changes_requested,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
