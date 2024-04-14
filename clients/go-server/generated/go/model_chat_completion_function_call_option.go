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




// ChatCompletionFunctionCallOption - Specifying a particular function via `{\"name\": \"my_function\"}` forces the model to call that function. 
type ChatCompletionFunctionCallOption struct {

	// The name of the function to call.
	Name string `json:"name"`
}

// AssertChatCompletionFunctionCallOptionRequired checks if the required fields are not zero-ed
func AssertChatCompletionFunctionCallOptionRequired(obj ChatCompletionFunctionCallOption) error {
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

// AssertChatCompletionFunctionCallOptionConstraints checks if the values respects the defined constraints
func AssertChatCompletionFunctionCallOptionConstraints(obj ChatCompletionFunctionCallOption) error {
	return nil
}
