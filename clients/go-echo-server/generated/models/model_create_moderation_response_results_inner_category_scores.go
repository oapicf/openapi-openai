package models

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
