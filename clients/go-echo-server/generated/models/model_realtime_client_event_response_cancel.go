package models

// RealtimeClientEventResponseCancel - Send this event to cancel an in-progress response. The server will respond  with a `response.cancelled` event or an error if there is no response to  cancel. 
type RealtimeClientEventResponseCancel struct {

	// Optional client-generated ID used to identify this event.
	EventId string `json:"event_id,omitempty"`

	// The event type, must be `response.cancel`.
	Type string `json:"type"`

	// A specific response ID to cancel - if not provided, will cancel an  in-progress response in the default conversation. 
	ResponseId string `json:"response_id,omitempty"`
}
