# AuditLogOrganizationUpdatedChangesRequested

The payload used to update the organization settings.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**title** | **string** | The organization title. | [optional] [default to undefined]
**description** | **string** | The organization description. | [optional] [default to undefined]
**name** | **string** | The organization name. | [optional] [default to undefined]
**settings** | [**AuditLogOrganizationUpdatedChangesRequestedSettings**](AuditLogOrganizationUpdatedChangesRequestedSettings.md) |  | [optional] [default to undefined]

## Example

```typescript
import { AuditLogOrganizationUpdatedChangesRequested } from './api';

const instance: AuditLogOrganizationUpdatedChangesRequested = {
    title,
    description,
    name,
    settings,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
