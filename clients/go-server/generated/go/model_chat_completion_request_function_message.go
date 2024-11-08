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




type ChatCompletionRequestFunctionMessage struct {

	// The role of the messages author, in this case `function`.
	Role string `json:"role"`

	// The contents of the function message.
	Content *string `json:"content"`

	// The name of the function to call.
	Name string `json:"name"`
}

// AssertChatCompletionRequestFunctionMessageRequired checks if the required fields are not zero-ed
func AssertChatCompletionRequestFunctionMessageRequired(obj ChatCompletionRequestFunctionMessage) error {
	elements := map[string]interface{}{
		"role": obj.Role,
		"content": obj.Content,
		"name": obj.Name,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	return nil
}

// AssertChatCompletionRequestFunctionMessageConstraints checks if the values respects the defined constraints
func AssertChatCompletionRequestFunctionMessageConstraints(obj ChatCompletionRequestFunctionMessage) error {
	return nil
}
