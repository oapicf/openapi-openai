# CreateChatCompletionResponseChoicesInnerLogprobs

Log probability information for the choice.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**content** | [**Array&lt;ChatCompletionTokenLogprob&gt;**](ChatCompletionTokenLogprob.md) | A list of message content tokens with log probability information. | [default to undefined]
**refusal** | [**Array&lt;ChatCompletionTokenLogprob&gt;**](ChatCompletionTokenLogprob.md) | A list of message refusal tokens with log probability information. | [default to undefined]

## Example

```typescript
import { CreateChatCompletionResponseChoicesInnerLogprobs } from './api';

const instance: CreateChatCompletionResponseChoicesInnerLogprobs = {
    content,
    refusal,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
