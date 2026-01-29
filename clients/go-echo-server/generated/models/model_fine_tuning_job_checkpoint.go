package models

// FineTuningJobCheckpoint - The `fine_tuning.job.checkpoint` object represents a model checkpoint for a fine-tuning job that is ready to use. 
type FineTuningJobCheckpoint struct {

	// The checkpoint identifier, which can be referenced in the API endpoints.
	Id string `json:"id"`

	// The Unix timestamp (in seconds) for when the checkpoint was created.
	CreatedAt int32 `json:"created_at"`

	// The name of the fine-tuned checkpoint model that is created.
	FineTunedModelCheckpoint string `json:"fine_tuned_model_checkpoint"`

	// The step number that the checkpoint was created at.
	StepNumber int32 `json:"step_number"`

	Metrics FineTuningJobCheckpointMetrics `json:"metrics"`

	// The name of the fine-tuning job that this checkpoint was created from.
	FineTuningJobId string `json:"fine_tuning_job_id"`

	// The object type, which is always \"fine_tuning.job.checkpoint\".
	Object string `json:"object"`
}
