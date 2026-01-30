package models

// RealtimeServerEventError - Returned when an error occurs, which could be a client problem or a server  problem. Most errors are recoverable and the session will stay open, we  recommend to implementors to monitor and log error messages by default. 
type RealtimeServerEventError struct {

	// The unique ID of the server event.
	EventId string `json:"event_id"`

	// The event type, must be `error`.
	Type string `json:"type"`

	Error RealtimeServerEventErrorError `json:"error"`
}
