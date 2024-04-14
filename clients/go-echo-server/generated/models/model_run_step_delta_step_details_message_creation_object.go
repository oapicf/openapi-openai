package models

// RunStepDeltaStepDetailsMessageCreationObject - Details of the message creation by the run step.
type RunStepDeltaStepDetailsMessageCreationObject struct {

	// Always `message_creation`.
	Type string `json:"type"`

	MessageCreation RunStepDeltaStepDetailsMessageCreationObjectMessageCreation `json:"message_creation,omitempty"`
}
