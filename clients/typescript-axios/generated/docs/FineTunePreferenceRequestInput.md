# FineTunePreferenceRequestInput

The per-line training example of a fine-tuning input file for chat models using the dpo method.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**input** | [**FineTunePreferenceRequestInputInput**](FineTunePreferenceRequestInputInput.md) |  | [optional] [default to undefined]
**preferred_completion** | [**Array&lt;FineTunePreferenceRequestInputPreferredCompletionInner&gt;**](FineTunePreferenceRequestInputPreferredCompletionInner.md) | The preferred completion message for the output. | [optional] [default to undefined]
**non_preferred_completion** | [**Array&lt;FineTunePreferenceRequestInputPreferredCompletionInner&gt;**](FineTunePreferenceRequestInputPreferredCompletionInner.md) | The non-preferred completion message for the output. | [optional] [default to undefined]

## Example

```typescript
import { FineTunePreferenceRequestInput } from './api';

const instance: FineTunePreferenceRequestInput = {
    input,
    preferred_completion,
    non_preferred_completion,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
