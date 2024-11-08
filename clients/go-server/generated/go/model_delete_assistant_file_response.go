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




// DeleteAssistantFileResponse - Deletes the association between the assistant and the file, but does not delete the [File](/docs/api-reference/files) object itself.
type DeleteAssistantFileResponse struct {

	Id string `json:"id"`

	Deleted bool `json:"deleted"`

	Object string `json:"object"`
}

// AssertDeleteAssistantFileResponseRequired checks if the required fields are not zero-ed
func AssertDeleteAssistantFileResponseRequired(obj DeleteAssistantFileResponse) error {
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

// AssertDeleteAssistantFileResponseConstraints checks if the values respects the defined constraints
func AssertDeleteAssistantFileResponseConstraints(obj DeleteAssistantFileResponse) error {
	return nil
}
