package models

// RealtimeServerEventResponseDone - Returned when a Response is done streaming. Always emitted, no matter the  final state. The Response object included in the `response.done` event will  include all output Items in the Response but will omit the raw audio data. 
type RealtimeServerEventResponseDone struct {

	// The unique ID of the server event.
	EventId string `json:"event_id"`

	// The event type, must be `response.done`.
	Type string `json:"type"`

	Response RealtimeResponse `json:"response"`
}
