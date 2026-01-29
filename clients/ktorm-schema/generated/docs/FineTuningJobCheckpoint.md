
# Table `FineTuningJobCheckpoint`
(mapped from: FineTuningJobCheckpoint)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | text NOT NULL PRIMARY KEY |  | **kotlin.String** | The checkpoint identifier, which can be referenced in the API endpoints. | 
**createdAt** | created_at | int NOT NULL |  | **kotlin.Int** | The Unix timestamp (in seconds) for when the checkpoint was created. | 
**fineTunedModelCheckpoint** | fine_tuned_model_checkpoint | text NOT NULL |  | **kotlin.String** | The name of the fine-tuned checkpoint model that is created. | 
**stepNumber** | step_number | int NOT NULL |  | **kotlin.Int** | The step number that the checkpoint was created at. | 
**metrics** | metrics | long NOT NULL |  | [**FineTuningJobCheckpointMetrics**](FineTuningJobCheckpointMetrics.md) |  |  [foreignkey]
**fineTuningJobId** | fine_tuning_job_id | text NOT NULL |  | **kotlin.String** | The name of the fine-tuning job that this checkpoint was created from. | 
**object** | object | text NOT NULL |  | [**object**](#Object) | The object type, which is always \&quot;fine_tuning.job.checkpoint\&quot;. | 









