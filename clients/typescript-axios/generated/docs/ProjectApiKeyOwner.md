# ProjectApiKeyOwner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **string** | &#x60;user&#x60; or &#x60;service_account&#x60; | [optional] [default to undefined]
**user** | [**ProjectUser**](ProjectUser.md) |  | [optional] [default to undefined]
**service_account** | [**ProjectServiceAccount**](ProjectServiceAccount.md) |  | [optional] [default to undefined]

## Example

```typescript
import { ProjectApiKeyOwner } from './api';

const instance: ProjectApiKeyOwner = {
    type,
    user,
    service_account,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
