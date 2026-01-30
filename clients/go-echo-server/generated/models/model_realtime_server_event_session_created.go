package models

// RealtimeServerEventSessionCreated - Returned when a Session is created. Emitted automatically when a new  connection is established as the first server event. This event will contain  the default Session configuration. 
type RealtimeServerEventSessionCreated struct {

	// The unique ID of the server event.
	EventId string `json:"event_id"`

	// The event type, must be `session.created`.
	Type string `json:"type"`

	Session RealtimeSession `json:"session"`
}
