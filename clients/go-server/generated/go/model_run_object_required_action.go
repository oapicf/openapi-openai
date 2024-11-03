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




// RunObjectRequiredAction - Details on the action required to continue the run. Will be `null` if no action is required.
type RunObjectRequiredAction struct {

	// For now, this is always `submit_tool_outputs`.
	Type string `json:"type"`

	SubmitToolOutputs RunObjectRequiredActionSubmitToolOutputs `json:"submit_tool_outputs"`
}

// AssertRunObjectRequiredActionRequired checks if the required fields are not zero-ed
func AssertRunObjectRequiredActionRequired(obj RunObjectRequiredAction) error {
	elements := map[string]interface{}{
		"type": obj.Type,
		"submit_tool_outputs": obj.SubmitToolOutputs,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	if err := AssertRunObjectRequiredActionSubmitToolOutputsRequired(obj.SubmitToolOutputs); err != nil {
		return err
	}
	return nil
}

// AssertRunObjectRequiredActionConstraints checks if the values respects the defined constraints
func AssertRunObjectRequiredActionConstraints(obj RunObjectRequiredAction) error {
	if err := AssertRunObjectRequiredActionSubmitToolOutputsConstraints(obj.SubmitToolOutputs); err != nil {
		return err
	}
	return nil
}
