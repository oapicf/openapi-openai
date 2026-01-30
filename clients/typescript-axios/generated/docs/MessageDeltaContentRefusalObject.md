# MessageDeltaContentRefusalObject

The refusal content that is part of a message.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**index** | **number** | The index of the refusal part in the message. | [default to undefined]
**type** | **string** | Always &#x60;refusal&#x60;. | [default to undefined]
**refusal** | **string** |  | [optional] [default to undefined]

## Example

```typescript
import { MessageDeltaContentRefusalObject } from './api';

const instance: MessageDeltaContentRefusalObject = {
    index,
    type,
    refusal,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
