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

type RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner struct {

	// Always `logs`.
	Type string `json:"type"`

	// The text output from the Code Interpreter tool call.
	Logs string `json:"logs"`

	Image RunStepDetailsToolCallsCodeOutputImageObjectImage `json:"image"`
}