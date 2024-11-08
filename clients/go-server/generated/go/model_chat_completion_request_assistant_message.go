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




type ChatCompletionRequestAssistantMessage struct {

	// The contents of the assistant message. Required unless `tool_calls` or `function_call` is specified. 
	Content *string `json:"content,omitempty"`

	// The role of the messages author, in this case `assistant`.
	Role string `json:"role"`

	// An optional name for the participant. Provides the model information to differentiate between participants of the same role.
	Name string `json:"name,omitempty"`

	// The tool calls generated by the model, such as function calls.
	ToolCalls []ChatCompletionMessageToolCall `json:"tool_calls,omitempty"`

	// Deprecated
	FunctionCall ChatCompletionRequestAssistantMessageFunctionCall `json:"function_call,omitempty"`
}

// AssertChatCompletionRequestAssistantMessageRequired checks if the required fields are not zero-ed
func AssertChatCompletionRequestAssistantMessageRequired(obj ChatCompletionRequestAssistantMessage) error {
	elements := map[string]interface{}{
		"role": obj.Role,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	for _, el := range obj.ToolCalls {
		if err := AssertChatCompletionMessageToolCallRequired(el); err != nil {
			return err
		}
	}
	if err := AssertChatCompletionRequestAssistantMessageFunctionCallRequired(obj.FunctionCall); err != nil {
		return err
	}
	return nil
}

// AssertChatCompletionRequestAssistantMessageConstraints checks if the values respects the defined constraints
func AssertChatCompletionRequestAssistantMessageConstraints(obj ChatCompletionRequestAssistantMessage) error {
	for _, el := range obj.ToolCalls {
		if err := AssertChatCompletionMessageToolCallConstraints(el); err != nil {
			return err
		}
	}
	if err := AssertChatCompletionRequestAssistantMessageFunctionCallConstraints(obj.FunctionCall); err != nil {
		return err
	}
	return nil
}
