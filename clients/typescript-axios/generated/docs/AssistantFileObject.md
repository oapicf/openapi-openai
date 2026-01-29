# AssistantFileObject

A list of [Files](/docs/api-reference/files) attached to an `assistant`.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **string** | The identifier, which can be referenced in API endpoints. | [default to undefined]
**object** | **string** | The object type, which is always &#x60;assistant.file&#x60;. | [default to undefined]
**created_at** | **number** | The Unix timestamp (in seconds) for when the assistant file was created. | [default to undefined]
**assistant_id** | **string** | The assistant ID that the file is attached to. | [default to undefined]

## Example

```typescript
import { AssistantFileObject } from './api';

const instance: AssistantFileObject = {
    id,
    object,
    created_at,
    assistant_id,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
