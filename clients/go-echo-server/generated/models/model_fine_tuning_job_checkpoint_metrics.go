package models

// FineTuningJobCheckpointMetrics - Metrics at the step number during the fine-tuning job.
type FineTuningJobCheckpointMetrics struct {

	Step float32 `json:"step,omitempty"`

	TrainLoss float32 `json:"train_loss,omitempty"`

	TrainMeanTokenAccuracy float32 `json:"train_mean_token_accuracy,omitempty"`

	ValidLoss float32 `json:"valid_loss,omitempty"`

	ValidMeanTokenAccuracy float32 `json:"valid_mean_token_accuracy,omitempty"`

	FullValidLoss float32 `json:"full_valid_loss,omitempty"`

	FullValidMeanTokenAccuracy float32 `json:"full_valid_mean_token_accuracy,omitempty"`
}
