# MessageDeltaContentImageUrlObject

References an image URL in the content of a message.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**index** | **number** | The index of the content part in the message. | [default to undefined]
**type** | **string** | Always &#x60;image_url&#x60;. | [default to undefined]
**image_url** | [**MessageDeltaContentImageUrlObjectImageUrl**](MessageDeltaContentImageUrlObjectImageUrl.md) |  | [optional] [default to undefined]

## Example

```typescript
import { MessageDeltaContentImageUrlObject } from './api';

const instance: MessageDeltaContentImageUrlObject = {
    index,
    type,
    image_url,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
