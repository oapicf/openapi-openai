package models

type CreateModerationResponse struct {

	Id string `json:"id"`

	Model string `json:"model"`

	Results []CreateModerationResponseResultsInner `json:"results"`
}
