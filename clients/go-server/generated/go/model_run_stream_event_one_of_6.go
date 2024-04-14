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




// RunStreamEventOneOf6 - Occurs when a [run](/docs/api-reference/runs/object) moves to a `cancelling` status.
type RunStreamEventOneOf6 struct {

	Event string `json:"event"`

	Data RunObject `json:"data"`
}

// AssertRunStreamEventOneOf6Required checks if the required fields are not zero-ed
func AssertRunStreamEventOneOf6Required(obj RunStreamEventOneOf6) error {
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

// AssertRunStreamEventOneOf6Constraints checks if the values respects the defined constraints
func AssertRunStreamEventOneOf6Constraints(obj RunStreamEventOneOf6) error {
	return nil
}
