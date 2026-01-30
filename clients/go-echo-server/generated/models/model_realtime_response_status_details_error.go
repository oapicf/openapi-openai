package models

// RealtimeResponseStatusDetailsError - A description of the error that caused the response to fail,  populated when the `status` is `failed`. 
type RealtimeResponseStatusDetailsError struct {

	// The type of error.
	Type string `json:"type,omitempty"`

	// Error code, if any.
	Code string `json:"code,omitempty"`
}
