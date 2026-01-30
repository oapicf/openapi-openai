package models

// CreateModerationResponseResultsInnerCategoryAppliedInputTypes - A list of the categories along with the input type(s) that the score applies to.
type CreateModerationResponseResultsInnerCategoryAppliedInputTypes struct {

	// The applied input type(s) for the category 'hate'.
	Hate []string `json:"hate"`

	// The applied input type(s) for the category 'hate/threatening'.
	HateThreatening []string `json:"hate/threatening"`

	// The applied input type(s) for the category 'harassment'.
	Harassment []string `json:"harassment"`

	// The applied input type(s) for the category 'harassment/threatening'.
	HarassmentThreatening []string `json:"harassment/threatening"`

	// The applied input type(s) for the category 'illicit'.
	Illicit []string `json:"illicit"`

	// The applied input type(s) for the category 'illicit/violent'.
	IllicitViolent []string `json:"illicit/violent"`

	// The applied input type(s) for the category 'self-harm'.
	SelfHarm []string `json:"self-harm"`

	// The applied input type(s) for the category 'self-harm/intent'.
	SelfHarmIntent []string `json:"self-harm/intent"`

	// The applied input type(s) for the category 'self-harm/instructions'.
	SelfHarmInstructions []string `json:"self-harm/instructions"`

	// The applied input type(s) for the category 'sexual'.
	Sexual []string `json:"sexual"`

	// The applied input type(s) for the category 'sexual/minors'.
	SexualMinors []string `json:"sexual/minors"`

	// The applied input type(s) for the category 'violence'.
	Violence []string `json:"violence"`

	// The applied input type(s) for the category 'violence/graphic'.
	ViolenceGraphic []string `json:"violence/graphic"`
}
