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




// RunStepDeltaStepDetailsToolCallsFunctionObjectFunction - The definition of the function that was called.
type RunStepDeltaStepDetailsToolCallsFunctionObjectFunction struct {

	// The name of the function.
	Name string `json:"name,omitempty"`

	// The arguments passed to the function.
	Arguments string `json:"arguments,omitempty"`

	// The output of the function. This will be `null` if the outputs have not been [submitted](/docs/api-reference/runs/submitToolOutputs) yet.
	Output *string `json:"output,omitempty"`
}

// AssertRunStepDeltaStepDetailsToolCallsFunctionObjectFunctionRequired checks if the required fields are not zero-ed
func AssertRunStepDeltaStepDetailsToolCallsFunctionObjectFunctionRequired(obj RunStepDeltaStepDetailsToolCallsFunctionObjectFunction) error {
	return nil
}

// AssertRunStepDeltaStepDetailsToolCallsFunctionObjectFunctionConstraints checks if the values respects the defined constraints
func AssertRunStepDeltaStepDetailsToolCallsFunctionObjectFunctionConstraints(obj RunStepDeltaStepDetailsToolCallsFunctionObjectFunction) error {
	return nil
}
