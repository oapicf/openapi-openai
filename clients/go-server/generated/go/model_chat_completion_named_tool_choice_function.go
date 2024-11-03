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




type ChatCompletionNamedToolChoiceFunction struct {

	// The name of the function to call.
	Name string `json:"name"`
}

// AssertChatCompletionNamedToolChoiceFunctionRequired checks if the required fields are not zero-ed
func AssertChatCompletionNamedToolChoiceFunctionRequired(obj ChatCompletionNamedToolChoiceFunction) error {
	elements := map[string]interface{}{
		"name": obj.Name,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	return nil
}

// AssertChatCompletionNamedToolChoiceFunctionConstraints checks if the values respects the defined constraints
func AssertChatCompletionNamedToolChoiceFunctionConstraints(obj ChatCompletionNamedToolChoiceFunction) error {
	return nil
}
