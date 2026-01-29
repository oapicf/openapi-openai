package models

// FineTuningJobEvent - Fine-tuning job event object
type FineTuningJobEvent struct {

	Id string `json:"id"`

	CreatedAt int32 `json:"created_at"`

	Level string `json:"level"`

	Message string `json:"message"`

	Object string `json:"object"`
}
