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




type MessageContentTextAnnotationsFileCitationObjectFileCitation struct {

	// The ID of the specific File the citation is from.
	FileId string `json:"file_id"`

	// The specific quote in the file.
	Quote string `json:"quote"`
}

// AssertMessageContentTextAnnotationsFileCitationObjectFileCitationRequired checks if the required fields are not zero-ed
func AssertMessageContentTextAnnotationsFileCitationObjectFileCitationRequired(obj MessageContentTextAnnotationsFileCitationObjectFileCitation) error {
	elements := map[string]interface{}{
		"file_id": obj.FileId,
		"quote": obj.Quote,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	return nil
}

// AssertMessageContentTextAnnotationsFileCitationObjectFileCitationConstraints checks if the values respects the defined constraints
func AssertMessageContentTextAnnotationsFileCitationObjectFileCitationConstraints(obj MessageContentTextAnnotationsFileCitationObjectFileCitation) error {
	return nil
}
