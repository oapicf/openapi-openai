# AuditLogApiKeyCreatedData

The payload used to create the API key.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scopes** | **Array&lt;string&gt;** | A list of scopes allowed for the API key, e.g. &#x60;[\&quot;api.model.request\&quot;]&#x60; | [optional] [default to undefined]

## Example

```typescript
import { AuditLogApiKeyCreatedData } from './api';

const instance: AuditLogApiKeyCreatedData = {
    scopes,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
