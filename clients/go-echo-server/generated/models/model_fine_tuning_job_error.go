package models

// FineTuningJobError - For fine-tuning jobs that have `failed`, this will contain more information on the cause of the failure.
type FineTuningJobError struct {

	// A machine-readable error code.
	Code string `json:"code"`

	// A human-readable error message.
	Message string `json:"message"`

	// The parameter that was invalid, usually `training_file` or `validation_file`. This field will be null if the failure was not parameter-specific.
	Param *string `json:"param"`
}
