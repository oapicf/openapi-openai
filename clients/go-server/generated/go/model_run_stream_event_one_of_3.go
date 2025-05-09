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




// RunStreamEventOneOf3 - Occurs when a [run](/docs/api-reference/runs/object) moves to a `requires_action` status.
type RunStreamEventOneOf3 struct {

	Event string `json:"event"`

	Data RunObject `json:"data"`
}

// AssertRunStreamEventOneOf3Required checks if the required fields are not zero-ed
func AssertRunStreamEventOneOf3Required(obj RunStreamEventOneOf3) error {
	elements := map[string]interface{}{
		"event": obj.Event,
		"data": obj.Data,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	if err := AssertRunObjectRequired(obj.Data); err != nil {
		return err
	}
	return nil
}

// AssertRunStreamEventOneOf3Constraints checks if the values respects the defined constraints
func AssertRunStreamEventOneOf3Constraints(obj RunStreamEventOneOf3) error {
	if err := AssertRunObjectConstraints(obj.Data); err != nil {
		return err
	}
	return nil
}
