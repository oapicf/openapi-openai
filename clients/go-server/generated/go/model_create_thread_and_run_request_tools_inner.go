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




type CreateThreadAndRunRequestToolsInner struct {

	// The type of tool being defined: `code_interpreter`
	Type string `json:"type"`

	Function FunctionObject `json:"function"`
}

// AssertCreateThreadAndRunRequestToolsInnerRequired checks if the required fields are not zero-ed
func AssertCreateThreadAndRunRequestToolsInnerRequired(obj CreateThreadAndRunRequestToolsInner) error {
	elements := map[string]interface{}{
		"type": obj.Type,
		"function": obj.Function,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	if err := AssertFunctionObjectRequired(obj.Function); err != nil {
		return err
	}
	return nil
}

// AssertCreateThreadAndRunRequestToolsInnerConstraints checks if the values respects the defined constraints
func AssertCreateThreadAndRunRequestToolsInnerConstraints(obj CreateThreadAndRunRequestToolsInner) error {
	return nil
}