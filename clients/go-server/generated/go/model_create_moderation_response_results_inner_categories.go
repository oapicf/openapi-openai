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




// CreateModerationResponseResultsInnerCategories - A list of the categories, and whether they are flagged or not.
type CreateModerationResponseResultsInnerCategories struct {

	// Content that expresses, incites, or promotes hate based on race, gender, ethnicity, religion, nationality, sexual orientation, disability status, or caste. Hateful content aimed at non-protected groups (e.g., chess players) is harassment.
	Hate bool `json:"hate"`

	// Hateful content that also includes violence or serious harm towards the targeted group based on race, gender, ethnicity, religion, nationality, sexual orientation, disability status, or caste.
	HateThreatening bool `json:"hate/threatening"`

	// Content that expresses, incites, or promotes harassing language towards any target.
	Harassment bool `json:"harassment"`

	// Harassment content that also includes violence or serious harm towards any target.
	HarassmentThreatening bool `json:"harassment/threatening"`

	// Content that promotes, encourages, or depicts acts of self-harm, such as suicide, cutting, and eating disorders.
	SelfHarm bool `json:"self-harm"`

	// Content where the speaker expresses that they are engaging or intend to engage in acts of self-harm, such as suicide, cutting, and eating disorders.
	SelfHarmIntent bool `json:"self-harm/intent"`

	// Content that encourages performing acts of self-harm, such as suicide, cutting, and eating disorders, or that gives instructions or advice on how to commit such acts.
	SelfHarmInstructions bool `json:"self-harm/instructions"`

	// Content meant to arouse sexual excitement, such as the description of sexual activity, or that promotes sexual services (excluding sex education and wellness).
	Sexual bool `json:"sexual"`

	// Sexual content that includes an individual who is under 18 years old.
	SexualMinors bool `json:"sexual/minors"`

	// Content that depicts death, violence, or physical injury.
	Violence bool `json:"violence"`

	// Content that depicts death, violence, or physical injury in graphic detail.
	ViolenceGraphic bool `json:"violence/graphic"`
}

// AssertCreateModerationResponseResultsInnerCategoriesRequired checks if the required fields are not zero-ed
func AssertCreateModerationResponseResultsInnerCategoriesRequired(obj CreateModerationResponseResultsInnerCategories) error {
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

// AssertCreateModerationResponseResultsInnerCategoriesConstraints checks if the values respects the defined constraints
func AssertCreateModerationResponseResultsInnerCategoriesConstraints(obj CreateModerationResponseResultsInnerCategories) error {
	return nil
}
