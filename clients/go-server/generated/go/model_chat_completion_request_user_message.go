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




type ChatCompletionRequestUserMessage struct {

	Content ChatCompletionRequestUserMessageContent `json:"content"`

	// The role of the messages author, in this case `user`.
	Role string `json:"role"`

	// An optional name for the participant. Provides the model information to differentiate between participants of the same role.
	Name string `json:"name,omitempty"`
}

// AssertChatCompletionRequestUserMessageRequired checks if the required fields are not zero-ed
func AssertChatCompletionRequestUserMessageRequired(obj ChatCompletionRequestUserMessage) error {
	elements := map[string]interface{}{
		"content": obj.Content,
		"role": obj.Role,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	if err := AssertChatCompletionRequestUserMessageContentRequired(obj.Content); err != nil {
		return err
	}
	return nil
}

// AssertChatCompletionRequestUserMessageConstraints checks if the values respects the defined constraints
func AssertChatCompletionRequestUserMessageConstraints(obj ChatCompletionRequestUserMessage) error {
	return nil
}