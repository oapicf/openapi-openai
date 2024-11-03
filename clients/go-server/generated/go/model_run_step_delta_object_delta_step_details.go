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


import (
	"gopkg.in/validator.v2"
)



// RunStepDeltaObjectDeltaStepDetails - The details of the run step.
type RunStepDeltaObjectDeltaStepDetails struct {

	// Always `message_creation`.
	Type string `json:"type"`

	MessageCreation RunStepDeltaStepDetailsMessageCreationObjectMessageCreation `json:"message_creation,omitempty"`

	// An array of tool calls the run step was involved in. These can be associated with one of three types of tools: `code_interpreter`, `retrieval`, or `function`. 
	ToolCalls []RunStepDeltaStepDetailsToolCallsObjectToolCallsInner `json:"tool_calls,omitempty"`
}

// AssertRunStepDeltaObjectDeltaStepDetailsRequired checks if the required fields are not zero-ed
func AssertRunStepDeltaObjectDeltaStepDetailsRequired(obj RunStepDeltaObjectDeltaStepDetails) error {
	elements := map[string]interface{}{
		"type": obj.Type,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	if err := AssertRunStepDeltaStepDetailsMessageCreationObjectMessageCreationRequired(obj.MessageCreation); err != nil {
		return err
	}
	for _, el := range obj.ToolCalls {
		if err := AssertRunStepDeltaStepDetailsToolCallsObjectToolCallsInnerRequired(el); err != nil {
			return err
		}
	}
	return nil
}

// AssertRunStepDeltaObjectDeltaStepDetailsConstraints checks if the values respects the defined constraints
func AssertRunStepDeltaObjectDeltaStepDetailsConstraints(obj RunStepDeltaObjectDeltaStepDetails) error {
	if err := AssertRunStepDeltaStepDetailsMessageCreationObjectMessageCreationConstraints(obj.MessageCreation); err != nil {
		return err
	}
	for _, el := range obj.ToolCalls {
		if err := AssertRunStepDeltaStepDetailsToolCallsObjectToolCallsInnerConstraints(el); err != nil {
			return err
		}
	}
	return nil
}
