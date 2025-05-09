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




type ChatCompletionMessageToolCallChunk struct {

	Index int32 `json:"index"`

	// The ID of the tool call.
	Id string `json:"id,omitempty"`

	// The type of the tool. Currently, only `function` is supported.
	Type string `json:"type,omitempty"`

	Function ChatCompletionMessageToolCallChunkFunction `json:"function,omitempty"`
}

// AssertChatCompletionMessageToolCallChunkRequired checks if the required fields are not zero-ed
func AssertChatCompletionMessageToolCallChunkRequired(obj ChatCompletionMessageToolCallChunk) error {
	elements := map[string]interface{}{
		"index": obj.Index,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	if err := AssertChatCompletionMessageToolCallChunkFunctionRequired(obj.Function); err != nil {
		return err
	}
	return nil
}

// AssertChatCompletionMessageToolCallChunkConstraints checks if the values respects the defined constraints
func AssertChatCompletionMessageToolCallChunkConstraints(obj ChatCompletionMessageToolCallChunk) error {
	if err := AssertChatCompletionMessageToolCallChunkFunctionConstraints(obj.Function); err != nil {
		return err
	}
	return nil
}
