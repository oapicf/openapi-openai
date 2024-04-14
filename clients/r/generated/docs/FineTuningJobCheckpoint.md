# openapi::FineTuningJobCheckpoint

The `fine_tuning.job.checkpoint` object represents a model checkpoint for a fine-tuning job that is ready to use. 

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **character** | The checkpoint identifier, which can be referenced in the API endpoints. | 
**created_at** | **integer** | The Unix timestamp (in seconds) for when the checkpoint was created. | 
**fine_tuned_model_checkpoint** | **character** | The name of the fine-tuned checkpoint model that is created. | 
**step_number** | **integer** | The step number that the checkpoint was created at. | 
**metrics** | [**FineTuningJobCheckpointMetrics**](FineTuningJobCheckpoint_metrics.md) |  | 
**fine_tuning_job_id** | **character** | The name of the fine-tuning job that this checkpoint was created from. | 
**object** | **character** | The object type, which is always \&quot;fine_tuning.job.checkpoint\&quot;. | [Enum: [fine_tuning.job.checkpoint]] 


