package models

type RunStepDeltaStepDetailsToolCallsCodeOutputImageObject struct {

	// The index of the output in the outputs array.
	Index int32 `json:"index"`

	// Always `image`.
	Type string `json:"type"`

	Image RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage `json:"image,omitempty"`
}
