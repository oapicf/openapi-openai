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




// AssistantsApiNamedToolChoice - Specifies a tool the model should use. Use to force the model to call a specific tool.
type AssistantsApiNamedToolChoice struct {

	// The type of the tool. If type is `function`, the function name must be set
	Type string `json:"type"`

	Function ChatCompletionNamedToolChoiceFunction `json:"function,omitempty"`
}

// AssertAssistantsApiNamedToolChoiceRequired checks if the required fields are not zero-ed
func AssertAssistantsApiNamedToolChoiceRequired(obj AssistantsApiNamedToolChoice) error {
	elements := map[string]interface{}{
		"type": obj.Type,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	if err := AssertChatCompletionNamedToolChoiceFunctionRequired(obj.Function); err != nil {
		return err
	}
	return nil
}

// AssertAssistantsApiNamedToolChoiceConstraints checks if the values respects the defined constraints
func AssertAssistantsApiNamedToolChoiceConstraints(obj AssistantsApiNamedToolChoice) error {
	if err := AssertChatCompletionNamedToolChoiceFunctionConstraints(obj.Function); err != nil {
		return err
	}
	return nil
}
