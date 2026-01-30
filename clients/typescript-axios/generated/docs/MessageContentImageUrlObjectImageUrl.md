# MessageContentImageUrlObjectImageUrl


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**url** | **string** | The external URL of the image, must be a supported image types: jpeg, jpg, png, gif, webp. | [default to undefined]
**detail** | **string** | Specifies the detail level of the image. &#x60;low&#x60; uses fewer tokens, you can opt in to high resolution using &#x60;high&#x60;. Default value is &#x60;auto&#x60; | [optional] [default to DetailEnum_Auto]

## Example

```typescript
import { MessageContentImageUrlObjectImageUrl } from './api';

const instance: MessageContentImageUrlObjectImageUrl = {
    url,
    detail,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
