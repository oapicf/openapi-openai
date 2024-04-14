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




type MessageStreamEvent struct {

	Event string `json:"event"`

	Data MessageObject `json:"data"`
}

// AssertMessageStreamEventRequired checks if the required fields are not zero-ed
func AssertMessageStreamEventRequired(obj MessageStreamEvent) error {
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

// AssertMessageStreamEventConstraints checks if the values respects the defined constraints
func AssertMessageStreamEventConstraints(obj MessageStreamEvent) error {
	return nil
}
