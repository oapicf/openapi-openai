# FineTuningJobCheckpoint


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**`id`** | **`String`** | The checkpoint identifier, which can be referenced in the API endpoints. | [default to nothing]
**`created_at`** | **`Int64`** | The Unix timestamp (in seconds) for when the checkpoint was created. | [default to nothing]
**`fine_tuned_model_checkpoint`** | **`String`** | The name of the fine-tuned checkpoint model that is created. | [default to nothing]
**`step_number`** | **`Int64`** | The step number that the checkpoint was created at. | [default to nothing]
**`metrics`** | [**`*FineTuningJobCheckpointMetrics`**](FineTuningJobCheckpointMetrics.md) |  | [default to nothing]
**`fine_tuning_job_id`** | **`String`** | The name of the fine-tuning job that this checkpoint was created from. | [default to nothing]
**`object`** | **`String`** | The object type, which is always \&quot;fine_tuning.job.checkpoint\&quot;. | [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


