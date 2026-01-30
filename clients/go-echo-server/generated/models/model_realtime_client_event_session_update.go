package models

// RealtimeClientEventSessionUpdate - Send this event to update the session’s default configuration. The client may  send this event at any time to update the session configuration, and any  field may be updated at any time, except for \"voice\". The server will respond  with a `session.updated` event that shows the full effective configuration.  Only fields that are present are updated, thus the correct way to clear a  field like \"instructions\" is to pass an empty string. 
type RealtimeClientEventSessionUpdate struct {

	// Optional client-generated ID used to identify this event.
	EventId string `json:"event_id,omitempty"`

	// The event type, must be `session.update`.
	Type string `json:"type"`

	Session RealtimeSessionCreateRequest `json:"session"`
}
