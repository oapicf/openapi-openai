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




type RunStepDetailsToolCallsCodeOutputImageObjectImage struct {

	// The [file](/docs/api-reference/files) ID of the image.
	FileId string `json:"file_id"`
}

// AssertRunStepDetailsToolCallsCodeOutputImageObjectImageRequired checks if the required fields are not zero-ed
func AssertRunStepDetailsToolCallsCodeOutputImageObjectImageRequired(obj RunStepDetailsToolCallsCodeOutputImageObjectImage) error {
	elements := map[string]interface{}{
		"file_id": obj.FileId,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	return nil
}

// AssertRunStepDetailsToolCallsCodeOutputImageObjectImageConstraints checks if the values respects the defined constraints
func AssertRunStepDetailsToolCallsCodeOutputImageObjectImageConstraints(obj RunStepDetailsToolCallsCodeOutputImageObjectImage) error {
	return nil
}
