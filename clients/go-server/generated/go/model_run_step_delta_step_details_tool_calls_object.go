// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

/*
 * OpenAI API
 *
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * API version: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 */

package openapi




// RunStepDeltaStepDetailsToolCallsObject - Details of the tool call.
type RunStepDeltaStepDetailsToolCallsObject struct {

	// Always `tool_calls`.
	Type string `json:"type"`

	// An array of tool calls the run step was involved in. These can be associated with one of three types of tools: `code_interpreter`, `retrieval`, or `function`. 
	ToolCalls []RunStepDeltaStepDetailsToolCallsObjectToolCallsInner `json:"tool_calls,omitempty"`
}

// AssertRunStepDeltaStepDetailsToolCallsObjectRequired checks if the required fields are not zero-ed
func AssertRunStepDeltaStepDetailsToolCallsObjectRequired(obj RunStepDeltaStepDetailsToolCallsObject) error {
	elements := map[string]interface{}{
		"type": obj.Type,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	for _, el := range obj.ToolCalls {
		if err := AssertRunStepDeltaStepDetailsToolCallsObjectToolCallsInnerRequired(el); err != nil {
			return err
		}
	}
	return nil
}

// AssertRunStepDeltaStepDetailsToolCallsObjectConstraints checks if the values respects the defined constraints
func AssertRunStepDeltaStepDetailsToolCallsObjectConstraints(obj RunStepDeltaStepDetailsToolCallsObject) error {
	for _, el := range obj.ToolCalls {
		if err := AssertRunStepDeltaStepDetailsToolCallsObjectToolCallsInnerConstraints(el); err != nil {
			return err
		}
	}
	return nil
}
