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




// Model - Describes an OpenAI model offering that can be used with the API.
type Model struct {

	// The model identifier, which can be referenced in the API endpoints.
	Id string `json:"id"`

	// The Unix timestamp (in seconds) when the model was created.
	Created int32 `json:"created"`

	// The object type, which is always \"model\".
	Object string `json:"object"`

	// The organization that owns the model.
	OwnedBy string `json:"owned_by"`
}

// AssertModelRequired checks if the required fields are not zero-ed
func AssertModelRequired(obj Model) error {
	elements := map[string]interface{}{
		"id": obj.Id,
		"created": obj.Created,
		"object": obj.Object,
		"owned_by": obj.OwnedBy,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	return nil
}

// AssertModelConstraints checks if the values respects the defined constraints
func AssertModelConstraints(obj Model) error {
	return nil
}
