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




// RunStepDeltaObject - Represents a run step delta i.e. any changed fields on a run step during streaming. 
type RunStepDeltaObject struct {

	// The identifier of the run step, which can be referenced in API endpoints.
	Id string `json:"id"`

	// The object type, which is always `thread.run.step.delta`.
	Object string `json:"object"`

	Delta RunStepDeltaObjectDelta `json:"delta"`
}

// AssertRunStepDeltaObjectRequired checks if the required fields are not zero-ed
func AssertRunStepDeltaObjectRequired(obj RunStepDeltaObject) error {
	elements := map[string]interface{}{
		"id": obj.Id,
		"object": obj.Object,
		"delta": obj.Delta,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	if err := AssertRunStepDeltaObjectDeltaRequired(obj.Delta); err != nil {
		return err
	}
	return nil
}

// AssertRunStepDeltaObjectConstraints checks if the values respects the defined constraints
func AssertRunStepDeltaObjectConstraints(obj RunStepDeltaObject) error {
	if err := AssertRunStepDeltaObjectDeltaConstraints(obj.Delta); err != nil {
		return err
	}
	return nil
}
