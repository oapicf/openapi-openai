# CreateCompletionResponseChoicesInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**finish_reason** | **string** | The reason the model stopped generating tokens. This will be &#x60;stop&#x60; if the model hit a natural stop point or a provided stop sequence, &#x60;length&#x60; if the maximum number of tokens specified in the request was reached, or &#x60;content_filter&#x60; if content was omitted due to a flag from our content filters.  | [default to undefined]
**index** | **number** |  | [default to undefined]
**logprobs** | [**CreateCompletionResponseChoicesInnerLogprobs**](CreateCompletionResponseChoicesInnerLogprobs.md) |  | [default to undefined]
**text** | **string** |  | [default to undefined]

## Example

```typescript
import { CreateCompletionResponseChoicesInner } from './api';

const instance: CreateCompletionResponseChoicesInner = {
    finish_reason,
    index,
    logprobs,
    text,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
