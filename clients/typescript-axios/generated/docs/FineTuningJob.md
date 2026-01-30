# FineTuningJob

The `fine_tuning.job` object represents a fine-tuning job that has been created through the API. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **string** | The object identifier, which can be referenced in the API endpoints. | [default to undefined]
**created_at** | **number** | The Unix timestamp (in seconds) for when the fine-tuning job was created. | [default to undefined]
**error** | [**FineTuningJobError**](FineTuningJobError.md) |  | [default to undefined]
**fine_tuned_model** | **string** | The name of the fine-tuned model that is being created. The value will be null if the fine-tuning job is still running. | [default to undefined]
**finished_at** | **number** | The Unix timestamp (in seconds) for when the fine-tuning job was finished. The value will be null if the fine-tuning job is still running. | [default to undefined]
**hyperparameters** | [**FineTuningJobHyperparameters**](FineTuningJobHyperparameters.md) |  | [default to undefined]
**model** | **string** | The base model that is being fine-tuned. | [default to undefined]
**object** | **string** | The object type, which is always \&quot;fine_tuning.job\&quot;. | [default to undefined]
**organization_id** | **string** | The organization that owns the fine-tuning job. | [default to undefined]
**result_files** | **Array&lt;string&gt;** | The compiled results file ID(s) for the fine-tuning job. You can retrieve the results with the [Files API](/docs/api-reference/files/retrieve-contents). | [default to undefined]
**status** | **string** | The current status of the fine-tuning job, which can be either &#x60;validating_files&#x60;, &#x60;queued&#x60;, &#x60;running&#x60;, &#x60;succeeded&#x60;, &#x60;failed&#x60;, or &#x60;cancelled&#x60;. | [default to undefined]
**trained_tokens** | **number** | The total number of billable tokens processed by this fine-tuning job. The value will be null if the fine-tuning job is still running. | [default to undefined]
**training_file** | **string** | The file ID used for training. You can retrieve the training data with the [Files API](/docs/api-reference/files/retrieve-contents). | [default to undefined]
**validation_file** | **string** | The file ID used for validation. You can retrieve the validation results with the [Files API](/docs/api-reference/files/retrieve-contents). | [default to undefined]
**integrations** | [**Array&lt;FineTuningJobIntegrationsInner&gt;**](FineTuningJobIntegrationsInner.md) | A list of integrations to enable for this fine-tuning job. | [optional] [default to undefined]
**seed** | **number** | The seed used for the fine-tuning job. | [default to undefined]
**estimated_finish** | **number** | The Unix timestamp (in seconds) for when the fine-tuning job is estimated to finish. The value will be null if the fine-tuning job is not running. | [optional] [default to undefined]
**method** | [**FineTuneMethod**](FineTuneMethod.md) |  | [optional] [default to undefined]

## Example

```typescript
import { FineTuningJob } from './api';

const instance: FineTuningJob = {
    id,
    created_at,
    error,
    fine_tuned_model,
    finished_at,
    hyperparameters,
    model,
    object,
    organization_id,
    result_files,
    status,
    trained_tokens,
    training_file,
    validation_file,
    integrations,
    seed,
    estimated_finish,
    method,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
