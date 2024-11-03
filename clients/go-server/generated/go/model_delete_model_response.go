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




type DeleteModelResponse struct {

	Id string `json:"id"`

	Deleted bool `json:"deleted"`

	Object string `json:"object"`
}

// AssertDeleteModelResponseRequired checks if the required fields are not zero-ed
func AssertDeleteModelResponseRequired(obj DeleteModelResponse) error {
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

// AssertDeleteModelResponseConstraints checks if the values respects the defined constraints
func AssertDeleteModelResponseConstraints(obj DeleteModelResponse) error {
	return nil
}
