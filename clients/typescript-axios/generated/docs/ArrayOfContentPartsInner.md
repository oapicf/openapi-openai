# ArrayOfContentPartsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **string** | Always &#x60;image_file&#x60;. | [default to undefined]
**image_file** | [**MessageContentImageFileObjectImageFile**](MessageContentImageFileObjectImageFile.md) |  | [default to undefined]
**image_url** | [**MessageContentImageUrlObjectImageUrl**](MessageContentImageUrlObjectImageUrl.md) |  | [default to undefined]
**text** | **string** | Text content to be sent to the model | [default to undefined]

## Example

```typescript
import { ArrayOfContentPartsInner } from './api';

const instance: ArrayOfContentPartsInner = {
    type,
    image_file,
    image_url,
    text,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
