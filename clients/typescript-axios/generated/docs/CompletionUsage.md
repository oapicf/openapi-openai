# CompletionUsage

Usage statistics for the completion request.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**completion_tokens** | **number** | Number of tokens in the generated completion. | [default to undefined]
**prompt_tokens** | **number** | Number of tokens in the prompt. | [default to undefined]
**total_tokens** | **number** | Total number of tokens used in the request (prompt + completion). | [default to undefined]
**completion_tokens_details** | [**CompletionUsageCompletionTokensDetails**](CompletionUsageCompletionTokensDetails.md) |  | [optional] [default to undefined]
**prompt_tokens_details** | [**CompletionUsagePromptTokensDetails**](CompletionUsagePromptTokensDetails.md) |  | [optional] [default to undefined]

## Example

```typescript
import { CompletionUsage } from './api';

const instance: CompletionUsage = {
    completion_tokens,
    prompt_tokens,
    total_tokens,
    completion_tokens_details,
    prompt_tokens_details,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
