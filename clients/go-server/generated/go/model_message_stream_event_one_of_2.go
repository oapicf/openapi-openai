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




// MessageStreamEventOneOf2 - Occurs when parts of a [Message](/docs/api-reference/messages/object) are being streamed.
type MessageStreamEventOneOf2 struct {

	Event string `json:"event"`

	Data MessageDeltaObject `json:"data"`
}

// AssertMessageStreamEventOneOf2Required checks if the required fields are not zero-ed
func AssertMessageStreamEventOneOf2Required(obj MessageStreamEventOneOf2) error {
	elements := map[string]interface{}{
		"event": obj.Event,
		"data": obj.Data,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	if err := AssertMessageDeltaObjectRequired(obj.Data); err != nil {
		return err
	}
	return nil
}

// AssertMessageStreamEventOneOf2Constraints checks if the values respects the defined constraints
func AssertMessageStreamEventOneOf2Constraints(obj MessageStreamEventOneOf2) error {
	if err := AssertMessageDeltaObjectConstraints(obj.Data); err != nil {
		return err
	}
	return nil
}
