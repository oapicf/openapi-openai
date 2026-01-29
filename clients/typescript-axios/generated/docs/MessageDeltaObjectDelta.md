# MessageDeltaObjectDelta

The delta containing the fields that have changed on the Message.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**role** | **string** | The entity that produced the message. One of &#x60;user&#x60; or &#x60;assistant&#x60;. | [optional] [default to undefined]
**content** | [**Array&lt;MessageDeltaObjectDeltaContentInner&gt;**](MessageDeltaObjectDeltaContentInner.md) | The content of the message in array of text and/or images. | [optional] [default to undefined]
**file_ids** | **Array&lt;string&gt;** | A list of [file](/docs/api-reference/files) IDs that the assistant should use. Useful for tools like retrieval and code_interpreter that can access files. A maximum of 10 files can be attached to a message. | [optional] [default to undefined]

## Example

```typescript
import { MessageDeltaObjectDelta } from './api';

const instance: MessageDeltaObjectDelta = {
    role,
    content,
    file_ids,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
