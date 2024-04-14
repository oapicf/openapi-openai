/*
 * OpenAI API
 *
 * APIs for sampling from and fine-tuning language models
 *
 * API version: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type ChatCompletionRequestMessage struct {

	// The role of the messages author. One of `system`, `user`, `assistant`, or `function`.
	Role string `json:"role"`

	// The contents of the message. `content` is required for all messages except assistant messages with function calls.
	Content string `json:"content,omitempty"`

	// The name of the author of this message. `name` is required if role is `function`, and it should be the name of the function whose response is in the `content`. May contain a-z, A-Z, 0-9, and underscores, with a maximum length of 64 characters.
	Name string `json:"name,omitempty"`

	FunctionCall ChatCompletionRequestMessageFunctionCall `json:"function_call,omitempty"`
}

// AssertChatCompletionRequestMessageRequired checks if the required fields are not zero-ed
func AssertChatCompletionRequestMessageRequired(obj ChatCompletionRequestMessage) error {
	elements := map[string]interface{}{
		"role": obj.Role,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	if err := AssertChatCompletionRequestMessageFunctionCallRequired(obj.FunctionCall); err != nil {
		return err
	}
	return nil
}

// AssertChatCompletionRequestMessageConstraints checks if the values respects the defined constraints
func AssertChatCompletionRequestMessageConstraints(obj ChatCompletionRequestMessage) error {
	return nil
}