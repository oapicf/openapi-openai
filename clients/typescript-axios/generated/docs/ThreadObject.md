# ThreadObject

Represents a thread that contains [messages](/docs/api-reference/messages).

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **string** | The identifier, which can be referenced in API endpoints. | [default to undefined]
**object** | **string** | The object type, which is always &#x60;thread&#x60;. | [default to undefined]
**created_at** | **number** | The Unix timestamp (in seconds) for when the thread was created. | [default to undefined]
**tool_resources** | [**ModifyThreadRequestToolResources**](ModifyThreadRequestToolResources.md) |  | [default to undefined]
**metadata** | **object** | Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  | [default to undefined]

## Example

```typescript
import { ThreadObject } from './api';

const instance: ThreadObject = {
    id,
    object,
    created_at,
    tool_resources,
    metadata,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
