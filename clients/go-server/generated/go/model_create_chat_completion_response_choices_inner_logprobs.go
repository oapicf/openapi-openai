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




// CreateChatCompletionResponseChoicesInnerLogprobs - Log probability information for the choice.
type CreateChatCompletionResponseChoicesInnerLogprobs struct {

	// A list of message content tokens with log probability information.
	Content *[]ChatCompletionTokenLogprob `json:"content"`
}

// AssertCreateChatCompletionResponseChoicesInnerLogprobsRequired checks if the required fields are not zero-ed
func AssertCreateChatCompletionResponseChoicesInnerLogprobsRequired(obj CreateChatCompletionResponseChoicesInnerLogprobs) error {
	elements := map[string]interface{}{
		"content": obj.Content,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	if obj.Content != nil {
		for _, el := range *obj.Content {
			if err := AssertChatCompletionTokenLogprobRequired(el); err != nil {
				return err
			}
		}
	}
	return nil
}

// AssertCreateChatCompletionResponseChoicesInnerLogprobsConstraints checks if the values respects the defined constraints
func AssertCreateChatCompletionResponseChoicesInnerLogprobsConstraints(obj CreateChatCompletionResponseChoicesInnerLogprobs) error {
    if obj.Content != nil {
     	for _, el := range *obj.Content {
     		if err := AssertChatCompletionTokenLogprobConstraints(el); err != nil {
     			return err
     		}
     	}
    }
	return nil
}
