# FineTuneCompletionRequestInput

The per-line training example of a fine-tuning input file for completions models

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**prompt** | **string** | The input prompt for this training example. | [optional] [default to undefined]
**completion** | **string** | The desired completion for this training example. | [optional] [default to undefined]

## Example

```typescript
import { FineTuneCompletionRequestInput } from './api';

const instance: FineTuneCompletionRequestInput = {
    prompt,
    completion,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
