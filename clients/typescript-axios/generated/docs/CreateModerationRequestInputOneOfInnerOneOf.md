# CreateModerationRequestInputOneOfInnerOneOf

An object describing an image to classify.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **string** | Always &#x60;image_url&#x60;. | [default to undefined]
**image_url** | [**CreateModerationRequestInputOneOfInnerOneOfImageUrl**](CreateModerationRequestInputOneOfInnerOneOfImageUrl.md) |  | [default to undefined]

## Example

```typescript
import { CreateModerationRequestInputOneOfInnerOneOf } from './api';

const instance: CreateModerationRequestInputOneOfInnerOneOf = {
    type,
    image_url,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
