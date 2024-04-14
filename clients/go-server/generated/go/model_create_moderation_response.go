/*
 * OpenAI API
 *
 * APIs for sampling from and fine-tuning language models
 *
 * API version: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type CreateModerationResponse struct {

	Id string `json:"id"`

	Model string `json:"model"`

	Results []CreateModerationResponseResultsInner `json:"results"`
}

// AssertCreateModerationResponseRequired checks if the required fields are not zero-ed
func AssertCreateModerationResponseRequired(obj CreateModerationResponse) error {
	elements := map[string]interface{}{
		"id": obj.Id,
		"model": obj.Model,
		"results": obj.Results,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	for _, el := range obj.Results {
		if err := AssertCreateModerationResponseResultsInnerRequired(el); err != nil {
			return err
		}
	}
	return nil
}

// AssertCreateModerationResponseConstraints checks if the values respects the defined constraints
func AssertCreateModerationResponseConstraints(obj CreateModerationResponse) error {
	return nil
}