# RunStepCompletionUsage

Usage statistics related to the run step. This value will be `null` while the run step\'s status is `in_progress`.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**completion_tokens** | **number** | Number of completion tokens used over the course of the run step. | [default to undefined]
**prompt_tokens** | **number** | Number of prompt tokens used over the course of the run step. | [default to undefined]
**total_tokens** | **number** | Total number of tokens used (prompt + completion). | [default to undefined]

## Example

```typescript
import { RunStepCompletionUsage } from './api';

const instance: RunStepCompletionUsage = {
    completion_tokens,
    prompt_tokens,
    total_tokens,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
