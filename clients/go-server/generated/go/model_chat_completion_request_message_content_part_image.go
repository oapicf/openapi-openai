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




type ChatCompletionRequestMessageContentPartImage struct {

	// The type of the content part.
	Type string `json:"type"`

	ImageUrl ChatCompletionRequestMessageContentPartImageImageUrl `json:"image_url"`
}

// AssertChatCompletionRequestMessageContentPartImageRequired checks if the required fields are not zero-ed
func AssertChatCompletionRequestMessageContentPartImageRequired(obj ChatCompletionRequestMessageContentPartImage) error {
	elements := map[string]interface{}{
		"type": obj.Type,
		"image_url": obj.ImageUrl,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	if err := AssertChatCompletionRequestMessageContentPartImageImageUrlRequired(obj.ImageUrl); err != nil {
		return err
	}
	return nil
}

// AssertChatCompletionRequestMessageContentPartImageConstraints checks if the values respects the defined constraints
func AssertChatCompletionRequestMessageContentPartImageConstraints(obj ChatCompletionRequestMessageContentPartImage) error {
	return nil
}