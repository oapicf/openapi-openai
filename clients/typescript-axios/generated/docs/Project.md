# Project

Represents an individual project.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **string** | The identifier, which can be referenced in API endpoints | [default to undefined]
**object** | **string** | The object type, which is always &#x60;organization.project&#x60; | [default to undefined]
**name** | **string** | The name of the project. This appears in reporting. | [default to undefined]
**created_at** | **number** | The Unix timestamp (in seconds) of when the project was created. | [default to undefined]
**archived_at** | **number** | The Unix timestamp (in seconds) of when the project was archived or &#x60;null&#x60;. | [optional] [default to undefined]
**status** | **string** | &#x60;active&#x60; or &#x60;archived&#x60; | [default to undefined]

## Example

```typescript
import { Project } from './api';

const instance: Project = {
    id,
    object,
    name,
    created_at,
    archived_at,
    status,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
