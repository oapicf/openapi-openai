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

// ChatCompletionResponseMessage - A chat completion message generated by the model.
type ChatCompletionResponseMessage struct {

	// The contents of the message.
	Content *string `json:"content"`

	// The tool calls generated by the model, such as function calls.
	ToolCalls []ChatCompletionMessageToolCall `json:"tool_calls,omitempty"`

	// The role of the author of this message.
	Role string `json:"role"`

	// Deprecated
	FunctionCall ChatCompletionRequestAssistantMessageFunctionCall `json:"function_call,omitempty"`
}