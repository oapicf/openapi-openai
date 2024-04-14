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




type SubmitToolOutputsRunRequest struct {

	// A list of tools for which the outputs are being submitted.
	ToolOutputs []SubmitToolOutputsRunRequestToolOutputsInner `json:"tool_outputs"`

	// If `true`, returns a stream of events that happen during the Run as server-sent events, terminating when the Run enters a terminal state with a `data: [DONE]` message. 
	Stream *bool `json:"stream,omitempty"`
}

// AssertSubmitToolOutputsRunRequestRequired checks if the required fields are not zero-ed
func AssertSubmitToolOutputsRunRequestRequired(obj SubmitToolOutputsRunRequest) error {
	elements := map[string]interface{}{
		"tool_outputs": obj.ToolOutputs,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	for _, el := range obj.ToolOutputs {
		if err := AssertSubmitToolOutputsRunRequestToolOutputsInnerRequired(el); err != nil {
			return err
		}
	}
	return nil
}

// AssertSubmitToolOutputsRunRequestConstraints checks if the values respects the defined constraints
func AssertSubmitToolOutputsRunRequestConstraints(obj SubmitToolOutputsRunRequest) error {
	return nil
}
