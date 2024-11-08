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




type ChatCompletionTool struct {

	// The type of the tool. Currently, only `function` is supported.
	Type string `json:"type"`

	Function FunctionObject `json:"function"`
}

// AssertChatCompletionToolRequired checks if the required fields are not zero-ed
func AssertChatCompletionToolRequired(obj ChatCompletionTool) error {
	elements := map[string]interface{}{
		"type": obj.Type,
		"function": obj.Function,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	if err := AssertFunctionObjectRequired(obj.Function); err != nil {
		return err
	}
	return nil
}

// AssertChatCompletionToolConstraints checks if the values respects the defined constraints
func AssertChatCompletionToolConstraints(obj ChatCompletionTool) error {
	if err := AssertFunctionObjectConstraints(obj.Function); err != nil {
		return err
	}
	return nil
}
