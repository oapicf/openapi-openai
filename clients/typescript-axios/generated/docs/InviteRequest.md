# InviteRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**email** | **string** | Send an email to this address | [default to undefined]
**role** | **string** | &#x60;owner&#x60; or &#x60;reader&#x60; | [default to undefined]
**projects** | [**Array&lt;InviteRequestProjectsInner&gt;**](InviteRequestProjectsInner.md) | An array of projects to which membership is granted at the same time the org invite is accepted. If omitted, the user will be invited to the default project for compatibility with legacy behavior. | [optional] [default to undefined]

## Example

```typescript
import { InviteRequest } from './api';

const instance: InviteRequest = {
    email,
    role,
    projects,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
