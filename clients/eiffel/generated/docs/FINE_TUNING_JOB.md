# FINE_TUNING_JOB

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**STRING_32**](STRING_32.md) | The object identifier, which can be referenced in the API endpoints. | [default to null]
**created_at** | **INTEGER_32** | The Unix timestamp (in seconds) for when the fine-tuning job was created. | [default to null]
**error** | [**FINE_TUNING_JOB_ERROR**](FineTuningJob_error.md) |  | [default to null]
**fine_tuned_model** | [**STRING_32**](STRING_32.md) | The name of the fine-tuned model that is being created. The value will be null if the fine-tuning job is still running. | [default to null]
**finished_at** | **INTEGER_32** | The Unix timestamp (in seconds) for when the fine-tuning job was finished. The value will be null if the fine-tuning job is still running. | [default to null]
**hyperparameters** | [**FINE_TUNING_JOB_HYPERPARAMETERS**](FineTuningJob_hyperparameters.md) |  | [default to null]
**model** | [**STRING_32**](STRING_32.md) | The base model that is being fine-tuned. | [default to null]
**object** | [**STRING_32**](STRING_32.md) | The object type, which is always \&quot;fine_tuning.job\&quot;. | [default to null]
**organization_id** | [**STRING_32**](STRING_32.md) | The organization that owns the fine-tuning job. | [default to null]
**result_files** | [**LIST [STRING_32]**](STRING_32.md) | The compiled results file ID(s) for the fine-tuning job. You can retrieve the results with the [Files API](/docs/api-reference/files/retrieve-contents). | [default to null]
**status** | [**STRING_32**](STRING_32.md) | The current status of the fine-tuning job, which can be either &#x60;validating_files&#x60;, &#x60;queued&#x60;, &#x60;running&#x60;, &#x60;succeeded&#x60;, &#x60;failed&#x60;, or &#x60;cancelled&#x60;. | [default to null]
**trained_tokens** | **INTEGER_32** | The total number of billable tokens processed by this fine-tuning job. The value will be null if the fine-tuning job is still running. | [default to null]
**training_file** | [**STRING_32**](STRING_32.md) | The file ID used for training. You can retrieve the training data with the [Files API](/docs/api-reference/files/retrieve-contents). | [default to null]
**validation_file** | [**STRING_32**](STRING_32.md) | The file ID used for validation. You can retrieve the validation results with the [Files API](/docs/api-reference/files/retrieve-contents). | [default to null]
**integrations** | [**LIST [FINE_TUNING_JOB_INTEGRATIONS_INNER]**](FineTuningJob_integrations_inner.md) | A list of integrations to enable for this fine-tuning job. | [optional] [default to null]
**seed** | **INTEGER_32** | The seed used for the fine-tuning job. | [default to null]
**estimated_finish** | **INTEGER_32** | The Unix timestamp (in seconds) for when the fine-tuning job is estimated to finish. The value will be null if the fine-tuning job is not running. | [optional] [default to null]
**method** | [**FINE_TUNE_METHOD**](FineTuneMethod.md) |  | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


