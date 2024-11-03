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




// RunStepStreamEventOneOf2 - Occurs when parts of a [run step](/docs/api-reference/runs/step-object) are being streamed.
type RunStepStreamEventOneOf2 struct {

	Event string `json:"event"`

	Data RunStepDeltaObject `json:"data"`
}

// AssertRunStepStreamEventOneOf2Required checks if the required fields are not zero-ed
func AssertRunStepStreamEventOneOf2Required(obj RunStepStreamEventOneOf2) error {
	elements := map[string]interface{}{
		"event": obj.Event,
		"data": obj.Data,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	if err := AssertRunStepDeltaObjectRequired(obj.Data); err != nil {
		return err
	}
	return nil
}

// AssertRunStepStreamEventOneOf2Constraints checks if the values respects the defined constraints
func AssertRunStepStreamEventOneOf2Constraints(obj RunStepStreamEventOneOf2) error {
	if err := AssertRunStepDeltaObjectConstraints(obj.Data); err != nil {
		return err
	}
	return nil
}
