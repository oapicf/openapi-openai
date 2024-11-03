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

type SubmitToolOutputsRunRequestToolOutputsInner struct {

	// The ID of the tool call in the `required_action` object within the run object the output is being submitted for.
	ToolCallId string `json:"tool_call_id,omitempty"`

	// The output of the tool call to be submitted to continue the run.
	Output string `json:"output,omitempty"`
}
