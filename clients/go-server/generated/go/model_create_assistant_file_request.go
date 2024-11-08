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




type CreateAssistantFileRequest struct {

	// A [File](/docs/api-reference/files) ID (with `purpose=\"assistants\"`) that the assistant should use. Useful for tools like `retrieval` and `code_interpreter` that can access files.
	FileId string `json:"file_id"`
}

// AssertCreateAssistantFileRequestRequired checks if the required fields are not zero-ed
func AssertCreateAssistantFileRequestRequired(obj CreateAssistantFileRequest) error {
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

// AssertCreateAssistantFileRequestConstraints checks if the values respects the defined constraints
func AssertCreateAssistantFileRequestConstraints(obj CreateAssistantFileRequest) error {
	return nil
}
