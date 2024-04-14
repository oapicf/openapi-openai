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




type MessageContentTextObjectText struct {

	// The data that makes up the text.
	Value string `json:"value"`

	Annotations []MessageContentTextObjectTextAnnotationsInner `json:"annotations"`
}

// AssertMessageContentTextObjectTextRequired checks if the required fields are not zero-ed
func AssertMessageContentTextObjectTextRequired(obj MessageContentTextObjectText) error {
	elements := map[string]interface{}{
		"value": obj.Value,
		"annotations": obj.Annotations,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	for _, el := range obj.Annotations {
		if err := AssertMessageContentTextObjectTextAnnotationsInnerRequired(el); err != nil {
			return err
		}
	}
	return nil
}

// AssertMessageContentTextObjectTextConstraints checks if the values respects the defined constraints
func AssertMessageContentTextObjectTextConstraints(obj MessageContentTextObjectText) error {
	return nil
}
