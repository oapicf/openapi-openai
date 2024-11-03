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




// RunStepDeltaStepDetailsMessageCreationObject - Details of the message creation by the run step.
type RunStepDeltaStepDetailsMessageCreationObject struct {

	// Always `message_creation`.
	Type string `json:"type"`

	MessageCreation RunStepDeltaStepDetailsMessageCreationObjectMessageCreation `json:"message_creation,omitempty"`
}

// AssertRunStepDeltaStepDetailsMessageCreationObjectRequired checks if the required fields are not zero-ed
func AssertRunStepDeltaStepDetailsMessageCreationObjectRequired(obj RunStepDeltaStepDetailsMessageCreationObject) error {
	elements := map[string]interface{}{
		"type": obj.Type,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	if err := AssertRunStepDeltaStepDetailsMessageCreationObjectMessageCreationRequired(obj.MessageCreation); err != nil {
		return err
	}
	return nil
}

// AssertRunStepDeltaStepDetailsMessageCreationObjectConstraints checks if the values respects the defined constraints
func AssertRunStepDeltaStepDetailsMessageCreationObjectConstraints(obj RunStepDeltaStepDetailsMessageCreationObject) error {
	if err := AssertRunStepDeltaStepDetailsMessageCreationObjectMessageCreationConstraints(obj.MessageCreation); err != nil {
		return err
	}
	return nil
}
