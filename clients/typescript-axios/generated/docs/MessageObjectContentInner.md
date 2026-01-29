# MessageObjectContentInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **string** | Always &#x60;image_file&#x60;. | [default to undefined]
**image_file** | [**MessageContentImageFileObjectImageFile**](MessageContentImageFileObjectImageFile.md) |  | [default to undefined]
**text** | [**MessageContentTextObjectText**](MessageContentTextObjectText.md) |  | [default to undefined]

## Example

```typescript
import { MessageObjectContentInner } from './api';

const instance: MessageObjectContentInner = {
    type,
    image_file,
    text,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
