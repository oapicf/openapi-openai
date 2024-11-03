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
