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




// RunToolCallObject - Tool call objects
type RunToolCallObject struct {

	// The ID of the tool call. This ID must be referenced when you submit the tool outputs in using the [Submit tool outputs to run](/docs/api-reference/runs/submitToolOutputs) endpoint.
	Id string `json:"id"`

	// The type of tool call the output is required for. For now, this is always `function`.
	Type string `json:"type"`

	Function RunToolCallObjectFunction `json:"function"`
}

// AssertRunToolCallObjectRequired checks if the required fields are not zero-ed
func AssertRunToolCallObjectRequired(obj RunToolCallObject) error {
	elements := map[string]interface{}{
		"id": obj.Id,
		"type": obj.Type,
		"function": obj.Function,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	if err := AssertRunToolCallObjectFunctionRequired(obj.Function); err != nil {
		return err
	}
	return nil
}

// AssertRunToolCallObjectConstraints checks if the values respects the defined constraints
func AssertRunToolCallObjectConstraints(obj RunToolCallObject) error {
	if err := AssertRunToolCallObjectFunctionConstraints(obj.Function); err != nil {
		return err
	}
	return nil
}
