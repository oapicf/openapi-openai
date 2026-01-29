# FineTuningJobCheckpointMetrics

Metrics at the step number during the fine-tuning job.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**step** | **number** |  | [optional] [default to undefined]
**train_loss** | **number** |  | [optional] [default to undefined]
**train_mean_token_accuracy** | **number** |  | [optional] [default to undefined]
**valid_loss** | **number** |  | [optional] [default to undefined]
**valid_mean_token_accuracy** | **number** |  | [optional] [default to undefined]
**full_valid_loss** | **number** |  | [optional] [default to undefined]
**full_valid_mean_token_accuracy** | **number** |  | [optional] [default to undefined]

## Example

```typescript
import { FineTuningJobCheckpointMetrics } from './api';

const instance: FineTuningJobCheckpointMetrics = {
    step,
    train_loss,
    train_mean_token_accuracy,
    valid_loss,
    valid_mean_token_accuracy,
    full_valid_loss,
    full_valid_mean_token_accuracy,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
