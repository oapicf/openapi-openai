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




type RunStepDetailsMessageCreationObjectMessageCreation struct {

	// The ID of the message that was created by this run step.
	MessageId string `json:"message_id"`
}

// AssertRunStepDetailsMessageCreationObjectMessageCreationRequired checks if the required fields are not zero-ed
func AssertRunStepDetailsMessageCreationObjectMessageCreationRequired(obj RunStepDetailsMessageCreationObjectMessageCreation) error {
	elements := map[string]interface{}{
		"message_id": obj.MessageId,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	return nil
}

// AssertRunStepDetailsMessageCreationObjectMessageCreationConstraints checks if the values respects the defined constraints
func AssertRunStepDetailsMessageCreationObjectMessageCreationConstraints(obj RunStepDetailsMessageCreationObjectMessageCreation) error {
	return nil
}
