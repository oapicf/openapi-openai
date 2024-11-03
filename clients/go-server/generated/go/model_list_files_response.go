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




type ListFilesResponse struct {

	Data []OpenAiFile `json:"data"`

	Object string `json:"object"`
}

// AssertListFilesResponseRequired checks if the required fields are not zero-ed
func AssertListFilesResponseRequired(obj ListFilesResponse) error {
	elements := map[string]interface{}{
		"data": obj.Data,
		"object": obj.Object,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	for _, el := range obj.Data {
		if err := AssertOpenAiFileRequired(el); err != nil {
			return err
		}
	}
	return nil
}

// AssertListFilesResponseConstraints checks if the values respects the defined constraints
func AssertListFilesResponseConstraints(obj ListFilesResponse) error {
	for _, el := range obj.Data {
		if err := AssertOpenAiFileConstraints(el); err != nil {
			return err
		}
	}
	return nil
}
