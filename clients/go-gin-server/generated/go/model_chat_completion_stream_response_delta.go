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

// ChatCompletionStreamResponseDelta - A chat completion delta generated by streamed model responses.
type ChatCompletionStreamResponseDelta struct {

	// The contents of the chunk message.
	Content *string `json:"content,omitempty"`

	// Deprecated
	FunctionCall ChatCompletionStreamResponseDeltaFunctionCall `json:"function_call,omitempty"`

	ToolCalls []ChatCompletionMessageToolCallChunk `json:"tool_calls,omitempty"`

	// The role of the author of this message.
	Role string `json:"role,omitempty"`
}