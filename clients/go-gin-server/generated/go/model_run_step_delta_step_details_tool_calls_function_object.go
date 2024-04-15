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

type RunStepDeltaStepDetailsToolCallsFunctionObject struct {

	// The index of the tool call in the tool calls array.
	Index int32 `json:"index"`

	// The ID of the tool call object.
	Id string `json:"id,omitempty"`

	// The type of tool call. This is always going to be `function` for this type of tool call.
	Type string `json:"type"`

	Function RunStepDeltaStepDetailsToolCallsFunctionObjectFunction `json:"function,omitempty"`
}