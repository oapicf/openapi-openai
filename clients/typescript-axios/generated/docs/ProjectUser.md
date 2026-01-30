# ProjectUser

Represents an individual user in a project.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**object** | **string** | The object type, which is always &#x60;organization.project.user&#x60; | [default to undefined]
**id** | **string** | The identifier, which can be referenced in API endpoints | [default to undefined]
**name** | **string** | The name of the user | [default to undefined]
**email** | **string** | The email address of the user | [default to undefined]
**role** | **string** | &#x60;owner&#x60; or &#x60;member&#x60; | [default to undefined]
**added_at** | **number** | The Unix timestamp (in seconds) of when the project was added. | [default to undefined]

## Example

```typescript
import { ProjectUser } from './api';

const instance: ProjectUser = {
    object,
    id,
    name,
    email,
    role,
    added_at,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
