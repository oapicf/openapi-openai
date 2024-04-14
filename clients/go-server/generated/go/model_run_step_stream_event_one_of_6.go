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




// RunStepStreamEventOneOf6 - Occurs when a [run step](/docs/api-reference/runs/step-object) expires.
type RunStepStreamEventOneOf6 struct {

	Event string `json:"event"`

	Data RunStepObject `json:"data"`
}

// AssertRunStepStreamEventOneOf6Required checks if the required fields are not zero-ed
func AssertRunStepStreamEventOneOf6Required(obj RunStepStreamEventOneOf6) error {
	elements := map[string]interface{}{
		"event": obj.Event,
		"data": obj.Data,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	if err := AssertRunStepObjectRequired(obj.Data); err != nil {
		return err
	}
	return nil
}

// AssertRunStepStreamEventOneOf6Constraints checks if the values respects the defined constraints
func AssertRunStepStreamEventOneOf6Constraints(obj RunStepStreamEventOneOf6) error {
	return nil
}
