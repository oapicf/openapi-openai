// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

/*
 * OpenAI API
 *
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * API version: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 */

package openapi




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

// AssertFineTuningJobCheckpointMetricsRequired checks if the required fields are not zero-ed
func AssertFineTuningJobCheckpointMetricsRequired(obj FineTuningJobCheckpointMetrics) error {
	return nil
}

// AssertFineTuningJobCheckpointMetricsConstraints checks if the values respects the defined constraints
func AssertFineTuningJobCheckpointMetricsConstraints(obj FineTuningJobCheckpointMetrics) error {
	return nil
}
