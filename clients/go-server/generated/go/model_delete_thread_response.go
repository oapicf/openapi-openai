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




type DeleteThreadResponse struct {

	Id string `json:"id"`

	Deleted bool `json:"deleted"`

	Object string `json:"object"`
}

// AssertDeleteThreadResponseRequired checks if the required fields are not zero-ed
func AssertDeleteThreadResponseRequired(obj DeleteThreadResponse) error {
	elements := map[string]interface{}{
		"id": obj.Id,
		"deleted": obj.Deleted,
		"object": obj.Object,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	return nil
}

// AssertDeleteThreadResponseConstraints checks if the values respects the defined constraints
func AssertDeleteThreadResponseConstraints(obj DeleteThreadResponse) error {
	return nil
}
