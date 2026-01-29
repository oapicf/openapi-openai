# RunCompletionUsage

Usage statistics related to the run. This value will be `null` if the run is not in a terminal state (i.e. `in_progress`, `queued`, etc.).

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**completion_tokens** | **number** | Number of completion tokens used over the course of the run. | [default to undefined]
**prompt_tokens** | **number** | Number of prompt tokens used over the course of the run. | [default to undefined]
**total_tokens** | **number** | Total number of tokens used (prompt + completion). | [default to undefined]

## Example

```typescript
import { RunCompletionUsage } from './api';

const instance: RunCompletionUsage = {
    completion_tokens,
    prompt_tokens,
    total_tokens,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
