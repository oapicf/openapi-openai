# MessageDeltaContentTextObject

The text content that is part of a message.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**index** | **number** | The index of the content part in the message. | [default to undefined]
**type** | **string** | Always &#x60;text&#x60;. | [default to undefined]
**text** | [**MessageDeltaContentTextObjectText**](MessageDeltaContentTextObjectText.md) |  | [optional] [default to undefined]

## Example

```typescript
import { MessageDeltaContentTextObject } from './api';

const instance: MessageDeltaContentTextObject = {
    index,
    type,
    text,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
