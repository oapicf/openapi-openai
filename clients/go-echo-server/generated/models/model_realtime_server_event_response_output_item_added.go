package models

// RealtimeServerEventResponseOutputItemAdded - Returned when a new Item is created during Response generation.
type RealtimeServerEventResponseOutputItemAdded struct {

	// The unique ID of the server event.
	EventId string `json:"event_id"`

	// The event type, must be `response.output_item.added`.
	Type string `json:"type"`

	// The ID of the Response to which the item belongs.
	ResponseId string `json:"response_id"`

	// The index of the output item in the Response.
	OutputIndex int32 `json:"output_index"`

	Item RealtimeConversationItem `json:"item"`
}
