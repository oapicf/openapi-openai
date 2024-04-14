package models

type RunStepDetailsToolCallsCodeOutputImageObject struct {

	// Always `image`.
	Type string `json:"type"`

	Image RunStepDetailsToolCallsCodeOutputImageObjectImage `json:"image"`
}
