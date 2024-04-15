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

// AssertRunStepDetailsToolCallsCodeObjectCodeInterpreterRequired checks if the required fields are not zero-ed
func AssertRunStepDetailsToolCallsCodeObjectCodeInterpreterRequired(obj RunStepDetailsToolCallsCodeObjectCodeInterpreter) error {
	elements := map[string]interface{}{
		"input": obj.Input,
		"outputs": obj.Outputs,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	for _, el := range obj.Outputs {
		if err := AssertRunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInnerRequired(el); err != nil {
			return err
		}
	}
	return nil
}

// AssertRunStepDetailsToolCallsCodeObjectCodeInterpreterConstraints checks if the values respects the defined constraints
func AssertRunStepDetailsToolCallsCodeObjectCodeInterpreterConstraints(obj RunStepDetailsToolCallsCodeObjectCodeInterpreter) error {
	return nil
}