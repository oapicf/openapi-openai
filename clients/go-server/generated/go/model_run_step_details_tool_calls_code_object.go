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




// RunStepDetailsToolCallsCodeObject - Details of the Code Interpreter tool call the run step was involved in.
type RunStepDetailsToolCallsCodeObject struct {

	// The ID of the tool call.
	Id string `json:"id"`

	// The type of tool call. This is always going to be `code_interpreter` for this type of tool call.
	Type string `json:"type"`

	CodeInterpreter RunStepDetailsToolCallsCodeObjectCodeInterpreter `json:"code_interpreter"`
}

// AssertRunStepDetailsToolCallsCodeObjectRequired checks if the required fields are not zero-ed
func AssertRunStepDetailsToolCallsCodeObjectRequired(obj RunStepDetailsToolCallsCodeObject) error {
	elements := map[string]interface{}{
		"id": obj.Id,
		"type": obj.Type,
		"code_interpreter": obj.CodeInterpreter,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	if err := AssertRunStepDetailsToolCallsCodeObjectCodeInterpreterRequired(obj.CodeInterpreter); err != nil {
		return err
	}
	return nil
}

// AssertRunStepDetailsToolCallsCodeObjectConstraints checks if the values respects the defined constraints
func AssertRunStepDetailsToolCallsCodeObjectConstraints(obj RunStepDetailsToolCallsCodeObject) error {
	return nil
}