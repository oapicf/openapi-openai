package models

// RunStepDetailsMessageCreationObject - Details of the message creation by the run step.
type RunStepDetailsMessageCreationObject struct {

	// Always `message_creation`.
	Type string `json:"type"`

	MessageCreation RunStepDetailsMessageCreationObjectMessageCreation `json:"message_creation"`
}
