# ProjectApiKey

Represents an individual API key in a project.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**object** | **string** | The object type, which is always &#x60;organization.project.api_key&#x60; | [default to undefined]
**redacted_value** | **string** | The redacted value of the API key | [default to undefined]
**name** | **string** | The name of the API key | [default to undefined]
**created_at** | **number** | The Unix timestamp (in seconds) of when the API key was created | [default to undefined]
**id** | **string** | The identifier, which can be referenced in API endpoints | [default to undefined]
**owner** | [**ProjectApiKeyOwner**](ProjectApiKeyOwner.md) |  | [default to undefined]

## Example

```typescript
import { ProjectApiKey } from './api';

const instance: ProjectApiKey = {
    object,
    redacted_value,
    name,
    created_at,
    id,
    owner,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
