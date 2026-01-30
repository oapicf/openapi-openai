# CompleteUploadRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**part_ids** | **Array&lt;string&gt;** | The ordered list of Part IDs.  | [default to undefined]
**md5** | **string** | The optional md5 checksum for the file contents to verify if the bytes uploaded matches what you expect.  | [optional] [default to undefined]

## Example

```typescript
import { CompleteUploadRequest } from './api';

const instance: CompleteUploadRequest = {
    part_ids,
    md5,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
