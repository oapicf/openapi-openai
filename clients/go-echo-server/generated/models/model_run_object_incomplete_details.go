package models

// RunObjectIncompleteDetails - Details on why the run is incomplete. Will be `null` if the run is not incomplete.
type RunObjectIncompleteDetails struct {

	// The reason why the run is incomplete. This will point to which specific token limit was reached over the course of the run.
	Reason string `json:"reason,omitempty"`
}
