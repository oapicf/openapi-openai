# MessageFileObject

A list of files attached to a `message`.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **string** | The identifier, which can be referenced in API endpoints. | [default to undefined]
**object** | **string** | The object type, which is always &#x60;thread.message.file&#x60;. | [default to undefined]
**created_at** | **number** | The Unix timestamp (in seconds) for when the message file was created. | [default to undefined]
**message_id** | **string** | The ID of the [message](/docs/api-reference/messages) that the [File](/docs/api-reference/files) is attached to. | [default to undefined]

## Example

```typescript
import { MessageFileObject } from './api';

const instance: MessageFileObject = {
    id,
    object,
    created_at,
    message_id,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
