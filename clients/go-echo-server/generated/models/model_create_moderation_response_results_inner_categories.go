package models

type CreateModerationResponseResultsInnerCategories struct {

	Hate bool `json:"hate"`

	HateThreatening bool `json:"hate/threatening"`

	SelfHarm bool `json:"self-harm"`

	Sexual bool `json:"sexual"`

	SexualMinors bool `json:"sexual/minors"`

	Violence bool `json:"violence"`

	ViolenceGraphic bool `json:"violence/graphic"`
}
