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




// MessageStreamEventOneOf3 - Occurs when a [message](/docs/api-reference/messages/object) is completed.
type MessageStreamEventOneOf3 struct {

	Event string `json:"event"`

	Data MessageObject `json:"data"`
}

// AssertMessageStreamEventOneOf3Required checks if the required fields are not zero-ed
func AssertMessageStreamEventOneOf3Required(obj MessageStreamEventOneOf3) error {
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

// AssertMessageStreamEventOneOf3Constraints checks if the values respects the defined constraints
func AssertMessageStreamEventOneOf3Constraints(obj MessageStreamEventOneOf3) error {
	return nil
}
