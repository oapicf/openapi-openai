# CreateUploadRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**filename** | **string** | The name of the file to upload.  | [default to undefined]
**purpose** | **string** | The intended purpose of the uploaded file.  See the [documentation on File purposes](/docs/api-reference/files/create#files-create-purpose).  | [default to undefined]
**bytes** | **number** | The number of bytes in the file you are uploading.  | [default to undefined]
**mime_type** | **string** | The MIME type of the file.  This must fall within the supported MIME types for your file purpose. See the supported MIME types for assistants and vision.  | [default to undefined]

## Example

```typescript
import { CreateUploadRequest } from './api';

const instance: CreateUploadRequest = {
    filename,
    purpose,
    bytes,
    mime_type,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
