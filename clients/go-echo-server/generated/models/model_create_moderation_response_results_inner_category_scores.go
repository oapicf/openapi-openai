package models

type CreateModerationResponseResultsInnerCategoryScores struct {

	Hate float32 `json:"hate"`

	HateThreatening float32 `json:"hate/threatening"`

	SelfHarm float32 `json:"self-harm"`

	Sexual float32 `json:"sexual"`

	SexualMinors float32 `json:"sexual/minors"`

	Violence float32 `json:"violence"`

	ViolenceGraphic float32 `json:"violence/graphic"`
}
