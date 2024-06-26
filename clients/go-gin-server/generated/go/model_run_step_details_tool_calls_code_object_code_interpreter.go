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

// RunStepDetailsToolCallsCodeObjectCodeInterpreter - The Code Interpreter tool call definition.
type RunStepDetailsToolCallsCodeObjectCodeInterpreter struct {

	// The input to the Code Interpreter tool call.
	Input string `json:"input"`

	// The outputs from the Code Interpreter tool call. Code Interpreter can output one or more items, including text (`logs`) or images (`image`). Each of these are represented by a different object type.
	Outputs []RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner `json:"outputs"`
}
