# ProjectServiceAccountCreateResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**object** | **string** |  | [default to undefined]
**id** | **string** |  | [default to undefined]
**name** | **string** |  | [default to undefined]
**role** | **string** | Service accounts can only have one role of type &#x60;member&#x60; | [default to undefined]
**created_at** | **number** |  | [default to undefined]
**api_key** | [**ProjectServiceAccountApiKey**](ProjectServiceAccountApiKey.md) |  | [default to undefined]

## Example

```typescript
import { ProjectServiceAccountCreateResponse } from './api';

const instance: ProjectServiceAccountCreateResponse = {
    object,
    id,
    name,
    role,
    created_at,
    api_key,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
