# TruncationObject


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **string** | The truncation strategy to use for the thread. The default is &#x60;auto&#x60;. If set to &#x60;last_messages&#x60;, the thread will be truncated to the n most recent messages in the thread. When set to &#x60;auto&#x60;, messages in the middle of the thread will be dropped to fit the context length of the model, &#x60;max_prompt_tokens&#x60;. | [optional] [default to undefined]
**last_messages** | **number** | The number of most recent messages from the thread when constructing the context for the run. | [optional] [default to undefined]

## Example

```typescript
import { TruncationObject } from './api';

const instance: TruncationObject = {
    type,
    last_messages,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
