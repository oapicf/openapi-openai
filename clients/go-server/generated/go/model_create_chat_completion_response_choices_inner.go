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




type CreateChatCompletionResponseChoicesInner struct {

	Index int32 `json:"index,omitempty"`

	Message ChatCompletionResponseMessage `json:"message,omitempty"`

	FinishReason string `json:"finish_reason,omitempty"`
}

// AssertCreateChatCompletionResponseChoicesInnerRequired checks if the required fields are not zero-ed
func AssertCreateChatCompletionResponseChoicesInnerRequired(obj CreateChatCompletionResponseChoicesInner) error {
	if err := AssertChatCompletionResponseMessageRequired(obj.Message); err != nil {
		return err
	}
	return nil
}

// AssertCreateChatCompletionResponseChoicesInnerConstraints checks if the values respects the defined constraints
func AssertCreateChatCompletionResponseChoicesInnerConstraints(obj CreateChatCompletionResponseChoicesInner) error {
	return nil
}