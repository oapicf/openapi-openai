# FINE_TUNING_JOB_CHECKPOINT

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**STRING_32**](STRING_32.md) | The checkpoint identifier, which can be referenced in the API endpoints. | [default to null]
**created_at** | **INTEGER_32** | The Unix timestamp (in seconds) for when the checkpoint was created. | [default to null]
**fine_tuned_model_checkpoint** | [**STRING_32**](STRING_32.md) | The name of the fine-tuned checkpoint model that is created. | [default to null]
**step_number** | **INTEGER_32** | The step number that the checkpoint was created at. | [default to null]
**metrics** | [**FINE_TUNING_JOB_CHECKPOINT_METRICS**](FineTuningJobCheckpoint_metrics.md) |  | [default to null]
**fine_tuning_job_id** | [**STRING_32**](STRING_32.md) | The name of the fine-tuning job that this checkpoint was created from. | [default to null]
**object** | [**STRING_32**](STRING_32.md) | The object type, which is always \&quot;fine_tuning.job.checkpoint\&quot;. | [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


