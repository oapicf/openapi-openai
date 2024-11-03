package models

// FineTuningJob - The `fine_tuning.job` object represents a fine-tuning job that has been created through the API. 
type FineTuningJob struct {

	// The object identifier, which can be referenced in the API endpoints.
	Id string `json:"id"`

	// The Unix timestamp (in seconds) for when the fine-tuning job was created.
	CreatedAt int32 `json:"created_at"`

	Error *FineTuningJobError `json:"error"`

	// The name of the fine-tuned model that is being created. The value will be null if the fine-tuning job is still running.
	FineTunedModel *string `json:"fine_tuned_model"`

	// The Unix timestamp (in seconds) for when the fine-tuning job was finished. The value will be null if the fine-tuning job is still running.
	FinishedAt *int32 `json:"finished_at"`

	Hyperparameters FineTuningJobHyperparameters `json:"hyperparameters"`

	// The base model that is being fine-tuned.
	Model string `json:"model"`

	// The object type, which is always \"fine_tuning.job\".
	Object string `json:"object"`

	// The organization that owns the fine-tuning job.
	OrganizationId string `json:"organization_id"`

	// The compiled results file ID(s) for the fine-tuning job. You can retrieve the results with the [Files API](/docs/api-reference/files/retrieve-contents).
	ResultFiles []string `json:"result_files"`

	// The current status of the fine-tuning job, which can be either `validating_files`, `queued`, `running`, `succeeded`, `failed`, or `cancelled`.
	Status string `json:"status"`

	// The total number of billable tokens processed by this fine-tuning job. The value will be null if the fine-tuning job is still running.
	TrainedTokens *int32 `json:"trained_tokens"`

	// The file ID used for training. You can retrieve the training data with the [Files API](/docs/api-reference/files/retrieve-contents).
	TrainingFile string `json:"training_file"`

	// The file ID used for validation. You can retrieve the validation results with the [Files API](/docs/api-reference/files/retrieve-contents).
	ValidationFile *string `json:"validation_file"`

	// A list of integrations to enable for this fine-tuning job.
	Integrations *[]FineTuningJobIntegrationsInner `json:"integrations,omitempty"`

	// The seed used for the fine-tuning job.
	Seed int32 `json:"seed"`
}
