# MessageContentImageFileObject

References an image [File](/docs/api-reference/files) in the content of a message.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **string** | Always &#x60;image_file&#x60;. | [default to undefined]
**image_file** | [**MessageContentImageFileObjectImageFile**](MessageContentImageFileObjectImageFile.md) |  | [default to undefined]

## Example

```typescript
import { MessageContentImageFileObject } from './api';

const instance: MessageContentImageFileObject = {
    type,
    image_file,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
