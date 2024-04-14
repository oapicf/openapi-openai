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




type RunStepDeltaStepDetailsMessageCreationObjectMessageCreation struct {

	// The ID of the message that was created by this run step.
	MessageId string `json:"message_id,omitempty"`
}

// AssertRunStepDeltaStepDetailsMessageCreationObjectMessageCreationRequired checks if the required fields are not zero-ed
func AssertRunStepDeltaStepDetailsMessageCreationObjectMessageCreationRequired(obj RunStepDeltaStepDetailsMessageCreationObjectMessageCreation) error {
	return nil
}

// AssertRunStepDeltaStepDetailsMessageCreationObjectMessageCreationConstraints checks if the values respects the defined constraints
func AssertRunStepDeltaStepDetailsMessageCreationObjectMessageCreationConstraints(obj RunStepDeltaStepDetailsMessageCreationObjectMessageCreation) error {
	return nil
}
