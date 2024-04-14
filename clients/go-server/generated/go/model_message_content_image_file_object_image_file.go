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




type MessageContentImageFileObjectImageFile struct {

	// The [File](/docs/api-reference/files) ID of the image in the message content.
	FileId string `json:"file_id"`
}

// AssertMessageContentImageFileObjectImageFileRequired checks if the required fields are not zero-ed
func AssertMessageContentImageFileObjectImageFileRequired(obj MessageContentImageFileObjectImageFile) error {
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

// AssertMessageContentImageFileObjectImageFileConstraints checks if the values respects the defined constraints
func AssertMessageContentImageFileObjectImageFileConstraints(obj MessageContentImageFileObjectImageFile) error {
	return nil
}
