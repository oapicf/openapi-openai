# MessageDeltaContentImageFileObject

References an image [File](/docs/api-reference/files) in the content of a message.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**index** | **number** | The index of the content part in the message. | [default to undefined]
**type** | **string** | Always &#x60;image_file&#x60;. | [default to undefined]
**image_file** | [**MessageDeltaContentImageFileObjectImageFile**](MessageDeltaContentImageFileObjectImageFile.md) |  | [optional] [default to undefined]

## Example

```typescript
import { MessageDeltaContentImageFileObject } from './api';

const instance: MessageDeltaContentImageFileObject = {
    index,
    type,
    image_file,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
