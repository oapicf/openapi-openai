# MessageDeltaContentImageFileObjectImageFile


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**file_id** | **string** | The [File](/docs/api-reference/files) ID of the image in the message content. Set &#x60;purpose&#x3D;\&quot;vision\&quot;&#x60; when uploading the File if you need to later display the file content. | [optional] [default to undefined]
**detail** | **string** | Specifies the detail level of the image if specified by the user. &#x60;low&#x60; uses fewer tokens, you can opt in to high resolution using &#x60;high&#x60;. | [optional] [default to DetailEnum_Auto]

## Example

```typescript
import { MessageDeltaContentImageFileObjectImageFile } from './api';

const instance: MessageDeltaContentImageFileObjectImageFile = {
    file_id,
    detail,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
