package models

// BatchRequestOutputError - For requests that failed with a non-HTTP error, this will contain more information on the cause of the failure.
type BatchRequestOutputError struct {

	// A machine-readable error code.
	Code string `json:"code,omitempty"`

	// A human-readable error message.
	Message string `json:"message,omitempty"`
}
