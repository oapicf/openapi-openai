# Upload

The Upload object can accept byte chunks in the form of Parts. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **string** | The Upload unique identifier, which can be referenced in API endpoints. | [default to undefined]
**created_at** | **number** | The Unix timestamp (in seconds) for when the Upload was created. | [default to undefined]
**filename** | **string** | The name of the file to be uploaded. | [default to undefined]
**bytes** | **number** | The intended number of bytes to be uploaded. | [default to undefined]
**purpose** | **string** | The intended purpose of the file. [Please refer here](/docs/api-reference/files/object#files/object-purpose) for acceptable values. | [default to undefined]
**status** | **string** | The status of the Upload. | [default to undefined]
**expires_at** | **number** | The Unix timestamp (in seconds) for when the Upload was created. | [default to undefined]
**object** | **string** | The object type, which is always \&quot;upload\&quot;. | [optional] [default to undefined]
**file** | [**OpenAIFile**](OpenAIFile.md) |  | [optional] [default to undefined]

## Example

```typescript
import { Upload } from './api';

const instance: Upload = {
    id,
    created_at,
    filename,
    bytes,
    purpose,
    status,
    expires_at,
    object,
    file,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
