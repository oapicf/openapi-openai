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




type ChatCompletionMessageToolCall struct {

	// The ID of the tool call.
	Id string `json:"id"`

	// The type of the tool. Currently, only `function` is supported.
	Type string `json:"type"`

	Function ChatCompletionMessageToolCallFunction `json:"function"`
}

// AssertChatCompletionMessageToolCallRequired checks if the required fields are not zero-ed
func AssertChatCompletionMessageToolCallRequired(obj ChatCompletionMessageToolCall) error {
	elements := map[string]interface{}{
		"id": obj.Id,
		"type": obj.Type,
		"function": obj.Function,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	if err := AssertChatCompletionMessageToolCallFunctionRequired(obj.Function); err != nil {
		return err
	}
	return nil
}

// AssertChatCompletionMessageToolCallConstraints checks if the values respects the defined constraints
func AssertChatCompletionMessageToolCallConstraints(obj ChatCompletionMessageToolCall) error {
	return nil
}
