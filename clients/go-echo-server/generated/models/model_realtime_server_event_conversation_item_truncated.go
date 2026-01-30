package models

// RealtimeServerEventConversationItemTruncated - Returned when an earlier assistant audio message item is truncated by the  client with a `conversation.item.truncate` event. This event is used to  synchronize the server's understanding of the audio with the client's playback.  This action will truncate the audio and remove the server-side text transcript  to ensure there is no text in the context that hasn't been heard by the user. 
type RealtimeServerEventConversationItemTruncated struct {

	// The unique ID of the server event.
	EventId string `json:"event_id"`

	// The event type, must be `conversation.item.truncated`.
	Type string `json:"type"`

	// The ID of the assistant message item that was truncated.
	ItemId string `json:"item_id"`

	// The index of the content part that was truncated.
	ContentIndex int32 `json:"content_index"`

	// The duration up to which the audio was truncated, in milliseconds. 
	AudioEndMs int32 `json:"audio_end_ms"`
}
