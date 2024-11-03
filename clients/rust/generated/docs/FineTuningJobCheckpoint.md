# FineTuningJobCheckpoint

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The checkpoint identifier, which can be referenced in the API endpoints. | 
**created_at** | **i32** | The Unix timestamp (in seconds) for when the checkpoint was created. | 
**fine_tuned_model_checkpoint** | **String** | The name of the fine-tuned checkpoint model that is created. | 
**step_number** | **i32** | The step number that the checkpoint was created at. | 
**metrics** | [**models::FineTuningJobCheckpointMetrics**](FineTuningJobCheckpoint_metrics.md) |  | 
**fine_tuning_job_id** | **String** | The name of the fine-tuning job that this checkpoint was created from. | 
**object** | **String** | The object type, which is always \"fine_tuning.job.checkpoint\". | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


