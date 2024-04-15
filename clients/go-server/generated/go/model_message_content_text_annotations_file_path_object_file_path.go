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




type MessageContentTextAnnotationsFilePathObjectFilePath struct {

	// The ID of the file that was generated.
	FileId string `json:"file_id"`
}

// AssertMessageContentTextAnnotationsFilePathObjectFilePathRequired checks if the required fields are not zero-ed
func AssertMessageContentTextAnnotationsFilePathObjectFilePathRequired(obj MessageContentTextAnnotationsFilePathObjectFilePath) error {
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

// AssertMessageContentTextAnnotationsFilePathObjectFilePathConstraints checks if the values respects the defined constraints
func AssertMessageContentTextAnnotationsFilePathObjectFilePathConstraints(obj MessageContentTextAnnotationsFilePathObjectFilePath) error {
	return nil
}