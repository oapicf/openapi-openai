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

// RunStepDeltaStepDetailsMessageCreationObject - Details of the message creation by the run step.
type RunStepDeltaStepDetailsMessageCreationObject struct {

	// Always `message_creation`.
	Type string `json:"type"`

	MessageCreation RunStepDeltaStepDetailsMessageCreationObjectMessageCreation `json:"message_creation,omitempty"`
}