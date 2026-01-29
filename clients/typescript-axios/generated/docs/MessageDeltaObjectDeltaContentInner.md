# MessageDeltaObjectDeltaContentInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**index** | **number** | The index of the content part in the message. | [default to undefined]
**type** | **string** | Always &#x60;image_file&#x60;. | [default to undefined]
**image_file** | [**MessageDeltaContentImageFileObjectImageFile**](MessageDeltaContentImageFileObjectImageFile.md) |  | [optional] [default to undefined]
**text** | [**MessageDeltaContentTextObjectText**](MessageDeltaContentTextObjectText.md) |  | [optional] [default to undefined]

## Example

```typescript
import { MessageDeltaObjectDeltaContentInner } from './api';

const instance: MessageDeltaObjectDeltaContentInner = {
    index,
    type,
    image_file,
    text,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
