# FineTuningJobCheckpoint

The `fine_tuning.job.checkpoint` object represents a model checkpoint for a fine-tuning job that is ready to use. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **string** | The checkpoint identifier, which can be referenced in the API endpoints. | [default to undefined]
**created_at** | **number** | The Unix timestamp (in seconds) for when the checkpoint was created. | [default to undefined]
**fine_tuned_model_checkpoint** | **string** | The name of the fine-tuned checkpoint model that is created. | [default to undefined]
**step_number** | **number** | The step number that the checkpoint was created at. | [default to undefined]
**metrics** | [**FineTuningJobCheckpointMetrics**](FineTuningJobCheckpointMetrics.md) |  | [default to undefined]
**fine_tuning_job_id** | **string** | The name of the fine-tuning job that this checkpoint was created from. | [default to undefined]
**object** | **string** | The object type, which is always \&quot;fine_tuning.job.checkpoint\&quot;. | [default to undefined]

## Example

```typescript
import { FineTuningJobCheckpoint } from './api';

const instance: FineTuningJobCheckpoint = {
    id,
    created_at,
    fine_tuned_model_checkpoint,
    step_number,
    metrics,
    fine_tuning_job_id,
    object,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
