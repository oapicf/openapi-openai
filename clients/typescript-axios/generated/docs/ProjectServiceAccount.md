# ProjectServiceAccount

Represents an individual service account in a project.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**object** | **string** | The object type, which is always &#x60;organization.project.service_account&#x60; | [default to undefined]
**id** | **string** | The identifier, which can be referenced in API endpoints | [default to undefined]
**name** | **string** | The name of the service account | [default to undefined]
**role** | **string** | &#x60;owner&#x60; or &#x60;member&#x60; | [default to undefined]
**created_at** | **number** | The Unix timestamp (in seconds) of when the service account was created | [default to undefined]

## Example

```typescript
import { ProjectServiceAccount } from './api';

const instance: ProjectServiceAccount = {
    object,
    id,
    name,
    role,
    created_at,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
