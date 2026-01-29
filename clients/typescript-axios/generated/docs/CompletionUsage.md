# CompletionUsage

Usage statistics for the completion request.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**completion_tokens** | **number** | Number of tokens in the generated completion. | [default to undefined]
**prompt_tokens** | **number** | Number of tokens in the prompt. | [default to undefined]
**total_tokens** | **number** | Total number of tokens used in the request (prompt + completion). | [default to undefined]

## Example

```typescript
import { CompletionUsage } from './api';

const instance: CompletionUsage = {
    completion_tokens,
    prompt_tokens,
    total_tokens,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
