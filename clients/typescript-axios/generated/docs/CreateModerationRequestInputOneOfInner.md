# CreateModerationRequestInputOneOfInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **string** | Always &#x60;image_url&#x60;. | [default to undefined]
**image_url** | [**CreateModerationRequestInputOneOfInnerOneOfImageUrl**](CreateModerationRequestInputOneOfInnerOneOfImageUrl.md) |  | [default to undefined]
**text** | **string** | A string of text to classify. | [default to undefined]

## Example

```typescript
import { CreateModerationRequestInputOneOfInner } from './api';

const instance: CreateModerationRequestInputOneOfInner = {
    type,
    image_url,
    text,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
