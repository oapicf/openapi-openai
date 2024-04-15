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




// MessageContentImageFileObject - References an image [File](/docs/api-reference/files) in the content of a message.
type MessageContentImageFileObject struct {

	// Always `image_file`.
	Type string `json:"type"`

	ImageFile MessageContentImageFileObjectImageFile `json:"image_file"`
}

// AssertMessageContentImageFileObjectRequired checks if the required fields are not zero-ed
func AssertMessageContentImageFileObjectRequired(obj MessageContentImageFileObject) error {
	elements := map[string]interface{}{
		"type": obj.Type,
		"image_file": obj.ImageFile,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	if err := AssertMessageContentImageFileObjectImageFileRequired(obj.ImageFile); err != nil {
		return err
	}
	return nil
}

// AssertMessageContentImageFileObjectConstraints checks if the values respects the defined constraints
func AssertMessageContentImageFileObjectConstraints(obj MessageContentImageFileObject) error {
	return nil
}