package models

// RealtimeServerEventResponseCreated - Returned when a new Response is created. The first event of response creation, where the response is in an initial state of `in_progress`. 
type RealtimeServerEventResponseCreated struct {

	// The unique ID of the server event.
	EventId string `json:"event_id"`

	// The event type, must be `response.created`.
	Type string `json:"type"`

	Response RealtimeResponse `json:"response"`
}
