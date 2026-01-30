package models

// RealtimeServerEventInputAudioBufferCommitted - Returned when an input audio buffer is committed, either by the client or  automatically in server VAD mode. The `item_id` property is the ID of the user message item that will be created, thus a `conversation.item.created` event  will also be sent to the client. 
type RealtimeServerEventInputAudioBufferCommitted struct {

	// The unique ID of the server event.
	EventId string `json:"event_id"`

	// The event type, must be `input_audio_buffer.committed`.
	Type string `json:"type"`

	// The ID of the preceding item after which the new item will be inserted. 
	PreviousItemId string `json:"previous_item_id"`

	// The ID of the user message item that will be created.
	ItemId string `json:"item_id"`
}
