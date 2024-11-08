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




// MessageStreamEventOneOf - Occurs when a [message](/docs/api-reference/messages/object) is created.
type MessageStreamEventOneOf struct {

	Event string `json:"event"`

	Data MessageObject `json:"data"`
}

// AssertMessageStreamEventOneOfRequired checks if the required fields are not zero-ed
func AssertMessageStreamEventOneOfRequired(obj MessageStreamEventOneOf) error {
	elements := map[string]interface{}{
		"event": obj.Event,
		"data": obj.Data,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	if err := AssertMessageObjectRequired(obj.Data); err != nil {
		return err
	}
	return nil
}

// AssertMessageStreamEventOneOfConstraints checks if the values respects the defined constraints
func AssertMessageStreamEventOneOfConstraints(obj MessageStreamEventOneOf) error {
	if err := AssertMessageObjectConstraints(obj.Data); err != nil {
		return err
	}
	return nil
}
