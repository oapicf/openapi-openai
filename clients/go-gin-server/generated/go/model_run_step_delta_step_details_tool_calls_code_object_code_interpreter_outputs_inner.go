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

type RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner struct {

	// The index of the output in the outputs array.
	Index int32 `json:"index"`

	// Always `logs`.
	Type string `json:"type"`

	// The text output from the Code Interpreter tool call.
	Logs string `json:"logs,omitempty"`

	Image RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage `json:"image,omitempty"`
}
