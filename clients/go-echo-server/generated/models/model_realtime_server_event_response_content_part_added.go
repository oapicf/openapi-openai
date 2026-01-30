package models

// RealtimeServerEventResponseContentPartAdded - Returned when a new content part is added to an assistant message item during response generation. 
type RealtimeServerEventResponseContentPartAdded struct {

	// The unique ID of the server event.
	EventId string `json:"event_id"`

	// The event type, must be `response.content_part.added`.
	Type string `json:"type"`

	// The ID of the response.
	ResponseId string `json:"response_id"`

	// The ID of the item to which the content part was added.
	ItemId string `json:"item_id"`

	// The index of the output item in the response.
	OutputIndex int32 `json:"output_index"`

	// The index of the content part in the item's content array.
	ContentIndex int32 `json:"content_index"`

	Part RealtimeServerEventResponseContentPartAddedPart `json:"part"`
}
