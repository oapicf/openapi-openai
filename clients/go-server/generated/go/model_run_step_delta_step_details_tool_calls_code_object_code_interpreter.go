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




// RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter - The Code Interpreter tool call definition.
type RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter struct {

	// The input to the Code Interpreter tool call.
	Input string `json:"input,omitempty"`

	// The outputs from the Code Interpreter tool call. Code Interpreter can output one or more items, including text (`logs`) or images (`image`). Each of these are represented by a different object type.
	Outputs []RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner `json:"outputs,omitempty"`
}

// AssertRunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterRequired checks if the required fields are not zero-ed
func AssertRunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterRequired(obj RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter) error {
	for _, el := range obj.Outputs {
		if err := AssertRunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInnerRequired(el); err != nil {
			return err
		}
	}
	return nil
}

// AssertRunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterConstraints checks if the values respects the defined constraints
func AssertRunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterConstraints(obj RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter) error {
	return nil
}