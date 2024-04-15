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




type ListMessageFilesResponse struct {

	Object string `json:"object"`

	Data []MessageFileObject `json:"data"`

	FirstId string `json:"first_id"`

	LastId string `json:"last_id"`

	HasMore bool `json:"has_more"`
}

// AssertListMessageFilesResponseRequired checks if the required fields are not zero-ed
func AssertListMessageFilesResponseRequired(obj ListMessageFilesResponse) error {
	elements := map[string]interface{}{
		"object": obj.Object,
		"data": obj.Data,
		"first_id": obj.FirstId,
		"last_id": obj.LastId,
		"has_more": obj.HasMore,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	for _, el := range obj.Data {
		if err := AssertMessageFileObjectRequired(el); err != nil {
			return err
		}
	}
	return nil
}

// AssertListMessageFilesResponseConstraints checks if the values respects the defined constraints
func AssertListMessageFilesResponseConstraints(obj ListMessageFilesResponse) error {
	return nil
}