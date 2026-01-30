# UploadPart

The upload Part represents a chunk of bytes we can add to an Upload object. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **string** | The upload Part unique identifier, which can be referenced in API endpoints. | [default to undefined]
**created_at** | **number** | The Unix timestamp (in seconds) for when the Part was created. | [default to undefined]
**upload_id** | **string** | The ID of the Upload object that this Part was added to. | [default to undefined]
**object** | **string** | The object type, which is always &#x60;upload.part&#x60;. | [default to undefined]

## Example

```typescript
import { UploadPart } from './api';

const instance: UploadPart = {
    id,
    created_at,
    upload_id,
    object,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
