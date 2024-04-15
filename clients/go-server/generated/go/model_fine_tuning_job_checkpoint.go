/*
 * OpenAI API
 *
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * API version: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




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

// AssertFineTuningJobCheckpointRequired checks if the required fields are not zero-ed
func AssertFineTuningJobCheckpointRequired(obj FineTuningJobCheckpoint) error {
	elements := map[string]interface{}{
		"id": obj.Id,
		"created_at": obj.CreatedAt,
		"fine_tuned_model_checkpoint": obj.FineTunedModelCheckpoint,
		"step_number": obj.StepNumber,
		"metrics": obj.Metrics,
		"fine_tuning_job_id": obj.FineTuningJobId,
		"object": obj.Object,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	if err := AssertFineTuningJobCheckpointMetricsRequired(obj.Metrics); err != nil {
		return err
	}
	return nil
}

// AssertFineTuningJobCheckpointConstraints checks if the values respects the defined constraints
func AssertFineTuningJobCheckpointConstraints(obj FineTuningJobCheckpoint) error {
	return nil
}