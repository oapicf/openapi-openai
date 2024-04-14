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




// CreateModerationResponse - Represents if a given text input is potentially harmful.
type CreateModerationResponse struct {

	// The unique identifier for the moderation request.
	Id string `json:"id"`

	// The model used to generate the moderation results.
	Model string `json:"model"`

	// A list of moderation objects.
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
