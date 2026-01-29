package models

// CreateModerationResponse - Represents if a given text input is potentially harmful.
type CreateModerationResponse struct {

	// The unique identifier for the moderation request.
	Id string `json:"id"`

	// The model used to generate the moderation results.
	Model string `json:"model"`

	// A list of moderation objects.
	Results []CreateModerationResponseResultsInner `json:"results"`
}
