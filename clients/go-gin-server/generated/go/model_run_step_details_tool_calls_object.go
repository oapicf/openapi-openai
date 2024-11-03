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

// RunStepDetailsToolCallsObject - Details of the tool call.
type RunStepDetailsToolCallsObject struct {

	// Always `tool_calls`.
	Type string `json:"type"`

	// An array of tool calls the run step was involved in. These can be associated with one of three types of tools: `code_interpreter`, `retrieval`, or `function`. 
	ToolCalls []RunStepDetailsToolCallsObjectToolCallsInner `json:"tool_calls"`
}
