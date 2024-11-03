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


import (
	"gopkg.in/validator.v2"
)



type ChatCompletionRequestMessage struct {

	// The contents of the function message.
	Content *string `json:"content"`

	// The role of the messages author, in this case `function`.
	Role string `json:"role"`

	// The name of the function to call.
	Name string `json:"name"`

	// The tool calls generated by the model, such as function calls.
	ToolCalls []ChatCompletionMessageToolCall `json:"tool_calls,omitempty"`

	// Deprecated
	FunctionCall ChatCompletionRequestAssistantMessageFunctionCall `json:"function_call,omitempty"`

	// Tool call that this message is responding to.
	ToolCallId string `json:"tool_call_id"`
}

// AssertChatCompletionRequestMessageRequired checks if the required fields are not zero-ed
func AssertChatCompletionRequestMessageRequired(obj ChatCompletionRequestMessage) error {
	elements := map[string]interface{}{
		"content": obj.Content,
		"role": obj.Role,
		"name": obj.Name,
		"tool_call_id": obj.ToolCallId,
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

// AssertChatCompletionRequestMessageConstraints checks if the values respects the defined constraints
func AssertChatCompletionRequestMessageConstraints(obj ChatCompletionRequestMessage) error {
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
