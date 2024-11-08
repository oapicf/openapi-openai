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




// CreateModerationResponseResultsInnerCategoryScores - A list of the categories along with their scores as predicted by model.
type CreateModerationResponseResultsInnerCategoryScores struct {

	// The score for the category 'hate'.
	Hate float32 `json:"hate"`

	// The score for the category 'hate/threatening'.
	HateThreatening float32 `json:"hate/threatening"`

	// The score for the category 'harassment'.
	Harassment float32 `json:"harassment"`

	// The score for the category 'harassment/threatening'.
	HarassmentThreatening float32 `json:"harassment/threatening"`

	// The score for the category 'self-harm'.
	SelfHarm float32 `json:"self-harm"`

	// The score for the category 'self-harm/intent'.
	SelfHarmIntent float32 `json:"self-harm/intent"`

	// The score for the category 'self-harm/instructions'.
	SelfHarmInstructions float32 `json:"self-harm/instructions"`

	// The score for the category 'sexual'.
	Sexual float32 `json:"sexual"`

	// The score for the category 'sexual/minors'.
	SexualMinors float32 `json:"sexual/minors"`

	// The score for the category 'violence'.
	Violence float32 `json:"violence"`

	// The score for the category 'violence/graphic'.
	ViolenceGraphic float32 `json:"violence/graphic"`
}

// AssertCreateModerationResponseResultsInnerCategoryScoresRequired checks if the required fields are not zero-ed
func AssertCreateModerationResponseResultsInnerCategoryScoresRequired(obj CreateModerationResponseResultsInnerCategoryScores) error {
	elements := map[string]interface{}{
		"hate": obj.Hate,
		"hate/threatening": obj.HateThreatening,
		"harassment": obj.Harassment,
		"harassment/threatening": obj.HarassmentThreatening,
		"self-harm": obj.SelfHarm,
		"self-harm/intent": obj.SelfHarmIntent,
		"self-harm/instructions": obj.SelfHarmInstructions,
		"sexual": obj.Sexual,
		"sexual/minors": obj.SexualMinors,
		"violence": obj.Violence,
		"violence/graphic": obj.ViolenceGraphic,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	return nil
}

// AssertCreateModerationResponseResultsInnerCategoryScoresConstraints checks if the values respects the defined constraints
func AssertCreateModerationResponseResultsInnerCategoryScoresConstraints(obj CreateModerationResponseResultsInnerCategoryScores) error {
	return nil
}
