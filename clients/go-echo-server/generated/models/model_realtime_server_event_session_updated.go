package models

// RealtimeServerEventSessionUpdated - Returned when a session is updated with a `session.update` event, unless  there is an error. 
type RealtimeServerEventSessionUpdated struct {

	// The unique ID of the server event.
	EventId string `json:"event_id"`

	// The event type, must be `session.updated`.
	Type string `json:"type"`

	Session RealtimeSession `json:"session"`
}
